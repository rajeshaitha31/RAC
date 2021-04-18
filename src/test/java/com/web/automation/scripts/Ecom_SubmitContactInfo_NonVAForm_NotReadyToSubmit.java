package com.web.automation.scripts;

import org.testng.annotations.Test;

import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;

public class Ecom_SubmitContactInfo_NonVAForm_NotReadyToSubmit extends TestEngineWeb{
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	
	private String basestore = "37411";    
	//private String productcode = "100020318"; 
		private String productcode = "100022457";  
	
	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void Ecom_SubmitContactInfo_NonVAForm_NotReadyToSubmit() throws Throwable{
		
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
	    actionLib.WebdriverWaitForPage();
	    
	    ecom_homepage.set_store(basestore);
	    ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);
    	extentLogs.pass("PDPPage", "Navigated to PDPPage");
	    
    	ecom_homepage.NavigateToApproval_PDP();
	    	        
	    actionLib.WebdriverWaitForPage();
	    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.NonVA_RAC_Logo));
	    extentLogs.pass("RAC Home", "Clicked on RAC Logo to Go Back To Previous page");
	    
	    /*actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.BacktoRAC_NoThanks_NonVAForm));
	    extentLogs.pass("No Thanks", "I'm not ready to submit my application");*/
	    
	    }
}
