package com.web.HybrisAutomation.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.hybrisobjectrepository.ContactUs_OR;
import com.web.automation.hybrisobjectrepository.HomePage_OR;
import com.web.automation.hybrisobjectrepository.MyAccount_OR;
import com.web.automation.utilities.CommonVariables;

public class HybrisSignInPage extends HybrisBasePage{
	
	public HybrisSignInPage(WebDriver driver) {
		super(driver);
	}
		

	
	
	public boolean NavigateToSignInPage(){
			boolean flag = false;
			
    		  flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNIN_MODAL).isDisplayed();
			  if(flag){extentLogs.pass("SignInLink", "SignInIsDisplayed");
			  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNIN_MODAL));
			  if(flag){extentLogs.pass("ClickOnSignInLink", "ClickedOnSignInLink");
			  ActionsLibrary.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNIN_MODAL_IFRAME));
			  {extentLogs.pass("NavigateToSignInFrame", "NavigatedToSignInFrame");}
			  flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNIN_MODALNAME).isDisplayed();
			  if(flag){extentLogs.pass("SignInPage", "SignInPageIsDisplayed");
			  }else{extentLogs.fail("WelcomeMessageDisplayed","WelcomeMessageIsNotDisplayed");}
			  }else{extentLogs.fail("ClickSignInButton","UnableToClickOnSignInButton");}
			  }else{extentLogs.fail("EnterPassWord","UnableToEnterPassWordFAIL");}
			  
			  
	
            return flag;
	}
	
	
	public boolean SignIn(String Username, String Password) throws Throwable {
		  boolean flag = false; 
		  
		  flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNIN_MODAL).isDisplayed();
		  if(flag){extentLogs.pass("SignInLink", "SignInIsDisplayed");
		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNIN_MODAL));
		  if(flag){extentLogs.pass("ClickOnSignInLink", "ClickedOnSignInLink");
		  ActionsLibrary.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNIN_MODAL_IFRAME));
		  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement( MyAccount_OR.EMAILADDRESS),Username);
		  if(flag){extentLogs.pass("EnterUserName", "EnteredUserName");
		  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PASSWORD),Password);
		  if(flag){extentLogs.pass("EnterPassWord","EnteredPassWord");
		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNINBUTTON));
		  if(flag){extentLogs.pass("ClickSignInButton","ClickedOnSignInButton");
		  
		  }else{extentLogs.fail("ClickSignInButton","UnableToClickOnSignInButton");}
		  }else{extentLogs.fail("EnterPassWord","UnableToEnterPassWordFAIL");}
		  }else{extentLogs.fail("EnterUserName", "UnableToEnterUserName");}
		  }else{extentLogs.fail("ClickOnSignInLink", "UnableToClickOnSignInLink");}
		  }else{extentLogs.fail("SignInLink","SignInIsNotDisplayed");}
		  
		  return flag;
		  
		  }
		 
	
	
	
	public void ClickOnSignInButton()
	{
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNINBUTTON));
		  extentLogs.pass("ClickSignInButton","ClickedOnSignInButton");
	}
	
	
	
	public void VerifyErrorMsg(By elementLocator, String Expected) {
		
		String actualMsg = CommonVariables.CommonDriver.get().findElement(elementLocator).getText();
		if(actualMsg.equals(Expected))
		{
			extentLogs.pass("Verify Message " + Expected, "Error Message " + Expected
					+ " matched with actual Message:" + actualMsg);
		} else {
			extentLogs.fail("Verify Message " + Expected, "Expected Error mesage "
					+ Expected + " did not match with actual Message:" + actualMsg);
		}
	}
	
	
	
	public boolean navigateToMyAccountFromHam() {
		
     boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_MENUTEXT).isDisplayed();
		if(flag){extentLogs.pass("Hamburger","HamburgerIsDisplayed");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_MENUTEXT));
		if(flag){extentLogs.pass("ClickHamburger","ClickedOnHamburger");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.HAM_MYACCOUNT));
		if(flag){extentLogs.pass("ClickOnMyAccount","ClickedOnMyAccount");
		actionLib.WebdriverWaitForPage();
		ActionsLibrary.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNIN_MODAL_IFRAME));
		flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.HAM_MYACCOUNTPAGETITLE).isDisplayed();
		if(flag){extentLogs.pass("MyAccountPageTitle","MyAccountPageTitleIsDisplayed");
    	}else{extentLogs.fail("MyAccountPageTitle","MyAccountPageTitleIsNotDisplayed");} 
		}else{extentLogs.fail("ClickOnMyAccount","UnableToClickOnMyAccount");}
		}else{extentLogs.fail("ClickHamburger","UnableToClickOnClickHamburger");}
		}else{extentLogs.fail("Hamburger","HamburgerIsNotDisplayed");}
		
		
		return flag;
		
	}
		
		
		
		
		public boolean SignInFromHamburger(String Username,String Password) throws Throwable {
			  boolean flag = false; 
			  
			  
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement( MyAccount_OR.HAM_MYACC_EMAIL),Username);
			  if(flag){extentLogs.pass("EnterUserName", "EnteredUserName");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.HAM_MYACC_PASSWORD),Password);
			  if(flag){extentLogs.pass("EnterPassWord","EnteredPassWord");
			  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.HAM_MYACC_SUBMIT));
			  if(flag){extentLogs.pass("ClickSignInButton","ClickedOnSignInButton");
			  }else{extentLogs.fail("ClickSignInButton","UnableToClickOnSignInButton");}
			  }else{extentLogs.fail("EnterPassWord","UnableToEnterPassWordFAIL");}
			  }else{extentLogs.fail("EnterUserName", "UnableToEnterUserName");}
			  
			  
			  return flag;
			  
			  }
		
		
	

}
