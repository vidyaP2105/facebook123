package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserlounch.Baseza;
import pages.Indexpage;
import utils.utility;

public class indexpagetest extends Baseza {
	//https://www.amazon.in/
	WebDriver driver;
	Indexpage indexpage;
	private String value;
	private int TestID; 
	@BeforeTest
	public void lounchbrowser() {
		//driver=Baseza.openchromebrowser();
		System.setProperty("webdriver.chrome.driver", "C:\\v\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();
	}
	@BeforeClass
	public void POMobject() {
		indexpage=new Indexpage(driver);
		
      }
	@BeforeMethod
	public void gotoamezon() {
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void searchfunctionality() throws Exception 
	{ TestID=123;
		value=utility.exeldata("C", 0, 0);
		indexpage.sendproductnamesearchbox(value);
		indexpage.clickonsearchbutton();
	
	}
	@AfterMethod
	public void failscreenshoot(	ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus()) 
		{
		utility.screenshot(driver, TestID);
		}
		
	}
	@AfterClass
	public void objectclosed() {
		indexpage=null;
	}
	@AfterTest
	public void closedbrowser() {
		driver.close();
	}
}
