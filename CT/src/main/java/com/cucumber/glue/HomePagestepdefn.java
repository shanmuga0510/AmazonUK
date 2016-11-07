package com.cucumber.glue;
import com.cucumber.resuablecomponents.CommonFunctions;
import com.cucumberTest.pageobject.homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class HomePagestepdefn {

	@Given("^I am a customer on Amazon$")
	public void I_have_open_the_browser() throws Throwable {
		CommonFunctions CF = new CommonFunctions();
		CF.openbrowser();	
		homepage home =  new homepage();
		home.openhomePage();
	}

	
}
