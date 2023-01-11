package Fb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagrm {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement Username =  driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		Thread.sleep(3000);
	    WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
	    Thread.sleep(3000);
	    WebElement LogInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    
	    Username.sendKeys("vidya.patil2105@gmail.com");
	   Password.sendKeys("929308");
	    LogInButton.click();
}
}