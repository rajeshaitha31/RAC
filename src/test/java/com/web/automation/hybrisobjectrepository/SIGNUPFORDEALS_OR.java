package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;


public class SIGNUPFORDEALS_OR {
	
	public static By Label_SIGNUPTEXT = By.xpath("//h1[contains(text(),'Sign Up for the Latest Deals')]");
	
	
	public static By SD_EMAIL = By.cssSelector("#emailField");
	public static By SD_VERIFYEMAIL = By.cssSelector("#verifyEmailField");
	public static By SD_FIRSTNAME = By.cssSelector("#firstNameField");
	public static By SD_LASTNAME = By.cssSelector("#lastNameField");
	public static By SD_Zipcode = By.cssSelector("#zip-code");
	public static By SD_SUBMIT = By.cssSelector("#signUpBtnSubmit");
	
	public static By SD_EmailValidation = By.xpath("//p[contains(text(),'Please verify your email address.')]");
	public static By SD_Blank_EmailValidation =By.xpath("(//p[contains(text(),'Please enter your email address.')])[1]");
	public static By SD_Valid_EmailValidation = By.xpath("//p[contains(text(),'Please enter a valid email address.')]");
		
	
	
	// Success page
	
	public static By SD_SuccessPage = By.xpath("//p[contains(text(),'Thanks for signing up. Great deals, new arrivals and exclusive savings are headed your way!')]"); 
	
	
	

}
