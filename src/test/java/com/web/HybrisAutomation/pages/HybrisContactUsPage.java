package com.web.HybrisAutomation.pages;

import org.openqa.selenium.WebDriver;

import com.web.automation.hybrisobjectrepository.ContactUs_OR;
import com.web.automation.hybrisobjectrepository.HomePage_OR;
import com.web.automation.utilities.CommonVariables;

public class HybrisContactUsPage extends HybrisBasePage {
	
	
	public HybrisContactUsPage(WebDriver driver) {
		super(driver);
		
	}

	
	public boolean ContactUs_FillData(String FirstName,String LastName,String Email,String phoneNumber,int index,String Comments) throws Throwable {
		
		boolean flag = false;
		
		
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.ContactUs_FirstNameField), FirstName);
		if(flag){extentLogs.pass("EnterFirstName","EnteredFirstName");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.ContactUs_LastNameField), LastName);
		if(flag){extentLogs.pass("EnterLastName","EnteredLastName");
	  	flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.ContactUs_EmailField), Email);
		if(flag){extentLogs.pass("EnterEmail","EnteredEmail");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.ContactUs_PhoneNumber), phoneNumber);
		if(flag){extentLogs.pass("EnterPhoneNumber","EnteredPhoneNumber");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.PreferredContactMethod_Email));
		if(flag){extentLogs.pass("PereferredContactMethod","SelectedPereferredContactMethod");
		flag=actionLib.selectByIndex(ContactUs_OR.ContactUs_ChooseTopic, index, "ChooseTopic");
		if(flag){extentLogs.pass("ChooseTopic","SelectedTopic");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.ContactUs_Comments), Comments);
		if(flag){extentLogs.pass("EnterComments","EnteredComments");
		//actionLib.wait(1000);
		flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.ContactUs_Submit));
		if(flag){extentLogs.pass("ClickOnSubmit","ClickedOnSubmit");
		}else{extentLogs.fail("ClickOnSubmit","UnableToClickOnSubmit"); }
		}else{extentLogs.fail("EnterComments","UnableToEnterComments"); }
		}else{extentLogs.fail("ChooseTopic","UnableToChooseTopic");}
		}else{extentLogs.fail("PereferredContactMethod", "UnableToSelectPereferredContactMethod");}
	    }else{extentLogs.fail("EnterPhoneNumber", "UnableToEnterPhoneNumber");}
		}else{extentLogs.fail("EnterEmail", "UnableToEnterEmail");}
		}else{extentLogs.fail("EnterLastName", "UnableToEnterLastName");}
		}else{extentLogs.fail("EnterFirstName", "UnableToEnterFirstName");}
		
		              
	return flag;
	}

	
	public boolean backToHomePage()
	{
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(ContactUs_OR.ContactUs_BackToHome).isDisplayed();
		if(flag){extentLogs.pass("BackToHomePage","BackToHomePageButtonIsDisplayed");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.ContactUs_BackToHome));
		if(flag){extentLogs.pass("ClickBackToHomePage","ClickedOnBackToHomePage");
		actionLib.WebdriverWaitForPage();
		flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.STARTORDER_HOMEPAGE).isDisplayed();
		if(flag){extentLogs.pass("HomePage","HomePageIsDisplayed");
		}else{extentLogs.fail("HomePage","HomePageIsNotDisplayed"); }
		}else{extentLogs.fail("ClickBackToHomePage","UnableToClickOnBackToHomePage"); }
		}else{extentLogs.fail("BackToHomePage","BackToHomePageButtonIsNotDisplayed"); }
		
	
	return flag;
	}
	
	
	public boolean navigateToContactUsPage() {
		
boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_MENUTEXT).isDisplayed();
		if(flag){extentLogs.pass("Hamburger","HamburgerIsDisplayed");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_MENUTEXT));
		if(flag){extentLogs.pass("ClickHamburger","ClickedOnHamburger");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(ContactUs_OR.Hamburger_ContactUs));
		if(flag){extentLogs.pass("ClickOnContactUs","ClickedOnContactUs");
		flag=CommonVariables.CommonDriver.get().findElement(ContactUs_OR.ContactUs_PageTitle).isDisplayed();
		if(flag){extentLogs.pass("ContactUsPage","NavigatedToContactUsPage");
		}else{extentLogs.fail("ContactUsPage","ContactUsPageIsNotDisplayed"); }
		}else{extentLogs.fail("ClickOnContactUs","UnableToClickOnContactUs"); }
		}else{extentLogs.fail("ClickHamburger","UnableToClickOnHamburger"); }
		}else{extentLogs.fail("Hamburger","HamburgerIsNotDisplayed"); }
		
		return flag;
		
	}
	
}
