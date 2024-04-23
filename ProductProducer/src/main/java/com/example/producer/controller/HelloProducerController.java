package com.example.producer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellop")
public class HelloProducerController {
    @GetMapping("/greet")
    public String getMessage(){
        return "Product Details";
    }
}
