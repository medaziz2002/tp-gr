package org.anonbnr.web_services.grpc.reservation.client.cli;


import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {
    private String nomHotel;
    private String nomAgence;
    private double nbetoile;
    private String pays;
    private String ville;
    private String rue;
    private String codePostal;
    private String positionGps;
    private String lieuDit;
    private List<ChambreDto> chambres;

    // Getters et setters
}

