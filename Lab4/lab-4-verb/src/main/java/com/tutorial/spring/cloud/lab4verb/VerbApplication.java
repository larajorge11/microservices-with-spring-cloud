package com.tutorial.spring.cloud.lab4verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class VerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerbApplication.class, args);
	}

}
