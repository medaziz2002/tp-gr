package org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    private String infoClient;


    @ManyToOne
    @JoinColumn(name = "chambre_id")
    private Chambre chambre;

}
