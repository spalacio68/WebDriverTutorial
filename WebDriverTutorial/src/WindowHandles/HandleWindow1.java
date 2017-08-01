package WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");

		String parent = driver.getWindowHandle();

		System.out.println("Parent window id is " + parent);
		
		System.out.println("Parent window title is " + driver.getTitle());

		driver.findElement(By.xpath("//a[contains(@href, 'http://www.google.com')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();

		int count = allWindows.size();

		System.out.println("Total window " + count);

		for (String child : allWindows) {
			
			System.out.println("Window id is:  " + child);

			if (!parent.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);
				
				driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
				
				System.out.println("Child window title is " + driver.getTitle());
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		System.out.println("Parent window title is " + driver.getTitle());
		
		driver.close();

	}

}
