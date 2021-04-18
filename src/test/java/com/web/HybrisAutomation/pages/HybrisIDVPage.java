package com.web.HybrisAutomation.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.google.common.base.Optional;
import com.web.automation.accelerators.ActionsLibrary;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.objectrepository.Ecom;
import com.web.automation.utilities.CommonVariables;
import com.web.automation.utilities.ConfigManager;
import com.web.automation.hybrisobjectrepository.Checkouts_OR;
import com.web.automation.hybrisobjectrepository.HTStore_OR;
import com.web.automation.hybrisobjectrepository.IDV_OR;
import com.web.automation.hybrisobjectrepository.PDP_OR;
import com.web.automation.hybrisobjectrepository.Payfone_OR;
import com.web.automation.hybrisobjectrepository.Agreement_OR;
import com.web.automation.hybrisobjectrepository.Dashboard_OR;


public class HybrisIDVPage extends HybrisBasePage {
	
	
	public HybrisIDVPage(WebDriver driver) {
		super(driver); 

	}

 // This Method Clicks On Skip this step on IDV screen
	
	public boolean idv_SkipStep()  {
	
	boolean flag = false;
	
	flag =CommonVariables.CommonDriver.get().findElement(IDV_OR.SKIPSTEP).isDisplayed();
	if(flag){extentLogs.pass("SkipStepinIDV","Skip Step is displayed in IDV");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(IDV_OR.SKIPSTEP));
		if(flag){extentLogs.pass("ClickSkipStepinIDV","SkipStep is clicked in IDV");
			}else{extentLogs.fail("ClickSkipStepinIDV","SkipStep is not clicked in IDV");}
	        }else{extentLogs.fail("SkipStepinIDV","SkipStep is not displayed in IDV");}
return flag;
	}
	
	// This Method Clicks On Skip this step on IDV screen
	
		public boolean idvdetails(String FULLSSN,String DOB) throws Throwable  {
		
		boolean flag = false;
		
		flag =CommonVariables.CommonDriver.get().findElement(IDV_OR.SSNNUMBER).isDisplayed();
		if(flag){extentLogs.pass("SSN NUMBER","SSN number text field is displayed");
			flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(IDV_OR.SSNNUMBER), FULLSSN);
			if(flag){extentLogs.pass("Click on SSN NUMBER","SSN Number is filled in IDV");
			flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(IDV_OR.DOB), DOB);
			if(flag){extentLogs.pass("Click on Date of birth","DOB is filled in IDV");
			flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(IDV_OR.CONTINUE));
			}
			
				}else{extentLogs.fail("SSN NUMBER","SSN number text field is not displayed");}
		        }else{extentLogs.fail("Click on SSN NUMBER","SSN Number is not filled in IDV");}
		
	return flag;
		}
		
		public boolean clickCheckout() throws Throwable  {
			
			boolean flag = false;			
			//flag=actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.CHECKOUTNOW));
			flag =CommonVariables.CommonDriver.get().findElement(Checkouts_OR.CHECKOUTNOW).isDisplayed();
			if(flag){extentLogs.pass("CheckoutNow","CheckoutNowIsDisplayed");
			/*Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);*/
			CommonVariables.CommonDriver.get().findElement(Checkouts_OR.CHECKOUTNOW).sendKeys(Keys.ESCAPE);
			actionLib.WebdriverWaitForPage();
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.WEEKLY));
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.CAL));
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.DATE));
			actionLib.WebdriverWaitForPage();
			actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.CONTINUE));
			actionLib.WebdriverWaitForPage();
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.BPLUS));
			Thread.sleep(4000);
			actionLib.WebdriverWaitForPage();
			actionLib.Click(CommonVariables.CommonDriver.get().findElement(Checkouts_OR.CONTINUEPAYMENT));
			actionLib.WebdriverWaitForPage();
			
			
}
			return flag;
		}
		
		public void acceptDocuSignAgreements() throws InterruptedException
	      {
	           
	            //actionLib.WaitForElementVisible(Agreement_OR.cb_AgreeTerms, 120);
	            try
	            {
	                  if(actionLib.IsElementVisible_WoError(Agreement_OR.cb_AgreeTerms, 50))
	                  {
	            actionLib.Click(CommonVariables.CommonDriver.get().findElement(Agreement_OR.cb_AgreeTerms),
	                              "Select I Agree terms in Docu Sign");
	                  }
	            }
	            catch(TimeoutException e)
	            {
	                 
	            }
	          if(actionLib.IsElementVisible_WoError(Agreement_OR.btn_DS_Continue, 5)){
	      actionLib.Click(CommonVariables.CommonDriver.get().findElement(Agreement_OR.btn_DS_Continue),
	                        "Continue");
	            }
	            // Getting placeholders in docusign
	            List<WebElement> signHere=CommonVariables.CommonDriver.get().findElements(By.xpath("//button[contains(@id,'tab-form-element')]"));
	            for(int i=0;i<1;i++)
	            {
	                  //actionLib.Click(signHere.get(i),"Initial Sign");
	                  actionLib.javascriptClick(signHere.get(i));
	                  //drawPattern();
	                 
	               if(actionLib.IsElementVisible_WoError(Agreement_OR.btn_AdoptAndSign, 5)){
	                  actionLib.Click(CommonVariables.CommonDriver.get().findElement(Agreement_OR.btn_AdoptAndSign),
	                                    "Adopt And Sign");
	                  //actionLib.javascriptClick(CommonVariables.CommonDriver.get().findElement(Agreement_OR.btn_AdoptAndSign));
	                  }
	                  else if(actionLib.IsElementVisible_WoError(Agreement_OR.span_AdoptAndInitial, 5)){
	                  actionLib.Click(CommonVariables.CommonDriver.get().findElement(Agreement_OR.span_AdoptAndInitial),
	                                    "Adopt And Initial");
	                  }
	            }
	           
	           
	            //Signing all the place holders
	            for(int j=1;j<signHere.size();j++)
	            {
	                  actionLib.Click(signHere.get(j),j+" th Sign");
	                  try {
	                        Thread.sleep(2000);
	                  } catch (InterruptedException e) {
	                        // TODO Auto-generated catch block
	                        e.printStackTrace();
	                  }
	            }
	 
	            //Once all signs are over clicking on the Finish button
	      actionLib.Click(CommonVariables.CommonDriver.get().findElement(Agreement_OR.btn_Finish),"Finish");
	            extentLogs.pass("Verify Applicant Signed","Successfully Signed");
	            Thread.sleep(10000);
	            //clicking Done
	      //actionLib.Click(CommonVariables.CommonDriver.get().findElement(Agreement_OR.btn_Done),"Done");
	            try {
	                  Thread.sleep(10000);
	            } catch (InterruptedException e) {
	                  // TODO Auto-generated catch block
	                  e.printStackTrace();
	            }
	           
	            //Wait till the Dashboard is loaded
	          //  actionLib.WaitForElementVisible(Dashboard_OR.searchCustomer, 30);
	      }

}
