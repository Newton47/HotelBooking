package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="userPwd")
	WebElement password;
	
	@FindBy(className="btn")
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[@id='userErrMsg']")
	WebElement usrnmErr;
	
	@FindBy(id="pwdErrMsg")
	WebElement pwdmsgErr;
	
	@FindBy(xpath="//h1[contains(text(),'Hotel Booking Application')]")
	WebElement heading;
	
	@FindBy(xpath="//h2[contains(text(),'Hotel Booking Form')]")
	WebElement HotelForm; 
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String strUserName){

		username.sendKeys(strUserName);     
    }
	
	public void setPassword(String strPassword){

		password.sendKeys(strPassword);
	}	
	
	public void clickLogin(){

		LoginBtn.click();
    }  
	
	public String getLoginTitle(){

	  return heading.getText();
	} 
	
	public String getUserErr(){
		return usrnmErr.getText();
	}
	
	public String getPassErr(){
		return pwdmsgErr.getText();
	}
	
	public String getFormTitle(){
		return HotelForm.getText();
	}
	
	public void loginToHotel(String strUserName,String strPasword){
		this.setUserName(strUserName);
		this.setPassword(strPasword);
		this.clickLogin();
	}


}
