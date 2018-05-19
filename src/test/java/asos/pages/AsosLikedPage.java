package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosLikedPage {

	

	//Text that check if item is added
	@FindBy(xpath ="//span[contains(text(),'1 Saved')]")
	public static WebElement itemSaved;
	
}
