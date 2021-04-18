package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

public class ContactUs_OR { 

	
	//public static By Hamburger_ContactUs = By.xpath("(//li[@class='La auto firstParent racLinks'])[4]");
	public static By Hamburger_ContactUs = By.xpath("//span/a[contains(text(),'Contact Us')]");
	
	public static By ContactUs_PageTitle = By.xpath("//h3[contains(text(),'Contact Us')]");
	public static By ContactUs_FirstNameField = By.id("firstNameField");
	public static By ContactUs_LastNameField = By.id("lastNameField");
	public static By ContactUs_EmailField = By.id("emailField");
	public static By ContactUs_PhoneNumber = By.id("primaryPhoneNumber");
	public static By PreferredContactMethod_Email = By.xpath("//span[@class='label-text font16 fontMob14 black'][contains(text(),'Email')]");
	public static By PreferredContactMethod_Phone = By.xpath("//span[@class='label-text font16 fontMob14 black'][contains(text(),'Phone')]");
	public static By ContactUs_ChooseTopic = By.id("reasonInquiry");
	public static By ContactUs_Comments = By.id("comments");
	public static By ContactUs_Submit = By.id("contact-us");
	public static By ContactUs_BackToHome = By.xpath("//span[contains(text(),'BACK TO HOMEPAGE')]");
	
	
	
}
