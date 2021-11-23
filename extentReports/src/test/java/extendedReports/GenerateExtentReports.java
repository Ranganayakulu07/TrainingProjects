package extendedReports;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import elements.locators;



public class GenerateExtentReports {
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	
	@BeforeTest
	public void startReport() {
		extent = new ExtentReports("C:\\Users\\Lenovo\\eclipse-workspace\\Reports2\\test-output\\extentReporter.html");
		extent.addSystemInfo("HostName", "localHost");
		extent.addSystemInfo("Environment", "QA");
		extent.addSystemInfo("username", "Ranganayakulu");
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	@Test
	public void addAccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
		//open login page
		  test = extent.startTest("addAccount");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://ksrtc.in/oprs-web/login/show.do");
		 // PageFactory.initElements(driver, locators.class);
		 
		  locators.signup.click();
		  driver.get("https://ksrtc.in/oprs-web/user/add.do");
		  locators.emailId.sendKeys("Ranganayakulu9963@gmail.com");
		  locators.name.sendKeys("Ranganayakulu");
		  locators.number.sendKeys("9963821016");
		  locators.savebutton.click();
		 // Assert.assertTrue(false);
		  test.log(LogStatus.PASS, "addAccount is created");
		  Thread.sleep(1000);
	}
	
	@Test
	public void logIn() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
			  test = extent.startTest("logIn");
			  //enter login details
			  driver=new ChromeDriver();
			  PageFactory.initElements(driver, locators.class);
			  driver.navigate().to("https://ksrtc.in/oprs-web/login/show.do");
			  locators.userName.sendKeys("Ranganayakulu9963@gmail.com");
			  locators.password.sendKeys("ranga#123");
			  locators.submit.click();
			  Thread.sleep(3000);
			  test.log(LogStatus.PASS, "logInis successfull");
		
	}
	
	@Test
	public void searchBus() throws InterruptedException {
			test = extent.startTest("searchBus");
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
			  test.log(LogStatus.PASS, "searchBus is completed");
		}
	
	@AfterMethod
	public void getResult(ITestResult result) throws Exception {
		if (result.getStatus()== ITestResult.FAILURE )
		{
			String screenshotPath = GenerateExtentReports.getScreenshot(driver, result.getName());
			 //To add it in the extent report 
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(test);
		
	}
		public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
         
                String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
                  Robot r1=new Robot();
            	  Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
            	  Rectangle rect=new Rectangle(screenSize);
            	  BufferedImage source= r1.createScreenCapture(rect);
            	  File destination=new File("C:\\Users\\Lenovo\\eclipse-workspace\\extentReports\\failedScreenShots\\ssrobot.jpg");
            	  ImageIO.write(source, "jpg", destination);
                  //Returns the captured file path
				return screenshotName;
				
                  
               
               
                
               
}
}
