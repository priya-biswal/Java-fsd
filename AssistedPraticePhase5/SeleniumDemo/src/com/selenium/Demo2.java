package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo2 {
public static void main(String arg[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\phase5\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	String url="https://www.google.com/";
	WebDriver driver=new ChromeDriver();
	driver.get(url);
}
}
