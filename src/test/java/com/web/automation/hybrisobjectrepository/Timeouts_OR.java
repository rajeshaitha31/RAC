package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

public class Timeouts_OR {
	
	
	public static By TimeoutPopUp_Title = By.xpath(" //h4[contains(text(),'Are you still there?')]");
	public static By Timeout_Continue = By.cssSelector("#moreTimeReq");
	public static By Homepage_NoCreditTitle = By.xpath("(//span/b[contains(text(),'No Credit?')])[1]");
	public static By TimeOutPopUp_SignUpForDeals = By.xpath("//div[@id=\"applicationTimeOutsignupdeals\"]/div/div/div/div/h4[contains(text(),'Are You Still there?')]");
	public static By TimeoutContinue_SignUpForDeals = By.cssSelector("#moreTimeRequired");
	
	
	
	
	

}
