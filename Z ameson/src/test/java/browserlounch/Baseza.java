package browserlounch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseza {
    public static WebDriver openchromebrowser() {
    /*	System.setProperty("webdriver.chrome.driver", "C:\\v\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	return driver;*/
    	System.setProperty("webdriver.chrome.driver", "C:\\v\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	 return driver;
    }
}
