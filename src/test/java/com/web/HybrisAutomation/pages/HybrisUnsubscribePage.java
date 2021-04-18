package com.web.HybrisAutomation.pages;

import org.openqa.selenium.WebDriver;

import com.web.automation.hybrisobjectrepository.ContactUs_OR;
import com.web.automation.hybrisobjectrepository.HomePage_OR;
import com.web.automation.hybrisobjectrepository.Unsubscribe_OR;
import com.web.automation.utilities.CommonVariables;

public class HybrisUnsubscribePage extends HybrisBasePage {
	
	
	public HybrisUnsubscribePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public boolean NavigateToUnsubscribePage()
	{
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_MENUTEXT).isDisplayed();
		if(flag){extentLogs.pass("Hamburger","HamburgerIsDisplayed");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_MENUTEXT));
		if(flag){extentLogs.pass("ClickHamburger","ClickedOnHamburger");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.Hamburger_ContactUs));
		if(flag){extentLogs.pass("ClickOnContactUs","ClickedOnContactUs");
		actionLib.WebdriverWaitForPage();
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.ContactUs_GeneralInfo));
		if(flag){extentLogs.pass("ClickOnGeneralInfoButton","ClickedOnGeneralInfoButton");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.ContactUs_GeneralInfo_FAQ2));
		if(flag){extentLogs.pass("ClickOnGeneralInfoFAQ's","ClickedOnGeneralInfoFAQ's");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.UnsubscribeLink));
		if(flag){extentLogs.pass("ClickOnUnsubscribeLink","ClickedOnUnsubscribeLink");
		actionLib.WaitForElementVisible(Unsubscribe_OR.Unsubscribe_PageTitle, 5);
		}else{extentLogs.fail("ClickOnUnsubscribeLink","UnableClickOnUnsubscribeLink");}
		}else{extentLogs.fail("ClickOnGeneralInfoFAQ's", "UnableToClickOnGeneralInfoFAQ's");}
	    }else{extentLogs.fail("ClickOnGeneralInfoButton", "UnableToClickOnGeneralInfoButton");}
		}else{extentLogs.fail("ClickOnContactUs", "UnableToClickOnContactUs");}
		}else{extentLogs.fail("ClickHamburger", "UnableToClickHamburger");}
		}else{extentLogs.fail("Hamburger", "HamburgerIsNotDisplayed");}
		return flag;
	}
public boolean Unsubscribe_FillData(String email,String preference) throws Throwable {
		
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.Unsubscribe_PageTitle).isDisplayed();
		if(flag){extentLogs.pass("UnsubscribePageTitle","UnsubscribePageTitleIsDisplayed");
		
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.Unsubscribe_EmailField), email);
		if(flag){extentLogs.pass("Enteremail","Enteredemail");
		if(preference.contains("few"))
		{
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.RadioButton_FewEmails));
			extentLogs.pass("Email Preferences","Clicked on 'Send me fewer emails' radio button");
		}
		if(preference.contains("altogether"))
		{
	       actionLib.Click(CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.RadioButton_Altogether));
	       extentLogs.pass("Email Preferences","Clicked on 'Send me fewer emails' radio button");
        }
		if(preference.contains("stay"))
		{
	       actionLib.Click(CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.RadioButton_DecidedToStay));
	       extentLogs.pass("Email Preferences","Clicked on ' I’ve decided to stay!' radio button");
        }
		
		
		}else{extentLogs.fail("Enteremail","UnableToEnteremail"); }
		}else{extentLogs.fail("UnsubscribePageTitle","UnsubscribePageTitleIsNotDisplayed");}
		 
		              
	return flag;
	}



public boolean unsubscribe_ClickOnSubmit()
{
	boolean flag = false;
	flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.Unsubscribe_Submit));
	if(flag){extentLogs.pass("ClickOnSubmit","ClickedOnSubmit");
	}else{extentLogs.fail("ClickOnSubmit","UnableToClickOnSubmit"); }
  
	
	return flag;
}

public boolean unsubscribe_VerifySuccessMessage() {
	boolean flag = false;
	
	flag=CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.Unsubscribe_SuccessMsg).isDisplayed();
	if(flag){extentLogs.pass("UnsubscribeSuccessMessage","UnsubscribeSuccessMessageIsDisplayed");
	}else{extentLogs.fail("UnsubscribeSuccessMessage", "UnsubscribeSuccessMessageIsNotDisplayed");}
	
	
	return flag;
}




public boolean unsubscribe_VerifyErrorMessage() {
	boolean flag = false;
	
	flag=CommonVariables.CommonDriver.get().findElement(Unsubscribe_OR.Unsubscribe_errorMessage).isDisplayed();
	if(flag){extentLogs.pass("UnsubscribeErrorMessage","UnsubscribeErrorMessageIsDisplayed");
	}else{extentLogs.fail("UnsubscribeErrorMessage", "UnsubscribeErrorMessageIsNotDisplayed");}
	
	
	return flag;
}

}