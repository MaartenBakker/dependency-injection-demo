package com.maartenmusic.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class PrimarySpanishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
