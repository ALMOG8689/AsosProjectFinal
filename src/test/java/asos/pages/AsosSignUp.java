package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosSignUp {
	
	//Sign up with email - paragraph
	@FindBy(xpath ="//p[@class='qa-use-email last-child']")
	public static WebElement signUpWithEmailParagraph;
	
	//Email input field
	@FindBy(id ="Email")
	public static WebElement emailInput;
	
	@FindBy(id="Password-error")
	public static WebElement PasswordError;
	
	@FindBy(id="FirstName-error")
	public static WebElement FirstNameError;
	
	
	//First name paragraph
	@FindBy(xpath = "//label[@class='qa-firstname-label input-validation-error']")
	public static WebElement firstNameParagraph;
	
	//Fiest name input field
	@FindBy(id ="FirstName")
	public static WebElement firstNameInput;
	
	//Last name paragraph
	@FindBy(xpath ="//label[@class='qa-lastname-label']")
	public static WebElement lastNameParagraph;
	
	//Last name input field
	@FindBy(id ="LastName")
	public static WebElement lastNameInput;
	
	//Password paragraph
	@FindBy(xpath ="//label[@class='qa-password-label']")
	public static WebElement passwordParagraph;
	
	//Password input field
	@FindBy(id ="Password")
	public static WebElement passwordInput;
	
	//Date of birth paragraph 
	@FindBy(xpath ="//label[@class='qa-birthday-label']")
	public static WebElement dateOfBirthParagraph;
	
	
	//Day of birth input field
	@FindBy(id ="BirthDay")
	public static WebElement dateDaySelect;
	
	//Month of birth input field
	@FindBy(id ="BirthMonth")
	public static WebElement dateMonthSelect;
	
	//Year of birth input field
	@FindBy(id ="BirthYear")
	public static WebElement dateYearSelect;
	
	//Gender paragraph - choose your gender
	@FindBy(xpath = "//label[@class='qa-gender-label']")
	public static WebElement genderParagraph;
	
	//Female gender radio button
	@FindBy(id ="female")
	public static WebElement femaleRadioButton;
	
	//Female gender paragraph
	@FindBy(xpath = "//label[@class='radio qa-gender-female-label']")
	public static WebElement femaleParagraph;
	
	//Male gender radio button
	@FindBy(id ="male")
	public static WebElement maleRadioButton;
	
	//Male gender paragraph
	@FindBy(xpath = "//label[@class='radio qa-gender-male-label']")
	public static WebElement maleParagraph;
	
	//Preferences for contacting method - updates or discounts - paragraph.
	@FindBy(xpath = "//label[@class='qa-partner-marketing-label']")
	public static WebElement contactPreferancesParagraph;
	
	//Discounts to email radioButton
	@FindBy(xpath = "//label[@class='checkbox marketing']")
	public static WebElement dicsountsRadioButton;
	
	//Updates to email radioButton
	@FindBy(xpath = "//label[@class='checkbox partner']")
	public static WebElement updatesRadioButton;
	
	//Register button
	@FindBy(id="register")
	public static WebElement registerButton;
}
