package asos.test;


import static org.testng.Assert.assertEquals;

import java.util.logging.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import asos.core.BaseDriver;
import asos.core.CommonConfig;
import asos.pages.AsosAfterSearch;
import asos.pages.AsosHomePage;
import junit.framework.Assert;

public class SearchTest extends BaseDriver{
	private static Logger Log = Logger.getLogger(SignInTest.class.getName());


	@BeforeMethod(enabled = true, alwaysRun = true)

	public void SigningInTest(){
		DOMConfigurator.configure("log4j.xml");

		startSession();
		PageFactory.initElements(driver, asos.pages.AsosHomePage.class);
		PageFactory.initElements(driver, asos.pages.AsosAfterSearch.class);
	}

	@Test(groups = "Regression" , priority = 1 )
	public void HappyFlow() 
	{
		Log.info("Write 'Adidas' on serchbar ");
		asos.pages.AsosHomePage.searchBar.sendKeys("Adidas");

		Log.info("Click on the serach button ");
		asos.pages.AsosHomePage.searchButton.click();

		Log.info("Assert ");
		String found=asos.pages.AsosAfterSearch.foundMessage.getText(); // the message says how much items found
		System.out.println(found);
		Assert.assertTrue(found.contains("styles found"));	//in case not found anything, those words will not be included
		System.out.println("HappyFlow");
	}


	@Test(groups = "Regression" , priority = 2 )
	public void BadSearch() 
	{
		Log.info("Write 'ugughghjgkvyjbhj' on serchbar ");
		asos.pages.AsosHomePage.searchBar.sendKeys("ugughghjgkvyjbhj");

		Log.info("Click on the serach button ");
		asos.pages.AsosHomePage.searchButton.click();

		Log.info("Assert");
		String error=asos.pages.AsosAfterSearch.errorMessage.getText();//// the message says nothing found
		System.out.println(error);
		Assert.assertTrue(error.contains("OH NO! NOTHING MATCHES:"));	
		System.out.println("SearchBadFlow");
	}


	@Test(groups = "Regression")
	public void AdvancedSearch() 
	{
		Log.info("Wait for serchbar to be visable");
		CommonConfig.waitForElement(driver, AsosHomePage.searchBar);

		Log.info("Write 'Adidas' on serchbar ");
		AsosHomePage.searchBar.sendKeys("Adidas");

		Log.info("Wait for search Button to be visable");
		CommonConfig.waitForElement(driver, AsosHomePage.searchButton);

		Log.info("Click on the serach button ");
		AsosHomePage.searchButton.click();

		Log.info("Wait for sort to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.sort);
		
		Log.info("Wait 3 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Log.info("Click on sort");

		AsosAfterSearch.sort.click();
		
		Log.info("Wait for sort choose to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.sortChoose);
		
		Log.info("Click on sort choose");
		AsosAfterSearch.sortChoose.click();
		
		Log.info("Wait 3 seconds");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.info("Wait for gender to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.gender);
		
		Log.info("Click on gender");
		AsosAfterSearch.gender.click();
		
		Log.info("Wait for genderChoose to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.genderChoose);
		
		Log.info("Click on gender choose");
		AsosAfterSearch.genderChoose.click();
		
		Log.info("Wait 3 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.info("Wait for productType to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.productType);
		
		Log.info("Click on product type");
		AsosAfterSearch.productType.click();
		
		Log.info("Wait for productTypeChoose to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.productTypeChoose);
		
		Log.info("Click on product type choose");
		AsosAfterSearch.productTypeChoose.click();
		
		Log.info("Wait 3 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.info("Wait for range to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.range);
		
		Log.info("Click on range");
		AsosAfterSearch.range.click();
		
		Log.info("Wait for rangeChoose to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.rangeChoose);
		
		Log.info("Click on range choose");
		AsosAfterSearch.rangeChoose.click();
		
		Log.info("Wait 3 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.info("Wait for color to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.color);

		Log.info("Click on color");
		AsosAfterSearch.color.click();
		
		Log.info("Wait for colorChoose to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.colorChoose);
		
		Log.info("Click on color choose");
		AsosAfterSearch.colorChoose.click();
		
		Log.info("Wait 3 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.info("Wait for size to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.size);
		
		Log.info("Click on size");
		AsosAfterSearch.size.click();
		
		Log.info("Wait for sizeChoose to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.sizeChoose);
		
		Log.info("Click on size choose");
		AsosAfterSearch.sizeChoose.click();
		
		Log.info("Wait 3 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Log.info("Wait for priceRangeButton to be visable");
		CommonConfig.waitForElement(driver, AsosAfterSearch.priceRangeButton);
		
		Log.info("Click on price Range Button");
		asos.pages.AsosAfterSearch.priceRangeButton.click();
		
		Log.info("Wait 4 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Log.info("MOVE THE SLIDER");
		moveSilder(20);

		Log.info("ASSERT");

		String expected = "You've viewed 56 of 56 product";
		String actual = driver.findElement(By.cssSelector("p[data-auto-id='productsProgressBar']")).getAttribute("innerText");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(actual, expected);


	}
	@Test(groups = "Regression")
	public void AdvancedSearchNoResults() 
	{
		CommonConfig.waitForElement(driver, AsosHomePage.searchBar);
		AsosHomePage.searchBar.sendKeys("Adidas");
		CommonConfig.waitForElement(driver, AsosHomePage.searchButton);
		AsosHomePage.searchButton.click();

		CommonConfig.waitForElement(driver, AsosAfterSearch.sort);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AsosAfterSearch.sort.click();
		CommonConfig.waitForElement(driver, AsosAfterSearch.sortChoose);
		AsosAfterSearch.sortChoose.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonConfig.waitForElement(driver, AsosAfterSearch.gender);
		AsosAfterSearch.gender.click();
		CommonConfig.waitForElement(driver, AsosAfterSearch.genderChoose);
		AsosAfterSearch.genderChoose.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonConfig.waitForElement(driver, AsosAfterSearch.productType);
		AsosAfterSearch.productType.click();
		CommonConfig.waitForElement(driver, AsosAfterSearch.productTypeChoose);
		AsosAfterSearch.productTypeChoose.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonConfig.waitForElement(driver, AsosAfterSearch.range);
		AsosAfterSearch.range.click();
		CommonConfig.waitForElement(driver, AsosAfterSearch.rangeChoose);
		AsosAfterSearch.rangeChoose.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonConfig.waitForElement(driver, AsosAfterSearch.color);
		AsosAfterSearch.color.click();
		CommonConfig.waitForElement(driver, AsosAfterSearch.colorChoose);
		AsosAfterSearch.colorChoose.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonConfig.waitForElement(driver, AsosAfterSearch.size);
		AsosAfterSearch.size.click();
		CommonConfig.waitForElement(driver, AsosAfterSearch.sizeChoose);
		AsosAfterSearch.sizeChoose.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CommonConfig.waitForElement(driver, AsosAfterSearch.priceRangeButton);
		asos.pages.AsosAfterSearch.priceRangeButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		moveSilder(260);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String expected = "0 styles found";
		String actual = AsosAfterSearch.stylesFound.getAttribute("innerText");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(actual, expected);


	}


	@Test(groups = "Regression")
	public void searchItemAndLike(){

		Log.info("Write 'Adidas' on serchbar ");
		asos.pages.AsosHomePage.searchBar.sendKeys("Adidas");
		
		Log.info("Click on the serach button ");
		asos.pages.AsosHomePage.searchButton.click();
		
		
		Log.info("Click on like button");
		
		asos.pages.AsosAfterSearch.likeButton.click();	
		
		Log.info("Assert");
		String active = "active";
		String liked = asos.pages.AsosAfterSearch.likeButton.getAttribute("data-auto-state");
		System.out.println(liked);
		Assert.assertEquals(active,liked);


	}

	public void moveSilder(int movement)
	{
		WebElement silder = driver.findElement(By.xpath("//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[7]/div/div/div/div/div/div/div/div[3]/span[1]/div"));
		//Dimension dim = silder.getSize();
		//int x = dim.getWidth();
		Actions act = new Actions(driver);
		// Code of Silder
		act.clickAndHold(silder).moveByOffset(movement, 0).release().build().perform();
	}
	
	
	@AfterMethod
	public void AfterMethod() {
		stopSession();
		
		
	}
//5
}



