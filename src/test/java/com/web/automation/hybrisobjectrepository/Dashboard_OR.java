package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;



// This file will contain the objects of PDP 

public class Dashboard_OR {

	
	
	public static By PROMO = By.xpath("//span[text()='APPLY']");

	public static By CHECKOUTNOW = By.xpath("//a[@class='btn btn-block blueBig font14']");
	//public static By CHECKOUTLATER = By.xpath("//a[@class='btn btn-block whiteBig font14']");

	public static By WEEKLY = By.xpath("//b[normalize-space()='Weekly']");
	public static By CAL = By.xpath("//button[normalize-space()='Calendar']");
	public static By DATE = By.xpath("//a[normalize-space()='29']");
	
	public static By CONTINUE = By.xpath("//button[@class='btn btn-block blueBig payment-schedule-continue']");

	public static By LDW = By.xpath("//input[@id='lwd_checkbox']//following-sibling::span[@class='slider round']");
	public static By BPLUS = By.xpath("//input[@id='bp_checkbox']//following-sibling::span[@class='slider round']");
	public static By APPLY = By.xpath("//span[text()='APPLY']");
	public static By CONTINUEPAYMENT = By.xpath("//button[normalize-space()='CONTINUE TO PAYMENT']");
	public static By CONTINUETOESIGN=By.xpath("//button[normalize-space()='SUBMIT & CONTINUE TO E-SIGN']");
	public static By CLOSEDOCUSIGN=By.xpath("//button[@class='close pull-right font-blue pinch-to-zoom-close font20']//i[@class='far fa-times']");
	public static By SIGNLATER=By.xpath("//span[@id='sign-agreement']");
	public static By THANKYOU=By.xpath("//h1[normalize-space()='Thank you for your order!']");
	

}
