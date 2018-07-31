package sm.eclipse.project;

import java.beans.ConstructorProperties;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class App {
	
	private Service mainService;
	private Service[] services;
	
	public App() {
		
	}
	
	public App(Service mainService) {
		this.mainService = mainService;
		System.out.println("Construct App with main service: " + mainService);
	}
	
	public App(Service[] services) {
		this.services = services;
		System.out.println("Construct App with services: " + Arrays.toString(services));
	}
	
	@Autowired
	@Qualifier("database")
	public void setDatabase(Service mainService) {
		System.out.println("Set main service: " + mainService.getClass().getSimpleName());
		this.mainService = mainService;
	}
}
