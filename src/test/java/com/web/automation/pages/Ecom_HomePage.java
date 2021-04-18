package com.web.automation.pages;

import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

import com.codoid.products.fillo.Recordset;
import com.google.common.base.Optional;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;

public class Ecom_HomePage extends BasePage {

	public Ecom_HomePage(WebDriver driver) {
		super(driver);

	}

	/****
	 * Method to Launch Ecom application
	 */

	public void LaunchApplication() {
		try {
			CommonVariables.CommonDriver.get().get(ConfigManager.getProperties().getProperty("url"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/****
	 * Method to verify error message
	 */
	public void verifyErrorMsg(By elementLocator, String Parameter) {
		String expectedmenuItems[] = Parameter.split(";");
		ArrayList<String> Messages = new ArrayList<String>();
		List<WebElement> menuItems = CommonVariables.CommonDriver.get().findElements(elementLocator);
		for (WebElement item : menuItems) {
			if (!(item.getText().isEmpty())) {
				Messages.add(item.getText());
			}
		}
		for (int i = 0; i < expectedmenuItems.length; i++) {
			if (Messages.get(i).equals(expectedmenuItems[i])) {
				extentLogs.pass("Verify Message " + expectedmenuItems[i], "Error Message " + expectedmenuItems[i]
						+ " matched with actual Message:" + Messages.get(i));
			} else {
				extentLogs.fail("Verify Message " + expectedmenuItems[i], "Expected Error mesage "
						+ expectedmenuItems[i] + " did not match with actual Message:" + Messages.get(i));
			}
		}
	}
	
	/****
	 * Method to verify error message in VA page
	 */
	
	public void VA_VerifyErrorMsg(By elementLocator, String Parameter) {
		String expectedmenuItems[] = Parameter.split(";");
		ArrayList<String> Messages = new ArrayList<String>();
		List<WebElement> menuItems = CommonVariables.CommonDriver.get().findElements(elementLocator);
		for (WebElement item : menuItems) {
			if (!(item.getText().isEmpty())) {
				Messages.add(item.getText());
			}
		}
		for (int i = 0; i < expectedmenuItems.length; i++) {
			if (Messages.get(i).equals(expectedmenuItems[i])) {
				extentLogs.pass("Verify Message " + expectedmenuItems[i], "Error Message " + expectedmenuItems[i]
						+ " matched with actual Message:" + Messages.get(i));
			} else {
				extentLogs.fail("Verify Message " + expectedmenuItems[i], "Expected Error mesage "
						+ expectedmenuItems[i] + " did not match with actual Message:" + Messages.get(i));
			}
		}
	}
		
	

	/****
	 * Method to verify error message in VA page with invalid data
	 */
	public void VA_VerifyErrorMsg_Invaliddata(By elementLocator, String Parameter) {
		String expectedmenuItems[] = Parameter.split("@");
		ArrayList<String> Messages = new ArrayList<String>();
		List<WebElement> menuItems = CommonVariables.CommonDriver.get().findElements(elementLocator);
		for (WebElement item : menuItems) {
			if (!(item.getText().isEmpty())) {
				Messages.add(item.getText());
			}
		}
		for (int i = 0; i < expectedmenuItems.length; i++) {
			if (Messages.get(i).equals(expectedmenuItems[i])) {
				extentLogs.pass("Verify Message " + expectedmenuItems[i], "Error Message " + expectedmenuItems[i]
						+ " matched with actual Message:" + Messages.get(i));
			} else {
				extentLogs.fail("Verify Message " + expectedmenuItems[i], "Expected Error mesage "
						+ expectedmenuItems[i] + " did not match with actual Message:" + Messages.get(i));
			}
		}
	}
	
	
	

	/****
	 * Method to select store
	 */
/*
	public void set_store_old(String Zipcode) throws Throwable {
		if(actionLib.isElementPresent(Ecom.Selected_Store)) {
			
			//actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Close_Popup));
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Selected_Store));
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Change_MyStore));
			extentLogs.pass("ClickonChangeMyLocation", "");
			
	} else {
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Set_Store));
		extentLogs.pass("ClickonSetStore", "");
		}
		
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.Set_Store), Zipcode);
		extentLogs.pass("EnterZipcode", "");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Go_Set_store));
		extentLogs.pass("ClickGoButton", "");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Make_thismystore));
		actionLib.WebdriverWaitForPage();
		//CommonVariables.CommonDriver.get().findElement(Ecom.My_store);
		extentLogs.pass("LocateMyStoreLink", "Located My Store");
		extentLogs.pass("SetBaseStore", "Base store set");

	}
	*/
	
	
	/****
	 * Method to select store
	 */

	public void set_store_old(String Zipcode) throws Throwable {
		
		//actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Close_Popup));
		
		if(CommonVariables.CommonDriver.get().findElement(Ecom.Store_Locator).getText().contains("My Store:"))
		{
			
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Selected_Store));
			actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.Change_MyStore));
			extentLogs.pass("ClickonChangeMyLocation", "");
			
			
		}
		else {
			
		
		//if(actionLib.isElementPresent(Ecom.Find_My_Store)) 
			
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Find_My_Store));
			extentLogs.pass("ClickonSetStore", "");
		} 
		
		
		
		
		/*actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Find_My_Store));
		extentLogs.pass("ClickonSetStore", "");*/
	
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.EnterZip));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.EnterZip), Zipcode);
		extentLogs.pass("EnterZipcode", "");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Go_Set_store));
		extentLogs.pass("ClickGoButton", "");
		actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.Make_thismystore));
		actionLib.WebdriverWaitForPage();
		//CommonVariables.CommonDriver.get().findElement(Ecom.My_store);
		extentLogs.pass("LocateMyStoreLink", "Located My Store");
		extentLogs.pass("SetBaseStore", "Base store set");
	
	}
	

	/**
	 * updated this method on 04-04-2019
	 * @param Zipcode
	 * @throws Throwable
	 */
	 public void set_store(String Zipcode) throws Throwable {

         

         try{

                         actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.New_Find_My_Store));

                         extentLogs.pass("ClickonSetStore", "");

                                        

                         actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.New_EnterZip), Zipcode);

                         extentLogs.pass("EnterZipcode", "");

                         actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.New_GoSetStore));

                         extentLogs.pass("ClickGoButton", "");

                         actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.New_MakeThisMyStore));

                         actionLib.WebdriverWaitForPage();

                         //CommonVariables.CommonDriver.get().findElement(Ecom.My_store);

                         extentLogs.pass("LocateMyStoreLink", "Located My Store");

                         extentLogs.pass("SetBaseStore", "Base store set");



         }catch(Exception e){

                         e.printStackTrace();

         }

        

        

}

	 
	 /**
	  * Method to change store
	  */

	 
	 public void change_store(String Zipcode) throws Throwable
	 {
		 try {
			 actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Selected_Store));
			 actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Change_Store));
			 
			 extentLogs.pass("ClickonChangeStore", "");
			 
			 actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.ChangeStore_EnterZip), Zipcode);

             extentLogs.pass("EnterZipcode", "");

             actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.ChangeStore_GoSetStore));

             extentLogs.pass("ClickGoButton", "");

             actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.New_MakeThisMyStore));

             actionLib.WebdriverWaitForPage();

             //CommonVariables.CommonDriver.get().findElement(Ecom.My_store);

             extentLogs.pass("LocateMyStoreLink", "Located My Store");

             extentLogs.pass("SetBaseStore", "Base store set");
		 }
	 catch(Exception e){

         e.printStackTrace();
         
	 }

}

	
	/****
	 * Method to select store
	 */
	
	public void GA_set_store(String ZipCode) throws Throwable {
		actionLib.WebdriverWaitForPage();
		actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.New_Find_My_Store));
        extentLogs.pass("ClickonSetStore", "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_EnterZip), ZipCode);
		extentLogs.pass("EnterZipcode", "");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Go_Set_store));
		extentLogs.pass("ClickGoButton", "");
		actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Make_thismystore));
		//actionLib.IsElementVisible(Ecom.GA_Store_message);
		extentLogs.pass("SetBaseStoreinGetApprovedPage", "Base store set in approvalformpage");
	}

	/****
	 * Method to change store
	 */
	public void GA_change_basestore(String ZipCode) throws Throwable {

		actionLib.WebdriverWaitForPage();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Selected_Store));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Change_Store));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_ChangeStore_Enterzip), ZipCode);
		extentLogs.pass("EnterZipcode", "");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_ChangeStore_Go));
		extentLogs.pass("ClickGoButton", "");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Make_thismystore));
		//actionLib.IsElementVisible(Ecom.GA_Store_message);
		extentLogs.pass("SetBaseStoreinGetApprovedPage", "Base store set in approvalformpage");

	}

	
	/****
	 * Method to search the product
	 */
	
	public void search_product(String productcode) throws Throwable {

		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Generic_Search_link));
		extentLogs.pass("SearchLink", "Clicked on searchlink");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.Generic_Search_input), productcode);
		extentLogs.pass("SearchBox", "Entered product code in searchbox");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Generic_Search_go));
		extentLogs.pass("Go", "Clicked on Go in genericsearch");

	}

	
	/****
	 * Method to navigate to PDP 
	 */
	
	public void Navigate_To_Pdp_withproductcode(String productcode) throws Throwable {

		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Generic_Search_link));
		extentLogs.pass("SearchLink", "Clicked on searchlink");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.Generic_Search_input), productcode);
		extentLogs.pass("SearchBox", "Entered product code in searchbox");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Generic_Search_go));
		extentLogs.pass("Go", "Clicked on Go in genericsearch");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Product_viewdetails));
		extentLogs.pass("ViewProductDetails", "Clicked on ViewDetails in searchresultspage");

	}
	
	

	public void NavigateToNonVaPage() {
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.HomePage_Getapproved));
	}

	/*public void NavigateToNonVaPage_PDP() {
		//actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.NonVA_GetStarted_GreenButton));   old
		
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_GetStarted_BlueButton)); // New
	}

	public void NavigateToVA_PDP() throws Throwable {

		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_GetStarted_BlueButton));
		extentLogs.pass("VAPage", "Navigated to VAPAge");

	}
	*/
	
	public void NavigateToApproval_PDP() throws Throwable {
		
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_GetStarted_BlueButton));
		extentLogs.pass("VAPage", "Navigated to Approval Page");

	}


	public void Close_StoreLocator(){
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Close_StorePopup));
	}
	
	
	/****
	 * Method to verify confirmation messages 
	 */
	
	public void VerifyData_VAConfirmationPage() throws Throwable {

		final String ApprovedCongrats, ApprovedAmount, ApprovedExpiry, ApprovedProduct;

		ApprovedCongrats = actionLib.getElementText(Ecom.VA_Approved_Congrats_Message, "Text in CongratsMessage");
		ApprovedAmount = actionLib.getElementText(Ecom.VA_Approved_Amount_Message, "Text in AmountMessage");
		ApprovedExpiry = actionLib.getElementText(Ecom.VA_Approved_Expiry_Message, "Text in ExpiryMessage");
		ApprovedProduct = actionLib.getElementText(Ecom.VA_Approved_Product_Message, "Text in ProductMessage");

		extentLogs.info("VAConfirmationPage", "ValidateMessagesinVAConfirmationPage");
		actionLib.IsElementVisible(Ecom.VA_Approved_Congrats_Message);
		extentLogs.pass("CongratulationsMessage", ApprovedCongrats);
		actionLib.IsElementVisible(Ecom.VA_Approved_Amount_Message);
		extentLogs.pass("ApprovalAmount", ApprovedAmount);
		actionLib.IsElementVisible(Ecom.VA_Approved_Expiry_Message);
		extentLogs.pass("ApprovalExpiry", ApprovedExpiry);
		actionLib.IsElementVisible(Ecom.VA_Approved_Product_Message);
		extentLogs.pass("ApprovedForProduct", ApprovedProduct);
		extentLogs.pass("VAApprovalPage", "VAApprovalPageDisplayedWithExpectedData");
	}

	public void VerifyData_VADeclinePage() throws Throwable {

		final String DeclineMessageHeading, Contentone, Contenttwo;

		DeclineMessageHeading = actionLib.getElementText(Ecom.VA_Decline_MessageHeading, "Text in DeclineMessage");
		Contentone = actionLib.getElementText(Ecom.VA_Decline_MessageContentone, "Text in DeclineMessage");
		Contenttwo = actionLib.getElementText(Ecom.VA_Decline_MessageContenttwo, "Text in DeclineMessage");

		extentLogs.info("VADeclinePage", "ValidateMessagesinVADeclinePage");
		actionLib.IsElementVisible(Ecom.VA_Decline_MessageHeading);
		extentLogs.pass("DeclineHeadingDisplayed", DeclineMessageHeading);
		actionLib.IsElementVisible(Ecom.VA_Decline_MessageContentone);
		extentLogs.pass("DeclineContentoneDisplayed", Contentone);
		actionLib.IsElementVisible(Ecom.VA_Decline_MessageContenttwo);
		extentLogs.pass("DeclineContenttwoDisplayed", Contenttwo);
		extentLogs.pass("VADeclinePage", "VADeclinePageDisplayedWithExpectedData");

	}

	public void VerifyData_VAConditionalPage() throws Throwable {

		final String ConditionalHeading, ConditionalMessage;

		ConditionalHeading = actionLib.getElementText(Ecom.VA_ConditionalHeading, "ConditionalHeading");
		ConditionalMessage = actionLib.getElementText(Ecom.VA_ConditionalMessage, "ConditionalMessage");

		extentLogs.info("VAConditionalPage", "ValidateMessagesinVAConditionalPage");
		actionLib.IsElementVisible(Ecom.VA_ConditionalHeading);
		extentLogs.pass("ConditionalApprovalHeadingDisplayed", ConditionalHeading);
		actionLib.IsElementVisible(Ecom.VA_ConditionalMessage);
		extentLogs.pass("ConditionalApprovalHeadingDisplayed", ConditionalMessage);
		extentLogs.pass("VAConditionalPage", "VAConditionalPageDisplayedWithExpectedData");
	}

	public void VA_FillData_VAForm(String FirstName, String LastName, String BaseStore, String PhoneType,
			String PhoneNumber, String Email, String VerifyEmail, String StreetAddress, String Apartment, String City,
			String State, String ZipCode, String Dl, String Ssn, String Dl_State, String SourceofIncome,
			String Employer, String EmployerPhone, String Duration, String TakeHome, String Dob_Month, String Dob_Day,
			String Dob_Year, String FirstName1, String SecondName1, String Relationship1, String RefPhone1,
			String FirstName2, String SecondName2, String Relationship2, String RefPhone2, String FirstName3,
			String SecondName3, String Relationship3, String RefPhone3) throws Throwable {

		extentLogs.info("Enterdata in ContactInformation", "Entering data in Contactinformation section");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_First_Name), FirstName);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Second_Name), LastName);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Phone_Number), PhoneNumber);
		actionLib.selectByVisibleText(Ecom.VA_drpPhoneType, PhoneType, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_emailaddress), Email);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_VerifyEmailaddress), VerifyEmail);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_preferredtime));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Homeaddress), StreetAddress);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Aptaddress), Apartment);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_City), City);
		actionLib.selectByVisibleText(Ecom.VA_Stdropdown, State, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_ZipCode), ZipCode);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_upperformcontinue));
		extentLogs.pass("Completed ContactInformation", "Entered data in Contactinformation section");

		extentLogs.info("Enter data in Employment", "Entering data in Employmentinformation section");
		actionLib.selectByVisibleText(Ecom.VA_Dob_month, Dob_Month, "");
		actionLib.selectByVisibleText(Ecom.VA_Dob_day, Dob_Day, "");
		actionLib.selectByVisibleText(Ecom.VA_Dob_year, Dob_Year, "");

		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Dl), Dl);
		actionLib.selectByVisibleText(Ecom.VA_Dl_State, Dl_State, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Ssn), Ssn);

		actionLib.selectByVisibleText(Ecom.VA_Sourceofincome, SourceofIncome, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Employername), Employer);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Employerphone), EmployerPhone);
		actionLib.selectByVisibleText(Ecom.VA_Duration, Duration, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_takehome), TakeHome);
		extentLogs.pass("Completed EmploymentData", "Entered data in Employmentinformation section");

		// ReferenceDetails
		extentLogs.info("Enter data in ReferenceSection", "Entering data in References section");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referenceonefirstname), FirstName1);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_refernceonelastname), SecondName1);
		actionLib.selectByVisibleText(Ecom.VA_referenceone_relationship, Relationship1, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_refernceone_phonenumber), RefPhone1);

		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referencetwofirstname), FirstName2);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referncetwolastname), SecondName2);
		actionLib.selectByVisibleText(Ecom.VA_referencetwo_relationship, Relationship2, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referncetwo_phonenumber), RefPhone2);

		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referencethreefirstname), FirstName3);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referncethreelastname), SecondName3);
		actionLib.selectByVisibleText(Ecom.VA_referencethree_relationship, Relationship3, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referncethree_phonenumber), RefPhone3);
		extentLogs.pass("Completed ReferenceSection", "Entered data in References section");

		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_finalcheckbox));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_finalsubmit));

		extentLogs.pass("SubmitData VAForm", "Submitted data in VA Form");

	}

	
	public void VA_FillContactinfoData(Recordset data) throws Throwable{
		
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_First_Name), data.getField("FirstName"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Second_Name), data.getField("LastName"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Phone_Number), data.getField("PhoneNumber"));
		actionLib.selectByVisibleText(Ecom.VA_drpPhoneType,data.getField("PhoneType"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_emailaddress), data.getField("Email"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_VerifyEmailaddress), data.getField("VerifyEmail"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_preferredtime));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Homeaddress), data.getField("StreetAddress"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Aptaddress), data.getField("Apartment"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_City), data.getField("City"));
		actionLib.selectByVisibleText(Ecom.VA_Stdropdown,data.getField("State"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_ZipCode), data.getField("ZipCode"));
		//actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_upperformcontinue));
		
				
	}
	
	
	
	public void VA_FillApprovalInfoData(Recordset data) throws Throwable{
		
		
		actionLib.selectByVisibleText(Ecom.VA_Dob_month, data.getField("Dob_Month"), "");
		actionLib.selectByVisibleText(Ecom.VA_Dob_day, data.getField("Dob_Day"), "");
		actionLib.selectByVisibleText(Ecom.VA_Dob_year, data.getField("Dob_year"), "");

				
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Dl), data.getField("Dl"));
		actionLib.selectByVisibleText(Ecom.VA_Dl_State, data.getField("Dl_State"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Ssn), data.getField("Ssn"));

		actionLib.selectByVisibleText(Ecom.VA_Sourceofincome, data.getField("SourceofIncome"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Employername), data.getField("Employer"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Employerphone), data.getField("EmployerPhone"));
		actionLib.selectByVisibleText(Ecom.VA_Duration, data.getField("Duration"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_takehome), data.getField("TakeHome"));
		
				
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referenceonefirstname), data.getField("FirstName1"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_refernceonelastname), data.getField("SecondName1"));
		actionLib.selectByVisibleText(Ecom.VA_referenceone_relationship, data.getField("Relationship1"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_refernceone_phonenumber), data.getField("RefPhone1"));

		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referencetwofirstname), data.getField("FirstName2"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referncetwolastname), data.getField("SecondName2"));
		actionLib.selectByVisibleText(Ecom.VA_referencetwo_relationship, data.getField("Relationship2"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referncetwo_phonenumber), data.getField("RefPhone2"));

		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referencethreefirstname), data.getField("FirstName3"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referncethreelastname), data.getField("SecondName3"));
		actionLib.selectByVisibleText(Ecom.VA_referencethree_relationship, data.getField("Relationship3"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_referncethree_phonenumber), data.getField("RefPhone3"));
				
	}
	
		
	
	public void NonVA_FillContactinfoData(Recordset data) throws Throwable {
		extentLogs.info("Enterdata in ContactInformation", "Entering data in Contactinformation section");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_First_Name),
				data.getField("FirstName"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Second_Name),
				data.getField("LastName"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Phone_Number),
				data.getField("PhoneNumber"));
		actionLib.selectByVisibleText(Ecom.GA_drpPhoneType, data.getField("PhoneType"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_emailaddress),  data.getField("Email"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_VerifyEmailaddress),
				data.getField("VerifyEmail"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_preferredtime));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_streetaddress),
				data.getField("StreetAddress"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_apartmentnumber),
				data.getField("Apartment"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_city), data.getField("City"));
		actionLib.selectByVisibleText(Ecom.GA_state,data.getField("State"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_zipcode), data.getField("ZipCode"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_upperformcontinue));
		extentLogs.pass("Completed ContactInformation", "Entered data in Contactinformation section");
		extentLogs.pass("Completed ContactInformation", "Entered data in Contactinformation section");
	}

	public void NonVA_FillData(String FirstName, String LastName, String BaseStore, String PhoneType,
			String PhoneNumber, String Email, String VerifyEmail, String StreetAddress, String Apartment, String City,
			String State, String ZipCode, String SourceofIncome, String Employer, String EmployerPhone, String Duration,
			String TakeHome, String FirstName1, String SecondName1, String Relationship1, String RefPhone1,
			String FirstName2, String SecondName2, String Relationship2, String RefPhone2) throws Throwable {

		extentLogs.info("Enterdata in ContactInformation", "Entering data in Contactinformation section");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_First_Name), FirstName);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Second_Name), LastName);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Phone_Number), PhoneNumber);
		actionLib.selectByVisibleText(Ecom.GA_drpPhoneType, PhoneType, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_emailaddress), Email);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_VerifyEmailaddress), VerifyEmail);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_preferredtime));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_streetaddress), StreetAddress);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_apartmentnumber), Apartment);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_city), City);
		actionLib.selectByVisibleText(Ecom.GA_state, State, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_zipcode), ZipCode);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_upperformcontinue));
		extentLogs.pass("Completed ContactInformation", "Entered data in Contactinformation section");

		// Employment Details
		extentLogs.info("Enter data in Employment", "Entering data in Employmentinformation section");
		//actionLib.selectByVisibleText(Ecom.GA_sourceofincome, SourceofIncome, "");
		actionLib.selectByIndex(Ecom.GA_sourceofincome, 1, "Source of Income");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_employername), Employer);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_employerphone), EmployerPhone);
		actionLib.selectByVisibleText(Ecom.GA_employmentduration, Duration, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_monthlyincome), TakeHome);
		extentLogs.pass("Completed EmploymentData", "Entered data in Employmentinformation section");

		// ReferenceDetails
		extentLogs.info("Enter data in ReferenceSection", "Entering data in References section");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referenceonefirstname), FirstName1);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_refernceonelastname), SecondName1);
		actionLib.selectByVisibleText(Ecom.GA_referenceone_relationship, Relationship1, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_refernceone_phonenumber), RefPhone1);

		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referencetwofirstname), FirstName2);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referncetwolastname), SecondName2);
		actionLib.selectByVisibleText(Ecom.GA_referencetwo_relationship, Relationship2, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referncetwo_phonenumber), RefPhone2);

		extentLogs.pass("Completed ReferenceSection", "Entered data in References section");
		//actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_finalcheckbox));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_submit));
		extentLogs.pass("SubmitData NonVAForm", "Submitted data in NonVA Form");
	}

	public void VerifyData_NonVAConfirmationPage() {

		actionLib.IsElementVisible(Ecom.GA_confirmation_thankyoutext);
		actionLib.IsElementVisible(Ecom.GA_confirmation_ordertext);
		extentLogs.info("OrderConfirmationPage", "Validating text in OrderConfirmationPage");
		extentLogs.pass("NonVAFormConfirmationPage", "OrderPlacedSuccessfully");
	}

	/*//Rare scenarios
	  public void VerifyData_VAConditionalPage() throws Throwable{
	  
	  final String ConditionalMessageHeading,Contentone,Contenttwo;
	  
	  ConditionalMessageHeading =
	  actionLib.getElementText(Ecom.VA_Conditional_MessageHeading,
	  "TextinConditionalHeading"); Contentone =
	  actionLib.getElementText(Ecom.VA_Conditional_MessageContentone,
	  "TextinContentone"); Contenttwo =
	  actionLib.getElementText(Ecom.VA_Conditional_MessageContenttwo,
	  "TextinContenttwo");
	  
	  extentLogs.info("VAConditionalPage",
	  "ValidateMessagesinVAConditionalPage");
	  actionLib.IsElementVisible(Ecom.VA_Conditional_MessageHeading);
	  extentLogs.pass("ConditionalApprovalHeadingDisplayed",
	  ConditionalMessageHeading);
	  actionLib.IsElementVisible(Ecom.VA_Conditional_MessageContentone);
	  extentLogs.pass("ConditionalContentoneDisplayed", Contentone);
	  actionLib.IsElementVisible(Ecom.VA_Conditional_MessageContenttwo);
	  extentLogs.pass("ConditionalContenttwoDisplayed", Contenttwo);
	  extentLogs.pass("VAConditionalPage",
	  "VAConditionalPageDisplayedWithExpectedData");
	  
	  
	  }
	 
*/
	public void QuitApplication() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void NonVA_SubmitContactinfo(String FirstName, String LastName, String BaseStore, String PhoneType,
			String PhoneNumber, String Email, String VerifyEmail, String StreetAddress, String Apartment, String City,
			String State, String ZipCode) throws Throwable {

		extentLogs.info("Enterdata in NonVAForm_ContactInformation",
				"Entering data in NonVAForm_Contactinformation section");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_First_Name), FirstName);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Second_Name), LastName);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Phone_Number), PhoneNumber);
		actionLib.selectByVisibleText(Ecom.GA_drpPhoneType, PhoneType, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_emailaddress), Email);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_VerifyEmailaddress), VerifyEmail);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_preferredtime));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_streetaddress), StreetAddress);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_apartmentnumber), Apartment);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_city), City);
		actionLib.selectByVisibleText(Ecom.GA_state, State, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_zipcode), ZipCode);
		extentLogs.info("Entereddata in NonVAForm_ContactInformation",
				"Entered data in NonVAForm_Contactinformation section");

		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_submitcontactinfo));
		extentLogs.info("ContactInfoPopup", "");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_justcontactme));
		extentLogs.pass("ClickContactInfoPopup", "Submitted contactinfo");
	}

	public void VA_SubmitContactInfo(String FirstName, String LastName, String BaseStore, String PhoneType,
			String PhoneNumber, String Email, String VerifyEmail, String StreetAddress, String Apartment, String City,
			String State, String ZipCode) throws Throwable {

		extentLogs.info("VAContactInformation", "Entering data in VAContactinformation section");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_First_Name), FirstName);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Second_Name), LastName);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Phone_Number), PhoneNumber);
		actionLib.selectByVisibleText(Ecom.VA_drpPhoneType, PhoneType, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_emailaddress), Email);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_VerifyEmailaddress), VerifyEmail);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_preferredtime));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Homeaddress), StreetAddress);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Aptaddress), Apartment);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_City), City);
		actionLib.selectByVisibleText(Ecom.VA_Stdropdown, State, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.VA_ZipCode), ZipCode);
		extentLogs.pass("VA ContactInformation", "Entered data in VAContactinformation section");

		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_submitcontactinfo));
		extentLogs.info("ContactInfoPopup", "");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.VA_Just_Contactme));
		extentLogs.pass("ClickContactInfoPopup", "Submitted contactinfo");
	}

	
	public void VerifyLinkStatus(){
		 List<WebElement> anchors = actionLib.FindElements(By.tagName("a"), timeoutInSecond );
	        System.out.println("Located" +anchors.size()+ "anchor elements on the page");
	        extentLogs.info("Located" +anchors.size()+ "anchor elements on the page","");
	        for(int i= 0;i<anchors.size();i++)
	        {
	        	WebElement wbel = anchors.get(i);
	        	String urlname = wbel.getAttribute("href"); 
	        	verifyLinkBroken(urlname); 
	        	
	        }

	        	}
		
	
	public void verifyLinkBroken(String urlname) { 
		try{
			URL url = new URL(urlname);
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(4000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()==200) 
			{
				System.out.println(urlname+"->"+httpURLConnect.getResponseMessage());
				extentLogs.pass(urlname, "Response::Code:"+httpURLConnect.getResponseCode()+"Message:"+httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
			{
				System.out.println(urlname+"->"+httpURLConnect.getResponseMessage()+":"+HttpURLConnection.HTTP_NOT_FOUND);
				extentLogs.fail(urlname, "ResponseCode:"+httpURLConnect.getResponseCode()+"ResponseMessage:"+httpURLConnect.getResponseMessage());
			}
		}catch(Exception e){
			
		}
	}
		
		
	/****
	 * Method to sign up for deals with valid data
	 */
		
	
	public void signUpForDeals_ValidData(Recordset data) throws Throwable {
		try {
			navigateToSignUpForDeals();
			signUpForDeals_FillData(data);
			Assert.assertEquals(
					CommonVariables.CommonDriver.get().findElement(Ecom.SignUpForDeals_SuccessMessage).getText(),
					"Email Sign Up Successful");
			extentLogs.pass("Sign Up for Deals", "Sign Up for Deals is Successful");
		} catch (Exception e) {
			throw e;
		}
	}

	
	/****
	 * Method to sign up for deals with different mail
	 */
	public void signUpForDeals_DifferentEmail(Recordset data) throws Throwable {
		try {

			navigateToSignUpForDeals();
			signUpForDeals_FillData(data);
			Assert.assertEquals(CommonVariables.CommonDriver.get()
					.findElement(Ecom.SignUpForDeals_ErrorMessage_DifferentEmails).getText(),
					"● Email and verify email do not match.");
			extentLogs.pass("Verify ErrorMessage",
					"Email and verify email do not match");
		} catch (Exception e) {
			throw e;
		}
	}

	
	/****
	 * Method to sign up for deals with verify email blank
	 */
	
	public void signUpForDeals_VerifyEmailBlank(Recordset data) throws Throwable {

		try {
			navigateToSignUpForDeals();
			signUpForDeals_FillData(data);
			Assert.assertEquals(CommonVariables.CommonDriver.get()
					.findElement(Ecom.SignUpForDeals_ErrorMessage_EmptyVerifyEmail).getText(),
					"● Verify Email cannot be empty.");
			extentLogs.pass("Verify ErrorMessage", "Verify Email cannot be empty");
		} catch (Exception e) {
			throw e;
		}
	}

	
	/****
	 * Method to sign up for deals with invalid email
	 */
	public void signUpForDeals_InvalidEmail(Recordset data) throws Throwable {
		try {
			navigateToSignUpForDeals();
			signUpForDeals_FillData(data);
			Assert.assertEquals(CommonVariables.CommonDriver.get()
					.findElement(Ecom.SignUpForDeals_ErrorMessage_InvalidEmail).getText(),
					"● Please use a valid email address.");
			extentLogs.pass("Verify ErrorMessage", "Please use a valid email address");
		} catch (Exception e) {
			throw e;
		}
	}

	
	/****
	 * Method to sign up for deals with blank data
	 */
	
	public void signUpForDeals_BlankData(Recordset data) throws Throwable {
		try {
			navigateToSignUpForDeals();
			signUpForDeals_FillData(data);
			Assert.assertEquals(CommonVariables.CommonDriver.get()
					.findElement(Ecom.SignUpForDeals_ErrorMessage_EmptyFields).getText(), "● Email cannot be empty.");
			extentLogs.pass("Verify ErrorMessage", "Email cannot be empty");
		} catch (Exception e) {
			throw e;

		}
	}

	/*public void unSubscribeForDeals(Recordset data) throws Throwable {
		try {
			navigateToSignUpForDeals();
			navigate_Unsubscribe();
			unsubscribe_Filldata(data);
			
		} catch (Exception e) {
			throw e;

		}
	}*/

	/****
	 * Method to unsubscribe for deals with valid email
	 */
	
	public void unsubscribeForDeals_FewerEmails_ValidEmail(Recordset data) throws Throwable {
		navigateToSignUpForDeals();
		navigate_Unsubscribe();
		unsubscribe_Filldata(data);
		extentLogs.info("fewer emails", "selected 'We'll send you fewer emails. Cross our hearts.' option");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_SubmitBtn), "Submit Button");
		Assert.assertEquals(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_SuccessMessage).getText(),
				"Email Unsubscribe Successful");
		extentLogs.pass("Unsubscribe for Deals", "Successfully Unsubscribe for Deals");
	}

	/****
	 * Method to unsubscribe for deals unsubscribe radio button selection
	 */
	
	public void unsubscribeForDeals_Unsubscribe(Recordset data) throws Throwable {
		navigateToSignUpForDeals();
		navigate_Unsubscribe();
		unsubscribe_Filldata(data);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Confirmation_Unsubscribe),
				"Decided to Unsubscribe");
		extentLogs.info("Unsubscribe", "selected 'Unsubscribe. We're sorry to see you go.' option");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_SubmitBtn), "Submit Button");
		Assert.assertEquals(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_SuccessMessage).getText(),
				"Email Unsubscribe Successful");
		extentLogs.pass("Unsubscribe for Deals", "Successfully Unsubscribe for Deals");
	}
    
	/****
	 * Method to unsubscribe for deals DecidedtoStay radio button selection
	 */
	
	public void unsubscribeForDeals_DecidedToStay(Recordset data) throws Throwable {
		navigateToSignUpForDeals();
		navigate_Unsubscribe();
		unsubscribe_Filldata(data);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Confirmation_DecidedToStay),
				"Decided to Stay");
		extentLogs.info("Decided to Stay", "selected 'Decided to Stay? Yay!' option");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_SubmitBtn), "Submit Button");
		Thread.sleep(1000);
		Assert.assertEquals(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_SuccessMessage).getText(),
				"Email Unsubscribe Successful");
		extentLogs.pass("Unsubscribe for Deals", "Successfully Unsubscribe for Deals");
	}

	
	/****
	 * Method to unsubscribe for deals invalid email
	 */
	
	public void unsubscribeForDeals_InValidEmail(Recordset data) throws Throwable {
		navigateToSignUpForDeals();
		navigate_Unsubscribe();
		unsubscribe_Filldata(data);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_SubmitBtn), "Submit Button");
		Assert.assertEquals(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_ErrorMessage).getText(),
				"• Please enter a valid email id");
		extentLogs.pass("Verify ErrorMessage",
				"Please enter a valid email id");
	}
	
	/****
	 * Method to unsubscribe for deals blankdata
	 */
	
	public void unsubscribeForDeals_BlankData(Recordset data) throws Throwable {
		navigateToSignUpForDeals();
		navigate_Unsubscribe();
		unsubscribe_Filldata(data);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_SubmitBtn), "Submit Button");
		Assert.assertEquals(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_ErrorMessage).getText(),
				"• Please enter your email address");
		extentLogs.pass("Unsubscribe for Deals",
				"Unsubscribe for Deals is unsuccessful, Please enter your email address");
	}

	
	/****
	 * Method to navigate to sign up for deals page
	 */
	
	
	public void navigateToSignUpForDeals() {
		
		actionLib.WebdriverWaitForPage();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.SignUp_For_Deals), "Sign Up ForDeals");
		actionLib.switchToMostRecentBrowser();
		extentLogs.pass("SignUpforDeals", "Navigated to SignUpforDealsPage");
	}

	/****
	 * Method to signup for deals fill data
	 */
	
	public void signUpForDeals_FillData(Recordset data) throws Throwable {
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.SignUpForDeals_Email),
				data.getField("Email"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.SignUpForDeals_VerifyEmail),
				data.getField("VerifyEmail"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.SignUpForDeals_Submit), "Submit Button");
	}
	
	/****
	 * Method to navigate to unsubscribe
	 */
	
	public void navigate_Unsubscribe()
	{
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_Deals),
				"Unsubscribe the Deals");
		extentLogs.pass("Unsubscribe", "Navigated to UnsubscribePage");
		
	}
	
	/****
	 * Method to unsubscribe fill data
	 */
	
	public void  unsubscribe_Filldata(Recordset data) throws Throwable
	{
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.Unsubscribe_Email),
				data.getField("Email"));
	}
	
	
	/**
	 * Method to fill data to contact customer service
	 */
	
	public void customerService_Filldata(Recordset data) throws Throwable
	{
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_email), data.getField("Email"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_phoneNumber), data.getField("PhoneNumber"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_PreferredContact_email),"clicked on Email");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_FirstName), data.getField("FirstName"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_LasttName), data.getField("LastName"));
		actionLib.selectByIndex(Ecom.CustomerService_selectTopic,1, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_comments), data.getField("Comments"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_submit),"clicked on submit button");
		
	}
	
	
	
	public void customerService_ChangeStore(Recordset data) throws Throwable
	{
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_email), data.getField("Email"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_phoneNumber), data.getField("PhoneNumber"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_PreferredContact_email),"clicked on Email");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_FirstName), data.getField("FirstName"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_LasttName), data.getField("LastName"));
		actionLib.selectByIndex(Ecom.CustomerService_selectTopic,1, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_comments), data.getField("Comments"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_changeLocation),"Clicked on Change Location");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_zipcode), data.getField("Zip"));
		actionLib.selectByIndex(Ecom.CustomerService_selectStore,1, "");
		extentLogs.pass("Change Store", "Changed the store Successfully");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.CustomerService_submit),"clicked on submit button");
		
	}
	
	
	/**
	 * This method is to create single weblead using Fillo
	 * @param data
	 * @throws Throwable
	 */
	
	public void WebLead_FillData(Recordset data) throws Throwable {

		extentLogs.info("Enterdata in ContactInformation", "Entering data in Contactinformation section");
		//actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_First_Name),  data.getField("FirstName"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_First_Name), randomFirstName());
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Second_Name), data.getField("LastName"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Phone_Number), data.getField("PhoneNumber"));
		actionLib.selectByVisibleText(Ecom.GA_drpPhoneType, data.getField("PhoneType"),"Phone Type");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_emailaddress), data.getField("Email"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_VerifyEmailaddress), data.getField("VerifyEmail"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_preferredtime));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_streetaddress), data.getField("StreetAddress"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_apartmentnumber), data.getField("Apartment"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_city), data.getField("City"));
		actionLib.selectByVisibleText(Ecom.GA_state, data.getField("State"),"State");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_zipcode), data.getField("ZipCode"));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_upperformcontinue));
		extentLogs.pass("Completed ContactInformation", "Entered data in Contactinformation section");

		// Employment Details
		extentLogs.info("Enter data in Employment", "Entering data in Employmentinformation section");
		//actionLib.selectByVisibleText(Ecom.GA_sourceofincome, SourceofIncome, "");
		actionLib.selectByIndex(Ecom.GA_sourceofincome, 1, " ");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_employername), data.getField("Employer"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_employerphone), data.getField("EmployerPhone"));
		actionLib.selectByVisibleText(Ecom.GA_employmentduration, data.getField("Duration")," ");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_monthlyincome), data.getField("TakeHome"));
		extentLogs.pass("Completed EmploymentData", "Entered data in Employmentinformation section");

		// ReferenceDetails
		extentLogs.info("Enter data in ReferenceSection", "Entering data in References section");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referenceonefirstname), data.getField("FirstName1"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_refernceonelastname), data.getField("SecondName1"));
		actionLib.selectByVisibleText(Ecom.GA_referenceone_relationship, data.getField("Relationship1"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_refernceone_phonenumber), data.getField("RefPhone1"));

		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referencetwofirstname), data.getField("FirstName2"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referncetwolastname), data.getField("SecondName2"));
		actionLib.selectByVisibleText(Ecom.GA_referencetwo_relationship, data.getField("Relationship2"), "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referncetwo_phonenumber), data.getField("RefPhone2"));

		extentLogs.pass("Completed ReferenceSection", "Entered data in References section");
		//actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_finalcheckbox));
		//actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_submit));
		extentLogs.pass("SubmitData NonVAForm", "Submitted data in NonVA Form");
	}
	
	
	
	
	
	
	/**
	 * Method to submit IPO using Fillo
	 * @param data
	 * @throws Throwable
	 */
	
	@SuppressWarnings("static-access")
	public void submit_IPO(Recordset data) throws Throwable
	
	{
		
		actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_ClaimOffer));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_FirstName), data.getField("FirstName"));
		//actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_FirstName), randomFirstName());
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_LastName), data.getField("LastName"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_Street), data.getField("StreetAddress"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_Apartment), data.getField("Apartment"));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_City), data.getField("City"));
		actionLib.selectByVisibleText(Ecom.IPO_state, data.getField("state"), "State");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_zip), data.getField("ZipCode"));
		actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_VantivIFrame));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_cardNumber), data.getField("cardnumber"));
		actionLib.selectByIndex(Ecom.IPO_expMonth, 3, "Expiry Month");
		actionLib.selectByIndex(Ecom.IPO_expYear, 3, "ExpiryYear");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_cvv), data.getField("CVV"));
		actionLib.SwitchBackFromiFrameToMaincontent();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_agreeTandC)," ");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_submit),"Clicked on submit offer");
		String orderNumber = CommonVariables.CommonDriver.get().findElement(Ecom.IPO_OrderNumber).getText();
		extentLogs.info("Order Number", orderNumber.substring(15));
		
		
		
	}
	
	
	
	
	
	
	
	/**
	 * Method to generate random first name
	 * @return
	 */
	
	public String randomFirstName()
	{
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString = "";
		int length = 5;
		
		Random rand = new Random();
		
		char[] text = new char[length];
		
		for(int i=0;i<length;i++)
		{
			text[i] = characters.charAt(rand.nextInt(characters.length()));
			
		}
		
		for(int i=0;i<text.length;i++)
		{
		  randomString += text[i];
		}
		
		//System.out.println(randomString);
		
		return randomString;
		
		
	}
		
		
	
	/**
	 * Method to generate random Last name
	 * @return
	 */
	
	public String randomLastName()
	{
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString = "";
		int length = 5;
		
		Random rand = new Random();
		
		char[] text = new char[length];
		
		for(int i=0;i<length;i++)
		{
			text[i] = characters.charAt(rand.nextInt(characters.length()));
			
		}
		
		for(int i=0;i<text.length;i++)
		{
		  randomString += text[i];
		}
		
		//System.out.println(randomString);
		
		return randomString;
		
		
	}
	
	
	
	
	
	
	
	
	/**
	 * This method is to create multiple webleads with initial payment
	 * 
	 * @throws Throwable
	 */
	
	
	@SuppressWarnings("static-access")
	public void NonVA_FillData_Weblead(  String PhoneType,
				String PhoneNumber, String Email, String VerifyEmail, String StreetAddress, String Apartment, String City,
				String State, String ZipCode, String Store, String SourceofIncome, String Employer, String EmployerPhone, String Duration,
				String TakeHome, String FirstName1, String SecondName1, String Relationship1, String RefPhone1,
				String FirstName2, String SecondName2, String Relationship2, String RefPhone2, String CardNumber, String CVV) throws Throwable {

			
		    String RandomFirstName = randomFirstName();
		    
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_First_Name), RandomFirstName );
			String RandomLastName = randomLastName();
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Second_Name), RandomLastName);
			
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Phone_Number), PhoneNumber);
			actionLib.selectByVisibleText(Ecom.GA_drpPhoneType, PhoneType, "");
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_emailaddress), Email);
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_VerifyEmailaddress), VerifyEmail);
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_preferredtime));
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_streetaddress), StreetAddress);
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_apartmentnumber), Apartment);
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_city), City);
			actionLib.selectByVisibleText(Ecom.GA_state, State, "");
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_zipcode), ZipCode);
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_upperformcontinue));
			
			actionLib.selectByIndex(Ecom.GA_sourceofincome, 1, "Source of Income");
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_employername), Employer);
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_employerphone), EmployerPhone);
			actionLib.selectByVisibleText(Ecom.GA_employmentduration, Duration, "");
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_monthlyincome), TakeHome);
			
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referenceonefirstname), FirstName1);
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_refernceonelastname), SecondName1);
			actionLib.selectByVisibleText(Ecom.GA_referenceone_relationship, Relationship1, "");
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_refernceone_phonenumber), RefPhone1);

			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referencetwofirstname), FirstName2);
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referncetwolastname), SecondName2);
			actionLib.selectByVisibleText(Ecom.GA_referencetwo_relationship, Relationship2, "");
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referncetwo_phonenumber), RefPhone2);
			
			// IPO
			actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_ClaimOffer));
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_FirstName), RandomFirstName);
			
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_LastName), RandomLastName);
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_Street), StreetAddress);
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_Apartment), Apartment);
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_City), City);
			actionLib.selectByVisibleText(Ecom.IPO_state, State, "");
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_zip), ZipCode);
			actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_VantivIFrame));
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_cardNumber), CardNumber);
			actionLib.selectByIndex(Ecom.IPO_expMonth, 3, "Expiry Month");
			actionLib.selectByIndex(Ecom.IPO_expYear, 3, "ExpiryYear");
			actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_cvv), CVV);
			actionLib.SwitchBackFromiFrameToMaincontent();
			actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_agreeTandC));
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_submit),"Clicked on submit offer");
			String orderNumber = CommonVariables.CommonDriver.get().findElement(Ecom.IPO_OrderNumber).getText();
			
			
			extentLogs.info("Order Details", "first Name : "  +RandomFirstName+  ", Last Name : "+RandomLastName+ ", Store : "+Store+ ", Order Number : "+orderNumber.substring(15));
		
		}
	
	
	/*
           @SuppressWarnings("static-access")
		public void submit_IPO(String FirstName, String LastName, String StreetAddress, String Apartment, String City, String State, String Zipcode, String CardNumber, String CVV ) throws Throwable
	
	        {
		
		actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_ClaimOffer));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_FirstName), FirstName);
		//actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_FirstName), randomFirstName());
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_LastName), LastName);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_Street), StreetAddress);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_Apartment), Apartment);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_City), City);
		actionLib.selectByVisibleText(Ecom.IPO_state, State, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_zip), Zipcode);
		actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_VantivIFrame));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_cardNumber), CardNumber);
		actionLib.selectByIndex(Ecom.IPO_expMonth, 3, "Expiry Month");
		actionLib.selectByIndex(Ecom.IPO_expYear, 3, "ExpiryYear");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_cvv), CVV);
		actionLib.SwitchBackFromiFrameToMaincontent();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_agreeTandC)," ");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_submit),"Clicked on submit offer");
		String orderNumber = CommonVariables.CommonDriver.get().findElement(Ecom.IPO_OrderNumber).getText();
		extentLogs.info("Order Number", orderNumber.substring(15));
		
		
		
	}*/
	
	
	/**
	 * This method is to submit weblead without offer
	 */
	
	public void NonVA_FillData_Weblead_WithoutIPO(  String PhoneType,
			String PhoneNumber, String Email, String VerifyEmail, String StreetAddress, String Apartment, String City,
			String State, String ZipCode, String SourceofIncome, String Employer, String EmployerPhone, String Duration,
			String TakeHome, String FirstName1, String SecondName1, String Relationship1, String RefPhone1,
			String FirstName2, String SecondName2, String Relationship2, String RefPhone2) throws Throwable {

		
	    String RandomFirstName = randomFirstName();
	    
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_First_Name), RandomFirstName );
		String RandomLastName = randomLastName();
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Second_Name), RandomLastName);
		
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_Phone_Number), PhoneNumber);
		actionLib.selectByVisibleText(Ecom.GA_drpPhoneType, PhoneType, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_emailaddress), Email);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_VerifyEmailaddress), VerifyEmail);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_preferredtime));
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_streetaddress), StreetAddress);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_apartmentnumber), Apartment);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_city), City);
		actionLib.selectByVisibleText(Ecom.GA_state, State, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_zipcode), ZipCode);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.GA_upperformcontinue));
		
		actionLib.selectByIndex(Ecom.GA_sourceofincome, 1, "Source of Income");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_employername), Employer);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_employerphone), EmployerPhone);
		actionLib.selectByVisibleText(Ecom.GA_employmentduration, Duration, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_monthlyincome), TakeHome);
		
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referenceonefirstname), FirstName1);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_refernceonelastname), SecondName1);
		actionLib.selectByVisibleText(Ecom.GA_referenceone_relationship, Relationship1, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_refernceone_phonenumber), RefPhone1);

		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referencetwofirstname), FirstName2);
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referncetwolastname), SecondName2);
		actionLib.selectByVisibleText(Ecom.GA_referencetwo_relationship, Relationship2, "");
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Ecom.GA_referncetwo_phonenumber), RefPhone2);
		
		actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Ecom.IPO_SubmitWithoutOffer));
		extentLogs.info("Order Details", "first Name : "  +RandomFirstName+  ", Last Name : "+RandomLastName );
		
		
	
	
}
	
	
}
	

		
	













