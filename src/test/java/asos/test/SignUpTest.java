package asos.test;

import org.testng.annotations.Test;
import asos.core.BaseDriver;
import asos.core.CommonConfig;
import asos.pages.AsosHomePage;
import asos.pages.AsosSignUp;
import junit.framework.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.logging.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SignUpTest extends BaseDriver  {
	private static Logger Log = Logger.getLogger(SignOutTest.class.getName());

	@BeforeMethod
	public void beforeMethod() {
		DOMConfigurator.configure("log4j.xml");
		startSession();
		PageFactory.initElements(driver, asos.pages.AsosSignUp.class);
		PageFactory.initElements(driver, asos.pages.AsosHomePage.class);
		PageFactory.initElements(driver, asos.pages.AsosSignIn.class);

	}

	@Test(groups = "Sanity")
	public void HappyFlow() 
	{
		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();
		
		Log.info("Wait for sign up button to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.signUpButton);
		
		Log.info("Click on sign up button");
		AsosHomePage.signUpButton.click();
		
		//fill all fields:
		Log.info("Fill email field ");
		asos.pages.AsosSignUp.emailInput.sendKeys("testQa@gmail.com");//already exsits
		
		Log.info("Fill firstName field ");
		asos.pages.AsosSignUp.firstNameInput.sendKeys("Michael");
		
		Log.info("Fill lastName field ");
		asos.pages.AsosSignUp.lastNameInput.sendKeys("Jeckson");
		
		Log.info("Fill password field ");
		asos.pages.AsosSignUp.passwordInput.sendKeys("pass123qa");
		
		Log.info("Select day of birth ");
		Select dropdown= new Select(asos.pages.AsosSignUp.dateDaySelect);
		dropdown.selectByIndex(2);

		Log.info("Select month of birth ");
		Select dropdown2= new Select(asos.pages.AsosSignUp.dateMonthSelect);
		dropdown2.selectByIndex(3);

		Log.info("Select year of birth ");
		Select dropdown3= new Select(asos.pages.AsosSignUp.dateYearSelect);
		dropdown3.selectByIndex(5);

		Log.info("Select male button ");
		asos.pages.AsosSignUp.maleRadioButton.isSelected();
		
		Log.info("Wait for register button to be loaded");
		CommonConfig.waitForElement(driver,AsosSignUp.registerButton );
		
		Log.info("Click on register Button ");
		asos.pages.AsosSignUp.registerButton.click();
		
		Log.info("Assert");
		String currUrl = driver.getCurrentUrl();
		String urlRegister="https://my.asos.com/identity/register?signin=5aafba13aa3a68522ee77097f79a0b36&checkout=False&forceAuthentication=True";
		Assert.assertFalse(currUrl.equals(urlRegister));
		// if current page differ from the registeration page- means we finished the registeration succecfully
		System.out.println("SuccefullyCreate passed");
	}

	@Test(groups = "Sanity")
	public void BadPassword_LessThan6Letters()//N 
	{
		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();

		Log.info("Wait for sign up button to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.signUpButton);
		
		Log.info("Click on sign up button");
		AsosHomePage.signUpButton.click();
		
		Log.info("Fill email field ");
		asos.pages.AsosSignUp.emailInput.sendKeys("testQa@gmail.com");//already exsits
		
		Log.info("Fill firstName field ");
		asos.pages.AsosSignUp.firstNameInput.sendKeys("Michael");
		
		Log.info("Fill lastName field ");
		asos.pages.AsosSignUp.lastNameInput.sendKeys("Jeckson");
		
		Log.info("Fill password field ");
		asos.pages.AsosSignUp.passwordInput.sendKeys("Qa121");// password less than 6 characters
		
		Log.info("Select day of birth ");
		Select dropdown= new Select(asos.pages.AsosSignUp.dateDaySelect);
		dropdown.selectByIndex(2);

		Log.info("Select month of birth ");
		Select dropdown2= new Select(asos.pages.AsosSignUp.dateMonthSelect);
		dropdown2.selectByIndex(3);

		Log.info("Select year of birth ");
		Select dropdown3= new Select(asos.pages.AsosSignUp.dateYearSelect);
		dropdown3.selectByIndex(5);

		Log.info("Select male button ");
		asos.pages.AsosSignUp.maleRadioButton.isSelected();

		Log.info("Click on register Button ");
		asos.pages.AsosSignUp.registerButton.click();
		
		Log.info("Assert");
		String Error1 = AsosSignUp.PasswordError.getText();
		Assert.assertTrue(Error1.equals("At least 6 letters and 1 number, please!"));
		System.out.println("BadPasswordLessThan6Letters passed");

	}

	@Test(groups = "Sanity")
	public void BadPassword_NoNumbers()//N 
	{
		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();

		Log.info("Wait for sign up button to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.signUpButton);
		
		Log.info("Click on sign up button");
		AsosHomePage.signUpButton.click();
		
		Log.info("Fill email field ");
		asos.pages.AsosSignUp.emailInput.sendKeys("testQa@gmail.com");//already exsits
		
		Log.info("Fill firstName field ");
		asos.pages.AsosSignUp.firstNameInput.sendKeys("Michael");
		
		Log.info("Fill lastName field ");
		asos.pages.AsosSignUp.lastNameInput.sendKeys("Jeckson");
		
		Log.info("Fill password field ");
		asos.pages.AsosSignUp.passwordInput.sendKeys("HelloWorld");// password less than 6 characters
		
		Log.info("Select day of birth ");
		Select dropdown= new Select(asos.pages.AsosSignUp.dateDaySelect);
		dropdown.selectByIndex(2);

		Log.info("Select month of birth ");
		Select dropdown2= new Select(asos.pages.AsosSignUp.dateMonthSelect);
		dropdown2.selectByIndex(3);

		Log.info("Select year of birth ");
		Select dropdown3= new Select(asos.pages.AsosSignUp.dateYearSelect);
		dropdown3.selectByIndex(5);

		Log.info("Select male button ");
		asos.pages.AsosSignUp.maleRadioButton.isSelected();
		Log.info("Click on register Button ");		
		asos.pages.AsosSignUp.registerButton.click();
		
		Log.info("Assert");
		String Error1 = AsosSignUp.PasswordError.getText();
		Assert.assertTrue(Error1.equals("At least 6 letters and 1 number, please!"));
		System.out.println("BadPassword_NoNumbers passed");

	}
	
	@Test(groups = "Sanity")
	public void BadPassword_FirstNameEmpty()//N 
	{
		Log.info("Click on account Icon");
		asos.pages.AsosHomePage.AccountInfoButton.click();
	
		Log.info("Wait for sign up button to be loaded");
		CommonConfig.waitForElement(driver, AsosHomePage.signUpButton);
		
		Log.info("Click on sign up button");
		AsosHomePage.signUpButton.click();
		
		Log.info("Fill email field ");
		asos.pages.AsosSignUp.emailInput.sendKeys("testQa@gmail.com");//already exsits
	
		Log.info("Fill lastName field ");
		asos.pages.AsosSignUp.lastNameInput.sendKeys("Jeckson");

		Log.info("Fill password field ");
		asos.pages.AsosSignUp.passwordInput.sendKeys("pass123qa");// password less than 6 characters
	
		Log.info("Select day of birth ");
		Select dropdown= new Select(asos.pages.AsosSignUp.dateDaySelect);
		dropdown.selectByIndex(2);

		Log.info("Select month of birth ");
		Select dropdown2= new Select(asos.pages.AsosSignUp.dateMonthSelect);
		dropdown2.selectByIndex(3);

		Log.info("Select year of birth ");
		Select dropdown3= new Select(asos.pages.AsosSignUp.dateYearSelect);
		dropdown3.selectByIndex(5);

		Log.info("Select male button ");
		asos.pages.AsosSignUp.maleRadioButton.isSelected();
		
		Log.info("Click on register Button ");		
		asos.pages.AsosSignUp.registerButton.click();
		
		Log.info("Assert");
		String Error1 = AsosSignUp.FirstNameError.getText();
		Assert.assertTrue(Error1.equals("We need your first name – it’s nicer that way"));
		System.out.println("FirstNameEmpty passed");
	}
	
	
	@AfterMethod
	public void AfterMethod() {
		stopSession();
		
		
	}
	//4
}
