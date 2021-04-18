package com.web.HybrisAutomation.ContactUsScripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisContactUsPage;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.utilities.CommonVariables;

public class Hybris_ContactUs_withoutStore_ValidData extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary(); 
	private HybrisHomePage hybris_homepage;
	private HybrisContactUsPage hybris_contactuspage;
	//private ExtentLogs extentLogs = new ExtentLogs();
	private String firstName,lastName,email,phoneNumber,comments;
	private int topicIndex = 1;
	
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/TestData.xlsx";
	protected String sheetName = "ContactUs";
	Map<String, List<String>> testdata = null; 
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		
		this.firstName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FirstName	");
		this.lastName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "LastName");
		this.email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "email");
		this.phoneNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "PhoneNumber");
		this.comments = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Comments");
		
		}
	
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_ContactUs_withoutStore_ValidData_Test() throws Throwable{
		
		boolean flag = false;
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		flag=hybris_homepage.LaunchApplication();
	    Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
	   	    
		hybris_contactuspage = new HybrisContactUsPage(CommonVariables.CommonDriver.get());
		hybris_contactuspage.navigateToContactUsPage();
		Assert.assertEquals(true, flag, "NavigatedToContactUsPage");
		hybris_contactuspage.ContactUs_FillData(firstName, lastName, email, phoneNumber, topicIndex, comments);
		Assert.assertEquals(true, flag, "ContactUsDataSubmitted");
		hybris_contactuspage.backToHomePage();
		Assert.assertEquals(true, flag, "HomepageDisplayed");
	    Assert.assertEquals(true, flag, "TestCasePassed");
	    
}
}

