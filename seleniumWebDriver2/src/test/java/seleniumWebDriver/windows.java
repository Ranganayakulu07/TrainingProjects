package seleniumWebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windows {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/Window.html");
	  d1.findElement(By.id("home")).click();
	  Set<String> window_values=d1.getWindowHandles();
	  Iterator<String> it1=window_values.iterator();
	  String s1=it1.next();
	  System.out.println(s1);
	  String s2=it1.next();
	  System.out.println(s2);
	  d1.switchTo().window(s2);
	  System.out.println(d1.getTitle());
	  d1.quit();
  }
}
