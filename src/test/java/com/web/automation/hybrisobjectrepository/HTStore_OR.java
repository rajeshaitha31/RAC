package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

public class HTStore_OR {
	
	
// Legal Text
	
public static By HT_PDPLegalText = By.xpath("(//b[contains(text(),'You have selected a locally owned franchise location. Pricing may vary from website. Contact your selected store to confirm applicable pricing.')])[1]");
public static By HT_WOFLegalText = By.xpath("//b[contains(text(),'You have selected a locally owned franchise location. Pricing may vary from website. Contact your selected store to confirm applicable pricing.')]");


//HT PDP

public static By HT_PDPPricingOptions = By.cssSelector("span#selectedPaymentOptions");
public static By HT_PaymentOptionSemiMonthly = By.xpath("//p[normalize-space()='Semi-Monthly']");
public static By HT_PaymentOptionMonthly = By.xpath("//p[normalize-space()='Monthly']");
public static By HT_PaymentOptionBiWeekly = By.xpath("//p[normalize-space()='Bi-Weekly']");

// Pricing info

public static By HT_WOFPricingInfo = By.cssSelector("div#pricing-info-va");




}
