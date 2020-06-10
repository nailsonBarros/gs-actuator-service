package com.example.actuatorservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.actuatorservice.model.Greeting;

@RestController
@RequestMapping("/")
public class GreetingController {
	
	@GetMapping("/hello-world")
	public ResponseEntity<Greeting> helloWorld(){
		return new ResponseEntity<>(new Greeting(1L,"Hello, Stranger"),HttpStatus.OK);
	}
	
}
