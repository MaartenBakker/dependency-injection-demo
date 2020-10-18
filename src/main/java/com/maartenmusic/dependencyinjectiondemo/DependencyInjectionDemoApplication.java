package com.maartenmusic.dependencyinjectiondemo;

import com.maartenmusic.dependencyinjectiondemo.controllers.*;
import com.maartenmusic.dependencyinjectiondemo.examplebeans.FakeDataSource;
import com.maartenmusic.dependencyinjectiondemo.examplebeans.FakeJmsBroker;
import com.maartenmusic.dependencyinjectiondemo.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println(controller.sayGreeting());

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());

		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUser());
		System.out.println(fakeJmsBroker.getPassword());
		System.out.println(fakeJmsBroker.getUrl());

	}

}
