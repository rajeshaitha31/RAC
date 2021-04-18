package com.web.automation.scripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;

public class Ecom_Unsubscribe_FewEmails_ValidEmail extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	// private ExtentLogs extentLogs = new ExtentLogs();
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xls";
	protected String sheetName = "SignUpForDeals";
	Recordset testdata = null;

	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException, FilloException {

		testdata = ExcelReader.GetData(sheetPath,
				"Select * from SignUpForDeals where TestCaseName='Unsubscribe_Deals_ValidEmail'");

	}

	@Test(groups = { "smoke", "regression" })
	public void Unsubscribe_FewEmails_ValidEmail() throws Throwable {
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
		actionLib.WebdriverWaitForPage();

		while (testdata.next()) {
			ecom_homepage.unsubscribeForDeals_FewerEmails_ValidEmail(testdata);

		}
	}
}
