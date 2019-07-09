import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calindar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Users\\alena\\Documents\\Selenium dependencies\\drivers/chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
		  // driver.get("http://facebook.com");
			driver.manage().window().maximize();
			Calendar calendar=Calendar.getInstance();
			Date date=calendar.getTime();
			System.out.println(date);
			
			System.out.println("+++++++++");
			Date dat= new Date();
			SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd hh:mm");
			String day=dateformat.format(dat);
			System.out.println(day);
}
}