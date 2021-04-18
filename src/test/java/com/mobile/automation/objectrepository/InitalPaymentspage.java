package com.mobile.automation.objectrepository;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.amazonaws.services.kms.model.transform.GenerateRandomResultJsonUnmarshaller;
import com.experitest.appium.SeeTestIOSDriver;
import com.mobile.automation.accelerators.MobileActionLibrary;
import com.mobile.automation.accelerators.MobileLocator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InitalPaymentspage extends MobileActionLibrary {
	int MIN_TO = 5;
	int MED_TO = 15;
	int MAX_TO = 60;

	public InitalPaymentspage(IOSDriver appiumDriver) {
		super((SeeTestIOSDriver) appiumDriver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	@iOSFindBy(xpath = "//*[@accessibilityLabel='DONE']")
	public MobileElement DONE;

	@iOSFindBy(accessibility = "Enter your associate PIN")
	public MobileElement PIN;

	@iOSFindBy(accessibility = "OK")
	public MobileElement OK;

	@iOSFindBy(xpath = "//*[@text='CASH']")
	public MobileElement CASH;

	@iOSFindBy(xpath = "//*[@class='VNHeadline1Label']")
	public MobileElement Header;

	@iOSFindBy(xpath = "(//*[@class='VNHeadline1Label'])[1]")
	public MobileElement Headeraccount;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='What type of account is this?']")
	public MobileElement typeaccount;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Checking']")
	public MobileElement Checking;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Savings']")
	public MobileElement Savings;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='BANK ACCOUNT']")
	public MobileElement BANKACCOUNT;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CREDIT/DEBIT CARD']")
	public MobileElement CREDITDEBITCARD;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement enterusername;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Password' and @class='UITextFieldLabel']")
	public MobileElement pwd;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement entervalue;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='ENTER MY INFO']")
	public MobileElement ENTERMYINFO;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Enter your debit/credit card information']")
	public MobileElement debitcreditcardinforma;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement ccn1;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='####' and ./parent::*[@accessibilityLabel='ccn2']]")
	public MobileElement ccn2;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='####' and ./parent::*[@accessibilityLabel='ccn3']]")
	public MobileElement ccn3;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='####' and ./parent::*[@accessibilityLabel='ccn4']]")
	public MobileElement ccn4;

	@iOSFindBy(xpath = "//*[@class='UITextFieldBorderView' and ./parent::*[@accessibilityLabel='verifyPasswordField']]")
	public MobileElement Confirmpwd;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Create a user name.']")
	public MobileElement Createausernamehe;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Please review your initial payment information.']")
	public MobileElement Reviewinitial;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Please review your AutoPay information']")
	public MobileElement AutoPayinformation;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='SET UP AUTOPAY']")
	public MobileElement SETUPAUTOPAY;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='What account would you like to use?']")
	public MobileElement whataccount;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Credit/Debit Card']")
	public MobileElement CreditDebitCard;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='What account would you like to use?']")
	public MobileElement accountlike;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Bank Account Ending In 5432']")
	public MobileElement Bankaccountending;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Credit/Debit Card Ending In 5454']")
	public MobileElement CreditDebitac;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='SET UP PAYMENT']")
	public MobileElement SETUPPAYMENT;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement AssociateLogin;

	@iOSFindBy(accessibility = "LOGIN")
	public MobileElement LOGIN;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONTINUE']")
	public MobileElement CONTINUE;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[2]")
	public MobileElement CONTINUEbu;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONTINUE' and ./parent::*[@accessibilityLabel='Continue']]")
	public MobileElement Continuebtncard;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONTINUE' and ./parent::*[@accessibilityLabel='continueButtonText']]")
	public MobileElement Continuebtndate;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[1]")
	public MobileElement CONTINUEbutton;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='SUBMIT']")
	public MobileElement SUBMIT;

	@iOSFindBy(xpath = "(//*[@class='UIView' and ./parent::*[@class='VNHTMLAlertMessageView']]/*/*[@text='OK'])[2]")
	public MobileElement Ok;

	@iOSFindBy(xpath = "//*[@text='See your sales associate to make a cash payment.']")
	public MobileElement PopupPrompt;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Accept Cash Payment']")
	public MobileElement AcceptcashPayment;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*[@class='VNAnimatableLabelCell'])[2]/*/*[1]")
	public MobileElement Initialpayment;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Now, choose how you would like to make your monthly payment.']")
	public MobileElement makeyourmonthlypaymenttxt;

	@iOSFindBy(xpath = "//*[@text='skip Autopay']")
	public MobileElement skipAutopay;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement UIFieldEditor;

	@iOSFindBy(accessibility = "ACCEPT")
	public MobileElement ACCEPT;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Now, choose how you would like to make your monthly payment.']")
	public MobileElement choosemonthlypayment;

	MobileElement ele;

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName InitalPayment
	 * @return
	 * @throws
	 */
	public void InitalPayment() throws Exception {
		try {
			// part 4
			// initial Payment with CASH
			ele = waitForElementPresent(CASH, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			click(ele, "CASH");
			isElementPresent(PopupPrompt,
					"See your sales associate to make a cash payment");
			ele = waitForElementPresent(Ok, 60);
			click(ele, "ok");
			// Accept CASH payment
			waitForElementPresent(AcceptcashPayment, 60);
			if (isElementPresent(AcceptcashPayment, "Accept Cash Payment")) {
				String dollarAmt = getText(Initialpayment, "Initialpayment")
						.trim();
				dollarAmt = dollarAmt.substring(1);
				type(UIFieldEditor, dollarAmt, "Enter Amount");
				click(DONE, "DONE");
				// Associate pin (5661)
				ele = waitForElementPresent(PIN, 60);
				type(ele, "1515", "Enter your associate PIN");
				click(ACCEPT, "ACCEPT");
				extentLogs.pass("Verify payment",
						"payment successfully processed");
			} else {
				extentLogs.fail("Verify payment",
						"payment not successfully processed");
			}
			// Skip autopay screen
			wait(5);
			waitForElement(SETUPAUTOPAY, 60, "SET UP AUTOPAY");
			isElementPresent(makeyourmonthlypaymenttxt,
					"Now, choose how you would like to make your monthly payment");
			sdriver.context("WEB");
			if (sdriver.findElement(By.xpath("//*[@text='skip Autopay']"))
					.isDisplayed()) {
				sdriver.findElement(By.xpath("//*[@text='skip Autopay']"))
						.click();
				extentLogs.pass("Verify skip Autopay Button",
						"skip Autopay button is  Clicked successfylly");
			} else {
				extentLogs.fail("Verify skip Autopay Button",
						"skip Autopay button is not Clicked successfylly");
			}
			// isElementPresent(skipAutopay, "skip Autopay");
			sdriver.context("NATIVE_APP_INSTRUMENTED");

			wait(5);
			/*
			 * //part 4 //initial Payment with CASH ele =
			 * waitForElementPresent(CASH, 60); click(ele, "CASH");
			 * 
			 * ele = waitForElementPresent(Ok, 60); click(ele, "ok"); //
			 * FindElement(MobileLocator.ByXPath,
			 * "//*[@text='See your sales associate to make a cash payment.']",
			 * MED_TO); //
			 * 
			 * //Accept CASH payment waitForElementPresent(AcceptcashPayment,
			 * 60);
			 * 
			 * // FindElement(MobileLocator.ByXPath,
			 * "//*[@accessibilityLabel='Accept Cash Payment']", MED_TO); String
			 * dollarAmt =
			 * sdriver.findElementByXPath("(//*[@class='VNCollectionView']/
			 * *[@class='VNAnimatableLabelCell dollarAmt=
			 * dollarAmt.substring(1); type(UIFieldEditor,
			 * dollarAmt,"Enter Amount"); click(DONE, "DONE");
			 * 
			 * // Associate pin (5661) ele= waitForElementPresent(PIN, 60);
			 * type(ele, "1515","Enter your associate PIN"); click(ACCEPT,
			 * "ACCEPT");
			 * 
			 * //Skip autopay screen FindElement(MobileLocator.ByXPath,
			 * "//*[@accessibilityLabel='Now, choose how you would like to make your monthly payment.']"
			 * , MAX_TO);
			 * 
			 * FindElement(MobileLocator.ByXPath,
			 * "//*[@accessibilityLabel='SET UP AUTOPAY']", MIN_TO);
			 * sdriver.context("WEB");
			 * click(FindElement(MobileLocator.ByXPath,"//*[@text='skip Autopay']"
			 * ,MIN_TO));
			 * 
			 * sdriver.context("NATIVE_APP_INSTRUMENTED");
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName InitialPaymentThroughBankAccountAutoPay_Same_Bank_Account
	 * @return
	 * @throws
	 */
	public void InitialPaymentThroughBankAccountAutoPay_Same_Bank_Account()
			throws Exception {
		try {
			// part 4
			waitForElementPresent(BANKACCOUNT, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			// initial Payment with CASH
			ele = waitForElementPresent(BANKACCOUNT, 60);
			click(ele, "BANKACCOUNT");

			isElementPresent(Createausernamehe, "Create a user name");
			type(enterusername, genrateRandomUser(), "Enter username");
			click(CONTINUE, "CONTINUE");

			type(pwd, "Computer12", "Enter Password");
			type(Confirmpwd, "Computer12", "Enter Password");
			click(CONTINUEbu, "CONTINUE");

			// security question
			type(entervalue, "Hydera", "Enter Security question");

			click(CONTINUEbutton, "CONTINUE");

			click(CONTINUEbu, "CONTINUE");

			// bank Routing number
			Thread.sleep(1000);
			isElementPresent(entervalue, "What's your bank routing number?");
			wait(2);
			type(entervalue, "123456780", "Enter Bank Routing number");
			click(CONTINUE, "CONTINUE");

			// account number
			isElementPresent(Headeraccount, "What's your bank account number?");
			type(entervalue, "1235432", "Enter bank account number");
			click(CONTINUEbutton, "CONTINUE");

			// type of account
			waitForElementPresent(typeaccount, 60);
			isElementPresent(typeaccount, "What type of account is this?");
			click(Savings, "Savings");
			click(CONTINUEbutton, "CONTINUE");
			// submit
			waitForElementPresent(Reviewinitial, 60);
			isElementPresent(Reviewinitial,
					"Please review your initial payment information");
			click(SUBMIT, "SUBMIT");

			// setupautopay
			waitForElementPresent(SETUPAUTOPAY, 60);
			click(SETUPAUTOPAY, "SET UP AUTOPAY");

			// setup payment
			waitForElementPresent(accountlike, 60);
			isElementPresent(accountlike, "What account would you like to use?");
			click(Bankaccountending, "Bank Account Ending In 5432");
			click(SETUPPAYMENT, "SET UP PAYMENT");
			wait(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName 
	 *             Initial_payment_through_credit_card_Autopay_through_bank_account
	 * @return
	 * @throws
	 */
	public void Initial_payment_through_credit_card_Autopay_through_bank_account()
			throws Exception {
		try {
			// part 4
			waitForElementPresent(CREDITDEBITCARD, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			// initial Payment with CASH
			ele = waitForElementPresent(CREDITDEBITCARD, 60);
			click(ele, "CREDIT/DEBIT CARD");

			isElementPresent(Createausernamehe, "Create a user name");
			type(enterusername, genrateRandomUser(), "Enter username");
			click(CONTINUE, "CONTINUE");

			type(pwd, "Computer12", "Enter Password");
			type(Confirmpwd, "Computer12", "Enter Password");
			click(CONTINUEbu, "CONTINUE");

			// security question
			type(entervalue, "Hydera", "Enter Security question");

			click(CONTINUEbutton, "CONTINUE");

			click(CONTINUEbu, "CONTINUE");

			// initial payment
			waitForElementPresent(ENTERMYINFO, 60);
			isElementPresent(Headeraccount, "Your initial payment");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(Continuebtncard, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			type(ccn1, "1226", "Enter expiration date");
			click(Continuebtndate, "CONTINUE");

			// security code
			isElementPresent(Headeraccount, "What's the security code?");
			type(ccn1, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");

			// submit
			waitForElementPresent(Reviewinitial, 60);
			isElementPresent(Reviewinitial,
					"Please review your initial payment information");
			click(SUBMIT, "SUBMIT");
			wait(5);
			// setupautopay
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='SET UP PAYMENT']", 5))
				;
			{
				waitForElementPresent(SETUPAUTOPAY, 60);
				isElementPresent(Headeraccount,
						"Now, choose how you would like to make your monthly payment");
				click(SETUPAUTOPAY, "SET UP AUTOPAY");
			}
			// setup payment
			if (isElementPresent(
					MobileLocator.ByXPath,
					"//*[@accessibilityLabel='What account would you like to use?']",
					2))
				;
			{
				waitForElementPresent(accountlike, 60);
				isElementPresent(accountlike,
						"What account would you like to use?");
				click(CreditDebitac, "Credit/Debit Card Ending In 5454");
			}
			// if exist or not
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='SET UP PAYMENT']", 2))
				;
			{

				click(SETUPPAYMENT, "SET UP PAYMENT");

			}
			wait(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_Take_a_Card_Payment_SkipAutPay_Schedule_Delivery
	 * @return
	 * @throws
	 */
	public void Verify_Take_a_Card_Payment_SkipAutPay_Schedule_Delivery()
			throws Exception {
		try {
			// part 4
			waitForElementPresent(CREDITDEBITCARD, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			// initial Payment with CASH
			ele = waitForElementPresent(CREDITDEBITCARD, 60);
			click(ele, "CREDIT/DEBIT CARD");

			isElementPresent(Createausernamehe, "Create a user name");
			type(enterusername, genrateRandomUser(), "Enter username");
			click(CONTINUE, "CONTINUE");

			type(pwd, "Computer12", "Enter Password");
			type(Confirmpwd, "Computer12", "Enter Password");
			click(CONTINUEbu, "CONTINUE");

			// security question
			type(entervalue, "Hydera", "Enter Security question");

			click(CONTINUEbutton, "CONTINUE");

			click(CONTINUEbu, "CONTINUE");

			// Credit card payment
			waitForElementPresent(ENTERMYINFO, 60);
			isElementPresent(Headeraccount, "Your initial payment");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(Continuebtncard, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			type(ccn1, "1226", "Enter expiration date");
			click(Continuebtndate, "CONTINUE");

			// security code
			isElementPresent(Headeraccount, "What's the security code?");
			type(ccn1, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");

			// submit
			waitForElementPresent(Reviewinitial, 60);
			isElementPresent(Reviewinitial,
					"Please review your initial payment information");
			click(SUBMIT, "SUBMIT");

			// setupautopay
			waitForElementPresent(SETUPAUTOPAY, 60);
			isElementPresent(Headeraccount,
					"Now, choose how you would like to make your monthly payment");
			sdriver.context("WEB");
			wait(2);
			// click(skipAutopay, "skip Autopay");
			click(FindElement(MobileLocator.ByXPath,
					"//*[@text='skip Autopay']", MIN_TO));
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			wait(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_TakeCashPayment_SetUpAutoPay_ScheduleDelivery
	 * @return
	 * @throws
	 */
	public void Verify_TakeCashPayment_SetUpAutoPay_ScheduleDelivery()
			throws Exception {

		try {
			// part 4
			// initial Payment with CASH
			ele = waitForElementPresent(CASH, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			click(ele, "CASH");
			isElementPresent(PopupPrompt,
					"See your sales associate to make a cash payment");
			ele = waitForElementPresent(Ok, 60);
			click(ele, "ok");
			// Accept CASH payment
			waitForElementPresent(AcceptcashPayment, 60);
			if (isElementPresent(AcceptcashPayment, "Accept Cash Payment")) {
				String dollarAmt = getText(Initialpayment, "Initialpayment")
						.trim();
				dollarAmt = dollarAmt.substring(1);
				type(UIFieldEditor, dollarAmt, "Enter Amount");
				click(DONE, "DONE");
				// Associate pin (5661)
				ele = waitForElementPresent(PIN, 60);
				type(ele, "1515", "Enter your associate PIN");
				click(ACCEPT, "ACCEPT");
				extentLogs.pass("Verify payment",
						"payment successfully processed");
			} else {
				extentLogs.fail(sdriver, "Verify payment",
						"payment not successfully processed");
			}
			// Skip autopay screen
			waitForElementPresent(SETUPAUTOPAY, 60);
			isElementPresent(makeyourmonthlypaymenttxt,
					"Now, choose how you would like to make your monthly payment");

			wait(3);
			sdriver.context("WEB");
			// click(FindElement(MobileLocator.ByXPath,"//*[@text='skip Autopay']",MIN_TO));
			if (sdriver.findElement(By.xpath("//*[@text='skip Autopay']"))
					.isDisplayed()) {
				extentLogs.pass("Verify skip Autopay Button",
						"skip Autopay button is Diaplayed");
			} else {
				extentLogs.fail("Verify skip Autopay Button",
						"skip Autopay button is not Diaplayed");
			}
			// isElementPresent(skipAutopay, "skip Autopay");
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			wait(6);
			click(SETUPAUTOPAY, "SET UP AUTOPAY");

			isElementPresent(Createausernamehe, "Create a user name");
			type(enterusername, genrateRandomUser(), "Enter username");
			click(CONTINUE, "CONTINUE");

			type(pwd, "Computer12", "Enter Password");
			type(Confirmpwd, "Computer12", "Enter Password");
			click(CONTINUEbu, "CONTINUE");

			// security question
			type(entervalue, "Hydera", "Enter Security question");

			click(CONTINUEbutton, "CONTINUE");

			click(CONTINUEbu, "CONTINUE");

			// what account

			isElementPresent(whataccount, "What account would you like to use");
			click(CreditDebitCard, "Credit/Debit Card");
			click(SETUPPAYMENT, "SET UP PAYMENT");

			// enter credit card info
			waitForElementPresent(ENTERMYINFO, 60);
			isElementPresent(Headeraccount, "Enter your info");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(Continuebtncard, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			type(ccn1, "1226", "Enter expiration date");
			click(Continuebtndate, "CONTINUE");

			// security code
			isElementPresent(Headeraccount, "What's the security code?");
			type(ccn1, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");

			// submit
			waitForElementPresent(AutoPayinformation, 60);
			isElementPresent(AutoPayinformation,
					"Please review your Auto Pay information");
			click(SUBMIT, "SUBMIT");
			wait(3);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_SelectPaymentDateBeforeQuote
	 * @return
	 * @throws
	 */
	public void Verify_SelectPaymentDateBeforeQuote() throws Exception {

		try {
			// part 4
			// initial Payment with CASH
			ele = waitForElementPresent(CASH, 60);
			isElementPresent(Header, "Let's set up your initial payment");
			click(ele, "CASH");
			isElementPresent(PopupPrompt,
					"See your sales associate to make a cash payment");
			ele = waitForElementPresent(Ok, 60);
			click(ele, "ok");
			// Accept CASH payment
			waitForElementPresent(AcceptcashPayment, 60);
			if (isElementPresent(AcceptcashPayment, "Accept Cash Payment")) {
				String dollarAmt = getText(Initialpayment, "Initialpayment")
						.trim();
				dollarAmt = dollarAmt.substring(1);
				type(UIFieldEditor, dollarAmt, "Enter Amount");
				click(DONE, "DONE");
				// Associate pin (5661)
				ele = waitForElementPresent(PIN, 60);
				type(ele, "1515", "Enter your associate PIN");
				click(ACCEPT, "ACCEPT");
				extentLogs.pass("Verify payment",
						"payment successfully processed");
			} else {
				extentLogs.fail(sdriver, "Verify payment",
						"payment not successfully processed");
			}
			// Skip autopay screen
			waitForElementPresent(SETUPAUTOPAY, 60);
			isElementPresent(makeyourmonthlypaymenttxt,
					"Now, choose how you would like to make your monthly payment");

			sdriver.context("WEB");
			// click(FindElement(MobileLocator.ByXPath,"//*[@text='skip Autopay']",MIN_TO));
			if (sdriver.findElement(By.xpath("//*[@text='skip Autopay']"))
					.isDisplayed()) {
				extentLogs.pass("Verify skip Autopay Button",
						"skip Autopay button is Diaplayed");
			} else {
				extentLogs.fail("Verify skip Autopay Button",
						"skip Autopay button is not Diaplayed");
			}
			// isElementPresent(skipAutopay, "skip Autopay");
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			wait(2);
			click(SETUPAUTOPAY, "SET UP AUTOPAY");

			isElementPresent(Createausernamehe, "Create a user name");
			type(enterusername, genrateRandomUser(), "Enter username");
			click(CONTINUE, "CONTINUE");

			type(pwd, "Computer12", "Enter Password");
			type(Confirmpwd, "Computer12", "Enter Password");
			click(CONTINUEbu, "CONTINUE");

			// security question
			type(entervalue, "Hydera", "Enter Security question");

			click(CONTINUEbutton, "CONTINUE");

			click(CONTINUEbu, "CONTINUE");

			// what account

			isElementPresent(whataccount, "What account would you like to use");
			click(CreditDebitCard, "Credit/Debit Card");
			click(SETUPPAYMENT, "SET UP PAYMENT");

			// enter credit card info
			waitForElementPresent(ENTERMYINFO, 60);
			isElementPresent(Headeraccount, "Enter your info");
			click(ENTERMYINFO, "ENTER MY INFO");
			// credit card information
			isElementPresent(debitcreditcardinforma,
					"Enter your debit/credit card information");
			type(ccn1, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn2, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn3, "5454", "Enter CREDIT/DEBIT CARD");
			type(ccn4, "5454", "Enter CREDIT/DEBIT CARD");
			click(Continuebtncard, "CONTINUE");
			// expire date

			isElementPresent(Headeraccount, "What's the expiration date?");
			type(ccn1, "1226", "Enter expiration date");
			click(Continuebtndate, "CONTINUE");

			// security code
			isElementPresent(Headeraccount, "What's the security code?");
			type(ccn1, "1234", "Enter security code");
			click(CONTINUEbutton, "CONTINUE");

			// submit
			waitForElementPresent(AutoPayinformation, 60);
			isElementPresent(AutoPayinformation,
					"Please review your Auto Pay information");
			click(SUBMIT, "SUBMIT");
			wait(3);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}