package com.mobile.automation.objectrepository;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.experitest.appium.SeeTestIOSDriver;
import com.mobile.automation.accelerators.MobileActionLibrary;
import com.web.automation.accelerators.GmailAPI;

public class Getapprovedpage extends MobileActionLibrary {
	int MIN_TO = 5;
	int MED_TO = 15;
	int MAX_TO = 60;

	public Getapprovedpage(IOSDriver appiumDriver) {
		super((SeeTestIOSDriver) appiumDriver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='GET APPROVED']")
	public MobileElement GETAPPROVED;

	@iOSFindBy(xpath = "(//*[@class='UIView' and @onScreen='true'])[10]")
	public MobileElement tripleelement;
	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='CREATE AN ORDER']")
	public MobileElement CREATEANORDER;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='CONTINUE MY PROGRESS']")
	public MobileElement CONTINUEMYPROGRESS;

	@iOSFindBy(xpath = "//XCUIElementTypeScrollView")
	public MobileElement ScrollView;

	@iOSFindBy(xpath = "//*[@class='VNHeadline1Label']")
	public MobileElement Header;

	@iOSFindBy(xpath = "(//*[@class='VNBlueBodyLabel'])[1]")
	public MobileElement Headererrorvalue;

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

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement Firstnametxt;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='numberButtonBackspace']]")
	public MobileElement Backspacebtn;

	@iOSFindBy(xpath = "//*[@class='UITextFieldBorderView' and ./parent::*[@accessibilityLabel='verifySSN1']]")
	public MobileElement enterssn;

	@iOSFindBy(accessibility = "lastName")
	public MobileElement lastName;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='(___) ___-____']")
	public MobileElement phone;

	@iOSFindBy(xpath = "//*[@text='CONTINUE']")
	public MobileElement continueButtonText;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONTINUE' and ./parent::*[@accessibilityLabel='continueButtonText']]")
	public MobileElement continuebtn;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@text='CONTINUE'])[2]")
	public MobileElement continueB;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[1]")
	public MobileElement continueButt;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='CONTINUE'])[2]")
	public MobileElement continueButtre;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@class='UIButton' and @width>0 and ./parent::*[@class='VNReferencesRelationView']])[1]")
	public MobileElement referenceOneRelationfirst;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@class='UIButton' and @width>0 and ./parent::*[@class='VNReferencesRelationView']])[2]")
	public MobileElement referenceOneRelationtwo;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@class='UIButton' and @width>0 and ./parent::*[@class='VNReferencesRelationView']])[3]")
	public MobileElement referenceOneRelationthree;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Friend']")
	public MobileElement referenceOneRelationFriend;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Aunt/Uncle']")
	public MobileElement referenceOneRelationAunt;

	@iOSFindBy(accessibility = "email")
	public MobileElement email;

	@iOSFindBy(accessibility = "confirmEmail")
	public MobileElement confirmEmail;

	@iOSFindBy(accessibility = "street1")
	public MobileElement street1;

	@iOSFindBy(accessibility = "ZIP Code")
	public MobileElement postalCode;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='City']")
	public MobileElement City;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='ST']")
	public MobileElement ST;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Please enter a valid zip code']")
	public MobileElement plzzipCodetxt;

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

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement edateOfBirth;

	@iOSFindBy(accessibility = "bestTimeToCallMorning")
	public MobileElement bestTimeToCallMorning;

	@iOSFindBy(accessibility = "//*[contains(@text,'HAVE AN ALTERNATE CONTACT NUMBER')]")
	public MobileElement Skipalternativecontactnumber;
	@iOSFindBy(accessibility = "contactNumberIsMobile")
	public MobileElement contactNumberIsMobile;

	@iOSFindBy(accessibility = "contactNumber2")
	public MobileElement contactNumber2;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='continueButtonText']]")
	public MobileElement myJobIncome;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='(222) 222-2224' and @class='UITextFieldLabel']")
	public MobileElement ClickRetirement;

	@iOSFindBy(xpath = "(//*[@class='VNAnimatableDropDownCell'])[1]")
	public MobileElement clickMyjob;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Select']")
	public MobileElement Select;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Self Employment']")
	public MobileElement SelfEmployment;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Social Security']")
	public MobileElement SocialSecurity;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Retirement']")
	public MobileElement Retirement;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Pension']")
	public MobileElement Pension;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Disability']")
	public MobileElement Disability;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='$' and @class='UITextFieldLabel']")
	public MobileElement lessThan6;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='$']")
	public MobileElement income;

	@iOSFindBy(xpath = "//*[@placeholder='$']")
	public MobileElement incomeclear;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='BACK']")
	public MobileElement BACK;

	@iOSFindBy(xpath = "(//*[@accessibilityLabel='Please enter an amount greater than $0'])[1]")
	public MobileElement amountgreaterthan$0;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='CANCEL']")
	public MobileElement CANCEL;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='EXIT']")
	public MobileElement EXIT;

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

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Aunt/Uncle']")
	public MobileElement referenceThreeRelationAunt;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='confirmationcodeSecondaryemail']]")
	public MobileElement confirmationcodeSecondaryemail;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='ANOW COWORKER OVERRIDE']")
	public MobileElement ANOWCOWORKEROVERRIDE;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement Empname;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Enter Employee Id']")
	public MobileElement EmpID;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Enter reasons for overriding']")
	public MobileElement Comments;

	@iOSFindBy(xpath = "(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[3]")
	public MobileElement deletevalue;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Friend' and ./parent::*[@class='UITableViewCellContentView']]")
	public MobileElement referenceTwoRelationFriendselect;

	@iOSFindBy(accessibility = "referenceTwoLastName")
	public MobileElement referenceTwoLastName;

	@iOSFindBy(accessibility = "referenceThreeFirstName")
	public MobileElement referenceThreeFirstName;

	@iOSFindBy(accessibility = "referenceThreeLastName")
	public MobileElement referenceThreeLastName;

	@iOSFindBy(accessibility = "referenceThreeRelationParent")
	public MobileElement referenceThreeRelationParent;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Company Name']")
	public MobileElement CompanyName;


	@iOSFindBy(xpath = "//*[@accessibilityLabel=' ']")
	public MobileElement Company;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement CompanyNamechange;

	@iOSFindBy(xpath = "(//*[@class='VNHeadline1Label'])[1]")
	public MobileElement Headeraccount;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CREATE MY ORDER']")
	public MobileElement CREATEMYORDER;
	
	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='OK']")
	public MobileElement OK;

	@iOSFindBy(xpath = "(//*[@class='VNCollectionView']/*/*/*/*[@accessibilityLabel='Email   ' and @class='UIButtonLabel'])[1]")
	public MobileElement Email;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Welcome to AcceptanceNOW!']")
	public MobileElement Welcomeacn;

	@iOSFindBy(xpath = "(//*[@accessibilityLabel='Help Idle'])[3]")
	public MobileElement Helpbtn;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Outdoors' and @class='UILabel']")
	public MobileElement Outdoors;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Appliances' and @class='UILabel']")
	public MobileElement Appliances;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='Continue Shopping']")
	public MobileElement ContinueShopping;

	@iOSFindBy(xpath = "(//*[@accessibilityLabel='Help Idle'])[2]")
	public MobileElement Helpbtnyourinfm;

	@iOSFindBy(xpath = "//*[@nodeName='DIV']")
	public MobileElement helpmsg;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Order']")
	public MobileElement Order;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Estimate']")
	public MobileElement Estimate;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Apply']")
	public MobileElement Apply;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Agreements']")
	public MobileElement Agreements;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Payment']")
	public MobileElement Payment;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='See Associate or call AcceptanceNow 1-866-317-2011']")
	public MobileElement SeeAssociate;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='ESPAÑOL']")
	public MobileElement Espanol;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='EXIT']")
	public MobileElement Exit;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='OK']")
	public MobileElement Okbtn;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Enter your associate password.']")
	public MobileElement Enteryourassociatepassword;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement Enteryourassociatelogin;

	@iOSFindBy(xpath = "//*[@text='LOGIN']")
	public MobileElement LOGIN;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='CONFIRM']")
	public MobileElement CONFIRM;

	@iOSFindBy(xpath = "//*[@text='SUBMIT']")
	public MobileElement SUBMIT;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Enter the services password.']")
	public MobileElement Entertheservicespassword;

	@iOSFindBy(xpath = "//*[@placeholder='Search']")
	public MobileElement Search;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Associate Dashboard']")
	public MobileElement AssociateDashboard;

	@iOSFindBy(xpath = "(//*[@class='UITextFieldLabel'])[1]")
	public MobileElement StoreIdentifier;

	@iOSFindBy(xpath = "//*[@class='_UIFieldEditorContentView']")
	public MobileElement enterData;
	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='DONE']")
	public MobileElement DONE;

	@iOSFindBy(xpath = "(//*[@class='UITextFieldLabel'])[2]")
	public MobileElement ServicesUser;

	@iOSFindBy(xpath = "(//*[@class='UITextFieldLabel'])[3]")
	public MobileElement Screentimeout;

	@iOSFindBy(xpath = "(//*[@class='UITextFieldLabel'])[4]")
	public MobileElement Associatepassword;

	@iOSFindBy(xpath = "(//*[@class='UITextFieldLabel'])[5]")
	public MobileElement Servicespassword;

	@iOSFindBy(xpath = "(//*[@class='UITextFieldLabel'])[6]")
	public MobileElement Environment;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='LOGOUT']")
	public MobileElement LOGOUT;
	@iOSFindBy(xpath = "(//*[@class='UIKBKeyplaneView']/*[@class='UIKBKeyView'])[4]")
	public MobileElement clickSearch;

	@iOSFindBy(xpath = "(//*[@accessibilityLabel='Agreement Declined'])[1]")
	public MobileElement AgreementDeclined;

	@iOSFindBy(xpath = "(//*[@accessibilityIdentifier='order_pending_deliverydate'])[3]")
	public MobileElement orderpendingdeliverydate;

	@iOSFindBy(xpath = "xpath=((//*[@class='UITableViewWrapperView']/*/*[@class='UITableViewCellContentView'])[1]/*[@class='UIImageView' and @width>0])[2]")
	public MobileElement orderExpand;

	@iOSFindBy(xpath = "(//*[@class='VNAssociateDashboardOrderDetailView']/*/*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='edit button']])[1]")
	public MobileElement editorder;

	@iOSFindBy(xpath = "//*[@class='VNBlueBodyLabel']")
	public MobileElement Bodyerror;

	@iOSFindBy(xpath = "(//*[@accessibilityIdentifier='edit_button'])[1]")
	public MobileElement Editorder;

	@iOSFindBy(xpath = "//*[@class='UIImageView' and @width>0 and ./parent::*[@accessibilityLabel='email button']]")
	public MobileElement Emailbtn;

	@iOSFindBy(xpath = "//*[starts-with(@accessibilityLabel, 'Total')]")
	public MobileElement Totalamt;

	@iOSFindBy(xpath = "//*[starts-with(@accessibilityLabel, 'Currently')]")
	public MobileElement CurrentlyAvailable;

	@iOSFindBy(xpath = "//*[starts-with(@accessibilityLabel, 'Current on Rent')]")
	public MobileElement CurrentonRent;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Email Agreement']")
	public MobileElement EmailAgreementtxt;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Customer']")
	public MobileElement Customer;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Store']")
	public MobileElement Store;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='SEND']")
	public MobileElement SEND;

	@iOSFindBy(xpath = "//*[@text and @accessibilityLabel='DECLINE']")
	public MobileElement DECLINE;

	@iOSFindBy(xpath = "//*[@accessibilityLabel='Please enter your phone number, including area code. Please enter a valid email address. Please confirm the email address.']")
	public MobileElement phonenumbemailerror;

	MobileElement ele;

	/**
	 * @author @Cigniti
	 * @parameter 
	 * @MethodName get approved
	 * @return
	 * @throws 
	 */
	public boolean getapproved() throws Exception {
		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {

			click(GETAPPROVED, "GET APPROVED");
			type(firstName, genrateRandomUser(), "firstName");
			type(lastName, "Tester", "lastName");
			// type(lastName, testdata.get("EMAIL"), "lastName");
			// enter mobile no
			type(phone, "9789893333", "Phone");
			// click(continueB, "continue Button");
			Thread.sleep(1000);
			type(email, "ravi.munigeri@Rentcenter.com", "email");
			type(confirmEmail, "ravi.munigeri@Rentcenter.com", "confirmEmail");
			sdriver.closeKeyboard();
			continueButton();
			Thread.sleep(1000);
			// mailing
			ele = waitForElementPresent(street1, 60, "street Name");
			type(ele, "alexander", "street Name");
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			// 85282
			type(ele, "85282", "Postal Code");
			wait(1);
			continueButton();
			// enter SSN
			type(ssn, "789", "SSN");
			type(ssn1, "22", "SSN");
			type(ssn2, "9222", "SSN");
			click(verifySSN1, "SSN");
			type(ssn, "789", "SSN");
			type(ssn1, "22", "SSN");
			type(ssn2, "9222", "SSN");
			click(Continue, "Continue");
			ele = waitForElementPresent(licenseNumber, 60, "licenseNumber");
			type(ele, "513615415", "licenseNumber");
			type(licenseState, "GA", "licenseState");
			click(idTypeDriverLicenseCheckbox, "DriverLicenseCheckbox");
			click(continueB, "continue Button");
			wait(3);
			click(takePhoto, "Take Photo");
			// click(takePhoto, "takePhoto");
			click(CONTINUE1, "Continue");
			ele = waitForElementPresent(dateOfBirth, 60, "dateOfBirth");
			click(ele, "dateOfBirth");
			type(edateOfBirth, "08201987", "Enter Date Of Birth ");
			click(continueB, "continue Button");
			Thread.sleep(1000);
			click(bestTimeToCallMorning, "BestTime To CallMorning");
			continueButton();
			type(phone, "9889890700", "Phone");
			click(contactNumberIsMobile, "Contact Number Is Mobile");
			click(contactNumber2, "contactNumber");
			click(continueB, "continue Button");
			// takePhoto
			ele = waitForElementPresent(takePhoto1, 60, "takePhoto1");
			click(ele, "Take Photo");
			click(takePhoto1, "Take Photo");
			ele = waitForElementPresent(Continuephoto, 60, "CONTINUE");
			click(ele, "CONTINUE");
			ele = waitForElementPresent(myJobIncome, 60, "MyJobIncome");
			click(ele, "MyJobIncome");
			continueButton();
			ele = waitForElementPresent(CompanyName, 60, "Current job");
			type(ele, "Nokia", "Current job");
			continueButton();
			type(phone, "9889890701", "Phone");
			click(continueB, "continue Button");
			click(lessThan6, "LessThan6");
			click(continueB, "continue Button");
			// enter income
			type(income, "40000", "Income");
			continueButton();
			// first reference
			type(referenceOneFirstName, genrateRandomUser(),
					"referenceOneFirstName");
			type(referenceOneLastName, "tester", "referenceOneLastName");
			// phone number
			type(phone, "9789893344", "Phone");
			click(referenceOneRelationfirst, "Relationship");
			click(referenceOneRelationFriend, "Reference One Relation Friend");
			// first reference

			type(referenceTwoFirstName, genrateRandomUser(),
					"ReferenceTwo FirstName");
			type(referenceTwoLastName, "tester", "ReferenceTwo LastName");

			// phone number
			type(phone, "9889890055", "Phone");
			// related to you
			click(referenceOneRelationtwo, "Relationship");
			click(referenceTwoRelationFriendselect,
					"referenceTwoRelationFriend");
			type(referenceThreeFirstName, genrateRandomUser(),
					"ReferenceThree FirstName");
			type(referenceThreeLastName, "tester", "ReferenceThree LastName");
			// phone number
			type(phone, "9339840054", "Phone");
			click(referenceOneRelationthree, "Relationship");
			click(referenceThreeRelationAunt,
					"ReferenceThree Relation Aunt/Uncle");
			continueButton();
			continueButton();
			continueButton();
			continueButton();
			Thread.sleep(3000);
			// click(CREATEMYORDER, "CREATE MY ORDER");

			// Associate Login
			/*
			 * ele = waitForElementPresent(AssociateLogin, 60);
			 * type(AssociateLogin, "u5661xteam", "Associate Login");
			 * click(SUBMIT, "continue Button");
			 */

			ele = waitForElementPresent(CREATEMYORDER, 60, "CREATE MY ORDER");

			click(ele, "Create MyOrder Button");

			ele = waitForElementPresent(CREATEMYORDER, 60);

			click(ele, "create MyOrder Button");
			extentLogs.pass("Verify complete Create MyOrder",
					"Completed Create MyOrder");
			return true;
		} else {
			extentLogs.fail("Verify complete Create MyOrder",
					" Create MyOrder Failed");
			return false;
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter 
	 * @MethodName click Create an order
	 * @return
	 * @throws 
	 */
	public boolean clickCreateanorder() throws Exception {

		if (isElementPresent(CREATEANORDER, "CREATE AN ORDER")) {
			click(CREATEANORDER, "CREATE AN ORDER");
			return true;
		} else {
			return false;
		}
	}

	public boolean Logintodashboard(String EfirstName) throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			sdriver.swipe(51, 31, 753, 54, 450);
			wait(1);
			type(Enteryourassociatepassword, "test",
					"Enter your associate password");
			click(SUBMIT, " SUBMIT");
			// enter search

			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			waitForElement(Search, 60, "Search");
			click(Search, "Search");
			waitForElement(Search, 60, "Search");
			type(Search, EfirstName, "Enter name");
			click(clickSearch, "Search");
			isElementPresent(AgreementDeclined, "Agreement Declined");

			extentLogs.pass("Verify Supplement Agreement Decline",
					"Agreement Declined");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Supplement Agreement Decline",
					" Agreement not Declined");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter Strore number
	 * @MethodName Verify Login to dash board change store number
	 * @return
	 * @throws 
	 */
	public boolean VerifyLogintodashboardchangestorenumber(String Strorenumber)
			throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			sdriver.swipe(51, 31, 753, 54, 450);
			wait(1);
			type(Enteryourassociatepassword, "test",
					"Enter your associate password");
			click(SUBMIT, "SUBMIT");
			// enter search

			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			sdriver.swipe(1942, 68, 2013, 466, 270);

			waitForElement(Firstnametxt, 60, "Enter The Services Password");
			type(Firstnametxt, "test", "Enter The Services Password");
			click(SUBMIT, "SUBMIT");
			wait(2);
			isElementPresent(StoreIdentifier, "Store Identifier");
			wait(2);
			click(StoreIdentifier, "StoreIdentifier");
			// sdriver.findElement(By.xpath("")).sendKeys(keysToSend);
			type(enterData, Strorenumber, "Store Identifier");

			click(DONE, "DONE");
			wait(10);
			waitForElementPresent(LOGOUT, 60);
			isElementPresent(LOGOUT, "LOGOUT");
			click(LOGOUT, "LOGOUT");
			extentLogs.pass("Verify Login to Dashboard change storenumber",
					"Login to Dashboard changed storenumber" + Strorenumber);
			return true;
		} else {
			extentLogs.fail(sdriver,
					"Verify Login to Dashboard change storenumber",
					" storenumber not Updated");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter Strore number,AssociateMannedlogin
	 * @MethodName Verify Login to dash board change store number
	 * @return
	 * @throws 
	 */
	public boolean VerifyLogintodashboardchangestorenumber(String Strorenumber,
			String AssociateMannedlogin) throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			sdriver.swipe(51, 31, 753, 54, 450);
			wait(1);
			type(Enteryourassociatepassword, AssociateMannedlogin,
					"Enter your associate password");
			click(SUBMIT, "SUBMIT");
			// enter search

			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			sdriver.swipe(1942, 68, 2013, 466, 270);

			waitForElement(Firstnametxt, 60, "Enter The Services Password");
			type(Firstnametxt, "test", "Enter The Services Password");
			click(SUBMIT, "SUBMIT");
			wait(2);
			isElementPresent(StoreIdentifier, "Store Identifier");
			wait(2);
			click(StoreIdentifier, "StoreIdentifier");
			// sdriver.findElement(By.xpath("")).sendKeys(keysToSend);
			type(enterData, Strorenumber, "Store Identifier");

			click(DONE, "DONE");
			isElementPresent(LOGOUT, "LOGOUT");
			click(LOGOUT, "LOGOUT");
			extentLogs.pass("Verify Login to Dashboard change storenumber",
					"Login to Dashboard changed storenumber" + Strorenumber);
			return true;
		} else {
			extentLogs.fail(sdriver,
					"Verify Login to Dashboard change storenumber",
					" storenumber not Updated");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName
	 * @MethodName Verify Login to dash board 
	 * @return
	 * @throws 
	 */
	public boolean VerifyLogintodashboard(String EfirstName) throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			sdriver.swipe(51, 31, 753, 54, 450);
			wait(1);
			type(Enteryourassociatepassword, "test",
					"Enter your associate password");
			click(SUBMIT, "SUBMIT");
			// enter search

			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			waitForElement(Search, 60, "Search");
			click(Search, "Search");
			waitForElement(Search, 60, "Search");
			type(Search, EfirstName, "Enter name");
			click(clickSearch, "Search");
			isElementPresent(orderpendingdeliverydate,
					"orderpendingdeliverydate");

			click(orderExpand, "order Expand");
			click(Editorder, "Edit order");
			isElementPresent(DECLINE, "DECLINE");
			click(DECLINE, "DECLINE");
			wait(2);
			// click(Editorder, "Edit order");
			extentLogs.pass("Verify Login to dashboard",
					"Login to Dashboard Succesfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Login to dashboard",
					" Login to Dashboard Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName
	 * @MethodName Verify dash board Agreement
	 * @return
	 * @throws 
	 */
	public boolean Verify_DashBoard_Agreement(String EfirstName)
			throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			sdriver.swipe(51, 31, 753, 54, 450);
			wait(1);
			type(Enteryourassociatepassword, "test",
					"Enter your associate password");
			click(SUBMIT, "SUBMIT");
			// enter search

			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			waitForElement(Search, 60, "Search");
			click(Search, "Search");
			waitForElement(Search, 60, "Search");
			type(Search, EfirstName, "Enter name");
			click(clickSearch, "Search");
			isElementPresent(orderpendingdeliverydate,
					"orderpendingdeliverydate");

			click(orderExpand, "order Expand");

			click(Emailbtn, "Email");
			isElementPresent(EmailAgreementtxt, "Email Agreement");
			click(Customer, "Customer");
			click(SEND, "SEND");
			extentLogs
			.pass("Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					"Agreement Successfuly send to customer email ID");
			return true;
		} else {
			extentLogs
			.fail(sdriver,
					"Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					" Agreement not Successfuly send to customer email ID");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName
	 * @MethodName Verify dash board Application
	 * @return
	 * @throws 
	 */
	public boolean Verify_DashBoard_Application(String EfirstName)
			throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			sdriver.swipe(51, 31, 753, 54, 450);
			wait(1);
			type(Enteryourassociatepassword, "test",
					"Enter your associate password");
			click(SUBMIT, "SUBMIT");
			// enter search

			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			waitForElement(Search, 60, "Search");
			click(Search, "Search");
			waitForElement(Search, 60, "Search");
			type(Search, EfirstName, "Enter name");
			click(clickSearch, "Search");
			wait(2);
			click(orderExpand, "order Expand");

			wait(2);

			String Totalamount = getText(Totalamt, "Total Approval Amount");

			if ((Totalamount != null)) {
				extentLogs.pass("Verify Total Approval Amount",
						"Total Approval Amount:" + Totalamount);

			} else {
				extentLogs.fail(sdriver, "Verify Total Approval Amount",
						"Total Approval Amount:" + Totalamount);
			}

			String CurrentlyAvailablebal = getText(CurrentlyAvailable,
					"Currently Available");

			if ((CurrentlyAvailablebal != null)) {
				extentLogs.pass("Verify Currently Available",
						"Currently Available :" + CurrentlyAvailablebal);

			} else {
				extentLogs.fail(sdriver, "Verify Currently Available",
						"Currently Available:" + CurrentlyAvailablebal);
			}

			String CurrentonRentvalue = getText(CurrentonRent,
					"Current on Rent");

			if ((CurrentonRentvalue != null)) {
				extentLogs.pass("Verify Current on Rent", "Current on Rent :"
						+ CurrentonRentvalue);

			} else {
				extentLogs.fail(sdriver, "Verify Current on Rent",
						"Current on Rent:" + CurrentonRentvalue);
			}

			click(LOGOUT, "Logout");
			extentLogs
			.pass("Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					"Agreement Successfuly send to customer email ID");
			return true;
		} else {
			extentLogs
			.fail(sdriver,
					"Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					" Agreement not Successfuly send to customer email ID");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName
	 * @MethodName Verify dash board Application Click on Order
	 * @return
	 * @throws 
	 */
	public boolean Verify_DashBoard_ApplicationClickonOrder(String EfirstName)
			throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			sdriver.swipe(51, 31, 753, 54, 450);
			wait(1);
			type(Enteryourassociatelogin, "U66201xanow",
					"Enter your associate Login");
			click(SUBMIT, "SUBMIT");
			// enter search
			wait(3);
			isElementPresent(AssociateDashboard, "AssociateDashboard");
			waitForElement(Search, 60, "Search");
			click(Search, "Search");
			waitForElement(Search, 60, "Search");
			type(Search, EfirstName, "Enter name");
			click(clickSearch, "Search");
			isElementPresent(orderpendingdeliverydate,
					"orderpendingdeliverydate");

			click(orderExpand, "order Expand");

			wait(2);
			isElementPresent(editorder, "Edit order");
			click(editorder, "Edit order");

		/*	isElementPresent(DECLINE, "DECLINE");

			click(DECLINE, "DECLINE");*/

			extentLogs
			.pass("Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					"Agreement Successfuly send to customer email ID");
			return true;
		} else {
			extentLogs
			.fail(sdriver,
					"Verify Tap Envelope icon next to Agreement (mail icon to resend agreement to customer email ID)",
					" Agreement not Successfuly send to customer email ID");
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter 
	 * @MethodName click Get approved
	 * @return
	 * @throws 
	 */
	public boolean clickGetapproved() throws Exception {

		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			click(GETAPPROVED, "GET APPROVED");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter EfirstName,LastName,primaryPhno,ssnnumber1,ssnnumber2,ssnnumber3
	 * @MethodName click on Continue my Progress
	 * @return
	 * @throws 
	 */
	public boolean clickonContinuemyProgress(String EfirstName,
			String LastName, String primaryPhno, String ssnnumber1,
			String ssnnumber2, String ssnnumber3) throws Exception {
		wait(2);
		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {
			click(CONTINUEMYPROGRESS, "Continue my Progress");
			wait(2);
			isElementPresent(Header,
					"Enter your information to continue your progress");
			type(Firstnametxt, EfirstName, "firstName");
			type(lastName, LastName, "lastName");
			// enter mobile no
			type(phone, primaryPhno, "Phone");

			click(CONTINUE, "CONTINUE");
			waitForElementPresent(Headeraccount, 60);
			isElementPresent(Headeraccount,
					"Enter your Social Security number to continue.");
			// enter SSN
			waitForElementPresent(ssn, 60);
			type(ssn, ssnnumber1, "SSN");
			type(ssn1, ssnnumber2, "SSN");
			type(ssn2, ssnnumber3, "SSN");
			click(Continue, "Continue");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter 
	 * @MethodName click CREATE MY ORDER
	 * @return
	 * @throws 
	 */
	public boolean clickCREATEMYORDER() throws Exception {

		if (isElementPresent(Welcomeacn, "Welcome to AcceptanceNOW!")) {
			click(CREATEMYORDER, "Create MyOrder Button");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter 
	 * @MethodName clickOnhelpbtn
	 * @return
	 * @throws 
	 */
	public boolean clickOnhelpbtn() throws Exception {

		if (isElementPresent(Helpbtn, "")) {
			click(Helpbtn, "tap icon i alongside What's your name?");
			// sdriver.findElement(By.xpath("(//*[@accessibilityLabel='Help Idle'])[3]")).click();
			sdriver.context("WEB");
			wait(2);
			String helpmessage = sdriver.findElement(
					By.xpath("//*[@nodeName='DIV']")).getText();
			// String helpmessage=getText(helpmsg,
			// "Enter your full legal name as it appears on your driver's license. AcceptanceNOW is commited to the responsible handling of customer information. Visit AcceptanceNOW.com to review our privacy policy");
			System.out.println(helpmessage);
			wait(2);
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			click(Okbtn, "OK Button");
			extentLogs
			.pass("Verify On What's your name page, tap icon i alongside What's your name?",
					"Application should display the following message:"
							+ helpmessage);
			return true;
		} else {
			extentLogs
			.fail(sdriver,
					"Verify On What's your name page, tap icon i alongside What's your name?",
					" Application not displayed  message");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter 
	 * @MethodName clickOnhelpbtnYourinformation
	 * @return
	 * @throws 
	 */
	public boolean clickOnhelpbtnYourinformation() throws Exception {

		if (isElementPresent(Helpbtnyourinfm, "On What's your name page")) {
			click(Helpbtn, " tap icon i alongside Is my information safe?");
			// sdriver.findElement(By.xpath("(//*[@accessibilityLabel='Help Idle'])[3]")).click();
			sdriver.context("WEB");
			wait(2);
			String helpmessage = sdriver.findElement(
					By.xpath("//*[@nodeName='DIV']")).getText();
			// String helpmessage=getText(helpmsg,
			// "Enter your full legal name as it appears on your driver's license. AcceptanceNOW is commited to the responsible handling of customer information. Visit AcceptanceNOW.com to review our privacy policy");
			System.out.println(helpmessage);
			wait(2);
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			click(Okbtn, "OK Button");
			extentLogs
			.pass("Verify On What's your name page, tap icon i alongside Is my information safe?",
					"Application should display the following message:"
							+ helpmessage);
			return true;
		} else {
			extentLogs
			.fail(sdriver,
					"Verify On What's your name page, tap icon i alongside Is my information safe?",
					" Application not displayed  message");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter 
	 * @MethodName Verifyfields
	 * @return
	 * @throws 
	 */
	public boolean Verifyfields() throws Exception {

		if (isElementPresent(Order, "Order")) {
			click(Helpbtn, " tap icon i alongside Is my information safe?");
			// sdriver.findElement(By.xpath("(//*[@accessibilityLabel='Help Idle'])[3]")).click();
			sdriver.context("WEB");
			wait(2);
			String helpmessage = sdriver.findElement(
					By.xpath("//*[@nodeName='DIV']")).getText();
			// String helpmessage=getText(helpmsg,
			// "Enter your full legal name as it appears on your driver's license. AcceptanceNOW is commited to the responsible handling of customer information. Visit AcceptanceNOW.com to review our privacy policy");
			System.out.println(helpmessage);
			wait(2);
			sdriver.context("NATIVE_APP_INSTRUMENTED");
			click(Okbtn, "OK Button");
			extentLogs
			.pass("Verify On What's your name page, tap icon i alongside Is my information safe?",
					"Application should display the following message:"
							+ helpmessage);
			return true;
		} else {
			extentLogs
			.fail(sdriver,
					"Verify On What's your name page, tap icon i alongside Is my information safe?",
					" Application not displayed  message");
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter  EfirstName,  LastName, primaryPhno,  Email,  cnfEmail
	 * @MethodName YourInformation
	 * @return
	 * @throws 
	 */
	public boolean YourInformation(String EfirstName, String LastName,
			String primaryPhno, String Email, String cnfEmail) throws Exception {

		if (isElementPresent(Headeraccount, "Your Information")) {
			type(firstName, EfirstName, "firstName");
			type(lastName, LastName, "lastName");
			// enter mobile no
			type(phone, primaryPhno, "Phone");
			type(email, Email, "Email Address");
			type(confirmEmail, cnfEmail, "Confirm Email Address");
			sdriver.closeKeyboard();
			continueButton();
			extentLogs.pass("Verify Your Information",
					"Completed Your Information");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Your Information",
					" Your Information Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter 
	 * @MethodName Pleaseselectaproduct
	 * @return
	 * @throws 
	 */
	public boolean Pleaseselectaproduct() throws Exception {
		wait(3);
		if (isElementPresent(Headeraccount, "Please select a Product")) {
			click(Outdoors, "Outdoors");
			click(Appliances, "Appliances");
			click(ContinueShopping, "Continue Shopping");
			extentLogs.pass("Verify Please select a Product",
					"Completed  selected a Products");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Please select a Product",
					" Products  selection Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter  LastName, primaryPhno,  Email, cnfEmail
	 * @MethodName YourInformationValidations
	 * @return
	 * @throws 
	 */
	public boolean YourInformationValidations(String LastName,
			String primaryPhno, String Email, String cnfEmail) throws Exception {

		if (isElementPresent(Headeraccount, "Your Information")) {
			String EfirstName = getRandomString(25);
			type(firstName, EfirstName,
					" Employer name field should allow maximum 25 alpha numeric characters");
			type(lastName, LastName, "lastName");
			// enter mobile no
			type(phone, primaryPhno, "Phone");
			type(email, Email, "Email Address");
			type(confirmEmail, cnfEmail, "Confirm Email Address");
			sdriver.closeKeyboard();
			continueButton();
			extentLogs.pass("Verify Your Information",
					"Completed Your Information");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Your Information",
					" Your Information Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter  LastName, primaryPhno,  Email, cnfEmail
	 * @MethodName VerifyYourInformationr
	 * @return
	 * @throws 
	 */
	public boolean VerifyYourInformationr(String LastName, String primaryPhno,
			String Email, String cnfEmail) throws Exception {

		if (isElementPresent(Headeraccount, "Your Information")) {
			type(firstName, genrateRandomUser(), "firstName");
			type(lastName, LastName, "lastName");
			sdriver.closeKeyboard();
			continueButton();

			String phoneandemailmsg = getText(Bodyerror,
					"'Please enter your phone number, including area code");
			if (phoneandemailmsg != null) {
				extentLogs
				.pass("Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						"Application should display the following message:"
								+ phoneandemailmsg);
			} else {
				extentLogs
				.fail(sdriver,
						"Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						" Application not displayed  message");

			}

			type(email, Email, "Email Address");
			type(confirmEmail, cnfEmail, "Confirm Email Address");
			sdriver.closeKeyboard();
			continueButton();
			//
			String phonemsg = getText(Bodyerror,
					"'Please enter your phone number, including area code");
			if (phonemsg != null) {
				extentLogs
				.pass("Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						"Application should display the following message:"
								+ phonemsg);
			} else {
				extentLogs
				.fail(sdriver,
						"Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						" Application not displayed  message");

			}

			type(phone, primaryPhno, "Phone");
			sdriver.closeKeyboard();
			continueButton();

			extentLogs.pass("Verify Your Information",
					"Completed Your Information");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Your Information",
					" Your Information Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter  addrLine1,  zipCode
	 * @MethodName mailingaddress
	 * @return
	 * @throws 
	 */
	public boolean mailingaddress(String addrLine1, String zipCode)
			throws Exception {
		waitForElementPresent(street1, 60);
		if (isElementPresent(Headeraccount, "What is your mailing address?")) {
			// mailing
			ele = waitForElementPresent(street1, 60, "Street Name");
			type(ele, addrLine1, "Street Name");
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			// 85282
			type(ele, zipCode, "Postal Code");
			wait(1);
			continueButton();
			extentLogs.pass("Verify mailing address",
					"Completed mailing address Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify mailing address",
					"Mailing address? Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   addrLine1,  zipCode
	 * @MethodName verifymailingaddresserror
	 * @return
	 * @throws 
	 */
	public boolean verifymailingaddresserror(String addrLine1, String zipCode)
			throws Exception {
		waitForElementPresent(street1, 60);
		if (isElementPresent(Headeraccount, "What is your mailing address?")) {

			continueButton();
			String phonemsg = getText(
					Bodyerror,
					"'Please enter your address. Please enter your 5 digit ZIP code Please enter your city. Please enter the two letter abbreviation for your state.");
			if (phonemsg != null) {
				extentLogs
				.pass("Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						"Application should display the following message:"
								+ phonemsg);
			} else {
				extentLogs
				.fail(sdriver,
						"Verify On What's your name page, enter the First name,M.I ,and last name then tap Continue button",
						" Application not displayed  message");

			}

			// mailing
			ele = waitForElementPresent(street1, 60, "Street Name");
			type(ele, addrLine1, "Street Name");
			ele = waitForElementPresent(postalCode, 60, "Postal Code");
			clear(ele, "Postal Code");
			// 85282
			type(ele, zipCode, "Postal Code");
			wait(1);
			continueButton();
			extentLogs.pass("Verify mailing address",
					"Completed mailing address Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify mailing address",
					"Mailing address? Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   ssnnumber1,  ssnnumber2, ssnnumber3,  verifySsn1,  verifySsn2, verifySsn3
	 * @MethodName SocialSecuritynumber
	 * @return
	 * @throws 
	 */
	public boolean SocialSecuritynumber(String ssnnumber1, String ssnnumber2,
			String ssnnumber3, String verifySsn1, String verifySsn2,
			String verifySsn3) throws Exception {
		waitForElementPresent(ssn, 60);
		if (isElementPresent(Headeraccount,
				"What is your Social Security number?")) {
			// enter SSN
			type(ssn, ssnnumber1, "SSN");
			type(ssn1, ssnnumber2, "SSN");
			type(ssn2, ssnnumber3, "SSN");
			click(verifySSN1, "SSN");
			type(ssn, verifySsn1, "SSN");
			type(ssn1, verifySsn2, "SSN");
			type(ssn2, verifySsn3, "SSN");
			click(Continue, "Continue");
			extentLogs.pass("Verify Social Security number",
					"Completed Social Security number Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Social Security number",
					"Social Security number Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   ssnnumber1,  ssnnumber2, ssnnumber3,  verifySsn1,  verifySsn2, verifySsn3
	 * @MethodName SocialSecuritynumberValidations
	 * @return
	 * @throws 
	 */
	public boolean SocialSecuritynumberValidations(String Inssn,
			String ssnnumber2, String ssnnumber3, String verifySsn1,
			String verifySsn2, String verifySsn3, String ssnnumber1)
					throws Exception {
		waitForElementPresent(ssn, 60);
		if (isElementPresent(Headeraccount,
				"What is your Social Security number")) {
			// enter SSN
			type(ssn, Inssn, "SSN");
			type(ssn1, ssnnumber2, "SSN");
			type(ssn2, ssnnumber3, "SSN");
			click(verifySSN1, "SSN");
			type(ssn, Inssn, "SSN");
			type(ssn1, verifySsn2, "SSN");
			type(ssn2, verifySsn3, "SSN");
			click(Continue, "Continue");
			String actvalue = getText(Headererrorvalue, "");
			if ((actvalue != null)) {
				extentLogs.pass("Verify Social Security number",
						"must begin with 0 - 8.  SSN should NOT allow number beginning with 9 :"
								+ actvalue);

			} else {
				extentLogs.fail(sdriver, "Verify Social Security number",
						"SSN should allow number beginning with 9");
			}

			// click(BACK, "BACK");
			click(Backspacebtn, "SSN");
			click(Backspacebtn, "SSN");
			click(Backspacebtn, "SSN");

			clear(Firstnametxt, "SSN");
			type(Firstnametxt, ssnnumber1, "SSN");
			click(enterssn, "Verify ssn");

			click(Backspacebtn, "SSN");
			click(Backspacebtn, "SSN");
			click(Backspacebtn, "SSN");
			type(ssn, ssnnumber1, "SSN");

			click(Continue, "Continue");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   drivingLicense,  idState
	 * @MethodName StateIDnumber
	 * @return
	 * @throws 
	 */
	public boolean StateIDnumber(String drivingLicense, String idState)
			throws Exception {
		waitForElementPresent(licenseNumber, 60);
		if (isElementPresent(Headeraccount, "What’s your state ID number?  ")) {
			ele = waitForElementPresent(licenseNumber, 60, "licenseNumber");
			type(ele, drivingLicense, "licenseNumber");
			type(licenseState, idState, "licenseState");
			click(idTypeDriverLicenseCheckbox, "DriverLicenseCheckbox");
			click(continueB, "continue Button");
			wait(3);
			extentLogs.pass("Verify state ID number",
					"Completed Driver's License number Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify state ID number",
					"State ID number Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter    dateofbirth,  SPhone
	 * @MethodName Takephoto
	 * @return
	 * @throws 
	 */
	public boolean Takephoto(String dateofbirth, String SPhone)
			throws Exception {

		if (isElementPresent(takePhoto, "Take Photo ")) {
			click(takePhoto, "Take Photo");
			// click(takePhoto, "takePhoto");
			click(CONTINUE1, "Continue");
			ele = waitForElementPresent(dateOfBirth, 60, "dateOfBirth");
			click(ele, "dateOfBirth");
			type(dateOfBirth, dateofbirth, "Enter Date Of Birth ");
			click(continueB, "continue Button");
			click(bestTimeToCallMorning, "BestTime To CallMorning");
			continueButton();
			type(phone, SPhone, "Phone");
			click(contactNumberIsMobile, "Contact Number Is Mobile");
			click(contactNumber2, "contactNumber");
			click(continueB, "continue Button");
			// takePhoto
			ele = waitForElementPresent(takePhoto1, 60, "takePhoto1");
			click(ele, "Take Photo");
			click(takePhoto1, "Take Photo");
			ele = waitForElementPresent(Continuephoto, 60, "CONTINUE");
			click(ele, "CONTINUE");
			// extentLogs.pass("Verify state ID number",
			// "Completed Driver's License number Successfully");
			return true;
		} else {
			// extentLogs.fail("Verify state ID number",
			// "State ID number Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter    CurrentEmployer, MonthlyTakeHomeIncome,  EmployerPhoneNumber
	 * @MethodName changedworkingcompany
	 * @return
	 * @throws 
	 */
	public boolean changedworkingcompany(String CurrentEmployer,
			String MonthlyTakeHomeIncome, String EmployerPhoneNumber)
					throws Exception {

		if (isElementPresent(myJobIncome, "MyJobIncome")) {
			ele = waitForElementPresent(myJobIncome, 60, "MyJobIncome");
			click(ele, "MyJobIncome");
			continueButton();
			ele = waitForElementPresent(CompanyName, 60, "Current job");
			type(ele, CurrentEmployer, "Current job");
			continueButton();
			type(phone, EmployerPhoneNumber, "Phone");
			click(continueB, "continue Button");
			click(lessThan6, "LessThan6");
			click(continueB, "continue Button");
			// enter income
			type(income, MonthlyTakeHomeIncome, "Income");
			continueButton();
			extentLogs.pass("Verify Monthly Take Home Income",
					"Completed Monthly Take Home Income Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Monthly Take Home Income",
					"Monthly Take Home Income Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter     CurrentEmployer, MonthlyTakeHomeIncome,  EmployerPhoneNumber
	 * @MethodName workingcompany
	 * @return
	 * @throws 
	 */
	public boolean workingcompany(String CurrentEmployer,
			String MonthlyTakeHomeIncome, String EmployerPhoneNumber)
					throws Exception {

		if (isElementPresent(Header, "Income Information")) {
			ele = waitForElementPresent(Select, 60, "Select Income");

			click(ele, "Select Income");
			wait(2);
			click(myJobIncome, "MyJobIncome");
			type(CompanyName, CurrentEmployer, "Current job");

			type(phone, EmployerPhoneNumber, "Phone");
			sdriver.closeKeyboard();
			click(Select, "Select Income");
			wait(2);
			click(lessThan6, "LessThan6");

			// enter income
			// wait(2);
			// sdriver.findElement(By.xpath("//*[@accessibilityLabel='$']")).sendKeys("5000");

			sdriver.findElement(
					By.xpath("//*[@accessibilityLabel='pretaxIncome']"))
					.click();
			sdriver.sendKeys("5000");

			// type(income, MonthlyTakeHomeIncome, "Income");

			sdriver.closeKeyboard();
			wait(2);
			click(continueButtre, "continue");
			extentLogs.pass("Verify Monthly Take Home Income",
					"Completed Monthly Take Home Income Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Monthly Take Home Income",
					"Monthly Take Home Income Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   CurrentEmployer,  MonthlyTakeHomeIncome, EmployerPhoneNumber
	 * @MethodName Verify_Monthly_Take_Home_Income_cannot_be_0
	 * @return
	 * @throws 
	 */
	public boolean Verify_Monthly_Take_Home_Income_cannot_be_0(
			String CurrentEmployer, String MonthlyTakeHomeIncome,
			String EmployerPhoneNumber) throws Exception {

		if (isElementPresent(Header, "Income Information")) {
			ele = waitForElementPresent(Select, 60, "Select Income");

			click(ele, "Select Income");
			wait(2);
			click(myJobIncome, "MyJobIncome");
			type(CompanyName, CurrentEmployer, "Current job");

			type(phone, EmployerPhoneNumber, "Phone");
			sdriver.closeKeyboard();
			click(Select, "Select Income");
			wait(2);
			click(lessThan6, "LessThan6");

			// enter income
			wait(1);
			type(income, "0", "Income");
			sdriver.closeKeyboard();
			wait(2);
			click(continueButtre, "continue");
			// Verification
			String amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display: "
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display:"
								+ amountgreaterthan$0actmsg);
			}

			/*	sdriver.closeKeyboard();
			wait(2);
			click(clickMyjob, "click dropdown");

			click(ClickRetirement, "ClickRetirement");*/

			/*
			 * type(CompanyName, CurrentEmployer, "Current job");
			 * 
			 * type(phone, EmployerPhoneNumber, "Phone");
			 * sdriver.closeKeyboard(); click(Select, "Select Income"); wait(2);
			 * click(lessThan6, "LessThan6");
			 */

			// enter income
			/*wait(1);
			type(Company, CurrentEmployer, "Current job");
			type(income, "0", "Income");
			sdriver.closeKeyboard();
			wait(2);
			click(continueButtre, "continue");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display: "
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display:"
								+ amountgreaterthan$0actmsg);
			}*/

			/*
			 * //self employment click(clickMyjob, "click dropdown");
			 * 
			 * click(myJobIncome, "MyJobIncome");
			 * 
			 * type(CompanyName, CurrentEmployer, "Current job");
			 * 
			 * wait(1); type(income, "0", "Income"); sdriver.closeKeyboard();
			 * wait(2); click(continueButtre, "continue"); // Verification
			 * amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
			 * "Please enter an amount greater than $0"); if
			 * (amountgreaterthan$0actmsg
			 * .equalsIgnoreCase("Please enter an amount greater than $0")) {
			 * extentLogs
			 * .pass("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk"
			 * , "Validation message Should display: " +
			 * amountgreaterthan$0actmsg); } else { extentLogs
			 * .fail("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk"
			 * , "Validation message Should not display:" +
			 * amountgreaterthan$0actmsg); }
			 */

			extentLogs.pass("Verify Monthly Take Home Income",
					"Completed Monthly Take Home Income Successfully");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify Monthly Take Home Income",
					"Monthly Take Home Income Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter  
	 * @MethodName cancelbtn
	 * @return
	 * @throws 
	 */
	public void cancelbtn() throws Exception {
		if (isElementPresent(CANCEL, "Cancel Button")) {
			click(CANCEL, "CANCEL Button");
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName Exitbtn
	 * @return
	 * @throws 
	 */
	public void Exitbtn() throws Exception {
		if (isElementPresent(EXIT, "EXIT Button")) {
			click(EXIT, "EXIT Button");
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter   ref1FirstName,  ref1LastName, ref1Number,  ref2FirstName,  ref2LastName, ref2Number,  ref3FirstName,  ref3LastName,ref3Number
	 * @MethodName Createmyorderhybridstore
	 * @return
	 * @throws 
	 */
	public boolean Createmyorderhybridstore(String ref1FirstName,
			String ref1LastName, String ref1Number, String ref2FirstName,
			String ref2LastName, String ref2Number, String ref3FirstName,
			String ref3LastName, String ref3Number) throws Exception {

		if (isElementPresent(referenceOneFirstName, "Reference One First Name")) {

			// first reference
			type(referenceOneFirstName, ref1FirstName,
					"Reference One First Name");
			type(referenceOneLastName, ref1LastName, "Reference One Last Name");
			// phone number
			type(phone, ref1Number, "Phone");
			click(referenceOneRelationfirst, "Relationship");
			click(referenceOneRelationFriend, "Reference One Relation Friend");
			// first reference

			type(referenceTwoFirstName, ref2FirstName, "ReferenceTwo FirstName");
			type(referenceTwoLastName, ref2LastName, "ReferenceTwo LastName");

			// phone number
			type(phone, ref2Number, "Phone");
			// related to you
			click(referenceOneRelationtwo, "Relationship");
			click(referenceTwoRelationFriendselect,
					"referenceTwoRelationFriend");
			type(referenceThreeFirstName, ref3FirstName,
					"ReferenceThree FirstName");
			type(referenceThreeLastName, ref3LastName,
					"ReferenceThree LastName");
			// phone number
			type(phone, ref3Number, "Phone");
			click(referenceOneRelationthree, "Relationship");
			click(referenceThreeRelationAunt,
					"ReferenceThree Relation Aunt/Uncle");
			continueButton();
			continueButton();
			click(CONFIRM, "CONFIRM");
			continueButton();
			continueButton();

			waitForElementPresent(Email, 60);
			click(Email, "Email");
			continueButton();
			Thread.sleep(30000);
			waitForElementPresent(CompanyNamechange, 60);

			GmailAPI ga = new GmailAPI();
			String code = ga.verificationCode();
			wait(6);
			System.out.println("gmail:" + code);
			type(CompanyNamechange, code, "Email code");
			ele = waitForElement(continuebtn, 60, "continueButton");
			click(ele, "continueButton");
			ele = waitForElementPresent(CREATEMYORDER, 60, "CREATE MY ORDER");

			click(ele, "Create MyOrder Button");

			ele = waitForElementPresent(CREATEMYORDER, 60);

			click(ele, "create MyOrder Button");
			extentLogs.pass("Verify complete Create MyOrder",
					"Completed Create MyOrder");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify complete Create MyOrder",
					" Create MyOrder Failed");
			return false;
		}

	}


	/**
	 * @author @Cigniti
	 * @parameter  ref1FirstName,  ref1LastName, ref1Number,  ref2FirstName,  ref2LastName, ref2Number,  ref3FirstName,  ref3LastName,ref3Number
	 * @MethodName Createmyorder
	 * @return
	 * @throws 
	 */
	public boolean Createmyorder(String ref1FirstName, String ref1LastName,
			String ref1Number, String ref2FirstName, String ref2LastName,
			String ref2Number, String ref3FirstName, String ref3LastName,
			String ref3Number) throws Exception {
		try {
		if (isElementPresent(referenceOneFirstName, "Reference One First Name")) {

			// first reference
			type(referenceOneFirstName, ref1FirstName,
					"Reference One First Name");
			type(referenceOneLastName, ref1LastName, "Reference One Last Name");
			// phone number
			type(phone, ref1Number, "Phone");
			click(referenceOneRelationfirst, "Relationship");
			click(referenceOneRelationFriend, "Reference One Relation Friend");
			// first reference

			type(referenceTwoFirstName, ref2FirstName, "ReferenceTwo FirstName");
			type(referenceTwoLastName, ref2LastName, "ReferenceTwo LastName");

			// phone number
			type(phone, ref2Number, "Phone");
			// related to you
			click(referenceOneRelationtwo, "Relationship");
			click(referenceTwoRelationFriendselect,
					"referenceTwoRelationFriend");
			type(referenceThreeFirstName, ref3FirstName,
					"ReferenceThree FirstName");
			type(referenceThreeLastName, ref3LastName,
					"ReferenceThree LastName");
			// phone number
			type(phone, ref3Number, "Phone");
			click(referenceOneRelationthree, "Relationship");
			click(referenceThreeRelationAunt,
					"ReferenceThree Relation Aunt/Uncle");
			continueButton();
			continueButton();
			click(CONFIRM, "CONFIRM");
			continueButton();
			continueButton();

			/*
			 * if(isElementPresent(confirmationcodeSecondaryemail,
			 * "To confirm your identity we will be sending you a temporary confirmation code."
			 * )){
			 * 
			 * click(confirmationcodeSecondaryemail,
			 * "confirmation code Secondary Email"); continueButton(); }
			 * if(isElementPresent(ANOWCOWORKEROVERRIDE,
			 * "ANOW COWORKER OVERRIDE")){
			 * 
			 * click(ANOWCOWORKEROVERRIDE, "ANOW COWORKER OVERRIDE"); }
			 * type(Enteryourassociatelogin, "U66201xteam",
			 * "Enter your associate Login"); click(CONFIRM, "CONFIRM");
			 * 
			 * if(isElementPresent(Empname, "ANOW Coworker Override ")){
			 * type(Empname, "xyztester", "Employee Name"); type(EmpID, "1234",
			 * "Enter Employee Id"); type(Comments, "tester",
			 * "Enter reasons for Overriding"); continueButton(); wait(2);
			 * click(deletevalue, "deletevalue"); wait(2); continueButton();
			 * 
			 * }
			 */

			ele = waitForElementPresent(CREATEMYORDER, 60, "CREATE MY ORDER");

			click(ele, "Create MyOrder Button");

			ele = waitForElementPresent(CREATEMYORDER, 60);

			click(ele, "create MyOrder Button");
			extentLogs.pass("Verify complete Create MyOrder",
					"Completed Create MyOrder");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify complete Create MyOrder",
					" Create MyOrder Failed");
			return false;
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DriverNoResetFlag;
	}

	
	
	/**
	 * @author @Cigniti
	 * @parameter  ref1FirstName,  ref1LastName, ref1Number,  ref2FirstName,  ref2LastName, ref2Number,  ref3FirstName,  ref3LastName,ref3Number
	 * @MethodName Createmyorder
	 * @return
	 * @throws 
	 */
	public boolean CreatemyorderAddItemLimit(String ref1FirstName, String ref1LastName,
			String ref1Number, String ref2FirstName, String ref2LastName,
			String ref2Number, String ref3FirstName, String ref3LastName,
			String ref3Number) throws Exception {

		if (isElementPresent(referenceOneFirstName, "Reference One First Name")) {

			// first reference
			type(referenceOneFirstName, ref1FirstName,
					"Reference One First Name");
			type(referenceOneLastName, ref1LastName, "Reference One Last Name");
			// phone number
			type(phone, ref1Number, "Phone");
			click(referenceOneRelationfirst, "Relationship");
			click(referenceOneRelationFriend, "Reference One Relation Friend");
			// first reference

			type(referenceTwoFirstName, ref2FirstName, "ReferenceTwo FirstName");
			type(referenceTwoLastName, ref2LastName, "ReferenceTwo LastName");

			// phone number
			type(phone, ref2Number, "Phone");
			// related to you
			click(referenceOneRelationtwo, "Relationship");
			click(referenceTwoRelationFriendselect,
					"referenceTwoRelationFriend");
			type(referenceThreeFirstName, ref3FirstName,
					"ReferenceThree FirstName");
			type(referenceThreeLastName, ref3LastName,
					"ReferenceThree LastName");
			// phone number
			type(phone, ref3Number, "Phone");
			click(referenceOneRelationthree, "Relationship");
			click(referenceThreeRelationAunt,
					"ReferenceThree Relation Aunt/Uncle");
			continueButton();
			continueButton();
			click(CONFIRM, "CONFIRM");
			continueButton();
			continueButton();

			
			  if(isElementPresent(confirmationcodeSecondaryemail,
			 "To confirm your identity we will be sending you a temporary confirmation code."
			 )){
			 
			 click(confirmationcodeSecondaryemail,
			 "confirmation code Secondary Email"); continueButton(); }
			  if(isElementPresent(ANOWCOWORKEROVERRIDE,
			 "ANOW COWORKER OVERRIDE")){
			  
			 click(ANOWCOWORKEROVERRIDE, "ANOW COWORKER OVERRIDE"); }
			  type(Enteryourassociatelogin, "U66201xteam",
			  "Enter your associate Login"); click(CONFIRM, "CONFIRM");
			  
			 if(isElementPresent(Empname, "ANOW Coworker Override ")){
			 type(Empname, "xyztester", "Employee Name"); type(EmpID, "1234",
			 "Enter Employee Id"); type(Comments, "tester",
			 "Enter reasons for Overriding"); continueButton(); wait(2);
			 click(deletevalue, "deletevalue"); wait(2); continueButton();
			  
			  }
			

			ele = waitForElementPresent(CREATEMYORDER, 60, "CREATE MY ORDER");

			click(ele, "Create MyOrder Button");

			ele = waitForElementPresent(CREATEMYORDER, 60);

			click(ele, "create MyOrder Button");
			ele = waitForElementPresent(OK, 60);
			click(ele, "Click OK Button");
			extentLogs.pass("Verify complete Create MyOrder",
					"Completed Create MyOrder");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify complete Create MyOrder",
					" Create MyOrder Failed");
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter  ref1FirstName,  ref1LastName, ref1Number,  ref2FirstName,  ref2LastName, ref2Number,  ref3FirstName,  ref3LastName,ref3Number
	 * @MethodName Threereferences
	 * @return
	 * @throws 
	 */
	public boolean Threereferences(String ref1FirstName, String ref1LastName,
			String ref1Number, String ref2FirstName, String ref2LastName,
			String ref2Number, String ref3FirstName, String ref3LastName,
			String ref3Number) throws Exception {

		if (isElementPresent(referenceOneFirstName, "Reference One First Name")) {

			// first reference
			type(referenceOneFirstName, ref1FirstName,
					"Reference One First Name");
			type(referenceOneLastName, ref1LastName, "Reference One Last Name");
			// phone number
			type(phone, ref1Number, "Phone");
			click(referenceOneRelationfirst, "Relationship");
			click(referenceOneRelationFriend, "Reference One Relation Friend");
			// first reference

			type(referenceTwoFirstName, ref2FirstName, "ReferenceTwo FirstName");
			type(referenceTwoLastName, ref2LastName, "ReferenceTwo LastName");

			// phone number
			type(phone, ref2Number, "Phone");
			// related to you
			click(referenceOneRelationtwo, "Relationship");
			click(referenceTwoRelationFriendselect,
					"referenceTwoRelationFriend");
			type(referenceThreeFirstName, ref3FirstName,
					"ReferenceThree FirstName");
			type(referenceThreeLastName, ref3LastName,
					"ReferenceThree LastName");
			// phone number
			type(phone, ref3Number, "Phone");
			click(referenceOneRelationthree, "Relationship");
			click(referenceThreeRelationAunt,
					"ReferenceThree Relation Aunt/Uncle");
			continueButton();
			continueButton();
			click(CONFIRM, "CONFIRM");
			continueButton();
			continueButton();

			extentLogs.pass("Verify complete Three References",
					"Completed Three References");
			return true;
		} else {
			extentLogs.fail(sdriver, "Verify complete Three References",
					" Three References Failed");
			return false;
		}
	}

	/**
	 * @author @Cigniti
	 * @parameter   associateMannedlogin
	 * @MethodName Verifythattheapplicationisdeclined
	 * @return
	 * @throws 
	 */
	public boolean Verifythattheapplicationisdeclined(
			String associateMannedlogin) throws Exception {
		type(Enteryourassociatelogin, associateMannedlogin,
				"Enter your associate Login");
		click(SUBMIT, "SUBMIT");

		if (isElementPresent(Headeraccount,
				"We are not able to approve your application at this time.")) {
			extentLogs
			.pass("Verify that the application is declined ",
					"We are not able to approve your application at this time.");
			return true;
		} else {
			extentLogs.fail(sdriver,
					"Verify that the application is declined ",
					" We are able to approve your application at this time.");
			return false;
		}
	}


	/**
	 * @author @Cigniti
	 * @parameter   EfirstName,  LastName, primaryPhno,  phoneType,  Email, cnfEmail,  addrLine1,  zipCode, ssnnumber1,  ssnnumber2,  ssnnumber3, verifySsn1,  verifySsn2,  verifySsn3, drivingLicense,  idState,  DOB, SecondaryPhone,  CurrentEmployer, MonthlyTakeHomeIncome,  EmployerPhoneNumber, ref1FirstName,  ref1LastName,  ref1Number,ref2FirstName,  ref2LastName,  ref2Number,ref3FirstName,  ref3LastName,  ref3Number
	 * @MethodName getapprovedtestdata
	 * @return
	 * @throws 
	 */
	public boolean getapprovedtestdata(String EfirstName, String LastName,
			String primaryPhno, String phoneType, String Email,
			String cnfEmail, String addrLine1, String zipCode,
			String ssnnumber1, String ssnnumber2, String ssnnumber3,
			String verifySsn1, String verifySsn2, String verifySsn3,
			String drivingLicense, String idState, String DOB,
			String SecondaryPhone, String CurrentEmployer,
			String MonthlyTakeHomeIncome, String EmployerPhoneNumber,
			String ref1FirstName, String ref1LastName, String ref1Number,
			String ref2FirstName, String ref2LastName, String ref2Number,
			String ref3FirstName, String ref3LastName, String ref3Number)
					throws Exception {
		if (isElementPresent(GETAPPROVED, "GET APPROVED")) {

			YourInformation(EfirstName, LastName, primaryPhno, Email, cnfEmail);
			// mailing
			mailingaddress(addrLine1, zipCode);
			SocialSecuritynumber(ssnnumber1, ssnnumber2, ssnnumber3,
					verifySsn1, verifySsn2, verifySsn3);
			StateIDnumber(drivingLicense, idState);
			Takephoto(DOB, SecondaryPhone);
			workingcompany(CurrentEmployer, MonthlyTakeHomeIncome,
					EmployerPhoneNumber);
			Createmyorder(ref1FirstName, ref1LastName, ref1Number,
					ref2FirstName, ref2LastName, ref2Number, ref3FirstName,
					ref3LastName, ref3Number);

			// extentLogs.pass("Verify complete Create MyOrder",
			// "Completed Create MyOrder");
			return true;
		} else {
			// extentLogs.fail("Verify complete Create MyOrder",
			// " Create MyOrder Failed");
			return false;
		}

	}

	public void fillCustomerInfo(String addrLine1, String city, String state,
			String zipCode, String ssn1, String ssn2, String ssn3,
			String verifySsn1, String verifySsn2, String verifySsn3,
			String drivingLicense, String idState, String dobMonth,
			String dobDay, String dobYear, String callTime,
			String secondaryPhoneType, String phoneSecondary) {
		try {

		} catch (Throwable e) {
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
		ele = waitForElement(continueButtonText, 60, "continueButton");
		click(ele, "continueButton");

	}

	/**
	 * @author @Cigniti
	 * @parameter 
	 * @MethodName continueButtoninHome
	 * @return
	 * @throws 
	 */
	public void continueButtoninHome() throws Exception {
		ele = waitForElement(continueButtre, 60, "continueButton");
		click(ele, "continueButton");

	}

	/**
	 * @author @Cigniti
	 * @parameter  
	 * @MethodName CustomerZipCodecannotbe_00000
	 * @return
	 * @throws 
	 */
	public void CustomerZipCodecannotbe_00000() throws Exception {
		try {	
			click(GETAPPROVED, "GET APPROVED");
		
		type(firstName, genrateRandomUser(), "firstName");
		type(lastName, "tester", "lastName");
		// continueButton();

		// enter mobile no

		type(phone, "9789893333", "Phone");
		// click(continueB, "continue Button");
		Thread.sleep(1000);
		type(email, "ravi.munigeri@Rentcenter.com", "email");
		type(confirmEmail, "ravi.munigeri@Rentcenter.com", "confirmEmail");
		sdriver.closeKeyboard();
		continueButton();

		Thread.sleep(1000);
		// mailing

		ele = waitForElementPresent(street1, 60, "street Name");
		type(ele, "alexander", "street Name");
		ele = waitForElementPresent(postalCode, 60, "Postal Code");
		clear(ele, "Postal Code");
		// 85282
		type(ele, "00000", "Postal Code");
		type(City, "Tempe", "City");
		type(ST, "AZ", "ST");
		wait(1);
		continueButton();
		String validzipcodeactmsg = getText(plzzipCodetxt,
				"Please enter a valid zip code");
		if (validzipcodeactmsg
				.equalsIgnoreCase("Please enter a valid zip code")) {
			extentLogs.pass("Verify Customer Zip Code cannot be 00000 - Kiosk",
					"User should not be allowed Zip Code  error Message:"
							+ validzipcodeactmsg);
		} else {
			extentLogs.fail(sdriver,
					"Verify Customer Zip Code cannot be 00000 - Kiosk",
					"User should  allowed Zip Code error Message:"
							+ validzipcodeactmsg);
		}
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author @Cigniti
	 * @parameter   
	 * @MethodName Verify_Monthly_Take_Home_Income_cannot_be_0
	 * @return
	 * @throws 
	 */
	public void Verify_Monthly_Take_Home_Income_cannot_be_0() throws Exception {
		try {	
			// enter income
			type(income, "0", "Income");
			continueButton();
			// Verification
			String amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display: "
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_MyJobIncome_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display:"
								+ amountgreaterthan$0actmsg);
			}
			/*
			 * click(BACK, "BACK Button"); click(BACK, "BACK Button"); click(BACK,
			 * "BACK Button"); click(BACK, "BACK Button");
			 */
			// SelfEmployment
			ele = waitForElementPresent(SelfEmployment, 60, "Self Employment");
			click(ele, " Select SelfEmployment");
			/*
			 * click(continueB, "continue Button");
			 * 
			 * ele = waitForElementPresent(CompanyNamechange, 60, "Current job");
			 * type(ele, "Cigniti", "Current job"); click(continueB,
			 * "continue Button"); // enter income wait(1);
			 */
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(continueButt, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_SelfEmployment_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display :"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_SelfEmployment_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display :"
								+ amountgreaterthan$0actmsg);
			}

			/*
			 * click(BACK, "BACK Button");
			 * 
			 * click(BACK, "BACK Button");
			 */
			// SocialSecurity
			ele = waitForElementPresent(SocialSecurity, 60, "Social Security");
			click(ele, "Select SocialSecurity");
			click(continueB, "continue Button");
			// enter income
			wait(1);
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(continueButt, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_SocialSecurity_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display :"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_SocialSecurity_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display :"
								+ amountgreaterthan$0actmsg);
			}
			click(BACK, "BACK Button");
			// Retirement
			ele = waitForElementPresent(Retirement, 60, "Retirement");
			click(ele, "Select Retirement");
			click(continueB, "continue Button");
			// enter income
			wait(1);
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(continueButt, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_Retirement_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should  display :"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail("Verify_Retirement_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display:"
								+ amountgreaterthan$0actmsg);
			}
			click(BACK, "BACK Button");
			// Pension
			ele = waitForElementPresent(Pension, 60, "Pension");
			click(ele, "Select Pension");
			click(continueB, "continue Button");
			// enter income
			wait(1);
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(continueButt, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_Pension_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display:"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail(sdriver,
						"Verify_Pension_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display :"
								+ amountgreaterthan$0actmsg);
			}

			click(BACK, "BACK Button");
			// Disability
			ele = waitForElementPresent(Disability, 60, "Disability");
			click(ele, "Select Disability");
			click(continueB, "continue Button");
			// enter income
			wait(1);
			clear(incomeclear, "Income");
			type(incomeclear, "0", "Income");
			click(continueButt, "continue Button");
			// Verification
			amountgreaterthan$0actmsg = getText(amountgreaterthan$0,
					"Please enter an amount greater than $0");
			if (amountgreaterthan$0actmsg
					.equalsIgnoreCase("Please enter an amount greater than $0")) {
				extentLogs
				.pass("Verify_Disability_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should display:"
								+ amountgreaterthan$0actmsg);
			} else {
				extentLogs
				.fail(sdriver,
						"Verify_Disability_Monthly_Take_Home_Income_cannot_be_0_Kiosk",
						"Validation message Should not display:"
								+ amountgreaterthan$0actmsg);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}