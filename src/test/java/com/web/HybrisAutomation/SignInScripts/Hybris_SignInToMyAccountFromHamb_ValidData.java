package com.web.HybrisAutomation.SignInScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisMyAccountPage;
import com.web.HybrisAutomation.pages.HybrisSignInPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.hybrisobjectrepository.MyAccount_OR;
import com.web.automation.utilities.CommonVariables;

public class Hybris_SignInToMyAccountFromHamb_ValidData extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private String username,password;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/MyAccountTestData.xlsx";
	protected String sheetName = "SignInTestData";
	private HybrisSignInPage hybris_signInPage;
	private HybrisMyAccountPage hybris_myaccount;
	
	
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
		
		
		 
		      this.username = ExcelReader.fn_GetCellData(sheetPath, sheetName, 4,"username");   
			  this.password = ExcelReader.fn_GetCellData(sheetPath, sheetName,4, "password");
			  
			  
	}
	
	
@Test(groups = { "smoke", "regression" })
public void Hybris_SignInToMyAccountFromHamb_ValidData_Test() throws Throwable{

boolean flag = false;
hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
flag=hybris_homepage.LaunchApplication();
Assert.assertEquals(true, flag, "LaunchApplication");
actionLib.WebdriverWaitForPage();


  hybris_signInPage = new HybrisSignInPage(CommonVariables.CommonDriver.get());
  hybris_myaccount = new HybrisMyAccountPage(CommonVariables.CommonDriver.get());
  flag=hybris_signInPage.navigateToMyAccountFromHam();
  Assert.assertEquals(true, flag,"Naivgated To MyAccount Page From Hamburger"); 
  flag=hybris_signInPage.SignInFromHamburger(username, password);
  actionLib.WebdriverWaitForPage();
  //flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.MYAGREEMENTS).isDisplayed();
  Assert.assertEquals(true, flag,"Signed in to My Account"); 
  actionLib.WebdriverWaitForPage();
  flag=hybris_myaccount.SignOut();
  Assert.assertEquals(true, flag, "TestCasePassed");
  
  
}
}
