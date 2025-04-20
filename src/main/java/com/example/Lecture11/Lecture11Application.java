package com.example.Lecture11;

import com.example.Lecture11.component.MyComponent;
import com.example.Lecture11.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lecture11Application implements CommandLineRunner {

	@Autowired
	private MyComponent myComponent;

	@Autowired
	private MyService myService;

	@Autowired
	private String appName;

	public static void main(String[] args) {
		SpringApplication.run(Lecture11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myComponent.sayHello();
		System.out.println(myService.getMessage());
		System.out.println("App Name: " + appName);
	}
}
