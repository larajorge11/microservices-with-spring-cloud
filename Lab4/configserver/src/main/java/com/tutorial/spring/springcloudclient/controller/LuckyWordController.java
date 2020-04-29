package com.tutorial.spring.springcloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LuckyWordController {

    @Value("${lucky-word}")
    private String luckyWord;

    public static void main(String[] args) {
        SpringApplication.run(LuckyWordController.class, args);
    }

    @GetMapping(value = "/lucky-word", produces = MediaType.TEXT_PLAIN_VALUE)
    public String showLuckyWord() {
        return "The lucky word is: " + luckyWord;
    }

}
