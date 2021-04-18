package com.web.automation.HybrisScripts;

import org.testng.annotations.Test;


import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;

import com.web.automation.utilities.CommonVariables;

public class Hybris_VerifyBrokenLinks extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_VerifyBrokenLinks_Test() throws Throwable{
				
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		hybris_homepage.LaunchApplication();
	    actionLib.WebdriverWaitForPage();
	    
	    extentLogs.info("Verifying the BrokenLinks on EcomPage", "");    	    
	
	    hybris_homepage.VerifyLinkStatus();
  	} 

}

