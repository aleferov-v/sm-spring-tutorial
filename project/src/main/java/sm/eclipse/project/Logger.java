package sm.eclipse.project;

import org.springframework.stereotype.Component;

@Component
public class Logger implements Service {

	public String name() {
		return "Logger Service";
	}

	public void run() {
		System.out.println("Logger Service is ready");
	}

	public void stop() {
		System.out.println("Logger Service is stopped");
	}

}
