package sm.eclipse.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		App app = context.getBean("app", App.class);
		Database database = context.getBean("database", Database.class);
		Logger logger = context.getBean("logger", Logger.class);
		Logger logger2 = context.getBean("logger2", Logger.class);
		System.out.println("database: " + database);
		System.out.println("logger: " + logger);
		System.out.println("logger2: " + logger2);
		
		((AnnotationConfigApplicationContext) context).close();
	}
}
