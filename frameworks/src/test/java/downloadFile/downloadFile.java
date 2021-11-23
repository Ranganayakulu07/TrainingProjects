package downloadFile;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class downloadFile {
	@Test
	  public void f() throws BiffException, IOException, AWTException, InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.leafground.com/pages/download.html");
		  driver.findElement(By.linkText("Download Excel")).click();
		  File location=new File("C:\\Users\\Lenovo\\Downloads");
		  File[] total_files=location.listFiles();
		  for (File fileName:total_files) {
			 if( fileName.getName().equalsIgnoreCase("testleaf.xlsx")) {
				 System.out.println("file is downloaded");
				 break;
			 }
			 
		  }
		  
		  
		  
		  
		  
		  
		  
		  
}
}