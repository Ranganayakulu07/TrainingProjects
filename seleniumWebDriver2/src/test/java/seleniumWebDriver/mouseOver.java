package seleniumWebDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseOver {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/Edit.html");
	  //d1.findElement(By.id("email")).sendKeys("Ranga");
	  //WebElement web1=d1.findElement(By.id("email"));
	  //web1.sendKeys("Ranga");
	  //String str=web1.getAttribute("value");
	  //System.out.println(str);
	  //WebElement web3=d1.findElement(By.id("email"));
	  WebElement web1=d1.findElement(By.cssSelector("input[value='Append ']"));
	  WebElement web2=d1.findElement(By.cssSelector("input[value=\"TestLeaf\"]"));

	  Actions act1=new Actions(d1);
	  //act1.doubleClick(web1).perform();
	 // WebElement str=d1.findElement(By.id("email"));
	  act1.dragAndDrop(web1, web2).build().perform();
	
  }
}
