package sm.eclipse.project;

/**
 * Hello world!
 *
 */
public class App {
	
	private static int count = 0;
	private String id;
	
	public App() {
		System.out.println(count++);
	}
	
	public void init() {
		System.out.println("The App has been init...");
	}
	
	public void close() {
		System.out.println("The App closed.");
	}
	
	public App(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
}
