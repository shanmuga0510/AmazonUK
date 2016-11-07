package com.cucumberTest.pageobject;
import com.cucumber.pageui.commonData;
import com.cucumber.pageui.homepageui;
import com.cucumber.pageui.pippageui;
import com.cucumber.pageui.searchresultui;
import com.cucumber.resuablecomponents.CommonFunctions;


public class pippage extends CommonFunctions
{   
	CommonFunctions cf = new CommonFunctions();
	pippageui pip = new pippageui();
	
	
	public void verifypippage(){
		if(cf.isElementPresent(driver,pip.qty)){
			System.out.println("PIP page is displayed");
		}
	}
	
	public void updateQTY(){
		if(cf.isElementPresent(driver,pip.qty)){
			cf.selectbyvalue(driver, pip.qty, "3");
			System.out.println("Qty 3 updated");
		}
	}
	
	
	public void clickaddtocart(){
		if(cf.isElementPresent(driver,pip.addtocart)){
			cf.clickElement(driver, pip.addtocart);
			System.out.println("Add to cart clicked");
		}
	}
	
	public void clickcheckout(){
		if(cf.isElementPresent(driver,pip.btncheckout)){
			cf.clickElement(driver, pip.btncheckout);
			System.out.println("check out button is clicked");
		}
	}
	
	

}
