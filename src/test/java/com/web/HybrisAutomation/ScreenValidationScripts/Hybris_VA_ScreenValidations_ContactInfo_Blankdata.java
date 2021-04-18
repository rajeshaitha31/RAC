package com.web.HybrisAutomation.ScreenValidationScripts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.web.HybrisAutomation.pages.HybrisGetApprovedNowPage;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisPDPPage;
import com.web.HybrisAutomation.pages.HybrisScreenValidations;
import com.web.HybrisAutomation.pages.HybrisVAConfirmationPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.hybrisobjectrepository.ScreenValidations_OR;
import com.web.automation.utilities.CommonVariables;

public class Hybris_VA_ScreenValidations_ContactInfo_Blankdata extends TestEngineWeb {

	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
    private HybrisGetApprovedNowPage getApproved;
	
	private HybrisPDPPage hybrispdppage;
	
	private HybrisScreenValidations screenvalidations;
	//private ExtentLogs extentLogs = new ExtentLogs();
	
	private String BaseStore,Productcode;
	
	
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/TestData.xlsx";
	protected String sheetName = "ScreenValidations";
	Map<String, List<String>> testdata = null; 

	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		this.BaseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "BaseStore");
		this.Productcode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Productcode");
				
		}
	
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_VA_ScreenValidations_ContactInfo_Blankdata_Test() throws Throwable
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
	
	getApproved = new HybrisGetApprovedNowPage(CommonVariables.CommonDriver.get());
	
    
    getApproved.GetApprovedNow_Continue();
    actionLib.WebdriverWaitForPage();
    
    
    screenvalidations = new HybrisScreenValidations(CommonVariables.CommonDriver.get());
    screenvalidations.VA_VerifyErrorMsg(ScreenValidations_OR.VA_ContactInfoBlankDataErrorMessage,"Please enter your first name.;Please enter your last name.;Please enter your email address.;Please enter your email address.;Please enter your phone number, including area code.;Please enter your address.;Please enter your city.;Please select an option.;Please enter your 5 digit ZIP code.");
    


}
}

