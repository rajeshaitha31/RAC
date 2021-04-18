package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

// This file will contain the objects of PDP 

public class Reservation_OR {

	    
		// Apply PROMO
		
		public static By PROMO = By.xpath("//span[text()='APPLY']");
		
		public static By FN=By.xpath("//input[@id='secureFN']");
		public static By LN=By.xpath("//input[@id='secureLN']");
		public static By CARD=By.cssSelector("input#accountNumber");
		public static By CARDMONTH = By.cssSelector("select#expMonth");
		public static By CARDYEAR = By.cssSelector("select#expYear");
		public static By CVV = By.cssSelector("input#cvv");
		public static By IAGREE = By.xpath("//span[contains(text(),' I agree to the')]");
		public static By SUBMIT = By.cssSelector("#secureFormSubmit");
		public static By RESERVEPRODUCT_LABEL=By.xpath("//span[text()='Reserve Your Product']");
		public static By RESERVATIONCHECKOUT_LABEL=By.xpath("//span[normalize-space()='Reservation Checkout']");
		public static By LABEL_APPLIED = By.xpath("//strong[normalize-space()='APPLIED']");
		public static By THANKYOU=By.xpath("//h1[normalize-space()='Thank you!']");
		public static By RESRVRECEIVED=By.xpath("//div[text()='Your reservation has been received!']");
		public static By RESERVATIONNUMBER=By.xpath("//input[@id='weborderid']");
		public static By RESERVATIONNUMBERTEXT=By.xpath("//div[contains(text(),\"Here's\")]");
		public static By PAYPAL_TAB=By.xpath("//button[@id='paypal-ipo-tab']");
		//public static By PAYPAL_BUTTON=By.xpath("//div[@class='paypal-button-label-container']");
		
		public static By PAYPAL_BUTTON=By.cssSelector("div.paypal-button-label-container");
		public static By PAYPAL_EMAILID=By.xpath("//input[@id='email']");
		public static By PAYPAL_NEXTBUTTON=By.xpath("//button[@id='btnNext']");
		public static By PAYPAL_PASSWORD=By.xpath("//input[@id='password']");
		public static By PAYPAL_LOGINBUTTON=By.xpath("//button[@id='btnLogin']");
		public static By PAYPAL_AGREE_CONTINUE=By.xpath("//button[@id='consentButton']");
		 public static By PAYPALFRAME=By.xpath("//iframe[@class='zoid-component-frame zoid-visible']");
		
				
}
