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
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_MyAccount_DeleteBankPaymentMehod extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisMyAccountPage hybris_myaccount;
	private String username,password,paymentType;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/MyAccountTestData.xlsx";
	protected String sheetName = "TestData";
	private ExtentLogs extentLogs = new ExtentLogs();
	
	
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
		
		
		 
		      this.username = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2,"username"); 
			  this.password = ExcelReader.fn_GetCellData(sheetPath, sheetName,2, "password");
			  this.paymentType = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2, "paymentType"); 
			  
			  
	}
	
	
@Test(groups = { "smoke", "regression" })
public void Hybris_MyAccount_DeleteBankPaymentMehod_Test() throws Throwable{

boolean flag = false;
hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
flag=hybris_homepage.LaunchApplication();
Assert.assertEquals(true, flag, "LaunchApplication");
actionLib.WebdriverWaitForPage();


  hybris_myaccount = new HybrisMyAccountPage(CommonVariables.CommonDriver.get());
  flag=hybris_myaccount.SignIn(username,password);  
  Assert.assertEquals(true, flag,"User Signed In"); 
  flag=hybris_myaccount.NavigateToPaymentMethods(); 
  Assert.assertEquals(true, flag,"Navigated to Payment Methods"); 
  actionLib.WebdriverWaitForPage();
  int noOfpaymentMethodsbeforedelete = hybris_myaccount.numberOfPaymentMethods();
  flag=hybris_myaccount.deletePaymentMethod(paymentType);
  Assert.assertEquals(true, flag,"Deleted Payment Method");
  actionLib.WebdriverWaitForPage();
  actionLib.RefreshBrowser();
  int noOfpaymentMethodsafterdelete = hybris_myaccount.numberOfPaymentMethods();
  
  if(noOfpaymentMethodsbeforedelete!=noOfpaymentMethodsafterdelete) {
	  extentLogs.pass("DeletePaymentMethod", "Payment Methods deleted Successfully");
  }
  
  else {
	  extentLogs.fail("DeletePaymentMethod", "Unable to delete payment method");
  }
  flag=hybris_myaccount.SignOut();
  Assert.assertEquals(true, flag, "TestCasePassed");

}
}
