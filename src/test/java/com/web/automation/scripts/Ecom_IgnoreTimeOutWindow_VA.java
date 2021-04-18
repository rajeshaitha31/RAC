package com.web.automation.scripts;

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

public class Ecom_IgnoreTimeOutWindow_VA extends TestEngineWeb {

	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();

	private String basestore = "22306";
	private String productcode = "100022366";

	@Test(groups = { "smoke", "regression" })
	public void IgnoreTimeOutWindow_VA() throws Throwable {

		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
		actionLib.WebdriverWaitForPage();

		ecom_homepage.set_store(basestore);
		ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);

		extentLogs.pass("PDPPage", "Navigated to PDPPage");

		extentLogs.info("PDPValidation", "Franchise Store - VA InvN EcomN WebonlyY");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_GetStarted_BlueButton));
		extentLogs.pass("VerifyButton", "BlueVAButtonDisplayed");
		extentLogs.info("VerifyVAPage", "Verify the Logo and labels in VAPage");
		actionLib.IsElementVisible(Ecom.VA_logo);
		extentLogs.pass("VALogo", "VAPageLogoDisplayed");

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