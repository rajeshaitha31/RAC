package com.web.automation.logs;

import io.appium.java_client.android.AndroidElement;

import com.experitest.appium.SeeTestAndroidDriver;
import com.experitest.appium.SeeTestIOSDriver;
import com.experitest.appium.SeeTestIOSElement;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.MyBase64;
import com.web.automation.utilities.CommonVariables;

public class ExtentLogs{
	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	 public void pass(String stepName, String description) {
		try{
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.PASS, stepName, description);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

/**
 * @author Sunil Varma	
 * @param stepName
 * @param description
 */

	 
	 public void passWithCustom(String stepName, String description) {
         try{
               TestEngineWeb.getExtentReportTest().log(ExtentLogName.PASS, stepName, "<font size =+1 color=#60b963>" +description+"</font>");
         }catch(Exception e){
               e.printStackTrace();
         }
   }

	 
	 
	
	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	public void passWithScreenshot(String stepName, String description) {
		try{
			String ScreenShotPath=CommonVariables.screenShotPath.get();
			String image="";
			if(CommonVariables.CommonDriver.get()!=null)
				if(!ActionsLibrary.saveScreenshot(ScreenShotPath)){
					ScreenShotPath = "Error Occurred while taking screenshot";
				}else{
					image= TestEngineWeb.getExtentReportTest().addScreenCapture(ScreenShotPath);
				}
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.PASS, stepName, description);
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.INFO, "Snapshot For Passed Scenario",image);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	public void fail(String stepName, String description) {
		try{
			String ScreenShotPath=CommonVariables.screenShotPath.get();
			String image="";
			if(CommonVariables.CommonDriver.get()!=null)
				if(!ActionsLibrary.saveScreenshot(ScreenShotPath)){
					ScreenShotPath = "Error Occurred while taking screenshot";
				}else{
					image= TestEngineWeb.getExtentReportTest().addScreenCapture(ScreenShotPath);
				}
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.FAIL, stepName, description);
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.WARNING, "Snapshot For Failed Test Case",image);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	public void info(String stepName, String description) {
		try{
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.INFO, stepName, description);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	public void error(SeeTestIOSDriver appiumDriver, String stepName, String description) {
		try{
			String ScreenShotPath=CommonVariables.screenShotPath.get();
			String image="";
			ActionsLibrary.takesScreenShot(appiumDriver, ScreenShotPath);
			image= TestEngineWeb.getExtentReportTest().addScreenCapture(ScreenShotPath);
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.ERROR, stepName, description);
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.WARNING, "Snapshot For Test Step with Error",image);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void fail(SeeTestIOSDriver appiumDriver, String stepName, String description) {
		try{
			String ScreenShotPath=CommonVariables.screenShotPath.get();
			String image="";
			ActionsLibrary.takesScreenShot(appiumDriver, ScreenShotPath);
			image=  image = TestEngineWeb.getExtentReportTest()
		       .addBase64ScreenShot(MyBase64.encodeFileToBase64Binary(ScreenShotPath));
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.FAIL, stepName, description);
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.WARNING, "Snapshot For Test Step with Error",image);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void fails(SeeTestAndroidDriver appiumDriver, String stepName, String description) {
		try{
			String ScreenShotPath=CommonVariables.screenShotPath.get();
			String image="";
			ActionsLibrary.takesScreenShot(appiumDriver, ScreenShotPath);
			image=  image = TestEngineWeb.getExtentReportTest()
		       .addBase64ScreenShot(MyBase64.encodeFileToBase64Binary(ScreenShotPath));
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.FAIL, stepName, description);
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.WARNING, "Snapshot For Test Step with Error",image);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	/*public void fail(String stepName, String description) {
		  try {
		   String ScreenShotPath = CommonVariables.screenShotPath.get();
		   String image = "";
		   if (CommonVariables.CommonDriver.get() != null)
		    if (!ActionsLibrary.saveScreenshot(ScreenShotPath)) {
		     ScreenShotPath = "Error Occurred while taking screenshot";
		    } else {
		     image = TestEngineWeb.getExtentReportTest()
		       .addBase64ScreenShot(MyBase64.encodeFileToBase64Binary(ScreenShotPath));
		    }
		 
		   TestEngineWeb.getExtentReportTest().log(ExtentLogName.FAIL, stepName, description);
		   TestEngineWeb.getExtentReportTest().log(ExtentLogName.WARNING, "Snapshot For Test Step with Error", image);
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		}*/
		 
	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	public void error(String stepName, String description) {
		try{
			String ScreenShotPath=CommonVariables.screenShotPath.get();
			String image="";
			if(CommonVariables.CommonDriver.get()!=null)
				if(!ActionsLibrary.saveScreenshot(ScreenShotPath)){
					ScreenShotPath = "Error Occurred while taking screenshot";
				}else{
					image= TestEngineWeb.getExtentReportTest().addScreenCapture(ScreenShotPath);
				}
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.ERROR, stepName, description);
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.WARNING, "Snapshot For Test Step with Error",image);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	public void warning(String stepName, String description) {
		try{
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.WARNING, stepName, description);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	public void fatal(String stepName, String description) {
		try{
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.FATAL, stepName, description);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	public void skip(String stepName, String description) {
		try{
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.SKIP, stepName, description);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @author ashish jain
	 * @param stepName
	 * @param description
	 */
	public void unknown(String stepName, String description) {
		try{
			TestEngineWeb.getExtentReportTest().log(ExtentLogName.UNKNOWN, stepName, description);
		}catch(Exception e){
			e.printStackTrace();
		}
	}


	/**
	 * @author ashish jain
	 * @param e
	 * @param methodName
	 * @param LogLevel
	 * @param LogMessage
	 *//*
	public void addToLog(String logStatus, String stepName, String LogMessage) {
		try{
			String ScreenShotPath=CommonVariables.screenShotPath.get();
			LogStatus status;
			switch(logStatus.trim().toLowerCase()){
			case "pass":
				status=ExtentLogName.PASS;
				TestEngineWeb.getExtentReportTest().log(status, stepName, LogMessage);
				break;
			case "fail":
				String image="";
				if(CommonVariables.CommonDriver.get()!=null)
					if(!ActionsLibrary.saveScreenshot(ScreenShotPath)){
						ScreenShotPath = "Error Occurred while taking screenshot";
					}else{
						image= TestEngineWeb.getExtentReportTest().addScreenCapture(ScreenShotPath);
					}
				status=ExtentLogName.FAIL;
				TestEngineWeb.getExtentReportTest().log(status, stepName, LogMessage);
				TestEngineWeb.getExtentReportTest().log(ExtentLogName.WARNING, "Snapshot of Failed Test Case : " + image);
				break;
			case "skip":
				status=ExtentLogName.SKIP;
				TestEngineWeb.getExtentReportTest().log(status, stepName, LogMessage);
				break;
			case "info":
				status=ExtentLogName.INFO;
				TestEngineWeb.getExtentReportTest().log(status, stepName, LogMessage);
				break;
			case "error":
				String image1="";
				if(CommonVariables.CommonDriver.get()!=null)
					if(!ActionsLibrary.saveScreenshot(ScreenShotPath)){
						ScreenShotPath = "Error Occurred while taking screenshot";
					}else{
						image1= TestEngineWeb.getExtentReportTest().addScreenCapture(ScreenShotPath);
					}
				status=ExtentLogName.ERROR;
				TestEngineWeb.getExtentReportTest().log(status, stepName, LogMessage);
				TestEngineWeb.getExtentReportTest().log(ExtentLogName.WARNING, "Snapshot on Error : " + image1);
				break;
			case "warning":
				status=ExtentLogName.WARNING;
				TestEngineWeb.getExtentReportTest().log(status, stepName, LogMessage);
				break;
			case "unknown":
				status=ExtentLogName.UNKNOWN;
				TestEngineWeb.getExtentReportTest().log(status, stepName, LogMessage);
				break;
			case "fatal":
				status=ExtentLogName.FATAL;
				TestEngineWeb.getExtentReportTest().log(status, stepName, LogMessage);
				break;
			default:
				System.out.println("Unable to get log status - "+ logStatus);
				break;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
*/
	/**
	 * @author ashish jain
	 * @description: get stack trace in String format
	 * @param e
	 * @return
	 */
	public String getStackTraceAsString(String testcaseName, String Message, Exception e) {
		try {
			StringBuilder sb = new StringBuilder();
			for (StackTraceElement element : e.getStackTrace()) {
				sb.append(element.toString());
				sb.append("][");
			}
			return "<b>Test Case Id : </b> "+testcaseName+" <br> "+"<b> Message : </b> "+Message+" <br> <b> Exception Class :  </b>  <br>"
			+ e.getClass().getName().toString().toUpperCase().trim() + " <br> <b> Stacktrace :  </b> <br>"
			+ sb.toString();
		} catch (Exception e2) {
			return "Stack trace not available.";
		}
	}

	/**
	 * @author ashish jain
	 * @description: get stack trace in String format
	 * @param e
	 * @return
	 */
	public String getStackTraceAsString(Object e)
	{
		Exception ex=null;
		try {
			ex=(Exception)e;
			String message=ex.getMessage();
			StringBuilder sb = new StringBuilder();
			for (StackTraceElement element : ex.getStackTrace()) {
				sb.append(element.toString());
				sb.append("][");
			}
			return "<b>Message: "+message+" And Class: "+ex.getClass().toString().toUpperCase()+"</b> Here is the stacktrace: "+sb.toString();
		} 
		catch (Exception e2) {
			return "Stack trace not available.";
		}
	}
}