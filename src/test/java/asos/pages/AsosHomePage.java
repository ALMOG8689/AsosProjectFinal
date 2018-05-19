package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosHomePage {
	
	//Header logo
	@FindBy(xpath ="//*[@id='chrome-sticky-header']/div[1]/div/ul[1]/li[2]/a")
	public static WebElement headerLogo;
	
	//Footer logo
	@FindBy(xpath ="//*[@id='chrome-footer']/footer/div[2]/div/ul/li[1]/a")
	public static WebElement footerLogo;
	
	//Sign in button
	@FindBy(xpath ="//*[@data-testid='accountIcon']")
	public static WebElement AccountInfoButton;
	
	//Search button
	@FindBy(xpath ="//*[@id='chrome-sticky-header']/div/div/div/form/div/button")
	public static WebElement searchButton;
	
	//FAQ
	@FindBy(xpath ="//*[@id='chrome-header']/header/div[3]/div/ul/li[2]/a")
	public static WebElement help;
	
	//Asos logo
	@FindBy(xpath ="//a[@data-testid='asoslogo']")
	public static WebElement asosLogo;
	
	//Women button
	@FindBy(xpath ="//a[@data-testid='women-floor']")
	public static WebElement womenButton;
	
	//Men button
	@FindBy(xpath ="//a[@data-testid='men-floor']")
	public static WebElement menButton;
		
	//Search bar
	@FindBy(xpath ="//input[@data-testid='search-input']")
	public static WebElement searchBar;
	
	//Saved items - items that you marked as liked appears on right part of the header.
	@FindBy(xpath="//input[@data-testid='savedItemsIcon']")
	public static WebElement savedItemsButton;
		
	//Cart icon
	@FindBy(xpath="//*[@data-testid='bagIcon']")
	public static WebElement cartButton;
	
	//Location button
	@FindBy(css = "#chrome-header > header > div._2mW0vnV > div > ul > li:nth-child(3) > div > button")
	public static WebElement shoppingFromButton;
	
	//Location image
	@FindBy(xpath = "//*[@id='chrome-header']/header/div[3]/div/ul/li[3]/div/button/img")
	public static WebElement shoppingFromImage;
	
	//Sign up button
	@FindBy(xpath = "//*[@data-testid='signup-link']")
	public static WebElement signUpButton;
	
	//Sign in button
	@FindBy(xpath = "//*[@data-testid='signin-link']")
	public static WebElement signInButton;
	
	//Close cookies button
	@FindBy(xpath="	//*[@id='chrome-header']/header/div[1]/div/button")
	public static WebElement closeCookies;

	//Cart icon
	@FindBy(xpath="//*[@id='chrome-welcome-mat']/div/div/button")
	public static WebElement closeCountry;
	
	//Career button
	@FindBy(xpath="//*[@id='chrome-footer']/footer/div[1]/div[4]/div/details[2]/a[2]")
	public static WebElement careerButton;
	
	//Sign out button
	@FindBy(css = "span[class='_1GV6Ntf'] > a[class='_1k1reGo']")
	public static WebElement signOutButton;
	
	//My account button
	@FindBy(xpath = "//*[@id='myAccountDropdown']/div/div/div/div[2]/div/a[1]")
	public static WebElement myAccount;
	
}
