package sm.eclipse.project;

import java.util.Arrays;

public class App {
	
	private Service mainService;
	private Service[] services;
	
	public App(Service mainService) {
		this.mainService = mainService;
		System.out.println("Construct App with main service: " + mainService);
	}

	public App(Service[] services) {
		this.services = services;
		System.out.println("Construct App with services: " + Arrays.toString(services));
	}
	
	public Service getMainService() {
		return mainService;
	}
	
	public Service[] getServices() {
		return services;
	}
		
}
