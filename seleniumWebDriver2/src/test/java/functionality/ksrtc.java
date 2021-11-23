package functionality;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import elements.locators;

public class ksrtc {
  @Test
  public void ksrtcOnline() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	//open login page
	  driver.navigate().to("https://ksrtc.in/oprs-web/login/show.do");
	  
	  /*
	  locators.signUp(driver).click();
	  driver.get("https://ksrtc.in/oprs-web/user/add.do");
	  
	  locators.email(driver).sendKeys("Ranganayakulu9963@gmail.com");
	  locators.name(driver).sendKeys("Ranganayakulu");
	  locators.mobileNumber(driver).sendKeys("9963821016");
	  locators.save(driver).click();
	  */
	  
	  locators.userName(driver).sendKeys("Ranganayakulu9963@gmail.com");
	  locators.password(driver).sendKeys("ranga#123");
	  locators.loginButton(driver).click();
	  Thread.sleep(3000);
	  driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	  locators.fromPlace(driver).sendKeys("anantapur");
	  Thread.sleep(3000);
	  List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
	  Thread.sleep(3000);
	  for(WebElement listValues: elements) {
		  if(listValues.getText().equalsIgnoreCase("ANANTAPUR")) {
			  listValues.click();
			  break;
		  }	  
	  }
	  
	  locators.toplace(driver).sendKeys("bengaluru");
	  Thread.sleep(3000);
	  List<WebElement> element=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
	  Thread.sleep(3000);
	  for(WebElement listValues: element) {
		  if(listValues.getText().equalsIgnoreCase("BENGALURU")) {
			  listValues.click();
			  break;
		  }	  
	  }
	  
	  JavascriptExecutor jse=(JavascriptExecutor) driver;
	  jse.executeScript("document.getElementById('txtJourneyDate').value='16/08/2021'");
	  jse.executeScript("document.getElementById('txtReturnJourneyDate').value='18/08/2021'");
	  Thread.sleep(3000);
	  locators.searchBus(driver).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
 }
}