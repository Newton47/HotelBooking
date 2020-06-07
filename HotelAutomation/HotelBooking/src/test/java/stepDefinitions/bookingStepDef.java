package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import CaseStudy.HotelBooking.Base;
import cucumber.api.java.en.Then;
import pageObjects.bookingPage;

public class bookingStepDef extends Base{

	bookingPage book;
	
	public String getError() {
		String errTxt = driver.switchTo().alert().getText();
		return errTxt;
	}
    	
	public void acceptError() {
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
	}
	
	
	
	@Then("^User validates error by clicking the ConfirmBooking button without entering firstName$")
	public void user_validates_error_by_clicking_the_ConfirmBooking_button_without_entering_firstName() throws Throwable {

		book = new bookingPage(driver);
		book.clickBook();
		
		
		getError();
		Assert.assertTrue(getError().contains("Please fill the First Name"));
		System.out.println(getError());
		
		acceptError(); 
		
	}	 
		 
	@Then("^User enters the firstName$")
	public void user_enters_the_firstName() throws Throwable {
	
		book.setfname(Base.userdetail("firstname"));
		
	}

	@Then("^User validates error on clicking the ConfirmBooking button without entering lastName$")
	public void user_validates_error_on_clicking_the_ConfirmBooking_button_without_entering_lastName() throws Throwable {

		book.clickBook();
		
		
		getError();
		Assert.assertTrue(getError().contains("Please fill the Last Name"));
		System.out.println(getError());
		acceptError(); 
	
	}

	@Then("^User enters the lastName$")
	public void user_enters_the_lastName() throws Throwable {
		
		book.setlname(Base.userdetail("lastname"));
		
	
	}

	@Then("^User validates error on clicking the ConfirmBooking button entering improper email$")
	public void user_validates_error_on_clicking_the_ConfirmBooking_button_entering_improper_email() throws Throwable {
		
		book.setmail(Base.userdetail("impropermail"));
		book.clickBook();
		Thread.sleep(2000);
		
		getError();
		Assert.assertTrue(getError().contains("Please enter valid Email Id."));
		System.out.println(getError());
		Thread.sleep(2000);
		
		acceptError();
		WebElement mailBox = driver.findElement(By.xpath("//input[@id='txtEmail']"));
		mailBox.clear();

	}

	@Then("^User enter proper email$")
	public void user_enter_proper_email() throws Throwable {	
		book.setmail(Base.userdetail("email"));

	}

	@Then("^User validates error on clicking the ConfirmBooking button without entering mobile number$")
	public void user_validates_error_on_clicking_the_ConfirmBooking_button_without_entering_mobile_number() throws Throwable {
	
		book.clickBook();
		
		getError();
		Assert.assertTrue(getError().contains("Please fill the Mobile No."));
		System.out.println(getError());
		Thread.sleep(2000);
		acceptError(); 
		
	}

	@Then("^User validates error on clicking the ConfirmBooking button entering improper mobile number$")
	public void user_validates_error_on_clicking_the_ConfirmBooking_button_entering_improper_mobile_number() throws Throwable {
	  
		
		String mob[] ={"improperlen","improperstartdigit"};
		for(int i=0;i<mob.length;i++)
		{	
			
		book.mobile(Base.userdetail(mob[i]));
		book.clickBook();		
		
		getError();
		Thread.sleep(2000);
		Assert.assertTrue(getError().contains("Please enter valid Contact no."));
		System.out.println(getError());
		
		acceptError(); 
		Thread.sleep(2000);
		
		WebElement numberBox = driver.findElement(By.xpath("//input[@id='txtPhone']"));
		numberBox.clear();
	
		}
	}

	@Then("^User enters the mobile number$")
	public void user_enters_the_mobile_number() throws Throwable {
		
		book.mobile(Base.userdetail("mobilenum"));
	

	}

	@Then("^User enters address$")
	public void user_enters_address() throws Throwable {
		
		book.addresses(Base.userdetail("address"));

	}

	@Then("^User clicks on ConfirmBooking button without entering city page throws error$")
	public void user_clicks_on_ConfirmBooking_button_without_entering_city_page_throws_error() throws Throwable {
		
		book.clickBook();	
		getError();
		Assert.assertTrue(getError().contains("Please select city"));
		System.out.println(getError());
		
		acceptError(); 
		
	
	}

	@Then("^User enters city$")
	public void user_enters_city() throws Throwable {
	 
		Select citySelect = new Select(driver.findElement(By.name("city")));
		citySelect.selectByValue("Bangalore");
		
	}

	@Then("^User clicks on ConfirmBooking button without entering state page throws error$")
	public void user_clicks_on_ConfirmBooking_button_without_entering_state_page_throws_error() throws Throwable {
		
		book.clickBook();	
		
		getError();
		Assert.assertTrue(getError().contains("Please select state"));
		System.out.println(getError());
		
		acceptError(); 

	}

	@Then("^User enters state$")
	public void user_enters_state() throws Throwable {
	
		Select stateSelect = new Select(driver.findElement(By.name("state")));
		stateSelect.selectByValue("Karnataka");
		
	}

	@Then("^User enters number of guests$")
	public void user_enters_number_of_guests() throws Throwable {

		Select guestSelect = new Select(driver.findElement(By.name("persons")));
		guestSelect.selectByValue("2");
	}

	@Then("^User clicks on ConfirmBooking button without entering card holder name page throws error$")
	public void user_clicks_on_ConfirmBooking_button_without_entering_card_holder_name_page_throws_error() throws Throwable {
		
		book.clickBook();	
		
		getError();
		Assert.assertTrue(getError().contains("Please fill the Card holder name"));
		System.out.println(getError());
	
		acceptError(); 
	
	}

	@Then("^User enters card holder name$")
	public void user_enters_card_holder_name() throws Throwable {
		
		book.cardHolder(Base.userdetail("cardholdername"));


	}

	@Then("^User clicks on ConfirmBooking button without entering debit card number page throws error$")
	public void user_clicks_on_ConfirmBooking_button_without_entering_debit_card_number_page_throws_error() throws Throwable {
		
		book.clickBook();	
		
		getError();
		Assert.assertTrue(getError().contains("Please fill the Debit card Number"));
		System.out.println(getError());
		
		acceptError(); 

	}

	@Then("^User enters debit card number$")
	public void user_enters_debit_card_number() throws Throwable {
		
		book.cardNum(Base.userdetail("cardnumber"));

	}

	@Then("^User enters CVV$")
	public void user_enters_CVV() throws Throwable {
		
		book.cardCvv(Base.userdetail("cvvnumber"));

	}

	@Then("^User clicks on ConfirmBooking button without entering expiration month page throws error$")
	public void user_clicks_on_ConfirmBooking_button_without_entering_expiration_month_page_throws_error() throws Throwable {
		
		book.clickBook();	
		
		getError();
		Assert.assertTrue(getError().contains("Please fill expiration month"));
		System.out.println(getError());
		
		acceptError(); 
	    
	}

	@Then("^User enters expiration month$")
	public void user_enters_expiration_month() throws Throwable {
	    
		book.expirymonth(Base.userdetail("expmon"));
	}

	@Then("^User clicks on ConfirmBooking button without entering expiration year page throws error$")
	public void user_clicks_on_ConfirmBooking_button_without_entering_expiration_year_page_throws_error() throws Throwable {

		
		book.clickBook();	
		
		getError();
		Assert.assertTrue(getError().contains("Please fill the expiration year"));
		System.out.println(getError());
		
		acceptError();
		
	}

	@Then("^User enters expiration year$")
	public void user_enters_expiration_year() throws Throwable {
	    
		book.expiryyear(Base.userdetail("expyears"));
	    
	}
	 
	@Then("^User clicks on ConfirmBooking button$")
	public void user_clicks_on_ConfirmBooking_button() throws Throwable {
		
		book.clickBook();	
	}  
	
	@Then("^the BookingComplete is verified$")
	public void the_BookingComplete_is_verified() throws Throwable {
		
		  String completeTitle = book.getConfirmTitle();
		    Assert.assertTrue(completeTitle.contains("Booking Completed!"));
		    System.out.println("Booking is completed");
		    
		    driver.close();
	
	}


}
