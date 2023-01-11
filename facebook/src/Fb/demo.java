package Fb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class demo {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfeI5ffiNXExMYQS5Av5PAXmOi7TnWK5NAJFyKQwCv8dlSrnDmn-6Hz-jJ5igGCQv3wn-J3I0QzHL-ydKCFT8DLXTgVYJXWfzgSWvXZWZLKg4A&smuh=23291&lh=Ac-txyIh8SJivSp_9h4");
		
		WebElement username = driver.findElement(By.xpath("//input[@ id = 'email']"));
		WebElement password = driver.findElement(By.xpath("//input[@ name = 'pass']"));
		
	    WebElement loginButton = driver.findElement(By.xpath("//button[@ value = '1']"));
		
		username.sendKeys("ghatagevidya9293@gmail.com");
		
		password.sendKeys("8788814751");
		
		loginButton.click();
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//Thread.sleep(3000);
		//is display method
		//to verify hidden element
		//true- displayed
		//false not displayed
		//Thread.sleep(2000);
	//	WebElement Custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	//	Custom.click();
		
	//     WebElement hiddenElement = driver.findElement(By.xpath("//select[@name=\"preferred_pronoun\"]"));
   //  boolean result = hiddenElement.isDisplayed();
	//     System.out.println("result");
	    
	//    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
	  
	 //   File dest = new File("C:\\Users\\Admin\\Pictures\\Selenium\\selinium123.jpg");
	 //   FileHandler.copy(src, dest);
	    
	    
	      
		
}

}
