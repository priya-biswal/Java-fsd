package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OracleExample {

	public static void main(String[] args) throws InterruptedException {
		
		String path="C:\\Users\\Lenovo\\phase5\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", path);
		
		String url="https://profile.oracle.com/myprofile/account/create-account.jspx";

		WebDriver driver= new ChromeDriver();
							
		driver.get(url);	
		
		Thread.sleep(2000);
				
		WebElement email= driver.findElement(By.name("sView1:r1:0:email"));	
		email.sendKeys("Suvasreebiswal1234@gmail.com");
		
		Thread.sleep(2000);
		
		
		WebElement pass= driver.findElement(By.name("sView1:r1:0:password"));	
		pass.sendKeys("SuvA#1234567");
		
		Thread.sleep(2000);
		WebElement repass= driver.findElement(By.name("sView1:r1:0:retypePassword"));	
		repass.sendKeys("SuvA#1234567");
		Thread.sleep(2000);
		WebElement country= driver.findElement(By.name("sView1:r1:0:country"));	
		new Select(country).selectByIndex(34);
		Thread.sleep(2000);
		WebElement firstna= driver.findElement(By.name("sView1:r1:0:firstName"));	
		firstna.sendKeys("suvasree");
		Thread.sleep(2000);
		WebElement lastna= driver.findElement(By.name("sView1:r1:0:lastName"));
		lastna.sendKeys("biswal");	
		Thread.sleep(2000);
		WebElement job= driver.findElement(By.name("sView1:r1:0:jobTitle"));	
		job.sendKeys("devloper");
		Thread.sleep(2000);
		WebElement work= driver.findElement(By.name("sView1:r1:0:workPhone"));	
		work.sendKeys("9056456734");
		Thread.sleep(2000);
		WebElement company= driver.findElement(By.name("sView1:r1:0:companyName"));	
		company.sendKeys("mphasis");
		Thread.sleep(2000);
		WebElement add= driver.findElement(By.name("sView1:r1:0:address1::content"));	
		company.sendKeys("zjcjnkas");
		Thread.sleep(2000);
		
		WebElement city= driver.findElement(By.name("sView1:r1:0:city::content"));	
		company.sendKeys("Hyderabad");
		Thread.sleep(2000);
	
		WebElement state= driver.findElement(By.name("sView1:r1:0:state::content"));	
		new Select(state).selectByIndex(23);
		Thread.sleep(2000);
	
	}	
}
