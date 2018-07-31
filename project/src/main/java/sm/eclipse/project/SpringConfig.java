package sm.eclipse.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("sm.eclipse.project")
public class SpringConfig {

	@Bean(initMethod="init", destroyMethod="stop")
	@Scope("prototype")
	public App app() {
		return new App();
	}
	
	@Bean
	public Database database() {
		return new Database();
	}

	@Bean
	public Logger logger2() {
		return new Logger();
	}
}
