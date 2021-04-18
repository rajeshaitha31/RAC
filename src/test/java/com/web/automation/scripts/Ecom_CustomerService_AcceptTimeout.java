package com.web.automation.scripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

public class Ecom_CustomerService_AcceptTimeout extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String basestore = "71111";
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xls";
	protected String sheetName = "CustomerService";
	Recordset testdata = null;

	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException, FilloException {

		testdata = ExcelReader.GetData(sheetPath,
				"Select * from CustomerService where TestCaseName='CustomerService_ValidData'");

	}

	@Test(groups = { "smoke", "regression" })
	public void Ecom_CustomerService_AcceptTimeout() throws Throwable {
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
		actionLib.WebdriverWaitForPage();
		ecom_homepage.set_store(basestore);

		while (testdata.next()) {
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService),"Clicked on customer service");
			WebDriverWait wait = new WebDriverWait(actionLib.driver, 600);
			wait.until(
					ExpectedConditions.visibilityOf(CommonVariables.CommonDriver.get().findElement(Ecom.TimeOut_Continue)));
			extentLogs.pass("TimeOut", "TimeOutScreenDisplayed");
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.TimeOut_Continue));
			extentLogs.pass("Continue", "Clicked on Continue to Fill The Form");
			ecom_homepage.customerService_Filldata(testdata);
			Assert.assertEquals(
					CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_SuccessMessage).getText(),
					"We'll be in touch soon!");
			extentLogs.pass("Query Sent", "Successfuly sent a query to Customer service");
			
		}}

		}

