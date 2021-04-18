package com.mobile.automation.pages;

import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.WebDriver;




import com.experitest.appium.SeeTestAndroidDriver;
import com.experitest.appium.SeeTestIOSDriver;
import com.experitest.appium.SeeTestIOSElement;
import com.google.common.base.Optional;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.BasePage_OR;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;

public class BasePage 
{
	private static SeeTestAndroidDriver<AndroidElement> Adriver; 
	public ActionsLibrary actionLib;
	public ExtentLogs extentLogs=new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));
	public BasePage(SeeTestAndroidDriver Adriver)
	{
		if(CommonVariables.getDriver()==null){
			CommonVariables.setDriver(Adriver);
		}
		actionLib = CommonVariables.getActionLib();
		try {
			if(!ConfigManager.ArePropertiesSet.get()){
				ConfigManager.setProperties();
				ConfigManager.UpdateProperties();
			}
		} 
		catch (Exception e) {
			System.out.println("Failed to load Properties file");
		}
	}

	public Optional<Long> timeout(Integer time)
	{
		return Optional.of(Long.parseLong(String.valueOf(time)));
	}

}