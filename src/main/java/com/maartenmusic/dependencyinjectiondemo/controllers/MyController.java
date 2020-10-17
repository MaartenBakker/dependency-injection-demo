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

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }


}
