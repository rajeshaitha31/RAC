package com.web.automation.scripts;


import org.testng.annotations.Test;

import com.web.automation.logs.ExtentLogs;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.pages.Ecom_HomePage;


public class Ecom_VerifyBrokenLinks extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
			
	@Test(groups = { "smoke", "regression" })
	public void Ecom_VerifyBrokenLinks_Test() throws Throwable{
				
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
	    actionLib.WebdriverWaitForPage();
	    
	    extentLogs.info("Verifying the BrokenLinks on EcomPage", "");    	    
	
      	ecom_homepage.VerifyLinkStatus();
  	}

}
