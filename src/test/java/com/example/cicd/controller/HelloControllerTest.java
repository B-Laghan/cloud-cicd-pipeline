package com.example.cicd.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloControllerTest {

    private final HelloController helloController = new HelloController();

    @Test
    void testHomeEndpoint() {
        String response = helloController.home();

        assertEquals(
                "Cloud CI/CD Pipeline Application - Version 1.1",
                response);
    }

    @Test
    void testHealthEndpoint() {
        String response = helloController.health();

        assertEquals(
                "Application is running successfully",
                response);
    }
}