package com.cucumber.glue;

import com.cucumber.resuablecomponents.CommonFunctions;
import com.cucumberTest.pageobject.homepage;
import com.cucumberTest.pageobject.loginpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPagestepDefn {

	
	@And("^enter valid regsiter details to login$")
	public void see_login_register_page () throws Throwable { 
		loginpage login = new loginpage();
		login.clicklogin();
    }
    
       
    @Then("^I click delivery address$")
   	public void enter_valid_address_and_make_payment () throws Throwable { 
    	loginpage login = new loginpage();
		login.clickdeliveryaddress();
       }
	}
	

