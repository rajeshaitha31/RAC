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
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Agreementspage extends MobileActionLibrary {
	int MIN_TO = 5;
	int MED_TO = 15;
	int MAX_TO = 60;

	public Agreementspage(IOSDriver appiumDriver) {
		super((SeeTestIOSDriver) appiumDriver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Consent and Notice Regarding Electronic Agreements']")
	public MobileElement ConsentandnoticeRegardingElectronicAgreements;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Your Rental-Purchase Agreement']")
	public MobileElement YourRentalPurchaseAgreement;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Your Supplemental Acknowledgment(s)']")
	public MobileElement YourSupplementalAcknowledgment;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Your Agreement Acknowledgement']")
	public MobileElement YourAgreementAcknowledgement;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Your Liability Damage Waiver']")
	public MobileElement YourLiabilityDamageWaiver;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Your Benefits Plus Membership']")
	public MobileElement YourBenefitsPlusMembership;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Your Arbitration Agreement']")
	public MobileElement YourArbitrationAgreement;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Do you want to accept the Liability Damage Waiver?']")
	public MobileElement AceeptYourLDW;

	@iOSFindBy(xpath = "//*[@text='AGREE' or (@text='ACKNOWLEDGE')]")
	public MobileElement AGREEorACKNOWLEDGE;

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

	@iOSFindBy(xpath = "//*[@text='CONTINUE' and ./parent::*[@accessibilityLabel='CONTINUE']]")
	public MobileElement CONTINUEPOP;

	@iOSFindBy(xpath = "//*[@text='CONTINUE']")
	public MobileElement Continuebut;

	@iOSFindBy(accessibility = "Enter your associate password.")
	public MobileElement Enteryourassociatepassword;

	@iOSFindBy(accessibility = "LOGIN")
	public MobileElement LOGIN;

	@iOSFindBy(accessibility = "Enter your associate password  to confirm order.")
	public MobileElement Enteryourassociatepasswordtoconfirmorder;

	@iOSFindBy(xpath = "//*[@text='CONFIRM']")
	public MobileElement CONFIRM;

	@iOSFindBy(accessibility = "reviewMyAgreementButtonText")
	public MobileElement reviewMyAgreementButtonText;

	@iOSFindBy(accessibility = "Enter your associate PIN")
	public MobileElement PIN;

	@iOSFindBy(accessibility = "reviewMyAgreement")
	public MobileElement reviewMyAgreement;

	@iOSFindBy(accessibility = "agreeButton")
	public MobileElement agreeButton;

	@iOSFindBy(accessibility = "OK")
	public MobileElement OK;

	@iOSFindBy(xpath = "//*[@text='OK']")
	public MobileElement OKbtn;

	@iOSFindBy(xpath = "//*[@text='REVIEW & SIGN']")
	public MobileElement reviewAndSign;

	@iOSFindBy(xpath = "//*[@class='UILabel']")
	public MobileElement suplementaryheader;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Your Liability Damage Waiver']")
	public MobileElement LiabilityDamageWaiver;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Initials']")
	public MobileElement Initials;

	@iOSFindBy(accessibility = "ACKNOWLEDGE")
	public MobileElement ACKNOWLEDGE;

	@iOSFindBy(xpath = "//*[@text='AGREE' and ./parent::*[@class='UIButton']]")
	public MobileElement agree;
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='salespersonField']")
	public MobileElement salespersonField;
	
	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement Invocie;
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='DONE']")
	public MobileElement DONE;
	

	@iOSFindBy(xpath = "//*[@class='UIImageView' and ./parent::*[@accessibilityLabel='DECLINE']]")
	public MobileElement DECLINE;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='MODIFY']")
	public MobileElement MODIFY;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='EXIT']")
	public MobileElement EXIT;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CANCEL' and @class='UIButton']")
	public MobileElement CANCEL;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='dontSaveButton']]")
	public MobileElement Dontsave;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='NO THANKS']")
	public MobileElement NOTHANKS;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='SAVE']")
	public MobileElement SAVE;

	@iOSFindBy(xpath = "(//*[@class='VNAssociateDashboardOrderDetailView']/*/*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='edit button']])[1]")
	public MobileElement EditOrderbtn;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='delete_icon']")
	public MobileElement delete_icon;

	@iOSFindBy(xpath = "(//*[@accessibilityLabel='REMOVE'])[1]")
	public MobileElement REMOVE;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='addorderitem_btn']")
	public MobileElement addorderitem_btn;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='GET APPROVED']")
	public MobileElement Getapproved;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @height>0 and ./parent::*[@accessibilityLabel='DECLINE' and @class='VNButton']]")
	public MobileElement DECLINEpopup;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='DECLINE' and ./parent::*[@class='UIButton']]")
	public MobileElement DECLINEvalue;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Do you want to participate in Benefits Plus?']")
	public MobileElement BenefitsPlustxt;

	@iOSFindBy(xpath = "xpath=//*[@class='UIWebView' and ./*[./*[@text]]]")
	public MobileElement BenefitsPlustxtpopup;

	@iOSFindBy(xpath = "//*[@text='AGREE']")
	public MobileElement AGREE;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='renter_line']")
	public MobileElement renter_line;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement UIFieldEditor;

	@iOSFindBy(accessibility = "Enter your associate password to continue.")
	public MobileElement Enteryourassociatepasswordtocontinue;

	@iOSFindBy(xpath = "//*[@class='UIFieldEditor']")
	public MobileElement invoiceNumberField;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Your agreement consists of the following sections:']")
	public MobileElement Youragreements;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='•  Rental-Purchase Agreement']")
	public MobileElement RentalPurchaseAg;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='•  Supplemental Acknowledgment(s)']")
	public MobileElement Supplementalag;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='•  Rental Agreement Acknowledgement']")
	public MobileElement Rental;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='•  Liability Damage Waiver']")
	public MobileElement Liability;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='•  Benefits Plus Agreement']")
	public MobileElement Benefits;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='•  Arbitration Agreement']")
	public MobileElement Arbitration;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='REVIEW']")
	public MobileElement REVIEW;

	@iOSFindBy(xpath = "//*[@class='VNHeadline1Label']")
	public MobileElement modifyheader;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='REVIEW MY AGREEMENT']")
	public MobileElement REVIEWMYAGREEMENT;
	

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='defaultNextPaymentDate']]")
	public MobileElement defaultNextPaymentDate;	

	MobileElement ele;

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Agreement
	 * @return
	 * @throws
	 */
	public void Agreement() throws Exception {
		try{
		// Part3
		// Review agreement start
		ele = waitForElementPresent(REVIEW, 60);
		click(ele, "REVIEW");

		agreementSigning();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName continueButton
	 * @return
	 * @throws
	 */
	public void continueButton() throws Exception {
		click(continueButtonText, "continueButton");
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_Agreements
	 * @return
	 * @throws
	 */
	public void Verify_Agreements() throws Exception {
		try {

			// Part3
			// Review agreement start

			/*
			 * ele = waitForElementPresent(REVIEW, 60);
			 * 
			 * isElementPresent(Youragreements,
			 * "Your agreement consists of the following sections");
			 * isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
			 * isElementPresent(Supplementalag,
			 * "Supplemental Acknowledgment(s)"); isElementPresent(Rental,
			 * "Rental Agreement Acknowledgement"); isElementPresent(Liability,
			 * "Liability Damage Waiver"); isElementPresent(Arbitration,
			 * "Arbitration Agreement"); click(ele, "REVIEW"); // Consent and
			 * Notice Regarding Electronic Agreements
			 * waitForElementPresent(ConsentandnoticeRegardingElectronicAgreements
			 * , 60,"Consent and Notice Regarding Electronic Agreements");
			 * assertElementExists
			 * (ConsentandnoticeRegardingElectronicAgreements,
			 * "Consent and Notice Regarding Electronic Agreements");
			 * scrollAgreement();
			 */

			// Your Rental-Purchase Agreement
			waitForElementPresent(YourRentalPurchaseAgreement, 60,
					"Your Rental-Purchase Agreement");
			assertElementExists(YourRentalPurchaseAgreement,
					"Your Rental-Purchase Agreement");
			ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
			click(ele, "reviewAndSign");
			scrollAgreement();

			// depends store
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Initials']", 10)) {
				type(Initials, "rm", "Initials");
				click(CONTINUE, "CONTINUE");

			}

			wait(3);
			ele = waitForElementPresent(renter_line, 60);
			click(ele, "renter_line");
			click(agree, "agree");

			// Your Supplemental Acknowledgment
			waitForElementPresent(YourSupplementalAcknowledgment, 60,
					"Your Supplemental Acknowledgment(s)");
			assertElementExists(YourSupplementalAcknowledgment,
					"Your Supplemental Acknowledgment(s)");

			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "Review And Sign");
			scrollAgreement();

			click(renter_line, "renter_line");
			click(agree, "agree");

			// Your Agreement Acknowledgement
			waitForElementPresent(YourAgreementAcknowledgement, 60,
					"Your Agreement Acknowledgement");
			assertElementExists(YourAgreementAcknowledgement,
					"Your Agreement Acknowledgement");
			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "reviewAndSign");

			scrollAgreement();

			// click on check box
			Clickoncheckboxs();
			click(CONFIRM, "CONFIRM");
			Thread.sleep(2000);
			// Your Liability Damage Waiver
			waitForElementPresent(YourLiabilityDamageWaiver, 60,
					"Your Liability Damage Waiver");
			assertElementExists(YourLiabilityDamageWaiver,
					"Your Liability Damage Waiver");
			click(reviewAndSign, "reviewAndSign");
			// Liability Damage Waiver
			wait(3);
			assertElementExists(AceeptYourLDW,
					"Do you want to accept the Liability Damage Waiver?");
			// Verify
			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

			// Your Benefits Plus Membership
			waitForElementPresent(YourBenefitsPlusMembership, 60,
					"Your Benefits Plus Membership");
			assertElementExists(YourBenefitsPlusMembership,
					"Your Benefits Plus Membership");
			click(reviewAndSign, "reviewAndSign");

			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

			// Your Arbitration Agreement
			waitForElementPresent(YourArbitrationAgreement, 60,
					"Your Arbitration Agreement");
			assertElementExists(YourArbitrationAgreement,
					"Your Arbitration Agreement");
			isElementPresent(reviewAndSign, "Review And Sign");
			click(reviewAndSign, "Review And Sign");
			wait(2);
			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Invoicedetails
	 * @return
	 * @throws
	 */
	public void Invoicedetails() throws Exception {
		try {
			waitForElementPresent(Invocie, 60,"Invocie Details");
			type(Invocie, "12345", "Invocie");
			type(salespersonField, "Autosale", "salespersonField");
			click(DONE, "DONE");


			ele = waitForElementPresent(REVIEWMYAGREEMENT, 60,"REVIEW MY AGREEMENT");
			click(defaultNextPaymentDate, "Default Next Payment Date");	

			click(ele, "REVIEW MY AGREEMENT");	

			type(PIN, "1515","Enter your associate PIN");

			click(CONTINUEPOP, "CONTINUE");

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName agreementSigning
	 * @return
	 * @throws
	 */
	public void agreementSigning() throws Exception {
		try {
		// Part3
		// Review agreement start

		ele = waitForElementPresent(REVIEW, 60);

		isElementPresent(Youragreements,
				"Your agreement consists of the following sections");
		isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
		isElementPresent(Supplementalag, "Supplemental Acknowledgment(s)");
		isElementPresent(Rental, "Rental Agreement Acknowledgement");
		isElementPresent(Liability, "Liability Damage Waiver");
		isElementPresent(Arbitration, "Arbitration Agreement");
		click(ele, "REVIEW");
		// Consent and Notice Regarding Electronic Agreements
		waitForElementPresent(ConsentandnoticeRegardingElectronicAgreements,
				60, "Consent and Notice Regarding Electronic Agreements");
		assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
				"Consent and Notice Regarding Electronic Agreements");
		scrollAgreement();

		// Your Rental-Purchase Agreement
		waitForElementPresent(YourRentalPurchaseAgreement, 60,
				"Your Rental-Purchase Agreement");
		assertElementExists(YourRentalPurchaseAgreement,
				"Your Rental-Purchase Agreement");
		ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
		click(ele, "reviewAndSign");
		scrollAgreement();

		// depends store
		if (isElementPresent(MobileLocator.ByXPath,
				"//*[@accessibilityLabel='Initials']", 10)) {
			type(Initials, "rm", "Initials");
			click(CONTINUE, "CONTINUE");

		}

		wait(3);
		ele = waitForElementPresent(renter_line, 60);
		click(ele, "renter_line");
		click(agree, "agree");

		// Your Supplemental Acknowledgment
		/*
		 * waitForElementPresent(YourSupplementalAcknowledgment,
		 * 60,"Your Supplemental Acknowledgment(s)");
		 * assertElementExists(YourSupplementalAcknowledgment
		 * ,"Your Supplemental Acknowledgment(s)");
		 * 
		 * 
		 * ele = waitForElementPresent(reviewAndSign, 60); click(ele,
		 * "Review And Sign"); scrollAgreement();
		 * 
		 * click(renter_line, "renter_line"); click(agree, "agree");
		 */

		// Your Agreement Acknowledgement
		waitForElementPresent(YourAgreementAcknowledgement, 60,
				"Your Agreement Acknowledgement");
		assertElementExists(YourAgreementAcknowledgement,
				"Your Agreement Acknowledgement");
		ele = waitForElementPresent(reviewAndSign, 60);
		click(ele, "reviewAndSign");

		scrollAgreement();

		// click on check box
		Clickoncheckboxs();
		click(CONFIRM, "CONFIRM");
		Thread.sleep(2000);
		// Your Liability Damage Waiver
		waitForElementPresent(YourLiabilityDamageWaiver, 60,
				"Your Liability Damage Waiver");
		assertElementExists(YourLiabilityDamageWaiver,
				"Your Liability Damage Waiver");
		click(reviewAndSign, "reviewAndSign");
		// Liability Damage Waiver
		wait(3);
		assertElementExists(AceeptYourLDW,
				"Do you want to accept the Liability Damage Waiver?");
		// Verify
		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Benefits Plus Membership
		waitForElementPresent(YourBenefitsPlusMembership, 60,
				"Your Benefits Plus Membership");
		assertElementExists(YourBenefitsPlusMembership,
				"Your Benefits Plus Membership");
		click(reviewAndSign, "reviewAndSign");

		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Arbitration Agreement
		waitForElementPresent(YourArbitrationAgreement, 60,
				"Your Arbitration Agreement");
		/*assertElementExists(YourArbitrationAgreement,
				"Your Arbitration Agreement");*/
		isElementPresent(reviewAndSign, "Review And Sign");
		click(reviewAndSign, "Review And Sign");
		wait(2);
		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Agreements
	 * @return
	 * @throws
	 */
	public void Agreements() throws Exception {
	// Review agreement start
		try{
			ele = waitForElementPresent(REVIEW, 60);

			isElementPresent(Youragreements,
					"Your agreement consists of the following sections");
			isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
			isElementPresent(Supplementalag, "Supplemental Acknowledgment(s)");
			isElementPresent(Rental, "Rental Agreement Acknowledgement");
			isElementPresent(Liability, "Liability Damage Waiver");
			isElementPresent(Arbitration, "Arbitration Agreement");
			click(ele, "REVIEW");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName CNREAgreements
	 * @return
	 * @throws
	 */
	public void  CNREAgreements() throws Exception {
		// Consent and Notice Regarding Electronic Agreements
		try{	
			waitForElementPresent(ConsentandnoticeRegardingElectronicAgreements,
				60, "Consent and Notice Regarding Electronic Agreements");
		assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
				"Consent and Notice Regarding Electronic Agreements");
		scrollAgreement();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Rental_PurchaseAgreements
	 * @return
	 * @throws
	 */
	public void  Rental_PurchaseAgreements() throws Exception {
		// Your Rental-Purchase Agreement
		try{
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Your Rental-Purchase Agreement']", 10)) {
				waitForElementPresent(YourRentalPurchaseAgreement, 60,
						"Your Rental-Purchase Agreement");
				assertElementExists(YourRentalPurchaseAgreement,
						"Your Rental-Purchase Agreement");
				ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
				click(ele, "reviewAndSign");
				scrollAgreement();
				// depends store
				if (isElementPresent(MobileLocator.ByXPath,
						"//*[@accessibilityLabel='Initials']", 10)) {
					type(Initials, "rm", "Initials");
					click(CONTINUE, "CONTINUE");

				}

				wait(3);
				ele = waitForElementPresent(renter_line, 60);
				click(ele, "renter_line");
				click(agree, "agree");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName SupplementalAgreements
	 * @return
	 * @throws
	 */
	public void SupplementalAgreements() throws Exception {
		try{
			// Your Supplemental Acknowledgment
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Your Supplemental Acknowledgment(s)']", 10)) {
				waitForElementPresent(YourSupplementalAcknowledgment, 60,
						"Your Supplemental Acknowledgment(s)");
				assertElementExists(YourSupplementalAcknowledgment,
						"Your Supplemental Acknowledgment(s)");

				ele = waitForElementPresent(reviewAndSign, 60);
				click(ele, "Review And Sign");
				scrollAgreement();

				click(renter_line, "renter_line");
				click(agree, "agree");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName AgreementAcknowledgement
	 * @return
	 * @throws
	 */
	public void  AgreementAcknowledgement() throws Exception {

		try{
			// Your Agreement Acknowledgement
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Your Agreement Acknowledgement']", 10)) {
				waitForElementPresent(YourAgreementAcknowledgement, 60,
						"Your Agreement Acknowledgement");
				assertElementExists(YourAgreementAcknowledgement,
						"Your Agreement Acknowledgement");
				ele = waitForElementPresent(reviewAndSign, 60);
				click(ele, "reviewAndSign");

				scrollAgreement();

				// click on check box
				Clickoncheckboxs();
				click(CONFIRM, "CONFIRM");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName LiabilityDamageWaiverAgreement
	 * @return
	 * @throws
	 */
	public void  LiabilityDamageWaiverAgreement() throws Exception {
		try{
			// Your Liability Damage Waiver
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Your Liability Damage Waiver']", 10)) {
				waitForElementPresent(YourLiabilityDamageWaiver, 60,
						"Your Liability Damage Waiver");
				assertElementExists(YourLiabilityDamageWaiver,
						"Your Liability Damage Waiver");
				click(reviewAndSign, "reviewAndSign");
				// Liability Damage Waiver
				wait(3);
				assertElementExists(AceeptYourLDW,"Do you want to accept the Liability Damage Waiver?");
				// Verify
				scrollAgreement();
				click(renter_line, "renter_line");
				click(agree, "agree");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName YourBenefitsPlusMembershipAgreement
	 * @return
	 * @throws
	 */	
	public void  YourBenefitsPlusMembershipAgreement() throws Exception {	
		try{
			// Your Benefits Plus Membership
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Your Benefits Plus Membership']", 10)) {
				waitForElementPresent(YourBenefitsPlusMembership, 60,
						"Your Benefits Plus Membership");
				assertElementExists(YourBenefitsPlusMembership,
						"Your Benefits Plus Membership");
				click(reviewAndSign, "reviewAndSign");

				scrollAgreement();
				click(renter_line, "renter_line");
				click(agree, "agree");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName ArbitrationAgreements
	 * @return
	 * @throws
	 */	
	public void  ArbitrationAgreements() throws Exception {	
		try{	
			// Your Arbitration Agreement
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Your Arbitration Agreement']", 10)) {
				waitForElementPresent(YourArbitrationAgreement, 60,
						"Your Arbitration Agreement");
				assertElementExists(YourArbitrationAgreement,
						"Your Arbitration Agreement");
				isElementPresent(reviewAndSign, "Review And Sign");
				click(reviewAndSign, "Review And Sign");
				wait(2);
				scrollAgreement();
				click(renter_line, "renter_line");
				click(agree, "agree");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName AgreementSigning
	 * @return
	 * @throws
	 */
	public void AgreementSigning() throws Exception {
		try{
				Agreements();
				CNREAgreements();
				Rental_PurchaseAgreements();
				SupplementalAgreements();
				AgreementAcknowledgement();
				LiabilityDamageWaiverAgreement();
				YourBenefitsPlusMembershipAgreement();
				ArbitrationAgreements();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName agreementSigningforcontinueprogrees
	 * @return
	 * @throws
	 */
	public void agreementSigningforcontinueprogrees() throws Exception {
		try{
		// Part3
		// Review agreement start

		ele = waitForElementPresent(REVIEW, 60);

		isElementPresent(Youragreements,
				"Your agreement consists of the following sections");
		isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
		isElementPresent(Supplementalag, "Supplemental Acknowledgment(s)");
		isElementPresent(Rental, "Rental Agreement Acknowledgement");
		isElementPresent(Liability, "Liability Damage Waiver");
		isElementPresent(Arbitration, "Arbitration Agreement");
		click(ele, "REVIEW");
		// Consent and Notice Regarding Electronic Agreements
		waitForElementPresent(ConsentandnoticeRegardingElectronicAgreements,
				60, "Consent and Notice Regarding Electronic Agreements");
		assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
				"Consent and Notice Regarding Electronic Agreements");
		scrollAgreement();

		// Your Rental-Purchase Agreement
		waitForElementPresent(YourRentalPurchaseAgreement, 60,
				"Your Rental-Purchase Agreement");
		assertElementExists(YourRentalPurchaseAgreement,
				"Your Rental-Purchase Agreement");
		ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
		click(ele, "reviewAndSign");
		scrollAgreement();

		// depends store
		if (isElementPresent(MobileLocator.ByXPath,
				"//*[@accessibilityLabel='Initials']", 10)) {
			type(Initials, "rm", "Initials");
			click(CONTINUE, "CONTINUE");

		}

		wait(3);
		ele = waitForElementPresent(renter_line, 60);
		click(ele, "renter_line");
		click(agree, "agree");

		// Your Supplemental Acknowledgment
		waitForElementPresent(YourSupplementalAcknowledgment, 60,
				"Your Supplemental Acknowledgment(s)");
		assertElementExists(YourSupplementalAcknowledgment,
				"Your Supplemental Acknowledgment(s)");

		ele = waitForElementPresent(reviewAndSign, 60);
		click(ele, "Review And Sign");
		scrollAgreement();

		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Agreement Acknowledgement
		waitForElementPresent(YourAgreementAcknowledgement, 60,
				"Your Agreement Acknowledgement");
		assertElementExists(YourAgreementAcknowledgement,
				"Your Agreement Acknowledgement");
		ele = waitForElementPresent(reviewAndSign, 60);
		click(ele, "reviewAndSign");

		scrollAgreement();

		// click on check box
		Clickoncheckboxs();
		click(CONFIRM, "CONFIRM");
		Thread.sleep(2000);
		// your early purchase option amendment
		click(reviewAndSign, "reviewAndSign");
		// Liability Damage Waiver
		wait(3);
		// assertElementExists(AceeptYourLDW,"Do you want to accept the Liability Damage Waiver?");
		// Verify
		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Liability Damage Waiver
	/*	waitForElementPresent(YourLiabilityDamageWaiver, 60,
				"Your Liability Damage Waiver");
		assertElementExists(YourLiabilityDamageWaiver,
				"Your Liability Damage Waiver");
		click(reviewAndSign, "reviewAndSign");
		// Liability Damage Waiver
		wait(3);
		assertElementExists(AceeptYourLDW,
				"Do you want to accept the Liability Damage Waiver?");
		// Verify
		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");*/

		// Your Benefits Plus Membership
		waitForElementPresent(YourBenefitsPlusMembership, 60,
				"Your Benefits Plus Membership");
		assertElementExists(YourBenefitsPlusMembership,
				"Your Benefits Plus Membership");
		click(reviewAndSign, "reviewAndSign");

		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Arbitration Agreement
		waitForElementPresent(YourArbitrationAgreement, 60,
				"Your Arbitration Agreement");
		assertElementExists(YourArbitrationAgreement,
				"Your Arbitration Agreement");
		isElementPresent(reviewAndSign, "Review And Sign");
		click(reviewAndSign, "Review And Sign");
		wait(2);
		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");
		}catch (Exception e) {
			e.printStackTrace();
		}
		}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verifyagreements
	 * @return
	 * @throws
	 */
	public void Verifyagreements() throws Exception {
		try{
		// Part3
		// Review agreement start

		ele = waitForElementPresent(REVIEW, 60);

		isElementPresent(Youragreements,
				"Your agreement consists of the following sections");
		isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
		isElementPresent(Supplementalag, "Supplemental Acknowledgment(s)");
		isElementPresent(Rental, "Rental Agreement Acknowledgement");
		isElementPresent(Liability, "Liability Damage Waiver");
		isElementPresent(Arbitration, "Arbitration Agreement");
		click(ele, "REVIEW");
		// Consent and Notice Regarding Electronic Agreements
		waitForElementPresent(ConsentandnoticeRegardingElectronicAgreements,
				60, "Consent and Notice Regarding Electronic Agreements");
		assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
				"Consent and Notice Regarding Electronic Agreements");
		scrollAgreement();

		// Your Rental-Purchase Agreement
		waitForElementPresent(YourRentalPurchaseAgreement, 60,
				"Your Rental-Purchase Agreement");
		assertElementExists(YourRentalPurchaseAgreement,
				"Your Rental-Purchase Agreement");
		ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
		click(ele, "reviewAndSign");
		scrollAgreement();

		// depends store
		if (isElementPresent(MobileLocator.ByXPath,
				"//*[@accessibilityLabel='Initials']", 10)) {
			type(Initials, "rm", "Initials");
			click(CONTINUE, "CONTINUE");

		}

		wait(3);
		ele = waitForElementPresent(renter_line, 60);
		click(ele, "renter_line");
		click(agree, "agree");

		// Your Supplemental Acknowledgment
		waitForElementPresent(YourSupplementalAcknowledgment, 60,
				"Your Supplemental Acknowledgment(s)");
		assertElementExists(YourSupplementalAcknowledgment,
				"Your Supplemental Acknowledgment(s)");

		ele = waitForElementPresent(reviewAndSign, 60);
		click(ele, "Review And Sign");
		scrollAgreement();

		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Agreement Acknowledgement
		waitForElementPresent(YourAgreementAcknowledgement, 60,
				"Your Agreement Acknowledgement");
		assertElementExists(YourAgreementAcknowledgement,
				"Your Agreement Acknowledgement");
		ele = waitForElementPresent(reviewAndSign, 60);
		click(ele, "reviewAndSign");

		scrollAgreement();

		// click on check box
		Clickoncheckboxs();
		click(CONFIRM, "CONFIRM");
		Thread.sleep(2000);
		// your early purchase option amendment
		click(reviewAndSign, "reviewAndSign");
		// Liability Damage Waiver
		wait(3);
		// assertElementExists(AceeptYourLDW,"Do you want to accept the Liability Damage Waiver?");
		// Verify
		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Liability Damage Waiver
		waitForElementPresent(YourLiabilityDamageWaiver, 60,
				"Your Liability Damage Waiver");
		assertElementExists(YourLiabilityDamageWaiver,
				"Your Liability Damage Waiver");
		click(reviewAndSign, "reviewAndSign");
		// Liability Damage Waiver
		wait(3);
		assertElementExists(AceeptYourLDW,
				"Do you want to accept the Liability Damage Waiver?");
		// Verify
		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Benefits Plus Membership
		waitForElementPresent(YourBenefitsPlusMembership, 60,
				"Your Benefits Plus Membership");
		assertElementExists(YourBenefitsPlusMembership,
				"Your Benefits Plus Membership");
		click(reviewAndSign, "reviewAndSign");

		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Arbitration Agreement
		waitForElementPresent(YourArbitrationAgreement, 60,
				"Your Arbitration Agreement");
		assertElementExists(YourArbitrationAgreement,
				"Your Arbitration Agreement");
		isElementPresent(reviewAndSign, "Review And Sign");
		click(reviewAndSign, "Review And Sign");
		wait(2);
		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName agreementSigningusingconitniueprogress
	 * @return
	 * @throws
	 */
	public void agreementSigningusingconitniueprogress() throws Exception {
		try{
		// Part3
		// Review agreement start

		ele = waitForElementPresent(REVIEW, 60);

		isElementPresent(Youragreements,
				"Your agreement consists of the following sections");
		isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
		isElementPresent(Supplementalag, "Supplemental Acknowledgment(s)");
		isElementPresent(Rental, "Rental Agreement Acknowledgement");
		isElementPresent(Liability, "Liability Damage Waiver");
		isElementPresent(Arbitration, "Arbitration Agreement");
		click(ele, "REVIEW");
		// Consent and Notice Regarding Electronic Agreements
		waitForElementPresent(ConsentandnoticeRegardingElectronicAgreements,
				60, "Consent and Notice Regarding Electronic Agreements");
		assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
				"Consent and Notice Regarding Electronic Agreements");
		scrollAgreement();

		// Your Rental-Purchase Agreement
		waitForElementPresent(YourRentalPurchaseAgreement, 60,
				"Your Rental-Purchase Agreement");
		assertElementExists(YourRentalPurchaseAgreement,
				"Your Rental-Purchase Agreement");
		ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
		click(ele, "reviewAndSign");
		scrollAgreement();

		// depends store
		if (isElementPresent(MobileLocator.ByXPath,
				"//*[@accessibilityLabel='Initials']", 10)) {
			type(Initials, "rm", "Initials");
			click(CONTINUE, "CONTINUE");

		}

		wait(3);
		ele = waitForElementPresent(renter_line, 60);
		click(ele, "renter_line");
		click(agree, "agree");

		// Your Supplemental Acknowledgment
		/*
		 * waitForElementPresent(YourSupplementalAcknowledgment,
		 * 60,"Your Supplemental Acknowledgment(s)");
		 * assertElementExists(YourSupplementalAcknowledgment
		 * ,"Your Supplemental Acknowledgment(s)");
		 * 
		 * 
		 * ele = waitForElementPresent(reviewAndSign, 60); click(ele,
		 * "Review And Sign"); scrollAgreement();
		 * 
		 * click(renter_line, "renter_line"); click(agree, "agree");
		 */

		// Your Agreement Acknowledgement
		waitForElementPresent(YourAgreementAcknowledgement, 60,
				"Your Agreement Acknowledgement");
		assertElementExists(YourAgreementAcknowledgement,
				"Your Agreement Acknowledgement");
		ele = waitForElementPresent(reviewAndSign, 60);
		click(ele, "reviewAndSign");

		scrollAgreement();

		// click on check box
		Clickoncheckboxs();
		click(CONFIRM, "CONFIRM");
		Thread.sleep(2000);
		// Your Early Purchase Option

		if (isElementPresent(
				MobileLocator.ByXPath,
				"//*[@accessibilityLabel='Your Early Purchase Option Amendment']",
				4)) {

			click(reviewAndSign, "reviewAndSign");
			// Liability Damage Waiver
			wait(3);
			// assertElementExists(AceeptYourLDW,"Do you want to accept the Liability Damage Waiver?");
			// Verify
			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

		}

		// Your Liability Damage Waiver

		if (isElementPresent(MobileLocator.ByXPath,
				"//*[@accessibilityLabel='Your Liability Damage Waiver']", 2)) {

			waitForElementPresent(YourLiabilityDamageWaiver, 60,
					"Your Liability Damage Waiver");
			assertElementExists(YourLiabilityDamageWaiver,
					"Your Liability Damage Waiver");
			click(reviewAndSign, "reviewAndSign");
			// Liability Damage Waiver
			wait(3);
			assertElementExists(AceeptYourLDW,
					"Do you want to accept the Liability Damage Waiver?");
			// Verify
			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

		}

		// Your Benefits Plus Membership
		waitForElementPresent(YourBenefitsPlusMembership, 60,
				"Your Benefits Plus Membership");
		assertElementExists(YourBenefitsPlusMembership,
				"Your Benefits Plus Membership");
		click(reviewAndSign, "reviewAndSign");

		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Arbitration Agreement
		waitForElementPresent(YourArbitrationAgreement, 60,
				"Your Arbitration Agreement");
		assertElementExists(YourArbitrationAgreement,
				"Your Arbitration Agreement");
		isElementPresent(reviewAndSign, "Review And Sign");
		click(reviewAndSign, "Review And Sign");
		wait(2);
		scrollAgreement();
		click(renter_line, "renter_line");
		click(agree, "agree");
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Createordervalidation
	 * @return
	 * @throws
	 */
	public void Createordervalidation() throws Exception {
		try{
		ele = waitForElementPresent(REVIEW, 60);
		click(ele, "REVIEW");
		waitForElementPresent(ConsentandnoticeRegardingElectronicAgreements, 60);
		scrollAgreement();
		// Your Rental-Purchase Agreement
		waitForElementPresent(YourRentalPurchaseAgreement, 60);
		click(reviewAndSign, "reviewAndSign");
		scrollAgreement();
		if (isElementPresent(MobileLocator.ByXPath,
				"//*[@accessibilityLabel='Initials']", 10)) {
			type(Initials, "rm", "Initials");
			click(CONTINUE, "CONTINUE");

		}
		wait(3);
		ele = waitForElementPresent(renter_line, 60);
		click(ele, "renter_line");
		click(agree, "agree");

		// Your Supplemental Acknowledgment

		ele = waitForElementPresent(reviewAndSign, 60);
		click(ele, "reviewAndSign");

		scrollAgreement();
		Clickoncheckboxs();

		click(CONFIRM, "CONFIRM");
		Thread.sleep(2000);
		// Your Early Purchase Option Amendment
		click(reviewAndSign, "reviewAndSign");

		scrollAgreement();

		click(renter_line, "renter_line");
		click(agree, "agree");

		// Your Benefits Plus Membership
		// FindElement(MobileLocator.ByXPath,"//*[@accessibilityLabel='Your Benefits Plus Membership']",
		// 5);
		click(reviewAndSign, "reviewAndSign");
		scrollAgreement();

		click(renter_line, "renter_line");
		click(agree, "agree");

		click(reviewAndSign, "reviewAndSign");
		scrollAgreement();

		click(renter_line, "renter_line");
		click(agree, "agree");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName scrollAgreement
	 * @return
	 * @throws
	 */
	public void scrollAgreement() throws Exception {
		try{
		// Thread.sleep(3000);
		swipeDownappiumstudio();

		click(AGREEorACKNOWLEDGE, "Click on Button");
		while (isElementPresent(
				MobileLocator.ByXPath,
				"//*[@text='Please review the entire agreement and scroll to the bottom before continuing.']",
				2)) {
			click(OKbtn, "OK");
			swipeDownappiumstudio();
			click(AGREE, "AGREE");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName DECLINEBenefitsPlus
	 * @return
	 * @throws
	 */
	public void DECLINEBenefitsPlus() throws Exception {
		try {

			// Part3
			// Review agreement start

			ele = waitForElementPresent(REVIEW, 60);
			click(ele, "REVIEW");
			// Consent and Notice Regarding Electronic Agreements
			waitForElementPresent(
					ConsentandnoticeRegardingElectronicAgreements, 60,
					"Consent and Notice Regarding Electronic Agreements");
			assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
					"Consent and Notice Regarding Electronic Agreements");
			scrollAgreement();

			// Your Rental-Purchase Agreement
			waitForElementPresent(YourRentalPurchaseAgreement, 60,
					"Your Rental-Purchase Agreement");
			assertElementExists(YourRentalPurchaseAgreement,
					"Your Rental-Purchase Agreement");
			ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
			click(ele, "reviewAndSign");
			scrollAgreement();

			// depends store
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Initials']", 10)) {
				type(Initials, "rm", "Initials");
				click(CONTINUE, "CONTINUE");

			}

			wait(3);
			ele = waitForElementPresent(renter_line, 60);
			click(ele, "renter_line");
			click(agree, "agree");

			// Your Supplemental Acknowledgment
			waitForElementPresent(YourSupplementalAcknowledgment, 60,
					"Your Supplemental Acknowledgment(s)");
			assertElementExists(YourSupplementalAcknowledgment,
					"Your Supplemental Acknowledgment(s)");

			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "reviewAndSign");

			scrollAgreement();

			click(renter_line, "renter_line");
			click(agree, "agree");

			// Your Agreement Acknowledgement
			waitForElementPresent(YourAgreementAcknowledgement, 60,
					"Your Agreement Acknowledgement");
			assertElementExists(YourAgreementAcknowledgement,
					"Your Agreement Acknowledgement");
			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "reviewAndSign");

			scrollAgreement();

			// click on check box
			Clickoncheckboxs();
			click(CONFIRM, "CONFIRM");
			Thread.sleep(2000);

			// Your Liability Damage Waiver
			waitForElementPresent(YourLiabilityDamageWaiver, 60,
					"Your Liability Damage Waiver");
			assertElementExists(YourLiabilityDamageWaiver,
					"Your Liability Damage Waiver");
			click(reviewAndSign, "reviewAndSign");
			// Liability Damage Waiver
			wait(3);
			assertElementExists(AceeptYourLDW,
					"Do you want to accept the Liability Damage Waiver?");

			// Verify
			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

			// Your Benefits Plus Membership
			waitForElementPresent(YourBenefitsPlusMembership, 60,
					"Your Benefits Plus Membership");
			assertElementExists(YourBenefitsPlusMembership,
					"Your Benefits Plus Membership");
			click(reviewAndSign, "reviewAndSign");

			swipeDownappiumstudio();
			click(DECLINE, "DECLINE");
			sdriver.context("WEB");
			while (isElementPresent(MobileLocator.ByXPath,
					"//*[@class='UIWebView' and ./*[./*[@text]]]", 2)) {
			}
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			click(DECLINEpopup, "DECLINE");

			click(renter_line, "renter_line");
			click(DECLINEvalue, "DECLINE");

			// Your Arbitration Agreement
			waitForElementPresent(YourArbitrationAgreement, 60,
					"Your Arbitration Agreement");
			assertElementExists(YourArbitrationAgreement,
					"Your Arbitration Agreement");
			click(reviewAndSign, "reviewAndSign");
			wait(2);
			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName verify_Supplement_Agreement_Decline
	 * @return
	 * @throws
	 */
	public void verify_Supplement_Agreement_Decline() throws Exception {
		try {

			// Part3
			// Review agreement start

			ele = waitForElementPresent(REVIEW, 60);

			isElementPresent(Youragreements,
					"Your agreement consists of the following sections");
			isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
			isElementPresent(Supplementalag, "Supplemental Acknowledgment(s)");
			isElementPresent(Rental, "Rental Agreement Acknowledgement");
			isElementPresent(Liability, "Liability Damage Waiver");
			isElementPresent(Arbitration, "Arbitration Agreement");
			click(ele, "REVIEW");
			// Consent and Notice Regarding Electronic Agreements
			waitForElementPresent(
					ConsentandnoticeRegardingElectronicAgreements, 60,
					"Consent and Notice Regarding Electronic Agreements");
			assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
					"Consent and Notice Regarding Electronic Agreements");
			scrollAgreement();

			// Your Rental-Purchase Agreement
			waitForElementPresent(YourRentalPurchaseAgreement, 60,
					"Your Rental-Purchase Agreement");
			assertElementExists(YourRentalPurchaseAgreement,
					"Your Rental-Purchase Agreement");
			ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
			click(ele, "reviewAndSign");
			scrollAgreement();

			// depends store
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Initials']", 10)) {
				type(Initials, "rm", "Initials");
				click(CONTINUE, "CONTINUE");

			}

			wait(3);
			ele = waitForElementPresent(renter_line, 60);
			click(ele, "renter_line");
			click(agree, "agree");

			// Your Supplemental Acknowledgment
			waitForElementPresent(YourSupplementalAcknowledgment, 60,
					"Your Supplemental Acknowledgment(s)");
			assertElementExists(YourSupplementalAcknowledgment,
					"Your Supplemental Acknowledgment(s)");

			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "Review And Sign");

			// suplementaryheader
			isElementPresent(suplementaryheader,
					"Supplemental Acknowledgment header");
			String suplementary = getText(suplementaryheader,
					"Supplemental Acknowledgment header");
			if (suplementary != null) {
				extentLogs
						.pass("Verify Click on 'Review & Sign' button",
								"It should open Television Supplement Acknowledgement.");
			} else {
				extentLogs
						.fail(sdriver,"Verify Click on 'Review & Sign' button",
								"It should not open Television Supplement Acknowledgement");
			}

			swipeDownappiumstudio();
			click(DECLINE, "DECLINE");
			isElementPresent(
					modifyheader,
					"User should be taken to a confirmation screen where following text is displayed Press Modify to continue with order process or Exit to go back to the home screen. with buttons Modify and Exit 1. Exit should exit app to attract loop identifer screen 2. Modify should take user to Create my order flow");

			// modifyheader
			isElementPresent(
					modifyheader,
					"Press Modify to continue with the order process  or Exit to go back to the home screen.");

			click(MODIFY, "MODIFY");

			Addorderpage ap = new Addorderpage(this.sdriver);
			ap.AddorderTVagain();

			ele = waitForElementPresent(REVIEW, 60);

			isElementPresent(Youragreements,
					"Your agreement consists of the following sections");
			isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
			isElementPresent(Supplementalag, "Supplemental Acknowledgment(s)");
			isElementPresent(Rental, "Rental Agreement Acknowledgement");
			isElementPresent(Liability, "Liability Damage Waiver");
			isElementPresent(Arbitration, "Arbitration Agreement");
			click(ele, "REVIEW");
			// Consent and Notice Regarding Electronic Agreements
			waitForElementPresent(
					ConsentandnoticeRegardingElectronicAgreements, 60,
					"Consent and Notice Regarding Electronic Agreements");
			assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
					"Consent and Notice Regarding Electronic Agreements");
			scrollAgreement();

			// Your Rental-Purchase Agreement
			waitForElementPresent(YourRentalPurchaseAgreement, 60,
					"Your Rental-Purchase Agreement");
			assertElementExists(YourRentalPurchaseAgreement,
					"Your Rental-Purchase Agreement");
			ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
			click(ele, "reviewAndSign");
			swipeDownappiumstudio();
			swipeDownappiumstudio();
			click(DECLINE, "DECLINE");
			waitForElementPresent(EXIT, 60);
			click(EXIT, "EXIT");
			if (isElementPresent(Getapproved, "Get approved")) {
				extentLogs.pass("Verify Tap on exit button now",
						"application should exit to home screen");
			} else {
				extentLogs.fail(sdriver,"Verify Tap on exit button now",
						"application should not exit to home screen");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName verify_SupplementalAgreements_TV_computer_range
	 * @return
	 * @throws
	 */
	public void verify_SupplementalAgreements_TV_computer_range(
			String EfirstName) throws Exception {
		try {

			// Part3
			// Review agreement start

			ele = waitForElementPresent(REVIEW, 60);

			isElementPresent(Youragreements,
					"Your agreement consists of the following sections");
			isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
			isElementPresent(Supplementalag, "Supplemental Acknowledgment(s)");
			isElementPresent(Rental, "Rental Agreement Acknowledgement");
			isElementPresent(Liability, "Liability Damage Waiver");
			isElementPresent(Arbitration, "Arbitration Agreement");
			click(ele, "REVIEW");
			// Consent and Notice Regarding Electronic Agreements
			waitForElementPresent(
					ConsentandnoticeRegardingElectronicAgreements, 60,
					"Consent and Notice Regarding Electronic Agreements");
			assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
					"Consent and Notice Regarding Electronic Agreements");
			scrollAgreement();

			// Your Rental-Purchase Agreement
			waitForElementPresent(YourRentalPurchaseAgreement, 60,
					"Your Rental-Purchase Agreement");
			assertElementExists(YourRentalPurchaseAgreement,
					"Your Rental-Purchase Agreement");
			ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
			click(ele, "reviewAndSign");
			scrollAgreement();

			// depends store
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Initials']", 10)) {
				type(Initials, "rm", "Initials");
				click(CONTINUE, "CONTINUE");

			}

			wait(3);
			ele = waitForElementPresent(renter_line, 60);
			click(ele, "renter_line");
			click(agree, "agree");

			// Your Supplemental Acknowledgment
			waitForElementPresent(YourSupplementalAcknowledgment, 60,
					"Your Supplemental Acknowledgment(s)");
			assertElementExists(YourSupplementalAcknowledgment,
					"Your Supplemental Acknowledgment(s)");

			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "Review And Sign");

			// suplementaryheader
			isElementPresent(suplementaryheader,
					"Supplemental Acknowledgment header");
			String suplementary = getText(suplementaryheader,
					"Supplemental Acknowledgment header");
			if (suplementary != null) {
				extentLogs
						.pass("Verify Click on 'Review & Sign' button",
								"It should open Television Supplement Acknowledgement.");
			} else {
				extentLogs
						.fail(sdriver,"Verify Click on 'Review & Sign' button",
								"It should not open Television Supplement Acknowledgement");
			}

			click(CANCEL, "CANCEL");
			// click on exit
			click(EXIT, "EXIT");
			isElementPresent(SAVE, "SAVE");
			isElementPresent(Dontsave, "Don't save");
			click(Dontsave, "Don't save");
			click(NOTHANKS, "NO THANKS");

			if (isElementPresent(Getapproved, "Get approved")) {
				extentLogs.pass("Verify Tap on exit button now",
						"application should exit to home screen");
			} else {
				extentLogs.fail(sdriver,"Verify Tap on exit button now",
						"application should not exit to home screen");
			}
			Getapprovedpage gp = new Getapprovedpage(this.sdriver);
			gp.VerifyLogintodashboard(EfirstName);

			// click on edit order

			/*
			 * isElementPresent(EditOrderbtn,"Order link"); click(EditOrderbtn,
			 * "Order link");
			 * 
			 * isElementPresent(DECLINE,
			 * "Pop up ' Please decline the agreement to modify the order' with Cancel and Decline buttons"
			 * ); click(DECLINE, "decline");
			 */

			waitForElement(delete_icon, 60, "Delete item");

			click(delete_icon, "Delete item");
			// (//*[@accessibilityLabel='REMOVE'])[1]
			waitForElement(REMOVE, 60, "REMOVE");

			click(REMOVE, "REMOVE");

			click(addorderitem_btn, "Add item");

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Verify_ElectronicallysignallformsEXCEPTthelastForm
	 * @return
	 * @throws
	 */
	public void Verify_ElectronicallysignallformsEXCEPTthelastForm()
			throws Exception {
		try {

			// Part3
			// Review agreement start

			ele = waitForElementPresent(REVIEW, 60);

			isElementPresent(Youragreements,
					"Your agreement consists of the following sections");
			isElementPresent(RentalPurchaseAg, "Rental-Purchase Agreement");
			isElementPresent(Supplementalag, "Supplemental Acknowledgment(s)");
			isElementPresent(Rental, "Rental Agreement Acknowledgement");
			isElementPresent(Liability, "Liability Damage Waiver");
			isElementPresent(Arbitration, "Arbitration Agreement");
			click(ele, "REVIEW");
			// Consent and Notice Regarding Electronic Agreements
			waitForElementPresent(
					ConsentandnoticeRegardingElectronicAgreements, 60,
					"Consent and Notice Regarding Electronic Agreements");
			assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
					"Consent and Notice Regarding Electronic Agreements");
			scrollAgreement();

			// Your Rental-Purchase Agreement
			waitForElementPresent(YourRentalPurchaseAgreement, 60,
					"Your Rental-Purchase Agreement");
			assertElementExists(YourRentalPurchaseAgreement,
					"Your Rental-Purchase Agreement");
			ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
			click(ele, "reviewAndSign");
			scrollAgreement();

			// depends store
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Initials']", 10)) {
				type(Initials, "rm", "Initials");
				click(CONTINUE, "CONTINUE");

			}

			wait(3);
			ele = waitForElementPresent(renter_line, 60);
			click(ele, "renter_line");
			click(agree, "agree");

			// Your Supplemental Acknowledgment
			waitForElementPresent(YourSupplementalAcknowledgment, 60,
					"Your Supplemental Acknowledgment(s)");
			assertElementExists(YourSupplementalAcknowledgment,
					"Your Supplemental Acknowledgment(s)");

			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "Review And Sign");
			scrollAgreement();

			click(renter_line, "renter_line");
			click(agree, "agree");

			// Your Agreement Acknowledgement
			waitForElementPresent(YourAgreementAcknowledgement, 60,
					"Your Agreement Acknowledgement");
			assertElementExists(YourAgreementAcknowledgement,
					"Your Agreement Acknowledgement");
			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "reviewAndSign");

			scrollAgreement();

			// click on check box
			Clickoncheckboxs();
			click(CONFIRM, "CONFIRM");
			Thread.sleep(2000);
			// Your Liability Damage Waiver
			waitForElementPresent(YourLiabilityDamageWaiver, 60,
					"Your Liability Damage Waiver");
			assertElementExists(YourLiabilityDamageWaiver,
					"Your Liability Damage Waiver");
			click(reviewAndSign, "reviewAndSign");
			// Liability Damage Waiver
			wait(3);
			assertElementExists(AceeptYourLDW,
					"Do you want to accept the Liability Damage Waiver?");
			// Verify
			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

			// Your Benefits Plus Membership
			waitForElementPresent(YourBenefitsPlusMembership, 60,
					"Your Benefits Plus Membership");
			assertElementExists(YourBenefitsPlusMembership,
					"Your Benefits Plus Membership");
			click(reviewAndSign, "reviewAndSign");

			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

			// Your Arbitration Agreement
			waitForElementPresent(YourArbitrationAgreement, 60,
					"Your Arbitration Agreement");
			assertElementExists(YourArbitrationAgreement,
					"Your Arbitration Agreement");
			isElementPresent(reviewAndSign, "Review And Sign");
			/*
			 * click(reviewAndSign, "Review And Sign"); wait(2);
			 * scrollAgreement(); click(renter_line, "renter_line");
			 * click(agree, "agree");
			 */

			click(EXIT, "EXIT");
			isElementPresent(SAVE, "SAVE");
			isElementPresent(Dontsave, "Don't save");
			click(Dontsave, "Don't save");
			click(NOTHANKS, "NO THANKS");

			if (isElementPresent(Getapproved, "Get approved")) {
				extentLogs.pass("Verify Tap on exit button now",
						"application should exit to home screen");
			} else {
				extentLogs.fail(sdriver,"Verify Tap on exit button now",
						"application should not exit to home screen");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName ClickonExit
	 * @return
	 * @throws
	 */
	public void ClickonExit() throws Exception {
		try{
		ele = waitForElementPresent(EXIT, 60);
		click(ele, "EXIT");
		isElementPresent(SAVE, "SAVE");
		isElementPresent(Dontsave, "Don't save");
		click(Dontsave, "Don't save");
		click(NOTHANKS, "NO THANKS");

		if (isElementPresent(Getapproved, "Get approved")) {
			extentLogs.pass("Verify Tap on exit button now",
					"application should exit to home screen");
		} else {
			extentLogs.fail(sdriver,"Verify Tap on exit button now",
					"application should not exit to home screen");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter
	 * @MethodName Decline_LDW_Kiosk
	 * @return
	 * @throws
	 */
	public void Decline_LDW_Kiosk() throws Exception {
		try {
			// Part3
			// Review agreement start

			ele = waitForElementPresent(REVIEW, 60);
			click(ele, "REVIEW");
			// Consent and Notice Regarding Electronic Agreements
			waitForElementPresent(
					ConsentandnoticeRegardingElectronicAgreements, 60,
					"Consent and Notice Regarding Electronic Agreements");
			assertElementExists(ConsentandnoticeRegardingElectronicAgreements,
					"Consent and Notice Regarding Electronic Agreements");
			scrollAgreement();

			// Your Rental-Purchase Agreement
			waitForElementPresent(YourRentalPurchaseAgreement, 60,
					"Your Rental-Purchase Agreement");
			assertElementExists(YourRentalPurchaseAgreement,
					"Your Rental-Purchase Agreement");
			ele = waitForElementPresent(reviewAndSign, 60, "reviewAndSign");
			click(ele, "reviewAndSign");
			scrollAgreement();

			// depends store
			if (isElementPresent(MobileLocator.ByXPath,
					"//*[@accessibilityLabel='Initials']", 10)) {
				type(Initials, "rm", "Initials");
				click(CONTINUE, "CONTINUE");

			}

			wait(3);
			ele = waitForElementPresent(renter_line, 60);
			click(ele, "renter_line");
			click(agree, "agree");

			// Your Supplemental Acknowledgment
			waitForElementPresent(YourSupplementalAcknowledgment, 60,
					"Your Supplemental Acknowledgment(s)");
			assertElementExists(YourSupplementalAcknowledgment,
					"Your Supplemental Acknowledgment(s)");

			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "reviewAndSign");

			scrollAgreement();

			click(renter_line, "renter_line");
			click(agree, "agree");

			// Your Agreement Acknowledgement
			waitForElementPresent(YourAgreementAcknowledgement, 60,
					"Your Agreement Acknowledgement");
			assertElementExists(YourAgreementAcknowledgement,
					"Your Agreement Acknowledgement");
			ele = waitForElementPresent(reviewAndSign, 60);
			click(ele, "reviewAndSign");

			scrollAgreement();

			// click on check box
			Clickoncheckboxs();
			click(CONFIRM, "CONFIRM");
			Thread.sleep(2000);
			// Your Liability Damage Waiver
			waitForElementPresent(YourLiabilityDamageWaiver, 60,
					"Your Liability Damage Waiver");
			assertElementExists(YourLiabilityDamageWaiver,
					"Your Liability Damage Waiver");
			click(reviewAndSign, "reviewAndSign");
			// Liability Damage Waiver
			wait(3);
			assertElementExists(AceeptYourLDW,
					"Do you want to accept the Liability Damage Waiver?");

			// Verify
			swipeDownappiumstudio();
			click(DECLINE, "DECLINE");
			sdriver.context("WEB");

			while (isElementPresent(MobileLocator.ByXPath,
					"//*[@class='UIWebView' and ./*[./*[@text]]]", 2)) {
			}

			sdriver.context("NATIVE_APP_INSTRUMENTED");
			click(DECLINEpopup, "DECLINE");

			click(renter_line, "renter_line");
			click(DECLINEvalue, "DECLINE");

			// Your Arbitration Agreement
			waitForElementPresent(YourArbitrationAgreement, 60,
					"Your Arbitration Agreement");
			if (IsElementExist(YourArbitrationAgreement,
					"Your Arbitration Agreement")) {
				extentLogs
						.pass("Decline LDW agreement and validate the benefit plus functionality.",
								"Benefit plus option shouldnot be invisible after Declining LDW");
			} else {
				extentLogs
						.fail(sdriver,"Decline LDW agreement and validate the benefit plus functionality.",
								"Benefit plus option should be invisible after Declining LDW");
			}
			click(reviewAndSign, "reviewAndSign");
			wait(3);
			scrollAgreement();
			click(renter_line, "renter_line");
			click(agree, "agree");

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
