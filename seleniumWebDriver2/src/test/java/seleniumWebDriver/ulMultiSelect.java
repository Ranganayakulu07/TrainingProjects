package seleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class ulMultiSelect {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://demo.automationtesting.in/AutoComplete.html");
	  d1.findElement(By.id("searchbox")).sendKeys("ind");
	  Thread.sleep(3000);
	  List<WebElement> elements=d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	  Thread.sleep(3000);
	  for(WebElement listValues: elements) {
		  if(listValues.getText().equalsIgnoreCase("india")) {
			  listValues.click();
			  break;
		  }
	  }
	  
	  d1.findElement(By.id("searchbox")).sendKeys("ind");
	  Thread.sleep(3000);
	  List<WebElement> element=d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	  Thread.sleep(3000);
	  for(WebElement listValues: element) {
		  if(listValues.getText().equalsIgnoreCase("indonesia")) {
			  listValues.click();
			  break;
		  }
	  }
	  
  }
}
