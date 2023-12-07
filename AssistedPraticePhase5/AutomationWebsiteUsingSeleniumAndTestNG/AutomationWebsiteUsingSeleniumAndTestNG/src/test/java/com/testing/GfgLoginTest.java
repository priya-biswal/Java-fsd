package com.testing;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class GfgLoginTest {
@Test
public void gfgLoginTest() {
wd.get("https://www.google.com");
wd.get("https://www.geeksforgeeks.org");
wd.manage().window().maximize();
WebElement emailIdRef=wd.findElement(By.id("suvashree"));
WebElement passwordRef=wd.findElement(By.id("password"));
emailIdRef.sendKeys("Suvashree@gmail.com");
passwordRef.sendKeys("Suva@123");
WebElement ButtonRef=wd.findElement(By.className("btn btn-green signin-button"));
ButtonRef.sendKeys(Keys.ENTER);
try {
Thread.sleep(5000);
} catch (Exception e) {
// TODO: handle exception
}
wd.navigate().back();
}
WebDriver wd;
@BeforeMethod
public void beforeMethod() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
wd=new ChromeDriver();
}
@AfterMethod
public void afterMethod() {
}
}
