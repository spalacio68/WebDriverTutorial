package SeleniumTutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowserCommands {
	
	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://www.yahoo.com");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser(){
		driver.close();
	}

	public static void main(String[] args) {
		try {
			TestBrowserCommands myObj = new TestBrowserCommands();
			myObj.invokeBrowser();
			Thread.sleep(2000);
			myObj.closeBrowser();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
