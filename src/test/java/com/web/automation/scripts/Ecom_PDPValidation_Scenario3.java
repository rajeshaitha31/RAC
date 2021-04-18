package com.web.automation.scripts;

//RTO Store - VANONVA InvY EcomN WebonlyY//


	import org.testng.annotations.Test;

	import com.web.automation.logs.ExtentLogs;
	import com.web.automation.objectrepository.Ecom;
	import com.web.automation.accelerators.ActionsLibrary;
	import com.web.automation.accelerators.TestEngineWeb;

	import com.web.automation.utilities.CommonVariables;
	import com.web.automation.pages.Ecom_HomePage;

	public class Ecom_PDPValidation_Scenario3 extends TestEngineWeb{

		ActionsLibrary actionLib = new ActionsLibrary();
		private Ecom_HomePage ecom_homepage;
		private ExtentLogs extentLogs = new ExtentLogs();
		
		private String basestore = "92530";
		private String productcode = "100021224";
		
		@Test(groups = { "smoke", "regression" })
		public void PDPValidation_Scenario3_Test() throws Throwable{
			
					
			ecom_homepage = new Ecom_HomePage(CommonVariables.CommonDriver.get());
			ecom_homepage.LaunchApplication();
		    actionLib.WebdriverWaitForPage();
		    
		    ecom_homepage.set_store(basestore);
		    ecom_homepage.Navigate_To_Pdp_withproductcode(productcode);
	    	extentLogs.pass("PDPPage", "Navigated to PDPPage");
	    	
		    extentLogs.info("PDPValidations", "RTO Store VANONVA InvY EcomN WebonlyY");	    	
	    	actionLib.Click(CommonVariables.CommonDriver.get().findElement(Ecom.NonVA_GetStarted_GreenButton));
	    	extentLogs.pass("VerifyButton", "GreenNonVAButtonDisplayed");
	    	
	    	//actionLib.IsElementVisible(Ecom.NONVA_FormText);
	    	//actionLib.IsElementVisible(Ecom.NONVA_NewLogo);
	    	actionLib.IsElementVisible(Ecom.GA_Contactinfo_Section);
	    	extentLogs.pass("VerifyNONVA", "NONVAFormContactInfoSectionDisplayed");
	    	actionLib.IsElementVisible(Ecom.GA_Employmentinfo_Section);
	    	extentLogs.pass("VerifyNONVA", "EmploymentInfoSectionDisplayed");
	    	
	    	}
		

}
