package com.bughunt.keywords;

import com.bughunt.domain.ParameterVO;
import com.bughunt.domain.StepResult;

public class HomePageKeyword extends BaseKeywordClass {
	
	private int stepCounter = 0;
	
	public HomePageKeyword() {
		super();
	}
	
	public HomePageKeyword(ParameterVO paramVO) {
		super(paramVO);
	}
	
	public void openHomePage1() {
		homePage.openHomePage();
		report.addReportStep("Open Home Page", "Home Page is displayed", StepResult.PASS);
		// report.addReportStep("FAIL Step", "Home Page is displayed", StepResult.FAIL);
		// report.addReportStep("WARNING STEP", "Home Page is displayed", StepResult.WARNING);
	}
	
	public void openHomePage2() {
		System.out.println("Step Counter has retained previous state 5 :"+ stepCounter);
		System.out.println("openHomePage2 called");
	}
	
	public void openHomePage5() {
		System.out.println("Step Counter has retained previous state 5 :"+ stepCounter);
		System.out.println("openHomePage2 called");
	}
}
