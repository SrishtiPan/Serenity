package com.trying.serenity.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trying.serenity.utils.CommonMethods;

public class ItineraryPage extends CommonMethods{

	
	@FindBy(xpath="//ul[contains(@class, 'list clearFix inline ')]/li/label")
	WebElement visibleText;
	
	@FindBy(xpath="//div[@id='beforeMeals']/div/div[2]/button")
	List<WebElement> flightList;
	
	public WebElement visibleTextFind() {
		return visibleText;
		}
	public List<WebElement> flightLists() {
		return flightList;
		}

public ItineraryPage() {
		
		PageFactory.initElements(driver, this);
	}
}
