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

public class CheckOut_Decline extends TestEngineWeb{



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

		@SuppressWarnings("static-access")
		CheckOut_HappyPath_OR chkoutobjects = new CheckOut_HappyPath_OR();


		mob_actionLib.launch("http://uat-www.rentacenter.com");
		mob_actionLib.context(MobileActionLibrary.Adriver.getContext());

		MobileActionLibrary.wait(5);

		chkoutobjects.enterzipcode(testdata.get("ZipCode").get(0));

		chkoutobjects.searchproduct(testdata.get("Product").get(0));

		chkoutobjects.selectproduct();

		chkoutobjects.OrderOnline();

		chkoutobjects.ContinueAsGuest();

		chkoutobjects.CustomerInformation(testdata.get("LastName").get(0));

		chkoutobjects.SetAddress(testdata.get("homeaddress").get(0),testdata.get("City").get(0),testdata.get("statecode").get(0),testdata.get("zip").get(0));

		chkoutobjects.EnterEmailAddress(testdata.get("email").get(0));

		chkoutobjects.EnterDOB(testdata.get("Month").get(0),testdata.get("Day").get(0),testdata.get("Year").get(0));

		chkoutobjects.EnterDLandSSN(testdata.get("DL").get(0),testdata.get("DLIssuing").get(0),testdata.get("SSN1").get(0),testdata.get("SSN2").get(0),testdata.get("SSN3").get(0));

		chkoutobjects.EmployerInfo(testdata.get("EmpName").get(0),testdata.get("EmpPh").get(0),testdata.get("Pay").get(0));

		chkoutobjects.RefInfo(testdata.get("Ref1 Fname").get(0),testdata.get("Ref1 LName").get(0),testdata.get("Ref Phn").get(0));

		chkoutobjects.Ref2Info(testdata.get("Ref2 Fname").get(0),testdata.get("Ref2 Lname").get(0),testdata.get("Ref2 Phn").get(0));

		chkoutobjects.Ref3Info(testdata.get("Ref3 Fname").get(0),testdata.get("Ref3 Lname").get(0),testdata.get("Ref3 Phn").get(0));

		chkoutobjects.ReviewnEdit();
		
		MobileActionLibrary.wait(30);

		chkoutobjects.SuccessMessageVerification();


	}


}
