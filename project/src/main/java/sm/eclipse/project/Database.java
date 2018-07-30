package sm.eclipse.project;

public class Database implements Service {

	public String name() {
		return "Databse Service";
	}

	public void run() {
		System.out.println("Database Service is running");
	}

	public void stop() {
		System.out.println("Database Service is stopped");
	}

}
