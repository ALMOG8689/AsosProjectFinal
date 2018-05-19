package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Asoshelp {
	
	//iFrame element 
	@FindBy(xpath="//iframe[@src='http://asos-uk.custhelp.com/app/ptaengine/pta/0/redirect/app/home']")
	public static WebElement frame;
	
	//Email us button
	@FindBy(xpath="//*[@id='AskButtons_askaq']/span")
	public static WebElement emailUs;

	//Close button
	@FindBy(xpath ="//*[@id='chrome-welcome-mat']/div/div/button")
	public static WebElement close;
}
