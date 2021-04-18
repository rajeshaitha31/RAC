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

public class Ecom_CustomerService_IgnoreTimeout extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String basestore = "71111";
	/*protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xls";
	protected String sheetName = "CustomerService";
	Recordset testdata = null;*/

	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException, FilloException {

		/*testdata = ExcelReader.GetData(sheetPath,
				"Select * from CustomerService where TestCaseName='CustomerService_ValidData'");*/

	}

	@Test(groups = { "smoke", "regression" })
	public void Ecom_CustomerService_IgnoreTimeout() throws Throwable {
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
		actionLib.WebdriverWaitForPage();
		ecom_homepage.set_store(basestore);

		
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService),"Clicked on customer service");
			WebDriverWait Timeoutwait = new WebDriverWait(actionLib.driver, 600);
			Timeoutwait.until(
					ExpectedConditions.visibilityOf(CommonVariables.CommonDriver.get().findElement(Ecom.TimeOut_Continue)));
			extentLogs.pass("TimeOut", "TimeOutScreenDisplayed");
			Thread.sleep(6000);
			
			WebDriverWait wait = new WebDriverWait(actionLib.driver, 60);
			wait.until(
					ExpectedConditions.visibilityOf(CommonVariables.CommonDriver.get().findElement(Ecom.NonVA_RAC_Logo)));
	        extentLogs.pass("Home Page", "Ignored the Timeout Window and navigated to Home Page");
		}
			
		}

		
