package com.mobile.automation.objectrepository;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
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

public class SchedulDeliverypage extends MobileActionLibrary {
	int MIN_TO = 5;
	int MED_TO = 15;
	int MAX_TO = 60;

	public SchedulDeliverypage(IOSDriver appiumDriver) {
		super((SeeTestIOSDriver) appiumDriver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	@iOSFindBy(accessibility = "Continue")
	public MobileElement Continue;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='CONTINUE']]")
	public MobileElement CONTINUE1;

	@iOSFindBy(accessibility = "CONTINUE")
	public MobileElement CONTINUE;

	@iOSFindBy(xpath = "//*[@text='CONTINUE' and ./parent::*[@accessibilityLabel='CONTINUE']]")
	public MobileElement CONTINUEPOP;

	@iOSFindBy(xpath = "//*[@text='CONTINUE']")
	public MobileElement Continuebut;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement AssociateLogin;

	@iOSFindBy(xpath = "//*[@text='SUBMIT']")
	public MobileElement SUBMIT;

	@iOSFindBy(accessibility = "createMyOrderButtonText")
	public MobileElement createMyOrderButtonText;

	@iOSFindBy(accessibility = "createMyOrderButton")
	public MobileElement createMyOrderButton;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Appliances']")
	public MobileElement Appliances;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Large Appliances']")
	public MobileElement LargeAppliances;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Ranges']")
	public MobileElement Ranges;

	@iOSFindBy(xpath = "(//*[@class='UIView' and ./parent::*[@class='VNHTMLAlertMessageView']]/*/*[@text='OK'])[2]")
	public MobileElement Okbutton;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Bosch']")
	public MobileElement Bosch;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Black']")
	public MobileElement Black;

	@iOSFindBy(xpath = "//*[@text='$0.00' and @class='UIFieldEditor']")
	public MobileElement amount;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='DONE']")
	public MobileElement DONE;

	@iOSFindBy(xpath = "//*[@text='DONE']")
	public MobileElement doneButtonText;

	@iOSFindBy(accessibility = "Enter your associate password.")
	public MobileElement Enteryourassociatepassword;

	@iOSFindBy(accessibility = "LOGIN")
	public MobileElement LOGIN;

	@iOSFindBy(accessibility = "Confirm Order")
	public MobileElement ConfirmOrder;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='success_small']")
	public MobileElement successsmall;

	@iOSFindBy(accessibility = "Enter your associate password  to confirm order.")
	public MobileElement Enteryourassociatepasswordtoconfirmorder;

	@iOSFindBy(xpath = "//*[@text='CONFIRM']")
	public MobileElement CONFIRM;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='2' and @textColor='0x5E6A78']")
	public MobileElement nextpayemnt;

	@iOSFindBy(accessibility = "Enter your associate PIN")
	public MobileElement PIN;

	@iOSFindBy(xpath = "(//*[@class='UIView' and ./parent::*[@class='VNHTMLAlertMessageView']]/*/*[@text='OK'])[2]")
	public MobileElement Ok;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Accept Cash Payment']")
	public MobileElement AcceptcashPayment;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement UIFieldEditor;

	@iOSFindBy(accessibility = "payWithCashButtonText")
	public MobileElement payWithCashButtonText;

	@iOSFindBy(accessibility = "setupAutoPayButton")
	public MobileElement setupAutoPayButton;

	@iOSFindBy(accessibility = "epayUserName")
	public MobileElement epayUserName;

	@iOSFindBy(accessibility = "passwordField")
	public MobileElement passwordField;

	@iOSFindBy(accessibility = "verifyPasswordField")
	public MobileElement verifyPasswordField;

	@iOSFindBy(accessibility = "securityAnswerField")
	public MobileElement securityAnswerField;

	@iOSFindBy(accessibility = "cashPaymentDoneButton")
	public MobileElement cashPaymentDoneButton;

	@iOSFindBy(accessibility = "newBankAccount")
	public MobileElement newBankAccount;

	@iOSFindBy(accessibility = "setupPaymentButtonText")
	public MobileElement setupPaymentButtonText;

	@iOSFindBy(accessibility = "bankAccountTypeSavings")
	public MobileElement bankAccountTypeSavings;

	@iOSFindBy(accessibility = "submitButtonText")
	public MobileElement submitButtonText;

	@iOSFindBy(xpath = "//*[@text='SELECT DELIVERY DATE']")
	public MobileElement selectDeliveryDate;

	@iOSFindBy(accessibility = "today_bg")
	public MobileElement today_bg;

	@iOSFindBy(accessibility = "Enter your associate password to continue.")
	public MobileElement Enteryourassociatepasswordtocontinue;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Delivery']")
	public MobileElement Delivery;

	@iOSFindBy(accessibility = "deliveryTypeDelivery")
	public MobileElement deliveryTypeDelivery;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='TODAY' and @top='true']")
	public MobileElement TODAY;

	@iOSFindBy(xpath = "//*[@text=' CONTINUE ']")
	public MobileElement Continuebtn;

	@iOSFindBy(xpath = "//*[@text='YES']")
	public MobileElement yesButtonText;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement invoiceNumberField;

	@iOSFindBy(accessibility = "salespersonField")
	public MobileElement salespersonField;

	@iOSFindBy(xpath = "//*[@text='DONE']")
	public MobileElement DONEbtn;

	@iOSFindBy(accessibility = "ACCEPT")
	public MobileElement ACCEPT;

	MobileElement ele;

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName SchedulDelivery
	 * @return
	 * @throws
	 */
	public void SchedulDelivery() throws Exception {
		try {
			// part 5
			// Select Delivery date screen
			// Select delivery date
			ele = waitForElementPresent(selectDeliveryDate, 60);
			click(ele, "selectDeliveryDate");

			type(Enteryourassociatepasswordtocontinue, "test",
					"Enter your associate password to continue");
			Thread.sleep(2000);

			click(SUBMIT, "selectDeliveryDate");
			// Schedule/pickup
			// click on date
			click(Delivery, "Delivery");
			Thread.sleep(2000);
			click(TODAY, "TODAY");
			Thread.sleep(2000);
			click(Continuebtn, "Continue Button");
			Thread.sleep(2000);
			// Schedule/pickup
			click(yesButtonText, "yesButtonText");
			// invoice details
			type(invoiceNumberField, "12345", "invoice Number Field");

			type(salespersonField, "Autosale", "sales person Field");

			click(DONEbtn, "doneButtonTextForInvoice");
			Thread.sleep(2000);
			type(UIFieldEditor, "test",
					"Enter your associate password to continue");
			Thread.sleep(2000);

			click(CONFIRM, "CONFIRM");
			Thread.sleep(2000);
			ele = waitForElementPresent(doneButtonText, 60);
			click(ele, "doneButtonText");
			wait(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName SchedulDeliveryforUnmanned
	 * @return
	 * @throws
	 */
	public void SchedulDeliveryforUnmanned() throws Exception {
		try {
			// part 5
			// Select Delivery date screen
			// Select delivery date
			ele = waitForElementPresent(selectDeliveryDate, 60);
			click(ele, "selectDeliveryDate");

			type(Enteryourassociatepasswordtocontinue, "test",
					"Enter your associate password to continue");
			// Thread.sleep(5000);

			click(SUBMIT, "selectDeliveryDate");
			// Schedule/pickup
			// click on date
			click(Delivery, "Delivery");
			// Thread.sleep(5000);
			click(TODAY, "TODAY");
			Thread.sleep(2000);
			click(Continuebtn, "Continue Button");
			Thread.sleep(2000);
			// Schedule/pickup
			click(yesButtonText, "yesButtonText");
			// invoice details
			/*
			 * type(invoiceNumberField, "12345", "invoice Number Field");
			 * 
			 * type(salespersonField, "Autosale", "sales person Field");
			 */
			click(DONEbtn, "doneButtonTextForInvoice");
			Thread.sleep(2000);
			type(UIFieldEditor, "test",
					"Enter your associate password to continue");
			Thread.sleep(2000);

			click(CONFIRM, "CONFIRM");
			Thread.sleep(2000);
			ele = waitForElementPresent(doneButtonText, 60);
			click(ele, "doneButtonText");
			wait(2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName donebutton
	 * @return
	 * @throws
	 */
	public void donebutton() throws Exception {
		try {
			ele = waitForElementPresent(doneButtonText, 60);
			click(ele, "doneButtonText");
			wait(2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}