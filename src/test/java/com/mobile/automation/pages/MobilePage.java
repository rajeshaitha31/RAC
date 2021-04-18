package com.mobile.automation.pages;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.winium.WiniumDriver;

import com.desktop.automation.pages.DesktopBasePage;
import com.experitest.appium.SeeTestAndroidDriver;
import com.google.common.base.Optional;
import com.mobile.automation.accelerators.MobileActionLibrary;
import com.web.automation.logs.ExtentLogs;

public class MobilePage extends MobileActionLibrary {

///	public SeeTestAndroidDriver<AndroidElement> Adriver;
	public ExtentLogs extentLogs=new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));
	
	public MobilePage(SeeTestAndroidDriver Adriver)
			throws MalformedURLException {
		super(Adriver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean launch()
	{
		Adriver.get("http://uat-www.rentacenter.com");
		return true;
	}
	
	
}