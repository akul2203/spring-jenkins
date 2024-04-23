package com.lap.app;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger; // Import Logger class
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinstrialApplication {

    // Declare logger instance
    private static final Logger logger = LoggerFactory.getLogger(JenkinstrialApplication.class);

    public static void main(String[] args) {
        System.err.println("Jenkins test ::::::::::::::::::::::::::::::::::{{Test Success}}");
        logger.info("Jenkins test ::::::::::::::::::::::::::::::::::{{Test Success}}");
        // Log a message at INFO level
        logger.info("Starting JenkinstrialApplication...");
        logger.info("test Log -------------------------------------Starting JenkinstrialApplication...");

        SpringApplication.run(JenkinstrialApplication.class, args);
    }
}
