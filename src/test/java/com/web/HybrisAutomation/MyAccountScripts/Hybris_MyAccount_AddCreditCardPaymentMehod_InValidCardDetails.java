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
import com.web.automation.objectrepository.EcomAMS_OR;
import com.web.automation.utilities.CommonVariables;

public class Hybris_MyAccount_AddCreditCardPaymentMehod_InValidCardDetails extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisMyAccountPage hybris_myaccount;
	private String username,password,paymentType,cardHolderName,cardNumber,expMonth,expYear,cvv;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/MyAccountTestData.xlsx";
	protected String sheetName = "TestData";
	public ExtentLogs extentLogs = new ExtentLogs();
	//Recordset testdata = null;
	Map<String, List<String>> testdata = null; 
	
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Login Details
		
		
		
		 
		
			
			  this.username = ExcelReader.fn_GetCellData(sheetPath, sheetName, 9,"username"); 
			  this.password = ExcelReader.fn_GetCellData(sheetPath, sheetName,9, "password");
			  this.paymentType = ExcelReader.fn_GetCellData(sheetPath, sheetName, 9, "paymentType");
			  this.cardHolderName = ExcelReader.fn_GetCellData(sheetPath, sheetName, 9, "name");
			  this.cardNumber = ExcelReader.fn_GetCellData(sheetPath, sheetName, 9, "cardnumber");
			  this.expMonth = ExcelReader.fn_GetCellData(sheetPath, sheetName, 9, "ExpMonth");
			  this.expYear = ExcelReader.fn_GetCellData(sheetPath, sheetName, 9, "ExpYear");
			  this.cvv = ExcelReader.fn_GetCellData(sheetPath, sheetName, 9, "cvv");
			  
	}
	
	
@Test(groups = { "smoke", "regression" })
public void Hybris_MyAccount_AddCreditCardPaymentMehod_InValidCardDetails_Test() throws Throwable{

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
  flag=hybris_myaccount.Add_CreditCard_PaymentMethod(cardHolderName, cardNumber, expMonth, expYear, cvv);
  Assert.assertEquals(true, flag,"Entered credit card details");
 
  Assert.assertEquals(CommonVariables.CommonDriver.get()
			.findElement(MyAccount_OR.CREDITCARD_INVALIDINFOERRORMSG).getText(),"The card information you entered is not correct. Please try again");
  extentLogs.pass("VerifyErrorMessage", "Error Message 'The card information you entered is not correct. Please try again.' matched with actual Message: The card information you entered is not correct. Please try again");
  
  
	
  

}
}
