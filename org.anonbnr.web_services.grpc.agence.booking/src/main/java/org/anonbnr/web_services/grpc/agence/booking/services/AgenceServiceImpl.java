package org.anonbnr.web_services.grpc.agence.booking.services;


import combined.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.anonbnr.web_services.grpc.agence.booking.entity.*;
import org.anonbnr.web_services.grpc.agence.booking.repository.AgenceRepository;
import org.anonbnr.web_services.grpc.agence.booking.repository.ClientAgenceRepository;
import org.anonbnr.web_services.grpc.agence.booking.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

@GrpcService
@RequiredArgsConstructor
public class AgenceServiceImpl extends BookingServiceGrpc.BookingServiceImplBase {

    private static final Logger logger = LoggerFactory.getLogger(AgenceServiceImpl.class);
    private final AgenceRepository repository;

    private final ClientRepository clientRepository;
    private final ClientAgenceRepository clientAgenceRepository;



    @Override
    @Transactional
    public void rechercherHotels(HotelSearchRequest request, StreamObserver<HotelSearchResponseList> responseObserver) {
        logger.info("Processing hotel search request: {}", request);
        System.out.println("Received request: " + request);

        try {
            // Fetch the first agency from the repository
            Agence agence = repository.findAll().stream()
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Aucune agence disponible."));
            System.out.println("Fetched agency: " + agence);

            // Map to store URI and associated discount (remise)
            Map<String, BigDecimal> uris = new HashMap<>();
            for (Offre offre : agence.getOffers()) {
                System.out.println("Processing offer: " + offre);
                if (offre.getUri() != null && !offre.getUri().isBlank()) {
                    uris.put(offre.getUri(), offre.getPrix());
                    System.out.println("Added URI to map: " + offre.getUri() + " with discount: " + offre.getPrix());
                } else {
                    System.out.println("Invalid URI for offer: " + offre);
                }
            }

            if (uris.isEmpty()) {
                logger.warn("No valid offers available for the agency.");
                System.out.println("No valid offers found for the agency.");
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("No valid offers available.")
                        .asRuntimeException());
                return;
            }

            System.out.println("URIs to process: " + uris.keySet());

            List<HotelSearchResponse> hotels = new ArrayList<>();

            // Iterate over each URI to fetch hotel details
            for (String uri : uris.keySet()) {
                ManagedChannel channel = null;
                try {
                    // Create a gRPC channel
                    System.out.println("Creating gRPC channel for URI: " + uri);
                    channel = ManagedChannelBuilder.forTarget(uri)
                            .usePlaintext()
                            .build();
                    HotelServiceGrpc.HotelServiceBlockingStub stub = HotelServiceGrpc.newBlockingStub(channel);

                    // Remote gRPC call
                    logger.info("Calling gRPC service for URI: {}", uri);
                    System.out.println("Calling gRPC service for URI: " + uri);
                    HotelSearchResponse response = stub.rechercherHotel(request);

                    if (response != null) {
                        System.out.println("Received response for URI: " + uri + " -> " + response);

                        // Calculate stay duration
                        LocalDate startDate = LocalDate.parse(request.getDateArrivee());
                        LocalDate endDate = LocalDate.parse(request.getDateDepart());
                        long nbJours = ChronoUnit.DAYS.between(startDate, endDate);
                        System.out.println("Number of days for stay: " + nbJours);

                        // Process each room in the response
                        List<ChambreDto> updatedRooms = new ArrayList<>();
                        for (ChambreDto chambre : response.getChambresList()) {
                            logger.info("Processing room: {}", chambre);

                            BigDecimal remise = uris.getOrDefault(uri, BigDecimal.ZERO);
                            logger.info("Discount (remise) for URI {}: {}", uri, remise);

                            // Calculate final price
                            BigDecimal prixParNuit = BigDecimal.valueOf(chambre.getPrix());
                            BigDecimal prixFinalChambre = prixParNuit.subtract(remise);

                            logger.info("Room price per night: {}, discount: {}, final price: {}",
                                    chambre.getPrix(), remise, prixFinalChambre);

                            // Update chambre object
                            ChambreDto updatedChambre = chambre.toBuilder()
                                    .setPrixFinalChambre(prixFinalChambre.doubleValue())
                                    .build();

                            logger.info("Updated room details: {}", updatedChambre);

                            updatedRooms.add(updatedChambre);
                        }

                        response = response.toBuilder()
                                .clearChambres()
                                .addAllChambres(updatedRooms)
                                .build();

                        logger.info("Updated hotel response with final room prices: {}", response);

                        hotels.add(response);
                        System.out.println("Added hotel to results: " + response);
                    } else {
                        System.out.println("No response received for URI: " + uri);
                    }
                } catch (io.grpc.StatusRuntimeException ex) {
                    logger.error("gRPC error for URI: {}. Status: {}", uri, ex.getStatus(), ex);
                    System.out.println("gRPC error for URI: " + uri + " -> Status: " + ex.getStatus());
                } catch (Exception ex) {
                    logger.error("Error creating gRPC channel for URI: {}", uri, ex);
                    System.out.println("Error creating gRPC channel for URI: " + uri);
                    ex.printStackTrace();
                } finally {
                    if (channel != null) {
                        channel.shutdown();
                        try {
                            channel.awaitTermination(5, TimeUnit.SECONDS);
                            System.out.println("Channel closed for URI: " + uri);
                        } catch (InterruptedException e) {
                            logger.error("Error waiting for channel shutdown for URI: {}", uri, e);
                            System.out.println("Error waiting for channel shutdown for URI: " + uri);
                        }
                    }
                }
            }

            // Check if no hotels were found
            if (hotels.isEmpty()) {
                logger.warn("No hotels found for the given criteria.");
                System.out.println("No hotels found for the given criteria.");
            }

            // Build and send the response
            HotelSearchResponseList responseList = HotelSearchResponseList.newBuilder()
                    .addAllHotels(hotels)
                    .build();

            logger.info("Response constructed with {} hotels.", hotels.size());
            System.out.println("Response constructed with hotels: " + hotels);
            responseObserver.onNext(responseList);
            responseObserver.onCompleted();
        } catch (Exception e) {
            logger.error("Error during hotel search", e);
            System.out.println("Error during hotel search: " + e.getMessage());
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("Error during hotel search")
                            .withCause(e)
                            .asRuntimeException());
        }
    }


    @Override
    @Transactional
    public void ajouterReservation(ReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        try {
            logger.info("Ajout de réservation avec les paramètres : {}", request);

            Agence agence = repository.findAll().stream()
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Aucune agence trouvée."));

            for (Offre offre : agence.getOffers()) {
                if (request.getNomHotel().contains(offre.getNomHotel())) {
                    String uri = offre.getUri();
                    logger.info("Connexion au service gRPC pour la réservation via l'URI : {}", uri);

                    ManagedChannel channel = ManagedChannelBuilder.forTarget(uri)
                            .usePlaintext()
                            .build();

                    HotelServiceGrpc.HotelServiceBlockingStub stub = HotelServiceGrpc.newBlockingStub(channel);

                    try {
                        ReservationResponse response = stub.reserver(request);
                        logger.info("Réservation ajoutée avec succès.");
                        responseObserver.onNext(response);
                        responseObserver.onCompleted();
                        return;
                    } finally {
                        channel.shutdown();
                    }
                }
            }

            logger.error("Aucun service correspondant trouvé pour la réservation.");
            throw new RuntimeException("Aucun service correspondant trouvé.");

        } catch (Exception e) {
            logger.error("Erreur lors de l'ajout de la réservation", e);
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("Erreur lors de l'ajout de la réservation")
                            .withCause(e)
                            .asRuntimeException()
            );
        }
    }













    @Override
    @Transactional
    public void createUser(CreateUserRequest request, StreamObserver<CreateUserResponse> responseObserver) {
        logger.info("Received request to create user: {}", request);

        try {
            // Validate input
            if (request.getUsername().isEmpty() || request.getPassword().isEmpty() || request.getName().isEmpty()) {
                logger.error("Invalid input: Missing required fields.");
                responseObserver.onError(Status.INVALID_ARGUMENT
                        .withDescription("All fields are required: username, password, name.")
                        .asRuntimeException());
                return;
            }

            // Check if the username already exists
            boolean existingUser = clientAgenceRepository.existsByUsername(request.getUsername());
            if (existingUser) {
                logger.error("Username {} is already taken.", request.getUsername());
                responseObserver.onError(Status.ALREADY_EXISTS
                        .withDescription("The username is already taken.")
                        .asRuntimeException());
                return;
            }

            // 1. Save the client
            Client client = new Client();
            client.setNom(request.getName());
            client.setPrenom(request.getPrenom());
            client.setNumeroTelephone(request.getPhone());

            Client savedClient = clientRepository.save(client);
            if (savedClient == null || savedClient.getId() == null) {
                logger.error("Failed to save client.");
                responseObserver.onError(Status.INTERNAL
                        .withDescription("Failed to save client information.")
                        .asRuntimeException());
                return;
            }

            // 2. Save the client-agency relationship
            ClientAgence clientAgence = new ClientAgence();
            clientAgence.setClientId(savedClient.getId());
            clientAgence.setAgenceId(request.getAgenceId());
            clientAgence.setUsername(request.getUsername());
            clientAgence.setPassword(request.getPassword());

            clientAgenceRepository.save(clientAgence);

            // Respond with success
            CreateUserResponse response = CreateUserResponse.newBuilder()
                    .setSuccess(true)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            logger.info("User created successfully: {}", savedClient.getNom());

        } catch (Exception e) {
            logger.error("Error while creating user", e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("An error occurred while creating the user.")
                    .withCause(e)
                    .asRuntimeException());
        }
    }








    @Override
    @Transactional
    public void authenticateUser(AuthRequest request, StreamObserver<AuthResponse> responseObserver) {
        logger.info("Received request to create user: {}", request.getAgenceId());

        try {
            // Validate input
            if (request.getUsername().isEmpty() || request.getPassword().isEmpty() || request.getAgenceId() == 0) {
                logger.error("Invalid input: Missing required fields.");
                responseObserver.onError(Status.INVALID_ARGUMENT
                        .withDescription("All fields are required: username, password, and agency ID.")
                        .asRuntimeException());
                return;
            }

            // Retrieve user details from the database
            Optional<ClientAgence> clientAgenceOptional = clientAgenceRepository.findByUsernameAndAgenceId(
                    request.getUsername(), request.getAgenceId());

            if (clientAgenceOptional.isPresent()) {
                ClientAgence clientAgence = clientAgenceOptional.get();

                // Check password match
                if (clientAgence.getPassword().equals(request.getPassword())) {
                    logger.info("User authenticated successfully: {}", request.getUsername());

                    // Respond with success
                    AuthResponse response = AuthResponse.newBuilder()
                            .setSuccess(true)
                            .build();
                    responseObserver.onNext(response);
                    responseObserver.onCompleted();
                } else {
                    logger.warn("Authentication failed for username: {}. Incorrect password.", request.getUsername());
                    responseObserver.onError(Status.UNAUTHENTICATED
                            .withDescription("Invalid credentials.")
                            .asRuntimeException());
                }
            } else {
                logger.warn("Authentication failed for username: {}. User not found in agency ID: {}",
                        request.getUsername(), request.getAgenceId());
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("User not found.")
                        .asRuntimeException());
            }

        } catch (Exception e) {
            logger.error("Error during authentication", e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("An error occurred while authenticating the user.")
                    .withCause(e)
                    .asRuntimeException());
        }
    }







    @Override
    @Transactional
    public void hotelByInformations(HotelInfoRequest request, StreamObserver<HotelInfoResponse> responseObserver) {
        try {
            logger.info("Requête reçue avec nomHotel: {}, numeroChambre: {}, dateDebut: {}, dateFin: {}",
                    request.getNomHotel(), request.getNumeroChambre(), request.getDateDebut(), request.getDateFin());

            // Vérifier si une agence existe
            List<Agence> agences = repository.findAll();
            if (agences.isEmpty()) {
                logger.error("Aucune agence disponible.");
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Aucune agence disponible.")
                        .asRuntimeException());
                return;
            }

            Agence agence = agences.stream()
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Aucune agence disponible."));

            // Collect offers from the agency
            Map<String, BigDecimal> uris = new HashMap<>();
            for (Offre offre : agence.getOffers()) {
                uris.put(offre.getUri(), offre.getPrix());
            }

            // Initialize response variables
            HotelInfoResponse.Builder hotelResponseBuilder = null;

            for (String uri : uris.keySet()) {
                logger.info("Traitement de l'URI : {}", uri);

                ManagedChannel channel = ManagedChannelBuilder.forTarget(uri)
                        .usePlaintext()
                        .build();

                try {
                    HotelServiceGrpc.HotelServiceBlockingStub stub = HotelServiceGrpc.newBlockingStub(channel);
                    HotelInfoRequest grpcRequest = HotelInfoRequest.newBuilder()
                            .setNomHotel(request.getNomHotel())
                            .setNumeroChambre(request.getNumeroChambre())
                            .setDateDebut(request.getDateDebut())
                            .setDateFin(request.getDateFin())
                            .build();

                    // RPC call to `rechercherHotelEtChambre`
                    HotelInfoResponse grpcResponse = stub.rechercherHotelEtChambre(grpcRequest);

                    if (grpcResponse != null) {
                        // Calculate the duration in days
                        LocalDate startDate = LocalDate.parse(request.getDateDebut());
                        LocalDate endDate = LocalDate.parse(request.getDateFin());
                        long nbJours = ChronoUnit.DAYS.between(startDate, endDate);

                        // Calculate final price per room
                        BigDecimal remise = uris.get(uri);
                        remise = remise != null ? remise : BigDecimal.ZERO;

                        BigDecimal prixParNuit = BigDecimal.valueOf(grpcResponse.getChambre().getPrix());
                        BigDecimal prixFinalChambre = prixParNuit.subtract(remise);

                        // Update response with calculated values
                        hotelResponseBuilder = grpcResponse.toBuilder()
                                .setNbJours((int) nbJours)
                                .setPrixFinal(prixFinalChambre.multiply(BigDecimal.valueOf(nbJours)).doubleValue())
                                .setChambre(grpcResponse.getChambre().toBuilder()
                                        .setPrixFinalChambre(prixFinalChambre.doubleValue())
                                        .build());
                        break;
                    }
                } catch (Exception e) {
                    logger.error("Erreur lors de l'appel à l'URI : {}", uri, e);
                } finally {
                    channel.shutdown();
                    channel.awaitTermination(5, TimeUnit.SECONDS);
                }
            }

            if (hotelResponseBuilder == null) {
                logger.warn("Aucun hôtel trouvé pour les paramètres donnés.");
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Hôtel ou chambre non trouvée.")
                        .asRuntimeException());
            } else {
                responseObserver.onNext(hotelResponseBuilder.build());
                responseObserver.onCompleted();
            }
        } catch (Exception e) {
            logger.error("Erreur lors de la recherche d'hôtel par informations", e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Erreur interne lors de la recherche d'hôtel.")
                    .withCause(e)
                    .asRuntimeException());
        }
    }





    @Override
    @Transactional
    public void saveCardInfo(SaveCardRequest request, StreamObserver<SaveCardResponse> responseObserver) {
        try {
            // Find the client by ID
            Client client = clientRepository.findById(request.getClientId())
                    .orElseThrow(() -> new RuntimeException("Client not found with ID: " + request.getClientId()));

            // Create and set card information
            CarteCredit card = new CarteCredit();
            card.setNumeroCarte(request.getNumeroCarte());
            card.setCvv(request.getCvv());
            card.setTitulaireCarte(request.getTitulaireCarte());
            card.setDateExpiration(request.getDateExpiration());
            client.setCarteCredit(card);

            // Save client with card information
            clientRepository.save(client);

            // Respond with success
            SaveCardResponse response = SaveCardResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Card information saved successfully.")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            logger.error("Error saving card info", e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Failed to save card information.")
                    .withCause(e)
                    .asRuntimeException());
        }
    }

    @Override
    public void getCardInfoByClient(ClientFilterRequest request, StreamObserver<ClientCardResponse> responseObserver) {
        try {
            // Find the client by filters
            Client client = clientRepository.findByNomAndPrenomAndNumeroTelephone(
                            request.getNom(), request.getPrenom(), request.getNumeroTelephone())
                    .orElseThrow(() -> new RuntimeException("Client not found with the provided filters."));

            // Get card information
            CarteCredit card = client.getCarteCredit();
            if (card == null) {
                throw new RuntimeException("No card information found for the client.");
            }

            // Build response
            ClientCardResponse response = ClientCardResponse.newBuilder()
                    .setNumeroCarte(card.getNumeroCarte())
                    .setCvv(card.getCvv())
                    .setTitulaireCarte(card.getTitulaireCarte())
                    .setDateExpiration(card.getDateExpiration())
                    .setClientNom(client.getNom())
                    .setClientPrenom(client.getPrenom())
                    .setClientTelephone(client.getNumeroTelephone())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            logger.error("Error fetching card info", e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Failed to fetch card information.")
                    .withCause(e)
                    .asRuntimeException());
        }
    }






}
