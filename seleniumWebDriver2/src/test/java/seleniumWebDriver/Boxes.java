package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Boxes {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/Alert.html");
	  
	  //alert
	  //d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	  //String str=d1.switchTo().alert().getText();
	  //System.out.println(str);
	  //d1.switchTo().alert().accept();
	  
	  //confirm click on ok
	  //d1.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	  //d1.switchTo().alert().accept();
	  
	  //confirm click on cancel
	  //d1.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	  //d1.switchTo().alert().dismiss();
	  
	  //prompt box
	  d1.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	  d1.switchTo().alert().sendKeys("Hi Ranga");
	  d1.switchTo().alert().accept();
	  
  }
}
