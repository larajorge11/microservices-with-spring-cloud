package com.project.davor.eureka.DavorEurekaSpringEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DavorEurekaSpringEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DavorEurekaSpringEurekaServerApplication.class, args);
	}

}
