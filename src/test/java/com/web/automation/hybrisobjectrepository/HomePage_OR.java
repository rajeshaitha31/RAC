package com.web.automation.hybrisobjectrepository;


import org.openqa.selenium.By;

// This file will contain all the objects in Ecom Portal HomePage 

public class HomePage_OR {  

	//Global Header
	
	public static By GLOBAL_HEADERRIBBON  = By.cssSelector("#rac-header-nav");
	public static By GLOBAL_SEARCHBOX = By.cssSelector("#input_searchComponent");
	public static By GLOBAL_SEARCHSUBMIT = By.cssSelector("#siteSearchSubmitBtn");
	public static By GLOBAL_MENUTEXT = By.cssSelector("#menu");
	public static By GLOBAL_HAMBURGERMENU_TEXT = By.xpath("//i[@class='fas fa-bars hamburger']");
	public static By GLOBAL_SIGNINICON_TEXT = By.xpath("//span[contains(text(),'Sign In')]");
	public static By GLOBAL_ORDER_TEXT = By.xpath("(//span[contains(text(),'Order')])[1]");
	
	
	
	// Home Page - Start Order
	
	public static By STARTORDER_HOMEPAGE = By.xpath("//button[contains(text(),'Start Order')]");
	
		
	// Global StoreSelectors
	
	
	//public static By GLOBAL_STORESELECTOR = By.xpath("//i[@class='fas fa-map-marker-alt']");
	//public static By GLOBAL_STORESELECTOR = By.cssSelector("a#findMyStore");
	public static By GLOBAL_STORESELECTOR = By.xpath("//img[@class='storelocator-icon']");
	
	public static By ZIPCODE_TEXTBOX = By.xpath("//input[@id='enterZipCode_Nav']");
	public static By SETSTORE_GO = By.xpath("//button[@id='enterZipCodeGoButton_Nav']");
	public static By MAKETHISMYSTORE = By.xpath("(//button[contains(text(),'Make This My Store')])[1]");
	
	public static By GLOBAL_FINDYOURSTORE = By.xpath("(//span[contains(text(),'Find your store')])[2]");
	public static By GLOBAL_STORELOCATOR_TOOLICON = By.xpath("(//i[@class='fas fa-caret-down font18'])[3]");
	
	public static By GLOBAL_PRICINGFORSTORE = By.xpath("(//span[@id='zipCodeSelectedDesktopHeading'])[2]");
	public static By GLOBAL_CHANGESTORE = By.xpath("//a[contains(text(),'Change')]");
	public static By GLOBAL_HIDESTORE = By.xpath("//a[contains(text(),'Hide')]");
	public static By NOSTORE_ERRORMSG = By.xpath("(//p[@class='not-found-nearme'][contains(text(),'No store')])[1]");
	public static By BLANKZIPCODE_ERRORMSG = By.xpath("//p[@class='mandatoryError invalid-zipcode']");
	public static By STORELOCATOR_CONTACTUS = By.xpath("(//a/span[contains(text(),'Contact Us')])[1]");
	
	
	
	
	
	// HT Store
	
	public static By HT_MAKETHISMYSTORE = By.xpath("(//button[contains(text(),'Make This My Store')])[2]");
	
	
	// HOMEPAGE SIGNUP FOR DEALS AND START ORDER
	
	public static By NEVER_MISSADEAL_TEXT = By.xpath("(//span[contains(text(),'Never miss a deal:')])[2]");
	public static By NEVER_MISSADEAL_INPUTBOX = By.xpath("(//input[@id='emailTerm'])[3]");
	public static By NEVER_MISSADEAL_SIGNUPBUTTON = By.xpath("(//span[contains(text(),'SIGN UP')])[2]");
	public static By NEVER_MISSADEAL_SUCCESSMESSAGE = By.xpath("//div[@class='col-sm-7 col-md-7 greenEmailInput zeroSpacing']//div[contains(text(),'You')]");
	
	public static By SIGNUP_FORTHE_LATESTDEALS_INPUTBOX = By.xpath("(//input[@id='emailTerm'])[5]");
	public static By SIGNUP_FORTHE_LATESTDEALS_SIGNUPBUTTON = By.xpath("(//button[contains(text(),'SIGN UP')])[2]");
	public static By FOOTER_STARTYOURORDER_BUTTON = By.xpath("//span[contains(text(),'START YOUR ORDER')]");
	public static By SIGNUP_SUCCESSMESSAGE = By.xpath("//div[@class='hidden-xs emailsignup col-sm-offset-1']//div[contains(text(),'You')]");	
	
	// Hamburger Menu locators
	
	public static By HAMB_CONTACTUS = By.xpath("(//span/a[contains(text(),'Contact Us')]");
	public static By HAMB_DEALS = By.xpath("(//span[@class='first-category-label'])[6]");
	
	public static By HAMB_SIGNUP_FORDEALS = By.xpath("//li[contains(text(),'Sign Up For Deals')]");
	
	
	
	
	
}
