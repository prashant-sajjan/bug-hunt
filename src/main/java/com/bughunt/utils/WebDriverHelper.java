package com.bughunt.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverHelper {

	private WebDriver driver = null;
	int waitTime = 30;
	
	public WebDriverHelper() {
		driver = DriverFactory.instance().getWebDriver();
	}
	
	public boolean isElementPresent(By elementBy) {
		boolean elementPresent = false;
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		try {
			elementPresent = driver.findElement(elementBy).isDisplayed();
		} catch (Exception ex) {
			System.out.println("Exception occured while finding element within element");
		}
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		return elementPresent;
	}
	
	public void click(By elementBy) {
		if(isElementPresent(elementBy)) {
			driver.findElement(elementBy).click();
		}
	}
	
	public void sendKeys(By elementBy, String keys) {
		if(isElementPresent(elementBy)) {
			driver.findElement(elementBy).sendKeys(keys);
		}
	}
}
