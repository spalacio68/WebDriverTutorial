package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAssertions {

	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.gmail.com");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testEquality() {
		Assert.assertEquals(true, isEqual(10, 10));
		System.out.println("testEquality returned true");
	}

	@Test
	public boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void getTitle() {
		try {
			String title = driver.getTitle();
			System.out.println("The title is: " + title);
			Assert.assertEquals(title, "Gmail");
			System.out.println("Assert getTitle passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void AfterTest(){
		//driver.close();
	}
}
