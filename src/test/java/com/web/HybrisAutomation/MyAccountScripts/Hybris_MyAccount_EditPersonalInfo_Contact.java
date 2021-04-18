package com.web.HybrisAutomation.MyAccountScripts;

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
import com.web.automation.utilities.CommonVariables;

public class Hybris_MyAccount_EditPersonalInfo_Contact extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisMyAccountPage hybris_myaccount;
	private String username,password;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/MyAccountTestData.xlsx";
	protected String sheetName = "PersonalInfo";
	//private ExtentLogs extentLogs;
	
	
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
		
		
		 
		      this.username = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2,"username"); 
			  this.password = ExcelReader.fn_GetCellData(sheetPath, sheetName,2, "password");
			  
			  
	} 
	
	
@Test(groups = { "smoke", "regression" })
public void Hybris_MyAccount_EditPersonalInfo_Contact_Test() throws Throwable{

boolean flag = false;
hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
flag=hybris_homepage.LaunchApplication();
Assert.assertEquals(true, flag, "LaunchApplication");
actionLib.WebdriverWaitForPage();
  hybris_myaccount = new HybrisMyAccountPage(CommonVariables.CommonDriver.get());
  flag=hybris_myaccount.SignIn(username,password);  
  Assert.assertEquals(true, flag,"User Signed In"); 
  flag=hybris_myaccount.editPersonalInfo_ContactInfo();
  Assert.assertEquals(true, flag, "Updated Phone Number");
  actionLib.WebdriverWaitForPage();
  actionLib.waitForVisibilityOfElement(MyAccount_OR.WELCOMEMESSAGE, "Welcome Message", 5);
  flag = hybris_myaccount.VerifyDashBoard();
  actionLib.WebdriverWaitForPage();
  flag=hybris_myaccount.SignOut();
  Assert.assertEquals(true, flag, "TestCasePassed");

}
}
