package com.tutorial.spring.cloud.lab4sentence.dao;

import com.tutorial.spring.cloud.lab4sentence.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("LAB-4-VERB")
public interface VerbClient {

    @GetMapping("/")
    Word getWord();
}
