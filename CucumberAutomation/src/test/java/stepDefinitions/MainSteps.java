package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on Net Banking login page")
	public void user_is_on_net_banking_login_page() {
	    System.out.println("User is on the Login page");
	}
	@When("User login to the application with username {string} and password {string}")
	public void user_login_to_the_application_with_username_and_password(String username, String password) {
	    System.out.println("Username : " + username + " and Password : " + password);
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    System.out.println("Home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    System.out.println("Card details are displayed correctly");
	}

}
