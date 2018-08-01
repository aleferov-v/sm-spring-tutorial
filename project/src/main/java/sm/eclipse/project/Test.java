package sm.eclipse.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		User user = (User) context.getBean("user");	
	    user.getName();
	    user.printThrowException();
		
	    context.close();
	}
}
