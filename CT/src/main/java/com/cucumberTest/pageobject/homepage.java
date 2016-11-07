package com.cucumberTest.pageobject;
import com.cucumber.pageui.commonData;
import com.cucumber.pageui.homepageui;
import com.cucumber.resuablecomponents.CommonFunctions;


public class homepage extends CommonFunctions
{   
	CommonFunctions cf = new CommonFunctions();
	homepageui hp = new homepageui();
	
	public void openhomePage(){
		driver.navigate().to("https://www.amazon.co.uk/");
	}	

	public void searchkeyword(){
		if(cf.isElementPresent(driver,hp.lblsearchkeyword)){
			System.out.println("Search Lable is present");
			cf.typevalue(driver, hp.lblsearchkeyword, "iphone 6");
			cf.clickElement(driver, hp.btnSearchIcon);
			System.out.println("Iphone 6 keyword searched");
		}
	}

}
