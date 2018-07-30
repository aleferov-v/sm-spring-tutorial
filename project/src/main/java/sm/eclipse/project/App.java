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
	
	@Autowired
	public App(@Qualifier("logger") Service mainService) {
		this.mainService = mainService;
		System.out.println("Construct App with main service: " + mainService);
	}
	
	@Autowired
	public App(Service[] services) {
		this.services = services;
		System.out.println("Construct App with services: " + Arrays.toString(services));
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroying...");
	}
}
