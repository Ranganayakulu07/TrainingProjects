package seleniumWebDriver;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ssRobot {
  @Test
  public void f() throws AWTException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/Alert.html");
	  
	  //alert
	  d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	  String str=d1.switchTo().alert().getText();
	  System.out.println(str);
	  
	  Robot r1=new Robot();
	  Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
	  Rectangle rect=new Rectangle(screenSize);
	  BufferedImage source= r1.createScreenCapture(rect);
	  File destination=new File("D:\\Training\\screenshots\\ssrobot.jpg");
	  ImageIO.write(source, "jpg", destination);
	  
	  d1.switchTo().alert().accept();
	  
  }
}
