package com.lt.professor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProfessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfessorApplication.class, args);
	}

}
