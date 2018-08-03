package com.trying.serenity.steps.serenity;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trying.serenity.pages.HomeScreen;
import com.trying.serenity.pages.SearchResultsPage;
import com.trying.serenity.utils.CommonMethods;


import net.thucydides.core.annotations.Step;




public class SearchResults extends CommonMethods{

	HomeScreen home;
	SearchResultsPage search;
	List<WebElement> str;
	List<WebElement> flightPrice;
	
	@Step
   public void am_on_search_results_page()  {
	
		search= new SearchResultsPage();
		WebDriverWait wait = new WebDriverWait(driver, 20);
	
		WebElement element = wait.until(ExpectedConditions.visibilityOf(search.visibleTextFind())); 
		 
	}
	
	@Step
	public void tap_book()  {
		//	search = new SearchResults();
		str = search.flightLists();

	//	str.stream().filter(x-> x.getText().equals("))
		
		flightPrice=search.getPrice();

	
		
		flightPrice.stream().forEach((element)->{
			
			String newPrice= Pattern.compile("").splitAsStream(element.getText())
				    .filter(x-> !x.contains("₹")&& !x.contains(","))
				    .collect(Collectors.joining());
			System.out.println(newPrice);
				});
		
	
			
		
			
		String time, price;
			for(int i=1;i<str.size();i++) {
				
				time= driver.findElement(By.xpath("//ul[@class='listView flights']/li["+(i)+"]/table/tbody[2]/tr[1]/th[2]")).getText();
			
			   if(time.equals(prop.getProperty("flightTime")) ){
					
					driver.findElement(By.xpath("//ul[@class='listView flights']/li["+(i)+"]/table/tbody[2]/tr[2]/td[3]/button")).click();
				}
			}
			   

		}
	
	@Step
	   public void select_seat()  {
	
		driver.findElement(By.xpath("//div[@id='beforeMeals']/div/div[2]/button")).click();
		
		 
		
		 
		}
}


