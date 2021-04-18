package com.web.HybrisAutomation.pages;

import org.openqa.selenium.WebDriver;

import com.web.automation.hybrisobjectrepository.OrderConfirmationScreen_OR;
import com.web.automation.hybrisobjectrepository.VA_ConfirmationScreen_OR;

import com.web.automation.utilities.CommonVariables;

public class HybrisVAConfirmationPage extends HybrisBasePage {
	
	
	public HybrisVAConfirmationPage(WebDriver driver) {
		super(driver);

	} 
	
	
	
	// Approval Confirmation Message
	
	public boolean VerifyData_VAApprovalMessage() 
	{
		boolean flag = false;
		
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_APPROVED_CONGRATSMESSAGE).isDisplayed();
		if(flag){extentLogs.passWithCustom("VerifyVAApprovedMessage", "Approved Message is displayed");
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_APPROVED_AMOUNTMESSAGE).isDisplayed();
		if(flag){extentLogs.passWithCustom("VerifyVAApprovedAmountMessage", "Approved Amount Message is displayed");
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_APPROVED_EXPIRYMESSAGE).isDisplayed();
		if(flag){extentLogs.passWithCustom("VerifyVAApprovedExpireMessage", "Expire Message is displayed");
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_PRODUCTNAME).isDisplayed();
		if(flag){extentLogs.passWithCustom("VerifyVAApprovedProductMessage", "Product Message is displayed");
		
		}else{extentLogs.fail("VerifyVAApprovedProductMessage", "Product Message is not displayed");}
		}else{extentLogs.fail("VerifyVAApprovedExpireMessage", "Expire Message is not displayed");}
		}else{extentLogs.fail("VerifyVAApprovedAmountMessage", "Approved Amount Message is not displayed");}
		}else{extentLogs.fail("VerifyVAApprovedMessage", "Approved Message is not displayed");}
		
		
		
	
		
		return flag;
	}
	
	
	// Conditional Approval Confirmation Message
	
	
	public boolean VerifyData_VAConditionalMessage() 
	{
		boolean flag = false;
		
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_CONDITIONAL_MESSAGE).isDisplayed();
		if(flag){extentLogs.pass("VerifyVAConditionalMessage", "Conditional Approved Message is displayed");
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_PRODUCTNAME).isDisplayed();
		if(flag){extentLogs.pass("VerifyVAApprovedProductMessage", "Product Message is displayed");
		
		}else{extentLogs.pass("VerifyVAConditionalApprovalProductMessage", "Product Message is not displayed");}
		
		}else{extentLogs.pass("VerifyVAApprovalApprovedMessage", "Conditional Approval Message is not displayed");}
		
		
		
	
		
		return flag;
	}
	
	

	//  Approval Decline Confirmation Message
	
	
	public boolean VerifyData_VADeclineMessage() 
	{
		boolean flag = false;
		
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_DECLINE_MESSAGE).isDisplayed();
		if(flag){extentLogs.pass("VerifyVADeclineMessage", " Approval Decline Message is displayed");
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_DECLINE_DESC).isDisplayed();
		if(flag){extentLogs.pass("VerifyVADeclineDescription", "Decline Description is displayed");
		
		}else{extentLogs.pass("VerifyVADeclineDescription", "Decline Description is Not displayed");}
		
		}else{extentLogs.pass("VerifyVADeclineMessage", "Decline Message is not displayed");}
		
		
		
	
		
		return flag;
	}
	
	
	
	
	// this method verify the Thank you message
	
	public boolean VA_OrderConfirmation_ThankYouMessage() {
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_THANKYOU).isDisplayed();
		if(flag){extentLogs.pass("VerifyOrderDetails", "OrderConfirmationIsDisplayed");
	    }else{extentLogs.fail("VerifyOrderDetails", "OrderNumberLabelIsNotDisplayed");}
		
		return flag;
	}
	
	

	// this method verify the Product Details
	
	public boolean VA_OrderConfirmation_ProductDetails() {
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_PRODUCTNAME).isDisplayed();
		if(flag){extentLogs.pass("VerifyProductDetails", "ProductDetailsareIsDisplayed");
	    }else{extentLogs.fail("VerifyProductDetails", "ProductDetailsareNotDisplayed");}
		
		return flag;
	}
	
	

	// this method verify the What's Next Section
	
	public boolean VA_OrderConfirmation_WhatIsNextSection() {
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_WHATSNEXT).isDisplayed();
		if(flag){extentLogs.pass("VerifyWhat'sNextSection", "What'sNextSectionIsDisplayed");
	    }else{extentLogs.fail("VerifyWhat'sNextSection", "What'sNextSectionIsNotDisplayed");}
		
		return flag;
	}
	
	
	// this method verify the Upon Delivery Section
	
		public boolean VA_OrderConfirmation_UponDeliverySection() {
			boolean flag = false;
			
			flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_UPONDELIVERY).isDisplayed();
			if(flag){extentLogs.pass("VerifyUponDeliverySection", "UponDeliverySectionIsDisplayed");
		    }else{extentLogs.fail("VerifyUponDeliverySection", "UponDeliverySectionIsNotDisplayed");}
			
			return flag;
		}
	
	
		
		// this method verify the My Store Section
		
		public boolean VA_OrderConfirmation_MyStoreSection() {
			boolean flag = false;
			
			flag=CommonVariables.CommonDriver.get().findElement(VA_ConfirmationScreen_OR.VA_STOREDETAILSCONFIRMATION).isDisplayed();
			if(flag){extentLogs.pass("VerifyMyStoreSection", "MyStoreSectionIsDisplayed");
		    }else{extentLogs.fail("VerifyMyStoreSection", "MyStoreSectionIsNotDisplayed");}
			
			return flag;
		}
	
	
	
	
	
}
	



