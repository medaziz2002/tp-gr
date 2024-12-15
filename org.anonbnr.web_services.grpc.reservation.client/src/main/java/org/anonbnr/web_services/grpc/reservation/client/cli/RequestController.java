package org.anonbnr.web_services.grpc.reservation.client.cli;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import combined.grpc.*;
import org.springframework.core.io.Resource;

import org.anonbnr.web_services.grpc.reservation.client.services.RequestService;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/request")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RequestController {

    private final RequestService requestService;

    // Constructor-based dependency injection
    public RequestController(RequestService employeeServiceClient) {
        this.requestService = employeeServiceClient;
    }

    // BookingService Endpoints

    @GetMapping("/rechercher-hotels")
    public ResponseEntity<HotelSearchResponseList> rechercherHotels(
            @RequestParam String position,
            @RequestParam int taille,
            @RequestParam String nomAgence,
            @RequestParam double etoiles,
            @RequestParam String dateArrivee,
            @RequestParam String dateDepart,
            @RequestParam double prixMin,
            @RequestParam double prixMax) {

        HotelSearchRequest request = HotelSearchRequest.newBuilder()
                .setPosition(position)
                .setTaille(taille)
                .setNomAgence(nomAgence)
                .setEtoiles(etoiles)
                .setDateArrivee(dateArrivee)
                .setDateDepart(dateDepart)
                .setPrixMin(prixMin)
                .setPrixMax(prixMax)
                .build();

        HotelSearchResponseList response = requestService.rechercherHotels(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/info")
    public ResponseEntity<HotelDto> getHotelInfo(
            @RequestParam String nomHotel,
            @RequestParam int numeroChambre,
            @RequestParam String dateDebut,
            @RequestParam String dateFin,
            @RequestParam String agence
    ) {
        try {
            // Construire la requête gRPC
            HotelInfoRequest request = HotelInfoRequest.newBuilder()
                    .setNomHotel(nomHotel)
                    .setNumeroChambre(numeroChambre)
                    .setDateDebut(dateDebut)
                    .setDateFin(dateFin)
                    .build();

            HotelInfoResponse response = null;

            // Appeler le service gRPC approprié en fonction de l'agence
            if (agence.contains("Booking")) {
                response = requestService.hotelByInformations(request);
            } else if (agence.contains("Agence_Navigo")) {
                response = requestService.hotelByInformationsnavigo(request);
            }

            // Vérifier si la réponse est null (aucune information trouvée)
            if (response == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(null);
            }

            // Convertir la réponse gRPC en DTO
            List<org.anonbnr.web_services.grpc.reservation.client.cli.ChambreDto> chambreDtos = Collections.singletonList(
                    org.anonbnr.web_services.grpc.reservation.client.cli.ChambreDto.builder()
                            .id(response.getChambre().getId())
                            .nbLits(response.getChambre().getNbLits())
                            .prix(response.getChambre().getPrix())
                            .prixFinalChambre(response.getChambre().getPrixFinalChambre())
                            .build()
            );

            HotelDto hotelInfoDto = HotelDto.builder()
                    .nomAgence(response.getNomAgence())
                    .nomHotel(response.getNomHotel())
                    .nbetoile(response.getNbetoile())
                    .pays(response.getPays())
                    .ville(response.getVille())
                    .rue(response.getRue())
                    .codePostal(String.valueOf(response.getCodePostal()))
                    .positionGps(response.getPositionGps())
                    .lieuDit(response.getLieuDit())
                    .chambres(chambreDtos)
                    .build();

            // Retourner la réponse DTO
            return ResponseEntity.ok(hotelInfoDto);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }






    @PostMapping("/ajouter-reservation")
    public ResponseEntity<Resource> ajouterReservation(@RequestBody ReservationRequestDto requestDto) {
        // Déclarez la réponse gRPC pour la réservation
        ReservationResponse response;

        try {
            // Convertir le DTO en requête gRPC
            ReservationRequest request = ReservationRequest.newBuilder()
                    .setNomHotel(requestDto.getNomHotel())
                    .setRoomNumber(requestDto.getRoomNumber())
                    .setDateDebut(requestDto.getDateDebut())
                    .setDateFin(requestDto.getDateFin())
                    .setName(requestDto.getName())
                    .setPrenom(requestDto.getPrenom())
                    .setPhone(requestDto.getPhone())
                    .build();

            System.out.println("Request payload: " + request.toString());

            // Appeler le bon service en fonction de l'agence
            if (requestDto.getAgencyName() != null) {
                if (requestDto.getAgencyName().contains("Booking")) {
                    response = requestService.ajouterReservation(request);
                } else if (requestDto.getAgencyName().contains("Agence_Navigo")) {
                    response = requestService.ajouterReservationnavigo(request);
                } else {
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Agence inconnue.");
                }
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le nom de l'agence est requis.");
            }

            // Si la réservation a échoué, retourner une erreur
            if (!response.getSuccess()) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "La réservation a échoué.");
            }

            // Générer le PDF de la réservation
            String reservationNumber = UUID.randomUUID().toString();
            String filePath = generateReservationPDF(request, reservationNumber);

            // Vérifiez que le fichier a été généré
            File file = new File(filePath);
            if (!file.exists()) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Le fichier PDF n'a pas été généré.");
            }

            // Créer une ressource Spring à partir du fichier
            Resource resource = new FileSystemResource(file);

            // Définir les en-têtes pour le téléchargement du fichier
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=Reservation_" + reservationNumber + ".pdf");

            return ResponseEntity.ok()
                    .headers(headers)
                    .contentLength(file.length())
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(resource);

        } catch (ResponseStatusException e) {
            // Gestion des exceptions spécifiques avec le statut HTTP approprié
            System.err.println("Erreur : " + e.getReason());
            throw e;
        } catch (Exception e) {
            // Gestion des autres erreurs
            System.err.println("Erreur lors de la génération ou de l'envoi du PDF.");
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erreur lors de la génération ou de l'envoi du PDF.");
        }
    }




    private String generateReservationPDF(ReservationRequest request, String reservationNumber) {
        Document document = new Document(PageSize.A4);
        String filePath = System.getProperty("user.dir") + "/Reservation_" + reservationNumber + ".pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Add metadata
            document.addTitle("Confirmation de Réservation - " + reservationNumber);
            document.addSubject("Détails de la réservation");
            document.addAuthor("Comparateur d'Hôtels");

            // Add title
            Paragraph title = new Paragraph("Confirmation de Réservation", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(new Paragraph(" ")); // Spacing

            // Add reservation details
            document.add(new Paragraph("Numéro de réservation : " + reservationNumber, new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD)));
            document.add(new Paragraph("Nom : " + request.getName()));
            document.add(new Paragraph("Prénom : " + request.getPrenom()));
            document.add(new Paragraph("Téléphone : " + request.getPhone()));
            document.add(new Paragraph("Hôtel : " + request.getNomHotel()));
            document.add(new Paragraph("Numéro de chambre : " + request.getRoomNumber()));
            document.add(new Paragraph("Date d'arrivée : " + request.getDateDebut()));
            document.add(new Paragraph("Date de départ : " + request.getDateFin()));



            document.add(new Paragraph(" "));

            // Confirmation note
            Paragraph confirmation = new Paragraph("Merci pour votre réservation ! Nous espérons que votre séjour sera agréable.", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.ITALIC));
            confirmation.setAlignment(Element.ALIGN_CENTER);
            document.add(confirmation);

            System.out.println("PDF généré avec succès : " + filePath);
        } catch (DocumentException | IOException e) {
            System.err.println("Erreur lors de la génération du PDF : " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Erreur lors de la génération du PDF.");
        } finally {
            document.close();
        }

        return filePath;
    }

    @PostMapping("/create-user")
    public ResponseEntity<Boolean> createUser(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String name,
            @RequestParam String prenom,
            @RequestParam String phone,
            @RequestParam String agence,
            @RequestParam int agenceId) {

        // Construire la requête gRPC
        CreateUserRequest request = CreateUserRequest.newBuilder()
                .setUsername(username)
                .setPassword(password)
                .setName(name)
                .setPrenom(prenom)
                .setPhone(phone)
                .setAgenceId(agenceId)
                .build();

        CreateUserResponse response = null;

        try {
            // Appeler le service approprié en fonction de l'agence
            if (agence.contains("Booking")) {
                response = requestService.createUser(request);
            } else if (agence.contains("Agence_Navigo")) {
                response = requestService.createUsernavigo(request);
            } else {
                // Si aucune condition n'est remplie, retourner une erreur
                return ResponseEntity.badRequest().body(false);
            }

            // Vérifier la réponse
            if (response == null || !response.getSuccess()) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
            }

            return ResponseEntity.ok(response.getSuccess());

        } catch (Exception e) {
            // En cas d'exception, retourner une réponse d'erreur
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
        }
    }


    @GetMapping("/authenticate-user")
    public ResponseEntity<Boolean> authenticateUser(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam int agenceId,
            @RequestParam String agence
    ) {
        try {
            // Construire la requête gRPC
            AuthRequest request = AuthRequest.newBuilder()
                    .setUsername(username)
                    .setPassword(password)
                    .setAgenceId(agenceId)
                    .build();

            AuthResponse response;

            // Vérifier quelle agence est ciblée
            if (agence.contains("Booking")) {
                response = requestService.authenticateUser(request); // Appel pour Booking
            } else if (agence.contains("Agence_Navigo")) {
                response = requestService.authenticateUsernavigo(request); // Appel pour Navigo
            } else {
                // Si l'agence n'est pas reconnue
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
            }

            // Vérifier si la réponse est valide
            if (response != null && response.getSuccess()) {
                return ResponseEntity.ok(true);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
            }
        } catch (Exception e) {
            // Gérer les erreurs et retourner un code approprié

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
        }
    }


    // HotelService Endpoints



    /*

    @GetMapping("/rechercher-hotel")
    public ResponseEntity<HotelSearchResponse> rechercherHotel(
            @RequestParam String position,
            @RequestParam int taille,
            @RequestParam String nomAgence) {

        HotelSearchRequest request = HotelSearchRequest.newBuilder()
                .setPosition(position)
                .setTaille(taille)
                .setNomAgence(nomAgence)
                .build();

        HotelSearchResponse response = requestService.rechercherHotel(request);
        return ResponseEntity.ok(response);
    }


     */






        /*
    @PutMapping("/reserver")
    public ResponseEntity<ReservationResponse> reserver(
            @RequestParam String nomHotel,
            @RequestParam int roomNumber,
            @RequestParam String dateDebut,
            @RequestParam String dateFin) {

        ReservationRequest request = ReservationRequest.newBuilder()
                .setNomHotel(nomHotel)
                .setRoomNumber(roomNumber)
                .setDateDebut(dateDebut)
                .setDateFin(dateFin)
                .build();

        ReservationResponse response = requestService.reserver(request);
        return ResponseEntity.ok(response);
    }


*/







    @GetMapping("/comparer")
    public ResponseEntity<Map<String, Object>> comparerHotels(
            @RequestParam String destination,
            @RequestParam String dateArrivee,
            @RequestParam String dateDepart,
            @RequestParam BigDecimal prixMin,
            @RequestParam BigDecimal prixMax,
            @RequestParam int taille,
            @RequestParam int etoiles,
            @RequestParam List<String> agences) {

        Map<String, Object> resultat = new HashMap<>();
        List<HotelDto> listeHotels = new ArrayList<>();

        System.out.println("je suis dans comparer s'il vous plait");

        // Construire la requête de recherche
        HotelSearchRequest request = HotelSearchRequest.newBuilder()
                .setPosition(destination)
                .setTaille(taille)
                .setEtoiles(etoiles)
                .setDateArrivee(dateArrivee)
                .setDateDepart(dateDepart)
                .setPrixMin(prixMin.doubleValue())
                .setPrixMax(prixMax.doubleValue())
                .build();

        // Recherche des hôtels dans les agences sélectionnées
        if (agences.contains("Agence_Navigo")) {
            try {
                HotelSearchResponseList responseList = requestService.rechercherHotelsnavigo(request);
                if (responseList != null && !responseList.getHotelsList().isEmpty()) {
                    for (HotelSearchResponse hotel : responseList.getHotelsList()) {
                        if (!hotel.getNomHotel().equalsIgnoreCase("Undefined")) {

                            HotelDto hotelDto = convertToDto(hotel, "Agence_Navigo");
                            listeHotels.add(hotelDto);
                        }
                    }
                }
            } catch (Exception e) {
                System.err.println("Erreur lors de l'appel à Agence_Navigo");
                e.printStackTrace();
            }
        }

        if (agences.contains("Booking")) {
            try {
                HotelSearchResponseList responseList = requestService.rechercherHotels(request);
                if (responseList != null && !responseList.getHotelsList().isEmpty()) {
                    for (HotelSearchResponse hotel : responseList.getHotelsList()) {
                        if (!hotel.getNomHotel().equalsIgnoreCase("Undefined")) {
                            HotelDto hotelDto = convertToDto(hotel, "Booking");
                            listeHotels.add(hotelDto);
                        }
                    }
                }
            } catch (Exception e) {
                System.err.println("Erreur lors de l'appel à Booking");
                e.printStackTrace();
            }
        }

        // Initialisation des meilleurs résultats
        BigDecimal meilleurPrix = BigDecimal.valueOf(Double.MAX_VALUE);
        String hotelMeilleurPrix = "Aucune information";
        double meilleureNote = 0;
        String hotelMeilleureNote = "Aucune information";

        // Filtrer les hôtels pour les meilleurs prix et étoiles
        for (HotelDto hotel : listeHotels) {
            if (hotel.getNbetoile() > meilleureNote) {
                meilleureNote = hotel.getNbetoile();
                hotelMeilleureNote = hotel.getNomHotel();
            }

            for (org.anonbnr.web_services.grpc.reservation.client.cli.ChambreDto chambre : hotel.getChambres()) {
                BigDecimal prixChambre = BigDecimal.valueOf(chambre.getPrix());

                // Comparer le prix pour le meilleur prix
                if (prixChambre.compareTo(meilleurPrix) < 0) {
                    meilleurPrix = prixChambre;
                    hotelMeilleurPrix = hotel.getNomHotel();
                }
            }
        }

        // Ajouter les résultats au retour
        resultat.put("hotelMeilleurPrix", hotelMeilleurPrix);
        resultat.put("hotelMeilleureNote", hotelMeilleureNote);
        resultat.put("listeHotels", listeHotels);

        return ResponseEntity.ok(resultat);
    }












    private HotelDto convertToDto(HotelSearchResponse hotel, String agenceName) {
        // Créer une instance de HotelDto
        HotelDto dto = new HotelDto();

        // Mapper les informations générales de l'hôtel
        dto.setNomHotel(hotel.getNomHotel());
        dto.setNomAgence(agenceName);
        dto.setNbetoile(hotel.getNbetoile());
        dto.setPays(hotel.getPays());
        dto.setVille(hotel.getVille());
        dto.setRue(hotel.getRue());
        dto.setCodePostal(hotel.getCodePostal());
        dto.setPositionGps(hotel.getPositionGps());
        dto.setLieuDit(hotel.getLieuDit());

        // Convertir les chambres en ChambreDto
        List<org.anonbnr.web_services.grpc.reservation.client.cli.ChambreDto> chambresDto = hotel.getChambresList().stream().map(chambre -> {
            org.anonbnr.web_services.grpc.reservation.client.cli.ChambreDto chambreDto = new ChambreDto();
            chambreDto.setId(chambre.getId());
            chambreDto.setNbLits(chambre.getNbLits());
            chambreDto.setPrix(chambre.getPrix());
            chambreDto.setPrixFinalChambre(chambre.getPrixFinalChambre());
            return chambreDto;
        }).collect(Collectors.toList());

        // Ajouter la liste des chambres converties dans le DTO
        dto.setChambres(chambresDto);

        return dto;
    }







    @GetMapping("/rechercher_hotel_by_agence")
    public ResponseEntity<List<HotelDto>> rechercherHotelAgence(
            @RequestParam String destination,
            @RequestParam String dateArrivee,
            @RequestParam String dateDepart,
            @RequestParam BigDecimal prixMin,
            @RequestParam BigDecimal prixMax,
            @RequestParam int taille,
            @RequestParam int etoiles,
            @RequestParam String agences) {

        List<HotelDto> listeHotels = new ArrayList<>();

        // Construire la requête de recherche
        HotelSearchRequest request = HotelSearchRequest.newBuilder()
                .setPosition(destination)
                .setTaille(taille)
                .setEtoiles(etoiles)
                .setDateArrivee(dateArrivee)
                .setDateDepart(dateDepart)
                .setPrixMin(prixMin.doubleValue())
                .setPrixMax(prixMax.doubleValue())
                .build();

        // Recherche des hôtels dans les agences sélectionnées
        if (agences.contains("Agence_Navigo")) {
            try {
                HotelSearchResponseList responseList = requestService.rechercherHotelsnavigo(request);
                if (responseList != null && !responseList.getHotelsList().isEmpty()) {
                    for (HotelSearchResponse hotel : responseList.getHotelsList()) {
                        if (!hotel.getNomHotel().equalsIgnoreCase("Undefined")) {
                            HotelDto hotelDto = convertToDto(hotel, "Agence_Navigo");
                            listeHotels.add(hotelDto);
                        }
                    }
                }
            } catch (Exception e) {
                System.err.println("Erreur lors de l'appel à Agence_Navigo : " + e.getMessage());
                e.printStackTrace();
            }
        }

        if (agences.contains("Booking")) {
            try {
                HotelSearchResponseList responseList = requestService.rechercherHotels(request);
                if (responseList != null && !responseList.getHotelsList().isEmpty()) {
                    for (HotelSearchResponse hotel : responseList.getHotelsList()) {
                        if (!hotel.getNomHotel().equalsIgnoreCase("Undefined")) {
                            HotelDto hotelDto = convertToDto(hotel, "Booking");
                            listeHotels.add(hotelDto);
                        }
                    }
                }
            } catch (Exception e) {
                System.err.println("Erreur lors de l'appel à Booking : " + e.getMessage());
                e.printStackTrace();
            }
        }

        return ResponseEntity.ok(listeHotels);
    }




    @PostMapping("/save")
    public ResponseEntity<Boolean> saveCardInfo(@RequestBody SaveCardRequest request) {
        boolean isSaved = requestService.saveCardInfo(request).getSuccess();
        return ResponseEntity.ok(isSaved);
    }


    // Endpoint to get card information by client filters
    @GetMapping("/infoCarte")
    public ClientCardResponse getCardInfoByClient(
            @RequestParam String nom,
            @RequestParam String prenom,
            @RequestParam String numeroTelephone) {

        ClientFilterRequest request = ClientFilterRequest.newBuilder()
                .setNom(nom)
                .setPrenom(prenom)
                .setNumeroTelephone(numeroTelephone)
                .build();

        return requestService.getCardInfoByClient(request);
    }






}
