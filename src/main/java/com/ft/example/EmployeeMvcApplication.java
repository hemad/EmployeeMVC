package com.ft.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.ft.example"})
@EnableAutoConfiguration
public class EmployeeMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMvcApplication.class, args);
	}

}
