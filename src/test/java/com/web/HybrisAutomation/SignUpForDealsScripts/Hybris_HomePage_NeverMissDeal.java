package com.web.HybrisAutomation.SignUpForDealsScripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_HomePage_NeverMissDeal extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	//private ExtentLogs extentLogs = new ExtentLogs();
	private String email; 
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/TestData.xlsx";
	protected String sheetName = "TestData";
	Map<String, List<String>> testdata = null;
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		
		this.email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "email");
		
		} 
	
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_HomePage_NeverMissDeal_Test() throws Throwable{
		
		boolean flag = false;
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		flag=hybris_homepage.LaunchApplication();
	    Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
	   	    
	    flag=hybris_homepage.NeverMissDeal(email);
	    Assert.assertEquals(true, flag, "SignedUpForDeals");
	    Assert.assertEquals(true, flag, "TestCasePassed");
	    
}
}

