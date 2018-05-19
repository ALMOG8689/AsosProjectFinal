package asos.test;

import org.testng.annotations.Test;

import asos.core.BaseDriver;
import asos.core.CommonConfig;
import asos.pages.AsosHomePage;


import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AsosHomePageTest extends BaseDriver {
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  	DOMConfigurator.configure("log4j.xml");
		startSession();
		PageFactory.initElements(driver, asos.pages.AsosHomePage.class);
		
  }
  
  
  @Test(groups = "Sanity")
  public void checkHeader(){
	  
	  CommonConfig.waitForElement(driver, AsosHomePage.headerLogo);
	  String actual = AsosHomePage.headerLogo.getAttribute("innerText");
	  String expected = "MEN";
	  Assert.assertEquals(actual, expected);
	  
	  
  }
  
  @Test(groups = "Sanity")
  public void checkFooter(){
	  CommonConfig.waitForElement(driver, AsosHomePage.footerLogo);
	  String actual = AsosHomePage.footerLogo.getAttribute("innerText");
	  String expected = "Privacy & Cookies";
	  Assert.assertEquals(actual, expected);
	  
	  
  }
  
  @AfterMethod
	public void AfterMethod() {
		stopSession();
		
		
	}
  

}
