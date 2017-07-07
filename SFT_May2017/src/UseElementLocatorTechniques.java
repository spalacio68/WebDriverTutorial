import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseElementLocatorTechniques {

	WebDriver driver;

	public void invokeBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\Documents\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser(){
		driver.close();
	}
	
	public void elementLocatorTechniquesUsingAmazon(){
		try {
			invokeBrowser("http://www.amazon.com");
			driver.findElement(By.linkText("Your Amazon.com")).click();
			driver.navigate().back();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
			driver.findElement(By.className("nav-input")).click();
			driver.findElement(By.partialLinkText("Gift Cards &")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void elementLocatorTechniqueUsingFacebook(){
		try {
			invokeBrowser("http://www.facebook.com");
			driver.findElement(By.name("firstname")).sendKeys("Sergio");
			driver.findElement(By.cssSelector("input#email")).sendKeys("abc@mail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UseElementLocatorTechniques obj = new UseElementLocatorTechniques();
		//obj.elementLocatorTechniquesUsingAmazon();
		obj.elementLocatorTechniqueUsingFacebook();
	}

}
