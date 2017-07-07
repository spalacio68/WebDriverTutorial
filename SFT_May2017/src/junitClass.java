import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junitClass {
	//JUnit - Java Framework created to assist in Unit Testing
	
	// Annotations ... pre-defined terms.
	
	@Before
	public void beforeMyTest() {
		//Before test, do a setup
		System.out.println("Before the test.");
	}
	
	@Test
	public void myTest() {
		//Before test, do a setup
		System.out.println("Perform test 1.");
	}
	
	@Test
	public void myTest2() {
		//Before test, do a setup
		System.out.println("Perform test 2.");
	}

	@After
	public void afterMyTest() {
		//Before test, do a setup
		System.out.println("After test.");
	}
}
