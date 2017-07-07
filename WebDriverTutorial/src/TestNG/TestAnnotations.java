package TestNG;

import org.testng.annotations.*;

public class TestAnnotations {
	
  @Test
  public void f1() {
	  System.out.println("Inside F1");
  }
  
  @Test
  public void f2(){
	  System.out.println("Inside F2");
	  
  }
  
  @BeforeTest
  public void beforeAnyTests(){
	  System.out.println("Before any Test");
	  
  }
  
  @AfterTest
  public void afterAllTests(){
	  System.out.println("After all tests");
	  
  }
  
  @BeforeMethod
  public void beforeEveryMethod(){
	  System.out.println("Before Every Method");
	  
  }
  
  @AfterMethod
  public void afterEveryMethod(){
	  System.out.println("After Every Method");
  }
  
  
  @BeforeClass
  public void beforeClass(){
	  System.out.println("Before Class");
  }
  
  @AfterClass
  public void afterClass(){
	  System.out.println("After class");
  }
}
