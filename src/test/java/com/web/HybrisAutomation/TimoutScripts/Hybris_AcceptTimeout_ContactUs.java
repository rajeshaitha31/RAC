package com.web.HybrisAutomation.TimoutScripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisContactUsPage;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.hybrisobjectrepository.Timeouts_OR;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;

public class Hybris_AcceptTimeout_ContactUs extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisContactUsPage hybris_contactuspage;
	private ExtentLogs extentLogs = new ExtentLogs();
	private String baseStore,firstName,lastName,email,phoneNumber,comments;
	private int topicIndex = 1;
	
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/TestData.xlsx";
	protected String sheetName = "ContactUs";
	Map<String, List<String>> testdata = null;  
	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		
		this.baseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "basestore");
		this.firstName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "FirstName");
		this.lastName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "LastName");
		this.email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "email");
		this.phoneNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "PhoneNumber");
		this.comments = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 2, "Comments");
		
		}
	
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_AcceptTimeout_ContactUs_Test() throws Throwable{
		
		boolean flag = false;
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		flag=hybris_homepage.LaunchApplication();
	    Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();
		
		flag=hybris_homepage.HomePage_VerifyAndSetBaseStore(baseStore);
	    Assert.assertEquals(true, flag, "BaseStoreSet");
	    actionLib.WebdriverWaitForPage();
	   	    
		hybris_contactuspage = new HybrisContactUsPage(CommonVariables.CommonDriver.get());
		hybris_contactuspage.navigateToContactUsPage();
		Assert.assertEquals(true, flag, "NavigatedToContactUsPage");
		
		WebDriverWait Timeoutwait = new WebDriverWait(actionLib.driver, 800);
		Timeoutwait.until(
				ExpectedConditions.visibilityOf(CommonVariables.CommonDriver.get().findElement(Timeouts_OR.TimeoutPopUp_Title)));
		extentLogs.passWithCustom("TimeOut", "TimeOutScreenDisplayed");
		
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Timeouts_OR.Timeout_Continue));
		hybris_contactuspage.ContactUs_FillData(firstName, lastName, email, phoneNumber, topicIndex, comments);
		Assert.assertEquals(true, flag, "ContactUsDataSubmitted");
		hybris_contactuspage.backToHomePage();
		Assert.assertEquals(true, flag, "HomepageDisplayed");
	    Assert.assertEquals(true, flag, "TestCasePassed");
	    
}
}

