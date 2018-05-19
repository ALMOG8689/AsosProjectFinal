package asos.test;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import asos.core.BaseDriver;
import asos.core.CommonConfig;
import asos.pages.AsosHomePage;
import asos.pages.AsosLikedPage;
import asos.pages.AsosProductPage;

public class addItemToCart extends BaseDriver {

	static Logger logger = Logger.getLogger(addItemToCart.class);

	
	
	@BeforeMethod
	public void beforeMethod() {
		DOMConfigurator.configure("log4j.xml");
		startSession();
		PageFactory.initElements(driver, AsosProductPage.class);
		PageFactory.initElements(driver, asos.pages.AsosHomePage.class);
		PageFactory.initElements(driver, asos.pages.AsosLikedPage.class);
		
		
	}


	@Test(groups = "System", priority = 1 )
	public void addToCart() {

		AsosHomePage.searchBar.sendKeys("adidas");
		logger.info("Typing adidas in search bar...");
		AsosHomePage.searchButton.click();
		logger.info("clicking on search button...");
		CommonConfig.cordinates(driver, AsosProductPage.itemAfterSearch);
		logger.info("clicking on item..");
		Select dropdown= new Select(AsosProductPage.productSizeSelect);
		dropdown.selectByIndex(8);
		logger.info("choose size 7");
		AsosProductPage.addToBagButton.click();
		logger.info("added item to bag");

		String num = AsosProductPage.numOfItemInCart.getAttribute("innerText");
		boolean check = false;

		if(!num.equals("0")){
			check = true;
			AsosHomePage.cartButton.click();
			Assert.assertTrue(check);
		}
		
	}
		@Test(groups = "System")
		public void addToCartAndRemove() {

			AsosHomePage.searchBar.sendKeys("adidas");
			logger.info("Typing adidas in search bar...");
			AsosHomePage.searchButton.click();
			logger.info("clicking on search button...");
			CommonConfig.cordinates(driver, AsosProductPage.itemAfterSearch);
			logger.info("clicking on item..");
			Select dropdown= new Select(AsosProductPage.productSizeSelect);
			dropdown.selectByIndex(8);
			logger.info("choose size 7");
			AsosProductPage.addToBagButton.click();
			logger.info("added item to bag");

			String num = AsosProductPage.numOfItemInCart.getAttribute("innerText");
			boolean check = false;

			if(!num.equals("0")){
				check = true;
				AsosHomePage.cartButton.click();
				Assert.assertTrue(check);
			}
			asos.pages.AsosProductPage.removeItem.click();
			String expected = "Your bag is empty";
			CommonConfig.waitForElement(driver, AsosProductPage.bagIsEmpty);
			Assert.assertEquals(AsosProductPage.bagIsEmpty.getText(), expected);
		}
		
		@Test(groups = "System")
		public void addToCartAndLike() {

			AsosHomePage.searchBar.sendKeys("adidas");
			logger.info("Typing adidas in search bar...");
			AsosHomePage.searchButton.click();
			logger.info("clicking on search button...");
			CommonConfig.cordinates(driver, AsosProductPage.itemAfterSearch);
			logger.info("clicking on item..");
			Select dropdown= new Select(AsosProductPage.productSizeSelect);
			dropdown.selectByIndex(8);
			logger.info("choose size 7");
			AsosProductPage.addToBagButton.click();
			logger.info("added item to bag");

			String num = AsosProductPage.numOfItemInCart.getAttribute("innerText");
			boolean check = false;

			if(!num.equals("0")){
				check = true;
				AsosHomePage.cartButton.click();
				Assert.assertTrue(check);
			}
			CommonConfig.waitForElement(driver, AsosProductPage.likeButton);
			asos.pages.AsosProductPage.likeButton.click();
			String expected = "Your bag is empty";
			CommonConfig.waitForElement(driver, AsosProductPage.bagIsEmpty);
			Assert.assertEquals(AsosProductPage.bagIsEmpty.getText(), expected);
			AsosProductPage.moveTolikePage.click();
			Assert.assertEquals(AsosLikedPage.itemSaved.getText(),"1 Saved item");
		}
//3

		@AfterMethod
		public void AfterMethod() {
			stopSession();
			
			
		}
		

	}





