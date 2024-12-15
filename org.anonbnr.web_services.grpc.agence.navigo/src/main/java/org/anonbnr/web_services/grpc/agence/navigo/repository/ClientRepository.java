package org.anonbnr.web_services.grpc.agence.navigo.repository;

import org.anonbnr.web_services.grpc.agence.navigo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {


    Optional<Client> findByNomAndPrenomAndNumeroTelephone(String nom, String prenom, String numeroTelephone);
}
