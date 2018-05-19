package asos.test;

import org.testng.annotations.Test;
import asos.core.BaseDriver;
import asos.core.CommonConfig;
import asos.pages.AsosHomePage;
import asos.pages.AsosSignIn;
import junit.framework.Assert;

import java.util.logging.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class SignOutTest extends BaseDriver {
	private static Logger Log = Logger.getLogger(SignOutTest.class.getName());

	@BeforeMethod(enabled = true)
	public void SigningInTest(){
		DOMConfigurator.configure("log4j.xml");

		startSession();
		PageFactory.initElements(driver, asos.pages.AsosHomePage.class);
		PageFactory.initElements(driver, asos.pages.AsosMyAccount.class);
		PageFactory.initElements(driver, asos.pages.AsosSignIn.class);
		

	}

	@Test(groups = "Sanity")
	public void HappyFlow()//happy
	{
		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();
		
		Log.info("Wait for Sign in button to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.signInButton);
		
		Log.info("Click on sign in link");
		AsosHomePage.signInButton.click();
		
		Log.info("Insert email");
		asos.pages.AsosSignIn.emailAddressInput.sendKeys(username);
		
		Log.info("Insert password");
		asos.pages.AsosSignIn.passwordInput.sendKeys(password); 
		
		Log.info("Wait for Sign in button to be loaded");
		CommonConfig.waitForElement(driver, AsosSignIn.signInButton);
		
		Log.info("Click on Sign in");
		asos.pages.AsosSignIn.signInButton.click();//till here is the sign in procedure
		
		Log.info("Wait for Account Icon to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.AccountInfoButton);
		
		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();
	
		Log.info("Wait for sign out button to be loaded");

		CommonConfig.waitForElement(driver, AsosHomePage.signOutButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.info("Click sign out button");
		AsosHomePage.signOutButton.click();
		
		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();
		
		Log.info("Assert");

		String nameOFUser = "";
		WebElement element = driver.findElement(By.xpath("//*[@id='myAccountDropdown']/div/div/div/div[1]/div/span"));
		Assert.assertTrue(nameOFUser.equals(element.getAttribute("innerText"))); 
		System.out.println("HappyFlow passed");
		
	}
	
	
	@AfterMethod
	public void AfterMethod() {
		stopSession();
		
		
	}
//1
}




