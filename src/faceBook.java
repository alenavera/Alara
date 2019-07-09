import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Users\\alena\\Documents\\Selenium dependencies\\drivers/chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://facebook.com");
			driver.manage().window().maximize();
			//System.out.println(driver.getTitle().contains("Facebook - Log In or Sign Up"));
			
			               // driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
	WebElement wb=driver.findElement(By.xpath("//div[@id='pageFooter']//div/ul/li[31]"));	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView();",wb);
	 Thread.sleep(5000);
	 
			
			
//			
//			driver.findElement(By.id("email")).sendKeys("Gulshan");
//			Thread.sleep(2000);
//			System.out.println(driver.findElement(By.xpath("//input[@class='inputtext' and @name='email']/preceding::input")).getText());
//			driver.findElement(By.xpath("//input[@class='inputtext' and @name='email']/following::input")).sendKeys("123456");
//			
//		    driver.findElement(By.xpath("//input[@type='submit']")).click();
//		 String k=   driver.findElement(By.xpath("//div[text()='Please try again later']")).getText();
//		 if(k.equalsIgnoreCase("Please try again later")) {
//			 System.out.println("correct");
//		 }else {
//			 System.out.println("bye");
//		 }
		   
	}

}
