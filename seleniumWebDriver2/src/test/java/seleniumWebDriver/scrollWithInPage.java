package seleniumWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollWithInPage {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAjwmeiIBhA6EiwA-uaeFYA5dWXBk0vQmaeVdiVmjQgmHQQ0oLV63LQinV9Dp-PzMoPshjl7LRoCCpAQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwmeiIBhA6EiwA-uaeFYA5dWXBk0vQmaeVdiVmjQgmHQQ0oLV63LQinV9Dp-PzMoPshjl7LRoCCpAQAvD_BwE");
	  JavascriptExecutor jse=(JavascriptExecutor) driver;
	  jse.executeScript("scroll(0,500)");
	  
  }
}
