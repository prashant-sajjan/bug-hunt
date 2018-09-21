package com.bughunt.keywords;

import org.openqa.selenium.WebDriver;

import com.bughunt.domain.After;
import com.bughunt.domain.Before;
import com.bughunt.domain.ParameterVO;
import com.bughunt.po.HomePage;
import com.bughunt.reports.Report;
import com.bughunt.util.DataUtil;
import com.bughunt.utils.DriverFactory;

public abstract class BaseKeywordClass {
	Report report;
	DataUtil dataUtil;
	String testName;
	String reportPath;
	protected WebDriver driver = null;
	HomePage homePage = null;
	
	public BaseKeywordClass() {
		
	}
	
	public BaseKeywordClass(ParameterVO paramVO) {
		report = paramVO.getReport();
		dataUtil = paramVO.getDataUtil();
		testName = paramVO.getTestName();
		reportPath = paramVO.getReportPath();
		homePage = new HomePage();
	}
	
	@Before
	public void setUp() {
		DriverFactory.instance().setWebDriver("Chrome");
		driver = DriverFactory.instance().getWebDriver();
	}
	
	@After
	public void tearDown() {
		DriverFactory.instance().quitWebDriver();
	}
}
