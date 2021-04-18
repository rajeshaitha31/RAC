package com.web.HybrisAutomation.TimoutScripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisSignUpForDealsPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.hybrisobjectrepository.Timeouts_OR;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_IgnoreTimeout_SignUpForDeals extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisSignUpForDealsPage hybris_signupdealspage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String ZipCode;
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/Timeouts.xlsx";
	protected String sheetName = "SignUpForDeals";
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
		this.ZipCode = ExcelReader.fn_GetCellData(sheetPath, sheetName, 1, "ZipCode");		 
		      
	} 
	
	@Test(groups = { "smoke", "regression" })
	public void Hybris_IgnoreTimeout_SignUpForDeals_Test() throws Throwable{
		
		boolean flag = false;
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		flag=hybris_homepage.LaunchApplication();
		Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
		

		flag =hybris_homepage.HomePage_VerifyAndSetBaseStore(ZipCode);
		Assert.assertEquals(true, flag, "BaseStoreSet");
		actionLib.WebdriverWaitForPage();
		

		hybris_signupdealspage = new HybrisSignUpForDealsPage(CommonVariables.CommonDriver.get());
		flag = hybris_signupdealspage.NavigateToSignUpForDeals();
		Assert.assertEquals(true, flag, "NavigateToSignUpForDealsPage");
		//actionLib.WebdriverWaitForPage();
		
		
		WebDriverWait Timeoutwait = new WebDriverWait(actionLib.driver, 800);
		Timeoutwait.until(
				ExpectedConditions.visibilityOf(CommonVariables.CommonDriver.get().findElement(Timeouts_OR.TimeOutPopUp_SignUpForDeals)));
		extentLogs.passWithCustom("TimeOut", "TimeOutScreenDisplayed");
		
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(actionLib.driver, 60);

		wait.until(
				ExpectedConditions.visibilityOf(CommonVariables.CommonDriver.get().findElement(Timeouts_OR.Homepage_NoCreditTitle)));
		
		extentLogs.passWithCustom("Home Page", "Ignored the Timeout Window and navigated to Home Page");

		
		
	}
}
