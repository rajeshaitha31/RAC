package com.web.HybrisAutomation.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.web.automation.utilities.CommonVariables;

public class HybrisScreenValidations extends HybrisBasePage {
	
	
	public HybrisScreenValidations(WebDriver driver) {
		super(driver);
		
	}
	
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
			if (Messages.get(i).contains(expectedmenuItems[i])) {
				extentLogs.pass("Verify Message " + expectedmenuItems[i], "Error Message " + expectedmenuItems[i]
						+ " matched with actual Message:" + Messages.get(i));
			} else {
				extentLogs.fail("Verify Message " + expectedmenuItems[i], "Expected Error mesage "
						+ expectedmenuItems[i] + " did not match with actual Message:" + Messages.get(i));
			}
		}
	}
	
}
