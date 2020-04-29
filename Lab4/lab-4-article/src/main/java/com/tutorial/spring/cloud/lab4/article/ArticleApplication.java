package com.tutorial.spring.cloud.lab4.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lab4ArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4ArticleApplication.class, args);
	}

}
