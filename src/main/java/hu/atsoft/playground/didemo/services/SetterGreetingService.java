package hu.atsoft.playground.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
	@Override
	public String sayHello() {
		return "Hello - I was injected by the setter";
	}
}
