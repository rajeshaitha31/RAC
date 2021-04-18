package com.web.HybrisAutomation.StoreLocatorScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.hybrisobjectrepository.HomePage_OR;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_SetStore_WithoutZip extends TestEngineWeb {

	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	

	@Test(groups = { "smoke", "regression" })
	public void Hybris_SetStore_WithoutZip_Test() throws Throwable
	{
     boolean flag = false;	
     hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
     flag = hybris_homepage.LaunchApplication();
     Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
	
	
		try{
        	actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_STORESELECTOR));
        	extentLogs.pass("ClickonStoreLocator", "ClickedOnStoreLocator");
     
        	actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.SETSTORE_GO));
        	extentLogs.pass("ClickGoButton", "ClickedOnGoButton");
        	
        	if(CommonVariables.CommonDriver.get().findElement(HomePage_OR.BLANKZIPCODE_ERRORMSG).isDisplayed()) {
        		extentLogs.pass("ErrorMsg", "ErrorMsgDisplayed");
        	}
        	
        	else {
        		extentLogs.fail("ErrorMsg", "ErrorMsgIsNotDisplayed");	
        	}
        
        	
			}catch(Exception e){
				e.printStackTrace();
								}
	 
			}
	
}


	