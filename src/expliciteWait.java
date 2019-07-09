

	import java.util.concurrent.TimeUnit;
	 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;
	 
	public class expliciteWait {
	  @Test
	  public void locatorDemo() throws Exception {
	   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   //Implicit Wait
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   driver.get("http://www.inviul.com");
	   
	   //Explicit Wait Declaration
	   WebDriverWait wait = new WebDriverWait(driver, 20);
	 
	   wait.until(ExpectedConditions.titleContains("Selenium"));
	   
	   System.out.println("Explicit wait result- " +wait);
	   
	   driver.close();
	   
	   driver.quit();
	  
	  
	}
}
