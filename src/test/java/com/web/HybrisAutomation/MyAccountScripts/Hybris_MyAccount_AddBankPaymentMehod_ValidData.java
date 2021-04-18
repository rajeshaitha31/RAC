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
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_MyAccount_AddBankPaymentMehod_ValidData extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisMyAccountPage hybris_myaccount;
	private String username, password, paymentType, cardHolderName, contactNumber, routingNumber, accountNumber;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/")
			+ "/Hybris_TestData/MyAccountTestData.xlsx";
	protected String sheetName = "TestData";
	private ExtentLogs extentLogs = new ExtentLogs();

	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException, FilloException {
		// Login Details

		this.username = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2, "username");
		this.password = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2, "password");
		this.paymentType = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2, "paymentType");
		this.cardHolderName = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2, "name");
		this.contactNumber = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2, "contactnumber");
		this.routingNumber = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2, "bankroutingnumber");
		this.accountNumber = ExcelReader.fn_GetCellData(sheetPath, sheetName, 2, "bankaccountnumber");

	}

	@Test(groups = { "smoke", "regression" })
	public void Hybris_MyAccount_AddBankPaymentMehod_ValidData_Test() throws Throwable {

		boolean flag = false;
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		flag = hybris_homepage.LaunchApplication();
		Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();

		hybris_myaccount = new HybrisMyAccountPage(CommonVariables.CommonDriver.get());
		flag = hybris_myaccount.SignIn(username, password);
		Assert.assertEquals(true, flag, "User Signed In");
		flag = hybris_myaccount.NavigateToPaymentMethods();
		Assert.assertEquals(true, flag, "Navigated to Payment Methods");
		actionLib.WebdriverWaitForPage();
		int noOfpaymentMethodsbeforeadding = hybris_myaccount.numberOfPaymentMethods();
		flag = hybris_myaccount.SelectPaymentMethodType(paymentType);
		actionLib.WebdriverWaitForPage();
		flag = hybris_myaccount.Add_Bank_PaymentMethod(cardHolderName, contactNumber, routingNumber, accountNumber);
		Assert.assertEquals(true, flag, "Added Bank Payment Methods");
		actionLib.WebdriverWaitForPage();
		actionLib.RefreshBrowser();
		int noOfpaymentMethodsafteradding = hybris_myaccount.numberOfPaymentMethods();

		if (noOfpaymentMethodsafteradding > noOfpaymentMethodsbeforeadding) {
			extentLogs.pass("AddPaymentMethod", "Payment Methods added Successfully");
		}

		else {
			extentLogs.fail("AddPaymentMethod", "Unable to add payment method");
		}
		flag = hybris_myaccount.SignOut();
		Assert.assertEquals(true, flag, "TestCasePassed");

	}
}
