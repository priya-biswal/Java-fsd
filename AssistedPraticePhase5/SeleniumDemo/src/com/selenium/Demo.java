package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
				String path="C:\\Users\\Lenovo\\phase5\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
			
				System.setProperty("webdriver.chrome.driver", path);
				
				String url="https://www.google.com/";
				
				WebDriver driver= new ChromeDriver();
				
				driver.get(url);
				
				driver.close();
				
				System.out.println("Driver Working Perfectly");
			
	}

}