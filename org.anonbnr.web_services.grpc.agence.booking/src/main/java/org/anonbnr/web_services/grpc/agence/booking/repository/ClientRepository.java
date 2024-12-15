package org.anonbnr.web_services.grpc.agence.booking.repository;

import org.anonbnr.web_services.grpc.agence.booking.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {


    Optional<Client> findByNomAndPrenomAndNumeroTelephone(String nom, String prenom, String numeroTelephone);
}
