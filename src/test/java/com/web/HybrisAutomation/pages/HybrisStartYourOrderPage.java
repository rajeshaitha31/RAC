package com.web.HybrisAutomation.pages;

import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.web.automation.hybrisobjectrepository.*;

public class HybrisStartYourOrderPage extends HybrisBasePage {

	public HybrisStartYourOrderPage(WebDriver driver) {
		super(driver);

	}

	// This Method Fills data in StartYourOrder-ContactAndDeliveryInfoSection

	public boolean StartYourOrder_ContactAndDeliveryInfo(String FirstName, String LastName, String Email,
			String VerifyEmail, String Phone, String DeliveryAddress, String Apt, String City, String State,
			String ZipCode) throws Throwable {

		boolean flag = false;
		flag = CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.START_YOURORDER_PAGETITLE)
				.isDisplayed();
		if (flag) {
			extentLogs.pass("VERIFYSTARTYOURORDERPAGETITLE", "StartYourOrderTitleIsDisplayed");
			flag = actionLib.javascriptSendKeys(
					CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_FIRSTNAME), FirstName);
					
			if (flag) {
				extentLogs.pass("StartOrder_EnterFirstName", "StartOrder_FirstNameIsEntered");
				flag = actionLib.javascriptSendKeys(
						CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_LASTNAME),
						LastName);
				if (flag) {
					extentLogs.pass("StartOrder_EnterLasttName", "StartOrder_LastNameIsEntered");
					flag = actionLib.javascriptSendKeys(
							CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_EMAILADDRESS),
							Email);
					if (flag) {
						extentLogs.pass("StartOrder_EnterEmail", "StartOrder_EmailIsEntered");
						flag = actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get()
								.findElement(Start_YourOrder_Generic_OR.SO_VERIFYEMAILADDRESS), VerifyEmail);
						if (flag) {
							extentLogs.pass("StartOrder_EnterVerifyEmail", "StartOrder_VerifyEmailIsEntered");
							flag = actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get()
									.findElement(Start_YourOrder_Generic_OR.SO_PHONENUMBER), Phone);
							if (flag) {
								extentLogs.pass("StartOrder_EnterPhone", "StartOrder_PhoneIsEntered");
								actionLib.javascriptClick(CommonVariables.CommonDriver.get()
										.findElement(Start_YourOrder_Generic_OR.SO_DELIVERYADDRESS));
								flag = actionLib.type(CommonVariables.CommonDriver.get()
										.findElement(Start_YourOrder_Generic_OR.SO_DELIVERYADDRESS), DeliveryAddress);
								if (flag) {
									extentLogs.pass("StartOrder_DeliveryAddress", "DeliveryAddressIsEntered");
									flag = actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get()
											.findElement(Start_YourOrder_Generic_OR.SO_APTNUMBER), Apt);
									if (flag) {
										extentLogs.pass("StartOrder_AptNumber", "AptNumberIsEntered");
										flag = actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get()
												.findElement(Start_YourOrder_Generic_OR.SO_CITY), City);
										if (flag) {
											extentLogs.pass("StartOrder_City", "CityIsEntered");
											flag = actionLib.selectByVisibleText(Start_YourOrder_Generic_OR.SO_STATE,
													State, "");
											if (flag) {
												extentLogs.pass("StartOrder_SelectState", "StateIsSelected");
												flag = actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get()
														.findElement(Start_YourOrder_Generic_OR.SO_ZIPCODE), ZipCode);
												if (flag) {
													extentLogs.pass("StartOrder_Zipcode", "ZipcodeIsEntered");
													System.out.println("Value is " + flag);
												} else {
													extentLogs.fail("StartOrder_Zipcode", "ZipcodeIsNotEntered");
												}
											} else {
												extentLogs.fail("StartOrder_SelectState", "StateIsNotSelected");
											}
										} else {
											extentLogs.fail("StartOrder_City", "CityIsNotEntered");
										}
									} else {
										extentLogs.fail("StartOrder_AptNumber", "AptNumberIsNotEntered");
									}
								} else {
									extentLogs.fail("StartOrder_DeliveryAddress", "DeliveryAddressIsNotEntered");
								}
							} else {
								extentLogs.fail("StartOrder_EnterPhone", "StartOrder_PhoneIsNotEntered");
							}
						} else {
							extentLogs.fail("StartOrder_EnterVerifyEmail", "StartOrder_VerifyEmailIsNotEntered");
						}
					} else {
						extentLogs.fail("StartOrder_EnterEmail", "StartOrder_EmailIsNotEntered");
					}
				} else {
					extentLogs.fail("StartOrder_EnterLastName", "StartOrder_LastNameIsNotEntered");
				}
			} else {
				extentLogs.fail("StartOrder_EnterFirstName", "StartOrder_FirstNameIsNotEntered");
			}
		} else {
			extentLogs.fail("VERIFYSTARTYOURORDERPAGETITLE", "StartYourOrderTitleIsNotDisplayed");
		}
		return flag;
	}

	// This Method fills data in EmploymentInfo fields

	public boolean StartYourOrder_EmploymentInfo(String SourceofIncome, String EmployersName, String EmployersPhone,
			String Duration, String TakeHome) throws Throwable {
		boolean flag = false;
		actionLib.waitForElementPresent(Start_YourOrder_Generic_OR.SO_EMPLOYMENTINFO_SECTIONTITLE, 5);
		flag = CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_EMPLOYMENTINFO_SECTIONTITLE)
				.isDisplayed();
		if (flag) {
			extentLogs.pass("VERIFYEMPLOYMENTINFOTITLE", "EmploymentInfoTitleIsDisplayed");
			Thread.sleep(3000);
			flag = actionLib.selectByVisibleText(Start_YourOrder_Generic_OR.SO_SOURCEOFINCOME, SourceofIncome, "");
			if (flag) {
				extentLogs.pass("StartOrder_SourceOfIncome", "SourceOfIncomeIsSelected");
				flag = actionLib.type(
						CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_EMPLOYERNAME),
						EmployersName);
				if (flag) {
					extentLogs.pass("StartOrder_EmployerName", "EmployerNameIsEntered");
					flag = actionLib.type(
							CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_EMPLOYERPHONE),
							EmployersPhone);
					if (flag) {
						extentLogs.pass("StartOrder_EmployersPhone", "EmployerPhoneIsEntered");
						flag = actionLib.selectByVisibleText(Start_YourOrder_Generic_OR.SO_HOWLONG, Duration, "");
						if (flag) {
							extentLogs.pass("StartOrder_EmploymentDuration", "EmploymentDurationisSelected");
							flag = actionLib.type(CommonVariables.CommonDriver.get()
									.findElement(Start_YourOrder_Generic_OR.SO_TAKEHOME), TakeHome);
							if (flag) {
								extentLogs.pass("StartOrder_TakeHome", "TakeHomeAmountIsEntered");
							} else {
								extentLogs.fail("StartOrder_TakeHome", "TakeHomeAmountNotEntered");
							}
						} else {
							extentLogs.fail("StartOrder_EmploymentDuration", "EmploymentDurationNotSelected");
						}
					} else {
						extentLogs.fail("StartOrder_EmployersPhone", "EmployerPhoneNotEntered");
					}
				} else {
					extentLogs.fail("StartOrder_EmployerName", "EmployerNameNotEntered");
				}
			} else {
				extentLogs.fail("StartOrder_SourceOfIncome", "SourceOfIncomeNotSelected");
			}
		} else {
			extentLogs.fail("StartOrder_EmploymentInfoTitle", "EmploymentInfoTitleIsNotDisplayed");
		}
		return flag;
	}

	// This Method fills data in Reference Info Fields

	public boolean StartYourOrder_ReferencesInfo(String RefOneFirstName, String RefOneLastName, String RefOnePhone,
			String RefOneRelationship, String RefTwoFirstName, String RefTwoLastName, String RefTwoPhone,
			String RefTwoRelationship) throws Throwable {
		boolean flag = false;
		flag = actionLib.type(
				CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_REFONE_FIRSTNAME),
				RefOneFirstName);
		if (flag) {
			extentLogs.pass("StartOrder_RefOneFirstName", "RefOneFirstNameIsEntered");
			flag = actionLib.type(
					CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_REFONE_LASTNAME),
					RefOneLastName);
			if (flag) {
				extentLogs.pass("StartOrder_RefOneLastName", "RefOneLastNameIsEntered");
				flag = actionLib.type(
						CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_REFONE_PHONE),
						RefOnePhone);
				if (flag) {
					extentLogs.pass("StartOrder_RefOnePhone", "RefOnePhoneIsEntered");
					flag = actionLib.selectByVisibleText(Start_YourOrder_Generic_OR.SO_REFONE_RELATIONSHIP,
							RefOneRelationship, "");
					if (flag) {
						extentLogs.pass("StartOrder_REFONE_RELATIONSHIP", "RefOneRelationshipIsSelected");
						flag = actionLib.type(CommonVariables.CommonDriver.get()
								.findElement(Start_YourOrder_Generic_OR.SO_REFTWO_FIRSTNAME), RefTwoFirstName);
						if (flag) {
							extentLogs.pass("StartOrder_RefTwoFirstName", "RefTwoFirstNameIsEntered");
							flag = actionLib.type(CommonVariables.CommonDriver.get()
									.findElement(Start_YourOrder_Generic_OR.SO_REFTWO_LASTNAME), RefTwoLastName);
							if (flag) {
								extentLogs.pass("StartOrder_RefTwoLastName", "RefTwoLastNameEntered");
								flag = actionLib.type(CommonVariables.CommonDriver.get()
										.findElement(Start_YourOrder_Generic_OR.SO_REFTWO_PHONE), RefTwoPhone);
								if (flag) {
									extentLogs.pass("StartOrder_RefTwoPhone", "RefTwoPhoneIsEntered");
									flag = actionLib.selectByVisibleText(
											Start_YourOrder_Generic_OR.SO_REFTWO_RELATIONSHIP, RefTwoRelationship, "");
									if (flag) {
										extentLogs.pass("StartOrder_REFTWOE_RELATIONSHIP",
												"RefTwoRelationshipIsSelected");
									} else {
										extentLogs.fail("StartOrder_REFTWOE_RELATIONSHIP",
												"RefTwoRelationshipNotSelected");
									}
								} else {
									extentLogs.fail("StartOrder_RefTwoPhone", "RefTwoPhoneIsNotEntered");
								}
							} else {
								extentLogs.fail("StartOrder_RefTwoLastName", "RefTwoLastNameNotEntered");
							}
						} else {
							extentLogs.pass("StartOrder_RefTwoFirstName", "RefTwoFirstNameNotEntered");
						}
					} else {
						extentLogs.fail("StartOrder_REFONE_RELATIONSHIP", "RefOneRelationshipNotSelected");
					}
				} else {
					extentLogs.fail("StartOrder_RefOnePhone", "RefOnePhoneNotEntered");
				}
			} else {
				extentLogs.fail("StartOrder_RefOneLastName", "RefOneLastNameNotEntered");
			}
		} else {
			extentLogs.fail("StartOrder_RefOneFirstName", "RefOneFirstNameNotEntered");
		}
		return flag;
	}

	// This Method clicks on Continue button in Start your Order Form
	public boolean StartYourOrder_Continue() {
		boolean flag = false;
		flag = actionLib.javascriptClick(
				CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_CONTINUE));
		if (flag) {
			extentLogs.pass("StartOrder_ClickContinue", "ContinueIsClicked");
		} else {
			extentLogs.fail("StartOrder_ClickContinue", "ContinueIsNotClicked");
		}
		return flag;
	}

	// This Method click on Continue button in Start your Order Form

	public boolean StartYourOrder_SubmitContactInformation() {
		boolean flag = false;
		flag = actionLib.Click(CommonVariables.CommonDriver.get()
				.findElement(Start_YourOrder_Generic_OR.SO_SUBMIT_CONTACTINFORMATION));
		if (flag) {
			extentLogs.pass("StartOrder_SUBMIT_CONTACTINFORMATION", "SUBMIT_CONTACTINFORMATIONIsClicked");
		} else {
			extentLogs.fail("StartOrder_SUBMIT_CONTACTINFORMATION", "SUBMIT_CONTACTINFORMATIONIsNotClicked");
		}
		return flag;
	}

	// This Method verifies the thank you popup after submitting contact information
	// in Start Your Order Form

	public boolean StartYourOrder_Verify_ThankYou_SubmitContactInfo() {
		boolean flag = false;
		flag = CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_ThankYou).isDisplayed();
		if (flag) {
			extentLogs.pass("StartOrder_Verify_ThankYou", "ThankYouPopUpIsDisplayed");
		} else {
			extentLogs.fail("StartOrder_Verify_ThankYou", "ThankYouPopUpIsNotDisplayed");
		}
		return flag;
	}

	// This method clicks on Submitwithoutoffer button

	public boolean StartYourOrder_SubmitWithoutOffer() {
		boolean flag = false;
		flag = CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_SUBMIT_WITHOUTOFFER_BUTTON)
				.isDisplayed();
		if (flag) {
			extentLogs.pass("StartOrder_SubmitWithoutOffer", "SubmitWithoutOfferIsDisplayed");
			flag = actionLib.Click(CommonVariables.CommonDriver.get()
					.findElement(Start_YourOrder_Generic_OR.SO_SUBMIT_WITHOUTOFFER_BUTTON));
			if (flag) {
				extentLogs.pass("CLick_SubmitWithoutOffer", "SubmitWithoutOfferIsClicked");
			} else {
				extentLogs.fail("CLick_SubmitWithoutOffer", "SubmitWithoutOfferNotClicked");
			}
		} else {
			extentLogs.fail("StartOrder_SubmitWithoutOffer", "SubmitWithoutOfferNotDisplayed");
		}
		return flag;
	}

	// This Method Clicks on ClaimOffer button

	public boolean StartYourOrder_ClickClaimOffer() {
		boolean flag = false;
		flag = CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_CLAIMOFFER_BUTTON)
				.isDisplayed();
		if (flag) {
			extentLogs.pass("StartOrder_ClaimOffer", "ClaimOfferIsDisplayed");
			flag = actionLib.Click(
					CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_CLAIMOFFER_BUTTON));
			if (flag) {
				extentLogs.pass("StartOrder_SubmitWithOffer", "SubmitWithtOfferIsClicked");
			} else {
				extentLogs.fail("StartOrder_SubmitWithOffer", "SubmitWithtOfferIsNotClicked");
			}
		} else {
			extentLogs.fail("StartOrder_ClaimOffer", "ClaimOfferIsNotDisplayed");
		}
		return flag;
	}

	// This Method fills data in IPO section

	@SuppressWarnings("static-access")
	public boolean StartYourOrder_ClaimOffer() throws Throwable {
		boolean flag = false;

		final String IPOFirstName = "FirstName";
		final String IPOLastName = "LastName";
		final String BILLINGADDRESS = "LegacyDrive";
		final String APT = "4017";
		final String CITY = "Plano";
		final String STATE = "Texas";
		final String ZIP = "75024";
		final String CARDNUMBER = "4242424242424242";
		final int CARDMONTH = 12;
		final int CARDYEAR = 5;
		final String CVV = "123";

		flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_FIRTSNAME), IPOFirstName);
		if (flag) {
			flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_LASTNAME),
					IPOLastName);
			if (flag) {
				flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_BILLINGADDRESS),
						BILLINGADDRESS);
				if (flag) {
					flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_APT), APT);
					if (flag) {
						flag = actionLib.type(CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_CITY),
								CITY);
						if (flag) {
							flag = actionLib.selectByVisibleText(ClaimIPO_OR.IPO_STATE, STATE, "");
							if (flag) {
								flag = actionLib
										.type(CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_ZIP), ZIP);
								if (flag) {
									actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get()
											.findElement(ClaimIPO_OR.IPO_VantivIFrame));
									actionLib.type(
											CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_CARDNUMBER),
											CARDNUMBER);
									actionLib.selectByIndex(ClaimIPO_OR.IPO_CARDMONTH, CARDMONTH, "");
									actionLib.selectByIndex(ClaimIPO_OR.IPO_CARDYEAR, CARDYEAR, "");
									actionLib.type(CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_CVV),
											CVV);
									actionLib.SwitchBackFromiFrameToMaincontent();
									actionLib.javascriptClick(
											CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_IAGREE));
									actionLib.Click(
											CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_SUBMIT));
								} else {
									extentLogs.fail("ENTER_CARDDATA_VANTIVFRAME", "FAIL");
								}
							} else {
								extentLogs.fail("ENTERIPOZIP", "FAIL");
							}
						} else {
							extentLogs.fail("SelectIPOSTATE", "FAIL");
						}
					} else {
						extentLogs.fail("ENTERIPOAPT", "FAIL");
					}
				} else {
					extentLogs.fail("ENTERIPOBillingAddress", "FAIL");
				}
			} else {
				extentLogs.fail("ENTERIPOLastName", "FAIL");
			}
		} else {
			extentLogs.fail("ENTERIPOFirstName", "FAIL");
		}

		return flag;

	}

	public boolean CCPayment(String FirstName, String LastName, String CardNumber, int CardMonth, int CardYear,
			String CVV) throws Throwable {

		boolean flag = false;

		flag = actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get().findElement(Reservation_OR.FN), FirstName);
		if (flag) {
			extentLogs.pass("StartOrder_EnterFirstName", "StartOrder_FirstNameIsEntered");
		}
		flag = actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get().findElement(Reservation_OR.LN), LastName);
		if (flag) {
			extentLogs.pass("StartOrder_EnterLasttName", "StartOrder_LastNameIsEntered");
		}
		if (flag)
			actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_VantivIFrame));
		flag = actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get().findElement(Reservation_OR.CARD), CardNumber);
		System.out.println("Card Value is" + CardNumber);
		actionLib.selectByIndex(Reservation_OR.CARDMONTH, CardMonth, "");
		actionLib.selectByIndex(Reservation_OR.CARDYEAR, CardYear, "");
		actionLib.javascriptSendKeys(CommonVariables.CommonDriver.get().findElement(Reservation_OR.CVV), CVV);
		actionLib.SwitchBackFromiFrameToMaincontent();
		

		return flag;
	}

	// this method is used to make payment through paypal

	/*
	 * public boolean payPalPayment(String Email) throws Throwable {
	 * 
	 * boolean flag = false;
	 * 
	 * flag =
	 * actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(
	 * Reservation_OR.PAYPAL_TAB)); if (flag) {
	 * extentLogs.pass("PayPal is displayed", "Clicked on the PayPal button"); }
	 * String parentwindow=CommonVariables.CommonDriver.get().getWindowHandle();
	 * System.out.println("main Window handle - > " + parentwindow);
	 * actionLib.WebdriverWaitForPage();
	 * actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(
	 * Reservation_OR.PAYPALFRAME));
	 * 
	 * System.out.println("Moved into frame");
	 * flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement
	 * (Reservation_OR.PAYPALPAY)); if (flag) {
	 * extentLogs.pass("PayPal payment is displayed",
	 * "Clicked on the PayPal payment button"); } actionLib.WebdriverWaitForPage();
	 * Set<String>handles=CommonVariables.CommonDriver.get().getWindowHandles();
	 * Iterator<String> I1= handles.iterator();
	 * 
	 * for(String handle : handles) { System.out.println("Window handle - > " +
	 * handle); }
	 * 
	 * 
	 * 
	 * while (I1.hasNext()) { String cw = I1.next();
	 * System.out.println("current window - > " + cw); if
	 * (!parentwindow.equalsIgnoreCase(cw)) { WebDriver
	 * wd=CommonVariables.CommonDriver.get().switchTo().window(cw);
	 * 
	 * System.out.println("Moved into child window : " + cw);
	 * System.out.println(wd.getTitle()); //break; //
	 * CommonVariables.CommonDriver.get().close();
	 * 
	 * } }
	 * 
	 * 
	 * 
	 * 
	 * for (String cw : handles) { // String cw = I1.next();
	 * System.out.println("current window - > " + cw); if
	 * (!cw.equalsIgnoreCase(parentwindow)) { WebDriver
	 * wd=CommonVariables.CommonDriver.get().switchTo().window(cw);
	 * 
	 * System.out.println("Moved into child window : " + cw);
	 * System.out.println(wd.getTitle()); break; //
	 * //CommonVariables.CommonDriver.get().close();
	 * 
	 * } else continue; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * //Set<String> allWindows = actionLib.getwindowHadles();
	 * 
	 * 
	 * for (String window : handles) { if (!window.equalsIgnoreCase(parentwindow)) {
	 * actionLib.switchToWindow(window); break; } else { continue; } }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * actionLib.type(CommonVariables.CommonDriver.get().findElement(Reservation_OR.
	 * PAYPALEMAIL), Email); //actionLib.SwitchBackFromiFrameToMaincontent();
	 * CommonVariables.CommonDriver.get().switchTo().window(parentwindow);
	 * System.out.println("return to original window");
	 * 
	 * 
	 * actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(
	 * Reservation_OR.IAGREE));
	 * actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(
	 * ClaimIPO_OR.IPO_SUBMIT)); return flag;
	 * 
	 * 
	 * 
	 * }
	 */

	
	// this method will apply the promo

	public boolean applyPromo() {
		boolean flag = false;
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PROMO));
		actionLib.WebdriverWaitForPage();
		flag = (CommonVariables.CommonDriver.get().findElement(Reservation_OR.LABEL_APPLIED)).isDisplayed();
		if (flag) {
			extentLogs.pass("Apply_Promo", "Promo_Applied");
		} else
			extentLogs.fail("Apply_Promo", "Promo is not applied");
		return flag;
	}

	// this method verify the message of reservation product
	public boolean VerifyReserveYourProduct_message() {
		boolean flag = false;

		flag = CommonVariables.CommonDriver.get().findElement(Reservation_OR.RESERVEPRODUCT_LABEL).isDisplayed();
		if (flag) {
			extentLogs.pass("ReserveYourProduct", "ReserveYourProductIsDisplayed");
		} else {
			extentLogs.fail("ReserveYourProduct", "ReserveYourProductIsNotDisplayed");
		}

		return flag;
	}

	// this method verify the message of Reservation Checkout
	public boolean VerifyReservationCheckout_message() {
		boolean flag = false;

		flag = CommonVariables.CommonDriver.get().findElement(Reservation_OR.RESERVATIONCHECKOUT_LABEL).isDisplayed();
		if (flag) {
			extentLogs.pass("ReservationCheckout", "ReservationCheckoutIsDisplayed");
		} else {
			extentLogs.fail("ReservationCheckout", "ReservationCheckoutIsNotDisplayed");
		}

		return flag;
	}

	// This method clicks on submit contact info method

	public boolean StartYourOrder_ClickSubmitContactInfo() {
		boolean flag = false;

		flag = CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_JUSTCONTACTME)
				.isDisplayed();
		if (flag) {
			extentLogs.pass("SubmitContactInfo_JustContcatMe", "JustContactMeIsDisplayed");
			flag = actionLib.javascriptClick(
					CommonVariables.CommonDriver.get().findElement(Start_YourOrder_Generic_OR.SO_JUSTCONTACTME));
			if (flag) {
				extentLogs.pass("SubmitContactInfo_JustContcatMe", "JustContactMeIsClicked");
			} else {
				extentLogs.fail("SubmitContactInfo_JustContcatMe", "JustContactMeIsNotClicked");
			}
		} else {
			extentLogs.fail("SubmitContactInfo_JustContcatMe", "JustContactMeIsNotDisplayed");
		}

		return flag;

	}

	public boolean StartYourOrder_ExpandPricing() {

		boolean flag = false;
		flag = CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_WOFPricingInfo).isDisplayed();
		if (flag) {
			extentLogs.pass("ExpandPricingInfo", "Displayed");
			flag = actionLib
					.javascriptClick(CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_WOFPricingInfo));
			if (flag) {
				extentLogs.pass("ExpandPricingInfo", "PASS");
			} else {
				extentLogs.pass("ExpandPricingInfo", "FAIL");
			}
		} else {
			extentLogs.fail("ExpandPricingInfo", "NotDisplayed");
		}

		return flag;

	}

	public boolean WOF_ValidateHTLegalText() {

		boolean flag = false;

		flag = CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_WOFLegalText).isDisplayed();
		String text = CommonVariables.CommonDriver.get().findElement(HTStore_OR.HT_WOFLegalText).getText();
		if (flag) {
			extentLogs.pass("WOFVerifyHTLegalText", "Pass::" + text);
		} else {
			extentLogs.fail("WOFVerifyHTLegalText", "FAIL");
		}

		return flag;

	}

	public boolean PaypalPayment(String paypalId, String paypalPwd) throws Throwable {

		boolean flag = false;

		String curwin = actionLib.getCurrentWindowHandle();
		flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_TAB));
		if (flag) {
			extentLogs.pass("PayPal is displayed", "Clicked on the PayPal button");
		}
		actionLib.WebdriverWaitForPage();
		actionLib.SwitchToiFrame(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPALFRAME));

		System.out.println("Moved into frame");
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_BUTTON));
		if (flag) {
			extentLogs.pass("PayPal payment is displayed", "Clicked on the PayPal payment button");
		}
		actionLib.WebdriverWaitForPage();
		Set<String> allWindows = actionLib.getwindowHadles();
		for (String window : allWindows) {
			if (!window.equalsIgnoreCase(curwin)) {
				actionLib.switchToWindow(window);
				break;
			} else {
				continue;
			}
		}
		actionLib.WebdriverWaitForPage();
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_EMAILID), paypalId);
		actionLib.WebdriverWaitForPage();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_NEXTBUTTON));
		actionLib.WebdriverWaitForPage();
		actionLib.type(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_PASSWORD), paypalPwd);
		actionLib.WebdriverWaitForPage();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_LOGINBUTTON));
		actionLib.WebdriverWaitForPage();
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Reservation_OR.PAYPAL_AGREE_CONTINUE));
		actionLib.WebdriverWaitForPage();
		actionLib.switchToWindow(curwin);
		actionLib.SwitchBackFromiFrameToMaincontent();
		actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Reservation_OR.IAGREE));
		flag = actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(ClaimIPO_OR.IPO_SUBMIT));

		return flag;
	}

}
