package com.trying.serenity.steps.serenity;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.trying.serenity.pages.HomeScreen;
import com.trying.serenity.utils.CommonMethods;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;




public class EnterDetails extends CommonMethods{

	HomeScreen home;

	@Step
	public void am_on_search_flights_page() {
		CommonMethods.initialization();
	  
	}

	@Step
	public void enter_Source_City() {
		home= new HomeScreen();
		if(prop.getProperty("tripType").equals("OneWay")) {
			
			home.selectTripTypeOneWay();
		}

		home.selectFromPlace(prop.getProperty("fromPlace"));
		List<WebElement> str = home.sourceCityLists();
		str.stream().forEach(System.out::println);
		
	    str.stream()                                                  // Convert to stream
			.filter(x -> prop.getProperty("selectToCity").equals(x.getText()))        
            .findFirst()
		    .ifPresent(ele -> ele.click()); 
	
    }
	
	@Step
	public void enter_Destination_City()  {
		home.selectToPlace(prop.getProperty("toPlace"));
		List<WebElement> strNew = home.destinationCityLists();
		
	        		
		strNew.stream()                                                  // Convert to stream
			.filter(x -> prop.getProperty("selectFromCity").equals(x.getText()))        
            .findFirst()
		    .ifPresent(ele -> ele.click()); 
	}
	

	@Step
	public void select_the_journey_date()  {
	    
		home.selectDepartureDate();
		List<WebElement> allDates=home.departureDates();

		long count = allDates.stream().count();
		allDates.stream()
		   .filter(x -> prop.getProperty("departureDate").equals(x.getText()))  
		   .skip(1)
		   .findFirst()
		   .ifPresent(ele -> ele.click());
	}

	@Step
	public void select_the_number_of_adults()  {
		
		WebElement adults = ((prop.getProperty("adults").equals("0")) ? null : Integer.parseInt(prop.getProperty("adults"))>9? null : home.noOfAdults());

		if(adults!=null) {
			
		 Select select = new Select(home.noOfAdults()); 
	     List<WebElement> allOptions = select.getOptions();
	     
	   
	     allOptions.stream()
		   .filter(x -> prop.getProperty("adults").equals(x.getText()))  
		   .findFirst()
		   .ifPresent(ele -> ele.click());
	     
	}
	}
	
	@Step
	public void select_the_number_of_children() {

		WebElement children = ((prop.getProperty("children").equals("0")) ? null : Integer.parseInt(prop.getProperty("children"))>5? null : home.noOfChildren());
		
		if(children!=null) {
			
		     Select select = new Select(home.noOfChildren()); 
		     List<WebElement> allOptions = select.getOptions();
		     
		   
		     allOptions.stream()
			   .filter(x -> prop.getProperty("children").equals(x.getText()))  
			   .findFirst()
			   .ifPresent(ele -> ele.click());
		}
	}
	
	@Step
	public void select_the_number_of_infants() {
		WebElement infant = ((prop.getProperty("infants").equals("0")) ? null : Integer.parseInt(prop.getProperty("infants"))>4? null : home.noOfInfants());

		if(infant!=null) {
			
			Select select = new Select(home.noOfInfants()); 
		     List<WebElement> allOptions = select.getOptions();
		     
		   
		     allOptions.stream()
			   .filter(x -> prop.getProperty("infants").equals(x.getText()))  
			   .findFirst()
			   .ifPresent(ele -> ele.click());
		}
	}
	
	@Step
	public void tap_on_Submit_button()  {
	  home.searchFlight().click();
	}
}
