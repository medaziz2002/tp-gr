package org.anonbnr.web_services.grpc.agence.navigo.repository;

import org.anonbnr.web_services.grpc.agence.navigo.entity.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OffreRepository extends JpaRepository<Offre,Long> {

}
