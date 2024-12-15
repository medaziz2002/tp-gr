package org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Hotel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;

    @OneToOne
    private Position position;

    private Integer etoile;


    @OneToMany(mappedBy = "hotel")
    private List<Chambre> chambres;



    @OneToMany(mappedBy = "hotel")
    private List<Reservation> reservations;

}