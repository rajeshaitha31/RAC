package com.web.automation.scripts;

import org.testng.annotations.Test;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.pages.Ecom_HomePage;

public class Ecom_GA_SetStore_ChangeBaseStore extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private String InitialStore = "71111";
	private String UpdatedStore = "92530";
	private ExtentLogs extentLogs = new ExtentLogs();
	
	@Test(groups = { "smoke", "regression" })
	public void Ecom_GA_SetStore_ChangeBaseStore() throws Throwable{
		
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
        actionLib.WebdriverWaitForPage();
        
        ecom_homepage.NavigateToNonVaPage();
        extentLogs.pass("Navigate to ApprovalPage", "Navigated to ApprovalPage from HomePage");
            
        ecom_homepage.GA_set_store(InitialStore);
        extentLogs.pass("SetBaseStoreinGetApprovedPage", "Base store set in approvalformpage");
        actionLib.WebdriverWaitForPage();
        ecom_homepage.GA_change_basestore(UpdatedStore);
        extentLogs.pass("ChangeBaseStoreinGetApprovedPage", "Base store Changed in approvalformpage");
		
        
        
       
		
	}
	
		
	
	
	
}
