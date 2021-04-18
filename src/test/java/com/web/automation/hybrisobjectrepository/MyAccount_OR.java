package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

public class MyAccount_OR { 
	
	    //Sign In Modal
    	public static By SIGNIN_MODAL = By.xpath("//span[contains(text(),'Sign In')]");
		public static By SIGNIN_MODAL_IFRAME = By.id("signInIframe");
		public static By SIGNIN_MODALNAME = By.xpath("//div[@id='mainContainer']//div/div[contains(text(),'My Account')]");
		public static By SIGNIN_EMAILERROR = By.id("loginEmailError");
		public static By SIGNIN_PASSWORDERROR = By.id("loginPasswordError");
		
	
		// login to My Account
	    public static By EMAILADDRESS = By.id("loginEmail");
	    public static By PASSWORD = By.id("loginPassword");
	    public static By SIGNINBUTTON = By.id("activeLoginBtn");
	    
	    // Create Account 
	    public static By CREATEACCOUNT = By.id("createAccountBtn");
	    public static By CREATEACCOUNT_EMAIL = By.id("registerEmail");
	    public static By CREATEACCOUNT_CONTINUE = By.id("activeCreateAccountBtn");
	    
	    // My Account Global Header
	    public static By ACCOUNT_GLOBALHEADER = By.xpath("//p[@class='user_icon  zeroMargin']");
	    public static By MYDASHBOARD_GLOBALHEADER = By.xpath("//span[contains(text(),'My Dashboard')]");
	    public static By PAYMENTMETHODS_GLOBALHEADER = By.xpath("//span[contains(text(),'Payment Methods')]");
	    public static By SIGNOUT_GLOBALHEADER = By.xpath("//a[contains(text(),'Sign out')]");
	    public static By MYAGREEMENTS = By.xpath("//h1[contains(text(),'My Agreements')]");
	    public static By WELCOMEMESSAGE = By.xpath("(//div/span[contains(text(),'Welcome back,')])[1]");
	    
	    // My Account Dashboard 
	    public static By QUICKLINKS_PAYMENTMETHODS = By.xpath("//label[text()='Payment Methods']");
	    public static By QUICKLINKS_PAYMENTHISTORY = By.xpath("//label[text()='Payment History']");
	    public static By QUICKLINKS_PERSONALINFO   = By.xpath("//label[text()='Personal Information']");
	    
	    public static By MYSTORE_LABEL = By.xpath("//h3[contains(text(),'My Store')]");
	    
	    	    
	    // Make Payment
	    public static By MAKEPAYMENT = By.xpath("//button[contains(text(),'Make A Payment')]");
	    public static By CHOOSEPAYMENT_CONTINUE = By.xpath("//button[contains(text(),'CONTINUE')]");
	    public static By TERMSANDCONDITIONS_CHECKBOX = By.xpath("//span[contains(text(),'	I agree to the')]");
	    public static By SUBMIT_PAYMENT = By.xpath("//button[contains(text(),'Submit')]");
	    public static By PAYMENTSUCCESSMESSAGE = By.xpath("//h4[contains(text(),'Payment Successful')]");
	    public static By PAYPAL = By.xpath("//div[@aria-label='PayPal']");
	    
	   
		// MakePayment Dashboard page
		
		public static By MakePayment = By.cssSelector("button#PaymentButton");

	    	    
	    // Enroll Autopay
	    public static By ENROLLLINK_DASHBOARD = By.xpath("(//span[contains(text(),'Enroll Now ')])[1]");
	    public static By ENROLL_CHOOSEPAYMENTS_POPUP = By.xpath("//h4[contains(text(),'Enroll in AutoPay')]");
	    
	    public static By ENROLL_SELECTEDPAYMENTMETHOD = By.xpath("(//span[@class='enrollselected-payment-name fw600 text-uppercase'])[1]");
	    public static By ENROLL_CHOOSEPAYMENT_CONTINUE = By.id("reviewEnrollId");
	    public static By ENROLL_REVIEWPAYMENT_POPUP = By.xpath("//h4[contains(text(),'Review AutoPay')]");
	    public static By ENROLLTERMSANDCONDITIONS = By.xpath("(//span[contains(text(),'I agree to the ')])[1]");
	    public static By ENROLLBUTTON_REVIEWAUTOPAYSCREEN = By.id("manageEnrollAuto");
	    public static By AUTOPAYENROLL_SUCCESSMESSAGE = By.xpath("//h4[contains(text(),'AutoPay Enrollment Successful!')]");
	    public static By VIEWMYAGREEMENTSBUTTON = By.xpath("//a[contains(text(),'VIEW MY AGREEMENTS')]");
	    	    
	    // UnEnroll Autopay
	    public static By UNENROLLLINK_DASHBOARD = By.xpath("(//span[contains(text(),'Unenroll')])[1]");
	    public static By UNENROLLBUTTON = By.xpath("//input[@value='UNENROLL']");
	    
	    
	    //Payment Methods Page
	    public static By PAYMENTMETHODS_LABEL = By.xpath("//h1[contains(text(),'Payment Methods')]");
	    public static By PAYMENTMETHODS_ADDBANKACCOUNT = By.xpath("//span[contains(text(),'Add Bank Account')]");
	    public static By PAYMENTMETHODS_ADDCREDITCARD = By.xpath("//span[contains(text(),'Add Credit/Debit Card')]");
	    public static By PAYMENTMETHODS_ADDPAYPAL = By.xpath("//div[@aria-label='PayPal']");
	    public static By PAYMENTMETHODS_ADDPAYPALFRAME = By.xpath("//div[starts-with(@id,'zoid-paypal-button-')]");
	    public static By PAYMENTMETHODS_PAYMENTHITORYQUICKLINK = By.xpath("//div[contains(text(),'Payment History')]");
	    public static By PAYMENTMETHODS_PERSONALINFOQUICKLINK = By.xpath("//div[contains(text(),'Personal Information')]");
	  
	    
	   //Payment History
	    
	    public static By PAYMENTHISTORY_LABEL = By.xpath("//h1[contains(text(),'Payment History')]");
	    public static By PAYMENTHISTORY_PAYMENTMETHODSQUICKLINK = By.xpath("//div[contains(text(),'Payment Methods')]");
	    public static By PAYMENTHISTORY_PERSONALINFOQUICKLINK = By.xpath("//div[contains(text(),'Personal Information')]");
	    
	    //Credit card popup
	    
	    public static By CREDITCARD_TITLE = By.xpath("//h4[contains(text(),'Add Credit/Debit Card')]");
	    public static By CREDITCARD_NAMEONCARD = By.id("nameAddrNameOnCard");
	    public static By CREDITCARD_SAMEASBILLINGADDRESSCBOX = By.xpath("(//span[contains(text(),'Billing same as account profile address')])[1]");
	    public static By CREDITCARD_STREETADDRESS = By.id("nameAddrBillingAddress");
	    public static By CREDITCARD_ZIPCODE = By.id("nameAddrZipcode");
	    public static By CREDITCARD_CITY = By.id("nameAddrCity");
	    public static By CREDITCARD_SWITCHTOVANTIVFRAME = By.cssSelector("iframe[id*=vantiv-payframe]");
	    public static By CREDITCARD_CARDNUMBER = By.cssSelector("input[id*=accountNumber]");
	    public static By CREDITCARD_EXPIRYMONTH = By.cssSelector("select[id*=expMonth]");
	    public static By CREDITCARD_EXPIRYYEAR = By.cssSelector("select[id*=expYear]");
	    public static By CREDITCARD_CVV = By.cssSelector("input#cvv");
	    public static By CREDITCARD_AGREETnC = By.xpath("//*[@id='credit-form']/label/span[contains(text(),'I agree')]");
	    public static By CREDITCARD_SAVE = By.id("nameAddrInfoPopupSave");
	    public static By LISTOFADDEDPAYMENTMETHODS = By.xpath("//div[@class='font16 fontMob12']");
	    public static By CREDITCARD_ERRORMSG = By.xpath("//div[@id='credit-form']//span//ul//li");
	    public static By CREDITCARD_INVALIDINFOERRORMSG = By.xpath("//div[contains(text(),'The card information you entered is not correct. Please try again')]");
	    
	    
	    //Bank account popup
	    
	    public static By BANKPOPUP_TITLE = By.xpath("//h2[contains(text(),'Add Bank Account')]");
	    public static By BANK_NAMEONACCOUNT = By.id("bankAccNameOnAccount");
	    public static By BANK_CONTACTNUMBER = By.id("bankAccContactNumber");
	    public static By BANK_ROUTINGNUMBER = By.id("bankAccRoutingNumber");
		public static By BANK_ACCOUNTNUMBER = By.id("bankAccountNumber");
		public static By BANK_STREET = By.id("bankAccBillingAddress");
		public static By BANK_ZIP = By.id("bankAccZipcode");
		public static By BANK_CITY = By.id("bankAccCity");
		public static By BANK_STATEDROPDOWN = By.xpath("//button[@data-id='bankAccState']");
		public static By BANK_SELECTSTATE = By.xpath("//div[@id='bank_state']//div[@class='dropdown-menu open']/ul/li[@data-original-index='']");
		
		public static By BANK_SAMEADDRESSCHKBOX = By.xpath("//span[contains(text(),'Billing same as account profile address')]");
		public static By BANK_AGREETnC = By.xpath("//span[contains(text(),'I agree to the')]");
		public static By BANK_SAVE = By.id("addBankAccountSave");
		public static By BANK_ERRORMSG = By.xpath("//div[contains(@class,'form-group bankValid')]/span/ul");
		
		
		
		
		//Delete Payment Method
		
		public static By CREDITCARD_DELETE = By.xpath("//div[contains(text(),'VISA')]/../../div/span[contains(text(),' Delete')]");
		public static By BANK_DELETE = By.xpath("//div[contains(text(),'BANK')]/../../div/span[contains(text(),' Delete')]");
		public static By DELETE_PAYMENTMETHOD_POPUP = By.xpath("//h4[contains(text(),'Payment Method')]");
		public static By DELETE_YES = By.id("deletePopupBtn");
		
		
		
	    
	    
	   //Personal Info
	    
		public static By PERSONALINFO_TITLE = By.xpath("(//h2[contains(text(),'Personal Info')])[1]");
		public static By PERSONALINFO_EDIT = By.id("personalInfoEditBtn");
		public static By PERSONALINFO_PASSWORD = By.id("passwordChangeIDP");
		public static By PERSONALINFO_EMAIL = By.xpath("(//input[@aria-label='Email Address'])[2]");
		public static By PERSONALINFO_PHONENUMBER = By.cssSelector("input[id*=phoneNumber]");
		public static By PERSONALINFO_STREETADDRESS = By.cssSelector("input[id*=address]");
		public static By PERSONALINFO_APARTMENTNUMBER = By.cssSelector("input[id*=apartment_number]");
		public static By PERSONALINFO_ZIPCODE = By.cssSelector("input[id*=zipcode]");
		public static By PERSONALINFO_CITY = By.cssSelector("input[id*=city]");
		public static By PERSONALINFO_STATE = By.cssSelector("select[id*=stateDropDown]");
		public static By PERSONALINFO_PREFERREDTIME = By.cssSelector("select[id*=preferedDownContact]");
		public static By PERSONALINFO_UPDATE = By.id("savePersonalInfoBtn");
		public static By PERSONALINFO_EDITPASSWORD = By.id("passwordChangeIDP");
		public static By PERSONALINFO_OLDPASSWORD = By.cssSelector("input[id*=oldPassword]");
		public static By PERSONALINFO_NEWPASSWORD = By.id("password");
		public static By PERSONALINFO_CONFIRMNEWPASSWORD = By.id("confirmPassword");
		public static By PERSONALINFO_SUBMITPASSWORD = By.id("changePwdBtn");
		public static By PEROSNALINFOUPDATE_SUCCESSMESSAGE = By.xpath("//div[contains(text(),'Updated')]");
		public static By PERSONALINFO_CLOSEPOPUP = By.xpath("//div[@id='personal-info']//button[@class='close link-btn']"); 
		public static By PERSONALINFO_ADDRESS_ERRORMSG = By.xpath("//ul[@class='parsley-errors-list filled']");
		public static By PERSONALINFO_EMAILERRORMSG = By.xpath("//li[contains(text(),'Please enter a valid email')]");
		public static By PERSONALINFO_CONTACTINFOERRORMSG = By.xpath("//li[contains(text(),'Please enter a valid phone number.')]");
		
		
		
		// Sign In from Hamburger
		
		
		public static By HAM_MYACCOUNT = By.xpath("//span/a[contains(text(),'My Account')]");
		public static By HAM_MYACCOUNTPAGETITLE = By.xpath("//div[text()='My Account']");
		public static By HAM_MYACC_EMAIL = By.id("loginEmail");
		public static By HAM_MYACC_PASSWORD = By.id("loginPassword");
		public static By HAM_MYACC_SUBMIT = By.id("activeLoginBtn");
		public static By HAM_MYACC_EMAILERROR = By.id("loginEmailError");
		public static By HAM_MYACC_PASSWORDERROR = By.id("loginPasswordError");
		
		
		
		
		
}
