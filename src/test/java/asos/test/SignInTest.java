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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class SignInTest extends BaseDriver {
	private static Logger Log = Logger.getLogger(SignInTest.class.getName());

	@BeforeMethod(enabled = true)
	public void SigningInTest(){
		DOMConfigurator.configure("log4j.xml");

		startSession();
		PageFactory.initElements(driver, asos.pages.AsosHomePage.class);
		PageFactory.initElements(driver, asos.pages.AsosSignIn.class);

	}
	//sign in test
	@Test(groups = "Regression")
	public void HappyFlow()
	{
		//Entering user 

		Log.info("Click on account Icon");
		AsosHomePage.AccountInfoButton.click();

		Log.info("Wait for sign-in button to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.signInButton);

		Log.info("Click on sign in button");
		AsosHomePage.signInButton.click();

		Log.info("Insert email");
		asos.pages.AsosSignIn.emailAddressInput.sendKeys(username);

		Log.info("Insert password");
		asos.pages.AsosSignIn.passwordInput.sendKeys(password);
		//Filled user information

		Log.info("Wait for sign-in button to be loaded");
		CommonConfig.waitForElement(driver, AsosSignIn.signInButton);

		Log.info("Click on sign in button");
		asos.pages.AsosSignIn.signInButton.click();
		//clicking on sign in

		Log.info("Assert");
		String CurrUrl = driver.getCurrentUrl();
		String myAccountUrl="http://www.asos.com/#";
		Assert.assertTrue(CurrUrl.equals(myAccountUrl)); 
		//check if the current url is same as user page.
		System.out.println("HappyFlow passed");
	}
	
	//sign in test upper case
	@Test(groups = "Regression")
	public void HappyFlowUpperCase()
	{
		Log.info("Click on account Icon");
		AsosHomePage.AccountInfoButton.click();

		Log.info("Wait for sign-in button to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.signInButton);

		Log.info("Click on sign in button");
		AsosHomePage.signInButton.click();

		Log.info("Insert email in upper case");
		asos.pages.AsosSignIn.emailAddressInput.sendKeys(username.toUpperCase()); // upper case username test

		Log.info("Insert password");
		asos.pages.AsosSignIn.passwordInput.sendKeys(password);

		Log.info("Wait for sign-in button to be loaded");
		CommonConfig.waitForElement(driver, AsosSignIn.signInButton);

		Log.info("Click on sign in button");
		asos.pages.AsosSignIn.signInButton.click();

		Log.info("Assert");

		String CurrUrl = driver.getCurrentUrl();
		String myAccountUrl="http://www.asos.com/#";
		Assert.assertTrue(CurrUrl.equals(myAccountUrl)); 
		System.out.println("HappyFlowUpperCase passed");
	}
	
	//sign in (N) no password
	@Test(groups = "Regression")
	public void NoPassword()//N
	{
		Log.info("Click on account Icon");
		AsosHomePage.AccountInfoButton.click();

		Log.info("Wait for sign-in button to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.signInButton);

		Log.info("Click on sign in button");
		AsosHomePage.signInButton.click();
		//No password test
		Log.info("Insert password");
		asos.pages.AsosSignIn.emailAddressInput.sendKeys(username);

		Log.info("Wait for sign-in button to be loaded");
		CommonConfig.waitForElement(driver, AsosSignIn.signInButton);

		Log.info("Click on sign in button");
		asos.pages.AsosSignIn.signInButton.click();

		Log.info("Assert");
		String Error1 = AsosSignIn.passwordError.getText();
		Assert.assertTrue(Error1.equals("Hey, we need a password here"));
		System.out.println("NoPassword test passed");
	}
	
	//sign in (N) no username
	@Test(groups = "Regression")
	public void NoUserName()//N
	{
		Log.info("Click on account Icon");
		AsosHomePage.AccountInfoButton.click();

		Log.info("Wait for sign-in button to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.signInButton);

		Log.info("Click on sign in button");
		AsosHomePage.signInButton.click();
		//No username inserterd

		Log.info("Insert password");
		asos.pages.AsosSignIn.passwordInput.sendKeys(password);

		CommonConfig.waitForElement(driver, AsosSignIn.signInButton);

		Log.info("Click on sign in button");
		asos.pages.AsosSignIn.signInButton.click();

		Log.info("Assert");
		String Error1 = AsosSignIn.EmailAddressError.getText();
		Assert.assertTrue(Error1.equals("Oops! You need to type your email here"));
		System.out.println("NoUserName test passed");
	}

	//sign in test with google account
	@Test(groups = "Regression")
	public void SignUpGoogle()//happy
	{
		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();

		Log.info("Wait for sign-in button to be loaded");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='signin-link']")));

		Log.info("Click on sign in link");
		asos.pages.AsosHomePage.signInButton.click();

		Log.info("Click on google button");
		asos.pages.AsosSignIn.googleButton.click();

		Log.info("Switch to the new window");

		for(String winHandle : driver.getWindowHandles() )
		{
			driver.switchTo().window(winHandle);
		}

		Log.info("Assert");
		WebElement element = driver.findElement(By.id("headingText"));
		CommonConfig.waitForElement(driver, element);
		Assert.assertTrue(element.isDisplayed()); 
		System.out.println("SignUpGoogle passed");

	}
	
	//sign in test with twitter acount
	@Test(groups = "Regression")
	public void SignInTwitter()//happy
	{

		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();

		Log.info("Wait for sign-in button to be loaded");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='signin-link']")));

		Log.info("Click on sign in link");
		asos.pages.AsosHomePage.signInButton.click();

		Log.info("Click on twitter button");
		asos.pages.AsosSignIn.twitterButton.click();

		Log.info("Switch to the new window");
		for(String winHandle : driver.getWindowHandles() )
		{
			driver.switchTo().window(winHandle);
		}

		Log.info("Assert");
		WebElement element = driver.findElement(By.xpath("//h1[@class='logo']"));
		Assert.assertTrue(element.isDisplayed()); 
		System.out.println("SignUpTwitter passed");
	}
	
	//sign in test with facebook acount
	@Test(groups = "Regression")
	public void SignUpFacebook()//happy
	{
		
		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();

		Log.info("Wait for sign-in button to be loaded");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='signin-link']")));

		Log.info("Click on sign in link");
		asos.pages.AsosHomePage.signInButton.click();
		
		Log.info("Click on twitter button");
		asos.pages.AsosSignIn.facebookButton.click();
		
		Log.info("Switch to the new window");
		for(String winHandle : driver.getWindowHandles() )
		{
			driver.switchTo().window(winHandle);
		}
		
		Log.info("Assert");
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Facebook')]"));
		CommonConfig.waitForElement(driver, element);
		Assert.assertTrue(element.isDisplayed()); 
		System.out.println("SignUpFacebook passed");
	}

	
	
	@AfterMethod
	public void AfterMethod() {
		stopSession();
		
		
	}
//7

}


