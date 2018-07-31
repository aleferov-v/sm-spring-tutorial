package sm.eclipse.project.handlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedEventHandler implements ApplicationListener<ContextClosedEvent> {

	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("Context closed!");
	}

}
