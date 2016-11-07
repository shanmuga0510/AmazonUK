package com.cucumberTest.pageobject;
import org.openqa.selenium.By;

import com.cucumber.resuablecomponents.CommonFunctions;

public class loginpage extends CommonFunctions
{   

	CommonFunctions cf = new CommonFunctions();
	public void clicklogin(){
		if(driver.findElement(By.id("signInSubmit")).isEnabled()) { 
			cf.typevalue(driver, By.id("ap_email"), "shanmuga0510@gmail.com");
			cf.typevalue(driver, By.id("ap_password"), "mosquito");
			cf.clickElement(driver, By.id("signInSubmit"));
			System.out.println("login successful"); 
		} else { 
			System.out.println("login failed"); 
		} 		 
	} 
	
	
	public void clickdeliveryaddress(){
		if(driver.findElement(By.cssSelector(".a-declarative.a-button-text")).isEnabled()) { 
			cf.clickElement(driver, By.cssSelector(".a-declarative.a-button-text"));
			System.out.println("click delivery address"); 
		} else { 
			System.out.println("login failed"); 
		} 		 
	} 
	
}	


