package listeners;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import elements.locators;

@Listeners(listeners.ListenerTest.class)
public class TestCases {
	WebDriver driver;
	
	
	@Test
	public void addAccount() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		  //open login page
		  driver=new ChromeDriver();
		  driver.navigate().to("https://ksrtc.in/oprs-web/login/show.do");
		  PageFactory.initElements(driver, locators.class);
		 
		  locators.signup.click();
		  driver.get("https://ksrtc.in/oprs-web/user/add.do");
		  locators.emailId.sendKeys("Ranganayakulu9963@gmail.com");
		  locators.name.sendKeys("Ranganayakulu");
		  locators.number.sendKeys("9963821016");
		  locators.savebutton.click();
		  Assert.assertTrue(false);
	}
	
	
	@Test
	public void logIn() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  PageFactory.initElements(driver, locators.class);
		  driver.get("https://ksrtc.in/oprs-web/login/show.do");
		  locators.userName.sendKeys("Ranganayakulu9963@gmail.com");
		  locators.password.sendKeys("ranga#123");
		  locators.submit.click();
		  Thread.sleep(3000);
	}
	
	@Test
	public void searchBus() throws InterruptedException {
		  driver=new ChromeDriver();
		  PageFactory.initElements(driver, locators.class);
		  driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		  locators.fromPlace.sendKeys("anantapur");
		  Thread.sleep(3000);
		  List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
		  Thread.sleep(3000);
		  for(WebElement listValues: elements) {
			  if(listValues.getText().equalsIgnoreCase("ANANTAPUR")) {
				  listValues.click();
				  break;
			  }	  
		  }
		  
		  locators.toPlace.sendKeys("bengaluru");
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
		  jse.executeScript("document.getElementById('txtJourneyDate').value='25/08/2021'");
		  jse.executeScript("document.getElementById('txtReturnJourneyDate').value='27/08/2021'");
		  Thread.sleep(5000);
		  locators.searchBus.click();
	}

}
