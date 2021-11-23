package elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class locators {
	
	
	@FindBy(linkText="SignUp")
	public static WebElement signup;
	
	@FindBy(name="email")
	public static WebElement emailId;
	
	@FindBy(name="fullName")
	public static WebElement name;
	
	@FindBy(name="mobileNo")
	public static WebElement number;
	
	@FindBy(name="SaveBtn")
	public static WebElement savebutton;
	
	@FindBy(name="userName")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(id="submitBtn")
	public static WebElement submit; 
	
	@FindBy(id="fromPlaceName")
	public static WebElement fromPlace;
	
	@FindBy(id="toPlaceName")
	public static WebElement toPlace;
	
	@FindBy(xpath="//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")
	public static WebElement searchBus;
	
 }