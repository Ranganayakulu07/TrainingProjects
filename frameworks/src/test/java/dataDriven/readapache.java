package dataDriven;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import jxl.read.biff.BiffException;

public class readapache {
	@Test
	  public void f() throws BiffException, IOException, InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://ksrtc.in/oprs-web/login/show.do");
		  FileInputStream file=new FileInputStream("D:\\Training\\loginDetails.xlsx");
		  Thread.sleep(3000);
		  XSSFWorkbook workBook=new XSSFWorkbook(file);
		  XSSFSheet sheet=workBook.getSheetAt(0);
		  int rowCount=sheet.getLastRowNum();
		  //int colCount=sheet.getRow(0).getLastCellNum();
		  Thread.sleep(3000);
		  
		  for (int i=1; i<rowCount; i++) {
			  
			  	  XSSFRow currentRow=sheet.getRow(i);
			  	  Thread.sleep(3000);
			  
				  String userName=currentRow.getCell(0).getStringCellValue();    //use OR .toString(); for cell values 
				  String password=currentRow.getCell(1).getStringCellValue();	 //use OR .toString(); for cell values
				  
				  //System.out.println(userName + password);
				  
				  driver.findElement(By.id("userName")).sendKeys(userName);
				  driver.findElement(By.id("password")).sendKeys(password);
				  driver.findElement(By.id("submitBtn")).click();
				
			  
		  }	  
	}
}