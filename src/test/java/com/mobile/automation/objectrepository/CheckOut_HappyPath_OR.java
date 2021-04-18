package com.mobile.automation.objectrepository;

import java.net.MalformedURLException;
import java.util.LinkedHashMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.experitest.appium.SeeTestAndroidDriver;
import com.experitest.appium.SeeTestIOSDriver;
import com.mobile.automation.accelerators.MobileActionLibrary;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.ActionsLibrary.Mode;
import com.web.automation.accelerators.TestEngineWeb;

public class CheckOut_HappyPath_OR {

	///private static MobileActionLibrary mob_actionLib;



	//private SeeTestAndroidDriver<AndroidElement> driver;
	public CheckOut_HappyPath_OR() throws MalformedURLException {
		//	this.driver = driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(MobileActionLibrary.Adriver, this);
	}



	@FindBy(xpath = "//*[@id='menu_button' and @resource-id='com.android.chrome:id/menu_button']")
	public WebElement CHROMETOOLS;



	//enterzipcode

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='enterZipCode_Nav']")
	public WebElement Zipcode;

	@FindBy(xpath = "//*[@nodeName='BUTTON'  and contains(@text,'Go')]")
	public WebElement Go;

	@FindBy(xpath = "//*[@nodeName='A' and @id='storeResults_1_myStoreBtn' and @text='   Make This My Store']")
	public WebElement MakeMyStore;

	//ContinueButton

	@FindBy(xpath = "//*[@nodeName='BUTTON' and contains(@text,'Continue')]")
	public WebElement Continue;


	public void enterzipcode(String strzipcode) throws Exception{
		if(MobileActionLibrary.IsElementExist(Zipcode, "Zip Code Dialogue")){

			MobileActionLibrary.type(Zipcode, strzipcode);

			MobileActionLibrary.clickonelement(Go, "Go");

			MobileActionLibrary.clickonelement(MakeMyStore,"Make My Store");
		}
	}


	//searchproduct

	@FindBy(xpath = "//*[@nodeName='NAV' and @id='mobileCategoryMenu']/*[3]")
	public WebElement SearchButton;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='input_SearchBox' and @placeholder='Search Rent-A-Center.com']")
	public WebElement Search;



	public void searchproduct(String product) {

		MobileActionLibrary.wait(3);
		MobileActionLibrary.clickonelement(SearchButton, "Search");

		MobileActionLibrary.type(Search, product);

		MobileActionLibrary.clickonelement(Go,"Go");
	}


	//selectproduct

	@FindBy(xpath = "//*[@nodeName='DIV' and @class='products row list-group']/*[1]/*[1]/*[3]/*[1]/*[1]")
	public WebElement SelectProduct;

	public void selectproduct() {
		MobileActionLibrary.wait(3);

		MobileActionLibrary.clickonelement(SelectProduct, "First Visible Product");

	}

	//OrderOnline

	@FindBy(xpath = "//*[@nodeName='A' and @id='rent_btn' and @title='Order Online']")
	public WebElement OrderOnline;

	public void OrderOnline() {
		MobileActionLibrary.wait(5);

		MobileActionLibrary.clickonelement(OrderOnline, "Order Online");

	}

	//ContinueAsGuest

	@FindBy(xpath = "//*[@nodeName='A' and @text='Continue as Guest']")
	public WebElement ContinueAsGuest;



	public void ContinueAsGuest() {
		MobileActionLibrary.wait(6);

		MobileActionLibrary.clickonelement(ContinueAsGuest,"ContinueAsGuest");

	}

	//CustomerInformation

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='first-name' and @placeholder='First Name']")
	public WebElement FirstName;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='last-name' and @placeholder='Last Name']")
	public WebElement LastName;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='phone-number' and @placeholder='Phone Number']")
	public WebElement PhoneNumber;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='PhoneTypeDropDownList']")
	public WebElement PhoneType;

	@FindBy(xpath = "//*[@id='text1' and @text='Home']")
	public WebElement SelectPhoneType;



	public void CustomerInformation(String lastname) {

		MobileActionLibrary.type(FirstName,ActionsLibrary.generateRandomString(10, Mode.ALPHA));

		MobileActionLibrary.type(LastName,lastname);

		MobileActionLibrary.type(PhoneNumber,"214"+ActionsLibrary.generateRandomString(7, Mode.NUMERIC));

		MobileActionLibrary.clickonelement(PhoneType, "Phone Type");

		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.clickonelement(SelectPhoneType,"SelectPhoneType");

		MobileActionLibrary.context("WEBVIEW_1");
		MobileActionLibrary.clickonelement(Continue, "Continue");


	}



	//SetAddress

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='home-address']")
	public WebElement HomeAddress;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='delivery_city']")
	public WebElement DeliveryCity;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='stateDropDownList']")
	public WebElement State;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='delivery_zipCode']")
	public WebElement ZipCode;

	@FindBy(xpath = "//*[@nodeName='A' and @id='select_suggested_full_address_link' and @text='Select']")
	public WebElement SelectSuggestedAddress;



	public void SetAddress(String homeaddress,String city,String statecode,String zipcode) throws Exception {

		By StateCode = By.xpath("xpath=//*[@id='text1' and @class='android.widget.CheckedTextView' and contains(@text,'"+statecode+"')]");
		MobileActionLibrary.wait(4);

		MobileActionLibrary.type(HomeAddress,homeaddress);

		MobileActionLibrary.type(DeliveryCity,city);

		MobileActionLibrary.clickonelement(State, "State");
		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.swipeDownWhileNotFound(StateCode);

		MobileActionLibrary.context("WEBVIEW_1");
		MobileActionLibrary.type(ZipCode,zipcode);
		MobileActionLibrary.clickonelement(Continue,"Continue");

		if(MobileActionLibrary.IsElementExist(SelectSuggestedAddress, "Select")){

			MobileActionLibrary.clickonelement(SelectSuggestedAddress, "Suggested Address");

		}
	}

	//EnterEmailAddress

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='email-address']")
	public WebElement Email;



	public void EnterEmailAddress(String email) {
		MobileActionLibrary.wait(3);

		MobileActionLibrary.type(Email,email);
		MobileActionLibrary.clickonelement(Continue,"Continue");

	}

	//EnterDOB

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='month-of-birth']")
	public WebElement Month;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='date-of-birth']")
	public WebElement Day;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='year-of-birth']")
	public WebElement Year;



	public void EnterDOB(String month,String day,String year) {
		
		By SelectMonth = By.xpath("xpath=//*[@id='text1' and @class='android.widget.CheckedTextView' and contains(@text,"+month+")]");
		By SelectDay = By.xpath("xpath=//*[@id='text1' and @class='android.widget.CheckedTextView' and contains(@text,"+day+")]");
		By SelectYear = By.xpath("xpath=//*[@id='text1' and @class='android.widget.CheckedTextView' and contains(@text,"+year+")]");
		
		MobileActionLibrary.wait(3);
		
		MobileActionLibrary.clickonelement(Month, "Month");
		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.swipeDownWhileNotFound(SelectMonth);
		MobileActionLibrary.context("WEBVIEW_1");
		
		MobileActionLibrary.clickonelement(Day,"Day");
		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.swipeDownWhileNotFound(SelectDay);
		MobileActionLibrary.context("WEBVIEW_1");
		
		MobileActionLibrary.clickonelement(Year,"Year");
		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.swipeDownWhileNotFound(SelectYear);
		MobileActionLibrary.context("WEBVIEW_1");
		
		MobileActionLibrary.clickonelement(Continue,"Continue");

	}

	//EnterDLandSSN

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='driversLicence']")
	public WebElement DriverLicence;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='stateDropDownListDL']")
	public WebElement DLState;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ssNo-1']")
	public WebElement SSN1;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ssNo-2']")
	public WebElement SSN2;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ssNo-3']")
	public WebElement SSN3;

	public void EnterDLandSSN(String DL,String state,String ssn1,String ssn2,String ssn3) {
		By DLIssuing = By.xpath("xpath=//*[@id='text1' and @class='android.widget.CheckedTextView' and contains(@text,'"+state+"')]");

		MobileActionLibrary.wait(3);

		MobileActionLibrary.type(DriverLicence,DL);

		MobileActionLibrary.clickonelement(DLState, "DL State");
		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.swipeDownWhileNotFound(DLIssuing);
		MobileActionLibrary.context("WEBVIEW_1");

		//MobileActionLibrary.type(DriverLicence,DL);

		MobileActionLibrary.type(SSN1,ssn1);
		MobileActionLibrary.type(SSN2,ssn2);
		MobileActionLibrary.type(SSN3,ssn3);

		MobileActionLibrary.clickonelement(Continue,"Continue");

	}

	//EmployerInfo

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='primaryScourceIncome']")
	public WebElement PrimarySource;

	@FindBy(xpath = "//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'My Job')]")
	public WebElement SourceType;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='howLong']")
	public WebElement EmpLength;

	@FindBy(xpath = "//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'1 to 5 years')]")
	public WebElement EmpLengthSe;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='employer-name']")
	public WebElement EmpName;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='employer-phNo']")
	public WebElement EmpPh;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='iGetPaidDD']")
	public WebElement Pay;

	@FindBy(xpath = "//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'Bi-Weekly')]")
	public WebElement PayTerm;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='monthly-takeHome']")
	public WebElement Paid;



	public void EmployerInfo(String empname,String empph,String paid){

		MobileActionLibrary.wait(3);
		MobileActionLibrary.clickonelement(PrimarySource,"Primary Source of Income");

		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.clickonelement(SourceType,"SourceType");
		MobileActionLibrary.context("WEBVIEW_1");

		MobileActionLibrary.clickonelement(EmpLength, "Employment Length");

		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.clickonelement(EmpLengthSe,"EmpLengthSe");
		MobileActionLibrary.context("WEBVIEW_1");


		MobileActionLibrary.type(EmpName,empname);

		MobileActionLibrary.type(EmpPh,empph);

		MobileActionLibrary.clickonelement(Pay, "Pay");

		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.clickonelement(PayTerm,"PayTerm");
		MobileActionLibrary.context("WEBVIEW_1");

		MobileActionLibrary.type(Paid,paid);

		MobileActionLibrary.clickonelement(Continue,"Continue");


	}


	//Reference#1

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ref1-firstname']")
	public WebElement RefFirstName;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ref1-lastname']")
	public WebElement RefLastName;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ref1-phoneNo']")
	public WebElement RefPhone;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='refRelationship1']")
	public WebElement RefRelation;

	@FindBy(xpath = "//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'Parent')]")
	public WebElement RelationType;


	public void RefInfo(String reffirstname,String refsecondname,String refphone ){

		MobileActionLibrary.wait(3);

		MobileActionLibrary.type(RefFirstName,reffirstname);

		MobileActionLibrary.type(RefLastName,refsecondname);

		MobileActionLibrary.type(RefPhone,refphone);

		MobileActionLibrary.clickonelement(RefRelation, "Relation Type");

		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.clickonelement(RelationType,"RelationType");
		MobileActionLibrary.context("WEBVIEW_1");

		MobileActionLibrary.clickonelement(Continue,"Continue");



	}


	//Reference#2

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ref2-firstname']")
	public WebElement Ref2FirstName;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ref2-lastname']")
	public WebElement Ref2LastName;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ref2-phoneNo']")
	public WebElement Ref2Phone;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='refRelationship2']")
	public WebElement Ref2Relation;

	@FindBy(xpath = "//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'Parent')]")
	public WebElement Ref2RelationType;


	public void Ref2Info(String ref2firstname,String ref2secondname,String ref2phone ){

		MobileActionLibrary.wait(3);

		MobileActionLibrary.type(Ref2FirstName,ref2firstname);

		MobileActionLibrary.type(Ref2LastName,ref2secondname);

		MobileActionLibrary.type(Ref2Phone,ref2phone);

		MobileActionLibrary.clickonelement(Ref2Relation, "Relation Type");

		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.clickonelement(Ref2RelationType,"Ref2RelationType");
		MobileActionLibrary.context("WEBVIEW_1");

		MobileActionLibrary.clickonelement(Continue,"Continue");



	}


	//Reference#3

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ref3-firstname']")
	public WebElement Ref3FirstName;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ref3-lastname']")
	public WebElement Ref3LastName;

	@FindBy(xpath = "//*[@nodeName='INPUT' and @id='ref3-phoneNo']")
	public WebElement Ref3Phone;

	@FindBy(xpath = "//*[@nodeName='SELECT' and @id='refRelationship3']")
	public WebElement Ref3Relation;

	@FindBy(xpath = "//*[@id='text1' and @resource-id='android:id/text1' and contains(@text,'Parent')]")
	public WebElement Ref3RelationType;


	public void Ref3Info(String ref3firstname,String ref3secondname,String ref3phone ){

		MobileActionLibrary.wait(3);

		MobileActionLibrary.type(Ref3FirstName,ref3firstname);

		MobileActionLibrary.type(Ref3LastName,ref3secondname);

		MobileActionLibrary.type(Ref3Phone,ref3phone);

		MobileActionLibrary.clickonelement(Ref3Relation, "Relation Type");

		MobileActionLibrary.context("NATIVE_APP");
		MobileActionLibrary.clickonelement(Ref3RelationType,"Ref3RelationType");
		MobileActionLibrary.context("WEBVIEW_1");

		MobileActionLibrary.clickonelement(Continue,"Continue");



	}
	//Review and Edit
	@FindBy(xpath = "xpath=//*[@nodeName='A' and @id='customCheckBox']")
	public WebElement ReviewCheckBox;

	public void ReviewnEdit(){

		MobileActionLibrary.wait(3);

		MobileActionLibrary.clickonelement(ReviewCheckBox, "Agree to TnC");
		MobileActionLibrary.clickonelement(Continue,"Continue");

	}


	//Confirmation Message
	@FindBy(xpath = "xpath=//*[@nodeName='H2' and contains(@text,'Congratulations,')]")
	public WebElement CongratulationsMessage;

	public void SuccessMessageVerification() throws Exception{

		MobileActionLibrary.wait(3);

		MobileActionLibrary.assertElementExists(CongratulationsMessage, "Congratulations!! You are approved");

	}
	
	
	
}