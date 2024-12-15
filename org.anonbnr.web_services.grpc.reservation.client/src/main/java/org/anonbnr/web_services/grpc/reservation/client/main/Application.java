package org.anonbnr.web_services.grpc.reservation.client.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"org.anonbnr.web_services.grpc.reservation.client.services",
		"org.anonbnr.web_services.grpc.reservation.client.cli"
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
