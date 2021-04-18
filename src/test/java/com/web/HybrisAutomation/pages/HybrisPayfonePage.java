package com.web.HybrisAutomation.pages;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.google.common.base.Optional;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;
import com.web.automation.hybrisobjectrepository.HTStore_OR;
import com.web.automation.hybrisobjectrepository.PDP_OR;
import com.web.automation.hybrisobjectrepository.Payfone_OR;


public class HybrisPayfonePage extends HybrisBasePage {
	
	
	public HybrisPayfonePage(WebDriver driver) {
		super(driver); 

	}

 // This Method Clicks On Skip this step on payfone screen
	
	public boolean payFone_SkipStep()  {
	
	boolean flag = false;
	
	flag =CommonVariables.CommonDriver.get().findElement(Payfone_OR.SKIPSTEP).isDisplayed();
	if(flag){extentLogs.pass("SkipStepinPAYFONE","SkipStepIsDisplayed");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(Payfone_OR.SKIPSTEP));
		if(flag){extentLogs.pass("ClickSkipStepinPAYFONE","SkipStepIsClicked");
			}else{extentLogs.fail("ClickSkipStepinPAYFONE","SkipStepIsNotClicked");}
	        }else{extentLogs.fail("SkipStepinPAYFONE","SkipStepIsNotDisplayed");}
return flag;
	}
	
	
	
}
