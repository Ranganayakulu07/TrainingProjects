package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/Button.html");
	  d1.findElement(By.id("home")).click();
	  d1.get("http://www.leafground.com/pages/Button.html");
	  d1.findElement(By.id("position")).click();
	  d1.findElement(By.cssSelector("Button[style='background-color:lightgreen']")).click();
	  d1.findElement(By.id("size")).click();
	  d1.quit();
	  
	  
  }
}
