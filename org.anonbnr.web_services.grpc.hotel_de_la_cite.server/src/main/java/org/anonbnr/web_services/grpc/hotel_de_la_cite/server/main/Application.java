package org.anonbnr.web_services.grpc.hotel_de_la_cite.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model",
		"org.anonbnr.web_services.grpc.hotel_de_la_cite.server.repository",
		"org.anonbnr.web_services.grpc.hotel_de_la_cite.server.services",

})
@EntityScan(basePackages = {
		"org.anonbnr.web_services.grpc.hotel_de_la_cite.server.model"
})
//EnableJpaRepositories annotation to specify the package for JPA repositories
@EnableJpaRepositories(basePackages = {
		"org.anonbnr.web_services.grpc.hotel_de_la_cite.server.repository"
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}