package com.coderscampus.Assignment10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment10Application {

	private static final Logger logger = LoggerFactory.getLogger(Assignment10Application.class);

	public static void main(String[] args) {
		
		logger.info("Starting meal planner application...");
		
		SpringApplication.run(Assignment10Application.class, args);
		
		logger.info("Meal planner application started succesfully");
		
	}

}
