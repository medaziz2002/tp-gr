package org.anonbnr.web_services.grpc.agence.navigo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomAgence;

    @OneToMany(mappedBy = "agence")
    private List<Offre> offers;

    public List<Offre> getOffers() {
        return offers;
    }

}