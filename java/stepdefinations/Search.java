package stepdefinations;

import io.cucumber.java.en.*;

public class Search {

	@Given("User opens the application")
	public void user_opens_the_application() {
	   System.out.println(">>user opens the application");
	}

	@When("User enters valid product into search field")
	public void user_enters_valid_product_into_search_field() {
	    System.out.println(">>user enters valid product into search field");
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	    System.out.println(">>user clicks on search button");
	}

	@Then("valid product should get displayed on search results")
	public void valid_product_should_get_displayed_on_search_results() {
	    System.out.println(">>valid product should get displayed on search results");
	}

	@When("User enters non-existing product into search field")
	public void user_enters_non_existing_product_into_search_field() {
	   System.out.println(">>user enters non-existing product into search field");
	}

	@Then("proper text informing the user no product maching should be displayed")
	public void proper_text_informing_the_user_no_product_maching_should_be_displayed() {
	    System.out.println(">>proper text informing the user no product maching should be displayed");
	}

	@When("User dont enter any  product into search field")
	public void user_enters_dont_enter_any_product_into_search_field() {
	    System.out.println(">>uesr dont enter any product into search field");
	}
}
