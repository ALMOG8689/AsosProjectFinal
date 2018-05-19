package asos.test;

import org.testng.annotations.Test;
import asos.core.BaseDriver;
import asos.core.CommonConfig;
import asos.pages.AsosCareerPage;
import asos.pages.AsosHomePage;

import junit.framework.Assert;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class searchCareerTest extends BaseDriver {

	@BeforeMethod(enabled = true)
	public void SigningInTest(){
		startSession();
		PageFactory.initElements(driver, asos.pages.AsosHomePage.class);
		PageFactory.initElements(driver, asos.pages.AsosCareerPage.class);
		
	}
	@Test (groups = "System")
	public void searchCareer()
	{
		//driver.findElement(By.cssSelector("button[class = '_2np3kDs']")).click();
		CommonConfig.waitForElement(driver, AsosHomePage.careerButton);		
		AsosHomePage.careerButton.click();
		CommonConfig.waitForElement(driver, AsosCareerPage.workForUsButton);
		AsosCareerPage.workForUsButton.click();
		Assert.assertEquals("ASOS Careers", driver.getTitle());
	}
	
	
	@AfterMethod
	public void AfterMethod() {
		stopSession();
		
		
	}
}
//1
