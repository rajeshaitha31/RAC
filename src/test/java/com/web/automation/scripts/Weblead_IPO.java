package com.web.automation.scripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.Ecom_HomePage;
import com.web.automation.utilities.CommonVariables;

public class Weblead_IPO extends TestEngineWeb {
	
	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	//private String productcode = "100021224"; //Old
	private String productcode = "100022366";
	private String basestore = "37411";
	
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/WebleadTestData.xls";
	protected String sheetName = "TestData";
	Recordset testdata = null;
	//Map<String, List<String>> testdata = null;
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException,FilloException {
		//Contact Information Details
		
		testdata = ExcelReader.GetData(sheetPath,
				"Select * from TestData where TestCaseName='weblead1' ");
		}
	
	
	
	
	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void Ecom_Weblead() throws Throwable{
		
		
		
				
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
	    actionLib.WebdriverWaitForPage();
	    
	    while (testdata.next()) {
	    
	    //ecom_homepage.set_store(basestore);
	    ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);
    	extentLogs.pass("PDPPage", "Navigated to PDPPage");
	    
    	ecom_homepage.NavigateToApproval_PDP();
    	actionLib.WebdriverWaitForPage();
	    ecom_homepage.WebLead_FillData(testdata);	
	    
	    ecom_homepage.submit_IPO(testdata);
	    
	    //ecom_homepage.VerifyData_NonVAConfirmationPage();
	    
	}

	
	

}
}

