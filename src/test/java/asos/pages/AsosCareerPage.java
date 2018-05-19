package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosCareerPage {
	
	//Work for us button..
	@FindBy(xpath="//a[contains(text(),'Working')]")
	public static WebElement workForUsButton;
}
