package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomepageObjects 
{
  public WebDriver driver;	
  
  public HomepageObjects(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  
  @FindBy(xpath="//span[@class=\"nav-line-1\" and contains(text(),\"Hello, Sign in\")]")
  WebElement userlogin;
  
  @FindBy(xpath="//input[@type=\"email\"]")
  WebElement username;
  
  @FindBy(xpath="//input[@type=\"password\"]")
  WebElement password;
  
  @FindBy(xpath="//input[@id=\"signInSubmit\"]")
  WebElement signin;
  
  
  public WebElement userlogins()
  {
	  return userlogin;
  }
  
  public WebElement usernames()
  {
	return username;  
  }
  
  public WebElement passwords()
  {
	return password;  
  }
  
  public WebElement signins()
  {
	return signin;  
  }
  
  }  

