package seleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calender {
  @Test
  public void ksrtcOnline() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver;
	  driver=new ChromeDriver();
	  //driver.manage().window().maximize();
	  
	  
	  //driver.get("https://ksrtc.in/oprs-web/login/show.do");//open login page
	  //driver.findElement(By.linkText("SignUp")).click(); //open signup page
	  //d1.get("https://ksrtc.in/oprs-web/user/add.do"); //open add page
	  //driver.findElement(By.name("email")).sendKeys("Ranganayakulu9963@gmail.com");//user name
	  //driver.findElement(By.name("fullName")).sendKeys("Ranganayakulu");//full name
	  //d1.findElement(By.name("mobileNo")).sendKeys("9963821016");//phone number
	  //driver.findElement(By.name("SaveBtn")).click();//add the user
	  
	  /*driver.navigate().to("https://ksrtc.in/oprs-web/login/show.do"); //open login page
	  driver.findElement(By.name("userName")).sendKeys("Ranganayakulu9963@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("ranga#123");
	  driver.findElement(By.id("submitBtn")).click();//click on login button
	  Thread.sleep(1000);*/
	  driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1#");
	  
	  driver.findElement(By.id("fromPlaceName")).sendKeys("bengaluru");
	  Thread.sleep(3000);
	  List<WebElement> optionList=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
	  for(WebElement element:optionList) {
		  if( element.getText().equalsIgnoreCase("ben"));
		    {
			   element.click();
			   break;
		   }
	  }

	 // String optionToSelect1="ANANTAPUR";
	  driver.findElement(By.id("toPlaceName")).sendKeys("anan");
	  Thread.sleep(3000);
	  List<WebElement> optionList1=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
	  for(WebElement element1:optionList1) {
		  Thread.sleep(3000);
		  if( element1.getText().equalsIgnoreCase("anantapu"));
		    {
			   element1.click();
			   break;
		   }
	  }
	  
	  String optionToSelect2="12";
	  driver.findElement(By.id("txtJourneyDate")).sendKeys("12");
	  Thread.sleep(3000);
	  List<WebElement> optionList2=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td"));
	  for(WebElement element2:optionList2) {
		   String currentOption2=element2.getText();
		   if(currentOption2.contains(optionToSelect2)) {
			   element2.click();
			   break;
		   }
	  }
	  
	  String optionToSelect3="13";
	  driver.findElement(By.id("txtReturnJourneyDate")).sendKeys("13");
	  Thread.sleep(3000);
	  List<WebElement> optionList3=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td"));
	  for(WebElement element3:optionList3) {
		   String currentOption3=element3.getText();
		   if(currentOption3.contains(optionToSelect3)) {
			   element3.click();
			   break;
		   }
	  }
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click(); 
	   
  }
}
