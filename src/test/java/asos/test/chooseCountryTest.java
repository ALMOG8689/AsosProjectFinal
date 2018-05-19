package asos.test;

import org.testng.annotations.Test;

import asos.core.BaseDriver;
import asos.core.CommonConfig;
import asos.pages.AsosChooseCountryCurrencyPage;
import asos.pages.AsosHomePage;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class chooseCountryTest extends BaseDriver {
	
	static Logger logger = Logger.getLogger(chooseCountryTest.class);
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  	DOMConfigurator.configure("log4j.xml");
	  	startSession();
		PageFactory.initElements(driver, AsosHomePage.class);
		PageFactory.initElements(driver, AsosChooseCountryCurrencyPage.class);
  }
	@Test(groups = "Regression")
  public void ChooseCountryCurrency() {
	  
	  CommonConfig.waitForElement(driver, AsosHomePage.shoppingFromButton);
	  AsosHomePage.shoppingFromButton.click();
	  logger.info("TESTTTTTTTTTT!!!");
	  CommonConfig.waitForElement(driver, AsosChooseCountryCurrencyPage.countryButtonSelect);
	  Select dropdown= new Select(AsosChooseCountryCurrencyPage.countryButtonSelect);
	  dropdown.selectByIndex(103);
	  
	  CommonConfig.waitForElement(driver, AsosChooseCountryCurrencyPage.currencyButtonSelect);
	  Select dropdown2= new Select(AsosChooseCountryCurrencyPage.currencyButtonSelect);
	  dropdown2.selectByIndex(1);

	  CommonConfig.waitForElement(driver, AsosChooseCountryCurrencyPage.updatePreferencesButton);
	  AsosChooseCountryCurrencyPage.updatePreferencesButton.click();
	  
	  CommonConfig.waitForElement(driver, AsosHomePage.shoppingFromImage);
	  String actualCountry = "Israel";
	  String expectedCountry = AsosHomePage.shoppingFromImage.getAttribute("alt");
	  Assert.assertEquals(actualCountry,expectedCountry);
	  
	  
	  
  }
	
	@AfterMethod
	public void AfterMethod() {
		stopSession();
		
		
	}

//1
}
