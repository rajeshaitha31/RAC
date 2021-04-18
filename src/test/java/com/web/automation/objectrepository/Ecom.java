package com.web.automation.objectrepository;

import org.openqa.selenium.By;

public class Ecom {
	
	
	//Common Elements
	
	public static By Back = By.id("backToRAC");
	public static By RAC_Logo = By.xpath("//*[@title='Rent-A-Center Homepage']");
	
	
		
	//Ecom HomePage
	
	// Objects of SetMyStore Popup	
	public static By Store_Locator = By.xpath("(//span[@id='myStoreText'])[1]");
	public static By Find_My_Store = By.xpath("//*[@id='findYourStoreDesktop']/span)[1]");
	public static By Find_My_Store_old = By.xpath("(//*[@id='findMyStore'])[1]");
	//public static By Find_My_Store_old = By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 push-right']/a[@id='findMyStore']");
	//public static By Selected_Store_old = By.xpath("//*[span[contains(text(),'My Store: ')]]");
	public static By Selected_Store_old = By.xpath("//*[span[contains(text(),'My Store:')]]");
	public static By Selected_Store = By.xpath("(//span[@id='zipCodeSelectedDesktopHeading'])[1]");
	public static By Change_Store = By.xpath("(//*[a[contains(text(),'Change')]])[1]");
	//public static By Set_Store = By.xpath("//*[@id='qtip-0']/div[2]/div/div/div/div/div/div[2]/form/div/input[2]");
	public static By Set_Store = By.xpath("//div[@id='qtip-0']//input[@id='enterZipCode_Nav']");
	public static By EnterZip = By.xpath("//div[@id='qtip-0']//input[@id='enterZipCode_Nav']");
	public static By Close_StorePopup = By.xpath("//*[@id='qtip-0-content']/div/div/div[4]");
	public static By Go_Set_store = By.xpath("//*[@id='qtip-0']/div[2]/div/div/div/div/div/div[2]/form/div/input[2]/../span/button[@id='enterZipCodeGoButton_Nav']");
	public static By Make_thismystore_old = By.xpath("//div[@class='qtip-content']//*[@id='storeResults_1_myStoreBtn']");
	public static By Make_thismystore = By.xpath("(//a[@id='storeResults_1_myStoreBtn'])[2]"); 
	public static By Store_errormessage1 = By.xpath("//div[@class='qtip-content']//p[contains(text(),'Please enter a valid zipcode ')]");
	public static By NoStore_Zip_old = By.xpath("//div[@class='qtip-content']//p[@class='error-txt-no-store']");
	public static By NoStore_Zip = By.xpath("//div[@class='qtip-content']//div[@class='searchnostorefoundtext']");
	public static By Change_MyStore_old = By.xpath("//div[@id='qtip-0']//a[@id='changeMyLocationLink']");
	public static By Change_MyStore = By.xpath("(//a[@id='changeMyLocationLink'])[2]");
	//public static By old_Close_Popup = By.xpath("(//*[@id=\"closeLocator\"]/span)[1]");
	public static By Close_Popup = By.xpath("(//span[@class='locationSearchCloseButton qtip-close-btn glyphicon glyphicon-remove'])[2]");
    
	
	//New Locators added on 04-04-2019
	
	//public static By New_Find_My_Store = By.xpath("(//span[contains(text(),'Find your store')])[1] | (//span[@id='zipCodeSelectedDesktopHeading'])[1]");
	public static By New_Find_My_Store = By.xpath("(//span[@class='glyphicon glyphicon-triangle-bottom hidden-xs'])[1]");

    public static By New_StoreLocator_Popup = By.xpath("(//div[@class='myStoreContainer'])[2]");

    public static By New_EnterZip = By.xpath("(//input[@id='enterZipCode_Nav'])[2]");
    public static By ChangeStore_EnterZip = By.xpath("(//input[@id='enterZipCode_Nav'])[1]");
    	

    public static By New_GoSetStore = By.xpath("(//button[@id='enterZipCodeGoButton_Nav'])[2]");
    public static By ChangeStore_GoSetStore = By.xpath("(//button[@id='enterZipCodeGoButton_Nav'])[1]");

    public static By New_MakeThisMyStore = By.xpath("(//button[contains(text(),'Make This My Store')])[1]");
	
	// Set StorePopup from VA/NONVA form
	
	public static By GA_EnterZip = By.xpath("(//input[@id='enterZipCode_Nav'])[3]");
	public static By GA_ChangeStore_Enterzip = By.xpath("(//input[@id='enterZipCode_Nav'])[2]");
    public static By GA_Go_Set_store = By.xpath("(//button[@id='enterZipCodeGoButton_Nav'])[3]");
    public static By GA_ChangeStore_Go = By.xpath("(//button[@id='enterZipCodeGoButton_Nav'])[2]");
	public static By GA_Make_thismystore = By.xpath("(//*[@id=\"stores-available\"]/ul/li[1]/div/span[2]/button[contains(text(),'Make This My Store')])[2]");
	public static By GA_Store_message = By.xpath("//strong[contains(text(),'You have selected this location:')]");
	public static By GA_store_errormessage_zipnotfound_old = By.xpath("//div[contains(text(),'No store was found within 20 miles of your location.')]");
	public static By GA_store_errormessage_zipnotfound = By.xpath("(//div[contains(text(),'No store was found within')])[2]");
	public static By GA_store_errormessage_invalidzip = By.xpath("//p[contains(text(),'Please enter a valid zipcode ')]");
	//public static By GA_ChangeStore = By.id("changeStore");
	
	//GetApproved HomePage
	//public static By HomePage_Getapproved = By.xpath("//a[contains(text(),'Get Approved Now › ')]");  //UAT
	 public static By HomePage_Getapproved = By.xpath("//div[@id='submitApplication']/div/h2 | //a[contains(text(),'Get Approved Now › ')]" );  
	 
	
	public static By GetApproval_Logo = By.xpath("//*[@id=\"submitApplication\"]/div[1]/h2/span[1]");
	
	
	// MyStore links
	public static By My_store_old = By.xpath("//span[contains(text(),'My Store:')]");
	public static By My_store = By.xpath("//span[contains(text(),'My Store')]");
	
	// Non VA Page
	
	//public static By NONVA_FormText = By.xpath("//div[@class=' col-sm-10 contentContainer hidden-xs']/h2[contains(text(),'GET APPROVED NOW.')]");
	 public static By NONVA_FormText = By.xpath("(//h2[contains(text(),'GET APPROVED NOW')])[1]");
	 public static By NONVA_NewLogo = By.xpath("(//h2[contains(text(),'$10 Starts Any New Agreement')])[1]");
	
	//GenericSearch
	
	public static By Generic_Search_link = By.xpath("//a[@id='searchButton']");
	public static By Generic_Search_input = By.xpath("//div[@id='searchPanel']//input[@id='input_SearchBox']");
	public static By Generic_Search_go = By.xpath("//div[@id='searchPanel']//button[@id='siteSearchSubmitBtn']");
		
	// Product Search results page
	
	public static By Product_viewdetails = By.xpath("//a[contains(text(),'View Details')]");
	
	// PDP page
	
	//public static By VA_GetStarted_BlueButton = By.xpath("//div[@class='approved_btn']/div/div[@class='pull-right hidden-xs hidden-sm']/a[@id='approved_btn']");
	//public static By VA_GetStarted_BlueButton = By.xpath("div[@id='weekly-tab']//div[@class='action-button-wrapper approval_only']/div//div[@class='visible-xs visible-sm']/a");
     //public static By VA_GetStarted_BlueButton = By.xpath("//div[@id='weekly-tab']//div[@class='visible-xs visible-sm']//a[@id='approved_btn']");
     public static By VA_GetStarted_BlueButton = By.id("approved_btn");
	 public static By NonVA_GetStarted_GreenButton = By.id("rent_btn");
		
	// Get Approved Form
	
	//Contactdetails
	
	public static By GA_First_Name = By.id("FirstName");
	public static By GA_Second_Name = By.id("LastName");
	public static By GA_Phone_Number = By.id("phoneNumber");
	public static By GA_drpPhoneType = By.id("PhoneTypeDropDownList");
	public static By GA_emailaddress= By.id("emailaddress");
	public static By GA_VerifyEmailaddress = By.id("verifyemailaddress");
	public static By GA_checkbox = By.id("chiEmailOptIn");
	public static By GA_streetaddress = By.id("streetAddressTI");
	public static By GA_apartmentnumber = By.id("apartmentNumberTI");
	public static By GA_city = By.id("cityTI");
	public static By GA_state = By.id("stateTI");
	public static By GA_zipcode = By.id("zipcodeTI");
	public static By GA_preferredtime = By.xpath("//*[@id='rdMorning']");
	public static By GA_continuefilling = By.id("submitContinueFilling");
	public static By GA_justcontactme = By.id("noThanksLink");
	public static By GA_upperformcontinue = By.id("step1SubmitBtn");
	public static By GA_submitcontactinfo = By.id("step1UpperFormSubmit");
	
	//Employment details
	public static By GA_sourceofincome = By.cssSelector("select#Lead_Person_Employment_IncomeSourceID");
	//public static By GA_sourceofincome = By.cssSelector("select#primaryScourceIncome");
	public static By GA_employername = By.id("Employer");
	public static By GA_employerphone = By.id("EmployerPhone");
	public static By GA_employmentduration = By.id("Lead_Person_Employment_DurationID");
	public static By GA_monthlyincome = By.id("MonthlyIncome");
	
	//References
	
	//Reference one
	
	public static By GA_referenceonefirstname = By.id("referenceFirstName1");
	public static By GA_refernceonelastname = By.id("referenceLastName1");
	public static By GA_referenceone_relationship = By.id("Lead_Person_FirstReference_RelationshipID");
	public static By GA_refernceone_phonenumber = By.id("referencePhoneNumber1");
	
	//Reference two
	
	public static By GA_referencetwofirstname = By.id("referenceFirstName2");
	public static By GA_referncetwolastname = By.id("referenceLastName2");
	public static By GA_referencetwo_relationship = By.id("Lead_Person_SecondReference_RelationshipID");
	public static By GA_referncetwo_phonenumber = By.id("referencePhoneNumber2");
		
	// final submit
	//public static By GA_submit = By.id("step2SubmitBtn");
	//public static By GA_submit = By.id("step3SubmitBtn");
	public static By GA_submit = By.xpath("//input[@id='step2SubmitBtn'] | //input[@id='step3SubmitBtn']");
	public static By GA_finalcheckbox = By.id("legalText_chk_box");
	
	// NonVAPage -Sections
	public static By GA_Contactinfo_Section = By.xpath("//p[contains(text(),'Contact Information')]");
	public static By GA_Employmentinfo_Section = By.xpath("//p[contains(text(),'Employment & References')]");
	
	// Confirmation page
	
	public static By GA_confirmation_thankyoutext = By.xpath("//h1[contains(text(),'Thank You!')]");
	public static By GA_confirmation_ordertext = By.xpath("//p[contains(text(),'Your order has been received!')]");
		
	
	// VA Timeout
	
	public static By VA_Timeout = By.id("applicationTimeOutVA");
	public static By TimeOut_Continue = By.id("moreTimeReq");
	
	
	// VA Form
	
	public static By VA_Contactinfo_Label = By.xpath("//p[contains(text(),'Contact Information')]");
	public static By VA_ApprovalInformation_Label = By.xpath("//p[contains(text(),'Complete Approval Information')]");
	public static By VA_Finalize_Agreement_Label = By.xpath("//p[contains(text(),'Finalize Agreement In Store')]");
	
	//public static By VA_ApprovalInformation_Label = By.xpath("//div[@id='formWrapper2']//p[contains(text(),'Approval Information')]");
	
	// VA pageheading
	
	public static By VA_logo = By.xpath("//img[@alt='Get Approved Now']");
	
	//Contact Information - VA
	public static By VA_First_Name = By.id("first-name");
	public static By VA_Second_Name = By.id("last-name");
	public static By VA_Phone_Number = By.id("phone-number");
	public static By VA_drpPhoneType = By.id("PhoneTypeDropDownList");
	public static By VA_emailaddress= By.id("emailId");
	public static By VA_VerifyEmailaddress = By.id("verifyEmailId");
	public static By VA_Homeaddress = By.id("address");
	
	public static By VA_Aptaddress = By.id("apartment_number");
	public static By VA_City = By.id("city");
	public static By VA_Stdropdown = By.id("stateDropDown");
	public static By VA_ZipCode = By.id("zipcode");
	public static By VA_preferredtime = By.xpath("//*[@id='rdMorning']");
	public static By VA_submitcontactinfo = By.id("step1UpperFormSubmit");
	public static By VA_upperformcontinue = By.id("step1SubmitBtn");
	public static By VA_Just_Contactme = By.id("noThanksSubmit");
	public static By VA_ContinueFilling = By.id("continuefilling");
	
	//EmploymentInformation - VA
	
	public static By VA_Dl = By.id("driversLicence");
	public static By VA_Dl_State = By.id("stateDropDownListDL");
	public static By VA_Ssn = By.id("socialSecurity");
	
	public static By VA_Dob_month = By.id("month-of-birth");
	public static By VA_Dob_day = By.id("date-of-birth");
	public static By VA_Dob_year = By.id("year-of-birth");
			
	public static By VA_Sourceofincome = By.id("primaryScourceIncome");
	public static By VA_Employername = By.id("employerName");
	public static By VA_Employerphone = By.id("employerPhNo");
	public static By VA_Duration = By.id("howLong");
	public static By VA_takehome = By.id("monthlyTakeHome");
	
	//References
	
	public static By VA_referenceonefirstname = By.id("referenceFirstName1");
	public static By VA_refernceonelastname = By.id("referenceLastName1");
	public static By VA_referenceone_relationship = By.id("referenceRelationship1");
	public static By VA_refernceone_phonenumber = By.id("referencePhoneNumber1");
		
	public static By VA_referencetwofirstname = By.id("referenceFirstName2");
	public static By VA_referncetwolastname = By.id("referenceLastName2");
	public static By VA_referencetwo_relationship = By.id("referenceRelationship2");
	public static By VA_referncetwo_phonenumber = By.id("referencePhoneNumber2");
		
	public static By VA_referencethreefirstname = By.id("referenceFirstName3");
	public static By VA_referncethreelastname = By.id("referenceLastName3");
	public static By VA_referencethree_relationship = By.id("referenceRelationship3");
	public static By VA_referncethree_phonenumber = By.id("referencePhoneNumber3");
		
	public static By VA_finalcheckbox = By.id("legalText_chk_box");
	public static By VA_finalsubmit = By.id("step2SubmitBtn");
		
	// VA Confirmation Page
	
	public static By VA_Approved_Congrats_Message = By.xpath("//h1[contains(text(),'Congratulations')]");
	public static By VA_Approved_Amount_Message = By.xpath("//p[contains(text(),'Your approval amount is:')]");
	public static By VA_Approved_Expiry_Message = By.xpath("//p[contains(text(),'Expires:')]");
	public static By VA_Approved_Product_Message = By.xpath("//span[contains(text(),'Requested Product')]");
		
	//VA DeclinePage
	
	public static By VA_Decline_MessageHeading = By.xpath("//h2[contains(text(),'We’re so happy you applied!')]");
	public static By VA_Decline_MessageContentone = By.xpath("//span[contains(text(),'However, as much as we’d love to get you the best brands today, we were unable to approve your application. A letter is on its way to you with all of the details.')]");
	public static By VA_Decline_MessageContenttwo = By.xpath("//span[contains(text(),'We thank you so much for your interest in Rent-A-Center, and we hope you’ll consider us again in the future.')]");
	
	// VAConditionalPage
	
	public static By VA_Conditional_MessageHeading = By.xpath("//h1[contains(text(),'almost there,')]");
	public static By VA_Conditional_MessageContentone = By.xpath("//p[contains(text(),'We just need a bit more information to process your application')]");
	public static By VA_Conditional_MessageContenttwo = By.xpath("//p[contains(text(),'You may be approved for up to ')][1]");
			
	public static By VA_ConditionalHeading = By.xpath("//h1[contains(text(),'We want to help you in person!')]");
	public static By VA_ConditionalMessage = By.xpath("//p[contains(text(),'Unfortunately, we’re unable to provide you with an online approval right now, but we’d love to help you get approved for the best brands in store! Visit us soon, bring the items below, and we’ll get you going.')]");
	
	
	// VA Page screen validations
	
	public static By VA_ErrorMessage = By.xpath("//li[@class='parsley-required']");
	public static By NonVA_ErrorMessage = By.xpath("//*[@id=\"formSection1\"]/div[1]/div[contains(@style,'display: block;')]");
	public static By VA_ContactInfo_InvalidErrormessage =  By.xpath("//li[@class='parsley-pattern']");
	public static By VA_ApprovalInfo_InvalidErrormessage =  By.xpath("//li[@class='parsley-pattern']");
	public static By VA_ApprovalInfo_UniqueNameMessage = By.xpath("//li[@class='parsley-uniqueName']");
	public static By VA_ApprovalInfo_UniquePhoneMessage = By.xpath("//li[@class='parsley-uniquePhoneNumber']");
	
	
	// Sign Up for Deals
	
	public static By SignUp_For_Deals = By.cssSelector("a[title='Sign Up For Deals']");
	public static By SignUpForDeals_Email = By.id("emailField");
	public static By SignUpForDeals_VerifyEmail = By.id("verifyEmailField");
	public static By SignUpForDeals_Submit = By.id("signUpBtnSubmit");
	public static By SignUpForDeals_SuccessMessage = By.xpath("//*[@id=\"signUpSpecialsFormResponse\"]/div[1]/p");
	public static By SignUpForDeals_ErrorMessage_DifferentEmails = By.xpath("//*[@id=\"signUpSpecialsFormData\"]/form/div[1]/div[1]/div[6]/p");
	public static By SignUpForDeals_ErrorMessage_EmptyVerifyEmail = By.xpath("//*[@id=\"signUpSpecialsFormData\"]/form/div[1]/div[1]/div[5]/p");
	public static By SignUpForDeals_ErrorMessage_InvalidEmail = By.xpath("//*[@id=\"signUpSpecialsFormData\"]/form/div[1]/div[1]/div[4]/p");
	public static By SignUpForDeals_ErrorMessage_EmptyFields = By.xpath("//*[@id=\"signUpSpecialsFormData\"]/form/div[1]/div[1]/div[3]/p");
	
	public static By Unsubscribe_Deals = By.cssSelector("a[href*='unsubscribe']");
	public static By Unsubscribe_Email = By.id("unsubscribeEmail");
	public static By Confirmaion_FewMails = By.id("fewEmailsCustomRadio");
	public static By Confirmation_Unsubscribe = By.id("unsubscribeCustomRadio");
	public static By Confirmation_DecidedToStay = By.id("stayCustomRadio");
	public static By Unsubscribe_ErrorMessage = By.xpath("//*[@id=\"parsley-id-3\"]/li");
	public static By Unsubscribe_SuccessMessage = By.xpath("//*[@id='content']/div[1]/div[4]/div[2]/div/div[1]/p");
	public static By Unsubscribe_SubmitBtn = By.id("unsubcribeSubmitBtn");
	
	
	// Back To RAC Pop Up
	
	public static By BacktoRAC_NoThanks_VAForm = By.xpath("//a[contains(@aria-label,'No thanks')]");
	public static By BackToRAC_ContinueToSubmit_VAForm = By.id("backtoRACSubmit");
	
	public static By BacktoRAC_NoThanks_NonVAForm = By.id("noThanksSubmit");
	public static By BackToRAC_CompleteApplication_NonVAForm = By.id("completeApplicationForm");
	
	
	
	// Contact Customer Service
	
	public static By CustomerService_errorMessage = By.xpath("//*[@id='contactUsForm']/div/p[not(contains(@style,'display: none;'))]");
	public static By CustomerService = By.xpath("//*[@id=\"rac-submenu\"]/div[1]/div/ul/li[5]/a[1]");
	public static By CustomerService_email = By.id("emailField");
	public static By CustomerService_phoneNumber = By.id("primaryPhoneNumber");
	public static By CustomerService_PreferredContact_email = By.id("Email");
	public static By CustomerService_PreferredContact_phone = By.id("Phone");
	public static By CustomerService_FirstName = By.id("firstNameField");
	public static By CustomerService_LasttName = By.id("lastNameField");
	public static By CustomerService_selectTopic = By.id("reasonInquiry");
	public static By CustomerService_comments = By.id("comments");
	public static By CustomerService_changeLocation = By.xpath("//*[@id=\"contactUsForm\"]/div[9]/div[2]/div[2]/a[2]");
	public static By CustomerService_zipcode = By.id("zipcode");
	public static By CustomerService_selectStore = By.id("store-select");
	public static By CustomerService_submit = By.id("contact-us");
	public static By CustomerService_SuccessMessage = By.xpath("//*[@id=\"contactUsFormResponse\"]/div[1]/p");
	public static By NonVA_RAC_Logo_old = By.xpath("//*[@id=\"category-menu\"]/div[1]/div/div/a/img");
	public static By NonVA_RAC_Logo = By.xpath("(//a/img[@alt='Rent a Center Homepage Logo'])[2]");
	
	
	
	
	// IPO 
	
	public static By IPO_VantivIFrame = By.id("vantiv-payframe");
	public static By IPO_ClaimOffer = By.id("claimofferbtn");
	//public static By IPO_ClaimOffer = By.xpath("//*[@id='claimofferbtn']");
	public static By IPO_FirstName = By.id("secureFN");
	public static By IPO_LastName = By.id("secureLN");
	public static By IPO_Street = By.id("secureBA");
	public static By IPO_Apartment = By.id("secureApartmenntNbr");
	public static By IPO_City = By.id("secureBAC");
	public static By IPO_state = By.id("state");
	public static By IPO_zip = By.id("billingZipcode");
	public static By IPO_cardNumber = By.id("accountNumber");
	public static By IPO_expMonth = By.id("expMonth");
	public static By IPO_expYear = By.id("expYear");
	public static By IPO_cvv = By.id("cvv");
	public static By IPO_agreeTandC = By.id("securetermsandcond");
	public static By IPO_submit = By.id("secureFormSubmit");
	public static By IPO_OrderNumber = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/p[1]/strong");
	public static By IPO_SubmitWithoutOffer = By.xpath("//*[@id='step2SubmitBtn' or @id='step3SubmitBtn']");
	
	
	
	
	
	
	}
