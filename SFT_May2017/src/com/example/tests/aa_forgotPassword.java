package com.example.tests;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class aa_forgotPassword {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver","C:\\bin\\geckodriver.exe");
	driver = new FirefoxDriver();
    baseUrl = "https://anyaut.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void aaforgotPassword() throws Exception {
    driver.get(baseUrl + "/app/");
    System.out.println(driver.getCurrentUrl());
    driver.findElement(By.id("login_username")).clear();
    driver.findElement(By.id("login_username")).sendKeys("adf@asdfas.com");
    driver.findElement(By.id("login_password")).clear();
    driver.findElement(By.id("login_password")).sendKeys("12345");
    driver.findElement(By.name("submit")).click();
    //assertEquals("Invalid Email (or) Password", driver.findElement(By.cssSelector("span")).getText());
    //assertEquals("Invalid Email (or) Password", driver.findElement(By.xpath("//span[contains(.,'Invalid Email (or) Password ')]"));
    driver.findElement(By.id("forgot_password_link")).click();
    driver.findElement(By.id("forgot_email")).clear();
    driver.findElement(By.id("forgot_email")).sendKeys("adf@asdfas.com");
    driver.findElement(By.name("submit")).click();
    try {
      assertEquals("Email is not found !", driver.findElement(By.cssSelector("strong")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
