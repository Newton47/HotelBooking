package CaseStudy.HotelBooking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties props;

	public static WebDriver getDriver() throws IOException
	{
		props = new Properties();
		//FileInputStream fis = new FileInputStream("C:\\Users\\Newton\\AmazonAutomation\\HotelBooking\\src\\test\\java\\CaseStudy\\HotelBooking\\globalProps.properties");		
		FileInputStream fis = new FileInputStream("src/test/java/CaseStudy/HotelBooking/globalProps.properties");	
		props.load(fis);
		System.setProperty("webdriver.chrome.driver","chromeDriver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(props.getProperty("url"));
		driver.manage().window().maximize();
		return driver;
	}
	
	public static String credentials(String property) throws IOException
	{
		props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Newton\\AmazonAutomation\\HotelBooking\\src\\test\\java\\CaseStudy\\HotelBooking\\credentials.properties");
		props.load(fis);
		String credata = props.getProperty(property);
		return credata;	
	}
	
	public static String userdetail(String property) throws IOException
	{
		props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Newton\\AmazonAutomation\\HotelBooking\\src\\test\\java\\CaseStudy\\HotelBooking\\userdetails.properties");
		props.load(fis);
		String userdata = props.getProperty(property);
		return userdata;
		
		
	}
}
