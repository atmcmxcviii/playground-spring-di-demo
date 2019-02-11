package hu.atsoft.playground.didemo.services;

//@Service
//@Primary
//@Profile({ "en", "default" })
public class PrimaryGreetingService implements GreetingService {
	
	private GreetingRepository greetingRepository;
	
	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayHello() {
		return greetingRepository.getEnglishGreeting();
//		return "Hello from the primary greeting service";
	}
}
