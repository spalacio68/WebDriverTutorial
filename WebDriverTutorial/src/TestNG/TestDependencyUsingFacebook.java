package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDependencyUsingFacebook {
	WebDriver driver;

	@Test
	public void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "openBrowser" })
	public void loginToFacebook() {

		driver.findElement(By.id("email")).sendKeys("sergio24");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).submit();
	}

}
