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

public class Hybris_SignInToMyAccount_InvalidPassword extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	
	private String username,password;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/MyAccountTestData.xlsx";
	protected String sheetName = "SignInTestData";
	private HybrisSignInPage hybris_signInPage;
	
	
	
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
		
		
		 
		      this.username = ExcelReader.fn_GetCellData(sheetPath, sheetName, 3,"username");   
			  this.password = ExcelReader.fn_GetCellData(sheetPath, sheetName,3, "password");
			  
	}
	
	
@Test(groups = { "smoke", "regression" })
public void Hybris_SignInToMyAccount_InvalidPassword_Test() throws Throwable{

boolean flag = false;
hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
flag=hybris_homepage.LaunchApplication();
Assert.assertEquals(true, flag, "LaunchApplication");
actionLib.WebdriverWaitForPage();

hybris_signInPage = new HybrisSignInPage(CommonVariables.CommonDriver.get());

flag=hybris_signInPage.SignIn(username,password);  
Assert.assertEquals(true, flag,"Entered Username,Password"); 
hybris_signInPage.VerifyErrorMsg(MyAccount_OR.SIGNIN_EMAILERROR, "Sign in failed.");
   
  
}
}

