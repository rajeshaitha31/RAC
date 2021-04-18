package com.web.automation.scripts;

import org.testng.annotations.Test;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.pages.Ecom_HomePage;

public class Ecom_SetStore_ChangeBaseStore extends TestEngineWeb{
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	private String InitialStore = "71111";
	private String UpdatedStore = "92530";
	
	@Test(groups = { "smoke", "regression" })
	public void Ecom_SetStore_ChangeBaseStore() throws Throwable{
		
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
        actionLib.WebdriverWaitForPage();
		
        ecom_homepage.set_store(InitialStore);
        actionLib.WebdriverWaitForPage();
        
        /*actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Find_My_Store));
        actionLib.WebdriverWaitForPage();
        actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Change_MyStore));*/
        ecom_homepage.change_store(UpdatedStore);
        extentLogs.pass("ChangeStore", "Store Changed successfully");   
        
        
	}

}
