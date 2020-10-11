package com.maartenmusic.dependencyinjectiondemo.controllers;

import com.maartenmusic.dependencyinjectiondemo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreetingService() {
        controller.getGreeting();
    }
}