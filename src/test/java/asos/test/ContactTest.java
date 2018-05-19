package asos.test;

import org.testng.annotations.Test;
import asos.core.BaseDriver;
import asos.core.CommonConfig;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ContactTest extends BaseDriver {


	@BeforeMethod(enabled = true)
	public void SigningInTest(){
		startSession();
		PageFactory.initElements(driver, asos.pages.AsosHomePage.class);
		PageFactory.initElements(driver, asos.pages.Asoshelp.class);
		PageFactory.initElements(driver,asos.pages.AsosLiveHelpPage.class);
		PageFactory.initElements(driver,asos.pages.AsosQuestionDetails.class);

	}

	@Test(groups = "System")
	public void Succecfully()
	{
		DOMConfigurator.configure("log4j.xml");
		//Log.info("Go to help page");
		asos.pages.AsosHomePage.help.click();
		//Log.info("Close pop-up");
		//asos.pages.Asoshelp.close.click();
		//Log.info("Insert into the frame");
		//*[@id="helpIframe"]/iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='helpIframe']/iframe")));
		asos.pages.Asoshelp.emailUs.click();
	

		CommonConfig.waitForElement(driver,asos.pages.AsosQuestionDetails.returnsAndRefunds);
		asos.pages.AsosQuestionDetails.returnsAndRefunds.click();

		//Log.info("Select question");
		CommonConfig.waitForElement(driver,asos.pages.AsosQuestionDetails.question);
		asos.pages.AsosQuestionDetails.question.click();

		//Log.info("Click on no-logIn link ");
		asos.pages.AsosQuestionDetails.noLogIn.click();

		//Log.info("Is your question about a return or refund? ");
		Select dropdown= new Select(asos.pages.AsosQuestionDetails.returnOrRefund);
		dropdown.selectByIndex(2);

		//
		//Log.info("Send 0 to order number");

		asos.pages.AsosQuestionDetails.orderNumber.sendKeys("0");
		//Log.info("Send Almog to first name");

		asos.pages.AsosQuestionDetails.firstName.sendKeys("Almog");
		asos.pages.AsosQuestionDetails.lastName.sendKeys("Nahum");
		asos.pages.AsosQuestionDetails.email.sendKeys("hokus@pokus.com");
		asos.pages.AsosQuestionDetails.reEmail.sendKeys("hokus@pokus.com");
		Select dropdown0= new Select(asos.pages.AsosQuestionDetails.location);
		dropdown0.selectByIndex(8);
		asos.pages.AsosQuestionDetails.moreInfo.sendKeys("Item I recieved is not as described");
		asos.pages.AsosQuestionDetails.send.click();
		
		
		String expected = "THANKS FOR YOUR QUERY!";
		Assert.assertEquals(expected, asos.pages.AsosQuestionDetails.resultAfterContact.getText());
	}
	
	@Test(groups = "System")//N
	public void contactWithoutEmail()
	{
		DOMConfigurator.configure("log4j.xml");
		//Log.info("Go to help page");
		asos.pages.AsosHomePage.help.click();
		//Log.info("Close pop-up");
		//asos.pages.Asoshelp.close.click();
		//Log.info("Insert into the frame");
		//*[@id="helpIframe"]/iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='helpIframe']/iframe")));
		asos.pages.Asoshelp.emailUs.click();
	

		CommonConfig.waitForElement(driver,asos.pages.AsosQuestionDetails.returnsAndRefunds);
		asos.pages.AsosQuestionDetails.returnsAndRefunds.click();

		//Log.info("Select question");
		CommonConfig.waitForElement(driver,asos.pages.AsosQuestionDetails.question);
		asos.pages.AsosQuestionDetails.question.click();

		//Log.info("Click on no-logIn link ");
		asos.pages.AsosQuestionDetails.noLogIn.click();

		//Log.info("Is your question about a return or refund? ");
		Select dropdown= new Select(asos.pages.AsosQuestionDetails.returnOrRefund);
		dropdown.selectByIndex(2);

		//
		//Log.info("Send 0 to order number");

		asos.pages.AsosQuestionDetails.orderNumber.sendKeys("0");
		//Log.info("Send Almog to first name");

		asos.pages.AsosQuestionDetails.firstName.sendKeys("Almog");
		asos.pages.AsosQuestionDetails.lastName.sendKeys("Nahum");
		Select dropdown0= new Select(asos.pages.AsosQuestionDetails.location);
		dropdown0.selectByIndex(8);
		asos.pages.AsosQuestionDetails.moreInfo.sendKeys("Item I recieved is not as described");
		asos.pages.AsosQuestionDetails.send.click();
		
		
		String current = asos.pages.AsosQuestionDetails.ErrorMessage.getAttribute("innerText");
		String expected = "Email Address (Use your registered email if you have an ASOS account) is required";
		Assert.assertEquals(expected, current);
	}

	@Test(groups = "System")
	public void differentReEmail()
	{
		DOMConfigurator.configure("log4j.xml");
		//Log.info("Go to help page");
		asos.pages.AsosHomePage.help.click();
		//Log.info("Close pop-up");
		//asos.pages.Asoshelp.close.click();
		//Log.info("Insert into the frame");
		//*[@id="helpIframe"]/iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='helpIframe']/iframe")));
		asos.pages.Asoshelp.emailUs.click();
	

		CommonConfig.waitForElement(driver,asos.pages.AsosQuestionDetails.returnsAndRefunds);
		asos.pages.AsosQuestionDetails.returnsAndRefunds.click();

		//Log.info("Select question");
		CommonConfig.waitForElement(driver,asos.pages.AsosQuestionDetails.question);
		asos.pages.AsosQuestionDetails.question.click();

		//Log.info("Click on no-logIn link ");
		asos.pages.AsosQuestionDetails.noLogIn.click();

		//Log.info("Is your question about a return or refund? ");
		Select dropdown= new Select(asos.pages.AsosQuestionDetails.returnOrRefund);
		dropdown.selectByIndex(2);

		//
		//Log.info("Send 0 to order number");

		asos.pages.AsosQuestionDetails.orderNumber.sendKeys("0");
		//Log.info("Send Almog to first name");

		asos.pages.AsosQuestionDetails.firstName.sendKeys("Almog");
		asos.pages.AsosQuestionDetails.lastName.sendKeys("Nahum");
		asos.pages.AsosQuestionDetails.email.sendKeys("hokus@pokus.com");
		asos.pages.AsosQuestionDetails.reEmail.sendKeys("tutu@pokus.com");
		Select dropdown0= new Select(asos.pages.AsosQuestionDetails.location);
		dropdown0.selectByIndex(8);
		asos.pages.AsosQuestionDetails.moreInfo.sendKeys("Item I recieved is not as described");
		asos.pages.AsosQuestionDetails.send.click();
		
		
		String current = asos.pages.AsosQuestionDetails.ErrorMessage.getAttribute("innerText");
		String expected = "Confirm Email Address does not match Email Address (Use your registered email if you have an ASOS account)";
		Assert.assertEquals(expected, current);
	}
	
	@AfterMethod
	public void AfterMethod() {
		stopSession();
		
		
	}
//3
}
