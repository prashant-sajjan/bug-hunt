package com.bughunt.keywords;

import com.bughunt.config.BugHuntConfig;
import com.bughunt.domain.ParameterVO;
import com.bughunt.domain.StepResult;

public class DemoKeywords extends BaseKeywordClass {
	public DemoKeywords() {
		super();
	}
	
	public DemoKeywords(ParameterVO paramVO) {
		super(paramVO);
	}
	
	public void openHomePage() { 
		String envURL = BugHuntConfig.getEnvironmentURL();
		driver.get(envURL);
		//boolean homePageDisplayed = wh.isElementPresent(elementBy)
		// if(homePageDisplayed) {
		report.addReportStep("Open Home Page", "Home Page Displayed", StepResult.FAIL);
	   //} else {
	   // report.addReportStep("Open Home Page", "Home Page Displayed", StepResult.FAIL);	
	   //}
		
		// Get Test Case Name
		//System.out.println(testName);
		
		// Get TestManager Column value for current test case
		// System.out.println(("Priority"));
		
		// Get data from data sheet
		// System.out.println(dataUtil.getData("ZipCode"));
		
		// Get data from data sheet by sub iteration
		// System.out.println(dataUtil.getData("ZipCode",2));
		
		// Using Page Objects (page objects instantiated in BaseKeywordClass constructor)
		// homePage.openHomePage();
	}
}
