package org.anonbnr.web_services.grpc.hotel_de_la_cite.server.services;






import combined.grpc.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;


import org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model.Chambre;
import org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model.Hotel;
import org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model.Position;
import org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model.Reservation;
import org.anonbnr.web_services.grpc.hotel_de_la_cite.server.repository.HotelRepository;
import org.anonbnr.web_services.grpc.hotel_de_la_cite.server.repository.ReservationRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@GrpcService
@RequiredArgsConstructor
public class HotelServiceImpl extends HotelServiceGrpc.HotelServiceImplBase {

	private final HotelRepository repository;

	private final ReservationRepository resRepository;

	@Transactional
	@Override
	public void rechercherHotel(HotelSearchRequest request, StreamObserver<HotelSearchResponse> responseObserver) {
		try {
			System.out.println("Reçu tous les informations de la requête : " + request.toString());

			// Valider les données de la requête
			if (request.getDateArrivee() == null || request.getDateDepart() == null) {
				System.out.println("Validation échouée : Les dates d'arrivée et de départ sont obligatoires.");
				throw new IllegalArgumentException("Les dates d'arrivée et de départ sont obligatoires.");
			}

			// Parsing des dates
			System.out.println("Parsing des dates...");
			LocalDate arrivee = LocalDate.parse(request.getDateArrivee());
			LocalDate depart = LocalDate.parse(request.getDateDepart());
			System.out.println("Date d'arrivée : " + arrivee + ", Date de départ : " + depart);

			if (!depart.isAfter(arrivee)) {
				System.out.println("Validation échouée : La date de départ doit être après la date d'arrivée.");
				throw new IllegalArgumentException("La date de départ doit être après la date d'arrivée.");
			}

			// Récupération des hôtels
			System.out.println("Récupération des hôtels depuis la base de données...");
			List<Hotel> hotels = repository.findAll();
			System.out.println("Nombre d'hôtels récupérés : " + hotels.size());

			if (hotels.isEmpty()) {
				System.out.println("Aucun hôtel disponible dans la base de données.");
				responseObserver.onError(new RuntimeException("Aucun hôtel disponible dans la base de données."));
				return;
			}

			// Application des critères de recherche
			System.out.println("Application des critères de recherche...");
			for (Hotel hotel : hotels) {
				System.out.println("Vérification des critères pour l'hôtel : " + hotel.getNom());

				if (matchesCriteria(hotel, request.getPosition(), request.getEtoiles())) {
					System.out.println("L'hôtel correspond aux critères. Recherche des chambres disponibles...");

					List<ChambreDto> chambresDisponibles = findAvailableRooms(
							hotel,
							arrivee,
							depart,
							BigDecimal.valueOf(request.getPrixMin()),
							BigDecimal.valueOf(request.getPrixMax()),
							request.getTaille()
					);

					System.out.println("Nombre de chambres disponibles : " + chambresDisponibles.size());

					if (!chambresDisponibles.isEmpty()) {
						System.out.println("Création de la réponse pour l'hôtel : " + hotel.getNom());

						HotelSearchResponse response = HotelSearchResponse.newBuilder()
								.setNomAgence(request.getNomAgence())
								.setNomHotel(hotel.getNom())
								.setNbetoile(hotel.getEtoile())
								.setPays(hotel.getPosition().getPays())
								.setVille(hotel.getPosition().getVille())
								.setRue(hotel.getPosition().getRue())
								.setCodePostal(String.valueOf(hotel.getPosition().getCodePostal()))
								.setPositionGps(hotel.getPosition().getPositionGps())
								.setLieuDit(hotel.getPosition().getLieu_dit())
								.addAllChambres(chambresDisponibles)
								.build();

						System.out.println("Réponse créée avec succès pour l'hôtel : " + hotel.getNom());
						responseObserver.onNext(response);
						responseObserver.onCompleted();
						return;
					}
				} else {
					System.out.println("L'hôtel ne correspond pas aux critères.");
				}
			}

			System.out.println("Aucun hôtel ne correspond aux critères de recherche.");
			responseObserver.onError(new RuntimeException("Aucun hôtel ne correspond aux critères de recherche."));
		} catch (IllegalArgumentException e) {
			System.out.println("Erreur de validation des données : " + e.getMessage());
			responseObserver.onError(new RuntimeException("Erreur de validation des données : " + e.getMessage(), e));
		} catch (Exception e) {
			System.out.println("Erreur lors de la recherche des hôtels : " + e.getMessage());
			responseObserver.onError(new RuntimeException("Erreur lors de la recherche des hôtels : " + e.getMessage(), e));
		}
	}


	@Override
	public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
		PingResponse response = PingResponse.newBuilder()
				.setResponse("Pong: " + request.getMessage())
				.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}


	private boolean matchesCriteria(Hotel hotel, String position, double etoiles) {
		// Vérifie si l'hôtel correspond aux critères de position et d'étoiles
		return (hotel.getPosition().getVille().equalsIgnoreCase(position) ||
				hotel.getPosition().getPays().equalsIgnoreCase(position)) &&
				hotel.getEtoile() >= etoiles;
	}

	private List<ChambreDto> findAvailableRooms(Hotel hotel, LocalDate arrivee, LocalDate depart, BigDecimal prixMin, BigDecimal prixMax, int taille) {
		List<ChambreDto> chambresDisponibles = new ArrayList<>();
		for (Chambre chambre : hotel.getChambres()) {
			// Vérifie les critères de prix et de taille
			if (chambre.getPrix().compareTo(prixMin) >= 0 && chambre.getPrix().compareTo(prixMax) <= 0 &&
					chambre.getNbLits() >= taille) {

				// Vérifie si la chambre est disponible pendant les dates demandées
				boolean isAvailable = hotel.getReservations().stream().noneMatch(reservation ->
						reservation.getChambre().getId().equals(chambre.getId()) &&
								(arrivee.isBefore(reservation.getDateFin()) && depart.isAfter(reservation.getDateDebut()))
				);

				if (isAvailable) {
					// Ajout de la chambre disponible à la liste
					chambresDisponibles.add(ChambreDto.newBuilder()
							.setId(chambre.getId())
							.setNbLits(chambre.getNbLits())
							.setPrix(chambre.getPrix().doubleValue())
							.build());
				}
			}
		}
		return chambresDisponibles;
	}












	@Override
	@Transactional
	public void reserver(ReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
		try {
			LocalDate startDate = LocalDate.parse(request.getDateDebut());
			LocalDate endDate = LocalDate.parse(request.getDateFin());

			Optional<Hotel> hotelOptional = repository.findAll().stream().findFirst();
			if (hotelOptional.isEmpty()) {
				responseObserver.onError(new RuntimeException("Aucun hôtel trouvé"));
				return;
			}

			Hotel hotel = hotelOptional.get();
			Optional<Chambre> chambreOptional = hotel.getChambres().stream()
					.filter(c -> c.getId().equals(request.getRoomNumber()))
					.findFirst();

			if (chambreOptional.isEmpty()) {
				responseObserver.onError(new RuntimeException("Chambre non trouvée"));
				return;
			}

			Chambre chambre = chambreOptional.get();

			boolean isAvailable = hotel.getReservations().stream().noneMatch(reservation ->
					reservation.getChambre().getId().equals(chambre.getId()) &&
							(startDate.isBefore(reservation.getDateFin()) && endDate.isAfter(reservation.getDateDebut()))
			);

			if (!isAvailable) {
				responseObserver.onError(new RuntimeException("Chambre non disponible pour les dates sélectionnées"));
				return;
			}

			Reservation reservation = new Reservation();
			reservation.setDateDebut(startDate);
			reservation.setDateFin(endDate);
			reservation.setInfoClient(request.getName() + " " + request.getPrenom() + " " + request.getPhone());
			reservation.setHotel(hotel);
			reservation.setChambre(chambre);

			resRepository.save(reservation);

			responseObserver.onNext(ReservationResponse.newBuilder().setSuccess(true).build());
			responseObserver.onCompleted();

		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}


	@Override
	@Transactional
	public void rechercherHotelEtChambre(HotelInfoRequest request, StreamObserver<HotelInfoResponse> responseObserver) {
		System.out.print("je recu "+request.toString());
		try {

			// Retrieve the first hotel in the database
			Hotel hotel = repository.findAll().stream()
					.filter(h -> h.getNom().equalsIgnoreCase(request.getNomHotel()))
					.findFirst()
					.orElseThrow(() -> new RuntimeException("Aucun hôtel trouvé dans la base de données."));

			Position positionHotel = hotel.getPosition();

			// Find the requested room in the hotel
			Chambre chambreTrouvee = hotel.getChambres().stream()
					.filter(chambre -> chambre.getId() == request.getNumeroChambre())
					.findFirst()
					.orElseThrow(() -> new RuntimeException("Chambre non trouvée dans l'hôtel."));

			// Calculate the duration in days
			LocalDate startDate = LocalDate.parse(request.getDateDebut());
			LocalDate endDate = LocalDate.parse(request.getDateFin());
			long nbJours = ChronoUnit.DAYS.between(startDate, endDate);

			// Calculate final price for the stay
			BigDecimal prixFinal = chambreTrouvee.getPrix().multiply(BigDecimal.valueOf(nbJours));

			// Build the response
			HotelInfoResponse response = HotelInfoResponse.newBuilder()
					.setNomAgence("Nom de l'Agence") // Replace with the agency's name
					.setNomHotel(hotel.getNom())
					.setNbetoile(hotel.getEtoile())
					.setPays(positionHotel.getPays())
					.setVille(positionHotel.getVille())
					.setRue(positionHotel.getRue())
					.setCodePostal(positionHotel.getCodePostal())
					.setPositionGps(positionHotel.getPositionGps())
					.setLieuDit(positionHotel.getLieu_dit())
					.setNbJours((int) nbJours)
					.setPrixFinal(prixFinal.doubleValue())
					.setChambre(ChambreDto.newBuilder()
							.setNbLits(chambreTrouvee.getNbLits())
							.setId(chambreTrouvee.getId())
							.setPrix(chambreTrouvee.getPrix().doubleValue())
							.build())
					.build();

			// Send the response
			responseObserver.onNext(response);
			responseObserver.onCompleted();

		} catch (Exception e) {

			responseObserver.onError(Status.NOT_FOUND
					.withDescription(e.getMessage())
					.withCause(e)
					.asRuntimeException());
		}
	}







}
