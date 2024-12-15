package org.anonbnr.web_services.grpc.reservation.client.cli;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ChambreDto {
    private int id;                // Identifiant unique de la chambre
    private int nbLits;            // Nombre de lits dans la chambre
    private double prix;           // Prix par nuit
    private double prixFinalChambre;
}
