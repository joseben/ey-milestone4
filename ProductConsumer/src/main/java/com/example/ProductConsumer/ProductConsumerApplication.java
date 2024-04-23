package com.example.ProductConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient

public class ProductConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductConsumerApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	  return new RestTemplate();
	}

}