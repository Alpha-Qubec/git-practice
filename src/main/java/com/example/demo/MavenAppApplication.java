package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenAppApplication.class, args);
		System.out.println("Hi there");
	}

}
