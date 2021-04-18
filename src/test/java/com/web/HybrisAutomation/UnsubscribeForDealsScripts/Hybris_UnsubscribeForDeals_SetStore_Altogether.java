package com.web.HybrisAutomation.UnsubscribeForDealsScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisUnsubscribePage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.utilities.CommonVariables;

public class Hybris_UnsubscribeForDeals_SetStore_Altogether extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	
	private HybrisUnsubscribePage hybris_unsubscribe;
	private String email;
	private String preference = "altogether";
	private String BaseStore = "37411";
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/TestData.xlsx";
	protected String sheetName = "Unsubscribe";
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
				 
		      this.email = ExcelReader.fn_GetCellData(sheetPath, sheetName, 1,"Email"); 
			  
	} 
	
	@Test(groups = { "smoke", "regression" })
	public void Hybris_UnsubscribeForDeals_SetStore_Altogether_Test() throws Throwable{
		
		boolean flag = false;
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		flag=hybris_homepage.LaunchApplication();
		Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
		
		flag =hybris_homepage.HomePage_VerifyAndSetBaseStore(BaseStore); 
		actionLib.WebdriverWaitForPage();
		
		hybris_unsubscribe = new HybrisUnsubscribePage(CommonVariables.CommonDriver.get());
		flag = hybris_unsubscribe.NavigateToUnsubscribePage();
		Assert.assertEquals(true, flag, "NavigateToUnsubscribePage");
		flag=hybris_unsubscribe.Unsubscribe_FillData(email, preference);
		Assert.assertEquals(true, flag, "FillDataintheForm");
		flag=hybris_unsubscribe.unsubscribe_ClickOnSubmit();
		actionLib.WebdriverWaitForPage();
		flag=hybris_unsubscribe.unsubscribe_VerifySuccessMessage();
		Assert.assertEquals(true, flag, "VerifySuccessMessage");
		 Assert.assertEquals(true, flag, "TestCasePassed");
	}
	
	
	
	
	}