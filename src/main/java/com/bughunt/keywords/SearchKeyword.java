package com.bughunt.keywords;

import com.bughunt.domain.After;
import com.bughunt.domain.Before;
import com.bughunt.domain.ParameterVO;
import com.bughunt.domain.StepResult;
import com.bughunt.utils.DriverFactory;

public class SearchKeyword extends BaseKeywordClass {

	public SearchKeyword() {
		
	}
	
	public SearchKeyword(ParameterVO paramVO) {
		super(paramVO);
	}
	
	public void searchKeyword1() {
		System.out.println("Test Name : " +testName);
		System.out.println("searchKeyword1");
		report.addReportStep("Open Home Page", "Home Page is displayed", StepResult.PASS);
	}
	
	public void searchKeyword2() {
		System.out.println("searchKeyword2");
	}
}
