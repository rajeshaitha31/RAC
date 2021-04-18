package com.web.HybrisAutomation.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


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

import com.web.automation.hybrisobjectrepository.HomePage_OR;
import com.web.automation.hybrisobjectrepository.PDP_OR;


public class HybrisHomePage extends HybrisBasePage {
	
	
	public HybrisHomePage(WebDriver driver) {
		super(driver);

	}
	
	// This method will launch the Ecom-Hybris application
 
	public boolean LaunchApplication() {
		boolean flag = false;
	try {
		CommonVariables.CommonDriver.get().get(ConfigManager.getProperties().getProperty("url"));
		extentLogs.pass("LaunchApplication", "Hybris application is launched");
		flag=true;
			
		} catch (Exception e) {
			extentLogs.fail("LaunchApplication", "Errors encountered while launching the application , please refer the detailed errorstack printed below");
			e.printStackTrace(); 
		}
	return flag;
	}
	
	/*
	
 // This method will search for homestore and set the homestore
	
 public boolean HomePage_VerifyAndSetBaseStore(String StoreZip) throws Throwable {
		
		boolean flag = false;
		
		flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_PRICINGFORSTORE).isDisplayed();
		if(flag){
		if(flag){extentLogs.info("CheckBaseStore", "BaseStorealreadyset,ChangingtheBaseStore");
		    	flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_PRICINGFORSTORE));
		    	 if(flag){extentLogs.pass("ClickonCurrentStoreHyperlink", "ClickedOnCurrentStoreHyperlink");
				    flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_CHANGESTORE).isDisplayed();
				     extentLogs.pass("VerifyChangeStoreDisplayed", "ChangeStoreisdisplayed");
				     flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_CHANGESTORE));
				      if(flag){extentLogs.pass("ClickonchangeStore", "ChangeStoreisClicked");
					      flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_HIDESTORE).isDisplayed();
     					   if(flag){extentLogs.pass("VerifySetStoreDisplayed", "SetStoreDisplayed");
     					  HomePage_ChangeBaseStore(StoreZip);
					 }else{extentLogs.fail("VerifySetStoreDisplayed","SetStoreisNotDisplayed");}
					  }else{extentLogs.fail("ClickonchangeStore","UnableToClickOnChangeStore");}
		    	}else{extentLogs.fail("ClickonCurrentStoreHyperlink","UnableToClickCurrentStoreHyperlink");}}
		    	}else{HomePage_SetBaseStore(StoreZip);}
		return flag;
		}
*/	
	

	
public boolean HomePage_VerifyAndSetBaseStore(String StoreZip) throws Throwable {
		
		boolean flag = false;
		
		
		flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_STORESELECTOR));
		if(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_CHANGESTORE).isDisplayed()) {
			extentLogs.pass("VerifyChangeStoreDisplayed", "ChangeStoreisdisplayed");
		     flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_CHANGESTORE));
		      if(flag){extentLogs.pass("ClickonchangeStore", "ChangeStoreisClicked");
			      flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_HIDESTORE).isDisplayed();
				   if(flag){extentLogs.pass("VerifySetStoreDisplayed", "SetStoreDisplayed");
				  HomePage_ChangeBaseStore(StoreZip);
			 }else{extentLogs.fail("VerifySetStoreDisplayed","SetStoreisNotDisplayed");}
			  }else{extentLogs.fail("ClickonchangeStore","UnableToClickOnChangeStore");}
		}else{HomePage_SetBaseStore(StoreZip);}
   	
		
		return flag;
		}


public boolean HomePage_HTVerifyAndSetBaseStore(String StoreZip) throws Throwable {
	
	boolean flag = false;
	
	
	flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_STORESELECTOR));
	if(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_CHANGESTORE).isDisplayed()) {
		extentLogs.pass("VerifyChangeStoreDisplayed", "ChangeStoreisdisplayed");
	     flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_CHANGESTORE));
	      if(flag){extentLogs.pass("ClickonchangeStore", "ChangeStoreisClicked");
		      flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_HIDESTORE).isDisplayed();
			   if(flag){extentLogs.pass("VerifySetStoreDisplayed", "SetStoreDisplayed");
			  HomePage_HTChangeBaseStore(StoreZip);
		 }else{extentLogs.fail("VerifySetStoreDisplayed","SetStoreisNotDisplayed");}
		  }else{extentLogs.fail("ClickonchangeStore","UnableToClickOnChangeStore");}
	}else{HomePage_SetHTBaseStore(StoreZip);}
	
	
	return flag;
	}


public boolean HomePage_HTChangeBaseStore(String StoreZip) throws Throwable {
	
	boolean flag = false;
			
	flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.ZIPCODE_TEXTBOX).isDisplayed();
	if(flag){extentLogs.pass("SetBaseStore","ZipCodeTextBoxIsDisplayed");
	    	flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(HomePage_OR.ZIPCODE_TEXTBOX), StoreZip);
	    	  if(flag){extentLogs.pass("EnterZipCode","ZipCodeEntered");
	    	  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.SETSTORE_GO));
	   		  if(flag){extentLogs.pass("ClickOnGoinMyStore","ClickedOnGoInMakeThisMyStore");
	   		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.HT_MAKETHISMYSTORE));
	   		  if(flag){extentLogs.pass("ClickMakeThisMyStore","ClickedOnMakeThisMyStore");
	   		  flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_PRICINGFORSTORE).isDisplayed();
	   		  if(flag){extentLogs.pass("SetBaseStore","BaseStoreSetSuccessfully");
	    		  }else{extentLogs.fail("VerifyBaseStore","BaseStoreNotdisplayed"); }
	        	  }else{extentLogs.fail("ClickMakeThisMyStore","UnableToClickOnMakeThisMyStore"); }
	    		  }else{extentLogs.fail("ClickOnGoinMyStore","UnableToClickOnGoInMakeThisMyStore");}
	    	      }else{extentLogs.fail("EnterZipCode", "UnableToEnterZipCode");}
	    	      }else{extentLogs.fail("SetBaseStore", "ZipCodeTextBoxNotDisplayed,UnabletoSetBaseStore");}
	              
            		
return flag;
}





public boolean HomePage_SetHTBaseStore(String StoreZip) throws Throwable {
	
	boolean flag = false;
	
	flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.ZIPCODE_TEXTBOX).isDisplayed();
	if(flag){extentLogs.pass("SetBaseStore","ZipCodeTextBoxIsDisplayed");
	    	flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(HomePage_OR.ZIPCODE_TEXTBOX), StoreZip);
	    	  if(flag){extentLogs.pass("EnterZipCode","ZipCodeEntered");
	    	  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.SETSTORE_GO));
	   		  if(flag){extentLogs.pass("ClickOnGoinMyStore","ClickedOnGoInMakeThisMyStore");
	   		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.HT_MAKETHISMYSTORE));
	   		  if(flag){extentLogs.pass("ClickMakeThisMyStore","ClickedOnMakeThisMyStore");
	   		  actionLib.WebdriverWaitForPage();
	   		  flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_PRICINGFORSTORE).isDisplayed();
	   		  if(flag){extentLogs.pass("SetBaseStore","BaseStoreSetSuccessfully");
	    		  }else{extentLogs.fail("VerifyBaseStore","BaseStoreNotdisplayed"); }
	        	  }else{extentLogs.fail("ClickMakeThisMyStore","UnableToClickOnMakeThisMyStore"); }
	    		  }else{extentLogs.fail("ClickOnGoinMyStore","UnableToClickOnGoInMakeThisMyStore");}
	    	      }else{extentLogs.fail("EnterZipCode", "UnableToEnterZipCode");}
			      }else{extentLogs.fail("SetBaseStore", "ZipCodeTextBoxNotDisplayed,UnabletoSetBaseStore");}
	              
return flag;
}







public boolean HomePage_SetBaseStore(String StoreZip) throws Throwable {
	
	boolean flag = false;
	
	flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.ZIPCODE_TEXTBOX).isDisplayed();
	if(flag){extentLogs.pass("SetBaseStore","ZipCodeTextBoxIsDisplayed");
	    	flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(HomePage_OR.ZIPCODE_TEXTBOX), StoreZip);
	    	  if(flag){extentLogs.pass("EnterZipCode","ZipCodeEntered");
	    	  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.SETSTORE_GO));
	   		  if(flag){extentLogs.pass("ClickOnGoinMyStore","ClickedOnGoInMakeThisMyStore");
	   		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.MAKETHISMYSTORE));
	   		  if(flag){extentLogs.pass("ClickMakeThisMyStore","ClickedOnMakeThisMyStore");
	   		  actionLib.WebdriverWaitForPage();
	   		  flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_PRICINGFORSTORE).isDisplayed();
	   		  if(flag){extentLogs.pass("SetBaseStore","BaseStoreSetSuccessfully");
	    		  }else{extentLogs.fail("VerifyBaseStore","BaseStoreNotdisplayed"); }
	        	  }else{extentLogs.fail("ClickMakeThisMyStore","UnableToClickOnMakeThisMyStore"); }
	    		  }else{extentLogs.fail("ClickOnGoinMyStore","UnableToClickOnGoInMakeThisMyStore");}
	    	      }else{extentLogs.fail("EnterZipCode", "UnableToEnterZipCode");}
			      }else{extentLogs.fail("SetBaseStore", "ZipCodeTextBoxNotDisplayed,UnabletoSetBaseStore");}
	              
return flag;
}






	 // This method will Change base store	
	
public boolean HomePage_ChangeBaseStore(String StoreZip) throws Throwable {
		
		boolean flag = false;
				
		flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.ZIPCODE_TEXTBOX).isDisplayed();
		if(flag){extentLogs.pass("SetBaseStore","ZipCodeTextBoxIsDisplayed");
		    	flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(HomePage_OR.ZIPCODE_TEXTBOX), StoreZip);
		    	  if(flag){extentLogs.pass("EnterZipCode","ZipCodeEntered");
		    	  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.SETSTORE_GO));
		   		  if(flag){extentLogs.pass("ClickOnGoinMyStore","ClickedOnGoInMakeThisMyStore");
		   		  flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.MAKETHISMYSTORE));
		   		  if(flag){extentLogs.pass("ClickMakeThisMyStore","ClickedOnMakeThisMyStore");
		   		  flag=CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_PRICINGFORSTORE).isDisplayed();
		   		  if(flag){extentLogs.pass("SetBaseStore","BaseStoreSetSuccessfully");
		    		  }else{extentLogs.fail("VerifyBaseStore","BaseStoreNotdisplayed"); }
		        	  }else{extentLogs.fail("ClickMakeThisMyStore","UnableToClickOnMakeThisMyStore"); }
		    		  }else{extentLogs.fail("ClickOnGoinMyStore","UnableToClickOnGoInMakeThisMyStore");}
		    	      }else{extentLogs.fail("EnterZipCode", "UnableToEnterZipCode");}
		    	      }else{extentLogs.fail("SetBaseStore", "ZipCodeTextBoxNotDisplayed,UnabletoSetBaseStore");}
		              
                		
	return flag;
	}
	
	
	

	
	// This method will search for a product and navigate to results page
	
	public boolean HomePage_SearchItem(String RmsItemCode ) throws Throwable {
	boolean flag = false;

	flag =actionLib.type(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_SEARCHBOX), RmsItemCode);
	if(flag){extentLogs.pass("EnterItemCode","EnteredItemCodeInSearchBox");
		flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_SEARCHSUBMIT));
		actionLib.WebdriverWaitForPage();
		 if(flag){extentLogs.pass("ClickOnSearchIcon","ClickedSearchIcon");}
		 else{extentLogs.fail("ClickOnSearchIcon","NotClickedOnSearchIcon");}
	     }else{extentLogs.fail("EnterItemCode","ItemCodeNotEnteredInSearchBox");	}
	
	
return flag;	
	}
	
	// This Method will verify if results are displayed for a searched item [This method validates objects on Search results page] and click on Details HyperLink
		
	public boolean ResultsPage_ClickDetails() {
	boolean flag = false;
flag =CommonVariables.CommonDriver.get().findElement(PDP_OR.SEARCHREULTS_PRODUCT_VIEWDETAILS).isDisplayed();
if(flag){extentLogs.pass("ValidateSearch","ProductDetailsButtonDisplayed");
        flag=actionLib.Click(CommonVariables.CommonDriver.get().findElement(PDP_OR.SEARCHREULTS_PRODUCT_VIEWDETAILS));
        if(flag){extentLogs.pass("ClickDetailsButton","ClickedOnDetailsButton");}
        else{extentLogs.fail("ClickDetailsButton","FailedToClickDetailsButton");}
        }else{extentLogs.fail("ValidateSearch","ProductDetailsButtonNotDisplayed");} 		
return flag;
		}
	
	
	// This Method will verify for the broken links
	
	
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
		
	
	// This Method will verify status of links
	
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
		
	//This method will click on Start Order on Homepage
	public boolean StartOrder_Homepage() {
		
		boolean flag = false;
		
		flag = CommonVariables.CommonDriver.get().findElement(HomePage_OR.STARTORDER_HOMEPAGE).isDisplayed();
		if(flag){extentLogs.pass("StartOrder","StartOrderButtonDisplayed");
		flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.STARTORDER_HOMEPAGE));
		if(flag){extentLogs.pass("StartOrder", "ClickedOnStartOrderButton");}
		else{extentLogs.fail("StartOrder","FailedToClickStartOrderButton");}
		}else{extentLogs.fail("StartOrder","StartOrderButtonNotDisplayed");}
		return flag;
	}
	
	
	
	
	//This method will click on Start Order on GlobalHeader
	
public boolean StartOrder_GlobalHeader() {
		
		boolean flag = false;
		
		flag = CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_ORDER_TEXT).isDisplayed();
		if(flag){extentLogs.pass("StartOrder","StartOrderButtonDisplayed");
		flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.GLOBAL_ORDER_TEXT));
		if(flag){extentLogs.pass("StartOrder", "ClickedOnOrderButtonOnGlobalHeader");}
		else{extentLogs.fail("StartOrder","FailedToClickStartOrderButton");}
		}else{extentLogs.fail("StartOrder","OrderButtonNotDisplayed");}
		return flag;
	}
	

public boolean NeverMissDeal(String email) throws Throwable {
	boolean flag = false;
	
	flag = CommonVariables.CommonDriver.get().findElement(HomePage_OR.NEVER_MISSADEAL_TEXT).isDisplayed();
	if(flag){extentLogs.pass("NeverMissDeal","NeverMissDealsIsDisplayed");
	flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(HomePage_OR.NEVER_MISSADEAL_INPUTBOX), email);
	if(flag){extentLogs.pass("EnterEmail","EmailEntered");
	flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.NEVER_MISSADEAL_SIGNUPBUTTON));  
	if(flag){extentLogs.pass("ClickOnSignUpButton","ClickedOnSignUpButton");
	flag = CommonVariables.CommonDriver.get().findElement(HomePage_OR.NEVER_MISSADEAL_SUCCESSMESSAGE).isDisplayed();
	if(flag){extentLogs.pass("SignupDealsSuccessMessage","SignupDealsSuccessMessageIsDisplayed");
	}else{extentLogs.fail("SignupDealsSuccessMessage","SignupDealsSuccessMessageIsNotDisplayed");}
	}else{extentLogs.fail("ClickOnSignUpButton","UnableToClickOnSignUpButton");}
	}else{extentLogs.fail("EnterEmail","UnableToEnterEmail");}
	}else{extentLogs.fail("NeverMissDeal","NeverMissDealsIsNotDisplayed");}
	return flag;
}
	
	

public boolean SignUpforDealsFromHomePage(String email) throws Throwable {
	boolean flag = false;
	
	flag = CommonVariables.CommonDriver.get().findElement(HomePage_OR.SIGNUP_FORTHE_LATESTDEALS_INPUTBOX).isDisplayed();
	if(flag){extentLogs.pass("SignUpforDeals","SignUpforDealsTextboxIsDisplayed");
	flag=actionLib.type(CommonVariables.CommonDriver.get().findElement(HomePage_OR.SIGNUP_FORTHE_LATESTDEALS_INPUTBOX), email);
	if(flag){extentLogs.pass("EnterEmail","EmailEntered");
	flag = actionLib.Click(CommonVariables.CommonDriver.get().findElement(HomePage_OR.SIGNUP_FORTHE_LATESTDEALS_SIGNUPBUTTON));  
	if(flag){extentLogs.pass("ClickOnSignUpButton","ClickedOnSignUpButton");
	flag = CommonVariables.CommonDriver.get().findElement(HomePage_OR.SIGNUP_SUCCESSMESSAGE).isDisplayed();
	if(flag){extentLogs.pass("SignupDealsSuccessMessage","SignupDealsSuccessMessageIsDisplayed");
	}else{extentLogs.fail("SignupDealsSuccessMessage","SignupDealsSuccessMessageIsNotDisplayed");}
	}else{extentLogs.fail("ClickOnSignUpButton","UnableToClickOnSignUpButton");}
	}else{extentLogs.fail("EnterEmail","UnableToEnterEmail");}
	}else{extentLogs.fail("SignUpforDeals","SignUpforDealsTextboxIsNotDisplayed");}
	return flag;
}



//This method will open the specified static page.Page name should be passed as parameter (Saved in config.properties

public boolean NavigateToPage(String Url) {
		boolean flag = false;
	  try {
		  CommonVariables.CommonDriver.get().get(Url);
			extentLogs.pass("OpenWebPage", "Page is opened");
			flag=true;
	  }catch (Exception e) {
			extentLogs.fail("LaunchApplication", "Errors encountered while launching the application , please refer the detailed errorstack printed below");
			e.printStackTrace(); 
		}
	
				
		return flag;		
		
	}

	
	
}
