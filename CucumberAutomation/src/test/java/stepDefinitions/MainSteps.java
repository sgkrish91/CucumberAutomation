package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on Net Banking login page")
	public void user_is_on_net_banking_login_page() {
	    System.out.println("User is on the Login page");
	}
	
	@Given("User is on the sign up page")
	public void user_is_on_the_sign_up_page() {
	    System.out.println("User is on sign up page");
	}
	@When("User sign up in to the application")
	public void user_sign_up_in_to_the_application(List <String> data) {
		System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	    
	}
	
//	@When("User login to the application with username {string} and password {string}")
//	public void user_login_to_the_application_with_username_and_password(String username, String password) {
//	    System.out.println("Username : " + username + " and Password : " + password);
//	}
	
	@When("^User login to the application with username (.+) and password (.+)$")
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
	
	@Given("Setup the entries in the database")
	public void setupEntries() {
		System.out.println("\n ***********************");
		System.out.println("Setup the entries in database");
	}
	
	@When("User launches the browser")
	public void launchBrowser() {
		System.out.println("User launches the browser");
	}
	
	@When("User hits the homepage url of banking site")
	public void hitHomePage() {
		System.out.println("User hits the homepage url");
	}

}
