package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Convenience annotation that combines three other annotations:
 * 1. EnableAutoConfiguration
 * 2. Configuration
 * 3. ComponentScan
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
