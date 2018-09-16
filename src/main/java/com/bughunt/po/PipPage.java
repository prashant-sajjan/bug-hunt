package com.bughunt.po;

import org.openqa.selenium.By;

public class PipPage extends BasePO {

	public static final By  verifyPIPPage = By.className("pip-container-fluid");
	
	public PipPage verifyPIPPage() {
		// Assert.assertTrue(wh.isElementPresent(verifyPIPPage));
		return this;
	}
}
