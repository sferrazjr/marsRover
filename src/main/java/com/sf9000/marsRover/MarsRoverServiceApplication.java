package com.sf9000.marsRover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class MarsRoverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsRoverServiceApplication.class, args);
	}
}
