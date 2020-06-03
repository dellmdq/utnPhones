package edu.utnPhone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@SpringBootApplication
@EnableAsync
@EnableScheduling
@EnableJpaRepositories
@EntityScan

public class UtnPhoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtnPhoneApplication.class, args);
	}

}
