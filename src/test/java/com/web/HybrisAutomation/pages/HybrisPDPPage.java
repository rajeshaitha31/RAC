package com.web.HybrisAutomation.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.google.common.base.Optional;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;
import com.web.automation.hybrisobjectrepository.HTStore_OR;
import com.web.automation.hybrisobjectrepository.PDP_OR;


public class HybrisPDPPage extends HybrisBasePage {
	
	
	public HybrisPDPPage(WebDriver driver) {
		super(driver); 

	}

 // This Method Clicks On StartYourOrder in PDP and initiates WebOrder Flow	
	
	public boolean PDP_StartYourOrder()  {
	
	boolean flag = false;
	
	flag =CommonVariables.CommonDriver.get().findElement(PDP_OR.START_ORDER_PDP).isDisplayed();
	if(flag){extentLogs.pass("StartYourOrder","StartYourOrderIsDisplayed");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(PDP_OR.START_ORDER_PDP));
		if(flag){extentLogs.pass("ClickStartYourOrder","StartYourOrderIsClicked");
			}else{extentLogs.fail("ClickStartYourOrder","StartYourOrderIsNotClicked");}
	        }else{extentLogs.fail("StartYourOrder","StartYourOrderIsNotDisplayed");}
return flag;
	}
	
	public boolean PDP_StartYourOrder_New()  throws Exception{
		boolean flag = false;
		try {
				
		flag =CommonVariables.CommonDriver.get().findElement(PDP_OR.START_ORDER_PDP).isDisplayed();
		if(flag){extentLogs.pass("StartYourOrder","StartYourOrderIsDisplayed");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(PDP_OR.NEW_ORDER_TYPE));
		//to handle a new rac window
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
			
		WebElement StartOrder=CommonVariables.CommonDriver.get().findElement(PDP_OR.START_ORDER_PDP);
		actionLib.scrollDown(StartOrder);
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(PDP_OR.START_ORDER_PDP));
			if(flag){extentLogs.pass("ClickStartYourOrder","StartYourOrderIsClicked");
				}else{extentLogs.fail("ClickStartYourOrder","StartYourOrderIsNotClicked");}
		        }else{extentLogs.fail("StartYourOrder","StartYourOrderIsNotDisplayed");}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	return flag;
		}
	
	public boolean SemiMonthly_PDP_StartYourOrder()  {
		
		boolean flag = false;
		
		flag =CommonVariables.CommonDriver.get().findElement(PDP_OR.SemiMonthlySTART_ORDER_PDP).isDisplayed();
		if(flag){extentLogs.pass("StartYourOrder","StartYourOrderIsDisplayed");
			flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(PDP_OR.SemiMonthlySTART_ORDER_PDP));
			if(flag){extentLogs.pass("ClickStartYourOrder","StartYourOrderIsClicked");
				}else{extentLogs.fail("ClickStartYourOrder","StartYourOrderIsNotClicked");}
		        }else{extentLogs.fail("StartYourOrder","StartYourOrderIsNotDisplayed");}
	return flag;
		}
	
	
public boolean Monthly_PDP_StartYourOrder()  {
		
		boolean flag = false;
		
		flag =CommonVariables.CommonDriver.get().findElement(PDP_OR.MonthlySTART_ORDER_PDP).isDisplayed();
		if(flag){extentLogs.pass("StartYourOrder","StartYourOrderIsDisplayed");
			flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(PDP_OR.MonthlySTART_ORDER_PDP));
			if(flag){extentLogs.pass("ClickStartYourOrder","StartYourOrderIsClicked");
				}else{extentLogs.fail("ClickStartYourOrder","StartYourOrderIsNotClicked");}
		        }else{extentLogs.fail("StartYourOrder","StartYourOrderIsNotDisplayed");}
	return flag;
		}
	
	
	
	
	
	/*
	 * 
	 * @SuppressWarnings("static-access") public boolean PDP_StartYourOrder() {
	 * 
	 * boolean flag = false; actionLib.WebdriverWaitForPage(); if(flag =
	 * CommonVariables.CommonDriver.get().findElement(PDP_OR.MEDALLIAFRAME).
	 * isDisplayed()) { extentLogs.info("FeedbackScreen",
	 * "Feedback screen is displayed");
	 * actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(
	 * PDP_OR.MEDALLIAFRAME));
	 * actionLib.Click(CommonVariables.CommonDriver.get().findElement(PDP_OR.
	 * MEDALLIA_CLOSE)); extentLogs.info("CloseFeedbackScreen",
	 * "Feedback screen is Closed"); actionLib.SwitchBackFromiFrameToMaincontent();
	 * actionLib.Click(CommonVariables.CommonDriver.get().findElement(PDP_OR.
	 * START_ORDER_PDP)); extentLogs.info("Start Order", "StartYourOrderIsClicked");
	 * } else { flag
	 * =CommonVariables.CommonDriver.get().findElement(PDP_OR.START_ORDER_PDP).
	 * isDisplayed();
	 * if(flag){extentLogs.pass("StartYourOrder","StartYourOrderIsDisplayed");
	 * flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(PDP_OR.
	 * START_ORDER_PDP));
	 * if(flag){extentLogs.pass("ClickStartYourOrder","StartYourOrderIsClicked");
	 * }else{extentLogs.fail("ClickStartYourOrder","StartYourOrderIsNotClicked");}
	 * }else{extentLogs.fail("StartYourOrder","StartYourOrderIsNotDisplayed");}
	 * 
	 * }
	 * 
	 * 
	 * 
	 * return flag; }
	 * 
	 */		
		
	public boolean PDP_ValidateHTLegalText() {
		
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PDPLegalText).isDisplayed();
		String text = CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PDPLegalText).getText();
		if(flag){
		extentLogs.pass("VerifyHTLegalTextPDPPage", "Pass::"+text);	
		}else{extentLogs.fail("VerifyHTLegalTextPDPPage", "FAIL");}
		
		return flag;
				
	}
	
	public boolean PDP_SetSemiMonthlyPricingOption() {
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PDPPricingOptions).isDisplayed();
		if(flag){
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PDPPricingOptions));
		if(flag){
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PaymentOptionSemiMonthly));
		if(flag){
		extentLogs.pass("SetSemiMonthlyPricing", "PASS");	
		}else{extentLogs.fail("SetSemiMonthlyPricing", "FAIL");}
		}else{}
		}
		return flag;
	}
	
	
	public boolean PDP_SetMonthlyPricingOption() {
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PDPPricingOptions).isDisplayed();
		if(flag){
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PDPPricingOptions));
		if(flag){
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PaymentOptionMonthly));
		if(flag){
		extentLogs.pass("SetMonthlyPricing", "PASS");	
		}else{extentLogs.fail("SetMonthlyPricing", "FAIL");}
		}else{}
		}
		return flag;
	}
	
	public boolean PDP_SetBiWeeklyPricingOption() {
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PDPPricingOptions).isDisplayed();
		if(flag){
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PDPPricingOptions));
		if(flag){
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_PaymentOptionBiWeekly));
		if(flag){
		extentLogs.pass("BiWeeklyPricing", "PASS");	
		}else{extentLogs.fail("BiWeeklyPricing", "FAIL");}
		}else{}
		}
		return flag;
	}
	
	
}
