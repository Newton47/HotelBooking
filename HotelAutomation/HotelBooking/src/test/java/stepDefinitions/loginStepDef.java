package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CaseStudy.HotelBooking.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.loginPage;

public class loginStepDef extends Base{

	
	loginPage login;
	
	
	@Given("^User launches the browser$")
	public void user_launches_the_browser() throws Throwable {
		driver = Base.getDriver();
				   
	}

	@Then("^User validates the title of the home page$")
	public void user_validates_the_title_of_the_home_page() throws Throwable {
		login = new loginPage(driver);
		String loginPageTitle = login.getLoginTitle();
		Assert.assertTrue(loginPageTitle.contains("Hotel Booking Application"));
		System.out.println("Title is verified");
		
		//Thread.sleep(3000);
	}

	@When("^User clicks on the Login button without entering username$")
	public void user_clicks_on_the_Login_button_without_entering_username() throws Throwable {
	    login.clickLogin();
	    System.out.println("Login button clicked");
	    
	    
	}

	@Then("^User verifies username error message is thrown$")
	public void user_verifies_username_error_message_is_thrown() throws Throwable {
		
		String userErr = login.getUserErr();
		
	    Assert.assertTrue(userErr.contains("* Please enter userName."));
	    
	}

	@Then("^User enters the username$")
	public void user_enters_the_username() throws Throwable {
		
	    login.setUserName(Base.credentials("username"));
	 
	}

	@Then("^clicks on the Login button$")
	public void clicks_on_the_Login_button() throws Throwable {
	    login.clickLogin();
	    WebDriverWait wait = new WebDriverWait(driver,5);
	    System.out.println("Login button clicked");
	   
	}

	@Then("^User verifies password error message is thrown$")
	public void user_verifies_password_error_message_is_thrown() throws Throwable {
	    String passErr = login.getPassErr();
	    Assert.assertTrue(passErr.contains("* Please enter password."));
	   
	}

	@Then("^User enter the password$")
	public void user_enter_the_password() throws Throwable {
		login.setPassword(Base.credentials("password"));
	}

	@Then("^the user is successfully logged into HotelBookingForm page$")
	public void the_user_is_successfully_logged_into_HotelBookingForm_page() throws Throwable {
	
	}

	}

