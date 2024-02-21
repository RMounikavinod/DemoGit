


import io.cucumber.java.en.*;

public class Login {

	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	   System.out.println(">>user navigates to ogin page");
	}

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String emailaddress) {
	    System.out.println(">>user enters email address"+emailaddress);
	}

	@When("^Enters valid password (.+)$")
	public void enters_valid_password(String password) {
	    System.out.println(">>enter valid password"+password);
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    System.out.println(">>click on login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
	    System.out.println(">>user should login successfully");
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidemailaddress) {
	   System.out.println(">>user enters invalid email address"+invalidemailaddress);
	}

	@When("Enters invalid password {string}")
	public void enters_invalid_password(String invalidpassword) {
	   System.out.println(">>enters invalid password"+invalidpassword);
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
	    System.out.println(">>user should get proper warnnig message");
	}

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
	   System.out.println(">.user dont enter any credentials");
	}
}
