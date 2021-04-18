package com.web.HybrisAutomation.TopCategoriesScripts;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisTopCategoriesPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_TopCategories_Furniture extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisTopCategoriesPage hybris_topcategoriespage;
	private ExtentLogs extentLogs = new ExtentLogs();
	private String Category = "Furniture";

		
	@Test(groups = { "smoke", "regression" })
	public void Hybris_TopCategories_Furniture_Test() throws Throwable{
		
		boolean flag = false;
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		flag=hybris_homepage.LaunchApplication();
		Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
		
		hybris_topcategoriespage = new HybrisTopCategoriesPage(CommonVariables.CommonDriver.get());
		hybris_topcategoriespage.NavigateAndVerifyTopCategory(Category);
		
	}
	
	
	
	
	}
	
