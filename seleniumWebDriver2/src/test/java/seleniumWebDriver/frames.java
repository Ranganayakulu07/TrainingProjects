package seleniumWebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/frame.html");
	  d1.switchTo().frame(0);
	  d1.findElement(By.id("Click")).click();
	  d1.switchTo().defaultContent();
	  d1.switchTo().frame(1);
	  d1.switchTo().frame("frame2");
	  d1.findElement(By.id("Click1")).click();
	  d1.switchTo().defaultContent();
	  d1.switchTo().frame(2);
	  int total= d1.findElements(By.tagName("iframe")).size();
	  System.out.println(total);
	  
	  
	  
  }
}
