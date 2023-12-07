package com.selenium;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Timeouts {
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\phase5\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//scripted wait
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			
			//page loadtimeout
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
			
			
			//explicit wait
			
			WebDriverWait explicitwait=new WebDriverWait(driver, 10);
			explicitwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));
			
			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys("text@xyz.com");
			
			//driver.close();
		}

	}

