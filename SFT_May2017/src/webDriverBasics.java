import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverBasics {
	WebDriver myD;
	String baseUrl;
	
	@Before
	public void beforeMyTest() {
		System.setProperty("webdriver.gecko.driver","C:\\bin\\geckodriver.exe");
		FirefoxDriver myD = new FirefoxDriver();
	    baseUrl = "https://www.amazon.com/";
	    myD.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
