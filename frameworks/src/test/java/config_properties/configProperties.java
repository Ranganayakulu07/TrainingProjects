package config_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class configProperties {
	@Test
	  public void f() throws IOException {
		
		WebDriver driver;
		FileInputStream ft=new FileInputStream("src\\test\\java\\config_properties\\Config.properties");
		Properties prop=new Properties();
		prop.load(ft);
		String browser_name=prop.getProperty("browser");
		String driver_path=prop.getProperty("driver_path");
		
		if (browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driver_path);
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		 
		else if (browser_name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",driver_path);
			driver=new FirefoxDriver();
			driver.get("https://ksrtc.in/oprs-web/");
		}
		else
			System.setProperty("webdriver.ie.driver",driver_path);
			driver=new InternetExplorerDriver();
		
		  
		  
		  driver.get("http://www.leafground.com/pages/download.html");
	}
}
