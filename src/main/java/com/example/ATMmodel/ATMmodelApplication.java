package com.example.ATMmodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ConfigurationPropertiesScan("com.example")
@EnableJpaRepositories
public class ATMmodelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ATMmodelApplication.class, args);
	}

}
