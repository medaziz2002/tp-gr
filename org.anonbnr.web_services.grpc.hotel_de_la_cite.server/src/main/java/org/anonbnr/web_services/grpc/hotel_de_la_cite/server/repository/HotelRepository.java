package org.anonbnr.web_services.grpc.hotel_de_la_cite.server.repository;

import org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {


}
