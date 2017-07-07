package SeleniumTutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestElementLocatorTechniques {
	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void elementLocatorTechniquesAmazon() {
		try {
			invokeBrowser();

			driver.get("http://www.amazon.com");
			driver.findElement(By.linkText("Your Amazon.com")).click();
			driver.navigate().back();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
			driver.findElement(By.className("nav-input")).click();
			//driver.navigate().back();
			//driver.findElement(By.partialLinkText("Customer")).click();
			//driver.navigate().back();
			//Thread.sleep(3000);
			//driver.findElement(By.xpath(".//*[text()='Sign in']")).click();
			driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("sergio@abc.com");
			driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("adfadf");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void elementLocatorTechniquesFacebook(){
		try {
			invokeBrowser();
			driver.get("http://www.facebook.com");
			driver.findElement(By.name("firstname")).sendKeys("Sergio");
			driver.findElement(By.cssSelector("input#email")).sendKeys("abc@sdf.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser(){
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		TestElementLocatorTechniques myObj = new TestElementLocatorTechniques();
		myObj.elementLocatorTechniquesAmazon();
		//myObj.elementLocatorTechniquesFacebook();
		//myObj.closeBrowser();

	}

}
