/*	package com.mobile.automation.scripts;
	
	
	
	
	
	import io.appium.java_client.MobileElement;
	
	
	
	import io.appium.java_client.ios.IOSDriver;
	
	
	
	
	
	import java.util.List;
	import java.util.Random;
	
	
	
	
	
	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;
	
	
	
	
	
	import com.experitest.appium.SeeTestIOSDriver;
	import com.experitest.appium.SeeTestIOSElement;
	import com.mobile.automation.accelerators.MobileLocator;
	
	
	
	
	
	
	
	import com.web.automation.accelerators.TestEngineWeb;
	import com.web.automation.logs.ExtentLogs;
	import com.web.automation.utilities.CommonVariables;
	import com.mobile.automation.accelerators.MobileActionLibrary;
	import com.mobile.automation.objectrepository.Getapproved_OR;
	
	
	
	public class Mobile_original extends TestEngineWeb {
	
	
	
		MobileElement ele;
	
		@SuppressWarnings("raws")
		private static SeeTestIOSDriver<SeeTestIOSElement> sdriver;
		//private static IOSDriver driver;
	
		private static MobileActionLibrary mob_actionLib;
	
		public String appName = "test1.apk";
	
	
	
		@org.testng.annotations.AfterMethod(alwaysRun = true, groups = { "smoke", "regression" })
		public void afterMethod() {
			mob_actionLib.ShutDownDriver();
		}
	
		@org.testng.annotations.BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
		public void beforeMethod() {
			mob_actionLib = new MobileActionLibrary(sdriver);
		}
	
	
	
	
		@org.testng.annotations.Test(priority = 1)
	
		public void Getapproved_Endtoendflow() {
	
			boolean passflag = true;
	
			try {
	
				mob_actionLib.DriverNoResetFlag = true;
	
				this.sdriver = mob_actionLib.StartAppiumDriver(appName);
	
	
				Thread.sleep(1000);
	
				Getapproved_OR cr = new Getapproved_OR(this.sdriver);
				cr.getapproved();
	
	
				//	ShopkoStore av= new ShopkoStore(this.driver);
	
				//	av.Strorenumber7880();
	
	
	
	
	
			} catch (Exception e) {
	
				passflag = false;
	
			}
	
			if (passflag == false) {
	
				Assert.fail();
	
			}
	
		}
	
	
	
		// Reuse methods
	
	
	
	
	
	
		public String  genrateRandomUser()
	
		{
	
			char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
			StringBuilder sb = new StringBuilder();
	
			sb.append("Auto");
	
			Random random = new Random();
	
			for (int i = 0; i < 11; i++) {
	
				char c = chars[random.nextInt(chars.length)];
	
				sb.append(c);
	
			}
	
			String username = sb.toString();
	
			return username;
	
	
	
		}
	
	
	
		public String  Enterdata(String value) throws WebDriverException, Exception{
	
			//System.out.println("Value="+value);
	
			//System.out.println("Length:"+value.length());
	
			waitForElementPresent((MobileElement) sdriver.findElementByAccessibilityId("numberButton1"), 60);
	
			char[] chars4 = value.toCharArray();
	
			//long millis1 = System.currentTimeMillis();
	
			for (int i = 0, n = chars4.length; i < n; i++) {
	
				sdriver.findElementByAccessibilityId("numberButton"+chars4[i]).click();
	
			}
	
			//long millis2 = System.currentTimeMillis();
	
			//System.out.println(millis2 -millis1);
	
			return value;
	
		}
	
	
		public void waitForScreenToLoad1( MobileElement element, int seconds){
	
	
	
			WebDriverWait wait = new WebDriverWait(sdriver,seconds);
	
			wait.until(ExpectedConditions.elementToBeClickable(element));
	
		}
	
	
	
		public void waitForScreenToLoad( By by, int seconds){
	
	
	
			WebDriverWait wait = new WebDriverWait(sdriver,seconds);
	
			wait.until(ExpectedConditions.elementToBeClickable(by));
	
		}
	
	
		public void waitForVisibility( By by, int seconds){
	
	
	
			WebDriverWait wait = new WebDriverWait(sdriver,seconds);
	
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	
		}
	
	
	
		*//**
	
		 * wait for a specific element 
	
		 * @param element --get it from OR
	
		 * @param sec -- duration
	
		 * @param elementName --reporting purpose
	
		 * @throws Exception 
	
		 *//*
	
		public static MobileElement waitForElementPresent(MobileElement element, int sec) throws Exception 
	
		{
	
			MobileElement ele = null;
	
			if (sec == 0)
	
				sec = 10;
	
	
			for (int i = 0; i < sec; i++) 
	
			{
	
				try
	
				{
	
					if(element.isEnabled())
	
					{
	
						ele = element;
	
						wait(1);
	
						break;
	
					}
	
				}
	
				catch(Exception ex)
	
				{
	
					wait(1);
	
				}
	
				if(i == (sec-1))
	
				{
	
					//extentReportsLog(false, "Expected element(s) NOT found : " + elementName);
	
					throw new Exception("Expected element(s) NOT found");
	
				}
	
			} 
	
			return ele;
	
		}
	
	
	
		//Wait Sec wise
	
		public static void wait(int sec)
	
		{
	
			try 
	
			{
	
				Thread.sleep(sec * 1000);
	
			} 
	
			catch (InterruptedException e)
	
			{
	
				System.out.println("Error :  While waiting : " + e);
	
			}
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}*/