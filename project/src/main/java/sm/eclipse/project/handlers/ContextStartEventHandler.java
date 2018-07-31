package sm.eclipse.project.handlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Context started!");
	}

}
