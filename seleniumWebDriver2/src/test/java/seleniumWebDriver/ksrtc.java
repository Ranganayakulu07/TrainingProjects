package seleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ksrtc {
  @Test
  public void ksrtcOnline() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver;
	  driver=new ChromeDriver();
	  //driver.manage().window().maximize();
	  
	  //create a account
	  /*
	  driver.get("https://ksrtc.in/oprs-web/login/show.do");						//open login page
	  driver.findElement(By.linkText("SignUp")).click(); 							//open signup page
	  driver.get("https://ksrtc.in/oprs-web/user/add.do"); 							//open add page
	  driver.findElement(By.name("email")).sendKeys("Ranganayakulu9963@gmail.com");//user name
	  driver.findElement(By.name("fullName")).sendKeys("Ranganayakulu");			//full name
	  driver.findElement(By.name("mobileNo")).sendKeys("9963821016");				//phone number
	  driver.findElement(By.name("SaveBtn")).click();								//add the user
	  */
	  
	  //open login page
	  driver.navigate().to("https://ksrtc.in/oprs-web/login/show.do"); 
	  
	  //enter login details
	  driver.findElement(By.name("userName")).sendKeys("Ranganayakulu9963@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("ranga#123");
	  driver.findElement(By.id("submitBtn")).click();							//click on login button
	  
	  //login page
	  driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1#");
	  
	  //enter from place
	  driver.findElement(By.id("fromPlaceName")).sendKeys("bengaluru");			
	  Thread.sleep(3000);
	  List<WebElement> optionList=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
	  for(WebElement element:optionList) {
		   if( element.getText().equalsIgnoreCase("bengaluru"));
		    {
			   element.click();
			   break;
		   }
	  }
	  
	  //enter to place
	  String optionToSelect1="ANANTAPUR";
	  driver.findElement(By.id("toPlaceName")).sendKeys("anantapur");
	  Thread.sleep(3000);
	  List<WebElement> optionList1=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
	  for(WebElement element1:optionList1) {
		   String currentOption1=element1.getText();
		   if(currentOption1.contains(optionToSelect1)) {
			   element1.click();
			   break;
		   }
	  }
	  
	  //select journey date
	  String journeyDate="12";
	  driver.findElement(By.id("txtJourneyDate")).sendKeys("18");
	  Thread.sleep(3000);
	  List<WebElement> dates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td"));
	  for(WebElement element2:dates) {
		   String currentDate=element2.getText();
		   if(currentDate.contains(journeyDate)) {
			   element2.click();
			   break;
		   }
	  }
	  
	  //select return journey date
	  String returnDate="13";
	  driver.findElement(By.id("txtReturnJourneyDate")).sendKeys("19");
	  Thread.sleep(3000);
	  List<WebElement> r_Dates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td"));
	  for(WebElement element3:r_Dates) {
		   String selectReturnDate=element3.getText();
		   if(selectReturnDate.contains(returnDate)) {
			   element3.click();
			   break;
		   }
	  }
	  
	  //click on search for button
	  
	  driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();  
  }
}
