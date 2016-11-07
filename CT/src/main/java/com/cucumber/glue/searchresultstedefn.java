package com.cucumber.glue;
import com.cucumber.resuablecomponents.CommonFunctions;
import com.cucumberTest.pageobject.homepage;
import com.cucumberTest.pageobject.searchresultpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class searchresultstedefn {

	@When("^I search for Iphone in Amazon$")
	public void I_search_for_Iphone_in_Amazon() throws Throwable {
		homepage hp =  new homepage();
		hp.searchkeyword();
	}


   @And("^I Select Iphone link in plp page$")
   public void I_see_Products_listing_in_PLP_Page() throws Throwable {
	searchresultpage search =  new searchresultpage();
	search.clickfirstproduct();
}
   
   @And("^Select Iphone link$")
   public void Select_Iphone_link() throws Throwable {
	homepage hp =  new homepage();
	hp.searchkeyword();
   
   }
}