package com.web.HybrisAutomation.pages;

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


import com.web.automation.hybrisobjectrepository.PDP_OR;
import com.web.automation.hybrisobjectrepository.ReservationConfirmationScreen_OR;
import com.web.automation.hybrisobjectrepository.Checkouts_OR;
import com.web.automation.hybrisobjectrepository.HTStore_OR;
import com.web.automation.hybrisobjectrepository.OrderConfirmationScreen_OR;


public class HybrisReservationConfirmationPage extends HybrisBasePage {
	
	
	public HybrisReservationConfirmationPage(WebDriver driver) {
		super(driver);

	} 

 // This Method validates the layout on NonIpoConfirmationScreen
	
	public boolean Verify_NonIpoConfirmation() {
	
	boolean flag = false;
	flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.THANKYOU_LABEL).isDisplayed();
	if(flag){extentLogs.pass("VerifyNonIPOConfirmationScreen_ThankYou", "DISPLAYED");
		flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.ORDERRECEIVED_LABEL).isDisplayed();
		if(flag){extentLogs.pass("VerifyNonIPOConfirmationScreen_ORDERRECEIVED_LABEL", "DISPLAYED");
			flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.WHATNEXT_SECTION).isDisplayed();
			if(flag){extentLogs.pass("VerifyNonIPOConfirmationScreen_WHATNEXT_SECTION", "DISPLAYED");
				flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.UPONDELIVERY_SECTION).isDisplayed();
				if(flag){extentLogs.pass("VerifyNonIPOConfirmationScreen_UPONDELIVERY_SECTION", "DISPLAYED");
					flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.STOREDETAILS_CONFIRMATIONSECTION).isDisplayed();
					if(flag){extentLogs.pass("VerifyNonIPOConfirmationScreen_STOREDETAILS_CONFIRMATIONSECTION", "DISPLAYED");
						flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.MYSTORE_SECTION).isDisplayed();
						if(flag){extentLogs.pass("VerifyNonIPOConfirmationScreen_STOREDETAILS_MYSTORE_SECTION", "DISPLAYED");
						  flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.GOTOHOMEPAGE_BUTTON).isDisplayed();
						  if(flag){extentLogs.pass("VerifyNonIPOConfirmationScreen_GOTOHOMEPAGE_BUTTON", "DISPLAYED");
							}else{extentLogs.pass("VerifyNonIPOConfirmationScreen_GOTOHOMEPAGE_BUTTON", "DISPLAYED");}
						}else{extentLogs.fail("VerifyNonIPOConfirmationScreen_STOREDETAILS_MYSTORE_SECTION", "NOTDISPLAYED");}
						}else{extentLogs.fail("VerifyNonIPOConfirmationScreen_STOREDETAILS_CONFIRMATIONSECTION", "NOTDISPLAYED");}
		   		}else{extentLogs.fail("VerifyNonIPOConfirmationScreen_UPONDELIVERY_SECTION", "NOTDISPLAYED");}
			}else{extentLogs.fail("VerifyNonIPOConfirmationScreen_WHATNEXT_SECTION", "NOTDISPLAYED");}
		}else{extentLogs.fail("VerifyNonIPOConfirmationScreen_ORDERRECEIVED_LABEL", "NOTDISPLAYED");}
	}else{extentLogs.fail("VerifyNonIPOConfirmationScreen_ThankYou", "NOTDISPLAYED");}
	
return flag;
	}
	
	// This method verifies the product image container on Order Confirmation page
	
	public boolean VerifyProductDisplayed_OrderConfirmation() {
		
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.PRODUCTIMAGE).isDisplayed();
		if(flag){
			extentLogs.pass("VerifyProductImageDisplayedInConfirmationPage", "Displayed");
		}else{extentLogs.fail("VerifyProductImageDisplayedInConfirmationPage", "NotDisplayed");		}
	return flag;
		}
	
	// This method verifies the order details text containers on Order confirmation page
	
	public boolean VerifyOrderDetails_OrderConfirmation(){
	boolean flag = false;
	flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.PAYMENTCONFIRMATION_LABEL).isDisplayed();
	if(flag){extentLogs.passWithCustom("VerifyOrderDetails", "PAYMENTCONFIRMATION_LABEL");
		flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.ORDERNUMBER_LABEL).isDisplayed();
		if(flag){
			extentLogs.passWithCustom("VerifyOrderDetails", "OrderNumberLabelIsDisplayed");
		}else{extentLogs.fail("VerifyOrderDetails", "OrderNumberLabelIsNotDisplayed");}
	}else{extentLogs.fail("VerifyOrderDetails", "PAYMENTCONFIRMATION_LABEL");}
	
	return flag;
	}
	
	
	// this method verify the Thank you message
	
	public boolean VerifyReservationConfirmation_ThankYouMessage() {
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(ReservationConfirmationScreen_OR.THANKYOU).isDisplayed();
		if(flag){extentLogs.pass("VerifyReservationDetails", "ReservationConfirmationIsDisplayed");
	    }else{extentLogs.fail("VerifyReservationDetails", "ReservationNumberIsNotDisplayed");}
		
		return flag;
	}
	
	//checkout confirmation message
	public boolean VerifyCheckoutConfirmation_ThankYouMessage() {
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(Checkouts_OR.THANKYOU).isDisplayed();
		if(flag){extentLogs.pass("VerifyCheckoutDetails", "CheckoutConfirmationIsDisplayed");
	    }else{extentLogs.fail("VerifyCheckoutDetails", "CheckoutConfirmationIsNotDisplayed");}
		
		return flag;
	}
	// this method will extract the reservation number
	public void  extractReservationNumber() {
		String flag;
		
		flag=CommonVariables.CommonDriver.get().findElement(ReservationConfirmationScreen_OR.RESERVATIONNUMBER).getAttribute("value");
		//if(flag){extentLogs.pass("VerifyReservationDetails", "ReservationConfirmationIsDisplayed");
	    //}else{extentLogs.fail("VerifyReservationDetails", "ReservationNumberIsNotDisplayed");}
		
		//return flag;
		extentLogs.info("Reservation Number is : ", flag);
		System.out.println("Reservation number is : "+flag);
	}
	// this method will extract the reservation number
		public void  extractAgreementNumber() {
			String flag;
			
			flag=CommonVariables.CommonDriver.get().findElement(ReservationConfirmationScreen_OR.RESERVATIONNUMBER).getAttribute("value");
			//if(flag){extentLogs.pass("VerifyReservationDetails", "ReservationConfirmationIsDisplayed");
		    //}else{extentLogs.fail("VerifyReservationDetails", "ReservationNumberIsNotDisplayed");}
			
			//return flag;
			extentLogs.info("Reservation Number is : ", flag);
			System.out.println("Reservation number is : "+flag);
		}
	
	

	// this method verify the Product Details
	
	public boolean VerifyOrderConfirmation_ProductDetails() {
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.PRODUCTIMAGE).isDisplayed();
		if(flag){extentLogs.pass("VerifyProductDetails", "ProductDetailsareIsDisplayed");
	    }else{extentLogs.fail("VerifyProductDetails", "ProductDetailsareNotDisplayed");}
		
		return flag;
	}
	
	

	// this method verify the What's Next Section
	
	public boolean VerifyOrderConfirmation_WhatIsNextSection() {
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.WHATNEXT_SECTION).isDisplayed();
		if(flag){extentLogs.pass("VerifyWhat'sNextSection", "What'sNextSectionIsDisplayed");
	    }else{extentLogs.fail("VerifyWhat'sNextSection", "What'sNextSectionIsNotDisplayed");}
		
		return flag;
	}
	
	
	// this method verify the Upon Delivery Section
	
		public boolean VerifyOrderConfirmation_UponDeliverySection() {
			boolean flag = false;
			
			flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.UPONDELIVERY_SECTION).isDisplayed();
			if(flag){extentLogs.pass("VerifyUponDeliverySection", "UponDeliverySectionIsDisplayed");
		    }else{extentLogs.fail("VerifyUponDeliverySection", "UponDeliverySectionIsNotDisplayed");}
			
			return flag;
		}
	
	
		
		// this method verify the My Store Section
		
		public boolean VerifyOrderConfirmation_MyStoreSection() {
			boolean flag = false;
			
			flag=CommonVariables.CommonDriver.get().findElement(OrderConfirmationScreen_OR.STOREDETAILS_CONFIRMATIONSECTION).isDisplayed();
			if(flag){extentLogs.pass("VerifyMyStoreSection", "MyStoreSectionIsDisplayed");
		    }else{extentLogs.fail("VerifyMyStoreSection", "MyStoreSectionIsNotDisplayed");}
			
			return flag;
		}
	
		public boolean ConfirmOrder_ExpandPricing() {
			
			boolean flag = false;
			flag=CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_WOFPricingInfo).isDisplayed();
			if(flag){extentLogs.pass("ExpandPricingInfo","Displayed");
			flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_WOFPricingInfo));
			if(flag){extentLogs.pass("ExpandPricingInfo","PASS");
			}else {extentLogs.pass("ExpandPricingInfo","FAIL") ;	}
			}else { extentLogs.fail("ExpandPricingInfo","NotDisplayed");}		
			
			return flag;
			
		}
		
		
	public boolean ConfirmOrder_ValidateHTLegalText() {
			
			boolean flag = false;
			
			flag=CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_WOFLegalText).isDisplayed();
			String text = CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_WOFLegalText).getText();
			if(flag){
			extentLogs.pass("WOFVerifyHTLegalText", "Pass::"+text);	
			}else{extentLogs.fail("WOFVerifyHTLegalText", "FAIL");}
			
			return flag;
					
		}
		
		
		
}
	

