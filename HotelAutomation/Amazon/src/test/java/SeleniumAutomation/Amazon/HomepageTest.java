package SeleniumAutomation.Amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomepageObjects;
import resources.base;

public class HomepageTest extends base {
  
 @BeforeTest
 public void initializeTest() throws IOException
 {
	  driver=initializeDriver();
	  String baseUrl = props.getProperty("url");
	  driver.get(baseUrl);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 }
	
  @Test
  public void basePage() throws IOException, InterruptedException
  {
	  
	  
	  HomepageObjects obj1 = new HomepageObjects(driver);
	  obj1.userlogins().click();
	  
	  Thread.sleep(2000);
	  obj1.usernames().clear();
	  obj1.usernames().sendKeys("neogi.newton@gmail.com");
	  driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	  
	  obj1.passwords().clear();
	  obj1.passwords().sendKeys("redcastle123");
	  
	  //Thread.sleep(10000);
	  //driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	  Thread.sleep(5000);
	  obj1.signins().click();
  }
	  @AfterTest
	  public void closeBrowser()
	  {
		 driver.close(); 
	  }
	  
	
  }

