package com.project.davor.eureka.DavorEurekaSpringConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DavorEurekaSpringConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DavorEurekaSpringConfigApplication.class, args);
	}

}
