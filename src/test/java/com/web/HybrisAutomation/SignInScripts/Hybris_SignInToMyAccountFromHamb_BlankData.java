package com.web.HybrisAutomation.SignInScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisSignInPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;

import com.web.automation.hybrisobjectrepository.MyAccount_OR;
import com.web.automation.utilities.CommonVariables;

public class Hybris_SignInToMyAccountFromHamb_BlankData extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	
	private HybrisSignInPage hybris_signInPage;
	
	
	
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
			  
			  
	}
	
	
@Test(groups = { "smoke", "regression" })
public void Hybris_SignInToMyAccountFromHamb_BlankData_Test() throws Throwable{

boolean flag = false;
hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
flag=hybris_homepage.LaunchApplication();
Assert.assertEquals(true, flag, "LaunchApplication");
actionLib.WebdriverWaitForPage();


  hybris_signInPage = new HybrisSignInPage(CommonVariables.CommonDriver.get());
  
  flag=hybris_signInPage.navigateToMyAccountFromHam();
  Assert.assertEquals(true, flag,"Naivgated To MyAccount Page From Hamburger"); 
  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.HAM_MYACC_SUBMIT));
  actionLib.WebdriverWaitForPage();
  Assert.assertEquals(true, flag,"Clicked on submit button");
  hybris_signInPage.VerifyErrorMsg(MyAccount_OR.HAM_MYACC_EMAILERROR, "  Invalid email address. Try again.");
  
  
  
}
}
