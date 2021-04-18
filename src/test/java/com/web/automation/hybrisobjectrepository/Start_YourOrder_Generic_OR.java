package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

// This file will contain the objects of Start Your Order Page (Generic - Without or With store)

public class Start_YourOrder_Generic_OR {
	
  // Start your order PAGE TITLE
	
	public static By START_YOURORDER_PAGETITLE = By.xpath("//h1[contains(text(),'Start Your Order')]");
	
	
	// CONTACT AND DELIVERY INFO SECTION
	
	public static By CONTACTANDDELIVERYINFO_PAGETITLE = By.xpath("//span[contains(text(),'Contact & Delivery Info')]");
	
	public static By SO_FIRSTNAME = By.cssSelector("#FirstName");
	public static By SO_LASTNAME = By.cssSelector("#LastName");
	public static By SO_EMAILADDRESS = By.cssSelector("#emailaddress");
	public static By SO_VERIFYEMAILADDRESS = By.cssSelector("#verifyemailaddress");
	public static By SO_PHONENUMBER = By.cssSelector("#phoneNumber");
	public static By SO_DELIVERYADDRESS = By.xpath("//input[@id='streetAddressTI']");
	public static By SO_APTNUMBER = By.cssSelector("#apartmentNumberTI");
	public static By SO_CITY = By.cssSelector("#cityTI");
	public static By SO_STATE = By.cssSelector("#stateTI");
	public static By SO_ZIPCODE = By.cssSelector("#zipcodeTI");
	public static By SO_SUBMIT_CONTACTINFORMATION = By.xpath("//span[@title='Submit Contact Information']");
	public static By SO_JUSTWANT_STORETOCONTACTYOU = By.xpath("//div[contains(text(),'Just want store to contact you?')]");
	public static By SO_JUSTCONTACTME = By.cssSelector("#noThanksLink");
	//public static By SO_CONTINUE = By.xpath("//span[contains(text(),'CONTINUE')][1]");
	public static By SO_CONTINUE = By.xpath("//button[@id='continueReserveButton']");
	public static By SO_UPDATE = By.xpath("//span[contains(text(),'Update')]");
	public static By SO_EDIT = By.xpath("//a[contains(text(),'Edit')]"); 
		
	// Thank You Pop Up - SubmitContactInfo
	
	public static By SO_ThankYou = By.xpath("//h4[contains(text(),'Thank you!')]");
	
				
	// EMPLOYMENT AND REFERENCES SECTION
	
	public static By SO_EMPLOYMENTREFERENCES_PAGETITLE = By.xpath("//span[contains(text(),'Employment & References')]");
	
	//EMPLOYMENT INFO
	
	public static By SO_EMPLOYMENTINFO_SECTIONTITLE = By.xpath("//label[contains(text(),'Employment Info (Optional)')]"); 
	
	public static By SO_SOURCEOFINCOME = By.xpath("//select[@id='Lead_Person_Employment_IncomeSourceID']");
	public static By SO_EMPLOYERNAME = By.cssSelector("#Employer");
	public static By SO_EMPLOYERPHONE = By.cssSelector("#EmployerPhone");
	public static By SO_HOWLONG = By.cssSelector("select#Lead_Person_Employment_DurationID");
	public static By SO_TAKEHOME = By.cssSelector("#MonthlyIncome");
	
	// REFERENCE ONE
	
	public static By SO_REFONE_SECTIONTITLE = By.xpath("//label[contains(text(),'Reference #1 (Optional)')]");
	
	public static By SO_REFONE_FIRSTNAME = By.cssSelector("#referenceFirstName1");
	public static By SO_REFONE_LASTNAME = By.cssSelector("#referenceLastName1");
	public static By SO_REFONE_PHONE = By.cssSelector("#referencePhoneNumber1");
	public static By SO_REFONE_RELATIONSHIP = By.cssSelector("#Lead_Person_FirstReference_RelationshipID");
	
	
	// REFERENCE TWO
	
	public static By SO_REFTWO_SECTIONTITLE = By.xpath("//label[contains(text(),'Reference #2 (Optional)')]");
	
	public static By SO_REFTWO_FIRSTNAME = By.cssSelector("#referenceFirstName2");
	public static By SO_REFTWO_LASTNAME = By.cssSelector("#referenceLastName2");
	public static By SO_REFTWO_PHONE = By.cssSelector("#referencePhoneNumber2");
	public static By SO_REFTWO_RELATIONSHIP = By.cssSelector("#Lead_Person_SecondReference_RelationshipID");
			
	// SUBMIT AND CLAIM IPO SECTIONS
	
	public static By IPO_LABEL = By.xpath("(//img[@class='img-responsive ae-img'])[4]");
	public static By SO_CLAIMOFFER_BUTTON = By.id("claimofferbtn");
	public static By SO_SUBMIT_WITHOUTOFFER_BUTTON = By.xpath("//input[@value='SUBMIT WITHOUT OFFER']");
		
	
	
}
