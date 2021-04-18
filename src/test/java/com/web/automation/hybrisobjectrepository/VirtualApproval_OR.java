package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

// This file will contain the objects of Virtual Approval Screens 

public class VirtualApproval_OR {
	
    // Start your order PAGE TITLE
	
	public static By VIRTUALAPPROVAL_PAGETITLE = By.xpath("//div[contains(text(),'Get Approved Now')]");
		
	// CONTACT AND DELIVERY INFO SECTION
	
	public static By CONTACTANDDELIVERYINFO_PAGETITLE = By.xpath("//span[contains(text(),'Contact & Delivery Info')]");
	
	public static By VA_CUSTOMER_FIRSTNAME = By.cssSelector("#first-name");
	public static By VA_CUSTOMER_LASTNAME = By.cssSelector("#last-name");
	public static By VA_CUSTOMER_EMAILADDRESS = By.cssSelector("#emailId");
	public static By VA_CUSTOMER_VERIFYEMAILADDRESS = By.cssSelector("#verifyEmailId");
	public static By VA_PHONENUMBER = By.cssSelector("#phone-number");
	public static By VA_DELIVERYADDRESS = By.cssSelector("#address");
	public static By VA_APTNUMBER = By.cssSelector("#apartment_number");
	public static By VA_CITY = By.cssSelector("#city");
	public static By VA_STATE = By.cssSelector("#stateDropDown");
	public static By VA_ZIPCODE = By.xpath("//input[@id='zipcode']");
	public static By VA_SUBMIT_CONTACTINFORMATION = By.xpath("//span[@title='Submit Contact Information']");
	public static By VA_JUSTWANT_STORETOCONTACTYOU = By.xpath("//div[contains(text(),'Just want store to contact you?')]");
	public static By VA_JUSTCONTACTME = By.xpath("//a[contains(text(),' NO THANKS, JUST CONTACT ME')]");
	
	public static By VA_CONTINUE = By.xpath("(//span[contains(text(),'CONTINUE')])[1]");
	public static By VA_UPDATE = By.xpath("//span[contains(text(),'Update')]");
	public static By VA_EDIT = By.xpath("//a[contains(text(),'Edit')]"); 
	
	// EMPLOYMENT AND REFERENCES SECTION
	
	public static By VA_EMPLOYMENTREFERENCES_PAGETITLE = By.xpath("//span[contains(text(),'Employment & References')]");
	
	// DL,SSN DETAILS SECTION
	
	public static By VA_CUSTOMER_DOB_MONTH = By.cssSelector("#bday-mm");
	public static By VA_CUSTOMER_DOB_DAY = By.cssSelector("#bday-dd");
	public static By VA_CUSTOMER_DOB_YEAR = By.cssSelector("#bday-yyyy");
	public static By VA_CUSTOMER_DL = By.cssSelector("#driversLicence");
	public static By VA_CUSTOMER_STATE = By.cssSelector("#stateDropDownListDL");
	public static By VA_CUSTOMER_SSN =By.cssSelector("#socialSecurity");
			
	//EMPLOYMENT INFO

	public static By VA_EMPLOYMENTSECTION_TITLE = By.xpath("//label[contains(text(),'Employment Info')]");
	
	public static By VA_SOURCEOFINCOME = By.cssSelector("#primaryScourceIncome");
	public static By VA_EMPLOYERNAME = By.cssSelector("#employerName");
	public static By VA_EMPLOYERPHONE = By.cssSelector("#employerPhNo");
	public static By VA_HOWLONG = By.cssSelector("#howLong");
	public static By VA_TAKEHOME = By.cssSelector("#vamonthlyTakeHome");
	
	// REFERENCE ONE
	
	public static By VA_REFONE_SECTIONTITLE = By.xpath("//label[contains(text(),'Reference #1')]");
	
	public static By VA_REFONE_FIRSTNAME = By.cssSelector("#referenceFirstName1");
	public static By VA_REFONE_LASTNAME = By.cssSelector("#referenceLastName1");
	public static By VA_REFONE_PHONE = By.cssSelector("#referencePhoneNumber1");
	public static By VA_REFONE_RELATIONSHIP = By.cssSelector("#referenceRelationship1");
		
	// REFERENCE TWO
	
	public static By VA_REFTWO_SECTIONTITLE = By.xpath("//label[contains(text(),'Reference #2')]");
	
	public static By VA_REFTWO_FIRSTNAME = By.cssSelector("#referenceFirstName2");
	public static By VA_REFTWO_LASTNAME = By.cssSelector("#referenceLastName2");
	public static By VA_REFTWO_PHONE = By.cssSelector("#referencePhoneNumber2");
	public static By VA_REFTWO_RELATIONSHIP = By.cssSelector("#referenceRelationship2");
	
	// REFERNCE THREE
	
    public static By VA_REFTHREE_SECTIONTITLE = By.xpath("//label[contains(text(),'Reference #3')]");
	
	public static By VA_REFTHREE_FIRSTNAME = By.cssSelector("#referenceFirstName3");
	public static By VA_REFTHREE_LASTNAME = By.cssSelector("#referenceLastName3");
	public static By VA_REFTHREE_PHONE = By.cssSelector("#referencePhoneNumber3");
	public static By VA_REFTHREE_RELATIONSHIP = By.cssSelector("#referenceRelationship3");
	
				
	// SUBMIT SECTIONS
	
	public static By VA_ACCEPTCONDITIONS = By.xpath("//div[contains(text(),'Agreement to Terms & Conditions is required*')]");
	public static By VA_SUBMITBUTTON = By.cssSelector("#step2SubmitBtn");
	
	
		
}
