package com.maartenmusic.dependencyinjectiondemo.controllers;

import com.maartenmusic.dependencyinjectiondemo.services.GreetingService;
import org.springframework.stereotype.Controller;

import java.awt.*;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public String sayHello() {
        System.out.println("Yo menson");

        return "Hello World";
    }

}
