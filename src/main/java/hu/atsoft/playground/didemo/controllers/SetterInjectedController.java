package hu.atsoft.playground.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import hu.atsoft.playground.didemo.services.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}
	
	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
