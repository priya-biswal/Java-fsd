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
public class GfgSignUpTest {
@Test
public void gfgSignUpTest() {
wd.get("https://www.google.com");
wd.get("https://www.geeksforgeeks.org");
wd.manage().window().maximize();
//wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
// WebElement textFieldRef = wd.findElement(By.name("q"));
//textFieldRef.sendKeys("What is testing");
//WebElement buttonRef = wd.findElement(By.name("btnK"));
//buttonRef.click();
WebElement emailIdRef=wd.findElement(By.id("email"));
WebElement passwordRef=wd.findElement(By.id("reg-password"));
WebElement Institute=wd.findElement(By.id("organization"));
emailIdRef.sendKeys("susarlasaveri@gmail.com");
passwordRef.sendKeys("Saveri@123");
Institute.sendKeys("PES University");
WebElement ButtonRef=wd.findElement(By.className("btn btn-greensignup-button"));
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
