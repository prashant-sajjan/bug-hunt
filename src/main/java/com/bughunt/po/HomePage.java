package com.bughunt.po;

import org.openqa.selenium.By;

import com.bughunt.config.BugHuntConfig;
import com.bughunt.constants.GlobalConstants;


public class HomePage extends BasePO {

	public static final By searchTxtBox = By.id("headerSearch");
	public static final By searchBtn = By.id("headerSearchButton");
	
	public HomePage openHomePage() {
		String envURL = BugHuntConfig.instance().getEnvironmentURL();
		// driver.get(envURL);
		return this;
	}
	
	public PlpPage searchKeyword() {
		wh.sendKeys(searchTxtBox, "hammer");
		wh.click(searchBtn);
		return new PlpPage();
	}
	
	public PipPage searchSKU() {
		wh.sendKeys(searchTxtBox, "205386272");
		wh.click(searchBtn);
		return new PipPage();
	}
}
