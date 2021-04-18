package com.mobile.automation.scripts;

import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;

import com.experitest.appium.SeeTestAndroidDriver;
import com.experitest.appium.SeeTestIOSDriver;
import com.experitest.appium.SeeTestIOSElement;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.ActionsLibrary.Mode;
import com.web.automation.utilities.ConfigManager;

import java.net.URL;
import java.net.MalformedURLException;



public class CopyOfdemo {
	

	 public static String driverPath = "C:/RAC Automation/RAC_Mobile/Codebase/Tool/chromedrivers/windows/";
	 private static ChromeOptions chromeoptions;
	 
	 private static SeeTestIOSDriver<SeeTestIOSElement> Adriver = null;
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		String reportDirectory = "reports";
		 String reportFormat = "xml";
		 String testName = "Untitled";
		 AndroidDriver<AndroidElement> driver = null;

		 DesiredCapabilities dc = new DesiredCapabilities();
		
//		  dc.setCapability("reportDirectory", reportDirectory);
//		  dc.setCapability("reportFormat", reportFormat);
//		  dc.setCapability("testName", testName);
		  dc.setCapability(MobileCapabilityType.UDID, "b56e88f28ab97ea04251c706557799553e5f5cc2");
		  dc.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
		  dc.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
		  dc.setCapability("newCommandTimeout", 200);
		 // dc.setCapability(MobileCapabilityType.FULL_RESET, true);
		  
		  Adriver = new SeeTestIOSDriver<SeeTestIOSElement>(new URL("http://localhost:4723/wd/hub"), dc);
		  
		//  Adriver.manage().deleteAllCookies();
		  Adriver.get("http://uat-mariner.rentacenter.com");
		  
		  Adriver.context("NATIVE_APP");
		  Adriver.findElement(By.xpath("//*[@id='menu_button' and @resource-id='com.android.chrome:id/menu_button']")).click();
		  Adriver.findElement(By.xpath("//*[@id='menu_item_text' and @resource-id='com.android.chrome:id/menu_item_text' and @text='History']")).click();
		  Adriver.context("WEBVIEW_1");
		  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='clear-browsing-data' and @text='Clear browsing data...']")).click();
		  Adriver.context("NATIVE_APP");
		  Adriver.findElement(By.xpath("//*[@id='button_preference' and @text='Clear data']")).click();
		  Adriver.sleep(5000);
		  Adriver.get("http://uat-www.rentacenter.com");
		  Adriver.sleep(7000);
		  if(Adriver.findElement(By.xpath("//*[@text='Go']")).getText().isEmpty()){
			  Adriver.sleep(7000);
			  Adriver.findElement(By.xpath("//*[@nodeName='NAV' and @id='mobileCategoryMenu']/*[3]")).click();
			  Adriver.sleep(7000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='input_SearchBox' and @placeholder='Search Rent-A-Center.com']")).sendKeys("Lenovo");
			  Adriver.sleep(2000);
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='siteSearchSubmitBtn' and @text='Go!']")).click();
			  Adriver.sleep(5000);
			  Adriver.findElement(By.xpath("//*[@nodeName='DIV' and @class='products row list-group']/*[1]/*[1]/*[3]/*[1]/*[1]")).click();
			  Adriver.sleep(9000);
			  Adriver.findElement(By.xpath("//*[@nodeName='A' and @id='rent_btn' and @title='Order Online']")).click();
			  Adriver.sleep(9000);
			  Adriver.findElement(By.xpath("//*[@nodeName='A' and @text='Continue as Guest']")).click();
			  Adriver.sleep(9000);
		  }else{
			  Adriver.sleep(5000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='enterZipCode_Nav' and @placeholder='Enter Zip/Postal Code']")).sendKeys("77065");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='enterZipCodeGoButton_Nav_mobile' and @text='Go']")).click();
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='A' and @id='storeResults_1_myStoreBtn' and @text='   Make This My Store']")).click();
			  Adriver.sleep(7000);
			  Adriver.findElement(By.xpath("//*[@nodeName='NAV' and @id='mobileCategoryMenu']/*[3]")).click();
			  Adriver.sleep(7000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='input_SearchBox' and @placeholder='Search Rent-A-Center.com']")).sendKeys("Lenovo");
			  Adriver.sleep(2000);
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='siteSearchSubmitBtn' and @text='Go!']")).click();
			  Adriver.sleep(5000);
			  Adriver.findElement(By.xpath("//*[@nodeName='DIV' and @class='products row list-group']/*[1]/*[1]/*[3]/*[1]/*[1]")).click();
			  Adriver.sleep(9000);
			  Adriver.findElement(By.xpath("//*[@nodeName='A' and @id='rent_btn' and @title='Order Online']")).click();
			  Adriver.sleep(9000);
			  Adriver.findElement(By.xpath("//*[@nodeName='A' and @text='Continue as Guest']")).click();
			  Adriver.sleep(9000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='first-name' and @placeholder='First Name']")).sendKeys(ActionsLibrary.generateRandomString(10, Mode.ALPHA));
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='last-name' and @placeholder='Last Name']")).sendKeys("Machesky");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='phone-number' and @placeholder='Phone Number']")).sendKeys(ActionsLibrary.generateRandomString(10, Mode.NUMERIC));
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='PhoneTypeDropDownList']")).click();
			  Adriver.sleep(1000);
			  Adriver.context("NATIVE_APP");
			  Adriver.findElement(By.xpath("//*[@id='text1' and @text='Home']")).click();
			  Adriver.sleep(1000);
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			 //Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='personalFormSubmitBtn']")).click();
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='home-address']")).sendKeys("123 Main Street");
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='delivery_city']")).sendKeys("Houston");
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='stateDropDownList']")).click();
			  Adriver.context("NATIVE_APP");
			  By State = By.xpath("xpath=//*[@id='text1' and @class='android.widget.CheckedTextView' and contains(@text,'TX')]");
			  Adriver.swipeWhileNotFound(State, 500,SwipeElementDirection.DOWN , 10000, 1000, 10, true);
			  //Adriver.swipeWhileNotFound((,"500","Down","","1000","10",true));
			  Adriver.sleep(1000);
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='delivery_zipCode']")).sendKeys("77065");
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			  // Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='shippingAddress-SubmitBtn']")).click();
			  Adriver.sleep(8000);
			  Adriver.findElement(By.xpath("//*[@nodeName='A' and @id='select_suggested_full_address_link' and @text='Select']")).click();
//			  if(Adriver.findElement(By.xpath("=//*[@nodeName='H4' and @text='Verify your home address.']")).isDisplayed()){
//				  Adriver.findElement(By.xpath("//*[@nodeName='A' and @id='select_suggested_full_address_link' and @text='Select']")).click();
//			  }
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='email-address']")).sendKeys("mithilesh.punyapu@rentacenter.com");
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			  // Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='emailAddress-SubmitBtn']")).click();
			  Adriver.sleep(5000);
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='month-of-birth']")).click();
			  Adriver.sleep(1000);
			  Adriver.context("NATIVE_APP");
			  By Month = By.xpath("xpath=//*[@id='text1' and @class='android.widget.CheckedTextView' and contains(@text,'January')]");
			  Adriver.swipeWhileNotFound(Month, 500,SwipeElementDirection.DOWN , 10000, 1000, 10, true);
			  Adriver.sleep(3000);
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='date-of-birth']")).click();
			  Adriver.context("NATIVE_APP");
			  By Day = By.xpath("xpath=//*[@id='text1' and @class='android.widget.CheckedTextView' and contains(@text,'30')]");
			  Adriver.swipeWhileNotFound(Day, 500,SwipeElementDirection.DOWN , 10000, 1000, 10, true);
			  Adriver.sleep(3000);
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='year-of-birth']")).click();
			  Adriver.context("NATIVE_APP");
			  By Year = By.xpath("xpath=//*[@id='text1' and @class='android.widget.CheckedTextView' and contains(@text,'1990')]");
			  Adriver.swipeWhileNotFound(Year, 500,SwipeElementDirection.DOWN , 10000, 1000, 10, true);
			  Adriver.sleep(3000);
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			  //Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='dob-SubmitBtn']")).click();
			  Adriver.sleep(5000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='driversLicence']")).sendKeys("632309998");
			  Adriver.sleep(3000);
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='stateDropDownListDL']")).click();
			  Adriver.sleep(3000);
			  Adriver.context("NATIVE_APP");
			  By DLState = By.xpath("xpath=//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'GA')]");
			  Adriver.swipeWhileNotFound(DLState, 500,SwipeElementDirection.DOWN , 10000, 1000, 10, true);
			  Adriver.context("WEBVIEW_1");
			  //Adriver.swipe(SwipeElementDirection.DOWN, 20, 500);
			  Adriver.sleep(3000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ssNo-1']")).sendKeys("478");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ssNo-2']")).sendKeys("65");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ssNo-3']")).sendKeys("5466");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			  //Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='personalInfo-SubmitBtn']")).click();
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='primaryScourceIncome']")).click();
			  Adriver.context("NATIVE_APP");
			  Adriver.findElement(By.xpath("//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'My Job')]")).click();
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='howLong']")).click();
			  Adriver.context("NATIVE_APP");
			  Adriver.findElement(By.xpath("//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'1 to 5 years')]")).click();
			  Adriver.context("WEBVIEW_1");
			  Adriver.swipe(SwipeElementDirection.DOWN, 20, 500);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='employer-name']")).sendKeys("RAC");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='employer-phNo']")).sendKeys("9879875554");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='iGetPaidDD']")).click();
			  Adriver.context("NATIVE_APP");
			  Adriver.findElement(By.xpath("//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'Bi-Weekly')]")).click();
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='monthly-takeHome']")).sendKeys("4000");
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			  //Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='employerInfo-SubmitBtn']")).click();
			  Adriver.sleep(5000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ref1-firstname']")).sendKeys("Todd");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ref1-lastname']")).sendKeys("Smith");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ref1-phoneNo']")).sendKeys("2147877987");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='SELECT' and @id='refRelationship1']")).click();
			  Adriver.context("NATIVE_APP");
			  Adriver.findElement(By.xpath("//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'Parent')]")).click();
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			  Adriver.sleep(5000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ref2-firstname']")).sendKeys("Will");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ref2-lastname']")).sendKeys("Smith");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ref2-phoneNo']")).sendKeys("2147877988");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("xpath=//*[@nodeName='SELECT' and @id='refRelationship2']")).click();
			  Adriver.context("NATIVE_APP");
			  Adriver.findElement(By.xpath("//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'Parent')]")).click();
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			  Adriver.sleep(5000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ref3-firstname']")).sendKeys("John");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ref3-lastname']")).sendKeys("Smith");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='ref3-phoneNo']")).sendKeys("2147877990");
			  Adriver.sleep(1000);
			  Adriver.findElement(By.xpath("xpath=//*[@nodeName='SELECT' and @id='refRelationship3']")).click();
			  Adriver.context("NATIVE_APP");
			  Adriver.findElement(By.xpath("//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'Parent')]")).click();
			  Adriver.context("WEBVIEW_1");
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			  Adriver.sleep(5000);
			  By TnC = By.xpath("xpath=//*[@nodeName='A' and @id='customCheckBox']");
			  Adriver.swipeWhileNotFound(TnC, 500,SwipeElementDirection.DOWN , 10000, 1000, 10, true);
			  Adriver.findElement(By.xpath("//*[@nodeName='BUTTON' and contains(@text,'Continue')]")).click();
			  Adriver.sleep(30000);
		  }
	
		  Adriver.quit();
		 
//		  //driver.startActivity("chrome:www.rentacenter.com", "");
//		  //driver = new AndroidDriver(dc);
//		  driver.get("http://www.rentacenter.com");
//		  //driver.context("WEBVIEW_1");
//		  driver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='enterZipCode_Nav' and @placeholder='Enter Zip/Postal Code']")).sendKeys("77065");
//		  driver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='enterZipCodeGoButton_Nav_mobile' and @text='Go']")).click();
//		  driver.quit();
		  
		
		
		  
//		  System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
//		  
//		  
//		  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		  chromeoptions = new ChromeOptions();
//		  chromeoptions.setExperimentalOption("androidPackage", "com.android.chrome");
//		  capabilities.setBrowserName(MobileBrowserType.CHROME);
//		  capabilities.setCapability("deviceName","adb:SM-G935F");
//		  capabilities.setCapability(ChromeOptions.CAPABILITY, chromeoptions);
//		  capabilities.setCapability("platform", "WINDOWS");
//		  capabilities.setCapability("browserName","chrome");
//		  capabilities.setCapability("app", "chrome");
//		  capabilities.setCapability("enableHighAccuracy", true);
//		  capabilities.setCapability("launchTimeout", "300000");
//		  capabilities.setCapability("newCommandTimeout", "300");
//		  capabilities.setCapability("version", "android");
//		  capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
//		  capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
//		  Adriver = new ChromeDriver(capabilities);
//		
//		  cdriver.get("http://uat-www.rentacenter.com");
//		 // cdriver.findElement(By.xpath("//*[@nodeName='INPUT' and @id='enterZipCode_Nav' and @placeholder='Enter Zip/Postal Code']")).sendKeys("77065");
//		  cdriver.findElement(By.xpath("//*[@nodeName='BUTTON' and @id='enterZipCodeGoButton_Nav_mobile' and @text='Go']")).click();
//
//
//		  cdriver.quit();
		  

		  

	}

}
