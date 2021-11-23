package stepDefinition;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.locators;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	static WebDriver  driver;
	@Given("open chrome browser and URL of the application")
	public void open_chrome_browser_and_URL_of_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		System.out.println("given done");
	}
	@When("user enter details")
	public void user_enter_details() {
	 
	  driver.get("https://ksrtc.in/oprs-web/user/add.do");
	  PageFactory.initElements(driver, locators.class);
	  locators.emailId.sendKeys("Ranganayakulu9963@gmail.com");
	  locators.name.sendKeys("Ranganayakulu");
	  locators.number.sendKeys("9963821016");
	  System.out.println("when done for tag1");
	}
	
	@Then("created account successfully")
	public void created_account_successfully() {
		locators.savebutton.click();
		System.out.println("created account successfully");
		
	}
	
	@Given("open chrome browser and URL of the application for login")
	public void open_chrome_browser_and_URL_of_the_application_for_login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		System.out.println("given done");
	}
	@When("enter user name and password then click on login button")
	public void enter_user_name_and_password_then_click_on_login_button() throws InterruptedException {
		PageFactory.initElements(driver, locators.class);
		locators.userName.sendKeys("Ranganayakulu9963@gmail.com");
		  locators.password.sendKeys("ranga#123"); 
		  Thread.sleep(3000);
		  System.out.println("when done for tag2");
	}
	@Then("login successful")
	public void login_successful() {
		locators.submit.click();
		System.out.println("login successfull");
		
	}	
	
	@Given("open search bus page")
	public void open_search_bus_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		
	}
	
	@When("enter bus details")
	public void enter_bus_details() throws InterruptedException {
		  PageFactory.initElements(driver, locators.class);
		  locators.userName.sendKeys("Ranganayakulu9963@gmail.com");
		  locators.password.sendKeys("ranga#123"); 
		  locators.submit.click();
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
		  jse.executeScript("document.getElementById('txtJourneyDate').value='26/08/2021'");
		  jse.executeScript("document.getElementById('txtReturnJourneyDate').value='29/08/2021'");
		  Thread.sleep(5000);
		  
		
	}
	
	@Then("display available bus")
	public void display_available_bus() {
		PageFactory.initElements(driver, locators.class);
		locators.searchBus.click();
		System.out.println("available buses");
		
	}	

	

	
}
