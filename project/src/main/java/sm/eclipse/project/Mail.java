package sm.eclipse.project;

import org.springframework.stereotype.Component;

@Component
public class Mail implements Service {

	public String name() {
		return "Mail Service";
	}

	public void run() {
		System.out.println("Mail Service is ready");
	}

	public void stop() {
		System.out.println("Mail Service is stopped");
	}

}
