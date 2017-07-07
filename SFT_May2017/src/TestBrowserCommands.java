import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowserCommands {

	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\Documents\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("http://www.yatra.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeBrower(){
		driver.close();
	}
	
	
	public static void main(String[] args) {
		TestBrowserCommands myObj = new TestBrowserCommands();
		myObj.invokeBrowser();
		myObj.closeBrower();

	}

}
