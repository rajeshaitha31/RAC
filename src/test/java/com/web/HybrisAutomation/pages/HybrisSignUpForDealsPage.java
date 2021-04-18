package com.web.HybrisAutomation.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.google.common.base.Optional;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;
import com.web.automation.hybrisobjectrepository.HomePage_OR;
import com.web.automation.hybrisobjectrepository.MyAccount_OR;
import com.web.automation.hybrisobjectrepository.SIGNUPFORDEALS_OR;



public class HybrisSignUpForDealsPage extends HybrisBasePage {

	
	public HybrisSignUpForDealsPage(WebDriver driver) {
		super(driver);
	} 
	
	public boolean NavigateToSignUpForDeals() throws Throwable {
		
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_HAMBURGERMENU_TEXT).isDisplayed();
		if(flag){extentLogs.pass("HamburgerMenu", "IsDisplayed");
		Thread.sleep(5000);
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_HAMBURGERMENU_TEXT));
		if(flag){extentLogs.pass("HamburgerMenu", "Clicked");
		flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.HAMB_DEALS).isDisplayed();
		if(flag){extentLogs.pass("Deals", "Displayed");
		Thread.sleep(4000);
		flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(HomePage_OR.HAMB_DEALS));
		if(flag){extentLogs.pass("Deals", "Clicked");
		flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.HAMB_SIGNUP_FORDEALS).isDisplayed();
		if(flag){extentLogs.pass("SignUpForDeals", "Displayed");
		Thread.sleep(4000);
		flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(HomePage_OR.HAMB_SIGNUP_FORDEALS));
		if(flag){extentLogs.pass("SignUpForDeals", "Clicked");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.Label_SIGNUPTEXT).isDisplayed();
		if(flag){extentLogs.pass("NavigateToSignUpForDeals", "NavigatedToSignUpForDeals");
		
		}else{extentLogs.fail("NavigateToSignUpForDeals", "Fail");}	
		}else {extentLogs.fail("SignUpForDeals", "NotClicked");}
		}else{extentLogs.fail("SignUpForDeals", "NotDisplayed");}
		}else{extentLogs.fail("Deals", "NotClicked");}
		}else{extentLogs.fail("Deals", "NotDisplayed");}
		}else{extentLogs.fail("ClickHamburgerMenu", "Failed");}
		}else{extentLogs.fail("HamburgerMenu", "NotDisplayed");}
		
		return flag;
		
	}
		
	public boolean FillData_SignUpForDeals(String Email , String VerifyEmail , 
			String FirstName , String LastName , String ZipCode) throws Throwable {
		
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_EMAIL).isDisplayed();
		if(flag){extentLogs.pass("Email", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_EMAIL ), Email);
		if(flag){extentLogs.pass("EnterEmail", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_VERIFYEMAIL).isDisplayed();
		if(flag){extentLogs.pass("VerifyEmail", "Displayed");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_VERIFYEMAIL ), VerifyEmail);
		if(flag){extentLogs.pass("EnterVerifyEmail", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_FIRSTNAME).isDisplayed();	
		if(flag){extentLogs.pass("FirstName", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_FIRSTNAME ),FirstName);
		if(flag){extentLogs.pass("EnterFirstName", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_LASTNAME).isDisplayed();
		if(flag){extentLogs.pass("SecondName", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_LASTNAME ),LastName);
		if(flag){extentLogs.pass("EnterSecondName", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_Zipcode).isDisplayed();
		if(flag){extentLogs.pass("ZipCode", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_Zipcode),ZipCode);	
		if(flag){extentLogs.pass("EnterZipCode", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_SUBMIT).isDisplayed();	
		if(flag){extentLogs.pass("SubmitDisplayed", "Pass");
		flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_SUBMIT));
		if(flag){extentLogs.pass("Submit", "Clicked");
			
		}else {extentLogs.fail("ClickSubmit", "NotClicked");}
		}else{extentLogs.fail("SubmitDisplayed", "Fail");}
		}else{extentLogs.fail("EnterZipCode", "Fail");}
		}else{extentLogs.fail("ZipCode", "NotDisplayed");}
		}else{extentLogs.fail("EnterSecondName", "Fail");}
		}else{extentLogs.fail("SecondName", "NotDisplayed");}
		}else{extentLogs.fail("EnterFirstName", "Fail");}
		}else{extentLogs.fail("FirstName", "NotDisplayed");}
		}else{extentLogs.fail("EnterVerifyEmail", "Fail");}
		}else{extentLogs.fail("VerifyEmail", "NotDisplayed");}
		}else{extentLogs.fail("EnterEmail", "Fail");}
		}else{extentLogs.fail("Email", "NotDisplayed");}
		return flag;
		
	}
	
	public boolean FillBlankData_SignUpForDeals( 
			String FirstName , String LastName , String ZipCode) throws Throwable {
		
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_EMAIL).isDisplayed();
		if(flag){extentLogs.pass("Email", "Displayed");
		flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_EMAIL ));
		if(flag){extentLogs.pass("EnterEmail", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_VERIFYEMAIL).isDisplayed();
		if(flag){extentLogs.pass("VerifyEmail", "Displayed");
		flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_VERIFYEMAIL ));
		if(flag){extentLogs.pass("EnterVerifyEmail", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_FIRSTNAME).isDisplayed();	
		if(flag){extentLogs.pass("FirstName", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_FIRSTNAME ),FirstName);
		if(flag){extentLogs.pass("EnterFirstName", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_LASTNAME).isDisplayed();
		if(flag){extentLogs.pass("SecondName", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_LASTNAME ),LastName);
		if(flag){extentLogs.pass("EnterSecondName", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_Zipcode).isDisplayed();
		if(flag){extentLogs.pass("ZipCode", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_Zipcode),ZipCode);	
		if(flag){extentLogs.pass("EnterZipCode", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_SUBMIT).isDisplayed();	
		if(flag){extentLogs.pass("SubmitDisplayed", "Pass");
		flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_SUBMIT));
		if(flag){extentLogs.pass("Submit", "Clicked");
			
		}else {extentLogs.fail("ClickSubmit", "NotClicked");}
		}else{extentLogs.fail("SubmitDisplayed", "Fail");}
		}else{extentLogs.fail("EnterZipCode", "Fail");}
		}else{extentLogs.fail("ZipCode", "NotDisplayed");}
		}else{extentLogs.fail("EnterSecondName", "Fail");}
		}else{extentLogs.fail("SecondName", "NotDisplayed");}
		}else{extentLogs.fail("EnterFirstName", "Fail");}
		}else{extentLogs.fail("FirstName", "NotDisplayed");}
		}else{extentLogs.fail("EnterVerifyEmail", "Fail");}
		}else{extentLogs.fail("VerifyEmail", "NotDisplayed");}
		}else{extentLogs.fail("EnterEmail", "Fail");}
		}else{extentLogs.fail("Email", "NotDisplayed");}
		return flag;
		
	}
	
	
	
	public boolean SignUpForDeals_VerifyEmailBlank(String Email , String VerifyEmail , 
			String FirstName , String LastName , String ZipCode) throws Throwable {
		
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_EMAIL).isDisplayed();
		if(flag){extentLogs.pass("Email", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_EMAIL ), Email);
		if(flag){extentLogs.pass("EnterEmail", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_VERIFYEMAIL).isDisplayed();
		if(flag){extentLogs.pass("VerifyEmail", "Displayed");
		flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_VERIFYEMAIL ));
		if(flag){extentLogs.pass("EnterVerifyEmail", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_FIRSTNAME).isDisplayed();	
		if(flag){extentLogs.pass("FirstName", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_FIRSTNAME ),FirstName);
		if(flag){extentLogs.pass("EnterFirstName", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_LASTNAME).isDisplayed();
		if(flag){extentLogs.pass("SecondName", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_LASTNAME ),LastName);
		if(flag){extentLogs.pass("EnterSecondName", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_Zipcode).isDisplayed();
		if(flag){extentLogs.pass("ZipCode", "Displayed");
		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_Zipcode),ZipCode);	
		if(flag){extentLogs.pass("EnterZipCode", "Pass");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_SUBMIT).isDisplayed();	
		if(flag){extentLogs.pass("SubmitDisplayed", "Pass");
		flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_SUBMIT));
		if(flag){extentLogs.pass("Submit", "Clicked");
	
		}else {extentLogs.fail("ClickSubmit", "NotClicked");}
		}else{extentLogs.fail("SubmitDisplayed", "Fail");}
		}else{extentLogs.fail("EnterZipCode", "Fail");}
		}else{extentLogs.fail("ZipCode", "NotDisplayed");}
		}else{extentLogs.fail("EnterSecondName", "Fail");}
		}else{extentLogs.fail("SecondName", "NotDisplayed");}
		}else{extentLogs.fail("EnterFirstName", "Fail");}
		}else{extentLogs.fail("FirstName", "NotDisplayed");}
		}else{extentLogs.fail("EnterVerifyEmail", "Fail");}
		}else{extentLogs.fail("VerifyEmail", "NotDisplayed");}
		}else{extentLogs.fail("EnterEmail", "Fail");}
		}else{extentLogs.fail("Email", "NotDisplayed");}
		return flag;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	public boolean VerifySignUpForDealsSucess() {
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_SuccessPage).isDisplayed();
		if(flag){
			extentLogs.pass("VerifySignUpForDealsSuccessPage", "PASS");
		}else{extentLogs.pass("VerifySignUpForDealsSuccessPage", "FAIL");}
		return flag;
		
	}
	
	public boolean VerifyEmailValidation() {
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_EmailValidation).isDisplayed();
		String message = CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_EmailValidation).getText();
		if(flag){
			extentLogs.pass("VerifyEmailValidation:", "PASS");
		}else{extentLogs.pass("VerifyEmailValidation", "FAIL");}
		return flag;
		
	}
	
	
	public boolean VerifyBlankEmailValidation() {
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_Blank_EmailValidation).isDisplayed();
		if(flag){extentLogs.pass("VerifyEmailValidation", "ErrorMessageDisplayedForEmail");
		flag=CommonVariables.CommonDriver.get().findElement(SIGNUPFORDEALS_OR.SD_EmailValidation).isDisplayed();
		if(flag){extentLogs.pass("VerifyEmailValidation", "ErrorMessageDisplayedForVerifyEmail");
		}else {extentLogs.fail("VerifyEmailValidation", "ErrorMessageDisplayedForVerifyEmail");}
		}else{extentLogs.fail("VerifyEmailValidation", "ErrorMessagenotDisplayeForEmail");}
				
		return flag;
		
	}
	
	
	
	
}
