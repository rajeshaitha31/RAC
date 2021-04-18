package com.web.automation.scripts;

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
import com.web.automation.objectrepository.Ecom;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;

public class Ecom_SignUpForDeals_SetStore_ValidData extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xls";
	protected String sheetName = "SignUpForDeals";
	Recordset testdata = null;
	private String basestore = "37411";

	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException, FilloException {

		testdata = ExcelReader.GetData(sheetPath,
				"Select * from SignUpForDeals where TestCaseName='SignUpForDeals_ValidData'");

	}

	@Test(groups = { "smoke", "regression" })
	public void SignUpForDeals_setStore_ValidData() throws Throwable {
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
		actionLib.WebdriverWaitForPage();

		while (testdata.next()) {
			ecom_homepage.navigateToSignUpForDeals();
			ecom_homepage.set_store(basestore);
			actionLib.WebdriverWaitForPage();
			ecom_homepage.signUpForDeals_FillData(testdata);
			Assert.assertEquals(
					CommonVariables.CommonDriver.get().findElement(Ecom.SignUpForDeals_SuccessMessage).getText(),
					"Email Sign Up Successful");
			extentLogs.pass("Sign Up for Deals", "Sign Up for Deals is Successful");

		}
	}
}

