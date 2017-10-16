package com.example.lab4noun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class WordController {

    @Value("${words}")
    String words;

    public @ResponseBody String getWords(){
        String[] listOfWords = words.split(",");
        return Arrays.stream(listOfWords).findAny().get();
    }
}
