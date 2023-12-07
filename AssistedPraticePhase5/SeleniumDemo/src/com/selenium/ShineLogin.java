package com.selenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ShineLogin {
		
		public static void main(String[] args) {
			
			String path="C:\\Users\\Lenovo\\phase5\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		
			System.setProperty("webdriver.chrome.driver", path);
			
			String url="https://www.shine.com/registration/";
			
			WebDriver driver= new ChromeDriver();
			
			driver.get(url);
			
			WebElement name=driver.findElement(By.id("id_name"));
			name.sendKeys("suvashree");
			
			WebElement email= driver.findElement(By.id("id_email"));	
			email.sendKeys("suvasree@gmail.com");
			

			WebElement phoneno =driver.findElement(By.id("id_cell_phone"));	
			phoneno.sendKeys("9129223457");
			
			
			WebElement continuebtn =driver.findElement(By.name("continue"));
			continuebtn.click();								
		
       }

	}
