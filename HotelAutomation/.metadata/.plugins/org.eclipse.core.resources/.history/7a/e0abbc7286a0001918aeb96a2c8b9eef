package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class buyProductObjects {
  
	public WebDriver driver;
	public buyProductObjects(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")
	WebElement search;

	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement searchbtn;

	
	public WebElement searchBar()
	{
		return search;
	}
	public WebElement searchButton()
	{	
		return searchbtn;
	}


}
