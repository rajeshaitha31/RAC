package com.web.automation.scripts;


//TC10-Franchise Store - VA InvN EcomN


import org.testng.annotations.Test;

import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;

import com.web.automation.utilities.CommonVariables;
import com.web.automation.pages.Ecom_HomePage;

public class Ecom_PDPValidation_Scenario10 extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String basestore = "71111";
	private String productcode = "100019424";
	
	@Test(groups = { "smoke", "regression" })
	public void PDPValidation_Scenario10_Test() throws Throwable{
		
		
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
	    actionLib.WebdriverWaitForPage();
	    
	    ecom_homepage.set_store(basestore);
	    ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);
	    
	extentLogs.pass("PDPPage", "Navigated to PDPPage");
    extentLogs.info("PDPValidation", "Franchise Store - VA InvN EcomN WebonlyN");
  	    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_GetStarted_BlueButton));
  	extentLogs.pass("VerifyButton", "BlueVAButtonDisplayed");
  	extentLogs.info("VerifyVAPage", "Verify the Logo and labels in VAPage");
  	    actionLib.IsElementVisible(Ecom.VA_logo);
    extentLogs.pass("VALogo", "VAPageLogoDisplayed");
  		actionLib.IsElementVisible(Ecom.VA_Contactinfo_Label);
	extentLogs.pass("VAContactInfo", "VAContactInfoLabelDisplayed");
  		actionLib.IsElementVisible(Ecom.VA_ApprovalInformation_Label);
	extentLogs.pass("VAApprovalInfo", "VAApprovalInfoLabelDisplayed");
  		actionLib.IsElementVisible(Ecom.VA_Finalize_Agreement_Label);
  	extentLogs.pass("VAFinalizeAgreement", "VAFinalieAgreementLabelDisplayed");
  	extentLogs.pass("VAPage", "VAPageVerificationCompleted");
  	
  	}
	
}

