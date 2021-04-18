package com.web.automation.scripts;


//TC08-RTO Store - VANONVA InvN EcomN WebonlyN

import org.testng.annotations.Test;

import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;

import com.web.automation.utilities.CommonVariables;
import com.web.automation.pages.Ecom_HomePage;

public class Ecom_PDPValidation_Scenario8 extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String basestore = "45229";
	private String productcode = "100022366";
	
	@Test(groups = { "smoke", "regression" })
	public void PDPValidation_Scenario8_Test() throws Throwable{
		
				
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
	    actionLib.WebdriverWaitForPage();
	    
	    ecom_homepage.set_store(basestore);
	    ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);
  	    extentLogs.pass("PDPPage", "Navigated to PDPPage");
	    extentLogs.info("PDPValidation", "RTOStore VANONVA InvN EcomN WebonlyN");
  	    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_GetStarted_BlueButton));
  	extentLogs.pass("VerifyButton", "BlueNonVAButtonDisplayed");
  		//actionLib.IsElementVisible(Ecom.NONVA_FormText);
  //	actionLib.IsElementVisible(Ecom.NONVA_NewLogo);
  		actionLib.IsElementVisible(Ecom.GA_Contactinfo_Section);
  	extentLogs.pass("VerifyNONVA", "NONVAFormContactInfoSectionDisplayed");
  		actionLib.IsElementVisible(Ecom.GA_Employmentinfo_Section);
  	extentLogs.pass("VerifyNONVA", "EmploymentInfoSectionDisplayed");
  	
  	}
	
}

