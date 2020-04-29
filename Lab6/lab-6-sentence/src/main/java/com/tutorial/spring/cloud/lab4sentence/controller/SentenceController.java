package com.tutorial.spring.cloud.lab4sentence.controller;

import com.tutorial.spring.cloud.lab4sentence.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @GetMapping("/sentence")
    public @ResponseBody String getSentence() {
        return sentenceService.buildSentence();
    }
}
