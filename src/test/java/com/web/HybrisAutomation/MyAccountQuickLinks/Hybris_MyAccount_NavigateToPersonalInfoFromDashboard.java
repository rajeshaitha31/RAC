package com.web.HybrisAutomation.MyAccountQuickLinks;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisMyAccountPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.hybrisobjectrepository.MyAccount_OR;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_MyAccount_NavigateToPersonalInfoFromDashboard extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisMyAccountPage hybris_myaccount;
	private String username,password;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/MyAccountTestData.xlsx";
	protected String sheetName = "QuickLinks";
	private ExtentLogs extentLogs = new ExtentLogs();
	
	
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
		
		      this.username = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2,"username");   
			  this.password = ExcelReader.fn_GetCellData(sheetPath, sheetName,2, "password");
			  		  
	}
		
@Test(groups = { "smoke", "regression" })
public void Hybris_MyAccount_NavigateToPersonalInfoFromDashboard_Test() throws Throwable{

boolean flag = false;
hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
flag=hybris_homepage.LaunchApplication();
Assert.assertEquals(true, flag, "LaunchApplication");
actionLib.WebdriverWaitForPage();
  hybris_myaccount = new HybrisMyAccountPage(CommonVariables.CommonDriver.get());
  flag=hybris_myaccount.SignIn(username,password);  
  Assert.assertEquals(true, flag,"User Signed In");
  
 	 actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PERSONALINFO));		
	 extentLogs.pass("ClickonPersonalInfoLink","ClickedonPersonalInfolLink");
	 CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_TITLE).isDisplayed();
	 extentLogs.pass("PersonalInfoTitle","PersonalInfoTitleIsDisplayed");
	 actionLib.WebdriverWaitForPage();
	 actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_CLOSEPOPUP));
	 extentLogs.pass("ClickonClosePopup","ClickedonPersonalInfoClose"); 
	 flag=hybris_myaccount.SignOut();
	  Assert.assertEquals(true, flag, "TestCasePassed");
	 
	 
}
}