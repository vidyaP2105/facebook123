package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {
  @FindBy (xpath="//a[@aria-label='Amazon.in']")
  private WebElement logotext;
  
  @FindBy (xpath="//input[@aria-label='Search Amazon.in']")
  private WebElement searchbox;
  
  @FindBy (xpath="//input[@id=\'nav-search-submit-button\']")
  private WebElement searchbutton;
  
  public Indexpage (WebDriver driver) {
	  PageFactory.initElements( driver, this);
  }
  public void sendproductnamesearchbox(String value) {
	  searchbox.sendKeys(value); 
	 
  }
 public void clickonsearchbutton() {
	 searchbutton.click();
}
}
