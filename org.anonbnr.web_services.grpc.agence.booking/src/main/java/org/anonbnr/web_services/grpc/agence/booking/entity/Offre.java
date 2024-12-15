package org.anonbnr.web_services.grpc.agence.booking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@AllArgsConstructor
@NoArgsConstructor

@Setter
@Getter

public class Offre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal prix;
    @ManyToOne

    @JoinColumn(name = "agence_id")
    private Agence agence;
    private String uri;
    private String nomHotel;
}

