package sm.eclipse.project.advice;

public class Logging {
	public void beforeAdvice() {
		System.out.println("Before Advice");
	}

	public void afterAdvice() {
		System.out.println("After Advice");
	}

	public void afterReturningAdvice(Object user) {
		System.out.println("After Advice Executed Successfully ... Returning: " + user.toString());
	}

	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception when executing the advice: " + ex.toString());
	}
}