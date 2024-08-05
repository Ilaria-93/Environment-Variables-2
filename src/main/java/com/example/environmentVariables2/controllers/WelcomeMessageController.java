package com.example.environmentVariables2.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessageController {

    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/welcome")
    private String welcome() {
        return welcomeMsg;
    }
}
