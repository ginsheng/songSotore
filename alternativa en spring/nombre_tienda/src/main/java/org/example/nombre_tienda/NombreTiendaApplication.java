package org.example.nombre_tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class NombreTiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NombreTiendaApplication.class, args);
	}

}
