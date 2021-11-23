package extendedReports;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import elements.locators;



public class GenerateExtentReports {
	
	WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void startTest() {
		htmlReporter=new ExtentHtmlReporter("C:\\Users\\Lenovo\\eclipse-workspace\\Reports\\test-output\\myReporter.html");
		htmlReporter.config().setDocumentTitle("automation report");
		htmlReporter.config().setReportName("functional report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "windows 10");
		extent.setSystemInfo("tester name", "Ranganayakulu");
		extent.setSystemInfo("browser", "chrome");
	
	}
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	@BeforeMethod
	public void beforeSetUp() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			PageFactory.initElements(driver, locators.class);
			driver.navigate().to("https://ksrtc.in/oprs-web/login/show.do"); 
	}
	
	@Test
	public void addAccount() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		  //open login page
		test=extent.createTest("addAccount");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://ksrtc.in/oprs-web/login/show.do");
		  PageFactory.initElements(driver, locators.class);
		 
		  locators.signup.click();
		  driver.get("https://ksrtc.in/oprs-web/user/add.do");
		  locators.emailId.sendKeys("Ranganayakulu9963@gmail.com");
		  locators.name.sendKeys("Ranganayakulu");
		  locators.number.sendKeys("9963821016");
		  //locators.savebutton.click();
		  
	}
	@Test
	public void logIn() throws InterruptedException {
		
			  test=extent.createTest("logIn");
			  //enter login details
			  driver=new ChromeDriver();
			  PageFactory.initElements(driver, locators.class);
			  locators.userName.sendKeys("Ranganayakulu9963@gmail.com");
			  locators.password.sendKeys("ranga#123");
			  locators.submit.click();
			  Thread.sleep(3000);
		
	}
	@Test
	public void searchBus() throws InterruptedException {
			test=extent.createTest("searchBus");
			driver=new ChromeDriver();
			PageFactory.initElements(driver, locators.class);
			driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1#");
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
			  jse.executeScript("document.getElementById('txtJourneyDate').value='03/09/2021'");
			  jse.executeScript("document.getElementById('txtReturnJourneyDate').value='05/09/2021'");
			  Thread.sleep(5000);
			  locators.searchBus.click();
		}

	
	
	
	@AfterMethod
	public void setDown() {
		
		System.out.println("after method");
	}
}
