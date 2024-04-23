package com.example.eurekadem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class EurekademApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekademApplication.class, args);
	}

}
