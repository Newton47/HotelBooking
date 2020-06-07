package SeleniumAutomation.Amazon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.buyProductObjects;
import resources.base;

public class buyFerrariTest extends base {
	@BeforeTest
	 public void initializeTest() throws IOException
	 {
		  driver=initializeDriver();
		  String baseUrl = props.getProperty("url");
		  driver.get(baseUrl);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 }	
  @Test
  public void buyferrari() 
  {
	  WebElement home = driver.findElement(By.xpath("//span[@class=\"nav-sprite nav-logo-base\"]"));
	  home.click();
	  
	  buyProductObjects obj1 = new buyProductObjects(driver);
	  obj1.searchBar().sendKeys("ferrari rc");
	  obj1.searchButton().click();
	  	  	  
  }
  @AfterTest
  public void closeBrowser()
  {
	 driver.close(); 
  }
}
