package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosProductPage {
	
	//Product size select
	@FindBy(xpath = "//*[@id='product-size']/section/div/div[1]/div[2]/select")
	public static WebElement productSizeSelect;
	
	//Add to bag button
	@FindBy(xpath = "//*[@id='product-add']/div/a")
	public static WebElement addToBagButton;
	
	//Number of items in the cart
	@FindBy(xpath = "//*[@class = '_1EbtfBz']")
	public static WebElement numOfItemInCart;
	
	//Item selected after search..(example)
	@FindBy(xpath = "//*[@id='product-8962936']/a")
	public static WebElement itemAfterSearch;
	
	//Remove item button
	@FindBy(xpath = "//*[@id='bagApp']/div/div/div[1]/div[1]/bag-item-list/ul/li/div/div/div/bag-remove/div/button")
	public static WebElement removeItem;
	
	//Text if bag is empty.
	@FindBy(xpath = "//h2[contains(text(),'empty')]")
	public static WebElement bagIsEmpty;
	
	//Like button
	@FindBy(xpath = "//button[contains(@data-bind,'moveToSaved')]")
	public static WebElement likeButton;
	
	//Move to liked items page.
	@FindBy(xpath = "//a[contains(@aria-label,'Saved Items')]")
	public static WebElement moveTolikePage;
	
	
}
