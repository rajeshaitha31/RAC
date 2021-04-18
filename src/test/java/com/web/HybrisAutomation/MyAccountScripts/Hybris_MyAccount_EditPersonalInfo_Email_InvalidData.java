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
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_MyAccount_EditPersonalInfo_Email_InvalidData  extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisMyAccountPage hybris_myaccount;
	private String username,password,email;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/MyAccountTestData.xlsx";
	protected String sheetName = "PersonalInfo";
	private ExtentLogs extentLogs = new ExtentLogs();
	
	
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
		
		
		 
		      this.username = ExcelReader.fn_GetCellData(sheetPath, sheetName, 4,"username"); 
			  this.password = ExcelReader.fn_GetCellData(sheetPath, sheetName,4, "password");
			  this.email = ExcelReader.fn_GetCellData(sheetPath, sheetName,4, "email");
			  
			  
	}
	
	
@Test(groups = { "smoke", "regression" })
public void Hybris_MyAccount_EditPersonalInfo_Email_InvalidData_Test() throws Throwable{

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
	 actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_EDIT));		
	 extentLogs.pass("EditPersonalInfo","ClickedonEditPersonalInfo");
	 CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_EMAIL).clear();
	 actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_EMAIL), email);
	 extentLogs.pass("EnterEmail","EnteredEmail");
	 actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_UPDATE));		
	 
	 
	 Assert.assertEquals(CommonVariables.CommonDriver.get()
				.findElement(MyAccount_OR.PERSONALINFO_EMAILERRORMSG).getText(),"Please enter a valid email.");
	  extentLogs.pass("VerifyErrorMessage", "Error Message 'Please enter a valid email address.' matched with actual Message: Please enter a valid email address.");
  Assert.assertEquals(true, flag, "TestCasePassed");

}
}
