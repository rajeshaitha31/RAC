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

public class Ecom_GetApproved_ContactInformation_ScreenValidations_BlankData extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xls";
	protected String sheetName = "Contact_Information";
	Recordset testdata = null;
	boolean blnstore = false;

	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException, FilloException {
		// Contact Information Details

		testdata = ExcelReader.GetData(sheetPath,
				"Select * from TestData where TestCaseName='Ecom_GetApproved_Contact_Information_Screen_Validations'");
	}

	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void NonVAContact_Information_Screen_Validations__BlankData() throws Throwable {

		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
		actionLib.WebdriverWaitForPage();
		while (testdata.next()) {
			if (blnstore == false) {
				ecom_homepage.set_store(testdata.getField("basestore"));
				ecom_homepage.Navigate_To_Pdp_withproductcode(testdata.getField("productcode"));
				extentLogs.pass("PDPPage", "Navigated to PDPPage");
			}
			actionLib.WebdriverWaitForPage();
			blnstore = true;
			ecom_homepage.NavigateToApproval_PDP();

			
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_upperformcontinue));
			
			ecom_homepage.verifyErrorMsg(Ecom.NonVA_ErrorMessage,
					"● Please enter your first name.;● Please enter your last name.;● Please enter a valid phone number, including area code.;● Please enter your email address.;● Please select the best time to call.;● Please enter your address.;● Please enter your city.;● Please select an option.;● Please enter your 5 digit ZIP code.");

			/*ecom_homepage.NonVA_FillContactinfoData(testdata);
			ecom_homepage.verifyErrorMsg(Ecom.VA_ErrorMessage,
					"● First name cannot contain special characters or numbers.;● Last name cannot contain special characters or numbers.;● Please enter a valid phone number, including area code.;● Please enter a valid email address.");
					*/
		}

	}

}
