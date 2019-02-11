package hu.atsoft.playground.didemo.services;

//@Service
//@Profile("es")
//@Primary
public class PrimarySpanishGreetingService implements GreetingService {
	
	private GreetingRepository greetingRepository;
	
	public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayHello() {
		return greetingRepository.getSpanishGreeting();
//		return "Servicio de Saludo Primario";
	}
}
