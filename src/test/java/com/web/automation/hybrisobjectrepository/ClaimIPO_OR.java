package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

// This file will contain the objects of Claim IPO Page_Generic[With or Without Product]

public class ClaimIPO_OR { 
	
  
	public static By IPO_FIRTSNAME = By.cssSelector("#secureFN");
	public static By IPO_LASTNAME = By.cssSelector("#secureLN");
	public static By IPO_BILLINGADDRESS = By.cssSelector("input#secureBA");
	public static By IPO_APT = By.cssSelector("#secureApartmenntNbr");
	public static By IPO_CITY = By.cssSelector("#secureBAC");
	public static By IPO_STATE = By.cssSelector("#state");
	public static By IPO_ZIP = By.cssSelector("#billingZipcode");
	public static By IPO_CARDNUMBER = By.cssSelector("input#accountNumber");
	public static By IPO_CARDMONTH = By.cssSelector("select#expMonth");
	public static By IPO_CARDYEAR = By.cssSelector("select#expYear");
	public static By IPO_CVV = By.cssSelector("input#cvv");
	//public static By IPO_IAGREE = By.cssSelector(".secureaggrementTxt");
	//public static By IPO_IAGREE = By.xpath("//label[@class='checktest ae-label']");
	public static By IPO_IAGREE = By.xpath("//span[contains(text(),' I agree to the')]");
	//label[@class='checktest ae-label']
	
	public static By IPO_SUBMIT = By.cssSelector("#secureFormSubmit");
	public static By IPO_VantivIFrame = By.id("vantiv-payframe");
	
	
	
	
}
