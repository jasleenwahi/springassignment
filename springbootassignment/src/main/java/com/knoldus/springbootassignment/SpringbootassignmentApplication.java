package com.knoldus.springbootassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // this annotation is combination of component scan, enable autoconfiguration, configuration.
public class SpringbootassignmentApplication {

	public static void main(String[] args) {
		//this will automatically create the requored beans and boots up the application.
		SpringApplication.run(SpringbootassignmentApplication.class, args);
	}

}
