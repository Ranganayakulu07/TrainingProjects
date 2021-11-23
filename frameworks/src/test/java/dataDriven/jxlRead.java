package dataDriven;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class jxlRead {
  @Test
  public void f() throws BiffException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("https://ksrtc.in/oprs-web/login/show.do");
	  Workbook w1= Workbook.getWorkbook(new File("D:\\Training\\Book1.xls"));
	  Sheet s1=w1.getSheet(0);
	  
	  for (int i=1; i<s1.getRows();i++) {
		  String userName= s1.getCell(0, i).getContents();
		  String password= s1.getCell(1, i).getContents();
		  
		  d1.findElement(By.id("userName")).sendKeys(userName);
		  d1.findElement(By.id("password")).sendKeys(password);
		  d1.findElement(By.id("submitBtn")).click();
	  }
	  
  }
}

