package com.web.HybrisAutomation.CheckoutScripts;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.web.HybrisAutomation.pages.HybrisHomePage;
import com.web.HybrisAutomation.pages.HybrisIDVPage;
import com.web.HybrisAutomation.pages.HybrisOrderConfirmationPage;
import com.web.HybrisAutomation.pages.HybrisPDPPage;
import com.web.HybrisAutomation.pages.HybrisPayfonePage;
import com.web.HybrisAutomation.pages.HybrisReservationConfirmationPage;
import com.web.HybrisAutomation.pages.HybrisStartYourOrderPage;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.hybrisobjectrepository.Checkouts_OR;
import com.web.automation.hybrisobjectrepository.Reservation_OR;
import com.web.automation.utilities.CommonVariables;

public class Hybris_Checkouts_WeeklyPricing_SkipPayfone extends TestEngineWeb {
	ActionsLibrary actionLib = new ActionsLibrary();
	private HybrisHomePage hybris_homepage;
	private HybrisStartYourOrderPage startOrder;
	private HybrisOrderConfirmationPage orderconfirmationpage;
	private HybrisPDPPage hybrispdppage;
	private HybrisReservationConfirmationPage reservationconfirmationpage;
	// private ExtentLogs extentLogs = new ExtentLogs();
	private HybrisPayfonePage payfonepage;
	private HybrisIDVPage idvpage;

	private String Productcode, BaseStore, FiirstName, LastName, PhoneNumber, Email, VerifyEmail, StreetAddress,
			Apartment, City, State, ZipCode, CVV,FullSSN,DOB;
	private String SourceofIncome, EmployerName, EmployerPhone, Duration, TakeHome;
	private String FirstName1, SecondName1, Relationship1, RefPhone1, FirstName2, SecondName2, Relationship2, RefPhone2;
	private int CardMonth, CardYear;
	// private BigInteger CardNumber;
	private String CardNumber;
	// final String CardNumber = "5500000254444445";

	protected String sheetPath = System.getProperty("user.dir").replace("\\", "/") + "/Hybris_TestData/TestData.xlsx";
	protected String sheetName = "Checkouts";
	Map<String, List<String>> testdata = null;
	Faker faker = new Faker();
	String FirstName=faker.name().firstName();
	

	@BeforeMethod(alwaysRun = true, groups = { "smoke", "regression" })
	public void beforeMethod() throws IOException {
		// Contact Information Details
		this.BaseStore = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "BaseStore");
		this.Productcode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Productcode");
		//this.FirstName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FirstName");
		this.FirstName=FirstName;
		this.LastName = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "LastName");
		this.PhoneNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "PhoneNumber");
		this.Email = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Email");
		this.VerifyEmail = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "VerifyEmail");
		this.StreetAddress = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "StreetAddress");
		this.Apartment = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "Apartment");
		this.City = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "City");
		this.State = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "State");
		this.ZipCode = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "ZipCode");
		System.out.println("Card Value before" + CardNumber);
		this.CardNumber = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "CardNumber");
		// this.CardNumber=BigInteger.valueOf(Long.parseLong(ExcelReader.fn_GetCellData(this.sheetPath,
		// this.sheetName, 3, "CardNumber")));
		System.out.println("Card Value After" + CardNumber);
		this.CardMonth = Integer.parseInt(ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "CardMonth"));
		this.CardYear = Integer.parseInt(ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "CardYear"));
		this.CVV = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "CVV");
		this.FullSSN=ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "FullSSN");
		this.DOB=ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 1, "DOB");

		/*
		 * // Employment Details this.SourceofIncome =
		 * ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3,
		 * "SourceofIncome"); this.EmployerName =
		 * ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "Employer");
		 * this.EmployerPhone = ExcelReader.fn_GetCellData(this.sheetPath,
		 * this.sheetName, 3, "EmployerPhone"); this.Duration =
		 * ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "Duration");
		 * this.TakeHome = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3,
		 * "TakeHome"); // Reference details this.FirstName1 =
		 * ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "FirstName1");
		 * this.SecondName1 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName,
		 * 3, "SecondName1"); this.Relationship1 =
		 * ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3,
		 * "Relationship1"); this.RefPhone1 = ExcelReader.fn_GetCellData(this.sheetPath,
		 * this.sheetName, 3, "RefPhone1");
		 * 
		 * this.FirstName2 = ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName,
		 * 3, "FirstName2"); this.SecondName2 =
		 * ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "SecondName2");
		 * this.Relationship2 = ExcelReader.fn_GetCellData(this.sheetPath,
		 * this.sheetName, 3, "Relationship2"); this.RefPhone2 =
		 * ExcelReader.fn_GetCellData(this.sheetPath, this.sheetName, 3, "RefPhone2");
		 */
	}

	@Test(groups = { "smoke", "regression" })
	public void Hybris_Reservations_WeeklyPricing_SkipPayfonenIDV_Test() throws Throwable {
		boolean flag = false;
		hybris_homepage = new HybrisHomePage(CommonVariables.CommonDriver.get());
		flag = hybris_homepage.LaunchApplication();
		Assert.assertEquals(true, flag, "LaunchApplication");
		actionLib.WebdriverWaitForPage();

		flag = hybris_homepage.HomePage_VerifyAndSetBaseStore(BaseStore);
		actionLib.WebdriverWaitForPage();

		flag = hybris_homepage.HomePage_SearchItem(Productcode);
		Assert.assertEquals(true, flag, "Search a product");
		actionLib.WebdriverWaitForPage();

		flag = hybris_homepage.ResultsPage_ClickDetails();
		Assert.assertEquals(true, flag, "Clicked on product details");
		actionLib.WebdriverWaitForPage();

		hybrispdppage = new HybrisPDPPage(CommonVariables.CommonDriver.get());
		// flag = hybrispdppage.PDP_SetSemiMonthlyPricingOption();
		flag = hybrispdppage.PDP_StartYourOrder_New();
		actionLib.WebdriverWaitForPage();
		payfonepage = new HybrisPayfonePage(CommonVariables.CommonDriver.get());
		payfonepage.payFone_SkipStep();
		actionLib.WebdriverWaitForPage();
		startOrder = new HybrisStartYourOrderPage(CommonVariables.CommonDriver.get());
		flag = startOrder.StartYourOrder_ContactAndDeliveryInfo(FirstName, LastName, Email, VerifyEmail, PhoneNumber,
				StreetAddress, Apartment, City, State, ZipCode);
		Assert.assertEquals(true, flag, "StartYourOrder_ContactAndDeliveryInfo");
		actionLib.WebdriverWaitForPage();
		startOrder.StartYourOrder_Continue();
		actionLib.WebdriverWaitForPage();
		idvpage = new HybrisIDVPage(CommonVariables.CommonDriver.get());
		idvpage.idvdetails(FullSSN,DOB);
		actionLib.WebdriverWaitForPage();
		idvpage.clickCheckout();
		flag = startOrder.CCPayment(FirstName, LastName, CardNumber, CardMonth, CardYear, CVV);
		actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Reservation_OR.IAGREE));
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.CONTINUETOESIGN));
		actionLib.WebdriverWaitForPage();
		Thread.sleep(4000);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.CLOSEDOCUSIGN));
		actionLib.WebdriverWaitForPage();
		idvpage.acceptDocuSignAgreements();
		Thread.sleep(4000);
		actionLib.Click(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.SIGNLATER));
		actionLib.WebdriverWaitForPage();
		Thread.sleep(4000);		
		Assert.assertEquals(true, flag, "TestCasePassed");

	}
}
