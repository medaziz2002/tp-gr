package org.anonbnr.web_services.grpc.agence.navigo.repository;


import org.anonbnr.web_services.grpc.agence.navigo.entity.ClientAgence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClientAgenceRepository extends JpaRepository<ClientAgence, Integer> {

    boolean existsByUsername(String username);

    Optional<ClientAgence> findByUsernameAndAgenceId(String username, int agenceId);


}
