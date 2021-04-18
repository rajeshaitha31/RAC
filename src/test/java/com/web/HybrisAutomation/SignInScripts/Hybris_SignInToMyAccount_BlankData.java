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
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_SignInToMyAccount_BlankData  extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	private HybrisSignInPage hybris_signInPage;
	
	
	
	
	
	
@Test(groups = { "smoke", "regression" })
public void Hybris_SignInToMyAccount_BlankData_Test() throws Throwable{

boolean flag = false;
hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
flag=hybris_homepage.LaunchApplication();
Assert.assertEquals(true, flag, "LaunchApplication");
actionLib.WebdriverWaitForPage();

hybris_signInPage = new HybrisSignInPage(CommonVariables.CommonDriver.get());
flag = hybris_signInPage.NavigateToSignInPage();
Assert.assertEquals(true, flag,"Navigated to SignIn Page"); 

hybris_signInPage.ClickOnSignInButton();
hybris_signInPage.VerifyErrorMsg(MyAccount_OR.SIGNIN_EMAILERROR, "  Invalid email address. Try again.");

}
}

