package com.bughunt.po;

import org.openqa.selenium.By;

public class PlpPage extends BasePO {

	public static final By  verifyPLPPage = By.id("hd_plp");
	
	public PlpPage verifyPLPPage() {
		//Assert.assertTrue(wh.isElementPresent(verifyPLPPage));
		return this;
	}
}
