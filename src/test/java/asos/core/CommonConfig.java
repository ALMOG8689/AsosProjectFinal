package asos.core;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import asos.pages.AsosHomePage;
import asos.pages.AsosSignIn;

public class CommonConfig {
	
	public static void navToLogin(){
		
		asos.pages.AsosHomePage.signInButton.click();
	}


	public static void waitForElement(WebDriver driver, WebElement locator){

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void cordinates(WebDriver driver, WebElement locator){
		
		Point point = locator.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();
		Actions action = new Actions(driver);
		action.moveToElement(locator, xcord, ycord).click().build().perform();
		
	}
	
	  public static void signinfunc(WebDriver driver, String username,String password){
		  
			AsosHomePage.AccountInfoButton.click();
			CommonConfig.waitForElement(driver, AsosHomePage.signInButton);
			AsosHomePage.signInButton.click();
			
			
			
			asos.pages.AsosSignIn.emailAddressInput.sendKeys(username);
			asos.pages.AsosSignIn.passwordInput.sendKeys(password);
			//Filled user information

			CommonConfig.waitForElement(driver, AsosSignIn.signInButton);

			asos.pages.AsosSignIn.signInButton.click();
	  }
}