package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CaseStudy.HotelBooking.Base;

public class bookingPage extends Base {
	
	WebDriver driver;
	@FindBy(xpath="//input[@id='btnPayment']")
	WebElement bookBtn;
	
	
	@FindBy(xpath="//input[@id='txtFirstName']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='txtLastName']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='txtEmail']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='txtPhone']")
	WebElement mobile;
	
	@FindBy(xpath="//td/textarea")
	WebElement address;
	
	@FindBy(xpath="//input[@id='txtCardholderName']")
	WebElement cardholdername;
	
	@FindBy(xpath="//input[@id='txtDebit']")
	WebElement debitcard;
	
	@FindBy(xpath="//input[@id='txtCvv']")
	WebElement cvv;
	
	@FindBy(xpath="//input[@id='txtMonth']")
	WebElement expmonth;
	
	@FindBy(xpath="//input[@id='txtYear']")
	WebElement expyear;
	
	@FindBy(xpath="//h1[contains(text(),'Booking Completed!')]")
	WebElement bookCfm;
	
	public bookingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickBook(){

		bookBtn.click();
    }  
	
	public void setfname(String firstname)
	{
		fname.sendKeys(firstname);
	}
	
	public void setlname(String lastname)
	{
		lname.sendKeys(lastname);
	}
	
	public void setmail(String mails)
	{
		email.sendKeys(mails);
	}
	
	
	public void mobile(String mob)
	{
		mobile.sendKeys(mob);
	}
	
	public void addresses(String add)
	{
		address.sendKeys(add);
	}
	
	public void cardHolder(String cname)
	{
		cardholdername.sendKeys(cname);
	}
	
	public void cardNum(String cnum)
	{
		debitcard.sendKeys(cnum);
	}
	
	public void cardCvv(String cvvnum)
	{
		cvv.sendKeys(cvvnum);
	}
	
	public void expirymonth(String month)
	{
		expmonth.sendKeys(month);
	}
	
	public void expiryyear(String year)
	{
		expyear.sendKeys(year);
	}
	
	public String getConfirmTitle()
	{
		return bookCfm.getText();
	}

}
