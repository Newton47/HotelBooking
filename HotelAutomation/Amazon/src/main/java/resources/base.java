package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class base {
	
  public ChromeDriver driver;	
  public Properties props;
  @Test
  public WebDriver initializeDriver() throws IOException
  {
	  props = new Properties();
	  File src = new File("C:\\Users\\Newton\\AmazonAutomation\\Amazon\\src\\main\\java\\resources\\data.properties");
	  FileInputStream fis = new FileInputStream(src);
	  
	  props.load(fis);
	  String browserName = props.getProperty("browser");
	  
	  if(browserName.equals("firefox"))
	  {
		  //Firefox code
	  }
	  else if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Newton\\Desktop\\driver_chrome\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  else
	  {
		  //IE code
	  }
	  
	  driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
	  
	  return driver;
  }

}

