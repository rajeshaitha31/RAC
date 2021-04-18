package com.web.automation.scripts;

import org.testng.annotations.Test;

import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;

public class Ecom_SubmitContactInfo_VAForm_NotReadyToSubmit extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String basestore = "22306";
	//private String productcode = "100020318"; //Old
	private String productcode = "100022457";  //New
	
	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void Ecom_SubmitContactInfo_VAForm_NotReadyToSubmit() throws Throwable{
		
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
	    actionLib.WebdriverWaitForPage();
	    
	    ecom_homepage.set_store(basestore);
	    ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);
    	extentLogs.pass("PDPPage", "Navigated to PDPPage");
	    
    	ecom_homepage.NavigateToApproval_PDP();
	    	        
	    actionLib.WebdriverWaitForPage();
	    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Back));
	    extentLogs.pass("Back To RAC", "Clicked on Back to RAC");
	    
	    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.BacktoRAC_NoThanks_VAForm));
	    extentLogs.pass("No Thanks", "I'm not ready to submit my application");
	    
	    
	    
	    
	    
	    	}
}

