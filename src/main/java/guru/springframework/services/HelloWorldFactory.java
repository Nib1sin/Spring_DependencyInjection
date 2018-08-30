package guru.springframework.services;

public class HelloWorldFactory {

	public HelloWorldService createHelloWorldService(String language) {
		
		HelloWorldService service = null;
		
		switch(language) {
		
		case "en":
			service = new HelloWorldServiceEnglishImpl();
			break;
			
		case "fr":
			service = new HelloWorldServiceFrenchImpl();
			break;
			
		case "gr":
			service = new HelloWorldServiceGermanImpl();
			break;
			
		case "it":
			service = new HelloWorldServiceItalianoImpl();
			break;
			
		case "pl":
			service = new HelloWorldServicePolandImpl();
			break;
			
		case "rs":
			service = new HelloWorldServiceRussianImpl();
			break;
			
		case "es":	
			service = new HelloWorldServiceSpanishImpl();
			break;
			
		}
		
		return
				service;
		
		
	}
}





















