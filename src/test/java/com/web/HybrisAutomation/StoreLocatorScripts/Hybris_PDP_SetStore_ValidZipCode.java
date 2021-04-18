package com.web.HybrisAutomation.StoreLocatorScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.hybrisobjectrepository.HomePage_OR;
import com.web.automation.hybrisobjectrepository.PDP_OR;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_PDP_SetStore_ValidZipCode extends TestEngineWeb {

	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	private String baseStore = "71111";
	private String productCode = "100024680";
	

	@Test(groups = { "smoke", "regression" })
	public void Hybris_PDP_SetStore_ValidZipCode_Test() throws Throwable
	{
     boolean flag = false;	
     hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
     flag = hybris_homepage.LaunchApplication();
     Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
		
		flag = hybris_homepage.HomePage_SearchItem(productCode);
		Assert.assertEquals(true, flag, "Search a product");
		actionLib.WebdriverWaitForPage();
		
		flag = hybris_homepage.ResultsPage_ClickDetails(); 
		Assert.assertEquals(true, flag, "Clicked on product details");
		actionLib.WebdriverWaitForPage();
		extentLogs.pass("PDP", "NavigatedToPDP");
	
		
        	
        	actionLib.type(CommonVariables.CommonDriver.get().findElement(PDP_OR.PDP_ZIPCODE_TEXTBOX), baseStore);
        	extentLogs.pass("EnterZipcode", "EnteredZipcode");
        	actionLib.Click(CommonVariables.CommonDriver.get().findElement(PDP_OR.PDP_GOBUTTON));
        	extentLogs.pass("ClickGoButton", "ClickedOnGoButton");
        	actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(HomePage_OR.MAKETHISMYSTORE));
        	extentLogs.pass("ClickOnMakeThisMyStore", "ClickedOnMakeThisMyStore");
        	actionLib.WebdriverWaitForPage();
        	
        	if(CommonVariables.CommonDriver.get().findElement(PDP_OR.PDP_SELECTEDSTORE).isDisplayed()) {
        		extentLogs.pass("SetBaseStore", "Base store set success");
        	}
        	
        	else {
        		extentLogs.fail("SetBaseStore", "Unable to set base store");	
        	}
        
        	
								}
	 
			}
	

