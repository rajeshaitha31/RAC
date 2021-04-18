package com.web.automation.WebleadScripts;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;


import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;

public class Ecom_WebleadCreation_DataDriven extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	
	
	
	//private String productcode = "100022366";
	
	
	
	private String Productcode,PhoneNumber,PhoneType,Email,VerifyEmail,StreetAddress,Apartment,City,State,ZipCode,Store;
	private String SourceofIncome,Employer,EmployerPhone,Duration,TakeHome;
	private String FirstName1,SecondName1,Relationship1,RefPhone1,FirstName2,SecondName2,Relationship2,RefPhone2;
	private String cardNumber,cvv;
	
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/WebleadTestData.xlsx";
	protected String sheetName = "TestData";
    Map<String, List<String>> testdata = null;
    
    
	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void Ecom_WebLead_WithIPO() throws Throwable{
		
	 
		
		int rowcount = ExcelReader.fn_GetRowCount(sheetPath, sheetName);
		System.out.println(rowcount);
		
		 for(int i=1;i<=rowcount;i++) {
			 
		 		 
		    this.Productcode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "Productcode");
			this.PhoneNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "PhoneNumber");
			this.PhoneType = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "PhoneType");
			this.Email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "Email");
			this.VerifyEmail = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "VerifyEmail");
			this.StreetAddress = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "StreetAddress");
			this.Apartment = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "Apartment");
			this.City = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "City");
			this.State = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "State");
			this.ZipCode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "ZipCode");
			this.Store = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "Store");
			//Employment Details
			this.SourceofIncome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "SourceofIncome");
			this.Employer = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "Employer");
			this.EmployerPhone = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "EmployerPhone");
			this.Duration = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "Duration");
			this.TakeHome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "TakeHome");
			//Reference details
			this.FirstName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "FirstName1");
			this.SecondName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "SecondName1");
			this.Relationship1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "Relationship1");
			this.RefPhone1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "RefPhone1");
			
			
			this.FirstName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "FirstName2");
			this.SecondName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "SecondName2");
			this.Relationship2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "Relationship2");
			this.RefPhone2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "RefPhone2");
			
			
			this.cardNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "CardNumber");
			this.cvv = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, i, "CVV");
			
		 
		 	
		
			 ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
				ecom_homepage.LaunchApplication();
			    actionLib.WebdriverWaitForPage();
			    
			  
			    ecom_homepage.Navigate_To_Pdp_withproductcode(Productcode);
		    	extentLogs.pass("PDPPage", "Navigated to PDPPage");
			    
		    	ecom_homepage.NavigateToApproval_PDP();
			    	        
			    actionLib.WebdriverWaitForPage();
			    ecom_homepage.NonVA_FillData_Weblead( PhoneType, PhoneNumber, Email, VerifyEmail,
			    							StreetAddress, Apartment, City, State, ZipCode,Store,SourceofIncome, Employer,
			    							EmployerPhone, Duration, TakeHome, FirstName1, SecondName1, Relationship1, 
			    							RefPhone1, FirstName2, SecondName2, Relationship2, RefPhone2, cardNumber, cvv);	
			    
			    
			   
			    
			    
			    
			   
			    
		
			  
		 }
		 
		
	    
	    
	}


}


