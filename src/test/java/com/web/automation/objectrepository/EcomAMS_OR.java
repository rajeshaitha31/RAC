package com.web.automation.objectrepository;

import org.openqa.selenium.By;

public class EcomAMS_OR {
	
	// account creation
	public static By EMAILERROR = By.cssSelector("span[id*=EmailError]");
	public static By PASSWORDERROR = By.cssSelector("span[id*=PasswordError]");
	public static By EMAILERROR_CREATEACCOUNT = By.cssSelector("span[id*=emailError]");
	public static By ACTIVATION_PASSWORDERROR = By.cssSelector("span[id=confirmPasswordErrorId]");
	
	//Agreements
	public static By FIRSTNAME_AGREEMENTS = By.cssSelector("#firstName");
	public static By LASTNAME_AGREEMENTS = By.cssSelector("#lastName");
	public static By AGREEMENTNUMBER = By.cssSelector("#agreementNumber");
	public static By AGREEMENTS = By.cssSelector("ul#side-menu li>a[href*=agreements]");
	
	//Link accounts
	public static By LINKACCOUNT = By.xpath("//*[@id='customerLink']/div[6]/button");
	public static By LINKACCOUNTERROR = By.cssSelector(".customerLeftErrorPaneTitle");
	
	//Creditcard Payment
	
	// Initial popup 
	
	public static By CLOSE_ADDPAYMENTPOPUP = By.cssSelector("#migratePaymentMethodClose");
	public static By PAYMENT_METHODS = By.cssSelector("ul#side-menu li>a[href*=payment]");
	public static By NAVIGATETOPAYMENT = By.cssSelector("iframe[id*=vantiv-payframe]");
	public static By ADD_PAYMENTMETHOD = By.cssSelector("#addPaymentNo");
	public static By ADD_ANOTHERPAYMENTMETHOD = By.cssSelector("#addPayment");
	public static By ADD_CREDITORDEBITCARD = By.cssSelector("#creditDebitoption");
	public static By ADD_ACH = By.id("bankAccountoption");
	public static By ADD_PAYMENT_CONTINUE = By.cssSelector("#addPaymentContinue");
	public static By ACCOUNTNUMBER = By.cssSelector("input[id*=accountNumber]");
	public static By EXPIRYMONTH = By.cssSelector("select[id*=expMonth]");
	public static By EXPIRYYEAR = By.cssSelector("select[id*=expYear]");
	public static By CVV = By.cssSelector("input#cvv");
	public static By ACCEPTTERMSANDCONDITIONS = By.xpath("//*[@id=\"vantivSection\"]/div/div/label/span[contains(text(),'I agree')]");
	public static By DELETE_PAYMENTMETHOD_CREDITCARD = By.xpath("//tr/td[contains(text(),'Master')]/ancestor::tr/td/a[contains(text(),'Delete')]");
	public static By PAYMENTDELETE_POPUP = By.id("deletePopupBtn");
	//Second Popup
	
	public static By NameOnCard = By.id("nameAddrNameOnCard");
	public static By Sameasprofileaddress = By.xpath("(//span[contains(text(),'Same as account profile address')])[2]");
	public static By CCPopSave = By.id("nameAddrInfoPopupSave");
	
	
	//ACH payment
	public static By ACH_SELECT_ACCOUNTTYPE = By.xpath("//*[@id=\"addBankAccountPopup\"]/div/div/div/div[3]/div/div[1]/div/div/div/button/span[1]");
	public static By ACH_ACCOUNTTYPE_PERSONAL = By.xpath("//span[contains(text(),'Personal')]");
	public static By ACH_ACCOUNTTYPE_CORPORATE = By.xpath("//span[contains(text(),'Corporate')]");
	public static By ACH_NAMEON_ACCOUNT = By.id("bankAccNameOnAccount");
	public static By ACH_CONTACTNUMBER = By.id("bankAccContactNumber");
	public static By ACH_BANKROUTINGNUMBER = By.id("bankAccRoutingNumber");
	public static By ACH_BANKACCOUNTNUMBER = By.id("bankAccountNumber");
	public static By ACH_CONFIRMBANKACCOUNTNUMBER = By.id("bankAccountNumberConfirmation");
	public static By ACH_SAMEADDRESSCHKBOX = By.xpath("//div[4]/div/label/span");
	//public static By ACH_ACCEPT_TC = By.xpath("//div[@id='addBankAccountPopup']/div/div/div/div[3]/div/div[8]/label/span");
	public static By ACH_ACCEPT_TC = By.cssSelector("div.termCondSec > label > span");
	public static By ACH_ADDBANKACCOUNTSAVE = By.id("addBankAccountSave");
	public static By LISTOFADDEDPAYMENTMETHODS = By.cssSelector("tr > td.payment-method-width");
	public static By CONTINUE_PAYMENT = By.cssSelector("#creditCardContinue");
    public static By MORETHAN3PAYMENTS_POPUP = By.id("paymentErrorHeader");
    public static By MORETHAN3PAYMENTS_CLOSEPOPUP = By.id("paymentCloseBtn");
    public static By DELETE_PAYMENTMETHOD_ACH = By.xpath("//tr/td[contains(text(),'Personal')]/ancestor::tr/td/a[contains(text(),'Delete')]");
    
    
    
	//Account Profile
	public static By ACCOUNT_PROFILE = By.cssSelector("ul#side-menu li>a[href*=profile]");
	public static By EDITPERSONALINFOBUTTON = By.cssSelector("#accountPersonalInfo>input[class*=editAccount]");
	public static By SELECTPHONETYPE = By.cssSelector("select[id*=phoneType]");
	public static By ENTERPHONENUMBER = By.cssSelector("#phoneNumber");
	public static By PREFERREDTIME_MORNING = By.xpath("//*[@id='rdMorning']");
	public static By PREFERREDTIME_AFTERNOON = By.xpath("//*[@id='rdAfternoon']");
	public static By PREFERREDTIME_EVENING = By.xpath("//*[@id='rdEvening']");
	public static By SAVEPERSONALINFO = By.xpath("//*[@id='savePersonalInfoBtn']");
	public static By CANCELSAVEPERSONALINFO = By.xpath("//*[@id='cancelPersonalInfoBtn']");
	public static By EDITUSERNAMELINK = By.cssSelector("#usernameChangeIDP");
	public static By ENTERNEWEMAILADDRESS = By.cssSelector("input[name=email]");
	public static By CONFIRMEMAILADDRESS = By.cssSelector("input[name=confirmEmail]");
	public static By CHANGEEMAILSUBMITBUTTON = By.cssSelector("div[class*=emailSubmit]");
	public static By EDITEMAILADDRESS_CLOSEBUTTON = By.cssSelector("#emailAddressCloseBtn");
	public static By EDITEMAILSUCCESSMSG_CLOSEBUTTON = By.cssSelector("#usernameCloseBtn");
	public static By EDITEMAILSUCCESSMSG = By.xpath("//*[@id='usernameChange']/div/div/div/div[2]");
	public static By CHANGEPASSWORDLINK = By.cssSelector("#passwordChangeIDP");
	public static By CHANGEPASSWORDFRAME = By.cssSelector("#changePwdIframe");
	public static By OLDPASSWORD = By.cssSelector("#oldPassword");
	public static By NEWPASSWORD = By.cssSelector("#password");
	public static By CONFIRMNEWPASSWORD = By.cssSelector("#confirmPassword");
	public static By CHANGEPASSWORDBUTTON = By.cssSelector("#changePwdBtn");
	public static By CHANGEPASSWORD_CLOSEBUTTON = By.cssSelector("#changePwdCloseBtn");
	public static By PASSWORDCHANGECONFIRMMSG = By.cssSelector("#changPwdConf");
	public static By EDITCONTACTDETAILS_SUCCESSMSG = By.xpath("//*[@id=\"personalInfoToolTip\"]/div");
	
	//Account Profile Edit Address
	
	public static By EDITADDRESSBUTTON = By.cssSelector("#accountAddInfo>input[type=button]");
	public static By STREETADDRESS = By.cssSelector("#address");
	public static By APARTMENTADDRESS = By.cssSelector("#apartment_number");
	public static By CITY = By.cssSelector("#city");
	public static By STATE = By.cssSelector("#stateDropDown");
	public static By ZIPCODE = By.cssSelector("#zipcode");
	public static By SAVEADDRESSINFO = By.xpath("(//*[@id=\"savePersonalInfoBtn\"])[2]");
	public static By ADDRESS_ERRORMSG = By.xpath("//li[contains(@class,'parsley')]");
	public static By EDITADDRESS_SUCCESSMSG = By.xpath("//*[@id=\"personalAddToolTip\"]/div[2]");
	
	
	
	//Make Payment
	
	public static By PAYMENTMETHOD_DROPDOWN = By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/button/span[1]");
	public static By SELECT_MASTERCARD = By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div/ul/li[2]/a/span[contains(text(),'Master')]");
	public static By MAKEPAYMENT_CONTINUE = By.cssSelector("#paymentButton");
	public static By MAKEPAYMENT_TEXT = By.xpath("//*[@id=\"content\"]/div[1]/div[17]/div[2]/div[2]/div/h2");
	public static By CHECKBOX_TANDC = By.xpath("//p[@class='agree-tnc-check']//a[@title='Terms & Conditions']");
	public static By CHECKBOX2 = By.xpath("//*[@id=\"content\"]/div[1]/div[18]/div/div[1]/p[2]/a");
	public static By PAYNOW= By.id("makePaymentPayNow");
	
	
	
	//ACH page screen validations
	
	public static By ACH_ERRORMSGVALIDATION = By.xpath("//li[contains(@class,'parsley')]");
	public static By CREDITCARD_ERRORMSG = By.id("cardInfoError");
	public static By PAYMENTMETHODADDED_SUCCESSMSG = By.xpath("//tr/td/span[contains(@data-original-title,'<span>')]");
	public static By AVAILABLEPAYMENTMETHODS = By.xpath("//tbody/tr/td[contains(@class,'payment-method-width')]");
	
	
	
	// Auto Pay
	
	public static By MANAGE_AUTOPAY = By.id("manageAutoPay");
	public static By AUTOPAY_TYPE = By.id("autoPayType");
	public static By AUTOPAY_SAVE = By.xpath("//div/button[text()='Save']");
	public static By ENROLL_CHECKBOX = By.className("enroll-checkbox");
	public static By ENROLL_CONFIRMATIONBUTTON = By.id("enrollConfirmationmobbtn");
	public static By ENROLL_CONFIRM_SUCCESSMSG = By.className("enrollConfirmationTitle");
	public static By CLOSE_SUCCESSMSG = By.className("close_button");
	public static By UNENROLL = By.xpath("//a[contains(text(),'Unenroll')]");
	public static By CONFIRM_UNENROLL = By.xpath("//input[contains(@value,'Unenroll')]");
	public static By ENROLLED = By.xpath("//*[@id=\"content\"]/div[1]/div[3]/table/tbody/tr[1]/td[7]/span/img");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			

}
