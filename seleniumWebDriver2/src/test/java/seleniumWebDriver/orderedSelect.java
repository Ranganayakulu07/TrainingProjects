package seleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class orderedSelect {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/selectable.html");
	  List<WebElement> elements=d1.findElements(By.xpath("//ol[@id='selectable']/li"));
	  Actions act=new Actions(d1);
	  act.keyDown(Keys.CONTROL)
	  	.click(elements.get(1))
	  	.click(elements.get(3))
	  	.click(elements.get(5)).keyUp(Keys.CONTROL).build().perform();
	 
	  
	  
  }
}
