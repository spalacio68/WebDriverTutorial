package SeleniumTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTestCCases {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://learn-automation.com");

	}

}
