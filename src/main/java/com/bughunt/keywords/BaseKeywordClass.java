package com.bughunt.keywords;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.bughunt.config.BugHuntConfig;
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
	Map<String, String> jsonConfigProps = null;
	
	public BaseKeywordClass() {
		
	}
	
	public BaseKeywordClass(ParameterVO paramVO) {
		report = paramVO.getReport();
		dataUtil = paramVO.getDataUtil();
		testName = paramVO.getTestName();
		reportPath = paramVO.getReportPath();
		jsonConfigProps = paramVO.getJsonConfigProps();
		homePage = new HomePage();
	}
	
	@Before
	public void setUp() {
		if(!"ParallelMultiConfig".equals(BugHuntConfig.instance().getBugHuntProperty("ExecutionMode"))) {
			DriverFactory.instance().setWebDriver("Chrome");
		} else {
			DriverFactory.instance().setWebDriverJsonConfig(jsonConfigProps);
		}
		
		driver = DriverFactory.instance().getWebDriver();
	}
	
	@After
	public void tearDown() {
		DriverFactory.instance().quitWebDriver();
	}
}
