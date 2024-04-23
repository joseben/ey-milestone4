package com.example.ProductConsumer;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/helloc")
public class HelloConsumer {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping("/greet")
	public String getGreeting(){
		//eureka discovery instance 
		String message = restTemplate.getForObject("http://ProductConsumer/hellop/greet", String.class);

		//without eureka
		String message = restTemplate.getForObject("http://localhost:8085/helloc/greet",String.class);	
		
		return "I am hello consumer service FROM: Received: Product Details ";
	}
	
	
}







