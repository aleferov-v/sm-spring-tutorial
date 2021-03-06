package sm.eclipse.project;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class App {
	
	@Autowired
	@Qualifier("base")
	private Service mainService;
	
	@Autowired
	private Service[] services;
	
	public App() {
		System.out.println("App() constructor");
	}
	
	public App(Service mainService) {
		this.mainService = mainService;
		System.out.println("Construct App with main service: " + mainService);
	}
	
	public App(Service[] services) {
		this.services = services;
		System.out.println("Construct App with services: " + Arrays.toString(services));
	}
	
	public void setMainService(Service mainService) {
		System.out.println("Set main service: " + mainService.getClass().getSimpleName());
		this.mainService = mainService;
	}
	
	public void init() {
		System.err.println("init");
	}
	
	public void stop() {
		System.out.println("destory");
	}
}
