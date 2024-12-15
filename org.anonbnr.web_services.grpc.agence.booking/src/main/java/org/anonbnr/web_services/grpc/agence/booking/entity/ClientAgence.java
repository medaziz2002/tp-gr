package org.anonbnr.web_services.grpc.agence.booking.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client_agence")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientAgence {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "client_id", nullable = false)
    private Long clientId;

    @Column(name = "agence_id", nullable = false)
    private Integer agenceId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;
}

