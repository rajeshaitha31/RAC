package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

    // This file will contain the objects of VirtualApproval confirmation screen[All works flows - Approved,Conditional,Decline]

       public class VA_ConfirmationScreen_OR {

	 // VA_APPROVED
	
		public static By VA_APPROVED_CONGRATSMESSAGE = By.xpath("//div[contains(text(),'Congrats')]");
		public static By VA_APPROVED_AMOUNTMESSAGE = By.xpath("//div[contains(text(),'Your approval amount is:')]");
		public static By VA_APPROVED_EXPIRYMESSAGE = By.xpath("//div[contains(text(),'Expires:')]");
		public static By VA_PRICINGINFO = By.id("pricing-info-va");
				
		// VA_CONDITIONAL
		
		public static By VA_CONDITIONAL_MESSAGE = By.xpath("//div[contains(text(),'We want to help')]");
				
		//VA_DECLINE
	
		public static By VA_DECLINE_MESSAGE = By.xpath(" //div[contains(text(),'We’re so happy')]");
		public static By VA_DECLINE_DESC = By.xpath("//div[@class='va-declined-page-desc']");
		
		// CONFIRMATION PAGE_PRODUCT NAME
		
		public static By VA_PRODUCTNAME = By.xpath("//div[@class='font18 fontMob14 fw600']");
		public static By VA_PRODUCTIMAGE = By.cssSelector("#productImg");
		
		
		
		// Thank You Label
		
		public static By VA_THANKYOU = By.xpath("//div[contains(text(),'Thank you!')]");
		public static By VA_WHATSNEXT = By.xpath("//p[@class='no-space']");
		public static By VA_UPONDELIVERY = By.xpath("//ul[@class='whatsnext']");
		public static By VA_STOREDETAILSCONFIRMATION = By.id("storeDetailConfirmation"); 
		
	
		
}
