package sm.eclipse.project.handlers;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import sm.eclipse.project.events.CustomEvent;

@Component
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event);
	}

}
