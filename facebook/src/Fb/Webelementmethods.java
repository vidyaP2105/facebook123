package Fb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelementmethods {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(4000);
		//WebElement Custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		//Custom.click();
		
	    // WebElement hiddenElement = driver.findElement(By.xpath("//select[@name=\"preferred_pronoun\"]"));
   //  boolean result = hiddenElement.isDisplayed();
	   //  System.out.println("result");
	    
	    // WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    // Select s = new Select(month);
	    //  s.selectByVisibleText("May");//
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,100)");
	      
	     Thread.sleep(3000);
	     Js.executeScript("window.scrollBy(0,-100)");
}
}
