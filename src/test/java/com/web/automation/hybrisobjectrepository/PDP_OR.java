package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

// This file will contain the objects of PDP 

public class PDP_OR {

	    //View Product Details
	
    	public static By SEARCHREULTS_PRODUCT_VIEWDETAILS = By.xpath("(//a[@class='btn detailsBtn plpDetails'])[1]");
			
		//Payment Options
		
		public static By PAYMENT_OPTIONS = By.id("selectedPaymentOptions");
		public static By PAYMENT_OPTIONS_WEEKLY = By.xpath("(//p[@class='label-text text-capitalize'])[1]");
		public static By PAYMENT_OPTIONS_SEMI_MONTHLY = By.xpath("(//p[@class='label-text text-capitalize'])[2]");
		public static By PAYMENT_OPTIONS_MONTHLY = By.xpath("(//p[@class='label-text text-capitalize'])[3]");
		
		// Update Store
		
		public static By UPDATE_STORE = By.xpath("//span[@class='light-blue underline link-btn change-store-link']");
		
		//Order type
		
		public static By NEW_ORDER_TYPE = By.xpath("//div[@class='border-blue padding15']//span[@class='label-text font16 fontMob14 font-black'][normalize-space()='New']");
		public static By PREVIOUSLY_RENTED_ORDER = By.xpath("//div[@class='border-blue padding15']//span[@class='label-text font16 fontMob14 font-black'][normalize-space()='Previously Rented']");
		public static By NEW_SPECIAL_ORDER = By.xpath("//div[@class='border-blue padding15']//span[@class='label-text font16 fontMob14 font-black'][normalize-space()='New - Special Order']");
		
			
		// Start Your Order
		
		
		
		public static By START_ORDER_PDP = By.xpath("//div[@class='border-blue padding15']//span[@class='paddingL5'][normalize-space()='START YOUR ORDER']");
		
		public static By SemiMonthlySTART_ORDER_PDP = By.xpath("(//span[contains(text(),'START YOUR ORDER')])[2]");
		public static By MonthlySTART_ORDER_PDP = By.xpath("(//span[contains(text(),'START YOUR ORDER')])[3]");
		
		public static By MEDALLIAFRAME = By.xpath("//iframe[@title='Feedback Survey']");
		//public static By MEDALLIAFEEDBACK = By.xpath("//span[contains(text(),'Powered by')]");
		public static By MEDALLIA_CLOSE = By.xpath("//button[@ng-if='isShowFormCloseButton()']"); 
		
				
		// PDP Store selectors
		
		public static By PDP_ZIPCODE_TEXTBOX = By.cssSelector("#enterZipCode_Nav_product");
		public static By PDP_GOBUTTON = By.cssSelector("#enterZipCodeGoButton_Nav_product");
		public static By PDP_SELECTEDSTORE = By.xpath("(//span[@class='productDetailsZipCode'])[1]");
		
				
		
}
