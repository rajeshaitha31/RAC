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

public class Addorderpage extends MobileActionLibrary {
	int MIN_TO = 5;
	int MED_TO = 15;
	int MAX_TO = 60;

	public Addorderpage(IOSDriver appiumDriver) {
		super((SeeTestIOSDriver) appiumDriver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONTINUE']")
	public MobileElement continueButtonText;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@text='CONTINUE'])[2]")
	public MobileElement continueB;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[1]")
	public MobileElement continueButt;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[2]")
	public MobileElement continueButtre;

	@iOSFindBy(accessibility = "Continue")
	public MobileElement Continue;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='CONTINUE']]")
	public MobileElement CONTINUE1;

	@iOSFindBy(accessibility = "CONTINUE")
	public MobileElement CONTINUE;

	@iOSFindBy(xpath = "//*[@accessibilityLabel=' CONTINUE ']")
	public MobileElement Continuevaluedate;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONTINUE']")
	public MobileElement Continuevalued;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Initial Payment Details']")
	public MobileElement InitialPaymentDetails;

	@iOSFindBy(xpath = "//*[@text='CONTINUE' and ./parent::*[@accessibilityLabel='CONTINUE']]")
	public MobileElement CONTINUEPOP;

	@iOSFindBy(xpath = "//*[@text='CONTINUE']")
	public MobileElement Continuebut;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement AssociateLogin;

	@iOSFindBy(xpath = "//*[@text='SUBMIT']")
	public MobileElement SUBMIT;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Appliances']")
	public MobileElement Appliances;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Furniture']")
	public MobileElement Furniture;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Electronics']")
	public MobileElement Electronics;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Computers &Tablets']")
	public MobileElement ComputersTablets;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Stereos']")
	public MobileElement Stereos;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Portable Stereo']")
	public MobileElement PortableStereo;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='TVs']")
	public MobileElement TVs;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*[@accessibilityLabel='TVs'])[3]")
	public MobileElement TVsvalue;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='LCD TV']")
	public MobileElement LCDTV;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='LED TV']")
	public MobileElement LEDTV;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Plasma TV']")
	public MobileElement PlasmaTV;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='GameSystem']")
	public MobileElement Games;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='TV Accessories']")
	public MobileElement TVAccessories;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*[@accessibilityLabel='TV Accessories'])[1]")
	public MobileElement TVAccessoriesvalue;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Desktop']")
	public MobileElement Desktop;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Dryer']")
	public MobileElement Dryer;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Laptop']")
	public MobileElement Laptop;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Printer']")
	public MobileElement Printer;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Inkjet']")
	public MobileElement Inkjet;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Tablet']")
	public MobileElement Tablet;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Pick a brand.']")
	public MobileElement Pickabrand;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Pick a color.']")
	public MobileElement Pickacolor;

	@iOSFindBy(xpath = "//*[@class='UIWebBrowserView']")
	public MobileElement TVaccessorypopup;

	@iOSFindBy(xpath = "(//*[@class='UIView' and ./parent::*[@class='VNHTMLAlertMessageView']]/*/*[@text and @accessibilityLabel='OK'])[2]")
	public MobileElement OkPopup;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='CANCEL' and ./parent::*[@class='VNButton']]")
	public MobileElement CancelPopup;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Blu-Ray Player']")
	public MobileElement BluRayPlayer;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Add TV' and @class='UIButton']")
	public MobileElement AddTV;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='DVD Player']")
	public MobileElement DVDPlayer;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Home Theater']")
	public MobileElement HomeTheater;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Sound Bar']")
	public MobileElement SoundBar;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='TV Accessories']")
	public MobileElement SelectTVAccessories;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Dell']")
	public MobileElement Dell;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Apple']")
	public MobileElement Apple;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='LG']")
	public MobileElement LG;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement Screensize;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='3D TV']")
	public MobileElement threeDTV;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement StorageCapacity;

	@iOSFindBy(xpath = "//*[@accessibilityLabel=' GB' and ./parent::*[@accessibilityLabel='RAM SizeValue']]")
	public MobileElement Ramsize;

	@iOSFindBy(xpath = "//*[@accessibilityLabel=' GB' and ./parent::*[@accessibilityLabel='Drive SizeValue']]")
	public MobileElement DriveSizeValue;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Mouse']")
	public MobileElement Mouse;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='EXPLORE YOUR EARLY PURCHASE OPTION']")
	public MobileElement EXPLOREYOUREARLYPURCHASEOPTION;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='EARLY PURCHASE OPTION PAYMENT']")
	public MobileElement EARLYPURCHASEOPTIONPAYMENT;

	@iOSFindBy(xpath = "(//*[@class='UILabel'])[17]")
	public MobileElement epoamount;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='slider_button']")
	public MobileElement slider_button;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='BACK']")
	public MobileElement BACK;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='delete_icon']")
	public MobileElement delete_icon;

	@iOSFindBy(xpath = "(//*[@accessibilityLabel='REMOVE'])[1]")
	public MobileElement REMOVE;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='addorderitem_btn']")
	public MobileElement addorderitem_btn;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[2]")
	public MobileElement Continuevalue;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[1]")
	public MobileElement Continuevaluebtn;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Pick a department.']")
	public MobileElement department;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Pick a category.']")
	public MobileElement category;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Home Office']")
	public MobileElement HomeOffice;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Dining Room']")
	public MobileElement DiningRoom;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Living Room']")
	public MobileElement LivingRoom;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Bedroom']")
	public MobileElement Bedroom;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Storage']")
	public MobileElement Storage;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Bedroom Set']")
	public MobileElement Bedroomset;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Youth Bedroom Set']")
	public MobileElement YouthBedroomset;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Bed']")
	public MobileElement Bed;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Mattress/Box Spring']")
	public MobileElement MattressBoxSpring;

	@iOSFindBy(xpath = "//*[@text='Please note that a mattress must be ordered with a box spring.']")
	public MobileElement mattressmustbeorderedtxt;

	@iOSFindBy(xpath = "(//*[@accessibilityLabel='OK'])[3]")
	public MobileElement Okbtn;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='Full']")
	public MobileElement Full;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='King']")
	public MobileElement King;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='Twin']")
	public MobileElement Twin;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='Queen']")
	public MobileElement Queen;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='California King']")
	public MobileElement CaliforniaKing;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Chest/Armoire']")
	public MobileElement chestArmoire;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Dresser/Mirror']")
	public MobileElement DresserMirror;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Mattress/Box Spring']")
	public MobileElement MattressBox;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Nightstand']")
	public MobileElement Nightstand;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Waradrobe']")
	public MobileElement Waradrobe;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Junior Bed']")
	public MobileElement JuniorBed;

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

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Electric' and @class='VNCheckboxButton']")
	public MobileElement Electric;

	@iOSFindBy(xpath = "//*[@text='CONTINUE']")
	public MobileElement CONTINUEelectric;

	@iOSFindBy(xpath = "//*[@text='$0.00' and @class='UIFieldEditor']")
	public MobileElement amount;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='DONE']")
	public MobileElement DONE;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CANCEL' and @class='VNSecondaryButton']")
	public MobileElement CANCEL;
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='$0.00' and @class='UITextFieldLabel']")
	public MobileElement Extendwarranty;

	@iOSFindBy(xpath = "//*[@text='skip Autopay'")
	public MobileElement skipAutopay;

	@iOSFindBy(accessibility = "Power tools & Compressors")
	public MobileElement PowertoolsCompressors;

	@iOSFindBy(accessibility = "Power Tool")
	public MobileElement PowerTool;

	@iOSFindBy(accessibility = "Price")
	public MobileElement Price;

	@iOSFindBy(xpath = "//*[@text='DONE']")
	public MobileElement doneButtonText;

	@iOSFindBy(accessibility = "NO THANKS")
	public MobileElement NOTHANKS;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='ADD']")
	public MobileElement ADD;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Affordable monthly payments to get you to ownership!']")
	public MobileElement monthlypaymentsheader;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='Check other payment options']")
	public MobileElement otherpaymentoptions;

	@iOSFindBy(xpath = "(//*[@class='UILabel'])[13]")
	public MobileElement Nextpaymentdate;

	@iOSFindBy(xpath = "//*[@class='UIWebBrowserView']")
	public MobileElement Nextpaymentdateoptions;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='OK']")
	public MobileElement OK;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Initial Payment']")
	public MobileElement InitialPayment;

	@iOSFindBy(xpath = "xpath=//*[@accessibilityLabel='Monthly Renewal Payment']")
	public MobileElement MonthlyRenewalPayment;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Number of Months']")
	public MobileElement NumberofMonths;

	@iOSFindBy(accessibility = "reviewMyEstimate")
	public MobileElement reviewMyEstimate;

	@iOSFindBy(xpath = "(//*[@class='VNHeadline1Label'])[1]")
	public MobileElement Header;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Pay upfront with lower monthly payments']")
	public MobileElement Payupfrontwithlowermonthlypayments;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Add to monthly payments']")
	public MobileElement Addtomonthlypayments;

	@iOSFindBy(accessibility = "startMyApplication")
	public MobileElement startMyApplication;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONFIRM ORDER']")
	public MobileElement confirmbuttonOrderScreen;

	@iOSFindBy(xpath = "//*[@class='UITextFieldLabel' and ./parent::*[./preceding-sibling::*[@accessibilityLabel='Delivery Fee']]]")
	public MobileElement Deliveryfee;

	@iOSFindBy(accessibility = "LOGIN")
	public MobileElement LOGIN;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONFIRM ORDER']")
	public MobileElement ConfirmOrder;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='Confirm Order']")
	public MobileElement ConfirmOrdervalue;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='YES']")
	public MobileElement YES;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Delivery']")
	public MobileElement Delivery;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='today_bg']")
	public MobileElement today_bg;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='NO']")
	public MobileElement NO;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONFIRM ORDER']")
	public MobileElement CONFIRMORDER;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='success_small']")
	public MobileElement successsmall;

	@iOSFindBy(accessibility = "Enter your associate password  to confirm order.")
	public MobileElement Enteryourassociatepasswordtoconfirmorder;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Enter your associate password.']")
	public MobileElement Enteryourassociatepassword;

	@iOSFindBy(xpath = "//*[@text='CONFIRM']")
	public MobileElement CONFIRM;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='LOGOUT']")
	public MobileElement LOGOUT;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='REVIEW MY AGREEMENT']")
	public MobileElement REVIEWMYAGREEMENT;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='secondPaymentDate']]")
	public MobileElement secondPaymentDate;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='defaultNextPaymentDate']]")
	public MobileElement defaultNextPaymentDate;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='2' and @textColor='0x5E6A78']")
	public MobileElement nextpayemnt;

	@iOSFindBy(accessibility = "reviewMyAgreementButtonText")
	public MobileElement reviewMyAgreementButtonText;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Enter your associate PIN']")
	public MobileElement PIN;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement invoiceNumberField;

	@iOSFindBy(accessibility = "ACCEPT")
	public MobileElement ACCEPT;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement Enteryourassociatelogin;

	MobileElement ele;

	Agreementspage agp = new Agreementspage(this.sdriver);

	Getapprovedpage gp = new Getapprovedpage(this.sdriver);

	/**
	 * @author @Cigniti
	 * @parameter   Addordertype,  
	 * @MethodName SelectcaseAddorders
	 * @return
	 * @throws 
	 */
	public boolean SelectcaseAddorders(String Addordertype) throws Exception {
		try{
		// Select Addorders Type
		switch (Addordertype) {
		case "Appliances":
			if (isElementPresent(Appliances, "Appliances")) {
				ele = waitForElementPresent(Appliances, 60, "Appliances");
				click(ele, "Appliances");

				// create my order
				ele = waitForElementPresent(LargeAppliances, 60,
						"Large Appliances");
				click(ele, "Large Appliances");

				//
				ele = waitForElementPresent(Ranges, 60, "Ranges");
				clear(ele, "Ranges");
				click(Okbutton, "OK");

				click(Bosch, "Bosch");

				click(Black, "Black");

				click(Electric, "Electric");

				click(CONTINUEelectric, "CONTINUE");

				click(Electric, "Electric");

				type(amount, "60000", "amount");

				click(DONE, "DONE");
			}
			break;
		case "Furniture":
			if (isElementPresent(department, "Pick a department.")) {
				click(Furniture, "Furniture");

				// create my order

				isElementPresent(category, "Pick a category.");
				click(Bedroom, "Bedroom");

				isElementPresent(Bed, "Bed");
				click(Bed, "Bed");

				isElementPresent(JuniorBed, "Junior Bed");
				click(JuniorBed, "Junior Bed");

				type(amount, "30000", "amount");
				click(DONE, "DONE");
			}
			break;
		}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return DriverNoResetFlag;
	}
	
	/**
	 * @author @Cigniti
	 * @parameter   Addordertype,  
	 * @MethodName SelectcasesAddorders
	 * @return
	 * @throws 
	 */
	public void SelectcasesAddorders(String Addordertype) throws Exception {
		try{
		SelectcaseAddorders(Addordertype);
		Conformorder();
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}
	
	
	
	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName ClickOncancel
	 * @return
	 * @throws 
	 */
	public void ClickOncancel() throws Exception {
		try{
		ele = waitForElementPresent(CANCEL, 60);
		click(ele, "CANCEL");
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}
	
	
	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: Conformorder
	 * @return
	 * @throws 
	 */
	public void Conformorder() throws Exception {
	try{		
	ele = waitForElementPresent(CONTINUE, 60);
	click(ele, "CONTINUE");

	ele = waitForElementPresent(NOTHANKS, 60);
	click(ele, "NO THANKS");

	ele = waitForElementPresent(reviewMyEstimate, 60,
			"Review My Estimate");
	click(ele, "Review My Estimate");

	ele = waitForElementPresent(startMyApplication, 60,
			"start My Application");
	click(ele, "start My Application");
	wait(2);
	isElementPresent(confirmbuttonOrderScreen, "Confirm Order");
	ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
			"Confirm button Order Screen");
	click(ele, "confirm button Order Screen");

	// Associate Login
	ele = waitForElementPresent(AssociateLogin, 60);

	type(ele, "test", "Associate Login");
	click(SUBMIT, "SUBMIT");

	// Dashboard Confirm order
	wait(3);
	isElementPresent(ConfirmOrdervalue, "Confirm Order");
	ele = waitForElementPresent(ConfirmOrdervalue, 60);
	click(ele, "Confirm Order");

	// Associate Password (5661)
	ele = waitForElementPresent(
			Enteryourassociatepasswordtoconfirmorder, 60);
	type(ele, "test", "Enter your associate password");

	click(CONFIRM, "CONFIRM");

	// Please select next payment date (change date later)

	// stroe 5661

	/*
	 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
	 * 
	 * click(ele, "CONTINUE");
	 * 
	 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
	 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
	 * "Initial Payment Details"); click(ele, "CONTINUE");
	 */

	// store 9660

	ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
			"REVIEW MY AGREEMENT");

	click(ele, "REVIEW MY AGREEMENT");

	type(PIN, "1515", "Enter your associate PIN");

	click(CONTINUEPOP, "CONTINUE");
	} catch (Exception e) {
		e.printStackTrace();		
	}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: Addorders
	 * @return
	 * @throws 
	 */
	public boolean Addorders() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// create my order
		if (isElementPresent(Appliances, "Appliances")) {
			ele = waitForElementPresent(Appliances, 60, "Appliances");
			click(ele, "Appliances");

			// create my order
			ele = waitForElementPresent(LargeAppliances, 60, "Large Appliances");
			click(ele, "Large Appliances");

			//
			ele = waitForElementPresent(Ranges, 60, "Ranges");
			clear(ele, "Ranges");
			click(Okbutton, "OK");

			click(Bosch, "Bosch");

			click(Black, "Black");

			click(Electric, "Electric");

			click(CONTINUEelectric, "CONTINUE");

			click(Electric, "Electric");

			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			ele = waitForElementPresent(startMyApplication, 60,
					"start My Application");
			click(ele, "start My Application");
			wait(2);
			isElementPresent(confirmbuttonOrderScreen, "Confirm Order");
			ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
					"Confirm button Order Screen");
			click(ele, "confirm button Order Screen");

			// Associate Login
			ele = waitForElementPresent(AssociateLogin, 60);

			type(ele, "test", "Associate Login");
			click(SUBMIT, "SUBMIT");

			// Dashboard Confirm order
			wait(3);
			isElementPresent(ConfirmOrdervalue, "Confirm Order");
			ele = waitForElementPresent(ConfirmOrdervalue, 60);
			click(ele, "Confirm Order");

			// Associate Password (5661)
			ele = waitForElementPresent(
					Enteryourassociatepasswordtoconfirmorder, 60);
			type(ele, "test", "Enter your associate password");

			click(CONFIRM, "CONFIRM");

			// Please select next payment date (change date later)

			// stroe 5661

			/*
			 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
			 * 
			 * click(ele, "CONTINUE");
			 * 
			 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
			 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
			 * "Initial Payment Details"); click(ele, "CONTINUE");
			 */

			// store 9660

			ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
					"REVIEW MY AGREEMENT");

			click(ele, "REVIEW MY AGREEMENT");

			type(PIN, "1515", "Enter your associate PIN");

			click(CONTINUEPOP, "CONTINUE");

			extentLogs.pass("Verify Add Order", "Completed Add Order");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Verify Add Order",
					"Add Order Failed");
			return false;
		}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return DriverNoResetFlag;
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: Addorderselectric
	 * @return
	 * @throws 
	 */
	public void Addorderselectric() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// create my order
		ele = waitForElementPresent(Appliances, 60, "Appliances");
		click(ele, "Appliances");

		// create my order
		ele = waitForElementPresent(LargeAppliances, 60, "Large Appliances");
		click(ele, "Large Appliances");

		//
		ele = waitForElementPresent(Ranges, 60, "Ranges");
		clear(ele, "Ranges");
		click(Okbutton, "OK");

		click(Bosch, "Bosch");

		click(Black, "Black");

		click(Electric, "Electric");

		click(CONTINUEelectric, "CONTINUE");

		click(Electric, "Electric");

		type(amount, "60000", "amount");

		click(DONE, "DONE");

		ele = waitForElementPresent(CONTINUE, 60);
		click(ele, "CONTINUE");

		ele = waitForElementPresent(NOTHANKS, 60);
		click(ele, "NO THANKS");

		ele = waitForElementPresent(reviewMyEstimate, 60, "Review My Estimate");
		click(ele, "Review My Estimate");

		ele = waitForElementPresent(startMyApplication, 60,
				"start My Application");
		click(ele, "start My Application");

		ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
				"Confirm button Order Screen");
		click(ele, "confirm button Order Screen");

		// Associate Login
		ele = waitForElementPresent(Enteryourassociatelogin, 60);

		type(ele, "U66201xteam", "Enter your associate Login");
		click(SUBMIT, "SUBMIT");

		// Dashboard Confirm order
		Thread.sleep(1000);
		isElementPresent(ConfirmOrder, "Confirm Order");
		ele = waitForElementPresent(ConfirmOrder, 60);
		click(ele, "Confirm Order");

		// Associate Password (5661)

		// Please select next payment date (change date later)

		// stroe 5661

		/*
		 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
		 * 
		 * click(ele, "CONTINUE");
		 * 
		 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
		 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
		 * "Initial Payment Details"); click(ele, "CONTINUE");
		 */

		// store 9660

		click(YES, "YES");
		wait(3);
		type(Enteryourassociatelogin, "U66201xteam",
				"Enter your associate Login");
		click(CONFIRM, "CONFIRM");

		wait(3);

		ele = waitForElementPresent(Delivery, 60);

		click(ele, "Delivery");

		click(today_bg, "today date");
		wait(1);
		click(Continuevaluedate, "CONTINUE");
		wait(3);
		click(YES, "YES");
		wait(3);
		ele = waitForElementPresent(Continuevalued, 60);
		click(ele, "CONTINUE");
		wait(2);
		ele = waitForElementPresent(Continuevalued, 60);
		click(ele, "CONTINUE");
		waitForElementPresent(PIN, 60);
		type(PIN, "1515", "Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");

		/*
		 * ele = waitForElementPresent(REVIEWMYAGREEMENT,
		 * 60,"REVIEW MY AGREEMENT");
		 * 
		 * click(ele, "REVIEW MY AGREEMENT");
		 */

		/*
		 * type(PIN, "1515","Enter your associate PIN");
		 * 
		 * click(CONTINUEPOP, "CONTINUE");
		 */
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: AddordersAppliances
	 * @return
	 * @throws 
	 */
	public void AddordersAppliances() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// create my order

		ele = waitForElementPresent(Appliances, 60, "Appliances");
		click(ele, "Appliances");

		// create my order
		ele = waitForElementPresent(LargeAppliances, 60, "Large Appliances");
		click(ele, "Large Appliances");

		//
		ele = waitForElementPresent(Ranges, 60, "Ranges");
		click(ele, "Ranges");
		click(Okbutton, "OK");

		click(Bosch, "Bosch");

		click(Black, "Black");

		click(Electric, "Electric");

		click(CONTINUEelectric, "CONTINUE");

		click(Electric, "Electric");

		type(amount, "60000", "amount");

		click(DONE, "DONE");

		ele = waitForElementPresent(CONTINUE, 60);
		click(ele, "CONTINUE");

		ele = waitForElementPresent(NOTHANKS, 60);
		click(ele, "NO THANKS");

		ele = waitForElementPresent(reviewMyEstimate, 60, "Review My Estimate");
		click(ele, "Review My Estimate");

		ele = waitForElementPresent(startMyApplication, 60,
				"start My Application");
		click(ele, "start My Application");
		wait(6);
		ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
				"Confirm button Order Screen");
		click(ele, "confirm button Order Screen");
		wait(6);
		Thread.sleep(5000);
		// Associate Login
		ele = waitForElementPresent(Enteryourassociatelogin, 60);

		type(ele, "U66201xteam", "Enter your associate Login");
		click(SUBMIT, "SUBMIT");

		// Dashboard Confirm order
		Thread.sleep(1000);
		isElementPresent(ConfirmOrdervalue, "Confirm Order");
		ele = waitForElementPresent(ConfirmOrdervalue, 60);
		click(ele, "Confirm Order");

		// Associate Password (5661)

		// Please select next payment date (change date later)

		// stroe 5661

		/*
		 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
		 * 
		 * click(ele, "CONTINUE");
		 * 
		 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
		 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
		 * "Initial Payment Details"); click(ele, "CONTINUE");
		 */

		// store 9660

		click(YES, "YES");
		wait(3);
		type(Enteryourassociatelogin, "U66201xteam",
				"Enter your associate Login");
		click(CONFIRM, "CONFIRM");

		wait(3);

		/*
		 * ele = waitForElementPresent(Delivery, 60);
		 * 
		 * click(ele, "Delivery");
		 * 
		 * click(today_bg, "today date"); wait(1); click(Continuevaluedate,
		 * "CONTINUE"); wait(3); click(YES,"YES"); wait(3); ele =
		 * waitForElementPresent(Continuevalued, 60); click(ele, "CONTINUE");
		 * wait(2); ele = waitForElementPresent(Continuevalued, 60); click(ele,
		 * "CONTINUE"); waitForElementPresent(PIN, 60); type(PIN,
		 * "1515","Enter your associate PIN");
		 * 
		 * click(CONTINUEPOP, "CONTINUE");
		 */

		/*
		 * ele = waitForElementPresent(REVIEWMYAGREEMENT,
		 * 60,"REVIEW MY AGREEMENT");
		 * 
		 * click(ele, "REVIEW MY AGREEMENT");
		 */

		/*
		 * type(PIN, "1515","Enter your associate PIN");
		 * 
		 * click(CONTINUEPOP, "CONTINUE");
		 */
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: EditorderinDashboard
	 * @return
	 * @throws 
	 */
	public void EditorderinDashboard() throws Exception {
		try{
		wait(5);
		isElementPresent(ConfirmOrdervalue, "Confirm Order");
		ele = waitForElementPresent(ConfirmOrdervalue, 60);
		click(ele, "Confirm Order");
		isElementPresent(YES, "YES");
		click(YES, "YES");
		wait(3);
		isElementPresent(CONFIRM, "CONFIRM");
		click(CONFIRM, "CONFIRM");

		isElementPresent(Enteryourassociatelogin, "Alert PopUp");
		type(Enteryourassociatelogin, "U66201xanow",
				"Enter your associate Login");
		click(CONFIRM, "CONFIRM");
		wait(5);
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: LOGOUT
	 * @return
	 * @throws 
	 */
	public void LOGOUT() throws Exception {
		try{
			wait(5);
		click(LOGOUT, "LOGOUT");
		wait(4);
		} catch (Exception e) {
			e.printStackTrace();		
		}
		}

	
	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: Continuedelviery
	 * @return
	 * @throws 
	 */
	public void Continuedelviery() throws Exception {
		try{
		ele = waitForElementPresent(Delivery, 60);
		click(ele, "Delivery");
		click(today_bg, "today date");
		wait(1);
		click(Continuevaluedate, "CONTINUE");
		wait(3);
		click(YES, "YES");
		wait(3);
		ele = waitForElementPresent(Continuevalued, 60);
		click(ele, "CONTINUE");
		wait(2);
		ele = waitForElementPresent(Continuevalued, 60);
		click(ele, "CONTINUE");
		waitForElementPresent(PIN, 60);
		type(PIN, "1515", "Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: AddorderTV
	 * @return
	 * @throws 
	 */
	public void AddorderTV() throws Exception {
		try{
			// Part 2
		// Pick a department and add order

		// Add tvs
		ele = waitForElementPresent(Electronics, 60, "Electronics");
		click(ele, "Electronics");

		isElementPresent(category, "Pick a category.");
		click(TVs, "TVs");

		isElementPresent(LCDTV, "LCDTV");
		isElementPresent(LEDTV, "LEDTV");
		isElementPresent(PlasmaTV, "PlasmaTV");
		isElementPresent(TVAccessories, "TVAccessories");

		click(LCDTV, "LCDTV");
		isElementPresent(Pickabrand, "Pick a brand");
		click(LG, "LG");
		type(Screensize, "50", "Screen size Inches");
		click(threeDTV, "3D TV");

		click(Continuebut, "Continue");

		type(amount, "60000", "amount");

		click(DONE, "DONE");

		ele = waitForElementPresent(CONTINUE, 60);
		click(ele, "CONTINUE");

		ele = waitForElementPresent(NOTHANKS, 60);
		click(ele, "NO THANKS");

		ele = waitForElementPresent(reviewMyEstimate, 60, "Review My Estimate");
		click(ele, "Review My Estimate");

		ele = waitForElementPresent(startMyApplication, 60,
				"start My Application");
		click(ele, "start My Application");
		wait(4);
		ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
				"Confirm button Order Screen");
		click(ele, "confirm button Order Screen");
		wait(2);
		// Associate Login
		ele = waitForElementPresent(AssociateLogin, 60);

		type(ele, "test", "Associate Login");
		click(SUBMIT, "Continue Button");

		// Dashboard Confirm order
		Thread.sleep(2000);
		wait(2);
		isElementPresent(ConfirmOrdervalue, "Confirm Order");
		ele = waitForElementPresent(ConfirmOrdervalue, 60);
		click(ele, "Confirm Order");

		// Associate Password (5661)
		type(Enteryourassociatepasswordtoconfirmorder, "test",
				"Enter your associate password");

		click(CONFIRM, "CONFIRM");

		// Please select next payment date (change date later)

		// stroe 5661

		/*
		 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
		 * 
		 * click(ele, "CONTINUE");
		 * 
		 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
		 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
		 * "Initial Payment Details"); click(ele, "CONTINUE");
		 */

		// store 9660

		ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
				"REVIEW MY AGREEMENT");

		click(ele, "REVIEW MY AGREEMENT");

		type(PIN, "1515", "Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: clickonReviewmyagreement
	 * @return
	 * @throws 
	 */
	public void clickonReviewmyagreement() throws Exception {
		try{
		ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
				"REVIEW MY AGREEMENT");

		click(secondPaymentDate, "second PaymentDate");
		click(ele, "REVIEW MY AGREEMENT");

		wait(2);
		ele = waitForElementPresent(PIN, 60);

		type(ele, "1515", "Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	
	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: AddorderDesktop
	 * @return
	 * @throws 
	 */
	public void AddorderDesktop() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// Add tvs

		if (isElementPresent(department, "Pick a department.")) {
			click(Electronics, "Electronics");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(ComputersTablets, "Computers&Tablets");

			isElementPresent(Desktop, "Desktop");
			click(Desktop, "Desktop");

			isElementPresent(Pickabrand, "Pick a brand");
			click(Dell, "Dell");
			type(Screensize, "15", "Screen size");

			type(Ramsize, "5", "Ram size");

			type(DriveSizeValue, "500", "Drive Size");
			sdriver.closeKeyboard();
			click(Continuebut, "Continue");

			click(Mouse, "Mouse");
			click(Continuevalue, "Continue");

			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			// Dashboard Confirm order
			Thread.sleep(1000);
			isElementPresent(ConfirmOrdervalue, "Confirm Order");
			ele = waitForElementPresent(ConfirmOrdervalue, 60);
			click(ele, "Confirm Order");

			ele = waitForElementPresent(
					Enteryourassociatepasswordtoconfirmorder, 60);
			// Associate Password (5661)
			type(ele, "test", "Enter your associate password");

			click(CONFIRM, "CONFIRM");
			wait(5);
			click(LOGOUT, "LOGOUT");
			wait(4);
			// Please select next payment date (change date later)

			// stroe 5661

			/*
			 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
			 * 
			 * click(ele, "CONTINUE");
			 * 
			 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
			 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
			 * "Initial Payment Details"); click(ele, "CONTINUE");
			 */

			// store 9660
		}
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: AddorderDryer
	 * @return
	 * @throws 
	 */
	public void AddorderDryer() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// Add tvs

		if (isElementPresent(department, "Pick a department.")) {
			click(Appliances, "Appliances");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(LargeAppliances, "Large Appliances");

			isElementPresent(Dryer, "Dryer");
			click(Dryer, "Dryer");

			isElementPresent(Pickabrand, "Pick a brand");
			click(LG, "LG");

			isElementPresent(Pickacolor, "Pick a color");
			click(Black, "Black");
			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			// Dashboard Confirm order
			Thread.sleep(1000);
			isElementPresent(ConfirmOrder, "Confirm Order");
			ele = waitForElementPresent(ConfirmOrder, 60);
			click(ele, "Confirm Order");

			// Associate Password (5661)
			ele = waitForElementPresent(
					Enteryourassociatepasswordtoconfirmorder, 60);
			// Associate Password (5661)
			type(ele, "test", "Enter your associate password");

			click(CONFIRM, "CONFIRM");
			// Please select next payment date (change date later)

			// stroe 5661

			/*
			 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
			 * 
			 * click(ele, "CONTINUE");
			 * 
			 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
			 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
			 * "Initial Payment Details"); click(ele, "CONTINUE");
			 */

			// store 9660

		}
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: AddorderTVagain
	 * @return
	 * @throws 
	 */
	public void AddorderTVagain() throws Exception {
		try{
		ele = waitForElementPresent(CONTINUE, 60);
		click(ele, "CONTINUE");

		ele = waitForElementPresent(NOTHANKS, 60);
		click(ele, "NO THANKS");

		ele = waitForElementPresent(reviewMyEstimate, 60, "Review My Estimate");
		click(ele, "Review My Estimate");

		ele = waitForElementPresent(startMyApplication, 60,
				"start My Application");
		click(ele, "start My Application");

		wait(5);
		ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
				"Confirm button Order Screen");
		click(ele, "confirm button Order Screen");

		// Associate Login
		ele = waitForElementPresent(AssociateLogin, 60);

		type(ele, "test", "Associate Login");
		click(SUBMIT, "Continue Button");

		// Dashboard Confirm order
		Thread.sleep(2000);
		isElementPresent(ConfirmOrdervalue, "Confirm Order");
		ele = waitForElementPresent(ConfirmOrdervalue, 60);
		click(ele, "Confirm Order");

		// Associate Password (5661)
		ele = waitForElementPresent(Enteryourassociatepasswordtoconfirmorder,
				60);
		// Associate Password (5661)
		type(ele, "test", "Enter your associate password");

		click(CONFIRM, "CONFIRM");

		// Please select next payment date (change date later)

		// stroe 5661

		/*
		 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
		 * 
		 * click(ele, "CONTINUE");
		 * 
		 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
		 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
		 * "Initial Payment Details"); click(ele, "CONTINUE");
		 */

		// store 9660

		ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
				"REVIEW MY AGREEMENT");

		click(ele, "REVIEW MY AGREEMENT");

		type(PIN, "1515", "Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: verifyDelevieryoptions
	 * @return
	 * @throws 
	 */
	public void verifyDelevieryoptions() throws Exception {
		try{
		isElementPresent(Deliveryfee, "Delivery fee");
		type(Deliveryfee, "11.10", "Delivery fee");
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: SelectDepartments
	 * @return
	 * @throws 
	 */
	public void SelectDepartments() throws Exception {
		try{
		// create my order
		if (isElementPresent(department, "Pick a department.")) {
			click(Furniture, "Furniture");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(Bedroom, "Bedroom");

			isElementPresent(Bed, "Bed");
			click(Bed, "Bed");

			isElementPresent(JuniorBed, "Junior Bed");
			click(JuniorBed, "Junior Bed");

			type(amount, "30000", "amount");
			click(DONE, "DONE");
		}
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: ReviewMyEstimate
	 * @return
	 * @throws 
	 */
	public void ReviewMyEstimate() throws Exception {
		try{
		if (isElementPresent(reviewMyEstimate, "Review My Estimate")) {
			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			String nextpaymentdate = getText(Nextpaymentdate, "Nextpaymentdate");
			if (nextpaymentdate != null) {
				extentLogs.pass("Verify Next payment date",
						"Next payment date:" + nextpaymentdate);
			} else {
				extentLogs.fail(sdriver, "Verify  Next payment date",
						"Next payment date is not Diaplayed");
			}
			click(otherpaymentoptions, "Check other payment options");
			String threepaymentoptions = getText(Nextpaymentdateoptions,
					"Three payment options should be displayed.");
			if (threepaymentoptions != null) {
				extentLogs.pass("Verify Three payment options",
						"Three payment options should be displayed, Three payment options:"
								+ threepaymentoptions);
			} else {
				extentLogs.fail(sdriver, "Verify  Three payment options",
						"Three payment options is not Diaplayed");
			}
			click(OK, "OK");
			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			extentLogs.pass("Verify Select Payment Date Before Quote",
					"Select Payment Date Before Quote successfully verified");
		} else {
			extentLogs
					.fail(sdriver, "Verify  Next payment date",
							"Select Payment Date Before Quote not successfully verified");
		}

		ele = waitForElementPresent(startMyApplication, 60,
				"start My Application");
		click(ele, "start My Application");

		ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
				"Confirm button Order Screen");
		click(ele, "confirm button Order Screen");

		// Associate Login
		ele = waitForElementPresent(AssociateLogin, 60);

		type(ele, "test", "Associate Login");
		click(SUBMIT, "Continue Button");

		// Dashboard Confirm order
		Thread.sleep(1000);
		isElementPresent(ConfirmOrder, "Confirm Order");
		ele = waitForElementPresent(ConfirmOrder, 60);
		click(ele, "Confirm Order");

		// Associate Password (5661)
		ele = waitForElementPresent(Enteryourassociatepasswordtoconfirmorder,
				60);
		// Associate Password (5661)
		type(ele, "test", "Enter your associate password");

		click(CONFIRM, "CONFIRM");

		// Please select next payment date (change date later)

		// stroe 5661

		/*
		 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
		 * 
		 * click(ele, "CONTINUE");
		 * 
		 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
		 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
		 * "Initial Payment Details"); click(ele, "CONTINUE");
		 */

		// store 9660

		ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
				"REVIEW MY AGREEMENT");

		click(ele, "REVIEW MY AGREEMENT");

		type(PIN, "1515", "Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");
		} catch (Exception e) {
			e.printStackTrace();		
		}
		}

	
	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: verifyESV
	 * @return
	 * @throws 
	 */
	public void verifyESV() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// create my order
		if (isElementPresent(department, "Pick a department.")) {
			click(Furniture, "Furniture");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(Bedroom, "Bedroom");

			isElementPresent(Bed, "Bed");
			click(Bed, "Bed");

			isElementPresent(JuniorBed, "Junior Bed");
			click(JuniorBed, "Junior Bed");

			type(amount, "30000", "amount");
			click(DONE, "DONE");
			isElementPresent(Extendwarranty, "Extended Warranty");
			type(Extendwarranty, "11.10", "Extended Warranty");
			click(CONTINUE, "CONTINUE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");
			wait(3);
			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			String nextpaymentdate = getText(Nextpaymentdate, "Nextpaymentdate");
			if (nextpaymentdate != null) {
				extentLogs.pass("Verify Next payment date",
						"Next payment date:" + nextpaymentdate);
			} else {
				extentLogs.fail(sdriver, "Verify  Next payment date",
						"Next payment date is not Diaplayed");
			}
			click(otherpaymentoptions, "Check other payment options");
			String threepaymentoptions = getText(Nextpaymentdateoptions,
					"Three payment options should be displayed.");
			if (threepaymentoptions != null) {
				extentLogs.pass("Verify Three payment options",
						"Three payment options should be displayed, Three payment options:"
								+ threepaymentoptions);
			} else {
				extentLogs.fail(sdriver, "Verify  Three payment options",
						"Three payment options is not Diaplayed");
			}
			click(OK, "OK");
			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			extentLogs.pass("Verify Select Payment Date Before Quote",
					"Select Payment Date Before Quote successfully verified");
		} else {
			extentLogs
					.fail(sdriver, "Verify  Next payment date",
							"Select Payment Date Before Quote not successfully verified");
		}

		ele = waitForElementPresent(startMyApplication, 60,
				"start My Application");
		click(ele, "start My Application");
		wait(3);
		ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
				"Confirm button Order Screen");
		click(ele, "confirm button Order Screen");
		wait(4);
		// Associate Login
		ele = waitForElementPresent(AssociateLogin, 60);

		type(ele, "test", "Associate Login");
		click(SUBMIT, "Continue Button");

		// Dashboard Confirm order
		Thread.sleep(1000);
		isElementPresent(ConfirmOrdervalue, "Confirm Order");
		ele = waitForElementPresent(ConfirmOrdervalue, 60);
		click(ele, "Confirm Order");

		// Associate Password (5661)
		wait(2);

		ele = waitForElementPresent(Enteryourassociatepasswordtoconfirmorder,
				60);
		type(ele, "test", "Enter your associate password");

		click(CONFIRM, "CONFIRM");

		// Please select next payment date (change date later)

		// stroe 5661

		/*
		 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
		 * 
		 * click(ele, "CONTINUE");
		 * 
		 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
		 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
		 * "Initial Payment Details"); click(ele, "CONTINUE");
		 */

		// store 9660

		ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
				"REVIEW MY AGREEMENT");
		click(defaultNextPaymentDate, "Default Next Payment Date");
		click(ele, "REVIEW MY AGREEMENT");

		type(PIN, "1515", "Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: verifyorders
	 * @return
	 * @throws 
	 */
	public void verifyorders() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// create my order
		click(OK, "OK");
		if (isElementPresent(department, "Pick a department.")) {
			click(Furniture, "Furniture");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(Bedroom, "Bedroom");

			isElementPresent(Bed, "Bed");
			click(Bed, "Bed");

			isElementPresent(JuniorBed, "Junior Bed");
			click(JuniorBed, "Junior Bed");

			type(amount, "30000", "amount");
			click(DONE, "DONE");
			isElementPresent(Extendwarranty, "Extended Warranty");
			type(Extendwarranty, "11.10", "Extended Warranty");
			click(CONTINUE, "CONTINUE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			/*
			 * ele = waitForElementPresent(NOTHANKS, 60); click(ele,
			 * "NO THANKS");
			 */
			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");
			wait(3);
			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			String nextpaymentdate = getText(Nextpaymentdate, "Nextpaymentdate");
			if (nextpaymentdate != null) {
				extentLogs.pass("Verify Next payment date",
						"Next payment date:" + nextpaymentdate);
			} else {
				extentLogs.fail(sdriver, "Verify  Next payment date",
						"Next payment date is not Diaplayed");
			}
			click(otherpaymentoptions, "Check other payment options");
			String threepaymentoptions = getText(Nextpaymentdateoptions,
					"Three payment options should be displayed.");
			if (threepaymentoptions != null) {
				extentLogs.pass("Verify Three payment options",
						"Three payment options should be displayed, Three payment options:"
								+ threepaymentoptions);
			} else {
				extentLogs.fail(sdriver, "Verify  Three payment options",
						"Three payment options is not Diaplayed");
			}
			click(OK, "OK");
			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			extentLogs.pass("Verify Select Payment Date Before Quote",
					"Select Payment Date Before Quote successfully verified");
		} else {
			extentLogs
					.fail(sdriver, "Verify  Next payment date",
							"Select Payment Date Before Quote not successfully verified");
		}

		ele = waitForElementPresent(startMyApplication, 60,
				"start My Application");
		click(ele, "start My Application");
		wait(3);
		ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
				"Confirm button Order Screen");
		click(ele, "confirm button Order Screen");

		// Associate Login
		ele = waitForElementPresent(AssociateLogin, 60);

		type(ele, "test", "Associate Login");
		click(SUBMIT, "Continue Button");

		// Dashboard Confirm order
		Thread.sleep(1000);
		isElementPresent(ConfirmOrdervalue, "Confirm Order");
		ele = waitForElementPresent(ConfirmOrdervalue, 60);
		click(ele, "Confirm Order");

		// Associate Password (5661)
		wait(2);

		ele = waitForElementPresent(Enteryourassociatepasswordtoconfirmorder,
				60);
		type(ele, "test", "Enter your associate password");

		click(CONFIRM, "CONFIRM");

		// Please select next payment date (change date later)

		// stroe 5661

		/*
		 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
		 * 
		 * click(ele, "CONTINUE");
		 * 
		 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
		 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
		 * "Initial Payment Details"); click(ele, "CONTINUE");
		 */

		// store 9660

		/*
		 * ele = waitForElementPresent(REVIEWMYAGREEMENT,
		 * 60,"REVIEW MY AGREEMENT"); click(defaultNextPaymentDate,
		 * "Default Next Payment Date"); click(ele, "REVIEW MY AGREEMENT");
		 * 
		 * type(PIN, "1515","Enter your associate PIN");
		 * 
		 * click(CONTINUEPOP, "CONTINUE");
		 */
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: verifyDeleveryfee
	 * @return
	 * @throws 
	 */
	public void verifyDeleveryfee() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// create my order
		if (isElementPresent(department, "Pick a department.")) {
			click(Furniture, "Furniture");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(Bedroom, "Bedroom");

			isElementPresent(Bed, "Bed");
			click(Bed, "Bed");

			isElementPresent(JuniorBed, "Junior Bed");
			click(JuniorBed, "Junior Bed");

			type(amount, "30000", "amount");
			click(DONE, "DONE");
			isElementPresent(Deliveryfee, "Delivery fee");
			type(Deliveryfee, "11.10", "Delivery fee");
			click(CONTINUE, "CONTINUE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			String nextpaymentdate = getText(Nextpaymentdate, "Nextpaymentdate");
			if (nextpaymentdate != null) {
				extentLogs.pass("Verify Next payment date",
						"Next payment date:" + nextpaymentdate);
			} else {
				extentLogs.fail("Verify  Next payment date",
						"Next payment date is not Diaplayed");
			}
			click(otherpaymentoptions, "Check other payment options");
			String threepaymentoptions = getText(Nextpaymentdateoptions,
					"Three payment options should be displayed.");
			if (threepaymentoptions != null) {
				extentLogs.pass("Verify Three payment options",
						"Three payment options should be displayed, Three payment options:"
								+ threepaymentoptions);
			} else {
				extentLogs.fail("Verify  Three payment options",
						"Three payment options is not Diaplayed");
			}
			click(OK, "OK");
			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			extentLogs.pass("Verify Select Payment Date Before Quote",
					"Select Payment Date Before Quote successfully verified");
		} else {
			extentLogs
					.fail(sdriver, "Verify  Next payment date",
							"Select Payment Date Before Quote not successfully verified");
		}

		ele = waitForElementPresent(startMyApplication, 60,
				"start My Application");
		click(ele, "start My Application");
		wait(5);
		ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
				"Confirm button Order Screen");
		click(ele, "confirm button Order Screen");

		// Associate Login
		ele = waitForElementPresent(AssociateLogin, 60);

		type(ele, "test", "Associate Login");
		click(SUBMIT, "Continue Button");

		// Dashboard Confirm order
		Thread.sleep(3000);
		isElementPresent(ConfirmOrdervalue, "Confirm Order");
		ele = waitForElementPresent(ConfirmOrdervalue, 60);
		click(ele, "Confirm Order");
		wait(2);
		// Associate Password (5661)
		ele = waitForElementPresent(Enteryourassociatepasswordtoconfirmorder,
				60);
		// Associate Password (5661)
		type(ele, "test", "Enter your associate password");

		click(CONFIRM, "CONFIRM");

		// Please select next payment date (change date later)

		// stroe 5661

		/*
		 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
		 * 
		 * click(ele, "CONTINUE");
		 * 
		 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
		 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
		 * "Initial Payment Details"); click(ele, "CONTINUE");
		 */

		// store 9660

		ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
				"REVIEW MY AGREEMENT");
		click(defaultNextPaymentDate, "Default Next Payment Date");

		click(ele, "REVIEW MY AGREEMENT");

		type(PIN, "1515", "Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: VerifyDeliveryFeeandESV
	 * @return
	 * @throws 
	 */
	public boolean VerifyDeliveryFeeandESV() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// create my order
		if (isElementPresent(department, "Pick a department.")) {
			click(Furniture, "Furniture");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(Bedroom, "Bedroom");

			isElementPresent(Bed, "Bed");
			click(Bed, "Bed");

			isElementPresent(JuniorBed, "Junior Bed");
			click(JuniorBed, "Junior Bed");

			type(amount, "30000", "amount");
			click(DONE, "DONE");
			isElementPresent(Deliveryfee, "Delivery fee");
			type(Deliveryfee, "11.10", "Delivery fee");
			click(CONTINUE, "CONTINUE");
			wait(2);
			isElementPresent(Extendwarranty, "Extended Warranty");
			type(Extendwarranty, "11.10", "Extended Warranty");
			click(CONTINUE, "CONTINUE");
			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");
			/*
			 * ele = waitForElementPresent(NOTHANKS, 60); click(ele,
			 * "NO THANKS");
			 */

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			// Here main test case

			if (isElementPresent(
					MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Pay upfront with lower monthly payments']",
					2)) {
				click(Payupfrontwithlowermonthlypayments,
						"Pay upfront with lower monthly payments");

				click(CONTINUE, "CONTINUE");
			}

			/*
			 * isElementPresent(monthlypaymentsheader,
			 * "Affordable monthly payments to get you to ownership!");
			 * isElementPresent(InitialPayment, "Initial Payment");
			 * isElementPresent(MonthlyRenewalPayment,
			 * "Monthly Renewal Payment"); isElementPresent(NumberofMonths,
			 * "Number of Months"); String
			 * nextpaymentdate=getText(Nextpaymentdate, "Nextpaymentdate");
			 * if(nextpaymentdate!= null){
			 * extentLogs.pass("Verify Next payment date",
			 * "Next payment date:"+nextpaymentdate); }else{
			 * extentLogs.fail("Verify  Next payment date",
			 * "Next payment date is not Diaplayed"); }
			 * click(otherpaymentoptions, "Check other payment options"); String
			 * threepaymentoptions= getText(Nextpaymentdateoptions,
			 * "Three payment options should be displayed.");
			 * if(threepaymentoptions!= null){
			 * extentLogs.pass("Verify Three payment options",
			 * "Three payment options should be displayed, Three payment options:"
			 * +threepaymentoptions); }else{
			 * extentLogs.fail("Verify  Three payment options",
			 * "Three payment options is not Diaplayed"); } click(OK, "OK");
			 * isElementPresent(monthlypaymentsheader,
			 * "Affordable monthly payments to get you to ownership!");
			 * isElementPresent(InitialPayment, "Initial Payment");
			 * isElementPresent(MonthlyRenewalPayment,
			 * "Monthly Renewal Payment"); isElementPresent(NumberofMonths,
			 * "Number of Months");
			 * extentLogs.pass("Verify Select Payment Date Before Quote",
			 * "Select Payment Date Before Quote successfully verified"); }else{
			 * extentLogs.fail("Verify  Next payment date",
			 * "Select Payment Date Before Quote not successfully verified"); }
			 */
			ele = waitForElementPresent(startMyApplication, 60,
					"start My Application");
			click(ele, "start My Application");
			wait(5);
			ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
					"Confirm button Order Screen");
			click(ele, "confirm button Order Screen");
			wait(2);
			// Associate Login
			ele = waitForElementPresent(AssociateLogin, 60);

			type(ele, "test", "Associate Login");
			click(SUBMIT, "Continue Button");

			// Dashboard Confirm order
			Thread.sleep(1000);
			isElementPresent(ConfirmOrdervalue, "Confirm Order");
			ele = waitForElementPresent(ConfirmOrdervalue, 60);
			click(ele, "Confirm Order");

			wait(2);
			/*
			 * sdriver.context("WEB");
			 * while(isElementPresent(MobileLocator.ByXPath
			 * ,"//*[@class='UIWebView' and ./*[./*[@text]]]", 2)){
			 * sdriver.context("NATIVE_APP_INSTRUMENTED"); click(CONFIRM,
			 * "CONFIRM"); } sdriver.context("NATIVE_APP_INSTRUMENTED");
			 * wait(2);
			 */
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@class='_UIFieldEditorContentView']", 10)) {

				type(Enteryourassociatepasswordtoconfirmorder, "test",
						"Enter your associate password to confirmorder");
				click(CONFIRM, "CONFIRM");

			}

			// Associate Password (5661)

			/* click(CONFIRM, "CONFIRM"); */

			// Please select next payment date (change date later)

			// stroe 5661

			/*
			 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
			 * 
			 * click(ele, "CONTINUE");
			 * 
			 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
			 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
			 * "Initial Payment Details"); click(ele, "CONTINUE");
			 */

			// store 9660
			/*
			 * wait(3); if(isElementPresent(MobileLocator.ByXPath,
			 * "//*[@accessibilityLabel='CONTINUE']", 2)){ click(CONTINUE,
			 * "CONTINUE"); wait(3); //InitialPaymentDetails ele =
			 * waitForElementPresent(CONTINUE, 60,"CONTINUE");
			 * //assertElementExists(InitialPaymentDetails,
			 * "Initial Payment Details"); click(ele, "CONTINUE"); }
			 */

			waitForElementPresent(REVIEWMYAGREEMENT, 60, "REVIEW MY AGREEMENT");
			click(defaultNextPaymentDate, "Default Next Payment Date");

			click(REVIEWMYAGREEMENT, "REVIEW MY AGREEMENT");

			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Enter your associate PIN']", 4)) {
				type(PIN, "1515", "Enter your associate PIN");

				click(CONTINUEPOP, "CONTINUE");
			}
			extentLogs.pass("Verify Delivery Fee and ESV",
					" Delivery Fee and ESV Passed");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Delivery Fee and ESV",
					" Delivery Fee and ESV Failed");
			return false;
		}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return DriverNoResetFlag;
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: Verify_SelectPaymentDateBeforeQuote
	 * @return
	 * @throws 
	 */
	public void Verify_SelectPaymentDateBeforeQuote() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// create my order
		if (isElementPresent(Appliances, "Appliances")) {
			ele = waitForElementPresent(Appliances, 60, "Appliances");
			click(ele, "Appliances");

			// create my order
			ele = waitForElementPresent(LargeAppliances, 60, "Large Appliances");
			click(ele, "Large Appliances");
			//
			ele = waitForElementPresent(Ranges, 60, "Ranges");
			clear(ele, "Ranges");
			click(Okbutton, "OK");

			click(Bosch, "Bosch");

			click(Black, "Black");

			click(Electric, "Electric");

			click(CONTINUEelectric, "CONTINUE");

			click(Electric, "Electric");

			type(amount, "60000", "amount");
			click(DONE, "DONE");
			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");
			isElementPresent(ADD, "Add extended warranty");
			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");
			ele = waitForElementPresent(reviewMyEstimate, 60,
					" Estimate Review Info screen is displayed.");
			click(ele, "Review My Estimate");
			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			String nextpaymentdate = getText(Nextpaymentdate, "Nextpaymentdate");
			if (nextpaymentdate != null) {
				extentLogs.pass("Verify Next payment date",
						"Next payment date:" + nextpaymentdate);
			} else {
				extentLogs.fail("Verify  Next payment date",
						"Next payment date is not Diaplayed");
			}
			click(otherpaymentoptions, "Check other payment options");
			String threepaymentoptions = getText(Nextpaymentdateoptions,
					"Three payment options should be displayed.");
			if (threepaymentoptions != null) {
				extentLogs.pass("Verify Three payment options",
						"Three payment options should be displayed, Three payment options:"
								+ threepaymentoptions);
			} else {
				extentLogs.fail("Verify  Three payment options",
						"Three payment options is not Diaplayed");
			}
			click(OK, "OK");
			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			extentLogs.pass("Verify Select Payment Date Before Quote",
					"Select Payment Date Before Quote successfully verified");
		} else {
			extentLogs
					.fail(sdriver, "Verify  Next payment date",
							"Select Payment Date Before Quote not successfully verified");
		}
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: Verify_Createanorder_Bedroom
	 * @return
	 * @throws 
	 */
	public void Verify_Createanorder_Bedroom() throws Exception {
		try{
		// Part 2
		// Pick a department and add order

		// create my order
		if (isElementPresent(department, "Pick a department.")) {
			click(Furniture, "Furniture");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(Bedroom, "Bedroom");

			isElementPresent(Bed, "Bed");
			click(Bed, "Bed");

			isElementPresent(JuniorBed, "Junior Bed");
			click(JuniorBed, "Junior Bed");

			type(amount, "30000", "amount");
			click(DONE, "DONE");
			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");
			isElementPresent(ADD, "Add extended warranty");
			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");
			ele = waitForElementPresent(reviewMyEstimate, 60,
					" Estimate Review Info screen is displayed.");
			click(ele, "Review My Estimate");
			isElementPresent(monthlypaymentsheader,
					"Affordable monthly payments to get you to ownership!");
			isElementPresent(InitialPayment, "Initial Payment");
			isElementPresent(MonthlyRenewalPayment, "Monthly Renewal Payment");
			isElementPresent(NumberofMonths, "Number of Months");
			String nextpaymentdate = getText(Nextpaymentdate, "Nextpaymentdate");
			if (nextpaymentdate != null) {
				extentLogs.pass("Verify Next payment date",
						"Next payment date:" + nextpaymentdate);
			} else {
				extentLogs.fail("Verify  Next payment date",
						"Next payment date is not Diaplayed");
			}
			ele = waitForElementPresent(startMyApplication, 60,
					"start My Application");
			click(ele, "start My Application");
			extentLogs.pass("Verify Select Payment Date Before Quote",
					"Select Payment Date Before Quote successfully verified");
		} else {
			extentLogs
					.fail(sdriver, "Verify  Next payment date",
							"Select Payment Date Before Quote not successfully verified");
		}
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	
	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: Validate_of_Mattress_Without_Box_SpringMessage
	 * @return
	 * @throws 
	 */
	public void Validate_of_Mattress_Without_Box_SpringMessage(
			String EfirstName, String LastName, String primaryPhno,
			String ssnnumber1, String ssnnumber2, String ssnnumber3)
			throws Exception {
		try{
		if (isElementPresent(department, "Pick a department.")) {
			click(Furniture, "Furniture");

			// create my order

			isElementPresent(category, "Pick a category.");

			isElementPresent(HomeOffice, "Home Office");
			isElementPresent(DiningRoom, "Dining Room.");
			isElementPresent(LivingRoom, "Living Room");

			isElementPresent(Bedroom, "Bed room");
			isElementPresent(Storage, "Storage");
			click(Bedroom, "Bedroom");

			isElementPresent(Bed, "Bed");
			click(Bed, "Bed");

			isElementPresent(JuniorBed, "Junior Bed");
			click(JuniorBed, "Junior Bed");

			type(amount, "60000", "amount");

			click(DONE, "DONE");

			click(delete_icon, "Delete item");
			// (//*[@accessibilityLabel='REMOVE'])[1]

			click(REMOVE, "REMOVE");

			click(addorderitem_btn, "Add item");
			// 2nd item
			isElementPresent(department, "Pick a department.");

			click(Furniture, "Furniture");

			isElementPresent(category, "Pick a category.");

			isElementPresent(HomeOffice, "Home Office");
			isElementPresent(DiningRoom, "Dining Room.");
			isElementPresent(LivingRoom, "Living Room");

			isElementPresent(Bedroom, "Bed room");
			isElementPresent(Storage, "Storage");
			click(Bedroom, "Bedroom");
			isElementPresent(MattressBoxSpring, "Mattress/Box Spring");
			click(MattressBoxSpring, "Mattress/Box Spring");
			isElementPresent(mattressmustbeorderedtxt,
					"Please note that a mattress must be ordered with a box spring.");
			click(Okbtn, "Ok Button");
			click(Full, "Size Full");

			click(CONTINUE, "CONTINUE");

			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			ele = waitForElementPresent(startMyApplication, 60,
					"start My Application");
			click(ele, "start My Application");

			ele = waitForElementPresent(confirmbuttonOrderScreen, 60,
					"Confirm button Order Screen");
			click(ele, "confirm button Order Screen");
			wait(6);
			Thread.sleep(3000);
			// Associate Login
			ele = waitForElementPresent(AssociateLogin, 60);

			type(ele, "test", "Associate Login");
			click(SUBMIT, "Continue Button");

			// Dashboard Confirm order
			Thread.sleep(1000);
			isElementPresent(ConfirmOrdervalue, "Confirm Order");
			ele = waitForElementPresent(ConfirmOrdervalue, 60);

			if (isElementPresent(ConfirmOrdervalue, "ConfirmOrder")) {
				click(ele, "Confirm Order");
				extentLogs
						.pass("Verify now the message",
								"message is not displayed as Please note that a mattress must be ordered with a box spring.");
			} else {
				extentLogs.fail(sdriver, "Verify now the message",
						"message is not displayed");
			}

			// Associate Password (5661)
			type(Enteryourassociatepasswordtoconfirmorder, "test",
					"Enter your associate password");

			click(CONFIRM, "CONFIRM");
			wait(3);
			waitForElementPresent(REVIEWMYAGREEMENT, 60);
			agp.ClickonExit();
			gp.VerifyLogintodashboard(EfirstName);

			waitForElementPresent(delete_icon, 60);
			click(delete_icon, "Delete item");
			// (//*[@accessibilityLabel='REMOVE'])[1]

			click(REMOVE, "REMOVE");

			click(addorderitem_btn, "Add item");

			if (isElementPresent(department, "Pick a department.")) {
				click(Furniture, "Furniture");

				// create my order

				isElementPresent(category, "Pick a category.");

				isElementPresent(HomeOffice, "Home Office");
				isElementPresent(DiningRoom, "Dining Room.");
				isElementPresent(LivingRoom, "Living Room");

				isElementPresent(Bedroom, "Bed room");
				isElementPresent(Storage, "Storage");
				click(Bedroom, "Bedroom");

				isElementPresent(Bed, "Bed");
				click(Bed, "Bed");

				isElementPresent(JuniorBed, "Junior Bed");
				click(JuniorBed, "Junior Bed");

				type(amount, "60000", "amount");

				click(DONE, "DONE");

				click(delete_icon, "Delete item");
				// (//*[@accessibilityLabel='REMOVE'])[1]

				click(REMOVE, "REMOVE");

				click(addorderitem_btn, "Add item");
				// 2nd item
				isElementPresent(department, "Pick a department.");

				click(Furniture, "Furniture");

				isElementPresent(category, "Pick a category.");

				isElementPresent(HomeOffice, "Home Office");
				isElementPresent(DiningRoom, "Dining Room.");
				isElementPresent(LivingRoom, "Living Room");

				isElementPresent(Bedroom, "Bed room");
				isElementPresent(Storage, "Storage");
				click(Bedroom, "Bedroom");
				isElementPresent(MattressBoxSpring, "Mattress/Box Spring");
				click(MattressBoxSpring, "Mattress/Box Spring");
				isElementPresent(mattressmustbeorderedtxt,
						"Please note that a mattress must be ordered with a box spring.");
				click(Okbtn, "Ok Button");
				click(Full, "Size Full");

				click(CONTINUE, "CONTINUE");

				type(amount, "60000", "amount");

				click(DONE, "DONE");

				ele = waitForElementPresent(CONTINUE, 60);
				click(ele, "CONTINUE");

				type(Enteryourassociatepasswordtoconfirmorder, "test",
						"Enter your associate password");

				click(CONFIRM, "CONFIRM");
				wait(2);
				wait(8);
				click(LOGOUT, "LOGOUT");

				gp.clickonContinuemyProgress(EfirstName, LastName, primaryPhno,
						ssnnumber1, ssnnumber2, ssnnumber3);
				wait(5);
				waitForElementPresent(REVIEWMYAGREEMENT, 60);
				wait(5);
				waitForElementPresent(REVIEWMYAGREEMENT, 60);
				waitForElementPresent(REVIEWMYAGREEMENT, 60);

				sdriver.findElement(
						By.xpath("//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='defaultNextPaymentDate']]"))
						.click();
				ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
						"REVIEW MY AGREEMENT");

				click(ele, "REVIEW MY AGREEMENT");

				type(PIN, "1515", "Enter your associate PIN");

				click(CONTINUEPOP, "CONTINUE");

				extentLogs.pass("Verify Select Payment Date Before Quote",
						"Order is confirmed for Bedroom successfully");
			} else {
				extentLogs.fail(sdriver, "Verify  Next payment date",
						"Order is not confirmed for Bedroom");
			}
		}
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	
	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: Validate_of_CreateanOrder_Electronics
	 * @return
	 * @throws 
	 */
	public void Validate_of_CreateanOrder_Electronics() throws Exception {
	try{
		if (isElementPresent(department, "Pick a department.")) {
			click(Electronics, "Electronics");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(ComputersTablets, "Computers&Tablets");

			isElementPresent(Desktop, "Desktop");
			click(Desktop, "Desktop");

			isElementPresent(Pickabrand, "Pick a brand");
			click(Dell, "Dell");

			type(Screensize, "15", "Screen size");

			type(Ramsize, "5", "Ram size");

			type(DriveSizeValue, "500", "Drive Size");
			sdriver.closeKeyboard();
			click(Continuebut, "Continue");

			click(Mouse, "Mouse");
			click(Continuevalue, "Continue");

			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			ele = waitForElementPresent(EXPLOREYOUREARLYPURCHASEOPTION, 60);
			click(ele, "EXPLORE YOUR EARLY PURCHASE OPTION");
			isElementPresent(slider_button,
					"Shows the option to review/slider EPO ");

			isElementPresent(EARLYPURCHASEOPTIONPAYMENT,
					"EARLY PURCHASE OPTION PAYMENT");
			String epoamt = getText(epoamount,
					"EARLY PURCHASE OPTION PAYMENT Amount");
			System.out.println(epoamt);
			if (epoamt != null) {
				extentLogs.pass("Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			} else {
				extentLogs.fail(sdriver,
						"Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			}

			click(BACK, "BACK");
			click(BACK, "BACK");
			click(delete_icon, "Delete item");
			// (//*[@accessibilityLabel='REMOVE'])[1]

			click(REMOVE, "REMOVE");

			click(addorderitem_btn, "Add item");
			// 2nd item
			isElementPresent(department, "Pick a department.");

			click(Electronics, "Electronics");

			// create my order

			isElementPresent(category, "Pick a category.");
			click(ComputersTablets, "Computers&Tablets");

			isElementPresent(Laptop, "Laptop");
			click(Laptop, "Laptop");

			isElementPresent(Pickabrand, "Pick a brand");
			click(Dell, "Dell");
			type(Screensize, "15", "Screen size");

			type(Ramsize, "5", "Ram size");

			type(DriveSizeValue, "500", "Drive Size");
			sdriver.closeKeyboard();

			click(Continuebut, "Continue");

			click(Mouse, "Mouse");
			click(Continuevaluebtn, "Continue");

			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			ele = waitForElementPresent(EXPLOREYOUREARLYPURCHASEOPTION, 60);
			click(ele, "EXPLORE YOUR EARLY PURCHASE OPTION");

			isElementPresent(slider_button,
					"Shows the option to review/slider EPO ");

			isElementPresent(EARLYPURCHASEOPTIONPAYMENT,
					"EARLY PURCHASE OPTION PAYMENT");
			epoamt = getText(epoamount, "EARLY PURCHASE OPTION PAYMENT Amount");
			System.out.println(epoamt);
			if (epoamt != null) {
				extentLogs.pass("Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			} else {
				extentLogs.fail(sdriver,
						"Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			}

			click(BACK, "BACK");
			click(BACK, "BACK");

			click(delete_icon, "Delete item");
			click(REMOVE, "REMOVE");
			click(addorderitem_btn, "Add item");
			isElementPresent(department, "Pick a department.");

			// add printer
			click(Electronics, "Electronics");

			isElementPresent(category, "Pick a category.");
			click(ComputersTablets, "Computers&Tablets");

			isElementPresent(Printer, "Printer");
			click(Printer, "Printer");

			click(Inkjet, "Inkjet");
			click(Continuebut, "Continue");

			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			ele = waitForElementPresent(EXPLOREYOUREARLYPURCHASEOPTION, 60);
			click(ele, "EXPLORE YOUR EARLY PURCHASE OPTION");

			isElementPresent(slider_button,
					"Shows the option to review/slider EPO ");

			isElementPresent(EARLYPURCHASEOPTIONPAYMENT,
					"EARLY PURCHASE OPTION PAYMENT");

			epoamt = getText(epoamount, "EARLY PURCHASE OPTION PAYMENT Amount");
			System.out.println(epoamt);
			if (epoamt != null) {
				extentLogs.pass("Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			} else {
				extentLogs.fail(sdriver,
						"Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			}
			click(BACK, "BACK");
			click(BACK, "BACK");

			click(delete_icon, "Delete item");
			// (//*[@accessibilityLabel='REMOVE'])[1]

			click(REMOVE, "REMOVE");

			click(addorderitem_btn, "Add item");

			// add tablet
			click(Electronics, "Electronics");

			isElementPresent(category, "Pick a category.");
			click(ComputersTablets, "Computers&Tablets");

			isElementPresent(Tablet, "Tablet");
			click(Tablet, "Tablet");
			isElementPresent(Pickabrand, "Pick a brand");
			click(Apple, "Apple");

			type(Screensize, "15", "Screen size");

			type(StorageCapacity, "500", "Storage Capacity");
			click(Continuebut, "Continue");
			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			ele = waitForElementPresent(EXPLOREYOUREARLYPURCHASEOPTION, 60);
			click(ele, "EXPLORE YOUR EARLY PURCHASE OPTION");

			isElementPresent(slider_button,
					"Shows the option to review/slider EPO ");
			isElementPresent(EARLYPURCHASEOPTIONPAYMENT,
					"EARLY PURCHASE OPTION PAYMENT");
			epoamt = getText(epoamount, "EARLY PURCHASE OPTION PAYMENT Amount");
			if (epoamt != null) {
				extentLogs.pass("Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			} else {
				extentLogs.fail(sdriver,
						"Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			}
			click(BACK, "BACK");
			click(BACK, "BACK");
			click(delete_icon, "Delete item");
			click(REMOVE, "REMOVE");

			click(addorderitem_btn, "Add item");

			// add sterio

			click(Electronics, "Electronics");

			isElementPresent(category, "Pick a category.");
			click(Stereos, "Stereos");

			isElementPresent(PortableStereo, "PortableStereo");
			click(PortableStereo, "PortableStereo");
			isElementPresent(Pickabrand, "Pick a brand");
			click(LG, "LG");
			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			ele = waitForElementPresent(EXPLOREYOUREARLYPURCHASEOPTION, 60);
			click(ele, "EXPLORE YOUR EARLY PURCHASE OPTION");

			isElementPresent(slider_button,
					"Shows the option to review/slider EPO ");

			isElementPresent(EARLYPURCHASEOPTIONPAYMENT,
					"EARLY PURCHASE OPTION PAYMENT");

			epoamt = getText(epoamount, "EARLY PURCHASE OPTION PAYMENT Amount");
			if (epoamt != null) {
				extentLogs.pass("Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			} else {
				extentLogs.fail(sdriver,
						"Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			}
			click(BACK, "BACK");
			click(BACK, "BACK");

			click(delete_icon, "Delete item");
			// (//*[@accessibilityLabel='REMOVE'])[1]

			click(REMOVE, "REMOVE");

			click(addorderitem_btn, "Add item");

			// Add tvs

			click(Electronics, "Electronics");

			isElementPresent(category, "Pick a category.");
			click(TVs, "TVs");

			/*
			 * isElementPresent(LCDTV,"LCDTV"); isElementPresent(LEDTV,"LEDTV");
			 * isElementPresent(PlasmaTV,"PlasmaTV");
			 * isElementPresent(TVAccessories,"TVAccessories");
			 */

			click(LCDTV, "LCDTV");
			isElementPresent(Pickabrand, "Pick a brand");
			click(LG, "LG");
			type(Screensize, "50", "Screen size Inches");
			click(threeDTV, "3D TV");

			click(Continuebut, "Continue");

			type(amount, "60000", "amount");

			click(DONE, "DONE");

			ele = waitForElementPresent(CONTINUE, 60);
			click(ele, "CONTINUE");

			ele = waitForElementPresent(NOTHANKS, 60);
			click(ele, "NO THANKS");

			ele = waitForElementPresent(reviewMyEstimate, 60,
					"Review My Estimate");
			click(ele, "Review My Estimate");

			ele = waitForElementPresent(EXPLOREYOUREARLYPURCHASEOPTION, 60);
			click(ele, "EXPLORE YOUR EARLY PURCHASE OPTION");

			isElementPresent(slider_button,
					"Shows the option to review/slider EPO ");

			isElementPresent(EARLYPURCHASEOPTIONPAYMENT,
					"EARLY PURCHASE OPTION PAYMENT");
			epoamt = getText(epoamount, "EARLY PURCHASE OPTION PAYMENT Amount");
			System.out.println(epoamt);
			epoamt = getText(epoamount, "EARLY PURCHASE OPTION PAYMENT Amount");
			if (epoamt != null) {
				extentLogs.pass("Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			} else {
				extentLogs.fail(sdriver,
						"Verify EARLY PURCHASE OPTION PAYMENT Amount",
						"EPO Amount:" + epoamt);
			}
			click(BACK, "BACK");
			click(BACK, "BACK");

			click(delete_icon, "Delete item");
			// (//*[@accessibilityLabel='REMOVE'])[1]

			click(REMOVE, "REMOVE");

			click(addorderitem_btn, "Add item");

			/*
			 * // add TV Accessories click(Electronics, "Electronics");
			 * 
			 * isElementPresent(category,"Pick a category."); click(TVs, "TVs");
			 * 
			 * isElementPresent(LCDTV,"LCDTV"); isElementPresent(LEDTV,"LEDTV");
			 * isElementPresent(PlasmaTV,"PlasmaTV");
			 * isElementPresent(TVAccessories,"TVAccessories");
			 * 
			 * wait(3); click(TVAccessories, "TVAccessories");
			 * 
			 * 
			 * //isElementPresent(TVaccessorypopup,
			 * "Please note that a television must be ordered with any TV accessory."
			 * );
			 * 
			 * 
			 * if(isElementPresent(OkPopup, "Ok")){ click(OkPopup, "Ok");
			 * wait(2); isElementPresent(BluRayPlayer,"BluRay Player");
			 * isElementPresent(DVDPlayer,"DVD Player");
			 * isElementPresent(HomeTheater,"Home Theater");
			 * isElementPresent(SoundBar,"SoundBar"); } wait(2);
			 * isElementPresent(SelectTVAccessories, "Select TV Accessories");
			 * click(SelectTVAccessories, "Select TV Accessories"); wait(1);
			 * click(TVAccessoriesvalue, "TV Accessories");
			 * 
			 * if(isElementPresent(CancelPopup, "Cancel Popup")){
			 * click(CancelPopup, "Cancel Popup");
			 * isElementPresent(ComputersTablets, "Computers&Tablets");
			 * isElementPresent(Stereos, "Stereos");
			 * isElementPresent(TVs,"TVs"); isElementPresent(Games,"Games");
			 * 
			 * } click(TVsvalue, "TVs"); click(TVAccessoriesvalue,
			 * "TV Accessories"); isElementPresent(TVaccessorypopup,
			 * "Please note that a television must be ordered with any TV accessory."
			 * ); click(OkPopup, "Ok");
			 * isElementPresent(BluRayPlayer,"BluRay Player");
			 * click(BluRayPlayer,"BluRay Player"); type(amount, "60000",
			 * "amount"); click(DONE, "DONE");
			 * 
			 * ele = waitForElementPresent(AddTV, 60); click(ele, "Add TV");
			 * wait(2); click(Electronics, "Electronics");
			 * 
			 * isElementPresent(category,"Pick a category."); click(TVs, "TVs");
			 * 
			 * isElementPresent(LCDTV,"LCDTV"); isElementPresent(LEDTV,"LEDTV");
			 * isElementPresent(PlasmaTV,"PlasmaTV");
			 * isElementPresent(TVAccessories,"TVAccessories");
			 * 
			 * 
			 * click(LCDTV, "LCDTV");
			 * isElementPresent(Pickabrand,"Pick a brand"); click(LG, "LG");
			 * type(Screensize, "50", "Screen size Inches"); click(threeDTV,
			 * "3D TV");
			 * 
			 * click(Continuebut, "Continue");
			 * 
			 * type(amount, "20000", "amount");
			 * 
			 * click(DONE, "DONE");
			 * 
			 * ele = waitForElementPresent(CONTINUE, 60); click(ele,
			 * "CONTINUE");
			 * 
			 * 
			 * ele = waitForElementPresent(NOTHANKS, 60); click(ele,
			 * "NO THANKS");
			 * 
			 * ele = waitForElementPresent(reviewMyEstimate,
			 * 60,"Review My Estimate"); click(ele, "Review My Estimate");
			 * 
			 * 
			 * ele = waitForElementPresent(EXPLOREYOUREARLYPURCHASEOPTION, 60);
			 * click(ele, "EXPLORE YOUR EARLY PURCHASE OPTION");
			 * 
			 * isElementPresent(slider_button,
			 * "Shows the option to review/slider EPO ");
			 * 
			 * isElementPresent(EARLYPURCHASEOPTIONPAYMENT,
			 * "EARLY PURCHASE OPTION PAYMENT"); // epoamt= getText(epoamount,
			 * "EARLY PURCHASE OPTION PAYMENT Amount"); if(epoamt!=null){
			 * extentLogs.pass("Verify EARLY PURCHASE OPTION PAYMENT Amount",
			 * "EPO Amount:"+epoamt); }else{
			 * extentLogs.fail(sdriver,"Verify EARLY PURCHASE OPTION PAYMENT Amount"
			 * , "EPO Amount:"+epoamt); }
			 */
			extentLogs.pass("Validate_of_CreateanOrder_Electronics",
					"Create an Order Electronics successfully verified");
		} else {
			extentLogs.fail(sdriver, "Validate_of_CreateanOrder_Electronics",
					"Create an Order Electronics not successfully verified");
		}
	} catch (Exception e) {
		e.printStackTrace();		
	}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName: Confirmorder
	 * @return
	 * @throws 
	 */
	public void Confirmorder() throws Exception {
		try{
		// Dashboard Confirm order
		Thread.sleep(1000);
		isElementPresent(CONFIRMORDER, "Confirm Order");
		ele = waitForElementPresent(CONFIRMORDER, 60);
		click(ele, "Confirm Order");

		// Associate Password (5661)
		type(Enteryourassociatepassword, "test",
				"Enter your associate password");

		click(SUBMIT, "SUBMIT");

		// Dashboard Confirm order
		Thread.sleep(1000);
		wait(2);
		ele = waitForElementPresent(ConfirmOrdervalue, 60);
		click(ele, "Confirm Order");

		// Associate Password (5661)
		type(Enteryourassociatepasswordtoconfirmorder, "test",
				"Enter your associate password");

		click(CONFIRM, "CONFIRM");

		// Please select next payment date (change date later)

		// stroe 5661

		/*
		 * ele = waitForElementPresent(CONTINUE, 60,"CONTINUE");
		 * 
		 * click(ele, "CONTINUE");
		 * 
		 * //InitialPaymentDetails ele = waitForElementPresent(CONTINUE,
		 * 60,"CONTINUE"); //assertElementExists(InitialPaymentDetails,
		 * "Initial Payment Details"); click(ele, "CONTINUE");
		 */

		// store 9660

		ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,
				"REVIEW MY AGREEMENT");

		click(ele, "REVIEW MY AGREEMENT");

		type(PIN, "1515", "Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");
	
	} catch (Exception e) {
		e.printStackTrace();		
	}
}
}