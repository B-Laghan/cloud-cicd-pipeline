package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Cloud CI/CD Pipeline Application - Version 1.1";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running successfully";
    }
}