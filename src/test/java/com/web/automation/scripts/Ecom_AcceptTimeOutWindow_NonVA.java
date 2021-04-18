package com.web.automation.scripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;

public class Ecom_AcceptTimeOutWindow_NonVA extends TestEngineWeb {

	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();

	private String productcode = "100022366";
	private String basestore = "37411";

	private String BaseStore, FirstName, LastName, PhoneNumber, PhoneType, Email, VerifyEmail, StreetAddress, Apartment,
			City, State, ZipCode;
	private String SourceofIncome, Employer, EmployerPhone, Duration, TakeHome;
	private String FirstName1, SecondName1, Relationship1, RefPhone1, FirstName2, SecondName2, Relationship2, RefPhone2;

	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xlsx";
	protected String sheetName = "NonVAFlow_HomePage";
	Map<String, List<String>> testdata = null;

	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		// Contact Information Details
		this.BaseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "BaseStore");
		this.FirstName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FirstName");
		this.LastName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "LastName");
		this.PhoneNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "PhoneNumber");
		this.PhoneType = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "PhoneType");
		this.Email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Email");
		this.VerifyEmail = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "VerifyEmail");
		this.StreetAddress = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "StreetAddress");
		this.Apartment = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Apartment");
		this.City = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "City");
		this.State = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "State");
		this.ZipCode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "ZipCode");
		// Employment Details
		this.SourceofIncome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "SourceofIncome");
		this.Employer = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Employer");
		this.EmployerPhone = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "EmployerPhone");
		this.Duration = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Duration");
		this.TakeHome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "TakeHome");
		// Reference details
		this.FirstName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FirstName1");
		this.SecondName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "SecondName1");
		this.Relationship1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Relationship1");
		this.RefPhone1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "RefPhone1");

		this.FirstName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FirstName2");
		this.SecondName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "SecondName2");
		this.Relationship2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Relationship2");
		this.RefPhone2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "RefPhone2");

	}

	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void AcceptTimeOutWindow_NonVA() throws Throwable {

		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
		actionLib.WebdriverWaitForPage();

		ecom_homepage.set_store(basestore);
		ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);
		extentLogs.pass("PDPPage", "Navigated to PDPPage");

		ecom_homepage.NavigateToApproval_PDP();
		// actionLib.WebdriverWaitForPage();
		WebDriverWait wait = new WebDriverWait(actionLib.driver, 600);
		wait.until(
				ExpectedConditions.visibilityOf(CommonVariables.CommonDriver.get().findElement(Ecom.TimeOut_Continue)));
		extentLogs.pass("TimeOut", "TimeOutScreenDisplayed");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.TimeOut_Continue));
		extentLogs.pass("Continue", "Clicked on Continue to Fill The Form");

		ecom_homepage.NonVA_FillData(FirstName, LastName, BaseStore, PhoneType, PhoneNumber, Email, VerifyEmail,
				StreetAddress, Apartment, City, State, ZipCode, SourceofIncome, Employer, EmployerPhone, Duration,
				TakeHome, FirstName1, SecondName1, Relationship1, RefPhone1, FirstName2, SecondName2, Relationship2,
				RefPhone2);

		ecom_homepage.VerifyData_NonVAConfirmationPage();

	}

}
