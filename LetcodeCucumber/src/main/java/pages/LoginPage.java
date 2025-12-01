package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	@Given("User should navigate to the application")
	public void userShouldNavigateToTheApplication() {
	   
	}
	
	@Given("User Enter the username as {string}")
	public void userEnterTheUsernameAs(String string) {
	   
	}
	@Given("User Enter the password as {string}")
	public void userEnterThePasswordAs(String string) {
	   
	}
	@When("User click the login button")
	public void userClickTheLoginButton() {
	   
	}
	@Then("Login should be failed")
	public void loginShouldBeFailed() {
	   
	}
	@Then("Login should be success")
	public void loginShouldBeSuccess() {
	 
	}
	@Given("User should enter the {string} and {string}")
	public void userShouldEnterTheAnd(String name, String pass) {
	    this.userEnterTheUsernameAs(name);
	    this.userEnterThePasswordAs(pass);
	    this.userClickTheLoginButton();
	   
	}
}
