package stepdefinations;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Register {

	@Given("User navigates to register account page")
	public void user_navigates_to_register_account_page() {
	    System.out.println(">>user navigates to register account page");
	}

	@When("User enters below details into the fields")
	public void User_enters_below_details_into_the_fields(DataTable dataTable) {
	Map<String, String> map = dataTable.asMap(String.class,String.class);
	
	System.out.println(">>firstname:"+map.get("firstname"));
	System.out.println(">>lastname:"+map.get("lastname"));
	System.out.println(">>emailaddress"+map.get("emailaddress"));
	System.out.println(">>telephone:"+map.get("telephone"));
	System.out.println(">>password:"+map.get("password"));
}

	@When("Selects privacy policy field")
	public void selects_privacy_policy_field() {
	   System.out.println(">>selects privacy policy field");
	}

	@When("Cliks on continue button")
	public void cliks_on_continue_button() {
	    System.out.println(">>clicks on continue button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
	    System.out.println(">>account should get successfully created");
	}

	@When("Selects yes for newsletter field")
	public void selects_yes_for_newsletter_field() {
	   System.out.println(">>Selects Yes for newsletterfield");
	}

	@When("User dont enter details into any fields")
	public void user_dont_enter_details_into_any_fields() {
	    System.out.println(">>user dont enter details into any field");
	}

	@Then("Warning message should be displayed for the mandatory fields")
	public void warning_message_should_be_displayed_for_the_mandatory_fields() {
	   System.out.println(">>warning message should be displayed for the mandatory fields");
	}

	@Then("Warning message informing about duplicate email address")
	public void warning_message_informing_about_duplicate_email_address() {
	    System.out.println(">>warnig message informing about duplicate email address");
	}

}
