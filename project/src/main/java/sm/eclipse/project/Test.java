package sm.eclipse.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		App app = context.getBean("app", App.class);
		App app1 = context.getBean("app", App.class);
		App app2 = context.getBean("app", App.class);
		App app3 = context.getBean("app", App.class);
		
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
