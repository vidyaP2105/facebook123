package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	public static String value;
 public static  void screenshot( WebDriver driver,int TestID) throws Exception {
	 SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	 Date d=new Date();
	String newdate= dateformat.format(d);
 TakesScreenshot ts=(TakesScreenshot)driver;
 File src= ts.getScreenshotAs(OutputType.FILE);
  File trg =new File("C:\\Users\\M8IN\\OneDrive\\Desktop\\TESTDATA.xlsx");
  FileHandler.copy(src, trg);
 	 
 }
  public static String exeldata(String sheet,int row,int column) throws EncryptedDocumentException, IOException {
	  String path="C:\\Users\\M8IN\\OneDrive\\Desktop\\QUESIONS.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook w=	WorkbookFactory.create(file);
		try {
	String value=		w.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		}catch(Exception e) {
		double d=	w.getSheet(sheet).getRow(row).getCell(column).getNumericCellValue();
			long l=(long)d;
		value=	Long.toString(l);
		return value;
		}
		return value;
		
  }
}
