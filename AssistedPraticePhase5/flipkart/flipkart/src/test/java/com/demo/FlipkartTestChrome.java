package com.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartTestChrome {
 WebDriver driver;
 @BeforeClass
 public void ChromeBrowser() {
 // Set the path to your ChromeDriver executable
 System.out.println("Before Test Starts");

System.setProperty("webdriver.chrome.driver","C:\\testingphase5\\chromedriverwin64\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 }
 @Test
 public void TestFlipkart() throws InterruptedException {

 driver.get("https://www.flipkart.com/");

 // Handle pop-up if present
 Thread.sleep(2000);
 driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();

 // Search for a product
 Thread.sleep(2000);
 driver.findElement(By.name("q")).sendKeys("iPhone 13");
 driver.findElement(By.cssSelector("#container > div > div.q8WwEU > div > div"
> div > div > div.css-1dbjc4n.r-13awgt0 > div > div.css-1dbjc4n.r-13awgt0.r1iqfa7g.r-60vfwk > div > div._2nl6Ch > div._2NhoPJ > header > div._3ZqtNW >
div._3NorZ0._3jeYYh > form > div > button > svg")).click();
 // Wait for the product list to load
 Thread.sleep(2000); // Adjust the wait time as needed


 JavascriptExecutor js = (JavascriptExecutor) driver;


 // Use JavaScript to check image visibility
 Thread.sleep(3000);
 WebElement lastProductImage = driver.findElement(By.cssSelector("div._1AtVbE
img:last-child"));
 boolean isImageVisible = (boolean) ((JavascriptExecutor) driver)
 .executeScript("return arguments[0].complete && typeof
arguments[0].naturalWidth !== 'undefined' && arguments[0].naturalWidth > 0",
lastProductImage);
 Thread.sleep(2000);
 assert isImageVisible : "Image is not visible";

 // Check if the page has a scroll feature
 // Perform scrolling down using JavaScript
 Thread.sleep(3000);
 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

 // Check if the page has a scroll feature
 // Perform scrolling up using JavaScript
 Thread.sleep(5000);
 js.executeScript("window.scrollTo(document.body.scrollHeight,0)");



 // Check if images are loaded and visible till the screen height only

driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/d
iv/div/div/a/div[1]/div[1]/div/div/img")).click();
 Thread.sleep(3000);
 // Check if the page has a scroll feature
 // Perform scrolling using JavaScript
 Thread.sleep(2000);
 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


 }
 @AfterClass
 public void tearDown() throws InterruptedException {
 Thread.sleep(2000);
 driver.quit();
 System.out.println("After Tests");

}}