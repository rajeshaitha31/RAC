package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

// This file will contain the objects of Order Confirmation Screen [VA , NON VA , With/Without IPO]

public class OrderConfirmationScreen_OR {
	

	// GENERIC OBJECTS[Will be displayed in screen for IPO/NONIPO]
	
	public static By THANKYOU_LABEL = By.xpath("//div[contains(text(),'Thank you!')]");
	public static By ORDERRECEIVED_LABEL = By.xpath("//div[contains(text(),'Your order request has been received!')]");
	public static By WHATNEXT_SECTION = By.xpath("//p[@class='no-space']");
	public static By UPONDELIVERY_SECTION = By.xpath("//p[contains(text(),'Upon delivery, you’ll need to:')]");
	public static By MYSTORE_SECTION = By.xpath("//div[contains(text(),'My Store: ')]");
	public static By STOREDETAILS_CONFIRMATIONSECTION = By.cssSelector("#storeDetailConfirmation");
	public static By GOTOHOMEPAGE_BUTTON = By.xpath("(//span[contains(text(),'GO TO HOMEPAGE')])[2]");

	
	//ORDER WITH PAYMENT
	
	public static By PAYMENTCONFIRMATION_LABEL = By.xpath("//div[contains(text(),'Your request and payment has been received!')]");
	public static By ORDERNUMBER_LABEL = By.xpath("//div[@class='bold font16 fontMob14 bold']");	
	
	//ORDER WITH PRODUCT
	
	public static By PRODUCTIMAGE = By.cssSelector("#productImg"); 
	
	
	
	}
