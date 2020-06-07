package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation
public class StepDefination {

	@Before({"@macroFilter"})
	public void setUp() {
		System.out.println("haha");
	}
	
	@Given("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello1");
	    throw new PendingException();
	}

	@When("^User is logging in with username and password$")
	public void user_is_logging_in_with_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello2");
	    throw new PendingException();
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello3");
	    throw new PendingException();
	}
	
	@After({"@macroFilter"})
	public void tearDown() {
		System.out.println("baba");
	}
}
