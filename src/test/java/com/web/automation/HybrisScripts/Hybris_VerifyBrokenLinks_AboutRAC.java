package com.web.automation.HybrisScripts;

import org.testng.annotations.Test;


import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;

import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;

public class Hybris_VerifyBrokenLinks_AboutRAC extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
		
	
	@Test(groups = { "smoke", "regression" })
	public void Hybris_VerifyBrokenLinks_AboutRAC_Test() throws Throwable{
				
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		final String Url=ConfigManager.getProperties().getProperty("AboutRAC");	
		
		hybris_homepage.NavigateToPage(Url);
	    actionLib.WebdriverWaitForPage();
	    
	    extentLogs.info("Verifying the BrokenLinks in Page", Url);    	    
	
	    hybris_homepage.VerifyLinkStatus();
  	} 

}

