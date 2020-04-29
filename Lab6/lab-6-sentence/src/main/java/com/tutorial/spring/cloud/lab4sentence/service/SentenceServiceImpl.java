package com.tutorial.spring.cloud.lab4sentence.service;

import com.tutorial.spring.cloud.lab4sentence.dao.VerbClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    private final VerbClient verbClient;

    @Autowired
    public SentenceServiceImpl(VerbClient verbClient) {
        this.verbClient = verbClient;
    }

    @Override
    public String buildSentence() {
        String sentence = "There was a problem assembling the sentence!";
        sentence =
                String.format("%s.",
                        verbClient.getWord().getString());
        return sentence;
    }
}
