package org.anonbnr.web_services.grpc.agence.booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
public class CarteCredit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCarte;
    private String cvv;
    private String titulaireCarte;
    private String dateExpiration;

    @OneToOne(mappedBy = "carteCredit")
    private Client client;
}