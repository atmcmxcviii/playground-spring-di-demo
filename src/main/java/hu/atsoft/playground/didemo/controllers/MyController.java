package hu.atsoft.playground.didemo.controllers;

import org.springframework.stereotype.Controller;

import hu.atsoft.playground.didemo.services.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello from MyController!!!");
		return "Hello from MyController!!!" + " " + greetingService.sayHello();
	}
}
