package com.web.automation.scripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.objectrepository.Login_OR;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.ActionsLibrary.Mode;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;
import com.web.automation.pages.BasePage;
import com.web.automation.pages.Ecom_HomePage;

public class Ecom_SetStore_WithoutZip extends TestEngineWeb{

	ActionsLibrary actionLib = new ActionsLibrary();
	private Ecom_HomePage ecom_homepage;
	private ExtentLogs extentLogs = new ExtentLogs();
	
	@Test(groups = { "smoke", "regression" })
	public void Ecom_SetStore_WithoutZip() {
		
		ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
		ecom_homepage.LaunchApplication();
        actionLib.WebdriverWaitForPage();
	
        try{
        	actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.New_Find_My_Store));
        	extentLogs.pass("ClickonSetStore", "");
        	actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Go_Set_store));
        	extentLogs.pass("ClickGoButton", "");
        	actionLib.WebdriverWaitForPage();
        	CommonVariables.CommonDriver.get().findElement(Ecom.Store_errormessage1);
        	extentLogs.pass("VerifyErrorMessage", "Errormessageisdisplayed");
        				}catch(Exception e){
				e.printStackTrace();
								}
		
			}
	
	
}
