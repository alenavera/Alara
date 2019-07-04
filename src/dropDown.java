import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Users\\alena\\Documents\\Selenium dependencies\\drivers/chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://facebook.com");
			driver.manage().window().maximize();
			//WebElement drop=driver.findElement(By.id("year"));
		//   drop.click();
		   
			Select drpCountry = new Select(driver.findElement(By.id("year")));
			//drpCountry.selectByIndex(10);
		List<WebElement>total=drpCountry.getOptions();
		   System.out.println(total.size());
		    int size=total.size();
		    for (int i = 0; i <size ; i++) {
		    	//System.out.println(total.get(i).getText());
		    	String sValue = drpCountry.getOptions().get(i).getText();
				System.out.println(sValue);
			}
			
		   
		   
		   
		   
//		driver.get("http://spicejet.com");
//		driver.manage().window().maximize();
//
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//
//		List dropdown=driver.findElements(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//ul//li//a"));
//
//		for(int i=0;i<dropdown.size();i++){
//			
//		WebElement drp=(WebElement) dropdown.get(i);
//
//		
//		String cityName = drp.getText();
//
//		System.out.println("city from -- "+cityName);
//		}
	}

}
