package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Application Class
@EnableAutoConfiguration
@SpringBootApplication
public class InstituteApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstituteApplication.class, args);
	}

}
