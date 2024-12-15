package org.anonbnr.web_services.grpc.agence.booking.repository;

import org.anonbnr.web_services.grpc.agence.booking.entity.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OffreRepository extends JpaRepository<Offre,Long> {

}
