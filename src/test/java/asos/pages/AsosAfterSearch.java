package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosAfterSearch {
	//Price range button
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[4]/div/button")
	public static WebElement range;
	
	//Price range selection
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[4]/div/div/div/header/button")
	public static WebElement rangeChoose;

	//Error message
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/p[1]")
	public static WebElement errorMessage;

	//Styles found text
	@FindBy(xpath="//*[@id='plp']/div/div[3]/div/p")
	public static WebElement foundMessage;
	
	//Sort button
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[1]/div/button")
	public static WebElement sort;
	
	//Sort - Price high to low
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[1]/div/div/div/ul/li[3]/a")
	public static WebElement sortChoose;
	
	//Sort - Gender button
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[2]/div/button")
	public static WebElement gender;
	
	//Sort - Gender select.
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[2]/div/div/div/ul/li[2]/div/label")
	public static WebElement genderChoose;
	
	//Sort - color button.
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[5]/div/button")
	public static WebElement color;
	
	//Sort- color select.
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[5]/div/div/div/ul/li[2]/div/label")
	public static WebElement colorChoose;
	
	//Sort - brand button
	@FindBy(css="li[data-dropdown-id='brand']")
	public static WebElement brand;
	
	//Sort- brand select.
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[7]/div/div/div/ul/li/div/label")
	public static WebElement brandChoose;
	
	//Sort - product type button
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[3]/div/button")
	public static WebElement productType;
	
	//Sort - product type select.
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[3]/div/div/div/header/button")
	public static WebElement productTypeChoose;
	
	//Sort- size button
	@FindBy(xpath="//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[6]/div/button")
	public static WebElement size;
	
	//Sort - size select.
	@FindBy(xpath = "//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[6]/div/div/div/ul/li[1]/div/label")
	public static WebElement sizeChoose;
	
	//Styles found text.
	@FindBy(xpath = "//p[@data-auto-id='styleCount']")
	public static WebElement stylesFound;
	
	//Like button
	@FindBy(xpath = "//*[@id='product-8962936']/button")
	public static WebElement likeButton;
	
	//Move to liked items page button.
	@FindBy(xpath = "//a[@data-testid='savedItemsIcon']")
	public static WebElement likePageButton;
	
	//Price range button
	@FindBy(xpath = "//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[7]/div/button")
	public static WebElement priceRangeButton;
	
	//Price range start point
	@FindBy(xpath = "//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[8]/div/div/div/div/div/div/div/div[3]/span[1]/div")
	public static WebElement priceRangeFrom;
	
	//Price range end point
	@FindBy(xpath = "//*[@id='plp']/div/div[2]/div/div/div/div[1]/ul/li[8]/div/div/div/div/div/div/div/div[3]/span[1]/div")
	public static WebElement priceRangeTo;

}
