package seleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollOfPage {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://gromo.github.io/jquery.scrollbar/demo/basic.html");
	  JavascriptExecutor jse=(JavascriptExecutor) driver;
	  
	  //scroll of the page
	  jse.executeScript("scroll(0,1500)");
	  
	  //scroll within the page
	  WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/p[2]/input"));
	  jse.executeScript("arguments[0].scrollIntoView(true);", element);
	  element.clear();
	  element.sendKeys("Ranganayakulu");
	  
	  
  }
}
