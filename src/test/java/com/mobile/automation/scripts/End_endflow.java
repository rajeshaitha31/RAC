//	package com.mobile.automation.scripts;
//	import io.appium.java_client.ios.IOSDriver;	
//
//import java.util.List;
//import java.util.Random;	
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import com.experitest.appium.SeeTestIOSDriver;
//import com.experitest.appium.SeeTestIOSElement;
//import com.mobile.automation.accelerators.MobileLocator;
//import com.web.automation.accelerators.TestEngineWeb;
//import com.web.automation.logs.ExtentLogs;
//import com.web.automation.utilities.CommonVariables;
//import com.mobile.automation.accelerators.MobileActionLibrary;
//import com.mobile.automation.objectrepository.Addorderpage;
//import com.mobile.automation.objectrepository.Agreementspage;
//import com.mobile.automation.objectrepository.Getapproved_OR;
//import com.mobile.automation.objectrepository.Getapprovedpage;
//import com.mobile.automation.objectrepository.InitalPaymentspage;
//import com.mobile.automation.objectrepository.SchedulDeliverypage;
//	
//	
//	
//	public class End_endflow extends TestEngineWeb {
//	
//
//		@SuppressWarnings("raws")
//		private static SeeTestIOSDriver<SeeTestIOSElement> sdriver;
//		//private static IOSDriver driver;
//	
//		private static MobileActionLibrary mob_actionLib;
//	
//		public String appName = "test1.apk";
//	
//	
//	
//		@org.testng.annotations.AfterMethod(alwaysRun = true, groups = { "smoke", "regression" })
//		public void afterMethod() {
//			mob_actionLib.ShutDownDriver();
//		}
//	
	/*	@org.testng.annotations.BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
		public void beforeMethod() {
			mob_actionLib = new MobileActionLibrary(sdriver);
//		}
*///	
//	
//	
//	
//		@org.testng.annotations.Test(priority = 1)
//	
//		public void Getapproved_Endtoendflow() {
//	
//			boolean passflag = true;
//	
//			try {
//	
//				mob_actionLib.DriverNoResetFlag = true;	
//				this.sdriver = mob_actionLib.StartAppiumDriver(appName);	
//				Thread.sleep(1000);
//				Getapprovedpage gp = new Getapprovedpage(this.sdriver);
//				gp.getapproved();
//				
//				Addorderpage ap = new Addorderpage(this.sdriver);
//				ap.Addorders();
//				Agreementspage agp = new Agreementspage(this.sdriver);
//				agp.Agreement();
//				
//				InitalPaymentspage ip= new InitalPaymentspage(this.sdriver);
//				ip.InitalPayment();
//				
//				SchedulDeliverypage sp= new SchedulDeliverypage(this.sdriver);
//				sp.SchedulDelivery();
//			} catch (Exception e) {
//	
//				passflag = false;
//	
//			}
//	
//			if (passflag == false) {
//	
//				Assert.fail();
//	
//			}
//	
//		}
//		
//	}