package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchObjects {
	
  public WebDriver driver;	
  public SearchObjects(WebDriver driver)
   {
		this.driver=driver;
		PageFactory.initElements(driver,this);
   }
  
  @FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")
  WebElement Selector;
	
  @FindBy(xpath="//input[@type=\"submit\"]")
  WebElement SearchButton;
  

public WebElement selects()
  {
	  return Selector;
  }
  
  public WebElement searches()
  {
	  return SearchButton;
  }
}
