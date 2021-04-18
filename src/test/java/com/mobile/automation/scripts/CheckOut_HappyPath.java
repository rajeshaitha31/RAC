package com.mobile.automation.scripts;

import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.junit.*;

import com.desktop.automation.accelerators.DesktopLibrary;
import com.desktop.automation.pages.DesktopPage;
import com.experitest.appium.SeeTestAndroidDriver;
import com.experitest.appium.SeeTestIOSDriver;
import com.experitest.appium.SeeTestIOSElement;
import com.mobile.automation.accelerators.MobileActionLibrary;
import com.mobile.automation.objectrepository.CheckOut_HappyPath_OR;
import com.mobile.automation.pages.MobilePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.ActionsLibrary.Mode;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.pages.signUpPage;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.web.automation.utilities.CommonVariables;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogName;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Login_OR;
import com.web.automation.pages.signUpPage;
import com.web.automation.utilities.CommonVariables;
import com.mobile.automation.accelerators.MobileActionLibrary;

public class CheckOut_HappyPath extends TestEngineWeb{



	@SuppressWarnings("raws")
	//private static SeeTestAndroidDriver<AndroidElement> Adriver;

	private static MobileActionLibrary mob_actionLib;

	private static CheckOut_HappyPath_OR mob_objects;
	private ExtentLogs extentLogs = new ExtentLogs();
	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/testdata/TestData.xlsx";
	protected String sheetName = "CheckOutHappyPath";
	private String Checkout;
	Map<String, List<String>> testdata = null;
	List<Map<String,String>> data = null;
	
	
	@org.testng.annotations.AfterMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void afterMethod() {
		mob_actionLib.ShutDownDriver();
	}

	@org.testng.annotations.BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws WebDriverException, Exception {
		mob_actionLib = new MobileActionLibrary(MobileActionLibrary.Adriver);
		testdata = ExcelReader.getStoredDataFromSelectedRows(sheetPath, sheetName, 1, 2);
	}

	@Test(alwaysRun = true, groups = { "smoke", "regression" })
	public void verifyhappypath() throws WebDriverException, Exception
	{
		
		
		TestEngineWeb.getdatafromExcel(sheetPath, sheetName, 1, "TestCase", "ZipCode", "Product",
				"LastName", "homeaddress", "City", "statecode", "zip", "email", "Month", "Day", "Year",
				"DL", "DLIssuing", "SSN1", "SSN2", "SSN3", "EmpName",
				"EmpPh", "Pay", "Ref1 Fname", "Ref1 LName", "Ref Phn",
				"Ref2 Fname","Ref2 Lname","Ref2 Phn",
				"Ref3 Fname","Ref3 Lname","Ref3 Phn");
		

		@SuppressWarnings("static-access")
		CheckOut_HappyPath_OR chkoutobjects = new CheckOut_HappyPath_OR();


		mob_actionLib.launch("https://uat-mariner.rentacenter.com");
		mob_actionLib.context(MobileActionLibrary.Adriver.getContext());

		MobileActionLibrary.wait(5);

		chkoutobjects.enterzipcode(dbAndExcelData.get("ZipCode"));

		chkoutobjects.searchproduct(dbAndExcelData.get("Product"));

		chkoutobjects.selectproduct();

		chkoutobjects.OrderOnline();

		chkoutobjects.ContinueAsGuest();

		chkoutobjects.CustomerInformation(dbAndExcelData.get("LastName"));

		chkoutobjects.SetAddress(dbAndExcelData.get("homeaddress"),dbAndExcelData.get("City"),dbAndExcelData.get("statecode"),dbAndExcelData.get("zip"));

		chkoutobjects.EnterEmailAddress(dbAndExcelData.get("email"));

		chkoutobjects.EnterDOB(dbAndExcelData.get("Month"),dbAndExcelData.get("Day"),dbAndExcelData.get("Year"));

		chkoutobjects.EnterDLandSSN(dbAndExcelData.get("DL"),dbAndExcelData.get("DLIssuing"),dbAndExcelData.get("SSN1"),dbAndExcelData.get("SSN2"),dbAndExcelData.get("SSN3"));

		chkoutobjects.EmployerInfo(dbAndExcelData.get("EmpName"),dbAndExcelData.get("EmpPh"),dbAndExcelData.get("Pay"));

		chkoutobjects.RefInfo(dbAndExcelData.get("Ref1 Fname"),dbAndExcelData.get("Ref1 LName"),dbAndExcelData.get("Ref Phn"));

		chkoutobjects.Ref2Info(dbAndExcelData.get("Ref2 Fname"),dbAndExcelData.get("Ref2 Lname"),dbAndExcelData.get("Ref2 Phn"));

		chkoutobjects.Ref3Info(dbAndExcelData.get("Ref3 Fname"),dbAndExcelData.get("Ref3 Lname"),dbAndExcelData.get("Ref3 Phn"));

		chkoutobjects.ReviewnEdit();
		
		MobileActionLibrary.wait(30);

		chkoutobjects.SuccessMessageVerification();


	}

	
	
	
	
	
}


