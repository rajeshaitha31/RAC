package com.web.automation.hybrisobjectrepository;

import org.openqa.selenium.By;

 // This file will contain the objects of Search Page

public class Search_OR {
		
  public static By TOTAL_SEARCHRESULTS = By.xpath("(//h3[@class='searchcountTitle'])[1]");
		
  //SORT BY
  public static By SORTBY_FEATURED = By.xpath("(//span[contains(text(),'Featured')])[2]");
  public static By SORTBY_PRICE_LOWTOHIGH = By.xpath("(//span[contains(text(),'Price(Low to High')])[1]");
  public static By SORTBY_PRICE_HIGHTOLOW = By.xpath("((//span[contains(text(),'Price(High to Low')])[1]");
				
  //PAYMENT OPTIONS
				
  public static By PAYMENTOPTIONS_WEEKLY = By.xpath("(//div[contains(text(),'Weekly')])[2]");
  public static By PAYMENTOPTIONS_SEMIMONTHLY = By.xpath("(//div[contains(text(),'Semi')])[1]");
  public static By PAYMENTOPTIONS_MONTHLY = By.xpath("(//div[contains(text(),'Monthly')])[2]"); 
		
	}

	