package sm.eclipse.project;

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
