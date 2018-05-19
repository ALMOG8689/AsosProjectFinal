package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosSignIn {
	
	//Register button
	@FindBy(xpath ="//a[@class='qa-join-asos']")
	public static WebElement registerButton;
	//Sign-in paragraph
	@FindBy(xpath ="//p[@class='qa-already']")
	public static WebElement signInParagraph;
	
	//Sign-in paragraph by Email 
	@FindBy(xpath ="//p[@class='qa-use-email last-child']")
	public static WebElement signInWithEmailParagraph;
	
	//Sign-in paragraph by Email 
	@FindBy(xpath ="//*[@id='Password-error']")
	public static WebElement passwordError;
	
	//Sign-in paragraph by Email 
	@FindBy(xpath ="//*[@id='EmailAddress-error']")
	public static WebElement EmailAddressError;
	
	
	//Sign-up using facebook
	@FindBy(id="signup-facebook")
	public static WebElement facebookButton;
	
	//Sign-up using google
	@FindBy(id="signup-google")
	public static WebElement googleButton;
	
	//Sign-up using twitter
	@FindBy(id="signup-twitter")
	public static WebElement twitterButton;
	

	// Email address paragraph
	@FindBy(xpath ="//p[@class='qa-email-label']")
	public static WebElement emailAddressParagraph;
	
	//Email address input
	@FindBy(xpath ="//*[@id='EmailAddress']")
	public static WebElement emailAddressInput;
	
	//Password input
	@FindBy(id="Password")
	public static WebElement passwordInput;
	
	//Sign-in button
	@FindBy(id="signin") // CANT FIND IT
	public static WebElement signInButton;
	

	
	//Forgot password button
	@FindBy(xpath ="//a[@class='qa-forgot-password adobeTrackedButton']")
	public static WebElement forgotPasswordButton;
	
	
	
	
}
