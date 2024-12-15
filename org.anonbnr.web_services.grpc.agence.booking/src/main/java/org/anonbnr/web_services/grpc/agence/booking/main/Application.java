package org.anonbnr.web_services.grpc.agence.booking.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"org.anonbnr.web_services.grpc.agence.booking.services",
		"org.anonbnr.web_services.grpc.agence.booking.cli",
		"org.anonbnr.web_services.grpc.agence.booking.repository",
		"org.anonbnr.web_services.grpc.agence.booking.entity"
})
@EntityScan(basePackages = {
		"org.anonbnr.web_services.grpc.agence.booking.entity"
})
//EnableJpaRepositories annotation to specify the package for JPA repositories
@EnableJpaRepositories(basePackages = {
		"org.anonbnr.web_services.grpc.agence.booking.repository"
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}