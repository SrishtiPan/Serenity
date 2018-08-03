package com.trying.serenity.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trying.serenity.steps.serenity.SearchResults;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchFlightSteps {
	@Steps
	SearchResults enter;
	
	WebDriver browser;
	
	@Given("^I am on search results page$")
public void i_am_on_search_results_page()  {
		
		enter.am_on_search_results_page();
		
	}

	@When("^I see the flight with correct departure time I tap on book$")
	public void i_tap_book()  {
		
		enter.tap_book();
		   

		}
	@And("^I select seat$")
	public void i_select_seat()  {
		
		enter.select_seat();
		   

		}
	 
}
