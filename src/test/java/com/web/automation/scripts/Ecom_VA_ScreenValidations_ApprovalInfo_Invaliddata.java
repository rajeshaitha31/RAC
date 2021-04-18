package com.web.automation.scripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.pages.Ecom_HomePage;


public class Ecom_VA_ScreenValidations_ApprovalInfo_Invaliddata extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xls";
	protected String sheetName = "TestData";
	Recordset testdata = null;
	boolean blnstore = false;

	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException, FilloException {
		// Contact Information Details

		testdata = ExcelReader.GetData(sheetPath,
				"Select * from TestData where TestCaseName='Ecom_VAScreenValidation_ApprovalInfo_Invaliddata'");
	}

	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void Ecom_VA_ScreenValidations_ApprovalInfo_Invaliddata_Test() throws Throwable {

		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
		actionLib.WebdriverWaitForPage();
		while (testdata.next()) {
			if (blnstore == false) {
				ecom_homepage.set_store(testdata.getField("basestore"));
				ecom_homepage.Navigate_To_Pdp_withproductcode(testdata.getField("productcode"));
				extentLogs.pass("PDPPage", "Navigated to PDPPage");
			}
			blnstore = true;
			ecom_homepage.NavigateToApproval_PDP();

			actionLib.WebdriverWaitForPage();
			ecom_homepage.VA_FillContactinfoData(testdata);
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_upperformcontinue));
			
			ecom_homepage.VA_FillApprovalInfoData(testdata);
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_finalcheckbox));
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_finalsubmit));
			
			ecom_homepage.VA_VerifyErrorMsg(Ecom.VA_ApprovalInfo_InvalidErrormessage,
					"First name cannot contain special characters or numbers.;"
					+ "Last name cannot contain special characters or numbers.;"
					+ "First name cannot contain special characters or numbers.;"
					+ "Last name cannot contain special characters or numbers.;"
					+ "First name cannot contain special characters or numbers.;"
					+ "Last name cannot contain special characters or numbers.");
					

					}
	}

}

	

