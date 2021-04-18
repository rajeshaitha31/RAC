package com.web.automation.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.codoid.products.fillo.Recordset;
import com.google.common.base.Optional;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.objectrepository.EcomAMS_OR;
import com.web.automation.objectrepository.Login_OR;
import com.web.automation.utilities.CommonVariables;

public class AMSPage extends BasePage {

	public EventFiringWebDriver driver;
	public ExtentLogs extentLogs = new ExtentLogs();
	Optional<Long> timeoutInSecond = Optional.of(Long.parseLong("5"));

	public AMSPage(WebDriver driver) {
		super(driver);
		/*if (!actionLib.GetURl().contains("renters-choice-inc.com")) {
			throw new IllegalStateException("This is not the 'Signup' page.");
		}*/
	}

/**
 * This method is for Login	
 * @param data
 * @throws Throwable
 */
	
	
	public void login(Recordset data) throws Throwable {
		try {
			    
			
			//actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Login_OR.MYACCOUNT));
			    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.MYACCOUNT), "MYACCOUNT BUTTON");
			    ActionsLibrary.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(Login_OR.NavigateToLogin));
			if (actionLib.IsElementVisible(Login_OR.AMS_USER_NAME)) {
				actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.AMS_USER_NAME), data.getField("username"));
				actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.AMS_PASSWORD), data.getField("password"));
				actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.AMS_SIGNIN), "SIGNIN BUTTON");
				extentLogs.pass("SIGNIN", "Clicked on SIGNIN Button successfully.");
				//Assert.assertEquals("My Agreements", CommonVariables.CommonDriver.get().findElement(Login_OR.LOGINMESSAGE).getText());
				
				extentLogs.pass("SIGNEDIN", "Successfully Signed IN.");
				//actionLib.IsElementVisible(Login_OR.LOGOUT);

			} else {
				extentLogs.fail("User Name", "'User Name' User Name not Found.");
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void login_Invalid(Recordset data) throws Throwable {
		try {
			    
			    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.MYACCOUNT), "MYACCOUNT BUTTON");
			    ActionsLibrary.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(Login_OR.NavigateToLogin));
			if (actionLib.IsElementVisible(Login_OR.AMS_USER_NAME)) {
				actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.AMS_USER_NAME), data.getField("username"));
				actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.AMS_PASSWORD), data.getField("password"));
				actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.AMS_SIGNIN), "SIGNIN BUTTON");
				extentLogs.pass("SIGNIN", "Clicked on SIGNIN Button successfully.");
				
			} else {
				extentLogs.fail("User Name", "'User Name' User Name not Found.");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * This method is for Logout
	 * @throws Throwable
	 */
	public void logout() throws Throwable {
		try {
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.MYACCOUNT), "MYACCOUNT BUTTON");
			if (actionLib.isElementPresent(Login_OR.AMS_LOGOUT)) {

				actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Login_OR.AMS_LOGOUT));
				extentLogs.pass("LOGOUT", "Clicked on LOGOUT Button successfully.");
				//Assert.assertEquals("You've been signed out.",CommonVariables.CommonDriver.get().findElement(Login_OR.LOGOUTMESSAGE).getText());
				extentLogs.pass("LOGGEDOUT", "SUCCESSFULLY LOGGEDOUT");
				/*actionLib.IsElementVisible(Login_OR.SIGNIN_FORM);
				extentLogs.pass("SIGNIN_FORM", "SIGNIN_FORM is visible, You are in signup page.");*/

			} else {
				extentLogs.fail("Log out", "'Log out' Log out not Found.");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	

	/****************************************************************************************************************************
	 * Function Name : switchToRecentOpenedWindow() Description : To switch
	 * form old window to recent opened window
	 * 
	 * @throws InterruptedException
	 ***************************************************************************************************************************/
	public void switchToRecentOpenedWindow() throws InterruptedException {
		String strPrntWnd = ActionsLibrary.driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> strWnds = ActionsLibrary.driver.getWindowHandles();
		for (String a : strWnds) {
			if (!a.equalsIgnoreCase(strPrntWnd))
				ActionsLibrary.driver.switchTo().window(a);
			Thread.sleep(2000);
		}
	}

	/****************************************************************************************************************************
	 * Function Name : closeAllAndSwitchToMainWindow() Description : This method
	 * switch to parent window on web page.
	 ***************************************************************************************************************************/
	public void closeAllAndSwitchToMainWindow(String currentWindow) {
		for (String handle : ActionsLibrary.driver.getWindowHandles()) {
			if (!handle.equals(currentWindow)) {
				ActionsLibrary.driver.switchTo().window(handle);
				ActionsLibrary.driver.close();
			}
		}
		switchToWindow(currentWindow);
	}

	/****************************************************************************************************************************
	 * Function Name : switchToWindow() Description : This method switches to a
	 * window.
	 ***************************************************************************************************************************/
	public void switchToWindow(String window) {

		ActionsLibrary.driver.switchTo().window(window);
	}

	/****************************************************************************************************************************
	 * Function Name : getCurrentWindow() Description : This method get the
	 * current window.
	 ***************************************************************************************************************************/
	public String getCurrentWindow() {

		return ActionsLibrary.driver.getWindowHandle();
	}
	/*
	 * public EnrollmentPage registration(String email, String password) throws
	 * Throwable { EnrollmentPage enrollmentPg = null; try {
	 * actionLib.WaitForElementVisible(Login_OR.txtEmailAddress, 20); if
	 * (actionLib.IsElementVisible(Login_OR.txtEmailAddress)) {
	 * actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.
	 * txtEmailAddress), email); extentLogs.pass("Email",
	 * "User successfully entered email : ******* " + email +
	 * " ******* in signup page.");
	 * actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.
	 * txtPassword), password); extentLogs.pass("Password",
	 * "User successfully entered password : ******* " + password +
	 * " ******* in signup page.");
	 * actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.
	 * txtRecConfirmPassword), password); extentLogs.pass("Confirm Password",
	 * "User successfully entered confirm password : ******* " + password +
	 * " ******* in signup page.");
	 * actionLib.Click(actionLib.FindElement(Login_OR.lnkContinue,
	 * timeoutInSecond), 20); extentLogs.pass("Continue Button",
	 * "'Continue' button clicked successfully."); enrollmentPg = new
	 * EnrollmentPage(CommonVariables.CommonDriver.get()); } } catch (Exception
	 * e) { throw e; } return enrollmentPg; }
	 */
    
	
	
	
	public void CreateAndActivateAccount(Recordset data) throws Throwable
	 { 
		createAccount(data.getField("email"));
		 try {
			 
			 actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.ACTIVATEACCOUNT),"Link To Activate Account ");
			 switchToRecentOpenedWindow();
			 actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.PASSWORD_ACTIVATE), data.getField("password1"));
			 actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.CONFIRMPASSWORD_ACTIVATE), data.getField("password2"));
			 actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.ACCOUNTACTIVATE_BUTTON),"Account Activate Button");
		  	 Assert.assertTrue(CommonVariables.CommonDriver.get().findElement(Login_OR.WELCOMEMESSAGE_ACTIVATEACCOUNT).getText().contains("Welcome"));
			 extentLogs.pass("Account Activation", "Successfully Activated The Account");
	
	 
	  
	 	 } catch (Exception e) {
			throw e;
	 }
	}
	
	public void CreateAndActivateAccount_InvalidData(Recordset data) throws Throwable
	 { 
		createAccount(data.getField("email"));
		 try {
			 
			 actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.ACTIVATEACCOUNT),"Link To Activate Account ");
			 switchToRecentOpenedWindow();
			 actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.PASSWORD_ACTIVATE), data.getField("password1"));
			 actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.CONFIRMPASSWORD_ACTIVATE), data.getField("password2"));
			 actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.ACCOUNTACTIVATE_BUTTON),"Account Activate Button");
		  	 
	
	 
	  
	 	 } catch (Exception e) {
			throw e;
	 }
	}
	
	
	public void createAccount(String email) throws Throwable
	 {
		 try { 
			    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.MYACCOUNT), "MYACCOUNT BUTTON");
			    ActionsLibrary.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(Login_OR.NavigateToLogin));
			if (actionLib.IsElementVisible(Login_OR.CREATEACCOUNT)) {
				actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.CREATEACCOUNT),"CLICK TO CREATE ACCOUNT");
				actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.EMAILTOREGISTER), email);
				actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.CONFIRM_CREATEACCOUNT), "CREATE ACCOUNT BUTTON");
				extentLogs.pass("CREATE ACCOUNT", "Clicked on CREATE ACCOUNT Button successfully.");
				Thread.sleep(5000);
				Assert.assertTrue( CommonVariables.CommonDriver.get().findElement(Login_OR.WELCOMEMESSAGE_CREATEACCOUNT).getText().contains("Welcome"));
				extentLogs.pass("ACCOUNT CREATED", "Successfully Created Account.");
				//actionLib.IsElementVisible(Login_OR.LOGOUT);

			} else {
				extentLogs.fail("Create Account", "'Create Account' Create Account not Found.");
			}
		} catch (Exception e) {
			throw e;
		}
	}
	 
	 public void createAccount_InvalidData(String email) throws Throwable
	 {
		 try { 
			    actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.MYACCOUNT), "MYACCOUNT BUTTON");
			    ActionsLibrary.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(Login_OR.NavigateToLogin));
			if (actionLib.IsElementVisible(Login_OR.CREATEACCOUNT)) {
				actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.CREATEACCOUNT),"CLICK TO CREATE ACCOUNT");
				actionLib.type(CommonVariables.CommonDriver.get().findElement(Login_OR.EMAILTOREGISTER), email);
				actionLib.Click(CommonVariables.CommonDriver.get().findElement(Login_OR.CONFIRM_CREATEACCOUNT), "CREATE ACCOUNT BUTTON");
				extentLogs.pass("CREATE ACCOUNT", "Clicked on CREATE ACCOUNT Button successfully.");
				
				
			} else {
				extentLogs.fail("Create Account", "'Create Account' Create Account not Found.");
			}
		} catch (Exception e) {
			throw e;
		}
	}
	 
	 
	 public void linkAccount_ValidData(Recordset data) throws Throwable 
	 {
		 
		try {
			 login(data);
			 actionLib.WebdriverWaitForPage();
			 if(actionLib.IsElementVisible(Login_OR.WELCOMEMESSAGE_ACTIVATEACCOUNT)){
				 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.FIRSTNAME_AGREEMENTS), data.getField("FirstName"));
				 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.LASTNAME_AGREEMENTS), data.getField("LastName"));
				 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.AGREEMENTNUMBER), data.getField("AgreementNumber"));
				 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.LINKACCOUNT), "CLICK TO LINK ACCOUNT");
				 extentLogs.pass("Link ACCOUNT", "Clicked on Link Account Button successfully.");
				 Assert.assertTrue(CommonVariables.CommonDriver.get().getCurrentUrl().contains("agreements"));
				 extentLogs.pass("ACCOUNT Linked", "Successfully Linked the Account.");
				 
			 } else {
					extentLogs.fail("Welcome Message", "'Welcome Message' Welcome Message not Found.");
				}
			} catch (Exception e) {
				throw e;
			}
		}
	 
	 
	 public void linkAccount_InvalidData(Recordset data) throws Throwable 
	 {
		 
		try {
			 login(data);
			 //actionLib.WebdriverWaitForPage();
			 if(actionLib.IsElementVisible(Login_OR.WELCOMEMESSAGE_ACTIVATEACCOUNT)){
				 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.FIRSTNAME_AGREEMENTS), data.getField("FirstName"));
				 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.LASTNAME_AGREEMENTS), data.getField("LastName"));
				 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.AGREEMENTNUMBER), data.getField("AgreementNumber"));
				 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.LINKACCOUNT), "CLICK TO LINK ACCOUNT");
				 extentLogs.pass("Link ACCOUNT", "Clicked on Link Account Button successfully.");
				 
			 } else {
					extentLogs.fail("Welcome Message", "'Welcome Message' Welcome Message not Found.");
				}
			} catch (Exception e) {
				throw e;
			}
		}
	 
	 
	 /**
	  * This method is to view agreements
	  * @param data
	  * @throws Throwable
	  */
	 
	 public void viewAgreements(Recordset data) throws Throwable 
	 {
		 
		try {
			 login(data);
			 //actionLib.WebdriverWaitForPage();
			 if(actionLib.IsElementVisible(EcomAMS_OR.CLOSE_ADDPAYMENTPOPUP)){
				actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CLOSE_ADDPAYMENTPOPUP));}
			    actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.AGREEMENTS));
			    extentLogs.pass("AGREEMENTS", "We are on the agreements page");
				 	
			} catch (Exception e) {
				throw e;
			}
		}
	 
	 
	 public void viewPaymentMethods(Recordset data) throws Throwable 
	 {
		 
		try {
			 login(data);
			 //actionLib.WebdriverWaitForPage();
			 if(actionLib.IsElementVisible(EcomAMS_OR.CLOSE_ADDPAYMENTPOPUP)){
				actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CLOSE_ADDPAYMENTPOPUP));}
			    actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.PAYMENT_METHODS));
			    extentLogs.pass("PAYMENT METHODS", "We are on the payment methods page");
				 
			} catch (Exception e) {
				throw e;
			}
		}
	 
	 public void viewAccountProfile(Recordset data) throws Throwable 
	 {
		 
		try {
			 login(data);
			 //actionLib.WebdriverWaitForPage();
			 if(actionLib.IsElementVisible(EcomAMS_OR.CLOSE_ADDPAYMENTPOPUP)){
				actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CLOSE_ADDPAYMENTPOPUP));}
			    actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACCOUNT_PROFILE));
			    extentLogs.pass("ACCOUNT PROFILE", "We are on the Account Profile page");
				 
			} catch (Exception e) {
				throw e;
			}
		}
	 
	 
	 public void selectPaymentType(Recordset data) throws Throwable
	 {
		 if(actionLib.isElementPresent(EcomAMS_OR.CLOSE_ADDPAYMENTPOPUP)) {
				 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CLOSE_ADDPAYMENTPOPUP));
			     actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.PAYMENT_METHODS));
			     extentLogs.info("Available payment Methods" , "There are no payment methods added");
			     actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ADD_PAYMENTMETHOD));
             } else {
	             actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.PAYMENT_METHODS));
	             listOfPaymentMethods();
	             actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ADD_ANOTHERPAYMENTMETHOD));}
			 if(data.getField("PaymentType").contains("credit")) {
			     actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ADD_CREDITORDEBITCARD));
			     extentLogs.info("PaymentType", "Selected PaymentType Credit");}
			 if(data.getField("PaymentType").contains("ACH")) {
				 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ADD_ACH));
				 extentLogs.info("PaymentType", "Selected PaymentType ACH");}
			     actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ADD_PAYMENT_CONTINUE));
			 
			 
	 }
	 
  	 
	 public void entercreditCardDetails(Recordset data) throws Throwable
	 {
		 
			actionLib.WebdriverWaitForPage();
			 ActionsLibrary.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.NAVIGATETOPAYMENT));
			 extentLogs.info("CardInfo", "Entering data in Cardinformation section ");
			 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACCOUNTNUMBER), data.getField("ACCOUNTNUMBER"));
			 actionLib.selectByVisibleText(EcomAMS_OR.EXPIRYMONTH, data.getField("EXPMONTH"), "");
			 actionLib.selectByVisibleText(EcomAMS_OR.EXPIRYYEAR, data.getField("EXPYEAR"), "");
			 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CVV), data.getField("CVV"));
			 extentLogs.info("CardInfo", "Entered data in Cardinformation section ");
			 ActionsLibrary.SwitchBackFromiFrameToMaincontent();
			 actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACCEPTTERMSANDCONDITIONS));
			 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CONTINUE_PAYMENT));
			 //extentLogs.pass("AddCreditCardData", "Entered data in Card details");
			 		 
         }
 	 	 
	 public void fillcreditcardpersonaldata(String Cardholdername) throws Throwable {
		 
		 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.NameOnCard), Cardholdername);
		 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.Sameasprofileaddress));
		 extentLogs.pass("AddCardholderPersonalData", "Entered data in Cardholder holder personaldetails popup");
		 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CCPopSave));
		 extentLogs.pass("AddCardholderpersonaldata", "Entered data in Cardholder personal details popup");
		 
	 }
	 
	 
	 
	 public void enterACHDetails(Recordset data) throws Throwable
	 {
		 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_SELECT_ACCOUNTTYPE));
		 if(data.getField("AccountType").contains("personal")) {
		     actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_ACCOUNTTYPE_PERSONAL));
		     extentLogs.info("AccountType", "Selected AccountType Personal");}
		 if(data.getField("AccountType").contains("corporate")) {
			 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_ACCOUNTTYPE_CORPORATE));
			 extentLogs.info("AccountType", "Selected AccountType corporate");}
		 extentLogs.info("AccountDetails", "Entering data in AccountDetails section");
		 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_NAMEON_ACCOUNT), data.getField("Name"));
		 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_CONTACTNUMBER), data.getField("contactnumber"));
		 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_BANKROUTINGNUMBER), data.getField("bankroutingnumber"));
		 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_BANKACCOUNTNUMBER), data.getField("bankaccountnumber"));
		 actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_CONFIRMBANKACCOUNTNUMBER), data.getField("confirmbankaccountnumber"));
		 extentLogs.info("AccountDetails", "Entered data in AccountDetails section");
		 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_SAMEADDRESSCHKBOX)); 
		 actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_ACCEPT_TC));
		 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ACH_ADDBANKACCOUNTSAVE));
		 
	 }
	 
	
   public void makePayment() throws Throwable
   {
	 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.PAYMENTMETHOD_DROPDOWN));
	 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.SELECT_MASTERCARD));
	 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.MAKEPAYMENT_CONTINUE));
//	 actionLib.waitForElementPresent(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.MAKEPAYMENT_TEXT), 100);
	
	// actionLib.ScrollToBottom();
	 actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CHECKBOX_TANDC));
	 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CHECKBOX2));  
	 actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.PAYNOW));
   }
   
   
   
   
   public void manageAutoPay_Enroll() throws Throwable
   {
	   actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.MANAGE_AUTOPAY));
	   actionLib.selectByIndex(EcomAMS_OR.AUTOPAY_TYPE,1, "AutoPay Method");
	   String paymentmethod = CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.AUTOPAY_TYPE).getText();
	   extentLogs.info("Payment Type", paymentmethod);
	   actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.AUTOPAY_SAVE));
	   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ENROLL_CHECKBOX));
	   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ENROLL_CONFIRMATIONBUTTON));
	   extentLogs.info("Enroll Button", "Clicked on Enroll Button");
	   if(actionLib.isElementPresent(EcomAMS_OR.ENROLL_CONFIRM_SUCCESSMSG)) {
		   extentLogs.pass("Enroll Autopay", "Successfully Enrolled To AutoPay");
		   }
	   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CLOSE_SUCCESSMSG));
	   
   }
   
   public void manageAutoPay_UnEnroll() throws Throwable
   {
	   
	   actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.MANAGE_AUTOPAY));
	   actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.UNENROLL)); 
	   actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CONFIRM_UNENROLL)); 
	   extentLogs.info("Unenroll Button","Clicked on UnEnroll Button");
	   actionLib.WebdriverWaitForPage();
	   if(actionLib.isElementPresent(EcomAMS_OR.AUTOPAY_TYPE)) {
		   extentLogs.pass("UnEnroll", "Successfully UnEnrolled To AutoPay");
	   }
	    }
   
   
   /*public void viewRecentlyAddedPayment() throws Throwable
   {
	 if(actionLib.isElementPresent(EcomAMS_OR.PAYMENTMETHODADDED_SUCCESSMSG)) {
		 String newPaymentMethod = CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.PAYMENTMETHODADDED_SUCCESSMSG).getText();
		 extentLogs.info("Payment Method", newPaymentMethod);
	 }
   }*/
   
   
   
   public void AccountProfile_editAddressInfo(Recordset data) throws Throwable
   {
	   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.EDITADDRESSBUTTON));
	   extentLogs.info("Address Info", "Entering data in Addressinformation section ");
	   actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.STREETADDRESS),data.getField("street"));
	   actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.APARTMENTADDRESS),data.getField("apartment"));
	   actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CITY),data.getField("city"));
	   actionLib.selectByVisibleText(EcomAMS_OR.STATE, data.getField("state"), "State Selector");
	   actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ZIPCODE),data.getField("zip"));
	   extentLogs.info("Address Info", "Entered data in Addressinformation section ");
	   actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.SAVEADDRESSINFO));
	   
   }
   
   
   
   public void listOfPaymentMethods () throws Throwable
   {
	   if(actionLib.isElementPresent(EcomAMS_OR.LISTOFADDEDPAYMENTMETHODS)) {
		   
	   
	   int numberofPayments = CommonVariables.CommonDriver.get().findElements(EcomAMS_OR.LISTOFADDEDPAYMENTMETHODS).size();
	   extentLogs.info("Available number of Payment Methods", " "+numberofPayments);
	   
	   ArrayList<String> listofpaymentmethods = new ArrayList<String>();
		List<WebElement> menuItems = CommonVariables.CommonDriver.get().findElements(EcomAMS_OR.LISTOFADDEDPAYMENTMETHODS);
		for (WebElement item : menuItems) {
			if (!(item.getText().isEmpty())) {
				listofpaymentmethods.add(item.getText());
			}
		}
		for (int i = 0; i < numberofPayments; i++) {
			extentLogs.info("payment method "+(1+i), listofpaymentmethods.get(i).substring(0, 21) );	   }
	   } else {
		   extentLogs.info("Available Payment Methods", "There are No Available Payment Methods ");
	   }
}
   
   public void editPersonalInfo_email(Recordset data) throws Throwable
   {
	  
	   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.EDITUSERNAMELINK));
	   extentLogs.info("Personal Info", "Entering data in Personalinformation section ");
	   actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ENTERNEWEMAILADDRESS),data.getField("email"));
	   actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CONFIRMEMAILADDRESS),data.getField("verifyemail"));
	   extentLogs.info("Personal Info", "Entered data in Personalinformation section ");
	   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.CHANGEEMAILSUBMITBUTTON));
	   
   }
   
   
   public void editPersonalInfo_contactDetails(Recordset data,int index) throws Throwable
   {
	   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.EDITPERSONALINFOBUTTON));
	   extentLogs.info("Personal Info", "Entering data in Personalinformation section ");
	   actionLib.type(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.ENTERPHONENUMBER),data.getField("contactnumber"));
	   actionLib.selectByIndex(EcomAMS_OR.SELECTPHONETYPE, index, "Phone Type");
	   extentLogs.info("Personal Info", "Entered data in Personalinformation section ");
	   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.SAVEPERSONALINFO));
	   
   }
   
   
   public void deletePaymentMethod(Recordset data) throws Throwable
   {
	   if(data.getField("paymenttype").contains("credit")){
		   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.DELETE_PAYMENTMETHOD_CREDITCARD));
	   }
	   
	   if(data.getField("paymenttype").contains("ACH")){
		   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.DELETE_PAYMENTMETHOD_ACH));
	   }
	   actionLib.Click(CommonVariables.CommonDriver.get().findElement(EcomAMS_OR.PAYMENTDELETE_POPUP));
	   extentLogs.pass("Delete Payment", "Successfully Deleted The Payment Method");
	   listOfPaymentMethods();
	   
	   }
   }
   



   




