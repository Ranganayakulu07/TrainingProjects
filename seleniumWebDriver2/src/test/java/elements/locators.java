package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class locators {
	
	public static WebElement signUp(WebDriver driver) {
		return driver.findElement(By.linkText("SignUp"));
	}
	
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.name("email"));
	}
	
	public static WebElement name(WebDriver driver) {
		return driver.findElement(By.name("fullName"));
	}
	
	public static WebElement mobileNumber(WebDriver driver) {
		return driver.findElement(By.name("mobileNo"));
	}
	
	public static WebElement save(WebDriver driver) {
		return driver.findElement(By.name("SaveBtn"));
	}
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name("userName"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	  
	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.id("submitBtn"));
	}
	
	public static WebElement fromPlace(WebDriver driver) {
		return driver.findElement(By.id("fromPlaceName"));
	}
	
	public static WebElement toplace(WebDriver driver) {
		return driver.findElement(By.id("toPlaceName"));
	}
	
	public static WebElement searchBus(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button"));
	}
	
	
 }