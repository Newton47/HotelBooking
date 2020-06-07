package SeleniumAutomation.Amazon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.SearchObjects;
import resources.DataproviderClass;
import resources.base;

public class SearchitemTest extends base{
  
	@BeforeTest
	 public void initializeTest() throws IOException
	 {
		  driver=initializeDriver();
		  String baseUrl = props.getProperty("url");
		  driver.get(baseUrl);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 }	
  	
  @Test(dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)
  public void searchitem(String searcher) throws InterruptedException 
  {

	SearchObjects obj1 = new SearchObjects(driver);
	obj1.selects().sendKeys(searcher);
	Thread.sleep(3000);
	obj1.searches().click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	obj1.selects().clear();	
   
  }
  @AfterTest
  public void closeBrowser()
  {
	 driver.close(); 
  }
}
