package sm.eclipse.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sm.eclipse.project.events.CustomEventPublisher;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		CustomEventPublisher publisher = context.getBean("customEventPublisher", CustomEventPublisher.class);
		publisher.publish();
		
		((ClassPathXmlApplicationContext) context).close();
		
	}
}
