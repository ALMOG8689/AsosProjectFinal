package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosMyAccount {

		//Sign in button
		@FindBy(xpath = "//*[@id='app']/div/div/div/div[1]/div[1]/div/div/div/div[1]/nav/div[6]/div/a")
		public static WebElement signOut;
	
		//Change password button
		@FindBy(xpath = "//*[@id='app']/div/div/div/div[1]/div[1]/div/div/div/div[1]/nav/div[3]/div[2]/a")
		public static WebElement changePassBtn;
		
		//Current password input
		@FindBy(xpath = "//*[@id='ChangePassword_existingPassword']/label/span[2]/span/input")
		public static WebElement currentPassFld;
		
		//New password input
		@FindBy(xpath = "//*[@id='ChangePassword_password']/label/span[2]/span/input")
		public static WebElement newPassFld;
		
		//Save pass button
		@FindBy(xpath = "//*[@id='main']/div[2]/form/div/div/div[2]/div/div")
		public static WebElement savePassBtn;
		
		//Current pass error
		@FindBy(xpath = "//*[@id='ChangePassword_existingPassword']/label/div")
		public static WebElement errorPassTxt;
		
		//New pass error
		@FindBy(xpath = "//*[@id='ChangePassword_password']/label/div")
		public static WebElement errorNewPassTxt;
		
		//Successful change notification
		@FindBy(xpath = "//*[@id='app']/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/span/div/span")
		public static WebElement successTxt;
		
		
}
