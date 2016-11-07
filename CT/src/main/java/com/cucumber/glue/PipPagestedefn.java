package com.cucumber.glue;
import com.cucumber.resuablecomponents.CommonFunctions;
import com.cucumberTest.pageobject.homepage;
import com.cucumberTest.pageobject.pippage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class PipPagestedefn {

	@And("^see PIP Page$")
	public void see_PIP_Page() throws Throwable {
		pippage pip =  new pippage();
		pip.verifypippage();
	}
	
	@And("^select 3 qty in pip page$")
	public void select_qty_in_pip_page() throws Throwable {
		pippage pip =  new pippage();
		pip.updateQTY();
	}
	
	@When("^I click add to cart button from pip page$")
	public void i_click_add_to_cart_button_from_pip_page() throws Throwable {
		pippage pip =  new pippage();
		pip.clickaddtocart();
	}
	
	@And("^Proceed checkout$")
	public void Proceed_checkout() throws Throwable {
		pippage pip =  new pippage();
		pip.clickcheckout();
	}
	
}

