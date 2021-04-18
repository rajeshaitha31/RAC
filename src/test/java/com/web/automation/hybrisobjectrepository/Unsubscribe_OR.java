package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

public class Unsubscribe_OR {

	
	public static By ContactUs_GeneralInfo = By.xpath("//div/button[contains(text(),'General Info')]");
	public static By ContactUs_GeneralInfo_FAQ2 = By.xpath("(//span/span[contains(text(),'How can I be added or removed')])[1]");
	public static By UnsubscribeLink = By.xpath("//li/a[contains(text(),'Unsubscribe')]");
	public static By Unsubscribe_PageTitle = By.xpath("//div[contains(text(),'Email Preferences')]");
	public static By Unsubscribe_EmailField = By.id("unsubscribeEmail");
	public static By RadioButton_FewEmails = By.id("fewEmailsCustomRadio");
	public static By RadioButton_Altogether = By.id("unsubscribeCustomRadio");
	public static By RadioButton_DecidedToStay = By.id("stayCustomRadio");
	public static By Unsubscribe_Submit = By.id("unsubcribeSubmitBtn");
	public static By Unsubscribe_SuccessMsg = By.xpath("//p[contains(text(),'Email Unsubscribe Successful')]");
	//public static By Unsubscribe_errorMessage = By.xpath("//li[contains(text(),'Please enter your email address')]");
	public static By Unsubscribe_errorMessage = By.xpath("//*[@id=\"parsley-id-3\"]/li"); 
	
}
