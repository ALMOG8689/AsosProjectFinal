package asos.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosQuestionDetails {
	
	//Return and refund select
	@FindBy(xpath="//div[@title='Returns & Refunds']")
	public static WebElement returnsAndRefunds;

	//Question on refunds
	@FindBy(xpath="//div[@title='I have a question about a return/refund']")
	public static WebElement question;

	//Order number
	@FindBy(id="rn_TextInput_9_Incident.CustomFields.c.ordernumber")
	public static WebElement orderNumber;

	//First name
	@FindBy(id="rn_TextInput_42_Incident.CustomFields.c.first")
	public static WebElement firstName;

	//Not logged in 
	@FindBy(id="contnologin")
	public static WebElement noLogIn;

	//Last name
	@FindBy(id="rn_TextInput_44_Incident.CustomFields.c.last")
	public static WebElement lastName;

	//Return or refund select
	@FindBy(id="returnrefundstart_select")
	public static WebElement returnOrRefund;

	//Email field
	@FindBy(id="rn_TextInput_46_Incident.CustomFields.c.useremail2")
	public static WebElement email;

	//Confirm email field
	@FindBy(id="rn_TextInput_46_Incident.CustomFields.c.useremail2_Validate")
	public static WebElement reEmail;

	//Location field
	@FindBy(id="rn_SelectionInput_49_Incident.CustomFields.c.customercountry")
	public static WebElement location;

	//Day of birth 
	@FindBy(id="div_dob_day")
	public static WebElement day;

	//Month of birth
	@FindBy(xpath="//*[@id='div_dob_month']")
	public static WebElement month;

	//Year of birth
	@FindBy(xpath="//*[@id='div_dob_year']")
	public static WebElement year;

	//More information
	@FindBy(id="rn_TextInput_61_Incident.Threads")
	public static WebElement moreInfo;

	//Start chat button
	@FindBy(xpath="//*[@id='btn_submit']")
	public static WebElement startChat;

	//Thank you text
	@FindBy(id="div_top_heading_confirm")
	public static WebElement thankYou;
	
	//Result text after contact
	@FindBy(xpath="//div[@id='div_top_heading_confirm']/h1")
	public static WebElement resultAfterContact;
	
	//Send button
	@FindBy(id="rn_GnattaFormSubmit_62_Button")
	public static WebElement send;
	
	//Error message
	@FindBy(xpath="//a[contains(text(),'Use your registered')]")
	public static WebElement ErrorMessage;
	
}
