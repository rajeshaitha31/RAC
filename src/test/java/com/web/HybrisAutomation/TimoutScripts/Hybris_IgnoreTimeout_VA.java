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
import com.web.automation.hybrisobjectrepository.HomePage_OR;
import com.web.automation.hybrisobjectrepository.Timeouts_OR;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.utilities.CommonVariables;

public class Hybris_IgnoreTimeout_VA extends TestEngineWeb {

	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
    private HybrisGetApprovedNowPage getApproved;
	
	private HybrisPDPPage hybrispdppage;
	private HybrisVAConfirmationPage vaconfirmpage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	private String Productcode,BaseStore;
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/Timeouts.xlsx";
	protected String sheetName = "VA_Form";
	Map<String, List<String>> testdata = null; 

	
	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		//Contact Information Details
		this.BaseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "BaseStore");
		this.Productcode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Productcode");
			
		}
	
			
	@Test(groups = { "smoke", "regression" })
	public void Hybris_IgnoreTimeout_VA_Test() throws Throwable
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
	
	//WebDriverWait wait = new WebDriverWait(actionLib.driver, 100);
	//wait.until(
		//	ExpectedConditions.invisibilityOfElementLocated(Timeouts_OR.TimeoutPopUp_Title));
	
	//actionLib.waitForElementPresent(HomePage_OR.STARTORDER_HOMEPAGE,60 );
	
	Thread.sleep(10000);
	WebDriverWait wait = new WebDriverWait(actionLib.driver, 60);

	wait.until(
			ExpectedConditions.visibilityOf(CommonVariables.CommonDriver.get().findElement(Timeouts_OR.Homepage_NoCreditTitle)));
	
	extentLogs.passWithCustom("Home Page", "Ignored the Timeout Window and navigated to Home Page");

}
}

