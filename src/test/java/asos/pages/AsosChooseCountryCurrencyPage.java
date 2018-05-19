package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosChooseCountryCurrencyPage {
	
	//Country button
	@FindBy(id ="country")
	public static WebElement countryButtonSelect;
	
	//Currency select button
	@FindBy(id ="currency")
	public static WebElement currencyButtonSelect;
	
	//Save button
	@FindBy(css ="button[data-testid = 'save-country-button']")
	public static WebElement updatePreferencesButton;
	
}
