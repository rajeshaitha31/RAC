package com.web.automation.scripts;

import org.testng.annotations.Test;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.pages.Ecom_HomePage;


public class Ecom_GA_SetStore_ZipNotFound extends TestEngineWeb{
		
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	@Test(groups = { "smoke", "regression" })
	public void Ecom_GA_SetStore_ZipNotFound() throws Throwable{
		
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
        actionLib.WebdriverWaitForPage();
        
        ecom_homepage.NavigateToNonVaPage();
        extentLogs.pass("Navigate to ApprovalPage", "Navigated to ApprovalPage from HomePage");
            
        actionLib.WebdriverWaitForPage();
        actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.New_Find_My_Store));
        extentLogs.pass("ClickonSetStore", "");
        actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_EnterZip), "54321" );
        	extentLogs.pass("EnterZipcode", "");
        actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Go_Set_store));
        	extentLogs.pass("ClickGoButton", "");
        actionLib.isElementPresent(Ecom.GA_store_errormessage_zipnotfound);
        	extentLogs.pass("VerifyErrorMessage", "NoStoreErrorMessageDisplayed");
        	
        	
        	
		
	}
	
	
	

}
