package com.web.automation.scripts;
/*
 * This script is to verify the Ecom GetApproved now functionality from HomePage * User should set the basestore and proceed with getapproved workflow
 */

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.pages.Ecom_HomePage;


public class Ecom_GetApproved_HomePage extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	private String basestore = "71111";
	private String BaseStore,FirstName,LastName,PhoneNumber,PhoneType,Email,VerifyEmail,StreetAddress,Apartment,City,State,ZipCode;
	private String SourceofIncome,Employer,EmployerPhone,Duration,TakeHome;
	private String FirstName1,SecondName1,Relationship1,RefPhone1,FirstName2,SecondName2,Relationship2,RefPhone2;

	//private int BaseStore;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xlsx";
	protected String sheetName = "NonVAFlow_HomePage";
	Map<String, List<String>> testdata = null;
	
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		this.BaseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "BaseStore");
		this.FirstName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FirstName");
		this.LastName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "LastName");
		this.PhoneNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "PhoneNumber");
		this.PhoneType = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "PhoneType");
		this.Email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Email");
		this.VerifyEmail = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "VerifyEmail");
		this.StreetAddress = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "StreetAddress");
		this.Apartment = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Apartment");
		this.City = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "City");
		this.State = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "State");
		this.ZipCode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "ZipCode");
		//Employment Details
		this.SourceofIncome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "SourceofIncome");
		this.Employer = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Employer");
		this.EmployerPhone = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "EmployerPhone");
		this.Duration = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Duration");
		this.TakeHome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "TakeHome");
		//Reference details
		this.FirstName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FirstName1");
		this.SecondName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "SecondName1");
		this.Relationship1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Relationship1");
		this.RefPhone1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "RefPhone1");
		
		
		this.FirstName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FirstName2");
		this.SecondName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "SecondName2");
		this.Relationship2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Relationship2");
		this.RefPhone2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "RefPhone2");
		
		}
	
	
@Test(alwaysRun = true, groups = { "smoke", "regression" })
public void Ecom_GetApproved_HomePage() throws Throwable{
	
	ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
	ecom_homepage.LaunchApplication();
    actionLib.WebdriverWaitForPage();
    
    ecom_homepage.set_store(basestore);
    actionLib.WebdriverWaitForPage();
    
    ecom_homepage.NavigateToNonVaPage();
    extentLogs.pass("Navigate to ApprovalPage", "Navigated to ApprovalPage from HomePage");
        
    actionLib.WebdriverWaitForPage();
    ecom_homepage.NonVA_FillData(FirstName, LastName, BaseStore, PhoneType, PhoneNumber, Email,	VerifyEmail,
    							StreetAddress, Apartment, City, State, ZipCode,	SourceofIncome, Employer,
    							EmployerPhone, Duration, TakeHome, FirstName1, SecondName1, Relationship1, 
    							RefPhone1, FirstName2, SecondName2, Relationship2, RefPhone2);	
    ecom_homepage.VerifyData_NonVAConfirmationPage();
    
}

}