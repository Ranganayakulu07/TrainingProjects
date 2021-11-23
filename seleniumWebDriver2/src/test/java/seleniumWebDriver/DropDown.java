package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/Dropdown.html");
	  Select sel1=new Select(d1.findElement(By.id("dropdown1")));
	  sel1.selectByVisibleText("Loadrunner");		//selectByVisibleText
	  sel1.selectByIndex(1);		//selectByIndex
	  sel1.selectByValue("2");		//select By Value
	  boolean mes=sel1.isMultiple();
	  System.out.println(mes);
	  
	  //Select sel2=new Select(d1.findElement(By.name("dropdown2")));
	  //sel2.selectByVisibleText("Loadrunner");		//selectByVisibleText
	  //sel2.selectByIndex(1);		//selectByIndex
	  //sel2.selectByValue("2");
	  
	  //Select sel3=new Select(d1.findElement(By.name("dropdown3")));
	  //sel3.selectByVisibleText("Loadrunner");		//selectByVisibleText
	  //sel3.selectByIndex(1);		//selectByIndex
	  //sel3.selectByValue("2");
	  
	  //Select sel4=new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select")));
	  //sel4.selectByValue("1");
	  
	  //Select sel5=new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")));
	  //sel5.selectByValue("1");
	  
	  //Select sel6=new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
	  //sel6.selectByValue("1");
	  //sel6.selectByValue("2");
	  //boolean mesg=sel6.isMultiple();
	  //System.out.println(mesg);
	  //d1.quit();
  }
}
