package dataDriven;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import jxl.read.biff.BiffException;

public class apachePoiWrite {
  @Test
  public void f() throws BiffException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\hcl softwares\\chromedriver_win32\\chromedriver.exe");
	  String filepath=("D:\\Training\\loginDetails.xlsx");
	  File f1=new File(filepath);
	  FileOutputStream fos=new FileOutputStream(f1);
	  XSSFWorkbook w1=new XSSFWorkbook();
	  XSSFSheet s1=w1.createSheet("names");
	  Row r1=s1.createRow(5);
	  Cell c1=r1.createCell(6);
	  c1.setCellType(CellType.STRING);
	  c1.setCellValue("Ranganayakulu");
	  w1.write(fos);
	  
	  
	  
	  
	  
	  
	  
  }
}