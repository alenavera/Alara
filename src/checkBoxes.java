

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class checkBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Users\\alena\\Documents\\Selenium dependencies\\drivers/chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		//driver.findElement(By.xpath("//input[@value='2']")).click();
		List <WebElement> k=driver.findElements(By.xpath("//input[@name='sex']"));
		int size=k.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {

			 if(k.get(i).getAttribute("value").equalsIgnoreCase("-1")) {
		
				 k.get(i).click();
			}
			
		}
}}
