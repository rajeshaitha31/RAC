package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;



// This file will contain the objects of PDP 

public class Agreement_OR {

	
	
	
	//public static By cb_AgreeTerms=By.id("disclosureAccepted");
public static By cb_AgreeTerms=By.xpath("//label[@for='disclosureAccepted']");
	public static By btn_DS_Continue=By.xpath("//button[text()='Continue']");
    public static By span_AdoptAndInitial=By.xpath("//button[text()='Adopt and Initial']");
    public static By btn_AdoptAndSign=By.xpath("//button[text()='Adopt and Sign']");
   
    public static By btn_Finish=By.xpath("//button[text()='Finish']");
    //done
    //public static By btn_Done=By.xpath("//button[text()='Done']");
   
    //More Options from Docu Sign
    public static By optionType = By.xpath("//button[@id='otherActionsButton']");
    public static By btn_declineToSign = By.xpath("(//button[text()='Decline to Sign'])[2]");
    //public static By btn_continue = By.xpath("//button[@class='btn btn-lg btn-main' and text()='Continue']");
    public static By btn_continue = By.xpath("//span[text()='Continue']");
    public static By txt_reason = By.xpath("//textarea[@id='reason-text']");
    public static By btn_declineToSign1=By.xpath("//button[@class='btn btn-lg btn-main submit']");
    //Finish Later from DocuSign
    public static By btn_finishLater = By.xpath("(//button[text()='Finish Later'])[2]");
    public static By div_finishlater_conformationMsg=By.xpath("//div[@class='modal-body text-center rac-modal-body ng-scope' and contains(.,'Please click on the agreement link when you are ready to sign.')]");
    public static By btn_OK = By.xpath("//a[text()='OK']");


}
