package com.cucumber.resuablecomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.pageui.commonData;



public class CommonFunctions extends commonData {
	
	public void openbrowser(){	 
		String myCurrentDir = System.getProperty("user.dir");
		System.out.println("Browser invoked");
		System.setProperty("webdriver.chrome.driver", myCurrentDir+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		commonData.driver = driver;
		driver.manage().window().maximize();
	}
	
	public void closebrowser(){
		driver.close();
	}

	/**
	 * Method to check element is present within parent element
	 * 
	 * @param driver
	 * @param elementBy
	 * @return
	 */
	public boolean isElementPresent(WebDriver driver, By elementBy) {
		boolean elementPresent = false;
		try {
			elementPresent = driver.findElement(elementBy).isDisplayed();
		} catch (Exception ex) {
			System.out
			.println("Exception occured while finding element within element");
		}
		return elementPresent;
	}


	/**
	 * Method to click element within parent element
	 * 
	 * @param element
	 * @param elementBy
	 */
	public void clickElement(WebDriver driver, By elementBy) {
		if (isElementPresent(driver, elementBy)) {
			driver.findElement(elementBy).click();
		}
	}
	
	
   public void typevalue(WebDriver driver, By elementBy,String strvalue){
	   if (isElementPresent(driver, elementBy)) {
		   driver.findElement(elementBy).clear();
			driver.findElement(elementBy).sendKeys(strvalue);
		}
   }
   
   
   public void selectbyvalue(WebDriver driver, By elementBy,String strvalue){
	   if (isElementPresent(driver, elementBy)) {
	   Select oSelect = new Select(driver.findElement(elementBy));	   
	   oSelect.selectByValue(strvalue);
	   }
   }
   

}
