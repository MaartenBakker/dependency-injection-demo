package com.maartenmusic.dependencyinjectiondemo;

import com.maartenmusic.dependencyinjectiondemo.controllers.*;
import com.maartenmusic.dependencyinjectiondemo.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		System.out.println(ctx.getBean(MyController.class).sayGreeting());
	}

}
