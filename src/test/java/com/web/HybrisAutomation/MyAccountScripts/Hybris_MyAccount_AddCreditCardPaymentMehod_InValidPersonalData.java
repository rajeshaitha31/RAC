package com.web.HybrisAutomation.MyAccountScripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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

public class Hybris_MyAccount_AddCreditCardPaymentMehod_InValidPersonalData extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisMyAccountPage hybris_myaccount;
	private String username,password,paymentType,cardHolderName, street ,zipCode, city;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/MyAccountTestData.xlsx";
	protected String sheetName = "TestData";
	private ExtentLogs extentLogs;
	
	
	Map<String, List<String>> testdata = null; 
	
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
		
		
		/*
		 * testdata = ExcelReader.GetData(sheetPath,
		 * "Select * from TestData where TestCaseName='Hybris_AMS_AddPaymentMehod_CreditCard_validData'"
		 * );
		 */
		 
		
			
			  this.username = ExcelReader.fn_GetCellData(sheetPath, sheetName, 8,"username"); 
			  this.password = ExcelReader.fn_GetCellData(sheetPath, sheetName,8, "password");
			  this.paymentType = ExcelReader.fn_GetCellData(sheetPath, sheetName, 8, "paymentType");
			  this.cardHolderName = ExcelReader.fn_GetCellData(sheetPath, sheetName, 8, "name");
			  this.street = ExcelReader.fn_GetCellData(sheetPath, sheetName, 8, "street");
			  this.zipCode = ExcelReader.fn_GetCellData(sheetPath, sheetName, 8, "zip");
			  this.city = ExcelReader.fn_GetCellData(sheetPath, sheetName, 8, "city");
			 
			  
	}
	
	
@Test(groups = { "smoke", "regression" })
public void Hybris_MyAccount_AddCreditCardPaymentMehod_InValidPersonalData_Test() throws Throwable{

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
  hybris_myaccount.numberOfPaymentMethods();
  flag=hybris_myaccount.SelectPaymentMethodType(paymentType);
  actionLib.WebdriverWaitForPage();
  flag=hybris_myaccount.Add_CreditCard_PaymentMethod_FillData(cardHolderName, street, zipCode, city);
  Assert.assertEquals(true, flag,"Entered Bank Account Details");
  hybris_myaccount.VerifyErrorMsg(MyAccount_OR.CREDITCARD_ERRORMSG, "Name cannot not contain special characters or numbers.!Enter a valid address.!Enter a valid ZIP code.!Enter a valid city.");
  
}
}
