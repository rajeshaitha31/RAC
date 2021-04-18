package com.web.HybrisAutomation.pages;

import org.openqa.selenium.WebDriver;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.hybrisobjectrepository.Start_YourOrder_Generic_OR;
import com.web.automation.hybrisobjectrepository.VirtualApproval_OR;


public class HybrisGetApprovedNowPage extends HybrisBasePage{
	
	public HybrisGetApprovedNowPage(WebDriver driver) {
		super(driver);

}

//  This Method Fills data in VA Form-ContactAndDeliveryInfoSection
	
	public boolean GetApprovedNow_ContactAndDeliveryInfo(String FirstName, String LastName, String Email , String VerifyEmail,
			String Phone , String DeliveryAddress , String Apt , String City , String State , String ZipCode ) throws Throwable {
	
	boolean flag = false;
	flag=CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VIRTUALAPPROVAL_PAGETITLE).isDisplayed();
	if(flag){extentLogs.pass("VERIFYGETAPPROVEDNOWPAGETITLE","GetApprovedNowTitleIsDisplayed");
	actionLib.WebdriverWaitForPage();
	     flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CUSTOMER_FIRSTNAME),FirstName);
	     if(flag){extentLogs.pass("GetApprovedNow_EnterFirstName","StartOrder_FirstNameIsEntered");
	     flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CUSTOMER_LASTNAME),LastName);
	     if(flag){extentLogs.pass("GetApprovedNow_EnterLasttName","StartOrder_LastNameIsEntered");
	     flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CUSTOMER_EMAILADDRESS),Email);
	     if(flag){extentLogs.pass("GetApprovedNow_EnterEmail","StartOrder_EmailIsEntered");
	     flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CUSTOMER_VERIFYEMAILADDRESS),VerifyEmail);
	     if(flag){extentLogs.pass("GetApprovedNow_EnterVerifyEmail","StartOrder_VerifyEmailIsEntered");
	     flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_PHONENUMBER),Phone);
	     if(flag){extentLogs.pass("GetApprovedNow_EnterPhone","StartOrder_PhoneIsEntered");
	     flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_DELIVERYADDRESS),DeliveryAddress);
	     if(flag){extentLogs.pass("GetApprovedNow_DeliveryAddress","DeliveryAddressIsEntered");
	     flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_APTNUMBER),Apt);
	     if(flag){extentLogs.pass("GetApprovedNow_AptNumber","AptNumberIsEntered");
	     flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CITY),City);
	     if(flag){extentLogs.pass("GetApprovedNow_City","CityIsEntered");
	     flag=actionLib.selectByVisibleText(VirtualApproval_OR.VA_STATE,State,"");
	     if(flag){extentLogs.pass("GetApprovedNow_SelectState","StateIsSelected");
	     flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_ZIPCODE),ZipCode);
	     if(flag){extentLogs.pass("GetApprovedNow_Zipcode","ZipcodeIsEntered");
	     }else{extentLogs.fail("GetApprovedNow_Zipcode","ZipcodeIsNotEntered");}
	     }else{extentLogs.fail("GetApprovedNow_SelectState","StateIsNotSelected");}
	     }else{extentLogs.fail("GetApprovedNow_City","CityIsNotEntered");}
	     }else{extentLogs.fail("GetApprovedNow_AptNumber","AptNumberIsNotEntered");}
	     }else{extentLogs.fail("GetApprovedNow_DeliveryAddress","DeliveryAddressIsNotEntered");}
	     }else{extentLogs.fail("GetApprovedNow_EnterPhone","GetApprovedNow_PhoneIsNotEntered");}
	     }else{extentLogs.fail("GetApprovedNow_EnterVerifyEmail","GetApprovedNow_VerifyEmailIsNotEntered");}
	     }else{extentLogs.fail("GetApprovedNow_EnterEmail","GetApprovedNow_EmailIsNotEntered");}
	     }else{extentLogs.fail("GetApprovedNow_EnterLastName","GetApprovedNow_LastNameIsNotEntered");}
	     }else{extentLogs.fail("GetApprovedNow_EnterFirstName","GetApprovedNow_FirstNameIsNotEntered");}
		 }else{extentLogs.fail("VERIFYGETAPPROVEDNOWPAGETITLE","GetApprovedNowTitleIsNotDisplayed");}
return flag;
	}
	
	
	// This Method clicks on Continue button in VA Form
		public boolean GetApprovedNow_Continue() {
		boolean flag = false;
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CONTINUE));
	    if(flag){extentLogs.pass("GetApprovedNow_ClickContinue","ContinueIsClicked");
	    }else{extentLogs.fail("GetApprovedNow_ClickContinue","ContinueIsNotClicked");}
	return flag;
		}
		
		
		 //This Method fills data in VA Personal Info fields	
		
		public boolean GetApprovedNow_PersonalInfo(String Month, String Day ,String Year,
				String DL,String State, String SSN) throws Throwable {
	    boolean flag = false;
	    flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CUSTOMER_DOB_MONTH),Month);
	    if(flag){extentLogs.pass("GetApprovedNow_DOB_Month","MonthIsEntered");
	    flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CUSTOMER_DOB_DAY),Day);
	    if(flag){extentLogs.pass("GetApprovedNow_DOB_Day","DayIsEntered");
	    flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CUSTOMER_DOB_YEAR),Year);
	    if(flag){extentLogs.pass("GetApprovedNow_DOB_Year","YearIsEntered");
	    flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CUSTOMER_DL),DL);
	    if(flag){extentLogs.pass("GetApprovedNow_DrivingLicense","DrivingLicenseIsEntered");
	    flag=actionLib.selectByVisibleText(VirtualApproval_OR.VA_CUSTOMER_STATE,State,"");
	    if(flag){extentLogs.pass("GetApprovedNow_State","StateisSelected");
	    flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_CUSTOMER_SSN),SSN);
	    if(flag){extentLogs.pass("GetApprovedNow_SSN","SSNIsEntered");
	    }else{extentLogs.fail("GetApprovedNow_SSN","SSNNotEntered");}
	    }else{extentLogs.fail("GetApprovedNow_State","StateNotSelected");}
	    }else{extentLogs.fail("GetApprovedNow_DrivingLicense","DrivingLicenseNotEntered");}
	    }else{extentLogs.fail("GetApprovedNow_DOB_Year","YearNotEntered");}
	    }else{extentLogs.fail("GetApprovedNow_DOB_Day","DayNotEntered");}
	    }else{extentLogs.fail("GetApprovedNow_DOB_Month","MonthNotEntered");}
	return flag;	
		}
		
		
		 //This Method fills data in VA EmploymentInfo fields	
		
		public boolean GetApprovedNow_EmploymentInfo(String SourceofIncome, String EmployersName ,String EmployersPhone,
				String Duration,String TakeHome) throws Throwable {
	    boolean flag = false;
	    flag=CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_EMPLOYMENTSECTION_TITLE).isDisplayed();
	    if(flag){extentLogs.pass("VERIFYEMPLOYMENTSECTION","EmploymentTitleIsDisplayed");
	    flag=actionLib.selectByVisibleText(VirtualApproval_OR.VA_SOURCEOFINCOME,SourceofIncome,"");
	    if(flag){extentLogs.pass("GetApprovedNow_SourceOfIncome","SourceOfIncomeIsSelected");
	    flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_EMPLOYERNAME),EmployersName);
	    if(flag){extentLogs.pass("GetApprovedNow__EmployerName","EmployerNameIsEntered");
	    flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_EMPLOYERPHONE),EmployersPhone);
	    if(flag){extentLogs.pass("GetApprovedNow__EmployersPhone","EmployerPhoneIsEntered");
	    flag=actionLib.selectByVisibleText(VirtualApproval_OR.VA_HOWLONG,Duration,"");
	    if(flag){extentLogs.pass("GetApprovedNow__EmploymentDuration","EmploymentDurationisSelected");
	    flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_TAKEHOME),TakeHome);
	    if(flag){extentLogs.pass("GetApprovedNow__TakeHome","TakeHomeAmountIsEntered");
	    }else{extentLogs.fail("GetApprovedNow__TakeHome","TakeHomeAmountNotEntered");}
	    }else{extentLogs.fail("GetApprovedNow__EmploymentDuration","EmploymentDurationNotSelected");}
	    }else{extentLogs.fail("GetApprovedNow__EmployersPhone","EmployerPhoneNotEntered");}
	    }else{extentLogs.fail("GetApprovedNow__EmployerName","EmployerNameNotEntered");}
	    }else{extentLogs.fail("GetApprovedNow__SourceOfIncome","SourceOfIncomeNotSelected");}
	    }else{extentLogs.fail("VERIFYEMPLOYMENTSECTIONTITLE","EmploymentSectionTitleIsNotDisplayed");}
	return flag;	
		}
		
			
		//This Method fills data in VA Reference Info Fields

		public boolean GetApprovedNow_ReferencesInfo(String RefOneFirstName,String RefOneLastName, String RefOnePhone,
			String RefOneRelationship, String RefTwoFirstName,String RefTwoLastName,
			String RefTwoPhone, String RefTwoRelationship, String RefThreeFirstName,String RefThreeLastName,
			String RefThreePhone, String RefThreeRelationship) throws Throwable{
		boolean flag = false;
		flag=CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFONE_SECTIONTITLE).isDisplayed();
	    if(flag){extentLogs.pass("VERIFYREFERENCEONESECTION","ReferenceOneTitleIsDisplayed");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFONE_FIRSTNAME),RefOneFirstName);
		if(flag){extentLogs.pass("GetApprovedNow_RefOneFirstName","RefOneFirstNameIsEntered");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFONE_LASTNAME),RefOneLastName);
		if(flag){extentLogs.pass("GetApprovedNow_RefOneLastName","RefOneLastNameIsEntered");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFONE_PHONE), RefOnePhone);
		if(flag){extentLogs.pass("GetApprovedNow_RefOnePhone","RefOnePhoneIsEntered");
		flag=actionLib.selectByVisibleText(VirtualApproval_OR.VA_REFONE_RELATIONSHIP,RefOneRelationship,"");
		if(flag){extentLogs.pass("GetApprovedNow_REFONE_RELATIONSHIP","RefOneRelationshipIsSelected");
		flag=CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFTWO_SECTIONTITLE).isDisplayed();
	    if(flag){extentLogs.pass("VERIFYREFERENCETWOSECTION","ReferenceTwoTitleIsDisplayed");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFTWO_FIRSTNAME),RefTwoFirstName);
		if(flag){extentLogs.pass("GetApprovedNow_RefTwoFirstName","RefTwoFirstNameIsEntered");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFTWO_LASTNAME),RefTwoLastName);
		if(flag){extentLogs.pass("GetApprovedNow_RefTwoLastName","RefTwoLastNameEntered");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFTWO_PHONE), RefTwoPhone);
		if(flag){extentLogs.pass("GetApprovedNow_RefTwoPhone","RefTwoPhoneIsEntered");
		flag=actionLib.selectByVisibleText(VirtualApproval_OR.VA_REFTWO_RELATIONSHIP,RefTwoRelationship,"");
		if(flag){extentLogs.pass("GetApprovedNow_REFTWO_RELATIONSHIP","RefTwoRelationshipIsSelected");
		flag=CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFTHREE_SECTIONTITLE).isDisplayed();
	    if(flag){extentLogs.pass("VERIFYREFERENCETHREESECTION","ReferenceThreeTitleIsDisplayed");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFTHREE_FIRSTNAME),RefThreeFirstName);
		if(flag){extentLogs.pass("GetApprovedNow_RefThreeFirstName","RefThreeFirstNameIsEntered");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFTHREE_LASTNAME),RefThreeLastName);
		if(flag){extentLogs.pass("GetApprovedNow_RefThreeLastName","RefThreeLastNameEntered");
		flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_REFTHREE_PHONE), RefThreePhone);
		if(flag){extentLogs.pass("GetApprovedNow_RefThreePhone","RefThreePhoneIsEntered");
		flag=actionLib.selectByVisibleText(VirtualApproval_OR.VA_REFTHREE_RELATIONSHIP,RefThreeRelationship,"");
		if(flag){extentLogs.pass("GetApprovedNow_RefThree_RELATIONSHIP","RefThreeRelationshipIsSelected");
		}else{extentLogs.fail("GetApprovedNow_RefThree_RELATIONSHIP","RefThreeRelationshipNotSelected");}
		}else{extentLogs.fail("GetApprovedNow_RefThreePhone","RefThreePhoneIsNotEntered");}
		}else{extentLogs.fail("GetApprovedNow_RefThreeLastName","RefThreeLastNameNotEntered");}
		}else{extentLogs.pass("GetApprovedNow_RefThreeFirstName","RefThreeFirstNameNotEntered");}
	    }else{extentLogs.fail("VERIFYREFERENCETHREESECTION","ReferenceThreeTitleIsNotDisplayed");}
		}else{extentLogs.fail("GetApprovedNow_REFTWO_RELATIONSHIP","RefTwoRelationshipNotSelected");}
		}else{extentLogs.fail("GetApprovedNow_RefTwoPhone","RefTwoPhoneIsNotEntered");}
		}else{extentLogs.fail("GetApprovedNow_RefTwoLastName","RefTwoLastNameNotEntered");}
		}else{extentLogs.pass("GetApprovedNow_RefTwoFirstName","RefTwoFirstNameNotEntered");}
	    }else{extentLogs.fail("VERIFYREFERENCETWOSECTION","ReferenceTwoTitleIsNotDisplayed");}
		}else{extentLogs.fail("GetApprovedNow_REFONE_RELATIONSHIP","RefOneRelationshipNotSelected");}
		}else{extentLogs.fail("GetApprovedNow_RefOnePhone","RefOnePhoneNotEntered");}
		}else{extentLogs.fail("GetApprovedNow_RefOneLastName","RefOneLastNameNotEntered");}
		}else{extentLogs.fail("GetApprovedNow_RefOneFirstName","RefOneFirstNameNotEntered");}
	    }else{extentLogs.fail("VERIFYREFERENCEONESECTION","ReferenceOneTitleIsNotDisplayed");}
	return flag;
		}
			
		 // This method clicks on Submit VA form button
		
		public boolean GetApprovedNow_Submit(){
	    boolean flag = false;
	    flag=CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_ACCEPTCONDITIONS).isDisplayed();
	    if(flag){extentLogs.pass("GetApprovedNow_AcceptT&C","T&CCheckBoxIsDisplayed");
	    flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_ACCEPTCONDITIONS));
	    if(flag){extentLogs.pass("GetApprovedNow_Click_AcceptT&C","T&CCheckBoxIsClicked");
	    flag=CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_SUBMITBUTTON).isDisplayed();
	    if(flag){extentLogs.pass("GetApprovedNow_Submit","SubmitButtonIsDisplayed");
	    flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_SUBMITBUTTON));
	    if(flag){extentLogs.pass("CLick_GetApprovedNow_Submit","SubmitButtonIsClicked");
	    }else{extentLogs.fail("CLick_GetApprovedNow_Submit","SubmitButtonIsNotClicked");}
	    }else{extentLogs.fail("GetApprovedNow_Submit","SubmitButtonIsNotDisplayed");}
	    }else{extentLogs.fail("GetApprovedNow_Click_AcceptT&C","T&CCheckBoxIsNotClicked");}
	    }else{extentLogs.fail("GetApprovedNow_AcceptT&C","T&CCheckBoxIsNotDisplayed");}
	    
	return flag;
		}
		
		
		

		// This Method click on Submit Contact Info link on VA for,
		
		public boolean GetApproved_SubmitContactInformation(){
			boolean flag = false;
			flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_SUBMIT_CONTACTINFORMATION));
		    if(flag){extentLogs.pass("StartOrder_SUBMIT_CONTACTINFORMATION","SUBMIT_CONTACTINFORMATIONIsClicked");
		    }else{extentLogs.fail("StartOrder_SUBMIT_CONTACTINFORMATION","SUBMIT_CONTACTINFORMATIONIsNotClicked");}
		return flag;
			}
			
		
		
		// This method clicks on Just Contact me button 
		
		public boolean GetApproved_ClickOnJustContactMe() {
			boolean flag = false;
			
			flag=CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_JUSTCONTACTME).isDisplayed();
			if(flag){extentLogs.pass("SubmitContactInfo_JustContcatMe","JustContactMeIsDisplayed");
			flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(VirtualApproval_OR.VA_JUSTCONTACTME));
			if(flag){extentLogs.pass("SubmitContactInfo_JustContcatMe","JustContactMeIsClicked");
			}else { extentLogs.fail("SubmitContactInfo_JustContcatMe","JustContactMeIsNotClicked");	}
			}else { extentLogs.fail("SubmitContactInfo_JustContcatMe","JustContactMeIsNotDisplayed");}		
			
			
		
			return flag;
			
		}
		
	
}