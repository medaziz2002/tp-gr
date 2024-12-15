package org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // Ajout de l'ID pour l'adresse
    private String pays;
    private String ville;
    private String rue;
    private Integer codePostal;
    private Integer numero;
    private String positionGps;
    private String lieu_dit;

    @OneToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;


}