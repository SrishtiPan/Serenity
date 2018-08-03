package com.trying.serenity.steps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.trying.serenity.steps.serenity.EnterDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EnterDetailsSteps {
	@Steps
	EnterDetails enter;
	
	WebDriver browser;
	
	 @Given("I am on ClearTrip search flights page")
	    public void givenTheUserIsOnTheWikionaryHomePage() {
		 enter.am_on_search_flights_page() ;
	    }

	 @When("^I enter Source City$")
	    public void whenTheUserLooksUpTheDefinitionOf() {
	    	enter.enter_Source_City();
	    }

	 @When("^I enter Destination City$")
	    public void thenTheyShouldSeeADefinitionContainingTheWords() {
	    	enter.enter_Destination_City();
	    }
	 
	 @When("^I select the journey date$")
	 public void i_select_the_journey_date()  {
	     
		 enter.select_the_journey_date();
	 }
	 
	 @When("^I select the number of adults$")
	 public void i_select_the_number_of_adults()  {
		 enter.select_the_number_of_adults();

		 }
	 
	 @When("^I select the number of children$")
	 public void i_select_the_number_of_children() {
		 enter.select_the_number_of_children();
	 
	 }
	 
	 @When("^I select the number of infants$")
	 public void i_select_the_number_of_infants() {
		 enter.select_the_number_of_infants();
	 	
	 }
	 
	 @When("^I tap on Submit button$")
	 public void i_tap_on_Submit_button()  {
		 enter.tap_on_Submit_button();
	 }
}
