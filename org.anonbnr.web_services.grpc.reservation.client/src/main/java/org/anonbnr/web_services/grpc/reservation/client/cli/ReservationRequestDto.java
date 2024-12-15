package org.anonbnr.web_services.grpc.reservation.client.cli;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationRequestDto {
    private String nomHotel;
    private int roomNumber;
    private String dateDebut;
    private String dateFin;
    private String name;
    private String prenom;
    private String phone;
    private String agencyName;
}