package com.web.HybrisAutomation.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
import com.web.automation.objectrepository.Ecom;
import com.web.automation.objectrepository.EcomAMS_OR;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;
import com.web.automation.hybrisobjectrepository.ClaimIPO_OR;
import com.web.automation.hybrisobjectrepository.HomePage_OR;
import com.web.automation.hybrisobjectrepository.MyAccount_OR;
import com.web.automation.hybrisobjectrepository.Reservation_OR;



public class HybrisMyAccountPage extends HybrisBasePage {
	
	
	public HybrisMyAccountPage(WebDriver driver) {
		super(driver);

	}
	
	/**
	 * This method is used to Sign in to My account
	 * @param Username
	 * @param Password
	 * @return
	 * @throws Throwable
	 */
	
	  
	  
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
	  flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.MYAGREEMENTS).isDisplayed();
	  if(flag){extentLogs.pass("WelcomeMessage","WelcomeMessageIsDisplayed");
	  }else{extentLogs.fail("WelcomeMessageDisplayed","WelcomeMessageIsNotDisplayed");}
	  }else{extentLogs.fail("ClickSignInButton","UnableToClickOnSignInButton");}
	  }else{extentLogs.fail("EnterPassWord","UnableToEnterPassWordFAIL");}
	  }else{extentLogs.fail("EnterUserName", "UnableToEnterUserName");}
	  }else{extentLogs.fail("ClickOnSignInLink", "UnableToClickOnSignInLink");}
	  }else{extentLogs.fail("SignInLink","SignInIsNotDisplayed");}
	  
	  return flag;
	  
	  }
	 
	 
		
	  /**
	   * This method is used to Sign out from My account
	   * @return
	 * @throws Throwable 
	   */
	  
		public boolean SignOut() throws Throwable {
			actionLib.WebdriverWaitForPage();
			//actionLib.WaitForElementVisible(MyAccount_OR.ACCOUNT_GLOBALHEADER, 2000);
			boolean flag = false;
			flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ACCOUNT_GLOBALHEADER));
			if(flag){extentLogs.pass("ClickONGlobalHeader-Account","ClickedONGlobalHeader-Account");
			actionLib.waitForVisibilityOfElement(MyAccount_OR.SIGNOUT_GLOBALHEADER," ", 5);
			flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNOUT_GLOBALHEADER).isDisplayed();
			if(flag){extentLogs.pass("SignoutButton","SignoutButtonIsDisplayed");
			flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.SIGNOUT_GLOBALHEADER));
			if(flag){extentLogs.pass("ClickOnSignoutButton","ClickedOnSignoutButton");
			}else {extentLogs.fail("ClickOnSignoutButton","UnableToClickOnSignoutButton");}
			}else { extentLogs.fail("SignoutButton","SignoutButtonIsNotDisplayed");}
			}else { extentLogs.fail("ClickONGlobalHeader-Account","UnableToClickONGlobalHeader-Account");}
			
			
			return flag;
		}
		
		
		
		
		
		
		/**
		 * Navigate To Payment Method from Global Header
		 * @return
		 * @throws Throwable
		 */
		
		
		public boolean GlobalHeader_PaymentMethods() throws Throwable {
			actionLib.WebdriverWaitForPage();
			//actionLib.WaitForElementVisible(MyAccount_OR.ACCOUNT_GLOBALHEADER, 2000);
			boolean flag = false;
			flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ACCOUNT_GLOBALHEADER));
			if(flag){extentLogs.pass("ClickONGlobalHeader-Account","ClickedONGlobalHeader-Account");
			actionLib.waitForVisibilityOfElement(MyAccount_OR.PAYMENTMETHODS_GLOBALHEADER," ", 10);
			flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_GLOBALHEADER).isDisplayed();
			if(flag){extentLogs.pass("PaymentMethods","PaymentMethodsIsDisplayed");
			flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_GLOBALHEADER));
			if(flag){extentLogs.pass("ClickOnPaymentMethodsButton","ClickedOnPaymentMethodsButton");
			flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_LABEL).isDisplayed();
			if(flag){extentLogs.pass("PaymentMethodsPage","Payment Methods Page Is Displayed");
			}else{extentLogs.fail("PaymentMethodsPage","Payment Methods Page Is Not Displayed");}
			}else {extentLogs.fail("ClickOnPaymentMethodsButton","UnableToClickOnPaymentMethodsButton");}
			}else { extentLogs.fail("PaymentMethodsButton","PaymentMethodsButtonIsNotDisplayed");}
			}else { extentLogs.fail("ClickONGlobalHeader-Account","UnableToClickONGlobalHeader-Account");}
			
			
			return flag;
		}
		
		
		
		/**
		 * Navigate To Dashboard from Global Header
		 * @return
		 * @throws Throwable
		 */
		
		
		
		
		
		public boolean GlobalHeader_DashBoard() throws Throwable {
			actionLib.WebdriverWaitForPage();
			//actionLib.WaitForElementVisible(MyAccount_OR.ACCOUNT_GLOBALHEADER, 2000);
			boolean flag = false;
			flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ACCOUNT_GLOBALHEADER));
			if(flag){extentLogs.pass("ClickONGlobalHeader-Account","ClickedONGlobalHeader-Account");
			actionLib.waitForVisibilityOfElement(MyAccount_OR.MYDASHBOARD_GLOBALHEADER," ", 5);
			flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.MYDASHBOARD_GLOBALHEADER).isDisplayed();
			if(flag){extentLogs.pass("MyDashBoard","MyDashBoardIsDisplayed");
			flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.MYDASHBOARD_GLOBALHEADER));
			if(flag){extentLogs.pass("ClickOnMyDashBoardButton","ClickedOnMyDashBoardButton");
			flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.MYAGREEMENTS).isDisplayed();
			if(flag){extentLogs.pass("DashBoardPage","DashBoard Is Displayed");
			}else{extentLogs.fail("DashBoardPage","DashBoardPage Is Not Displayed");}
			}else {extentLogs.fail("ClickOnMyDashBoardButton","UnableToClickOnMyDashBoardButton");}
			}else { extentLogs.fail("DsashBoardButton","DashBoardButtonIsNotDisplayed");}
			}else { extentLogs.fail("ClickONGlobalHeader-Account","UnableToClickONGlobalHeader-Account");}
			
			
			return flag;
		}
		
	
	
		
		
		/**
		 * This method is used to verify My account Dashboard
		 * @return
		 */
	
	public boolean VerifyDashBoard() {
	boolean flag = false;
		
	flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PAYMENTMETHODS).isDisplayed();
	if(flag){extentLogs.pass("QuickLinks-PaymentMethods","QuickLinks-PaymentMethodsIsDisplayed");
	flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PERSONALINFO).isDisplayed();
	if(flag){extentLogs.pass("QuickLinks-PersonalInformation","QuickLinks-PersonalInformationIsDisplayed");
	flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.MYSTORE_LABEL).isDisplayed();
	if(flag){extentLogs.pass("QuickLinks-MyStoreLabel","QuickLinks-MyStoreLabelIsDisplayed");
	}else{extentLogs.fail("QuickLinks-MyStoreLabel","QuickLinks-MyStoreLabelIsNotDisplayed");}
	}else{extentLogs.fail("QuickLinks-PersonalInformation","QuickLinks-PersonalInformationIsNotDisplayed");}
	}else{extentLogs.fail("QuickLinks-PaymentMethods","QuickLinks-PaymentMethodsIsNotDisplayed");}
	return flag;
		
	}
	
	
	
	
	/**
	 * This method is used to Navigate to Payment Methods
	 * @return
	 */
	
	public boolean NavigateToPaymentMethods(){
	boolean flag = false;
	
	flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PAYMENTMETHODS));
	if(flag){extentLogs.pass("ClickQuickLinks-PaymentMethods","Pass");
	flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_LABEL).isDisplayed();
	if(flag){extentLogs.pass("PaymentMethodsPage","Payment Methods Page Is Displayed");
	}else{extentLogs.fail("PaymentMethodsPage","FAIL");}
	}else{extentLogs.fail("ClickQuickLinks-PaymentMethods","FAIL");}
	return flag;
	}
	
	
	
	
/**
 * 	This method is used to Navigate to Payment History
 * @return
 */
	
	public boolean NavigateToPaymentHistory(){
		boolean flag = false;
		
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PAYMENTHISTORY));
		if(flag){extentLogs.pass("ClickQuickLinks-PaymentHistory","Pass");
		flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTHISTORY_LABEL).isDisplayed();
		if(flag){extentLogs.pass("PaymentHistoryPage","Payment History Page Is Displayed");
		}else{extentLogs.fail("PaymentHistoryPage","FAIL");}
		}else{extentLogs.fail("ClickQuickLinks-PaymentHistory","FAIL");}
		return flag;
		}
	
	

	
	/**
	 * This method is used to select payment method type
	 * @param paymentType
	 * @return
	 * @throws Throwable
	 */
	
	
	
	public boolean SelectPaymentMethodType(String paymentType) throws Throwable {
		
		boolean flag = false;
		if(paymentType.contains("credit")) {
			flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_ADDCREDITCARD));
			if(flag) {extentLogs.pass("PaymentMethodType-CreditCard","Pass");
			}else {extentLogs.fail("SignOutClicked","FAIL");}
			}
			
		if(paymentType.contains("bank")) {
			flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_ADDBANKACCOUNT));
			if(flag) { extentLogs.pass("PaymentMethodType-ACH","Pass");
			} else {extentLogs.fail("SignOutClicked","FAIL");} }
		if(paymentType.contains("paypal")) {
			//actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_ADDPAYPALFRAME));
			flag = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_ADDPAYPALFRAME).isDisplayed();
			if(flag) { extentLogs.pass("PaymentMethodType-Paypal","Pass");
			} else {extentLogs.fail("SignOutClicked","FAIL");} }
			
		
		return flag;
		
	}
	public boolean PaypalPayment(String paypalId, String paypalPwd) throws Throwable {

		boolean flag = false;

		String curwin = actionLib.getCurrentWindowHandle();
		//actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_ADDPAYPALFRAME));
		flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PAYMENTMETHODS_ADDPAYPALFRAME));
		if (flag) {
			extentLogs.pass("PayPal is displayed", "Clicked on the PayPal button");
		}
		actionLib.WebdriverWaitForPage();
		actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPALFRAME));

		System.out.println("Moved into frame");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_BUTTON));
		if (flag) {
			extentLogs.pass("PayPal payment is displayed", "Clicked on the PayPal payment button");
		}
		actionLib.WebdriverWaitForPage();
		Set<String> allWindows = actionLib.getwindowHadles();
		for (String window : allWindows) {
			if (!window.equalsIgnoreCase(curwin)) {
				actionLib.switchToWindow(window);
				break;
			} else {
				continue;
			}
		}
		actionLib.WebdriverWaitForPage();
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_EMAILID), paypalId);
		actionLib.WebdriverWaitForPage();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_NEXTBUTTON));
		actionLib.WebdriverWaitForPage();
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_PASSWORD), paypalPwd);
		actionLib.WebdriverWaitForPage();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_LOGINBUTTON));
		actionLib.WebdriverWaitForPage();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_AGREE_CONTINUE));
		actionLib.WebdriverWaitForPage();
		actionLib.switchToWindow(curwin);
		actionLib.SwitchBackFromiFrameToMaincontent();
		return flag;
	}


	
	
	
	
	/**
	 * This method is used to add credit card payment method with auto address
	 * @param name
	 * @param cardNumber
	 * @param expMonth
	 * @param ExpYear
	 * @param cvv
	 * @return
	 * @throws Throwable
	 */
	
	
	public boolean Add_CreditCard_PaymentMethod(String name,String cardNumber,String expMonth,String ExpYear,String cvv) throws Throwable {
		boolean flag = false;
		 flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_TITLE).isDisplayed();
		  if(flag){extentLogs.pass("Credit/DebitCardPopUpDisplayed", "Pass");
		  
		  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_NAMEONCARD),name);
		  if(flag){extentLogs.pass("EnterCardHolderName", "CardHolderNameEntered");
		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_SAMEASBILLINGADDRESSCBOX));
		  if(flag){extentLogs.pass("SelectSameAsBillingAddress", "SelectedSameAsBillingAddress");
		  ActionsLibrary.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_SWITCHTOVANTIVFRAME));
		  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_CARDNUMBER),cardNumber);
		  if(flag){extentLogs.pass("EnterCardNumber","EnteredCardNumber");
		  flag = actionLib.selectByVisibleText((MyAccount_OR.CREDITCARD_EXPIRYMONTH), expMonth, "");
		  if(flag){extentLogs.pass("SelectExpiryMonth","SelectedExpiryMonth");
		  flag = actionLib.selectByVisibleText((MyAccount_OR.CREDITCARD_EXPIRYYEAR), ExpYear, "");
		  if(flag){extentLogs.pass("SelectExpiryYear","SelectedExpiryYear");
		  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_CVV),cvv);
		  if(flag){extentLogs.pass("EnterCVV", "EnteredCVV");
		  ActionsLibrary.SwitchBackFromiFrameToMaincontent();
		  flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_AGREETnC)); 
		  if(flag){extentLogs.pass("ClickT&C","ClickedT&C");
		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_SAVE)); 
		  if(flag){extentLogs.pass("ClickOnSave","ClickOnSave");
		  }else{extentLogs.fail("ClickOnSave","UnabletoClickonSave");}
		  }else{extentLogs.fail("ClickT&C","UnableToClickT&C");}
		  }else{extentLogs.fail("EnterCVV","UnableToEnterCVV");}
		  }else{extentLogs.fail("SelectExpiryYear", "UnableToSelectExpiryYear");}
		  }else{extentLogs.fail("SelectExpiryMonth", "UnableToSelectExpiryMonth");}
		  }else{extentLogs.fail("EnterCardNumber","UnableToEnterCardNumber");}
		  }else{extentLogs.fail("SelectSameAsBillingAddress","UnableToSelectSameAsBillingAddress");}
		  }else{extentLogs.fail("EnterCardHolderName","UnableToEnterCardHolderName");}
		  }else{extentLogs.fail("Credit/DebitCardPopUpDisplayed","Credit/DebitCardPopUpisNotDisplayed");}
		  actionLib.WebdriverWaitForPage();
		  
		
		return flag;
	}
	
	
	/**
	 * This method is used to add bank account payment method with auto address
	 * @param name
	 * @param contactNumber
	 * @param routingNumber
	 * @param accountNumber
	 * @return
	 * @throws Throwable
	 */
	
	
	public boolean Add_Bank_PaymentMethod(String name,String contactNumber,String routingNumber,String accountNumber) throws Throwable {
		boolean flag = false;
		 flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANKPOPUP_TITLE).isDisplayed();
		  if(flag){extentLogs.pass("ADDBankAccountPopUp", "ADDBankAccountPopUpDisplayed");
		  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_NAMEONACCOUNT),name);
		  if(flag){extentLogs.pass("EnterAccountHolderName", "AccountHolderNameEntered");
		  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_CONTACTNUMBER),contactNumber);
		  if(flag){extentLogs.pass("EnterAccountHolderContactNumber", "AccountHolderContactNumberEntered");
		  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_ROUTINGNUMBER),routingNumber);
		  if(flag){extentLogs.pass("EnterRoutingNumber", "RoutingNumberEntered");
		  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_ACCOUNTNUMBER),accountNumber);
		  if(flag){extentLogs.pass("EnterAccountNumber", "AccountNumberEntered");
		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_SAMEADDRESSCHKBOX));
		  if(flag){extentLogs.pass("SelectSameAsBillingAddress", "SelectedSameAsBillingAddress");
		  flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_AGREETnC)); 
		  if(flag){extentLogs.pass("ClickonAgreeT&C","ClickedonAgreeT&C");
		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_SAVE)); 
		  if(flag){extentLogs.pass("ClickOnSave","ClickedOnSave");
		  }else{extentLogs.fail("ClickOnSave","UnabletoClickonSave");}
		  }else{extentLogs.fail("ClickonAgreeT&C","UnableToClickonAgreeT&C");}
		  }else{extentLogs.fail("SelectSameAsBillingAddress","UnableToSelectSameAsBillingAddress");}
		  }else{extentLogs.fail("EnterAccountNumber", "UnableToEnterAccountNumber");}
		  }else{extentLogs.fail("EnterRoutingNumber", "UnableToEnterRoutingNumber");}
		  }else{extentLogs.fail("EnterAccountHolderContactNumber","UnableToEnterAccountHolderContactNumber");}
		  }else{extentLogs.fail("EnterAccountHolderName","UnableToEnterAccountHolderName");}
		  }else{extentLogs.fail("ADDBankAccountPopUp","ADDBankAccountPopUpNotDisplayed");}
		  
		  actionLib.WebdriverWaitForPage();
		  
		
		return flag;
	}
	
	
	
	
	

	 
	
/**
 * This method is used to return the number of available payment methods
 * @throws Throwable
 */
	
	
	 public int numberOfPaymentMethods () throws Throwable
	   {
		 int numberofPayments=0;  
		 if(actionLib.isElementPresent(MyAccount_OR.LISTOFADDEDPAYMENTMETHODS)) {
			   
		   
		   numberofPayments = CommonVariables.CommonDriver.get().findElements(MyAccount_OR.LISTOFADDEDPAYMENTMETHODS).size();
		   extentLogs.info("Available number of Payment Methods", " "+numberofPayments);
		   
			
		   } else {
			   extentLogs.info("Available Payment Methods", "There are No Available Payment Methods ");
		   }
		   
		   return numberofPayments;
	}
	
	
	
	 
	 
	 /**
	  * This method is used to delete paymeent method
	  * @param paymentMethodType
	  * @return
	  */
	 
	 
	 public boolean deletePaymentMethod(String paymentMethodType)
	 {
		 boolean flag = false;
		 
		 if(paymentMethodType.contains("credit")) {
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_DELETE));
				if(flag) {extentLogs.pass("ClickonCreditcardDelete","ClickedOnCreditcardDelete");
				}else {extentLogs.fail("ClickonCreditcardDelete","UnableToClickonCreditcardDelete");}
				}
				
			if(paymentMethodType.contains("bank")) {
				flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_DELETE));
				if(flag) {extentLogs.pass("ClickonBankAccountDelete","ClickedOnBankAccountDelete");
				}else {extentLogs.fail("ClickonBankAccountDelete","UnableToClickonBankAccountDelete");}
				}
		 
			if(actionLib.isElementPresent(MyAccount_OR.DELETE_PAYMENTMETHOD_POPUP)) {
				flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.DELETE_YES));
				if(flag) {extentLogs.pass("ClickonConfirmDelete","ClickedonConfirmDelete");
				}else {extentLogs.fail("ClickonConfirmDelete","UnableToClickonConfirmDelete");}
				
			}
			
			
			
		 return flag;
	 }
	 
	 
	 
	 /**
	  * This method is used to enroll autopay
	  * @return
	 * @throws Throwable 
	  */
	 public boolean enrollAutopay() throws Throwable 
	 {
		 
	   String selectedPaymentMethod; 
	   boolean flag = false;
	   if(actionLib.isElementPresent(MyAccount_OR.ENROLLLINK_DASHBOARD)) {
		   flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ENROLLLINK_DASHBOARD));		
		   if(flag) {extentLogs.pass("ClickonEnrollLink","ClickedonEnrollLink");
		  // actionLib.waitForElementPresent(MyAccount_OR.ENROLL_CHOOSEPAYMENTS_POPUP, 30);
		   actionLib.waitForVisibilityOfElement(MyAccount_OR.ENROLL_CHOOSEPAYMENTS_POPUP, " ", 15);
		   flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ENROLL_CHOOSEPAYMENTS_POPUP).isDisplayed();
		   if(flag) {extentLogs.pass("ChoosePaymentScreen","ChoosePaymentScreenIsDisplayed");
		   selectedPaymentMethod = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ENROLL_SELECTEDPAYMENTMETHOD).getText();
		   extentLogs.info("SelectedPaymentMethod",  "**"+selectedPaymentMethod+"**" );
		   flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ENROLL_CHOOSEPAYMENT_CONTINUE));		
		   if(flag) {extentLogs.pass("ClickonContinue","ClickedonContinue");
		   flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ENROLL_REVIEWPAYMENT_POPUP).isDisplayed();
		   if(flag) {extentLogs.pass("ReviewPaymentScreen","ReviewPaymentScreenIsDisplayed");
		   flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ENROLLTERMSANDCONDITIONS));		
		   if(flag) {extentLogs.pass("ClickonAgreeTnC","ClickedonAgreeTnC");
		   flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ENROLLBUTTON_REVIEWAUTOPAYSCREEN));		
		   if(flag) {extentLogs.pass("ClickonEnrollAutoPayButton","ClickedonEnrollAutoPayButton");
		   actionLib.WebdriverWaitForPage();
		   flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.AUTOPAYENROLL_SUCCESSMESSAGE).isDisplayed();
		   if(flag) {extentLogs.pass("EnrollAutopaySuccessMessage","EnrollAutopaySuccessMessageIsDisplayed");
		   actionLib.WebdriverWaitForPage();
		   flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.VIEWMYAGREEMENTSBUTTON));		
		   if(flag) {extentLogs.pass("ClickonViewAgreements","ClickedonViewAgreements");
		   flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.MYAGREEMENTS).isDisplayed();
		   if(flag) {extentLogs.pass("MyAgreementsDashboard","MyAgreementsDashboardIsDisplayed");
		   flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.UNENROLLLINK_DASHBOARD).isDisplayed();
		   if(flag) {extentLogs.pass("AutopayEnroll","AutopayEnrollSuccessful");
		   }else {extentLogs.fail("AutopayEnroll","AutopayEnrollUnSuccessful");}
		   }else {extentLogs.fail("MyAgreementsDashboard","MyAgreementsDashboardIsNotDisplayed");}
		   }else {extentLogs.fail("ClickonViewAgreements","UnableToClickonViewAgreements");}
		   }else {extentLogs.fail("EnrollAutopaySuccessMessage","EnrollAutopaySuccessMessageIsNotDisplayed");}
		   }else {extentLogs.fail("ClickonEnrollAutoPayButton","UnableToClickonEnrollAutoPayButton");}
		   }else {extentLogs.fail("ClickonAgreeTnC","UnableToClickonAgreeTnC");}
		   }else {extentLogs.fail("ReviewPaymentScreen","ReviewPaymentScreenIsNotDisplayed");}
		   }else {extentLogs.fail("ClickonContinue","UnableToClickonContinue");}
		   }else {extentLogs.fail("ChoosePaymentScreen","ChoosePaymentScreenIsNotDisplayed");}
		   }else {extentLogs.fail("ClickonEnrollLink","UnableToClickonEnrollLink");}
		   
	   } else {
		   extentLogs.info("AutoPay", "Autopay is Unavailable");
	   }
	   
	   return flag;
	 }
		 
	 
	 public boolean UnEnrollAutopay()
	 {
		 boolean flag = false;
		 if(actionLib.isElementPresent(MyAccount_OR.UNENROLLLINK_DASHBOARD)) {
			   flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.UNENROLLLINK_DASHBOARD));		
			   if(flag) {extentLogs.pass("ClickonUnEnrollLink","ClickedonUnEnrollLink");
			   flag = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.UNENROLLBUTTON).isDisplayed();
			   if(flag) {extentLogs.pass("UnEnrollButton","UnEnrollButtonIsDisplayed");
			   flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.UNENROLLBUTTON));		
			   if(flag) {extentLogs.pass("ClickonUnEnrollButton","ClickedonUnEnrollButton");
			   actionLib.WebdriverWaitForPage();
			   flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.MYAGREEMENTS).isDisplayed();
			   if(flag) {extentLogs.pass("MyAgreementsDashboard","MyAgreementsDashboardIsDisplayed");
			   flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.ENROLLLINK_DASHBOARD).isDisplayed();
			   if(flag) {extentLogs.pass("AutopayUnEnroll","AutopayUnEnrollSuccessful");
			   }else {extentLogs.fail("AutopayUnEnroll","AutopayUnEnrollUnSuccessful");}
			   }else {extentLogs.fail("MyAgreementsDashboard","MyAgreementsDashboardIsNotDisplayed");}
			   }else {extentLogs.fail("ClickonUnEnrollButton","UnableToClickonUnEnrollButton");}
			   }else {extentLogs.fail("UnEnrollButton","UnEnrollButtonIsNotDisplayed");}
			   }else {extentLogs.fail("ClickonUnEnrollLink","UnableToClickedUnEnrollLink");}
		  } else {
			   extentLogs.info("AutoPay", "Autopay is Not Enrolled");
		   }
		   
		   return flag;
		 }
	 
	 
	 
	 public boolean editPersonalInfo_ContactInfo() throws Throwable
	 {
		 boolean flag = false;
		 String phoneNumber = randomPhoneNumber();
		 
    		 flag = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PERSONALINFO).isDisplayed();
		     if(flag) {extentLogs.pass("PersonalInfoLink","PersonalInfoLinkIsDisplayed");
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PERSONALINFO));		
			 if(flag) {extentLogs.pass("ClickonPersonalInfoLink","ClickedonPersonalInfolLink");
			 flag = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_TITLE).isDisplayed();
			 if(flag) {extentLogs.pass("PersonalInfoTitle","PersonalInfoTitleIsDisplayed");
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_EDIT));		
			 if(flag) {extentLogs.pass("EditPersonalInfo","ClickedonEditPersonalInfo");
			 flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_PHONENUMBER), phoneNumber);
			 if(flag) {extentLogs.pass("PhoneNumber","EnteretdNewPhoneNumber");
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_UPDATE));		
			 if(flag) {extentLogs.pass("UpdatePersonalInfo","ClickedonUpdatePersonalInfo");
			 //flag = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PEROSNALINFOUPDATE_SUCCESSMESSAGE).isDisplayed();
			 //if(flag) {extentLogs.pass("PersonalInfoSuccessMessage","PersonalInfoSuccessMessageIsDisplayed");
			 //}else {extentLogs.fail("PersonalInfoSuccessMessage","PersonalInfoSuccessMessageIsNotDisplayed");}
			 }else {extentLogs.fail("UpdatePersonalInfo","UnableToClickonUpdatePersonalInfo");}
			 }else {extentLogs.fail("PhoneNumber","UnableToEnterPhoneNumber");}
			 }else {extentLogs.fail("EditPersonalInfo","UnableToEditPersonalInfo");}
			 }else {extentLogs.fail("PersonalInfoTitle","PersonalInfoTitleIsNotDisplayed");}
			 }else {extentLogs.fail("ClickonPersonalInfoLink","UnableToClickonPersonalInfolLink");}
		     }else {extentLogs.fail("PersonalInfoLink","PersonalInfoLinkIsNotDisplayed");}
		     
		     //actionLib.WebdriverWaitForPage();
		     Thread.sleep(5000);
		   //  actionLib.waitForElementPresent(MyAccount_OR.QUICKLINKS_PERSONALINFO, 20);
		   //  actionLib.waitForElementPresent(MyAccount_OR.WELCOMEMESSAGE, 10);
		     return flag;
	 }
	 
	 
	 
	 
	 
	 public boolean editPersonalInfo_AddressDetails() throws Throwable
	 {
		 boolean flag = false;
		 String street = randomStreet();
		 String apt = randomAptNumber();
		 String city = randomCity();
		 
    		 flag = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PERSONALINFO).isDisplayed();
		     if(flag) {extentLogs.pass("PersonalInfoLink","PersonalInfoLinkIsDisplayed");
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PERSONALINFO));		
			 if(flag) {extentLogs.pass("ClickonPersonalInfoLink","ClickedonPersonalInfolLink");
			 flag = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_TITLE).isDisplayed();
			 if(flag) {extentLogs.pass("PersonalInfoTitle","PersonalInfoTitleIsDisplayed");
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_EDIT));		
			 if(flag) {extentLogs.pass("EditPersonalInfo","ClickedonEditPersonalInfo");
			 flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_STREETADDRESS), street);
			 if(flag) {extentLogs.pass("StreetAddress","EnteredStreetAddress");
			 flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_APARTMENTNUMBER), apt);
			 if(flag) {extentLogs.pass("ApartmentNumber","EnteredApartmentNumber");
			 flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_CITY), city);
			 if(flag) {extentLogs.pass("City","EnteredCity");
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_UPDATE));		
			 if(flag) {extentLogs.pass("UpdatePersonalInfo","ClickedonUpdatePersonalInfo");
			 }else {extentLogs.fail("UpdatePersonalInfo","UnableToClickonUpdatePersonalInfo");}
			 }else {extentLogs.fail("City","UnableToEnterCity");}
			 }else {extentLogs.fail("ApartmentNumber","UnableToEnterApartmentNumber");}
			 }else {extentLogs.fail("StreetAddress","UnableToEntereStreetAddress");}
			 }else {extentLogs.fail("EditPersonalInfo","UnableToClickonEditPersonalInfo");}
		     }else {extentLogs.fail("PersonalInfoTitle","PersonalInfoTitleIsNotDisplayed");}
			 }else {extentLogs.fail("ClickonPersonalInfoLink","UnableToClickonPersonalInfolLink");}
		     }else {extentLogs.fail("PersonalInfoLink","PersonalInfoLinkIsNotDisplayed");}
		 
		     //actionLib.WebdriverWaitForPage();
	//	     actionLib.waitForElementPresent(MyAccount_OR.QUICKLINKS_PERSONALINFO, 20);
		//     actionLib.waitForElementPresent(MyAccount_OR.WELCOMEMESSAGE, 10);
		 return flag;
		 
		 
	 }
	
	 
	 
	 
	 public boolean editPersonalInfo_FillAddressDetails(String street, String zip, String city) throws Throwable
	 {
		 boolean flag = false;
		 
		 
    		 flag = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PERSONALINFO).isDisplayed();
		     if(flag) {extentLogs.pass("PersonalInfoLink","PersonalInfoLinkIsDisplayed");
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.QUICKLINKS_PERSONALINFO));		
			 if(flag) {extentLogs.pass("ClickonPersonalInfoLink","ClickedonPersonalInfolLink");
			 flag = CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_TITLE).isDisplayed();
			 if(flag) {extentLogs.pass("PersonalInfoTitle","PersonalInfoTitleIsDisplayed");
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_EDIT));		
			 if(flag) {extentLogs.pass("EditPersonalInfo","ClickedonEditPersonalInfo");
			 flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_STREETADDRESS), street);
			 if(flag) {extentLogs.pass("StreetAddress","EnteredStreetAddress");
			 flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_ZIPCODE), zip);
			 if(flag) {extentLogs.pass("ApartmentNumber","EnteredApartmentNumber");
			 flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_CITY), city);
			 if(flag) {extentLogs.pass("City","EnteredCity");
			 flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.PERSONALINFO_UPDATE));		
			 if(flag) {extentLogs.pass("UpdatePersonalInfo","ClickedonUpdatePersonalInfo");
			 }else {extentLogs.fail("UpdatePersonalInfo","UnableToClickonUpdatePersonalInfo");}
			 }else {extentLogs.fail("City","UnableToEnterCity");}
			 }else {extentLogs.fail("ApartmentNumber","UnableToEnterApartmentNumber");}
			 }else {extentLogs.fail("StreetAddress","UnableToEntereStreetAddress");}
			 }else {extentLogs.fail("EditPersonalInfo","UnableToClickonEditPersonalInfo");}
		     }else {extentLogs.fail("PersonalInfoTitle","PersonalInfoTitleIsNotDisplayed");}
			 }else {extentLogs.fail("ClickonPersonalInfoLink","UnableToClickonPersonalInfolLink");}
		     }else {extentLogs.fail("PersonalInfoLink","PersonalInfoLinkIsNotDisplayed");}
		 
		    
		 return flag;
		 
		 
	 }
	 
	 
	 
	 // This method is to generate random phone number
	 public String randomPhoneNumber()
		{
			String characters = "23456789";
			String randomString = "";
			int length = 10;
			
			Random rand = new Random();
			
			char[] text = new char[length];
			
			for(int i=0;i<length;i++)
			{
				text[i] = characters.charAt(rand.nextInt(characters.length()));
				
			}
			
			for(int i=0;i<text.length;i++)
			{
			  randomString += text[i];
			}
			
			//System.out.println(randomString);
			
			return randomString;
			
			
		}
	 
	 
	 // This method is to generate random phone number
	 public String randomStreet()
		{
		 
		 String characters = "123456789";
			String randomString = "";
			int length = 3;
			
			Random rand = new Random();
			
			char[] text = new char[length];
			
			for(int i=0;i<length;i++)
			{
				text[i] = characters.charAt(rand.nextInt(characters.length()));
				
			}
			
			for(int i=0;i<text.length;i++)
			{
			  randomString += text[i];
			}
			
			
			randomString = "Street "+randomString;
			//System.out.println(randomString);
			
			return randomString;
			
			
		}
	 
	 
	 
	 public String randomAptNumber()
		{
			String characters = "23456789";
			String randomString = "";
			int length = 3;
			
			Random rand = new Random();
			
			char[] text = new char[length];
			
			for(int i=0;i<length;i++)
			{
				text[i] = characters.charAt(rand.nextInt(characters.length()));
				
			}
			
			for(int i=0;i<text.length;i++)
			{
			  randomString += text[i];
			}
			
			//System.out.println(randomString);
			
			return randomString;
			
			
		}
	 
	 public String randomCity()
		{
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String randomString = "";
			int length = 6;
			
			Random rand = new Random();
			
			char[] text = new char[length];
			
			for(int i=0;i<length;i++)
			{
				text[i] = characters.charAt(rand.nextInt(characters.length()));
				
			}
			
			for(int i=0;i<text.length;i++)
			{
			  randomString += text[i];
			}
			
			//System.out.println(randomString);
			
			return randomString;
			
			
		}
	 
	 
	 
	 /**
	  * This method is used to add bank account payment method and enter address manually
	  * @param name
	  * @param contactNumber
	  * @param routingNumber
	  * @param accountNumber
	  * @param Street
	  * @param Zipcode
	  * @param City
	  * @return
	  * @throws Throwable
	  */
	 
	 public boolean Add_Bank_PaymentMethod_FillData(String name,String contactNumber,String routingNumber,String accountNumber, String Street, String Zipcode, String City) throws Throwable {
			boolean flag = false;
			
			
			 flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANKPOPUP_TITLE).isDisplayed();
			  if(flag){extentLogs.pass("ADDBankAccountPopUp", "ADDBankAccountPopUpDisplayed");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_NAMEONACCOUNT),name);
			  if(flag){extentLogs.pass("EnterAccountHolderName", "AccountHolderNameEntered");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_CONTACTNUMBER),contactNumber);
			  if(flag){extentLogs.pass("EnterAccountHolderContactNumber", "AccountHolderContactNumberEntered");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_ROUTINGNUMBER),routingNumber);
			  if(flag){extentLogs.pass("EnterRoutingNumber", "RoutingNumberEntered");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_ACCOUNTNUMBER),accountNumber);
			  if(flag){extentLogs.pass("EnterAccountNumber", "AccountNumberEntered");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_STREET),Street);
			  if(flag){extentLogs.pass("EnterStreetNumber", "StreetNumberEntered");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_ZIP),Zipcode);
			  if(flag){extentLogs.pass("EnterZipcode", "ZipcodeEntered");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_CITY),City);
			  if(flag){extentLogs.pass("EnterCityName", "CityNameEntered");
			  flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_AGREETnC)); 
			  if(flag){extentLogs.pass("ClickonAgreeT&C","ClickedonAgreeT&C");
			  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.BANK_SAVE)); 
			  if(flag){extentLogs.pass("ClickOnSave","ClickedOnSave");
			  }else{extentLogs.fail("ClickOnSave","UnabletoClickonSave");}
			  }else{extentLogs.fail("ClickonAgreeT&C","UnableToClickonAgreeT&C");}
			  }else{extentLogs.fail("EnterCityName","UnableToEnterCityName");}
			  }else{extentLogs.fail("EnterZipcode","UnableToEnterZipcode");}
			  }else{extentLogs.fail("EnterStreetNumber","UnableToEnterStreetNumber");}
			  }else{extentLogs.fail("EnterAccountNumber", "UnableToEnterAccountNumber");}
			  }else{extentLogs.fail("EnterRoutingNumber", "UnableToEnterRoutingNumber");}
			  }else{extentLogs.fail("EnterAccountHolderContactNumber","UnableToEnterAccountHolderContactNumber");}
			  }else{extentLogs.fail("EnterAccountHolderName","UnableToEnterAccountHolderName");}
			  }else{extentLogs.fail("ADDBankAccountPopUp","ADDBankAccountPopUpNotDisplayed");}
			  
			  actionLib.WebdriverWaitForPage();
			  
			
			return flag;
		}
	 
	 
	 /**
	  * This method is used to add credit card payment method and enter address manually
	  * @param name
	  * @param cardNumber
	  * @param expMonth
	  * @param ExpYear
	  * @param cvv
	  * @return
	  * @throws Throwable
	  */
	 public boolean Add_CreditCard_PaymentMethod_FillData(String name, String street,String zipcode,String city) throws Throwable {
			boolean flag = false;
			 flag=CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_TITLE).isDisplayed();
			  if(flag){extentLogs.pass("Credit/DebitCardPopUpDisplayed", "Pass");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_NAMEONCARD),name);
			  if(flag){extentLogs.pass("EnterCardHolderName", "CardHolderNameEntered");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_STREETADDRESS),street);
			  if(flag){extentLogs.pass("EnterStreetAddress","EnteredEnterStreetAddress");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_ZIPCODE),zipcode);
			  if(flag){extentLogs.pass("EnterZipcode","EnteredZipcode");
			  flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_CITY),city);
			  if(flag){extentLogs.pass("EnterCity","EnteredCity");
			  flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_AGREETnC)); 
			  if(flag){extentLogs.pass("ClickT&C","ClickedT&C");
			  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.CREDITCARD_SAVE)); 
			  if(flag){extentLogs.pass("ClickOnSave","ClickOnSave");
			  }else{extentLogs.fail("ClickOnSave","UnabletoClickonSave");}
			  }else{extentLogs.fail("ClickT&C","UnableToClickT&C");}
			  }else{extentLogs.fail("EnterCity","UnableToEnterCity");}
			  }else{extentLogs.fail("EnterZipcode", "UnableToEnterZipcode");}
			  }else{extentLogs.fail("EnterStreetAddress", "UnableToEnterStreetAddress");}
			  }else{extentLogs.fail("EnterCardHolderName","UnableToEnterCardHolderName");}
			  }else{extentLogs.fail("DebitCardPopUp","DebitCardPopUpIsNotDisplayed");}
			  
			  
			  
			
			return flag;
		}
		
	
	 // Stub to test the make payment button from dashboard
	 
	 
	 public void ClickMakePayment() {
		 
		 actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(MyAccount_OR.MakePayment)); 
		 
	 }
	 
	 
	 
	 public void VerifyErrorMsg(By elementLocator, String Parameter) {
		 
			String expectedmenuItems[] = Parameter.split("!");
			ArrayList<String> Messages = new ArrayList<String>();
			List<WebElement> menuItems = CommonVariables.CommonDriver.get().findElements(elementLocator);
			for (WebElement item : menuItems) {
				if (!(item.getText().isEmpty())) {
					Messages.add(item.getText());
				}
			}
			for (int i = 0; i < expectedmenuItems.length; i++) {
				//if (Messages.get(i).equals(expectedmenuItems[i])) {
				 if (Messages.get(i).contains(expectedmenuItems[i])) {
					
					extentLogs.pass("Verify Message " + expectedmenuItems[i], "Error Message " + expectedmenuItems[i]
							+ " matched with actual Message:" + Messages.get(i));
				} else {
					extentLogs.fail("Verify Message " + expectedmenuItems[i], "Expected Error mesage "
							+ expectedmenuItems[i] + " did not match with actual Message:" + Messages.get(i));
				}
			}
			
		}
	 
}
