package com.ma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstSpringProjectApplication {

	public static void main(String[] args) {
		System.out.println("************Inside Main method******");
		SpringApplication.run(MyFirstSpringProjectApplication.class, args);
	}
	// http://localhost:8080/message
	@GetMapping("/message")
	public String printMessage() {
		return "My First Spring Project";
	}
}
