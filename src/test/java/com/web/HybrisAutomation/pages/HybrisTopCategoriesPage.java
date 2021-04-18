package com.web.HybrisAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.web.automation.hybrisobjectrepository.TopCategories_OR;
import com.web.automation.utilities.CommonVariables;

import org.openqa.selenium.By;


public class HybrisTopCategoriesPage extends HybrisBasePage {

	public HybrisTopCategoriesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean NavigateAndVerifyTopCategory(String TopCategory) {
		
		boolean flag = false;
		WebElement TP_Label = CommonVariables.CommonDriver.get().findElement(By.xpath("(//span[contains(text(),'"+TopCategory+"')])[1]"));
		
		flag=actionLib.IsElementVisible(TP_Label);
		if(flag){extentLogs.pass("VerifyHomePage", TopCategory+"::DisplayedInHomePage");
	    flag = actionLib.javascriptClick(TP_Label);
	    if(flag){extentLogs.pass("ClickTopCategoryPage", TopCategory+"::Clicked");
	WebElement TP_Category = CommonVariables.CommonDriver.get().findElement(By.xpath("//h3[contains(text(),'"+TopCategory+"')]"));
	    flag=actionLib.IsElementVisible(TP_Category);
	    if(flag){extentLogs.pass("VerifyCategories", TopCategory+"::CategoriesDisplayed");
	    }else{extentLogs.fail("VerifyCategories", TopCategory+"::CategoriesNotDisplayed");}
	    }else{extentLogs.fail("ClickTopCategoryPage", TopCategory+"::NotClicked");}
	    }else{extentLogs.fail("VerifyHomePage", TopCategory+"NotDisplayedInHomePage");}
						
		return flag;	
		
	   
		}
	
	public boolean NavigateToTopCategory(String TopCategory) {
		boolean flag = false;
		WebElement TP_Label = CommonVariables.CommonDriver.get().findElement(By.xpath("(//span[contains(text(),'"+TopCategory+"')])[1]"));
		flag=actionLib.IsElementVisible(TP_Label);
		if(flag){extentLogs.pass("VerifyHomePage", TopCategory+"::DisplayedInHomePage");
		actionLib.javascriptClick(TP_Label);
		if(flag){extentLogs.pass("ClickTopCategoryPage", TopCategory+"::Clicked");
		}else{extentLogs.fail("ClickTopCategoryPage", TopCategory+"::NotClicked");}
		}else{extentLogs.fail("VerifyHomePage", TopCategory+"NotDisplayedInHomePage");}
		
		return flag;
			
	}
		
	public boolean VerifySmartPhonesPage() {
		boolean flag = false;
		flag=actionLib.IsElementVisible(TopCategories_OR.SmartPhones_Shop);
		if(flag){extentLogs.pass("VerifySmartPhonesPage", "PASS");
		}else{extentLogs.fail("VerifySmartPhonesPage", "FAIL");}
		
		return flag;
	}
	
	public boolean VerifyDealsPage() {
		boolean flag = false;
		flag=actionLib.IsElementVisible(TopCategories_OR.Deals_All);
		if(flag){extentLogs.pass("VerifyAllDealsPage", "PASS");
		}else{extentLogs.fail("VerifyAllDealsPage", "FAIL");}
		
		return flag;
	}
	
	
}
