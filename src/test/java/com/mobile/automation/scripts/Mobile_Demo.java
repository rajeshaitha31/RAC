//package com.mobile.automation.scripts;
//
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.SwipeElementDirection;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.ScreenOrientation;
//import org.openqa.selenium.WebElement;
//
//import com.experitest.appium.SeeTestIOSDriver;
//import com.experitest.appium.SeeTestIOSElement;
//import com.mobile.automation.accelerators.MobileLocator;
//import com.mobile.automation.accelerators.MobileActionLibrary;
//import com.web.automation.accelerators.TestEngineWeb;
//import com.web.automation.logs.ExtentLogs;
//import com.web.automation.utilities.CommonVariables;
//
//public class Mobile_Demo extends TestEngineWeb{
//	@SuppressWarnings("raws")
//	private static AndroidDriver driver;
//	private static SeeTestIOSDriver<SeeTestIOSElement> sdriver; 
//	private static MobileActionLibrary mob_actionLib;
//	private ExtentLogs extentLogs = new ExtentLogs();
//	public String appName = "com.experitest.ExperiBank.LoginActivity.apk";
//
//	@org.testng.annotations.AfterMethod(alwaysRun = true, groups = { "smoke", "regression" })
//	public void afterMethod() {
//		mob_actionLib.ShutDownDriver();
//	}
//
//	@org.testng.annotations.BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
//	public void beforeMethod() {
//		mob_actionLib = new MobileActionLibrary(sdriver);
//	}
//
//	public void agreementSigning() {
//			//Consent and Notice Regarding Electronic Agreements
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Consent and Notice Regarding Electronic Agreements']", 60);
//			scrollAgreement();
//			
//			//Your Rental-Purchase Agreement
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Your Rental-Purchase Agreement']", 5);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='reviewAndSign']", 2));
//			scrollAgreement();
//			if(mob_actionLib.isElementPresent(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeTextField' and @placeholder='Initials']", 10)){
//				mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeTextField' and @placeholder='Initials']", 2), "rm");
//				mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='CONTINUE']", 2));
//			}
//			//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
//			sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).click();
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='CLEAR']/..//*[@text='AGREE']", 2));
//			
//			//Your Supplemental Acknowledgment
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Your Supplemental Acknowledgment(s)']", 5);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='reviewAndSign']", 2));
//			scrollAgreement();
//			//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
//			sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).click();
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='AGREE']", 2));
//			
//			//Your Agreement Acknowledgement
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Your Agreement Acknowledgement']", 5);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='reviewAndSign']", 2));
//			scrollAgreement();
//			//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
//			sdriver.findElement(By.xpath("//*[@text='squarecheckbox'][1]")).click();
//			sdriver.findElement(By.xpath("//*[@text='squarecheckbox'][2]")).click();
//			sdriver.findElement(By.xpath("//*[@text='squarecheckbox'][3]")).click();
//			sdriver.findElement(By.xpath("//*[@text='squarecheckbox'][4]")).click();
//			sdriver.findElement(By.xpath("//*[@text='squarecheckbox'][5]")).click();
//			sdriver.findElement(By.xpath("//*[@text='squarecheckbox'][6]")).click();
//			sdriver.findElement(By.xpath("//*[@text='squarecheckbox'][7]")).click();
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='CONFIRM']", 2));
//			
//			//Your Early Purchase Option Amendment
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Your Early Purchase Option Amendment']", 5);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='reviewAndSign']", 2));
//			scrollAgreement();
//			//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
//			sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).click();
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='AGREE']", 2));
//			
//			
//			//Your Liability Damage Waiver
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Your Liability Damage Waiver']", 5);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='reviewAndSign']", 2));
//			scrollAgreement();
//			//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
//			sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).click();
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='AGREE']", 2));
//			
//			//Your Benefits Plus Membership
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Your Benefits Plus Membership']", 5);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='reviewAndSign']", 2));
//			scrollAgreement();
//			//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
//			sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).click();
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='AGREE']", 2));
//			
//			//Your Arbitration Agreement
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Your Arbitration Agreement']", 5);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='reviewAndSign']", 2));
//			scrollAgreement();
//			//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
//			sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).click();
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='AGREE']", 2));
//			
//			
//	}
//	public void scrollAgreement(){
//		sdriver.swipe(SwipeElementDirection.DOWN, 600, 1000);
//		mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[(@text='agreeButton') or (@text='AGREE') and @XCElementType='XCUIElementTypeButton']", 2));
//		while(mob_actionLib.isElementPresent(MobileLocator.ByXPath,"//*[@text='Please review the entire agreement and scroll to the bottom before continuing.']", 2)){
//			sdriver.findElement(By.xpath("//*[@text='OK' and @XCElementType='XCUIElementTypeButton']")).click();;
//			sdriver.swipe(SwipeElementDirection.DOWN, 600, 1000);
//			sdriver.findElement(By.xpath("//*[(@text='agreeButton') or (@text='AGREE') or (@text='ACKNOWLEDGE')and @XCElementType='XCUIElementTypeButton']")).click();;
//		}
//		sdriver.swipe(SwipeElementDirection.DOWN, 600, 1000);
//		}
//
//
//	@org.testng.annotations.Test(priority = 1)
//	public void verifySwitchingBtwDifferentViews() {
//		boolean passflag = true;
//		try {
//			mob_actionLib.DriverNoResetFlag = false;
//			appName = "com.rentacenter.acceptancenow.Kiosk.ipa";
//			this.sdriver = mob_actionLib.StartAppiumDriver(appName);
//			
//			//Home screen (Attract loop screen)
//			
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='GET APPROVED']", 5));
//			
//			//Enter First Name/last Name and tap continue button (Attract loop screen)
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='First']", 5), "demothree");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='Last']", 5), "Tester");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 5));
//			
//			//Enter Phone number and tap continue button
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='(___) ___-____']", 5), "4564564564");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 5));
//			
//			//Enter Email/Confirm Email and tap continue button
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='Email address']", 5), "a@a.com");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='Confirm email address']", 5), "a@a.com");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//Enter Address and tap continue button (Change Zipcode)
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='Address Line 1']", 5), "Test dr");
//			
//			if(mob_actionLib.isElementPresent(MobileLocator.ByXPath,"//*[@text='00000']", 2)){
//				mob_actionLib.ClearInputField(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='00000']", 2));
//				mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[(@placeholder='ZIP Code') or (@text='00000')]", 2), "33012");
//				mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			}
//			else{
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[(@placeholder='ZIP Code')]", 2), "33012");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			}
//			//Enter SSN/Verify SSN and tap continue button (Change Zipcode)
//			//ssn
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"(//*[@class='UIACollectionView']/*/*/*[@placeholder='###'])[1]", 10), "789");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"(//*[@class='UIACollectionView']/*/*/*[@placeholder='##'])[1]", 2), "78");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"(//*[@class='UIACollectionView']/*/*/*[@placeholder='####'])[1]", 2), "7897");
//			//verify ssn
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"(//*[@class='UIACollectionView']/*/*/*[@placeholder='###'])[2]", 2), "789");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"(//*[@class='UIACollectionView']/*/*/*[@placeholder='##'])[2]", 2), "78");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"(//*[@class='UIACollectionView']/*/*/*[@placeholder='####'])[2]", 2), "7897");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Continue']", 2));
//			
//			//Enter Driver License
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='License or ID Number']", 60), "513615415");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='ST']", 2), "GA");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//Take Photo
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='takePhoto']", 10));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='CONTINUE']", 2));
//			
//			//Enter DOB
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='MM/DD/YYYY']", 60), "01011988");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			
//			//Enter BTTC
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='bestTimeToCallEvening']", 10));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//Skip alternate number
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text=concat('I DON', \"'\", 'T HAVE AN ALTERNATE CONTACT NUMBER')]", 10));
//			
//			//Take Photo
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='takePhoto']", 10));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='takePhoto']", 2));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='CONTINUE']", 2));
//			
//			
//			//Income Type
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='retirementIncome']", 60));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			
//			//Income Amount
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='$']", 10), "4000");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//RefOne
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='First']", 10), "RefFirstOne");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='Last']", 2), "RefLastOne");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='(___) ___-____']", 10), "7897878977");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='referenceOneRelationFriend']", 10));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//RefTwo
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='First']", 10), "RefTwoOne");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='Last']", 2), "RefTwoOne");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='(___) ___-____']", 10), "4564564888");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='referenceTwoRelationFriend']", 10));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			
//			//RefThree
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='First']", 10), "RefThreeOne");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='Last']", 2), "RefThreeOne");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='(___) ___-____']", 10), "3453453453");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='referenceThreeRelationFriend']", 10));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//Review personal information
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"xpath=//*[@name='Please review your personal information.']", 15);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//Review income information
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"xpath=//*[@name='Please review your income information.']", 15);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//Review references information
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"xpath=//*[@name='Please review your references.']", 15);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			
//			//Associate Login (5661)
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@name='SUBMIT']/../..//*[@XCElementType='XCUIElementTypeSecureTextField']", 20), "u5661xteam");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='SUBMIT']", 2));
//			
//			//Approval screen
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeStaticText' and contains(@text,'Congratulations')]", 60);
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@accessibilityLabel='success_large']", 2);
//			
//			//Create My Order screen
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='createMyOrderButtonText']", 2));
//	
//			//Create My Order screen flow
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='createMyOrderButton']", 10));
//			
//			//Pick a department and add order
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Pick a department.']", 10);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeStaticText' and @name='Electronics']", 2));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeStaticText' and @name='TVs']", 2));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeStaticText' and @name='LED TV']", 2));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeStaticText' and @name='LG']", 2));
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Screen SizeValue' and @XCElementType='XCUIElementTypeTextField']", 5), "56");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='$0.00' and @XCElementType='XCUIElementTypeTextField']", 5), "60000");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='doneButtonText']", 2));
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Add Item' and @XCElementType='XCUIElementTypeButton']", 10);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='CONTINUE']", 2));
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Extended Warranty?']", 10);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='NO THANKS']", 2));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='reviewMyEstimate']", 60));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='startMyApplication']", 60));
//			
//			//Confirm order
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeStaticText' and contains(@text,'Congratulations')]", 60);
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@accessibilityLabel='success_large']", 2);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='confirmbuttonOrderScreen']", 2));
//			
//			//Associate Login (5661)
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@name='SUBMIT']/../..//*[@XCElementType='XCUIElementTypeSecureTextField']", 20), "u5661xteam");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='SUBMIT']", 2));
//			
//			
//			//Dashboard Confirm order
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Add Item' and @XCElementType='XCUIElementTypeButton']", 60);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Confirm Order']", 2));
//			
//			//Associate password (5661)
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@name='CONFIRM']/../..//*[@XCElementType='XCUIElementTypeSecureTextField']", 60), "test");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='CONFIRM']", 2));
//			
//			
//			//Please select next payment date (change date later)
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Please select next payment date.']", 60);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='17' and @XCElementType='XCUIElementTypeStaticText']", 2));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//Initial Payment details
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Initial Payment Details']", 60);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='continueButtonText']", 2));
//			
//			//Associate pin (5661)
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@name='CONTINUE']/../..//*[@XCElementType='XCUIElementTypeSecureTextField']", 30), "1515");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='CONTINUE']", 2));
//			
//		
//			//Review agreement
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"xpath=//*[@text='reviewMyAgreement']", 60));
//			agreementSigning();
//			
//			//initial Payment with CASH
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='payWithCashButtonText']", 60));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='OK']", 5));
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Accept Cash Payment']", 5);
//			String dollarAmt = sdriver.findElementByXPath("//*[@text='Initial Payment']/../../..//*[@class='UIAView'][3]/*/*[1]").getText().trim();
//			dollarAmt= dollarAmt.substring(1);
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@placeholder='$']", 5), dollarAmt);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='cashPaymentDoneButton']", 5));
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@name='ACCEPT']/../..//*[@XCElementType='XCUIElementTypeSecureTextField']", 5), "1515");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='ACCEPT']", 5));
//			
//			//Skip autopay screen
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='setupAutoPayButton']", 60);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='skip Autopay' and @XCElementType='XCUIElementTypeStaticText']", 5));
//			
//			//Select Delivery date screen
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='selectDeliveryDate']", 60);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='selectDeliveryDate']", 5));
//			
//			//Associate password (test)
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@name='LOGIN']/../..//*[@XCElementType='XCUIElementTypeSecureTextField']", 30), "test");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='LOGIN']", 2));
//			
//			
//			//Schedule/pickup
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Schedule delivery/pick up']", 20);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='deliveryTypeDelivery']", 5));
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='TODAY']", 5));
//			// ******************CHECK *********************
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Continue']", 5));
//			
//			//Schedule/pickup
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Does the delivery address match  the address below?']", 20);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='yesButtonText']", 5));
//			
//			
//			//Invoice details
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='Invoice Details']", 20);
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='invoiceNumberField']", 5), "test");
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='salespersonField']", 5), "Automation");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='doneButtonTextForInvoice']", 5));
//			//Associate password (test)
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@name='CONFIRM']/../..//*[@XCElementType='XCUIElementTypeSecureTextField']", 30), "test");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='CONFIRM']", 2));
//			
//			//Order complete
//			mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@text='The order is complete!']", 20);
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByXPath,"//*[@XCElementType='XCUIElementTypeButton' and @name='doneButtonText']", 2));
//			
//			
//		} catch (Exception e) {
//			passflag = false;
//		}
//		if (passflag == false) {
//			Assert.fail();
//		}
//	}
//
//
//
//	
//	@org.testng.annotations.Test(priority = 1)
//	public void launchResetCloseAndRemoveApp() {
//		boolean passflag = true;
//		try {
//			mob_actionLib.DriverNoResetFlag = false;
//			appName = "test1.apk";
//			this.sdriver = mob_actionLib.StartAppiumDriver(appName);
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ById,"com.piti.webviewtester:id/weburl", 2), "http://www.bing.com/");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ById,"com.piti.webviewtester:id/websubmit", 2));
//			driver.resetApp();
//			driver.closeApp();
//			try {
//				driver.launchApp();
//			} catch (Exception e) {
//				// Trying to start logcat capture but it's already started.
//				e.printStackTrace();
//			}
//			mob_actionLib.removeApp(appName);
//			if(	!driver.isAppInstalled("com.piti.webviewtester")){
//				System.out.println("App removed successfully.");
//			}
//		} catch (Exception e) {
//			passflag = false;
//		}
//		if (passflag == false) {
//			Assert.fail();
//		}
//	}
//
//	@org.testng.annotations.Test(priority = 1)
//	public void setGeoLocationUseUiAutomatorMethodDirectly() {
//		boolean passflag = true;
//		try {
//			mob_actionLib.DriverNoResetFlag = false;
//			appName = "test2.apk";
//			this.sdriver = mob_actionLib.StartAppiumDriver(appName);
//			// http://www.mapcoordinates.net/en
//			mob_actionLib.setGeoLocation(42.346886, -71.075529);
//			WebElement elem = mob_actionLib.driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Later\")");
//			System.out.println(elem.isEnabled());
//			elem.click();
//		} catch (Exception e) {
//			passflag = false;
//		}
//		if (passflag == false) {
//			Assert.fail();
//		}
//	}
//
//	@org.testng.annotations.Test(priority = 1)
//	public void HideKeyboardLockScreenRunAppInBackground() {
//		boolean passflag = true;
//		try {
//			mob_actionLib.DriverNoResetFlag = true;
//			appName = "test1.apk";
//			this.sdriver = mob_actionLib.StartAppiumDriver(appName);
//			WebElement elem = driver.findElementById("com.piti.webviewtester:id/weburl");
//			elem.sendKeys("Gallop");
//			driver.hideKeyboard();
//			lockScreen(10);
//			runAppInBackgroud(4);
//		} catch (Exception e) {
//			passflag = false;
//		}
//		if (passflag == false) {
//			Assert.fail();
//		}
//	}
//
//	@org.testng.annotations.Test(priority = 1)
//	public void switchBtwDifferentAppActivityAndScrollInList() {
//		mob_actionLib.DriverNoResetFlag = false;
//		appName = "test1.apk";
//		this.sdriver = mob_actionLib.StartAppiumDriver(appName);
//		try {driver.hideKeyboard();} catch (Exception e) {}
//		//this.sdriver = mob_actionLib.switchToAnotherApp("","com.android.settings", "com.android.settings.Settings");
//		driver.scrollTo("Apps");
//		mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByName, "Apps", 2));
//		driver.scrollTo("WebView Tester");
//		mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ByName	, "WebView Tester", 2));
//		driver.navigate().back();
//		mob_actionLib.SwipeLeft(mob_actionLib.FindElement(MobileLocator.ById	, "com.android.settings:id/app_name", 2));
//		driver.navigate().back();
//		mob_actionLib.SwipeLeft(mob_actionLib.FindElement(MobileLocator.ByClassName	, "android.widget.GridLayout", 2));
//		driver = mob_actionLib.switchToAnotherApp("","com.piti.webviewtester", ".MainActivity");
//	}
//
//	@org.testng.annotations.Test(priority = 1)
//	public void pullPushFile(){
//		try{
//			mob_actionLib.DriverNoResetFlag = true;
//			appName = "test4.apk";
//			this.sdriver = mob_actionLib.StartAppiumDriver(appName);
//			mob_actionLib.type(mob_actionLib.FindElement(MobileLocator.ById,"test4:id/file_name", 2), "systemLogsInfo");
//			mob_actionLib.click(mob_actionLib.FindElement(MobileLocator.ById,"test4:id/take_log", 2));
//			if(mob_actionLib.FindElement(MobileLocator.ById,"android:id/alertTitle", 2)!=null){
//				mob_actionLib.driver.navigate().back();
//			}
//			if(mob_actionLib.FindElement(MobileLocator.ById,"android:id/action_bar_title", 2)!=null){
//				mob_actionLib.driver.navigate().back();
//			}
//			String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_sss_a").format(new Date());
//			File appDir = new File(System.getProperty("user.dir")+ "\\downloadFiles");
//			if(!appDir.exists()){
//				appDir.mkdirs();
//			}
//			appDir = new File(System.getProperty("user.dir")+ "\\downloadFiles\\"+timestamp);
//			appDir.mkdirs();
//			mob_actionLib.downloadFile("/mnt/sdcard/Syslog",appDir.getAbsolutePath());
//			appDir = new File(System.getProperty("user.dir")+ "\\downloadFiles\\fileToUpload.txt");
//			mob_actionLib.uploadFile(appDir.getAbsolutePath(),"/mnt/sdcard/Syslog");
//		}
//		catch(Exception es){
//			es.printStackTrace();
//		}
//	}
//
//	@org.testng.annotations.Test(priority = 1)
//	public void mobileGesture() {
//		try{
//			mob_actionLib.DriverNoResetFlag = true;
//			appName = "Demo1.apk";
//			this.sdriver = mob_actionLib.StartAppiumDriver(appName);
//			System.out.println("Current Activity nam: "+driver.currentActivity());
//			//TAP on an element
//			mob_actionLib.AndroidTap(mob_actionLib.FindElement(MobileLocator.ByName,"hierarchy", 2));
//			AndroidElement scrollElem = (AndroidElement) driver.scrollTo("Selenium");
//			System.out.println(scrollElem.getText());
//			WebElement list = mob_actionLib.FindElement(MobileLocator.ById,"android:id/list", 2);
//			List<WebElement> listItems = list.findElements(MobileBy.id("android:id/text1"));
//			for(WebElement item : listItems){
//				if(mob_actionLib.GetElementAttributeValue(item, "text").trim().equalsIgnoreCase("Selenium")){
//					mob_actionLib.SwipeRight(item);
//					break;
//				}
//			}
//			// Change Mobile Orientation
//			mob_actionLib.ChangeOrientation(ScreenOrientation.LANDSCAPE);
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//	}
//
//	@org.testng.annotations.Test(priority = 2)
//	public void VerifyMobileGesturesOnRealDevice() {
//		boolean passflag = true;
//		try {
//			mob_actionLib.DriverNoResetFlag = true;
//			appName = "test2.apk";
//			mob_actionLib.StartAppiumDriver(appName);
//			this.driver = mob_actionLib.driver;
//			executeSomeMethodsOnRealDevice();
//		} catch (Exception e) {
//			passflag = false;
//		}
//		if (passflag == false) {
//			Assert.fail();
//		}
//	}
//
//	public void executeSomeMethodsOnRealDevice() {
//		try{
//			//Tap to Open Menu
//			driver.tap(1, ((MobileElement) mob_actionLib.FindElement(MobileLocator.ById,"test2:id/action.home.menu", 5)), 1);
//
//			//'Scrolling to the Sub Menu name 'Events' and then 'Home'
//			driver.scrollTo("Events");
//			driver.scrollToExact("Home");
//
//			//Swipe left from Home 
//			WebElement elem = mob_actionLib.FindElement(MobileLocator.ById,"test2:id/row_title", 5);
//			Integer pagewidth  = driver.manage().window().getSize().width;
//			Point eloc = elem.getLocation();
//			Integer swipe_startxratio = eloc.getX();
//			Integer swipe_endxratio = eloc.getX() + elem.getSize().width;
//			Integer yratio =eloc.getY()+(elem.getSize().getHeight())/ 2;
//			if (swipe_startxratio < 10) {
//				swipe_startxratio = 10;
//			}
//			if (swipe_endxratio >= pagewidth) {
//				swipe_endxratio = (int) (pagewidth-10);
//			}
//			driver.swipe(swipe_endxratio, yratio, swipe_startxratio, yratio, 2000);
//
//			// Get Current Device Orientation
//			ScreenOrientation orient = driver.getOrientation();
//			String currentOrientation = orient.toString();
//			System.out.println(currentOrientation);
//
//			// Set Device Orientation to Landscape and then PORTRAIT
//			driver.rotate(ScreenOrientation.LANDSCAPE);
//			try{Thread.sleep(2500);} catch(InterruptedException e){}
//			driver.rotate(ScreenOrientation.PORTRAIT);
//
//			//Check that app goes to Background for a given period of time and then appears in foreground
//			try {
//				driver.runAppInBackground(5);
//			} catch (Exception e) {
//				System.out.println(e.getLocalizedMessage());
//			}
//
//			//Check hiding of the keyboard
//			mob_actionLib.AndroidTap(mob_actionLib.FindElement(MobileLocator.ById,"test2:id/action.setting", 5));
//			mob_actionLib.AndroidTap(mob_actionLib.FindElement(MobileLocator.ById,"test2:id/tv_user_name", 5));
//			mob_actionLib.AndroidTap(mob_actionLib.FindElement(MobileLocator.ById,"test2:id/b.login.details.email", 5));
//			mob_actionLib.FindElement(MobileLocator.ById,"test2:id/b.login.details.email", 5).sendKeys("abc");
//			driver.hideKeyboard();
//
//			//Verify Lock Screen and Once screen unlocked correct activity
//			lockScreen(5);
//			driver.tap(1, ((MobileElement) mob_actionLib.FindElement(MobileLocator.ById,"test2:id/action.home.menu", 5)), 1);
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//	}
//
//	public void lockScreen(int timeInSecond){
//		String activitybeforeLock = driver.currentActivity();
//		driver.lockScreen(timeInSecond);
//		try{Thread.sleep(timeInSecond);} catch(InterruptedException e){}
//		String activityAfterUnlock =driver.currentActivity();
//		if(activityAfterUnlock.equalsIgnoreCase(activitybeforeLock)){
//			System.out.println("pass");
//		}
//		else{
//			System.out.println("fail");
//		}
//	}
//
//	public void runAppInBackgroud(int timeInSecond){
//		String activityRunningBeforeHide = driver.currentActivity();
//		driver.runAppInBackground(timeInSecond);
//		try{Thread.sleep(timeInSecond);} catch(InterruptedException e){}
//		String activityAfterAppActiveAgain =driver.currentActivity();
//		if(activityAfterAppActiveAgain.equalsIgnoreCase(activityRunningBeforeHide)){
//			System.out.println("passs");
//		}
//		else{
//			System.out.println("fail");
//		}
//	}
//
//	public void login() {
//		try {
//			mob_actionLib.AndroidTap(mob_actionLib.FindElement(MobileLocator.ByName,"login", 2));
//			WebElement userName = mob_actionLib.FindElement(MobileLocator.ById,"test3.demo1:id/login_usr", 2);
//			mob_actionLib.ClearInputField(userName);
//			userName.sendKeys("demo");
//			WebElement password = mob_actionLib.FindElement(MobileLocator.ById,"test3.demo1:id/login_pwd", 2);
//			mob_actionLib.ClearInputField(password);
//			password.sendKeys("demo");	
//			WebElement loginBtn = mob_actionLib.FindElement(MobileLocator.ById,"test3.demo1:id/login_btn", 2);
//			loginBtn.click();
//			WebElement welcomeMsg = mob_actionLib.FindElement(MobileLocator.ById,"test3.demo1:id/logout_txt", 10);
//			if(welcomeMsg==null || !welcomeMsg.getText().trim().equalsIgnoreCase("Welcome, demo!")){
//				Assert.fail("Failed to login");
//			}
//		} catch (Exception e) {
//		}
//	}
//}