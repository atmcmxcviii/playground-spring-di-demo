package hu.atsoft.playground.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		System.out.println("Hello from MyController!!!");
		return "Hello from MyController!!!";
	}
}
