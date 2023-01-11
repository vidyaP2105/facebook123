package Fb;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfeI5ffiNXExMYQS5Av5PAXmOi7TnWK5NAJFyKQwCv8dlSrnDmn-6Hz-jJ5igGCQv3wn-J3I0QzHL-ydKCFT8DLXTgVYJXWfzgSWvXZWZLKg4A&smuh=23291&lh=Ac-txyIh8SJivSp_9h4");
		for (int i=0;i<5;i++)
		{	
		  DateFormat dateFormat=new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
		  Date date=new Date();
		   String date1=dateFormat.format(date);
		
		   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		  
		    File dest = new File("C:\\Users\\Admin\\Pictures\\Selenium\\"+date1+".jpg");
		    FileHandler.copy(src, dest);
		}  
}
}



