package com.cucumberTest.pageobject;
import com.cucumber.pageui.commonData;
import com.cucumber.pageui.homepageui;
import com.cucumber.pageui.searchresultui;
import com.cucumber.resuablecomponents.CommonFunctions;


public class searchresultpage extends CommonFunctions
{   
	CommonFunctions cf = new CommonFunctions();
	searchresultui sr = new searchresultui();
	
	public void clickfirstproduct(){
		if(cf.isElementPresent(driver,sr.firstproduct)){
			cf.clickElement(driver, sr.firstproduct);
			System.out.println("first Iphone 6 clicked");
		}
	}

}
