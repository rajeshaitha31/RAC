package com.web.automation.scripts;

import org.testng.annotations.Test;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.pages.Ecom_HomePage;

public class Ecom_SetStore_InvalidZipCode extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	

	@Test(groups = { "smoke", "regression" })
	public void Ecom_InvalidZipCode() throws Throwable{
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
        actionLib.WebdriverWaitForPage();
        
        try{
        	actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.New_Find_My_Store));
        	extentLogs.pass("ClickonSetStore", "");
        	actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.EnterZip), "14523");
        	extentLogs.pass("EnterZipcode", "");
        	actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Go_Set_store));
        	extentLogs.pass("ClickGoButton", "");
        	actionLib.WebdriverWaitForPage();
        	CommonVariables.CommonDriver.get().findElement(Ecom.NoStore_Zip);
        	extentLogs.pass("VerifyNoStoreLocatedMessage", "Messagedisplayed");
        	
        	
        }catch(Exception e){
        	e.printStackTrace();
        }
	}
	
	
}
