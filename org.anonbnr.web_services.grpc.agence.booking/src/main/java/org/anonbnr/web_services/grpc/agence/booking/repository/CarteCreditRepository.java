package org.anonbnr.web_services.grpc.agence.booking.repository;


import org.anonbnr.web_services.grpc.agence.booking.entity.CarteCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteCreditRepository extends JpaRepository<CarteCredit, Long> {


}
