package hu.atsoft.playground.didemo.services;

//@Service
//@Primary
//@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
	
	private GreetingRepository greetingRepository;
	
	public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayHello() {
		return greetingRepository.getGermanGreeting();
//		return "Primarer Grusdienst";
	}
}
