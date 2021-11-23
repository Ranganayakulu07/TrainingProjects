package seleniumWebDriver;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ssInterface {
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/Alert.html");
	  
	  TakesScreenshot t1=(TakesScreenshot) d1;
	  File source=t1.getScreenshotAs(OutputType.FILE);
	  File destination=new File("D:\\Training\\screenshots\\interfaceSS.jpg");
	  FileHandler.copy(source, destination);
	  
	  
	  
  }
}
