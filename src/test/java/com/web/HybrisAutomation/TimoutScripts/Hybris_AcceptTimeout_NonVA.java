package com.web.HybrisAutomation.TimoutScripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import com.web.automation.hybrisobjectrepository.Timeouts_OR;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_AcceptTimeout_NonVA extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisStartYourOrderPage startOrder;
	private HybrisOrderConfirmationPage orderconfirmationpage;
	private HybrisPDPPage hybrispdppage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String Productcode,BaseStore,FirstName,LastName,PhoneNumber,Email,VerifyEmail,StreetAddress,Apartment,City,State,ZipCode;
	private String SourceofIncome,EmployerName,EmployerPhone,Duration,TakeHome;
	private String FirstName1,SecondName1,Relationship1,RefPhone1,FirstName2,SecondName2,Relationship2,RefPhone2;
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/Timeouts.xlsx";
	protected String sheetName = "NonVA";
	Map<String, List<String>> testdata = null;

	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		this.BaseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "BaseStore");
		this.Productcode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Productcode");
		
		
		
		this.FirstName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "FirstName");
		this.LastName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "LastName");
		this.PhoneNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "PhoneNumber");
		this.Email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Email");
		this.VerifyEmail = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "VerifyEmail");
		this.StreetAddress = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "StreetAddress");
		this.Apartment = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Apartment");
		this.City = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "City");
		this.State = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "State");
		this.ZipCode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "ZipCode");
		//Employment Details
		this.SourceofIncome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "SourceofIncome");
		this.EmployerName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Employer");
		this.EmployerPhone = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "EmployerPhone");
		this.Duration = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Duration");
		this.TakeHome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "TakeHome");
		//Reference details
		this.FirstName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "FirstName1");
		this.SecondName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "SecondName1");
		this.Relationship1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Relationship1");
		this.RefPhone1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "RefPhone1");
		
		
		this.FirstName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "FirstName2");
		this.SecondName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "SecondName2");
		this.Relationship2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Relationship2");
		this.RefPhone2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "RefPhone2"); 
		
		}
	
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_AcceptTimeout_NonVA_Test() throws Throwable
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
	flag = hybrispdppage.PDP_StartYourOrder();
	actionLib.WebdriverWaitForPage();
	
	WebDriverWait Timeoutwait = new WebDriverWait(actionLib.driver, 800);
	Timeoutwait.until(
			ExpectedConditions.visibilityOf(CommonVariables.CommonDriver.get().findElement(Timeouts_OR.TimeoutPopUp_Title)));
	extentLogs.passWithCustom("TimeOut", "TimeOutScreenDisplayed");
	
	actionLib.Click(CommonVariables.CommonDriver.get().findElement(Timeouts_OR.Timeout_Continue));
	
	startOrder = new HybrisStartYourOrderPage(CommonVariables.CommonDriver.get());
	actionLib.WebdriverWaitForPage();
    flag=startOrder.StartYourOrder_ContactAndDeliveryInfo(FirstName, LastName, Email, VerifyEmail, PhoneNumber, StreetAddress, Apartment, City, State, ZipCode);
    Assert.assertEquals(true, flag, "StartYourOrder_ContactAndDeliveryInfo");
    
    startOrder.StartYourOrder_Continue();
    actionLib.WebdriverWaitForPage();
    flag=startOrder.StartYourOrder_EmploymentInfo(SourceofIncome, EmployerName, EmployerPhone, Duration, TakeHome);
    flag=startOrder.StartYourOrder_ReferencesInfo(FirstName1, SecondName1, RefPhone1, Relationship1, FirstName2, SecondName2, RefPhone2, Relationship2);
    Assert.assertEquals(true, flag, "StartYourOrder_EmploymentAndReferencesInfo");
    flag=startOrder.StartYourOrder_ClickClaimOffer();
    Assert.assertEquals(true, flag, "StartYourOrder_SubmitWithOffer");
    flag=startOrder.StartYourOrder_ClaimOffer();
    actionLib.WebdriverWaitForPage();
    Assert.assertEquals(true, flag, "StartYourOrder_SubmitWithOffer");
        
    orderconfirmationpage= new HybrisOrderConfirmationPage(CommonVariables.CommonDriver.get());
    flag=orderconfirmationpage.VerifyOrderDetails_OrderConfirmation();
    Assert.assertEquals(true, flag, "TestCasePassed");
	
	
	}
}
	
