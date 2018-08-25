package br.com.sapri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SapriPersistenceAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SapriPersistenceAdminApplication.class, args);
	}
}
