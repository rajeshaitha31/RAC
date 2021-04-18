package com.web.HybrisAutomation.TimoutScripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisGetApprovedNowPage;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisPDPPage;
import com.web.HybrisAutomation.pages.HybrisVAConfirmationPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.hybrisobjectrepository.Timeouts_OR;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_AcceptTimeout_VA extends TestEngineWeb {

	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
    private HybrisGetApprovedNowPage getApproved;
	
	private HybrisPDPPage hybrispdppage;
	private HybrisVAConfirmationPage vaconfirmpage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String Productcode,BaseStore,FirstName,LastName,PhoneNumber,Email,VerifyEmail,StreetAddress,Apartment,City,State,ZipCode;
	private String SourceofIncome,EmployerName,EmployerPhone,Duration,TakeHome;
	private String DOB_Month,DOB_Day,DOB_Year,DL,DL_State,SSN;
	private String FirstName1,SecondName1,Relationship1,RefPhone1,FirstName2,SecondName2,Relationship2,RefPhone2,FirstName3,SecondName3,Relationship3,RefPhone3 ;
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/Timeouts.xlsx";
	protected String sheetName = "VA_Form";
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
		
		
		//SSN and DL Info
		
		this.DOB_Month = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Dob_Month");
		this.DOB_Day = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Dob_Day");
		this.DOB_Year = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Dob_year");
		this.DL = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "DL");
		this.DL_State = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Dl_State");
		this.SSN = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "SSN");
		
		
		
		
		
		
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
		
		this.FirstName3 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "FirstName3");
		this.SecondName3 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "SecondName3");
		this.Relationship3 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Relationship3");
		this.RefPhone3 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "RefPhone3");
		
		}
	
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_VirtualApproval_Approved_Test() throws Throwable
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
	
	getApproved = new HybrisGetApprovedNowPage(CommonVariables.CommonDriver.get());
	actionLib.WebdriverWaitForPage();
    flag = getApproved.GetApprovedNow_ContactAndDeliveryInfo(FirstName, LastName, Email, VerifyEmail, PhoneNumber, StreetAddress, Apartment, City, State, ZipCode);
    Assert.assertEquals(true, flag, "GetApprovedNow_ContactAndDeliveryInfo");
    
    getApproved.GetApprovedNow_Continue();
    actionLib.WebdriverWaitForPage();
    flag = getApproved.GetApprovedNow_PersonalInfo(DOB_Month, DOB_Day, DOB_Year, DL, DL_State, SSN);
    flag = getApproved.GetApprovedNow_EmploymentInfo(SourceofIncome, EmployerName, EmployerPhone, Duration, TakeHome);
    flag = getApproved.GetApprovedNow_ReferencesInfo(FirstName1, SecondName1, RefPhone1, Relationship1, FirstName2, SecondName2, RefPhone2, Relationship2,FirstName3, SecondName3, RefPhone3, Relationship3 );
    Assert.assertEquals(true, flag, "StartYourOrder_EmploymentAndReferencesInfo");
    getApproved.GetApprovedNow_Submit();
    actionLib.WebdriverWaitForPage();
    
    
    vaconfirmpage= new HybrisVAConfirmationPage(CommonVariables.CommonDriver.get());
    flag=vaconfirmpage.VerifyData_VAApprovalMessage();
    Assert.assertEquals(true, flag, "TestCasePassed");


}
}

