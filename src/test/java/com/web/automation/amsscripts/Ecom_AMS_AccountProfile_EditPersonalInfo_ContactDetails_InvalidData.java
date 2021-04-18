package com.web.automation.amsscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.EcomAMS_OR;
import com.web.automation.pages.AMSPage;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;

public class Ecom_AMS_AccountProfile_EditPersonalInfo_ContactDetails_InvalidData extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	public ExtentLogs extentLogs = new ExtentLogs();
	private Ecom_HomePage ecom_homepage;
	private AMSPage amspage;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/AMSTestData.xls";
	protected String sheetName = "TestData";
	Recordset testdata = null;
	boolean blnstore=false;
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException, FilloException {
		// Login Details

		testdata = ExcelReader.GetData(sheetPath,
				"Select * from TestData where TestCaseName='Ecom_AMS_AccountProfile_EditAddress_InvalidData'");
	}
	
	@Test(alwaysRun = true, groups = { "smoke", "regression" })
  public void Ecom_AMS_AccountProfile_EditPersonalInfo_ContactDetails_InvalidData() throws Throwable {
	  
	  ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
		actionLib.WebdriverWaitForPage();
		
		while (testdata.next()) {
			
		amspage = new AMSPage(CommonVariables.CommonDriver.get());
		amspage.login(testdata);
		actionLib.WebdriverWaitForPage();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACCOUNT_PROFILE));
		amspage.editPersonalInfo_contactDetails(testdata,1);
		Assert.assertEquals(CommonVariables.CommonDriver.get()
				.findElement(EcomAMS_OR.ACH_ERRORMSGVALIDATION).getText(),"Please enter a valid phone number.");
		extentLogs.pass("Verify Message Please enter a valid phone number.", "Please enter a valid phone number.");
		
		}
	}
}




