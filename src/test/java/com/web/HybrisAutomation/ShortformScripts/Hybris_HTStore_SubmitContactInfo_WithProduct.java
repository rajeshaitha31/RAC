package com.web.HybrisAutomation.ShortformScripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisOrderConfirmationPage;
import com.web.HybrisAutomation.pages.HybrisPDPPage;
import com.web.HybrisAutomation.pages.HybrisStartYourOrderPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.utilities.CommonVariables;

public class Hybris_HTStore_SubmitContactInfo_WithProduct extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisStartYourOrderPage startOrder;
	private HybrisOrderConfirmationPage orderconfirmationpage;
	private HybrisPDPPage hybrispdppage;
	//private ExtentLogs extentLogs = new ExtentLogs();
	
	private String Productcode,BaseStore,FirstName,LastName,PhoneNumber,Email,VerifyEmail,StreetAddress,Apartment,City,State,ZipCode;
	
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/TestData.xlsx";
	protected String sheetName = "HTStoreLeadsData";
	Map<String, List<String>> testdata = null; 

	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		this.BaseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "BaseStore");
		this.Productcode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Productcode");
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
	public void Hybris_HTStore_SubmitContactInfo_WithProduct_Test() throws Throwable
	{
     boolean flag = false;	
     hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
     flag = hybris_homepage.LaunchApplication();
     Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
	
	
	flag =hybris_homepage.HomePage_HTVerifyAndSetBaseStore(BaseStore); 
	actionLib.WebdriverWaitForPage();
	
	flag = hybris_homepage.HomePage_SearchItem(Productcode);
	Assert.assertEquals(true, flag, "Search a product");
	actionLib.WebdriverWaitForPage();
	
	flag = hybris_homepage.ResultsPage_ClickDetails(); 
	Assert.assertEquals(true, flag, "Clicked on product details");
	actionLib.WebdriverWaitForPage();
	
	hybrispdppage = new HybrisPDPPage(CommonVariables.CommonDriver.get());
	flag = hybrispdppage.PDP_StartYourOrder();
	actionLib.WebdriverWaitForPage();
	
	startOrder = new HybrisStartYourOrderPage(CommonVariables.CommonDriver.get());
	actionLib.WebdriverWaitForPage();
    flag=startOrder.StartYourOrder_ContactAndDeliveryInfo(FirstName, LastName, Email, VerifyEmail, PhoneNumber, StreetAddress, Apartment, City, State, ZipCode);
    Assert.assertEquals(true, flag, "StartYourOrder_ContactAndDeliveryInfo");
    actionLib.WebdriverWaitForPage();
    
    startOrder.StartYourOrder_SubmitContactInformation();
    startOrder.StartYourOrder_ClickSubmitContactInfo();
    actionLib.WebdriverWaitForPage();
    orderconfirmationpage= new HybrisOrderConfirmationPage(CommonVariables.CommonDriver.get());
    flag=orderconfirmationpage.VerifyOrderConfirmation_ThankYouMessage();
    flag=orderconfirmationpage.VerifyOrderConfirmation_ProductDetails();
    flag=orderconfirmationpage.VerifyOrderConfirmation_WhatIsNextSection();
    flag=orderconfirmationpage.VerifyOrderConfirmation_UponDeliverySection();
    flag=orderconfirmationpage.VerifyOrderConfirmation_MyStoreSection();
    flag=orderconfirmationpage.ConfirmOrder_ExpandPricing();
    actionLib.WebdriverWaitForPage();
    flag=orderconfirmationpage.ConfirmOrder_ValidateHTLegalText();
    Assert.assertEquals(true, flag, "TestCasePassed");


}
}

