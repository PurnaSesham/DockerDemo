package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DockerDemoController {
	
	@GetMapping("/welcome")
	public String display() {
		
		return "Welcome to Docker Demo application";
		
	}

}
