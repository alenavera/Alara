import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DataDrivenUsingExcelFile {
	public static void main(String[] args) { 
		 
        WebDriver driver = new ChromeDriver();
 
        driver.get("http://www.google.com");
 
        driver.manage().window().maximize();  
       
        WebElement searchbox = driver.findElement(By.name("q"));
 
 try {
    
  FileInputStream file = new FileInputStream(new File("C:\\testdata.xls")); 
 HSSFWorkbook workbook = new HSSFWorkbook(file);
 
  HSSF WorkSheet sheet = workbook.getSheetAt(0);
 
for (int i=1; i <= sheet.getLastRowNum(); i++){
 
        String keyword = sheet.getRow(i).getCell(0).getStringCellValue();
 
        searchbox.sendKeys(keyword);
 
        searchbox.submit();       
  
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
}
 
  workbook.close();
  file.close();
 
 } catch (FileNotFoundException fnfe) {
  fnfe.printStackTrace();
 } catch (IOException ioe) {
  ioe.printStackTrace();
 }
 }
}

}
