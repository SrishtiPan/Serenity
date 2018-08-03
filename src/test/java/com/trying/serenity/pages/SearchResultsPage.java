package com.trying.serenity.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trying.serenity.utils.CommonMethods;

public class SearchResultsPage extends CommonMethods{
	@FindBy(xpath="//ul[contains(@class, 'list clearFix inline ')]/li/label")
	WebElement visibleText;
	
	@FindBy(xpath="//ul[@class='listView flights']/li")
	List<WebElement> flightList;
	
	@FindBy(id="BaggageBundlingTemplate")
	List<WebElement> price;
	
	public WebElement visibleTextFind() {
		return visibleText;
		}
	
	public List<WebElement> flightLists() {
		return flightList;
		}

	public List<WebElement> getPrice() {
		return price;
		}
	
public SearchResultsPage() {
		
		PageFactory.initElements(driver, this);
	}
}
