package com.web.HybrisAutomation.CheckoutScripts;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisOrderConfirmationPage;
import com.web.HybrisAutomation.pages.HybrisPDPPage;
import com.web.HybrisAutomation.pages.HybrisReservationConfirmationPage;
import com.web.HybrisAutomation.pages.HybrisStartYourOrderPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.utilities.CommonVariables;

public class Hybris_Reservations_WeeklyPricing_Paypal extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisStartYourOrderPage startOrder;
	private HybrisOrderConfirmationPage orderconfirmationpage;
	private HybrisPDPPage hybrispdppage;
	private HybrisReservationConfirmationPage reservationconfirmationpage;
	//private ExtentLogs extentLogs = new ExtentLogs();
	
	private String Productcode,BaseStore,FirstName,LastName,PhoneNumber,Email,VerifyEmail,StreetAddress,Apartment,City,State,ZipCode,CVV;
	private String SourceofIncome,EmployerName,EmployerPhone,Duration,TakeHome;
	private String FirstName1,SecondName1,Relationship1,RefPhone1,FirstName2,SecondName2,Relationship2,RefPhone2;
	private int CardMonth,CardYear;
	//private BigInteger CardNumber;
	private String CardNumber;
	//final String CardNumber = "5500000254444445";
	private String PaypalEmailid, PaypalPassword;
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/TestData.xlsx";
	protected String sheetName = "Reservations";
	Map<String, List<String>> testdata = null;

	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		this.BaseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "BaseStore");
		this.Productcode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "Productcode");
		this.FirstName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "FirstName");
		this.LastName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "LastName");
		this.PhoneNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "PhoneNumber");
		this.Email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "Email");
		this.VerifyEmail = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "VerifyEmail");
		this.StreetAddress = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "StreetAddress");
		this.Apartment = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "Apartment");
		this.City = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "City");
		this.State = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "State");
		this.ZipCode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "ZipCode");
		System.out.println("Card Value before"+ CardNumber);
		this.CardNumber=ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "CardNumber");
		//this.CardNumber=BigInteger.valueOf(Long.parseLong(ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "CardNumber")));
		System.out.println("Card Value After"+ CardNumber);
		this.CardMonth=Integer.parseInt(ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "CardMonth"));
		this.CardYear=Integer.parseInt(ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "CardYear"));
		this.CVV=ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "CVV");
		this.PaypalEmailid=ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "PaypalEmailid");
		this.PaypalPassword=ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "PaypalPassword");
		//Employment Details
		this.SourceofIncome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "SourceofIncome");
		this.EmployerName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "Employer");
		this.EmployerPhone = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "EmployerPhone");
		this.Duration = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "Duration");
		this.TakeHome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "TakeHome");
		//Reference details
		this.FirstName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "FirstName1");
		this.SecondName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "SecondName1");
		this.Relationship1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "Relationship1");
		this.RefPhone1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "RefPhone1");
		
		
		this.FirstName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "FirstName2");
		this.SecondName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "SecondName2");
		this.Relationship2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "Relationship2");
		this.RefPhone2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "RefPhone2");
		
		} 
	
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_Reservations_WeeklyPricing_NoPromo_PaypalTest() throws Throwable
	{
     boolean flag = false;	
     hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
     flag = hybris_homepage.LaunchApplication();
     Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
	
	
	flag =hybris_homepage.HomePage_VerifyAndSetBaseStore(BaseStore); 
	actionLib.WebdriverWaitForPage();
			
	flag = hybris_homepage.HomePage_SearchItem(Productcode);
	Assert.assertEquals(true, flag, "Search a product");
	actionLib.WebdriverWaitForPage();
	
	flag = hybris_homepage.ResultsPage_ClickDetails(); 
	Assert.assertEquals(true, flag, "Clicked on product details");
	actionLib.WebdriverWaitForPage();
	
	hybrispdppage = new HybrisPDPPage(CommonVariables.CommonDriver.get());
	//flag = hybrispdppage.PDP_SetSemiMonthlyPricingOption();
	flag = hybrispdppage.PDP_StartYourOrder_New();
	actionLib.WebdriverWaitForPage();
	
	startOrder = new HybrisStartYourOrderPage(CommonVariables.CommonDriver.get());
    flag=startOrder.StartYourOrder_ContactAndDeliveryInfo(FirstName, LastName, Email, VerifyEmail, PhoneNumber, StreetAddress, Apartment, City, State, ZipCode);
    Assert.assertEquals(true, flag, "StartYourOrder_ContactAndDeliveryInfo");
    actionLib.WebdriverWaitForPage();
    
    startOrder.StartYourOrder_Continue();
    actionLib.WebdriverWaitForPage();    
		/*
		 * flag=startOrder.StartYourOrder_EmploymentInfo(SourceofIncome, EmployerName,
		 * EmployerPhone, Duration, TakeHome);
		 * flag=startOrder.StartYourOrder_ReferencesInfo(FirstName1, SecondName1,
		 * RefPhone1, Relationship1, FirstName2, SecondName2, RefPhone2, Relationship2);
		 * Assert.assertEquals(true, flag,
		 * "StartYourOrder_EmploymentAndReferencesInfo");
		 * flag=startOrder.StartYourOrder_SubmitWithoutOffer();
		 * Assert.assertEquals(true, flag, "StartYourOrder_SubmitWithoutOffer");
		 */
    flag=startOrder.VerifyReserveYourProduct_message();
    flag=startOrder.VerifyReservationCheckout_message();
    flag = startOrder.PaypalPayment(PaypalEmailid, PaypalPassword);
    reservationconfirmationpage= new HybrisReservationConfirmationPage(CommonVariables.CommonDriver.get());
    flag=reservationconfirmationpage.VerifyReservationConfirmation_ThankYouMessage();
    reservationconfirmationpage.extractReservationNumber();
    
		/*
		 * orderconfirmationpage= new
		 * HybrisOrderConfirmationPage(CommonVariables.CommonDriver.get());
		 * flag=orderconfirmationpage.Verify_NonIpoConfirmation();
		 * actionLib.WebdriverWaitForPage(); Assert.assertEquals(true, flag,
		 * "NonIpoConfirmation");
		 * flag=orderconfirmationpage.VerifyProductDisplayed_OrderConfirmation();
		 * 
		 * actionLib.WebdriverWaitForPage();
		 * 
		 * flag=orderconfirmationpage.VerifyOrderConfirmation_ThankYouMessage();
		 * flag=orderconfirmationpage.VerifyOrderConfirmation_ProductDetails();
		 * flag=orderconfirmationpage.VerifyOrderConfirmation_WhatIsNextSection();
		 * flag=orderconfirmationpage.VerifyOrderConfirmation_UponDeliverySection();
		 * flag=orderconfirmationpage.VerifyOrderConfirmation_MyStoreSection();
		 * 
		 * flag=orderconfirmationpage.ConfirmOrder_ExpandPricing();
		 * actionLib.WebdriverWaitForPage();
		 */
    Assert.assertEquals(true, flag, "TestCasePassed");



}
}
