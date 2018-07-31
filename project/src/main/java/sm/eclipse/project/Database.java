package sm.eclipse.project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("base")
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
