package functionality;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.locators;

public class ksrtc {
  @Test
  public void ksrtcOnline() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  //open login page
	  driver.navigate().to("https://ksrtc.in/oprs-web/login/show.do");
	  PageFactory.initElements(driver, locators.class);
	  /*
	  locators.signup.click();
	  driver.get("https://ksrtc.in/oprs-web/user/add.do");
	  locators.emailId.sendKeys("Ranganayakulu9963@gmail.com");
	  locators.name.sendKeys("Ranganayakulu");
	  locators.number.sendKeys("9963821016");
	  locators.savebutton.click();
	  */
	  
	  locators.userName.sendKeys("Ranganayakulu9963@gmail.com");
	  locators.password.sendKeys("ranga#123");
	  locators.submit.click();
	  File file1=new File("D:\\Training\\cookies\\cookies1.data");
	  
	  
	  try {
		  file1.delete();
	  file1.createNewFile();
	  FileWriter fw=new FileWriter(file1);
	  BufferedWriter bw=new BufferedWriter(fw);
	  
	  // add cookies
	  Cookie cookie = new Cookie("Ranganayakulu","9963821015");
	  driver.manage().addCookie(cookie);
	  
	  //delete cookie
	  driver.manage().deleteCookie(cookie); 		 // Delete specific cookie
	  //driver.manage().deleteCookieNamed("Ranganayakulu"); 	 // Delete specific cookie according Name
	  //driver.manage().deleteAllCookies(); 			 // Delete all cookies
	  
	  //get all cookies
	  for(Cookie ck:driver.manage().getCookies()) {
	  bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
	  bw.newLine();

	  }
	  bw.close();
	  fw.close();
	  }
	  catch(Exception e) {
	  System.out.println(e);
	  }}
  
  
      /*
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
	  jse.executeScript("document.getElementById('txtJourneyDate').value='16/08/2021'");
	  jse.executeScript("document.getElementById('txtReturnJourneyDate').value='18/08/2021'");
	  Thread.sleep(3000);
	  locators.searchBus.click();
	  
	  
	*/  
	  
	  
	  
	  
	  
	  
  
 }
