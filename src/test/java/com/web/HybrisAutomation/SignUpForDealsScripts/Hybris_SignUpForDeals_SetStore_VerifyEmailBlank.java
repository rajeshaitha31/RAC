package com.web.HybrisAutomation.SignUpForDealsScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisSignUpForDealsPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.utilities.CommonVariables;

public class Hybris_SignUpForDeals_SetStore_VerifyEmailBlank extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisSignUpForDealsPage hybris_signupdealspage;
	
	private String Email,VerifyEmail,FirstName,LastName,ZipCode;
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/SignupForDeals.xlsx";
	protected String sheetName = "SignupForDeals";
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
				 
		      this.Email = ExcelReader.fn_GetCellData(sheetPath, sheetName, 10,"Email"); 
			  this.VerifyEmail = ExcelReader.fn_GetCellData(sheetPath, sheetName,10, "VerifyEmail");
			  this.FirstName = ExcelReader.fn_GetCellData(sheetPath, sheetName, 10, "FirstName");
			  this.LastName = ExcelReader.fn_GetCellData(sheetPath, sheetName, 10, "LastName");
			  this.ZipCode = ExcelReader.fn_GetCellData(sheetPath, sheetName, 10, "ZipCode");
	} 
	
	@Test(groups = { "smoke", "regression" })
	public void Hybris_SignUpForDeals_SetStore_VerifyEmailBlank_Test() throws Throwable{
		
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
		flag=hybris_signupdealspage.SignUpForDeals_VerifyEmailBlank(Email, VerifyEmail, FirstName, LastName, ZipCode);
		Assert.assertEquals(true, flag, "FillDataintheForm");
		flag=hybris_signupdealspage.VerifyEmailValidation();
	}
	
	
	
	
	}
