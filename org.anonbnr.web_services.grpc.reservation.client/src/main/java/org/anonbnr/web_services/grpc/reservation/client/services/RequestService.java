package org.anonbnr.web_services.grpc.reservation.client.services;

import combined.grpc.*;
import org.springframework.stereotype.Service;



import net.devh.boot.grpc.client.inject.GrpcClient;




/*
@Service
public class EmployeeServiceClient {

	// Automatically inject the gRPC client stub using the @GrpcClient annotation
	@GrpcClient("employee-service")
	private EmployeeServiceBlockingStub blockingStub;
	
	public EmployeeList getAllEmployees(Empty request) {
		return blockingStub.getAllEmployees(request);
	}
	
	public Employee getEmployeeById(EmployeeId request) {
		return blockingStub.getEmployeeById(request);
	}
	
	public EmployeeCount getEmployeeCount(Empty request) {
		return blockingStub.getEmployeeCount(request);
	}
	
	public Employee addEmployee(Employee request) {
		return blockingStub.addEmployee(request);
	}
	
	public Empty deleteEmployeeById(EmployeeId request) {
		return blockingStub.deleteEmployeeById(request);
	}
	
	public Employee updateEmployee(Employee request) {
		return blockingStub.updateEmployee(request);
	}
}

 */


@Service
public class RequestService {

	// Automatically inject the gRPC client stub using the @GrpcClient annotation
	@GrpcClient("booking-service")
	private BookingServiceGrpc.BookingServiceBlockingStub bookingServiceStub;


	@GrpcClient("navigo-service")
	private NavigoServiceGrpc.NavigoServiceBlockingStub navigoServiceBlockingStub;


	@GrpcClient("hotel-service")
	private HotelServiceGrpc.HotelServiceBlockingStub hotelServiceStub;

	// BookingService methods

	public HotelSearchResponseList rechercherHotels(HotelSearchRequest request) {
		return bookingServiceStub.rechercherHotels(request);
	}

	public HotelInfoResponse hotelByInformations(HotelInfoRequest request) {
		return bookingServiceStub.hotelByInformations(request);
	}

	public ReservationResponse ajouterReservation(ReservationRequest request) {
		return bookingServiceStub.ajouterReservation(request);
	}

	public CreateUserResponse createUser(CreateUserRequest request) {
		return bookingServiceStub.createUser(request);
	}

	public AuthResponse authenticateUser(AuthRequest request) {
		return bookingServiceStub.authenticateUser(request);
	}


	public SaveCardResponse saveCardInfo(SaveCardRequest request) {
		return bookingServiceStub.saveCardInfo(request);
	}

	public ClientCardResponse getCardInfoByClient(ClientFilterRequest request) {
		return bookingServiceStub.getCardInfoByClient(request);
	}














	public HotelSearchResponseList rechercherHotelsnavigo(HotelSearchRequest request) {
		return navigoServiceBlockingStub.rechercherHotels(request);
	}

	public HotelInfoResponse hotelByInformationsnavigo(HotelInfoRequest request) {
		return navigoServiceBlockingStub.hotelByInformations(request);
	}

	public ReservationResponse ajouterReservationnavigo(ReservationRequest request) {
		return navigoServiceBlockingStub.ajouterReservation(request);
	}

	public CreateUserResponse createUsernavigo(CreateUserRequest request) {
		return navigoServiceBlockingStub.createUser(request);
	}

	public AuthResponse authenticateUsernavigo(AuthRequest request) {
		return navigoServiceBlockingStub.authenticateUser(request);
	}


	public SaveCardResponse saveCardInfonavigo(SaveCardRequest request) {
		return navigoServiceBlockingStub.saveCardInfo(request);
	}

	public ClientCardResponse getCardInfoByClientnavigo(ClientFilterRequest request) {
		return navigoServiceBlockingStub.getCardInfoByClient(request);
	}

}




