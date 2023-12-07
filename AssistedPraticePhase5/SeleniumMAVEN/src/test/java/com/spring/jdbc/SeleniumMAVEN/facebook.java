package com.spring.jdbc.SeleniumMAVEN;

import org.testng.annotations.Test;
	  import org.testng.annotations.Test;
	  import org.testng.annotations.BeforeMethod;
	  import org.openqa.selenium.By;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.WebElement;
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import org.testng.annotations.AfterMethod;

	  public class facebook{
	  	
	  	WebDriver driver=null;
	    @Test
	    public void welcome() {
	  	  
	  	  System.out.println("Welcome to Automated Testing");	  	  
	    }
	    @BeforeMethod
	    public void beforeMethod() {
	  	  System.out.println("Before Method");
	  	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\phase5\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
	  	  driver =new ChromeDriver();
	  	  driver.get("https://www.facebook.com/");
	  	  
	  	  WebElement email=driver.findElement(By.id("email"));
	  	  email.sendKeys("suva@gmail.com");
	  	  
	  	  WebElement pass=driver.findElement(By.id("pass"));
	  	  pass.sendKeys("suva@123");	  	   	  
	  	  
	    }

	    @AfterMethod
	    public void afterMethod() {
	  	  
	  	  System.out.println("After Method");
	  	  driver.close();
	  	  driver=null;
	  	  
	    }

  }

