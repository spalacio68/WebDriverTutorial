package com.example.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class DummyClass {
	WebDriver driver;
	
	@BeforeTest
	public void methodBefore(){
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\Documents\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("http://www.yahoo.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	@Test
	public void methodTest(){
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.contains("Yahoo"));
		System.out.println("Page Title is " + pageTitle);
				
	}

	@Test
	public void methodTest2(){
		//String pageTitle = driver.getTitle();
		//Assert.assertTrue(pageTitle.contains("Yahoo"));
		System.out.println("Method2 completed");
				
	}
	
	@AfterTest
	public void methodAfter(){
		System.out.println("Quit Browser");
		driver.close();
	}
	
}
