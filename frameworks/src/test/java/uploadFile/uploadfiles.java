package uploadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class uploadfiles {
	  @Test
	  public void f() throws BiffException, IOException, AWTException, InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/FileUpload.html");
		  
		  driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div[3]")).click();
		  Thread.sleep(3000);
		  String file="D:\\Django\\22_MongoDB.docx";
		  StringSelection select=new StringSelection(file);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		  Robot r1=new Robot();
		  r1.keyPress(KeyEvent.VK_CONTROL);
		  r1.keyPress(KeyEvent.VK_V);
		  r1.keyRelease(KeyEvent.VK_V);
		  r1.keyRelease(KeyEvent.VK_CONTROL);
		  r1.keyPress(KeyEvent.VK_ENTER);
		  
  }
}
