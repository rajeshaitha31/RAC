package com.web.HybrisAutomation.ShortformScripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisOrderConfirmationPage;
import com.web.HybrisAutomation.pages.HybrisStartYourOrderPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_NonVA_SubmitContactInfo_FromGlobalHeader extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisStartYourOrderPage startOrder;
	private HybrisOrderConfirmationPage orderconfirmationpage;
	private ExtentLogs extentLogs = new ExtentLogs();
	private String BaseStore,FirstName,LastName,PhoneNumber,Email,VerifyEmail,StreetAddress,Apartment,City,State,ZipCode;
	
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/TestData.xlsx";
	protected String sheetName = "StartOrder_HomePage";
	Map<String, List<String>> testdata = null;  
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		this.BaseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "BaseStore");
		this.FirstName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FirstName");
		this.LastName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "LastName");
		this.PhoneNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "PhoneNumber");
		this.Email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Email");
		this.VerifyEmail = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "VerifyEmail");
		this.StreetAddress = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "StreetAddress");
		this.Apartment = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Apartment");
		this.City = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "City");
		this.State = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "State");
		this.ZipCode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "ZipCode");
		
		
		}
	
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_NonVA_SubmitContactInfo_FromGlobalHeader_Test() throws Throwable{
		
		boolean flag = false;
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		flag=hybris_homepage.LaunchApplication();
	    Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
	    
	    
	    flag=hybris_homepage.HomePage_VerifyAndSetBaseStore(BaseStore);
	    //Assert.assertEquals(true, flag, "VerifyAndSetBaseStore");
	    actionLib.WebdriverWaitForPage();
	    
	    flag=hybris_homepage.StartOrder_GlobalHeader();
	    Assert.assertEquals(true, flag, "StartOrder_Homepage Global Header");
	    extentLogs.info("Navigate to StartOrder","Navigated to StartOrder Page from Global Header");
	    
	    actionLib.WebdriverWaitForPage();
	    startOrder = new HybrisStartYourOrderPage(CommonVariables.CommonDriver.get());
	    flag=startOrder.StartYourOrder_ContactAndDeliveryInfo(FirstName, LastName, Email, VerifyEmail, PhoneNumber, StreetAddress, Apartment, City, State, ZipCode);
	    
	    Assert.assertEquals(true, flag, "StartYourOrder_ContactAndDeliveryInfo");
	    actionLib.WebdriverWaitForPage();
	    
	    startOrder.StartYourOrder_SubmitContactInformation();
	    //startOrder.StartYourOrder_Verify_ThankYou_SubmitContactInfo();
	    
	    actionLib.WebdriverWaitForPage();
	    startOrder.StartYourOrder_ClickSubmitContactInfo();
	          
	      orderconfirmationpage= new HybrisOrderConfirmationPage(CommonVariables.CommonDriver.get());
	      flag=orderconfirmationpage.VerifyOrderConfirmation_ThankYouMessage();
	      flag=orderconfirmationpage.VerifyOrderConfirmation_WhatIsNextSection();
	      flag=orderconfirmationpage.VerifyOrderConfirmation_UponDeliverySection();
	      flag=orderconfirmationpage.VerifyOrderConfirmation_MyStoreSection();
	      
	      
	      
	      Assert.assertEquals(true, flag, "TestCasePassed");
	    
	    
}
}

