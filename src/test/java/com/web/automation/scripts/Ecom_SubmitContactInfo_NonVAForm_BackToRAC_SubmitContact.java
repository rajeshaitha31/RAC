package com.web.automation.scripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;

public class Ecom_SubmitContactInfo_NonVAForm_BackToRAC_SubmitContact extends TestEngineWeb{
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	
	private String basestore = "37411";    
	//private String productcode = "100020318"; 
	private String productcode = "100022457";  
	private String BaseStore,FirstName,LastName,PhoneNumber,PhoneType,Email,VerifyEmail,StreetAddress,Apartment,City,State,ZipCode;
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xlsx";
	protected String sheetName = "Contact_Information";
	Map<String, List<String>> testdata = null;
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
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
				
	}
	
	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void Ecom_SubmitContactInfo_NonVAForm_BackToRAC_SubmitContact() throws Throwable{
		
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
	    actionLib.WebdriverWaitForPage();
	    
	    ecom_homepage.set_store(basestore);
	    ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);
    	extentLogs.pass("PDPPage", "Navigated to PDPPage");
	    
    	ecom_homepage.NavigateToApproval_PDP();
	    	        
	    actionLib.WebdriverWaitForPage();
	    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.RAC_Logo));
	    extentLogs.pass("RAC Home", "Clicked on RAC Logo to Go Back To Previous page");
	    
	    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.BackToRAC_CompleteApplication_NonVAForm));
	    extentLogs.pass("Complete Application", "Clicked on 'Complete Application' to fill the contact info ");
	    	       
	    ecom_homepage.NonVA_SubmitContactinfo(FirstName, LastName, BaseStore,
	    		PhoneType, PhoneNumber, Email, VerifyEmail, StreetAddress, Apartment,
	    		City, State, ZipCode);
	    
	}

}

