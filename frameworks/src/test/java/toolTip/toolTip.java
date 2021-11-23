package toolTip;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class toolTip {
	 @Test
	  public void f() throws BiffException, IOException, AWTException, InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  /*
		   // using getAttribute value
		  driver.get("http://www.leafground.com/pages/tooltip.html");
		  
		 WebElement element= driver.findElement(By.id("age"));
		
		 String str=element.getAttribute("title");
		 System.out.println("Tooltip="+str);
		 Assert.assertEquals(str, "Enter your Name");
		 */
		  /*
		   //usingg Action class
		  driver.get("https://jqueryui.com/tooltip");	
		  Actions actions = new Actions(driver);
		 WebElement element = driver.findElement(By.id("age"));
		 actions.moveToElement(element).perform();
		 WebElement toolTip = driver.findElement(By.xpath("//*[@id='age']"));
		 String toolTipText = toolTip.getText();
		 System.out.println("Tooltip="+toolTipText);
		 Assert.assertEquals(toolTipText, "We ask for your age only for statistical purposes.");
		  */
		  
		  //using jquery
		  driver.get("http://demo.guru99.com/test/tooltip.html");
		  String expectedTooltip = "What's new in 3.2";
		  WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
	        Actions builder = new Actions (driver);							

	        builder.clickAndHold().moveToElement(download);					
	        builder.moveToElement(download).build().perform(); 	
	        
	        WebElement toolTipElement = driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/a"));							
	        String actualTooltip = toolTipElement.getText();			
	        
	        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }		
		    
		  
		  
		  
		 
		 
		 
		 
		 
		 
	
  }
}
