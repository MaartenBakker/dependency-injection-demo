package com.maartenmusic.dependencyinjectiondemo;

import com.maartenmusic.dependencyinjectiondemo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(SetterInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(I18nController.class).sayHello());
		

	}

}
