package com.bughunt.po;

import org.openqa.selenium.WebDriver;

import com.bughunt.utils.DriverFactory;
import com.bughunt.utils.WebDriverHelper;


public abstract class BasePO {

	protected WebDriver driver;
	protected WebDriverHelper wh;
	public BasePO() {
		driver = DriverFactory.instance().getWebDriver(); 
		wh = new WebDriverHelper();
	}
}
