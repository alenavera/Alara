
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Test {
 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Users\\alena\\Documents\\Selenium dependencies\\drivers/chromedriver.exe");
		
 WebDriver driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 driver.get("http://www.inviul.com");
 
 
 Thread.sleep(3000);
 Thread.sleep(3000);
 
 //Javascript command
// JavascriptExecutor js = (JavascriptExecutor)driver;
 //js.executeScript("window.scrollTo(700, 2000)");
 //js.executeScript("window.scrollBy(1000, 0)");
 WebElement wb = driver.findElement(By.xpath("//*[@class='page-numbers'][text()='9']"));
 
 //Javascript command
 JavascriptExecutor js = (JavascriptExecutor)driver;
 js.executeScript("arguments[0].scrollIntoView();",wb);
 Thread.sleep(5000);
 
 
 
 
 
 
 
 
 
// JavascriptExecutor js=(JavascriptExecutor)driver;
// js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
// JavascriptExecutor js = (JavascriptExecutor)driver;
// js.executeScript("window.scrollTo(500, 600)");
 
// //Javascript command
// JavascriptExecutor js = (JavascriptExecutor)driver;
// js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
 	  
 Thread.sleep(5000);
 

// //Javascript command
// JavascriptExecutor js = (JavascriptExecutor)driver;
// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
// 	  
// Thread.sleep(5000);
// 
// driver.close();
// 
// driver.quit();
// driver.navigate().to("http://www.memotome.com/");
// 
// driver.manage().window().maximize();
// driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/font/center[2]/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr[2]/td/input")).click();
// //Enter username
// driver.findElement(By.xpath("html/body/form/table[3]/tbody/tr/td/p[1]/input")).sendKeys("avinashinviul");
// //Enter password
// driver.findElement(By.xpath("html/body/form/table[3]/tbody/tr/td/p[2]/input")).sendKeys("12345");
// //Click on Login Submit button
// driver.findElement(By.xpath("html/body/form/table[5]/tbody/tr[1]/td[1]/input")).click();
// //Click on Checkbox button
// WebElement ele = driver.findElement(By.name("DelId"));
// 
// //Before click
// 
// Boolean isSelectedBefore = ele.isSelected();
// Boolean isDisplayedBefore = ele.isDisplayed();
// Boolean isEnabledBefore = ele.isEnabled();
// 
// System.out.println("Before Click Selected- " +isSelectedBefore);
// System.out.println("Before Click Displayed- " +isDisplayedBefore);
// System.out.println("Before Click Enabled- " +isEnabledBefore);
// 
// //After Click
// ele.click();
// Boolean isSelectedAfter = ele.isSelected();
// Boolean isDisplayedAfter = ele.isDisplayed();
// Boolean isEnabledAfter = ele.isEnabled();
// 
// System.out.println("After Click Selected- " +isSelectedAfter);
// System.out.println("After Click Displayed- " +isDisplayedAfter);
// System.out.println("After Click Enabled- " +isEnabledAfter);
// 
// driver.close();
// driver.quit();
 }
}