package com.web.automation.objectrepository;

import org.openqa.selenium.By;

public class Login_OR {

	//public static By MYACCOUNT = By.id("myAccount");
	public static By MYACCOUNT = By.cssSelector("a[aria-controls*=MyAccount]");
	public static By LOGINMESSAGE =By.cssSelector("h2[class*=agreement]");
	public static By NavigateToLogin =By.cssSelector("iframe[id*=signInIframe]");
	public static By CREATEACCOUNT = By.cssSelector("input[id*=createAccount]"); 
	public static By CONFIRM_CREATEACCOUNT = By.cssSelector("input[id*=activeCreateAccountBtn]");
	public static By WELCOMEMESSAGE_CREATEACCOUNT = By.cssSelector("div[id=confirmDiv]");
	public static By USER_NAME = By.cssSelector("input[id$=login]");
	public static By AMS_USER_NAME = By.cssSelector("input[id$=Email]");
	public static By PASSWORD = By.cssSelector("input[id$=password]");
	public static By AMS_PASSWORD = By.cssSelector("input[id$=Password]");
	public static By SIGNIN = By.cssSelector("button[type='submit']");
	public static By AMS_SIGNIN = By.cssSelector("input[id*=activeLoginBtn]");
	public static By LOGOUT = By.cssSelector("a[href$='/logout']");
	public static By AMS_LOGOUT=By.cssSelector(".sign-out-btn");
	public static By SIGNIN_FORM = By.cssSelector(".form.sign-in-form");
	public static By SEARCH_TAB = By.cssSelector("a[href$='search']");
	public static By LOGOUTMESSAGE = By.cssSelector("div[id*=signOutToolTip]");
	public static By ACTIVATEACCOUNT = By.cssSelector("a[id=activationLink]");
	public static By EMAILTOREGISTER = By.cssSelector("input[id=registerEmail]");
	public static By PASSWORD_ACTIVATE = By.cssSelector("input[id=password]");
	public static By CONFIRMPASSWORD_ACTIVATE = By.cssSelector("input[id=confirmPassword]");
	public static By ACCOUNTACTIVATE_BUTTON = By.cssSelector("input[id=activateAccountBtn]");
	public static By WELCOMEMESSAGE_ACTIVATEACCOUNT = By.cssSelector("div[id=customerLink]");
	
	
	public static By SEARCH_CUSTOMER = By.cssSelector("a[href$='customer']");
	public static By LASTNAME = By.cssSelector("#lastName");
	public static By FIRSTNAME = By.cssSelector("input[name='firstName']");
	public static By SEARCH = By.cssSelector("button[type='submit']");
	public static By STORE_00488 = By.xpath("//div[@class='span1 ng-binding' and contains(.,'00488')]");
	public static By STOP_HANDSYMBOL = By.cssSelector(".rac-stop.danger");
	public static By PDF_FILE = By.cssSelector("a[href$='agreement/pdf/9999198306047']>i");
	
	
	public static By CUSTOMER_NO = By.cssSelector("#customerNo");
	public static By SSN = By.cssSelector("#ssn");
	public static By DATEOFBIRTH = By.cssSelector("input[name='dateOfBirth']");
	public static By EMAIL = By.cssSelector("#email");
	public static By PHONENO = By.cssSelector("#phoneNo");
	public static By STATEID = By.cssSelector("#stateId");
	public static By GOVERNMENTIDTYPEID = By.cssSelector("#governmentIdTypeId");
	public static By GOVERNMENTIDNO = By.cssSelector("#governmentIdNo");
	public static By STORENO = By.cssSelector("#storeNo");
	public static By LINEOFBUSINESSID = By.cssSelector("#lineOfBusinessId");
	
	
	public static By btnContinue = By.cssSelector("#ctl00_ContentPlaceHolder1_btnEnrol");
	public static By loggedInUser = By.cssSelector("span[id$='lblName']");
}
