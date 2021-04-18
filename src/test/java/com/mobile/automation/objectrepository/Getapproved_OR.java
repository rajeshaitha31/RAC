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

public class Getapproved_OR  extends MobileActionLibrary {
	int MIN_TO = 5;
	int MED_TO = 15;
	int MAX_TO = 60;
	public Getapproved_OR(IOSDriver appiumDriver) {
		super((SeeTestIOSDriver) appiumDriver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	@iOSFindBy(accessibility = "GET APPROVED")
	public MobileElement GETAPPROVED;

	@iOSFindBy(xpath = "//XCUIElementTypeScrollView")
	public MobileElement ScrollView;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Consent and Notice Regarding Electronic Agreements']")
	public MobileElement ConsentandnoticeRegardingElectronicAgreements;
	
	
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='Your Rental-Purchase Agreement']")
	public MobileElement YourRentalPurchaseAgreement;
	
	
	@iOSFindBy(xpath = "//*[@text='AGREE' or (@text='ACKNOWLEDGE')]")
	public MobileElement AGREEorACKNOWLEDGE;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
	public MobileElement ScrollView1;


	@iOSFindBy(accessibility = "firstName")
	public MobileElement firstName;

	@iOSFindBy(accessibility = "lastName")
	public MobileElement lastName;

	
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='(___) ___-____']")
	public MobileElement phone;
	
	
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONTINUE']")
	public MobileElement continueButtonText;
	

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@text='CONTINUE'])[2]")
	public MobileElement continueB;
	
	
	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[1]")
	public MobileElement continueButt;
	
		
	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[2]")
	public MobileElement continueButtre;				
					
	@iOSFindBy(accessibility = "email")
	public MobileElement email;

	@iOSFindBy(accessibility = "confirmEmail")
	public MobileElement confirmEmail;



	@iOSFindBy(accessibility = "street1")
	public MobileElement street1;

	@iOSFindBy(accessibility = "ZIP Code")
	public MobileElement postalCode;

	
	@iOSFindBy(xpath = "(//*[@accessibilityLabel='###'])[1]")
	public MobileElement ssn;
			
	@iOSFindBy(xpath = "(//*[@accessibilityLabel='##'])[1]")
	public MobileElement ssn1;
	
	@iOSFindBy(xpath = "(//*[@accessibilityLabel='####'])[1]")
	public MobileElement ssn2;
			
	@iOSFindBy(accessibility = "verifySSN1")
	public MobileElement verifySSN1;

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
	
	
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='REVIEW MY AGREEMENT']")
	public MobileElement REVIEWMYAGREEMENT;		
			
	@iOSFindBy(accessibility = "licenseNumber")
	public MobileElement licenseNumber;

	@iOSFindBy(accessibility = "licenseState")
	public MobileElement licenseState;


	@iOSFindBy(accessibility = "idTypeDriverLicenseCheckbox")
	public MobileElement idTypeDriverLicenseCheckbox;


	@iOSFindBy(xpath = "//*[@accessibilityLabel='TAKE PHOTO']")
	public MobileElement takePhoto;
	
	@iOSFindBy(xpath = "//*[@text='TAKE PHOTO' and ./parent::*[./parent::*[./parent::*[@class='VNTakePhotoButtonCell']]]]")
	public MobileElement takePhoto1;
	
		
	@iOSFindBy(xpath = "//*[@text='CONTINUE' and ./parent::*[@accessibilityLabel='CONTINUE' and ./parent::*[./parent::*[@class='VNTakePhotoButtonCell']]]]")
	public MobileElement Continuephoto;
	
	@iOSFindBy(accessibility = "dateOfBirth")
	public MobileElement dateOfBirth;
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='MM/DD/YYYY']")
	public MobileElement edateOfBirth;
	
	
	@iOSFindBy(accessibility = "bestTimeToCallMorning")
	public MobileElement bestTimeToCallMorning;

		
	@iOSFindBy(accessibility = "//*[contains(@text,'HAVE AN ALTERNATE CONTACT NUMBER')]")
	public MobileElement Skipalternativecontactnumber;
	
	@iOSFindBy(accessibility = "contactNumberIsMobile")
	public MobileElement contactNumberIsMobile;

	@iOSFindBy(accessibility = "contactNumber2")
	public MobileElement contactNumber2;

	@iOSFindBy(accessibility = "myJobIncome")
	public MobileElement myJobIncome;

	@iOSFindBy(accessibility = "lessThan6")
	public MobileElement lessThan6;

	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='$']")
	public MobileElement income;
	
	@iOSFindBy(accessibility = "referenceOneFirstName")
	public MobileElement referenceOneFirstName;

	@iOSFindBy(accessibility = "referenceOneLastName")
	public MobileElement referenceOneLastName;

	@iOSFindBy(accessibility = "referenceOneRelationParent")
	public MobileElement referenceOneRelationParent;

	@iOSFindBy(accessibility = "referenceTwoFirstName")
	public MobileElement referenceTwoFirstName;

	@iOSFindBy(accessibility = "referenceTwoRelationFriend")
	public MobileElement referenceTwoRelationFriend;


	@iOSFindBy(accessibility = "referenceTwoLastName")
	public MobileElement referenceTwoLastName;

	@iOSFindBy(accessibility = "referenceThreeFirstName")
	public MobileElement referenceThreeFirstName;

	@iOSFindBy(accessibility = "referenceThreeLastName")
	public MobileElement referenceThreeLastName;

	@iOSFindBy(accessibility = "referenceThreeRelationParent")
	public MobileElement referenceThreeRelationParent;

	
	@iOSFindBy(xpath = "xpath=//*[@accessibilityLabel='CREATE MY ORDER']")
	public MobileElement CREATEMYORDER;
	
	
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
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='Electric' and @class='VNCheckboxButton']")
	public MobileElement Electric;
	
	@iOSFindBy(xpath = "//*[@text='CONTINUE']")
	public MobileElement CONTINUEelectric;
	
	@iOSFindBy(xpath = "//*[@text='$0.00' and @class='UIFieldEditor']")
	public MobileElement amount;
	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='DONE']")
	public MobileElement DONE;
	
	
	@iOSFindBy(xpath = "//*[@text='skip Autopay']")
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

	@iOSFindBy(accessibility = "reviewMyEstimate")
	public MobileElement reviewMyEstimate;

	@iOSFindBy(accessibility = "startMyApplication")
	public MobileElement startMyApplication;

	@iOSFindBy(accessibility = "confirmbuttonOrderScreen")
	public MobileElement confirmbuttonOrderScreen;

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


	@iOSFindBy(accessibility = "reviewMyAgreementButtonText")
	public MobileElement reviewMyAgreementButtonText;



	@iOSFindBy(xpath = "//*[@accessibilityLabel='REVIEW']")
	public MobileElement REVIEW;		
			
	@iOSFindBy(accessibility = "Enter your associate PIN")
	public MobileElement PIN;

	@iOSFindBy(accessibility = "reviewMyAgreement")
	public MobileElement reviewMyAgreement;

	@iOSFindBy(accessibility = "agreeButton")
	public MobileElement agreeButton;


	@iOSFindBy(accessibility = "OK")
	public MobileElement OK;


	@iOSFindBy(xpath = "//*[@text='REVIEW & SIGN']")
	public MobileElement reviewAndSign;

	
	@iOSFindBy(xpath = "//*[@accessibilityLabel='Initials']")
	public MobileElement Initials;
	
	@iOSFindBy(accessibility = "AGREE")
	public MobileElement AGREE;

	@iOSFindBy(accessibility = "ACKNOWLEDGE")
	public MobileElement ACKNOWLEDGE;


	@iOSFindBy(xpath = "//*[@text='AGREE' and ./parent::*[@class='UIButton']]")
	public MobileElement agree;

	@iOSFindBy(xpath = "//*[@accessibilityIdentifier='renter_line']")
	public MobileElement renter_line;

	
	@iOSFindBy(xpath = "//*[@text='CASH']")
	public MobileElement CASH;
	
	
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

	public void getapproved() throws Exception
	{
		click(GETAPPROVED,  "GET APPROVED");
		type(firstName, genrateRandomUser(), "firstName");
		type(lastName, "tester", "lastName");
		continueButton();

		// enter mobile no
		
		type(phone, "9789893333", "Phone");
		click(continueB,  "continue Button");
		Thread.sleep(1000);
		type(email,"ravi.munigeri@Rentcenter.com", "email");
		type(confirmEmail, "ravi.munigeri@Rentcenter.com", "confirmEmail");
		click(continueB,  "continue Button");
		Thread.sleep(1000);
		// mailing
		ele = waitForElementPresent(street1, 60);
		type(ele, "alexander", "street Name");
		ele = waitForElementPresent(postalCode, 60);
		clear(ele, "Postal Code");
		//85282
		type(ele, "85282", "Postal Code");
		wait(1);
		continueButton();
		// enter SSN	
		type(ssn, "789", "SSN");
		type(ssn1, "22", "SSN");
		type(ssn2, "9222", "SSN");
		
		click(verifySSN1,  "SSN");
		type(ssn, "789", "SSN");
		type(ssn1, "22", "SSN");
		type(ssn2, "9222", "SSN");
		click(Continue,  "Continue");
		ele = waitForElementPresent(licenseNumber, 60);
		type(ele, "513615415", "licenseNumber");
		type(licenseState, "GA", "licenseState");
		click(idTypeDriverLicenseCheckbox,  "DriverLicenseCheckbox");
		click(continueB,  "continue Button");	
		wait(3);
		click(takePhoto, "Take Photo");
		
		//click(takePhoto,  "takePhoto");	
		click(CONTINUE1,  "Continue");
		ele = waitForElementPresent(dateOfBirth, 60);
		click(ele, "dateOfBirth");
		type(edateOfBirth, "08201987", "Enter Date Of Birth ");	
		//Enterdata("08201987");
		click(continueB,  "continue Button");
		Thread.sleep(1000);
		click(bestTimeToCallMorning, "BestTime To CallMorning");
		continueButton();		
		type(phone, "9889890700", "Phone");
			
		click(contactNumberIsMobile, "Contact Number Is Mobile");
		click(contactNumber2, "contactNumber");
		click(continueB,  "continue Button");
		Thread.sleep(1000);

		//takePhoto
		wait(1);
		click(takePhoto1, "Take Photo");
		click(takePhoto1, "Take Photo");
		Thread.sleep(2000);
		click(Continuephoto, "CONTINUE");
		ele = waitForElementPresent(myJobIncome, 60);
		click(ele, "MyJobIncome");
		continueButton();
		ele = waitForElementPresent(continueButtonText, 60);
		type(ele, "Nokia", "Current job");
		continueButton();	
		type(phone, "9889890701", "Phone");
		click(continueB,  "continue Button");
		click(lessThan6, "LessThan6");
		click(continueB,  "continue Button");
		//enter income		
		type(income, "40000", "Income");
		continueButton();
		//first reference
		type(referenceOneFirstName, genrateRandomUser(), "referenceOneFirstName");
		type(referenceOneLastName, genrateRandomUser(), "referenceOneLastName");
		continueButton();
		// phone number
		type(phone, "9789893344", "Phone");	
		click(continueB,  "continue Button");
		ele = waitForElementPresent(referenceOneRelationParent, 60);
		click(ele, "referenceOneRelationParent");
		continueButton();
		//first reference
		ele = waitForElementPresent(referenceTwoFirstName, 60);
		type(ele, genrateRandomUser(), "ReferenceTwo FirstName");
		type(referenceTwoLastName, "tester", "ReferenceTwo LastName");
		continueButton();
		Thread.sleep(1000);
		// phone number		
		type(phone, "9889890055", "Phone");	
		click(continueButt,  "continue Button");
		//related to you
		click(referenceTwoRelationFriend, "referenceTwoRelationFriend");
		continueButton();
		//third reference
		ele = waitForElementPresent(referenceThreeFirstName, 60);
		type(ele, genrateRandomUser(), "ReferenceThree FirstName");
		type(referenceThreeLastName, "tester", "ReferenceThree LastName");
		continueButton();

		// phone number
		type(phone, "9339840054", "Phone");	
		click(continueButt,  "continue Button");

		//related to you
		click(referenceThreeRelationParent, "Reference ThreeRelationParent");
	
		click(continueButtre,  "continue Button");
		wait(3);
		continueButton();
		continueButton();
		wait(10);

		continueButton();
		Thread.sleep(3000);
		//click(CREATEMYORDER,  "CREATE MY ORDER");
		
		//Associate Login
		/*ele = waitForElementPresent(AssociateLogin, 60);
		type(AssociateLogin, "u5661xteam", "Associate Login");	
		click(SUBMIT,  "continue Button");*/
		
			
		ele = waitForElementPresent(CREATEMYORDER, 60);

		click(ele, "createMyOrderButtonText");
		//
		Thread.sleep(1000);
		ele = waitForElementPresent(CREATEMYORDER, 60);

		click(ele, "createMyOrderButton");


		
		
		//Part 2
		//Pick a department and add order
	
		//create my order
		ele = waitForElementPresent(Appliances, 60);
		click(ele, "Appliances");

		//create my order
		ele = waitForElementPresent(LargeAppliances, 60);
		click(ele, "Large Appliances");

		//		
		ele = waitForElementPresent(Ranges, 60);
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
		
		ele = waitForElementPresent(reviewMyEstimate, 60);
		click(ele, "reviewMyEstimate");

		ele = waitForElementPresent(startMyApplication, 60);
		click(ele, "start My Application");

		ele = waitForElementPresent(confirmbuttonOrderScreen, 60);
		click(ele, "confirm button Order Screen");
	
		//Associate Login
		ele = waitForElementPresent(AssociateLogin, 60);
		
		type(ele, "test", "Associate Login");	
		click(LOGIN,  "continue Button");

//		Dashboard Confirm order
		Thread.sleep(1000);
		ele = waitForElementPresent(ConfirmOrder, 60);
		click(ele, "Confirm Order");
		
		//			Associate Password (5661)
		type(Enteryourassociatepasswordtoconfirmorder, "test","Enter your associate password");

		click(CONFIRM, "CONFIRM");
		
//		Please select next payment date (change date later)

		
		ele = waitForElementPresent(REVIEWMYAGREEMENT, 60);
		//click(ele, "nextpayemnt");
		click(ele, "REVIEW MY AGREEMENT");	
		
		type(PIN, "1515","Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");
	
		
		
		/*ele = waitForElementPresent(Continuebut, 60);
		//click(ele, "nextpayemnt");
		click(ele, "CONTINUE");
		
//		Initial Payment details
		
		ele = waitForElementPresent(CONTINUE, 60);
		click(ele, "CONTINUE");

		
		//		ele = waitForElementPresent(reviewMyAgreementButtonText, 60);
		//		click(ele, "CreviewMyAgreementButtonText");
//		Associate pin (5661)
		
		type(PIN, "1515","Enter your associate PIN");

		click(CONTINUEPOP, "CONTINUE");*/

		//Part3
//		Review agreement start
		ele = waitForElementPresent(REVIEW, 60);
		click(ele, "REVIEW");	

		agreementSigning();
		
		//part 4
		//initial Payment with CASH
		ele = waitForElementPresent(CASH, 60);
		click(ele, "CASH");
		
		ele = waitForElementPresent(Ok, 60);
		click(ele, "ok");
//		FindElement(MobileLocator.ByXPath,"//*[@text='See your sales associate to make a cash payment.']", MED_TO);
//		click(FindElement(MobileLocator.ByXPath,"(//*[@class='UIView' and ./parent::*[@class='VNHTMLAlertMessageView']]/*/*[@text='OK'])[2]", MIN_TO));

		//Accept CASH payment
		waitForElementPresent(AcceptcashPayment, 60);
		
	//	FindElement(MobileLocator.ByXPath,"//*[@accessibilityLabel='Accept Cash Payment']", MED_TO);
		String dollarAmt = sdriver.findElementByXPath("(//*[@class='VNCollectionView']/*[@class='VNAnimatableLabelCell'])[2]/*/*[1]").getText().trim();
		dollarAmt= dollarAmt.substring(1);
		type(UIFieldEditor, dollarAmt,"Enter Amount");
		click(DONE, "DONE");
		
		//			Associate pin (5661)
		ele= waitForElementPresent(PIN, 60);
		type(ele, "1515","Enter your associate PIN");
		click(ACCEPT, "ACCEPT");
		
		//Skip autopay screen
		FindElement(MobileLocator.ByXPath,"//*[@accessibilityLabel='Now, choose how you would like to make your monthly payment.']", MAX_TO);
		
		FindElement(MobileLocator.ByXPath,"//*[@accessibilityLabel='SET UP AUTOPAY']", MIN_TO);
		sdriver.context("WEB");
		wait(3);
		click(FindElement(MobileLocator.ByXPath,"//*[@text='skip Autopay']", MIN_TO));
		//click(skipAutopay, "skip Autopay");		
		sdriver.context("NATIVE_APP_INSTRUMENTED");
		wait(3);
		
		//part 5
		//Select Delivery date screen
		//Select delivery date
				ele = waitForElementPresent(selectDeliveryDate, 60);
				click(ele, "selectDeliveryDate");

				type(Enteryourassociatepasswordtocontinue, "test", "Enter your associate password to continue");
				Thread.sleep(2000);

				click(LOGIN, "selectDeliveryDate");		
		//			Schedule/pickup
				// click on date				
				click(Delivery, "Delivery");
				Thread.sleep(2000);
				click(TODAY, "TODAY");
				Thread.sleep(2000);
				click(Continuebtn, "Continue Button");
				Thread.sleep(2000);
				//Schedule/pickup
				click(yesButtonText, "yesButtonText");	
			// invoice details
				type(invoiceNumberField, "12345", "invoice Number Field");

				type(salespersonField, "Autosale", "sales person Field");

				click(DONEbtn, "doneButtonTextForInvoice");
				Thread.sleep(2000);
				type(UIFieldEditor, "test", "Enter your associate password to continue");
				Thread.sleep(2000);

				click(CONFIRM, "CONFIRM");
				Thread.sleep(2000);
				ele = waitForElementPresent(doneButtonText, 60);
				click(ele, "doneButtonText");
				
	}


	public void continueButton() throws Exception{
		click(continueButtonText,  "continueButton");
	}

	public void agreementSigning() throws Exception{
		
		waitForElementPresent(ConsentandnoticeRegardingElectronicAgreements, 60);
		scrollAgreement();
		//Your Rental-Purchase Agreement
		waitForElementPresent(YourRentalPurchaseAgreement, 60);
		click(reviewAndSign, "reviewAndSign");
		scrollAgreement();
		
		if(isElementPresent(MobileLocator.ByXPath,"//*[@accessibilityLabel='Initials']", 10)){
			type(Initials, "rm", "Initials");		
			click(CONTINUE, "CONTINUE");
			
		}
		wait(3);
		ele = waitForElementPresent(renter_line, 60);
		click(ele, "renter_line");
		click(agree, "agree");
		
		//Your Supplemental Acknowledgment
	
		ele = waitForElementPresent(reviewAndSign, 60);
		click(ele, "reviewAndSign");
		
		scrollAgreement();
		//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
		click(renter_line, "renter_line");
		click(agree, "agree");

		//Your Agreement Acknowledgement
		
		ele = waitForElementPresent(reviewAndSign, 60);
		click(ele, "reviewAndSign");
		
		scrollAgreement();
		
		// click on check box
				/*for (int j = 1; j <=7; j++) {
					sdriver.findElement(By.xpath("(//XCUIElementTypeButton[@name='squarecheckbox'])["+j+"]")).click();

				}*/
//		//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
		sdriver.findElement(By.xpath("(//*[@accessibilityIdentifier='squarecheckbox'])[1]")).click();
		sdriver.findElement(By.xpath("(//*[@accessibilityIdentifier='squarecheckbox'])[1]")).click();
		sdriver.findElement(By.xpath("(//*[@accessibilityIdentifier='squarecheckbox'])[1]")).click();
		sdriver.findElement(By.xpath("(//*[@accessibilityIdentifier='squarecheckbox'])[1]")).click();
		sdriver.findElement(By.xpath("(//*[@accessibilityIdentifier='squarecheckbox'])[1]")).click();
		sdriver.findElement(By.xpath("(//*[@accessibilityIdentifier='squarecheckbox'])[1]")).click();
		sdriver.findElement(By.xpath("(//*[@accessibilityIdentifier='squarecheckbox'])[1]")).click();
				//		click(FindElement(MobileLocator.ByXPath,"//*[@text='CONFIRM']", 2));

		click(CONFIRM, "CONFIRM");
		Thread.sleep(2000);
		//Your Early Purchase Option Amendment
		click(reviewAndSign, "reviewAndSign");

		Thread.sleep(2000);
		
		//Your Early Purchase Option Amendment
//		FindElement(MobileLocator.ByXPath,"//*[@text='Your Early Purchase Option Amendment']", 5);
//		click(FindElement(MobileLocator.ByXPath,"//*[@text='REVIEW & SIGN']", 2));
		scrollAgreement();
		
		//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
		click(renter_line, "renter_line");
		click(agree, "agree");

		//Your Liability Damage Waiver
	//	FindElement(MobileLocator.ByXPath,"//*[@accessibilityLabel='Your Liability Damage Waiver']", 5);
		click(reviewAndSign, "reviewAndSign");
		scrollAgreement();
		
		
		click(renter_line, "renter_line");
		click(agree, "agree");
		
		
		//Your Benefits Plus Membership
	//	FindElement(MobileLocator.ByXPath,"//*[@accessibilityLabel='Your Benefits Plus Membership']", 5);
		click(reviewAndSign, "reviewAndSign");
		scrollAgreement();
		
		click(renter_line, "renter_line");
		click(agree, "agree");

		//Your Arbitration Agreement
	//	FindElement(MobileLocator.ByXPath,"//*[@accessibilityLabel='Your Arbitration Agreement']", 5);
		click(reviewAndSign, "reviewAndSign");
		scrollAgreement();
		//sdriver.findElement(By.xpath("//*[@accessibilityLabel='renter_line']")).swipe(SwipeElementDirection.RIGHT, 500);
		click(renter_line, "renter_line");
		click(agree, "agree");
		
	}
	
	
	
	public void scrollAgreement() throws Exception{
		Thread.sleep(3000);
		sdriver.swipe(SwipeElementDirection.DOWN, 600, 1000);
		
		click(AGREEorACKNOWLEDGE,  "Click on Button");
		while(isElementPresent(MobileLocator.ByXPath,"//*[@text='Please review the entire agreement and scroll to the bottom before continuing.']", 2)){
			sdriver.findElement(By.xpath("//*[@text='OK']")).click();;
			sdriver.swipe(SwipeElementDirection.DOWN, 600, 1000);
			sdriver.findElement(By.xpath("//*[@text='AGREE']")).click();;
		}
		
		
	}
	

}