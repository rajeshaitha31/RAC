package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

public class TopCategories_OR {

	// Top Categories Home Page
	public static By Furniture_Label = By.xpath("//span[contains(text(),'Furniture')]");
	public static By Appliances_Label = By.xpath("//span[contains(text(),'Appliances')]");
	public static By Computers_Label = By.xpath("//span[contains(text(),'Computers')]");
    public static By Electronics_Label = By.xpath("(//span[contains(text(),'Electronics')])[1]");
    public static By SmartPhones_Label = By.xpath("//span[contains(text(),'Smartphones')]");
    public static By Deals_Label = By.xpath("//span[contains(text(),'Deals')]");
    
    // Category page BreadCrumbs
    
    public static By Furniture_BreadCrumb = By.xpath("//span[contains(text(),'Furniture')]");
    public static By Appliances_BreadCrumb = By.xpath("//span[contains(text(),'Appliances')]");
	public static By Computers_BreadCrumb = By.xpath("//span[contains(text(),'Computers')]");
    public static By Electronics_BreadCrumb = By.xpath("(//span[contains(text(),'Electronics')])[1]");
    public static By SmartPhones_BreadCrumb = By.xpath("//span[contains(text(),'Smartphones')]");
    public static By Deals_BreadCrumb = By.xpath("//span[contains(text(),'Deals')]");
    
    // Headings
    
    public static By Furniture_Category = By.xpath("h3[contains(text(),'Furniture')]");
    public static By Appliances_Category = By.xpath("//h3[contains(text(),'Appliances')]");
   	public static By Computers_Category = By.xpath("//h3[contains(text(),'Computers')]");
    public static By Electronics_Category = By.xpath("(//h3[contains(text(),'Electronics')])[1]");
    public static By SmartPhones_Shop = By.xpath("(//span[contains(text(),'Shop Smartphones')])[3]");
    public static By Deals_All = By.xpath("(//div[contains(text(),'All Deals')])[1]");
    
    
  //
    
    
    
}
