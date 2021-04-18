package com.web.automation.scripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;


import org.testng.annotations.Test;

import com.web.automation.logs.ExtentLogs;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;

import com.web.automation.utilities.CommonVariables;
import com.web.automation.pages.Ecom_HomePage;


public class Ecom_SetStore_VA_BaseStore extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String basestore = "22306";
	private String productcode = "100022366";
	
	
	
	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void Ecom_SetStore_VA_BaseStore_Test() throws Throwable{
		
		
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
	    actionLib.WebdriverWaitForPage();
	    
	    //ecom_homepage.Close_StoreLocator();
	    ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);
    	extentLogs.pass("PDPPage", "Navigated to PDPPage");
	    
    	ecom_homepage.NavigateToApproval_PDP();
    	actionLib.WebdriverWaitForPage();
	    
    	 ecom_homepage.GA_set_store(basestore);
		
	}
	
	
	

}
