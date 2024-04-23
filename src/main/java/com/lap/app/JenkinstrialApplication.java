package com.lap.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinstrialApplication {

	public static void main(String[] args) {
		System.err.println("Jenkis test ::::::::::::::::::::::::::::::::::{{Test Success}}");
		SpringApplication.run(JenkinstrialApplication.class, args);
	}

}
