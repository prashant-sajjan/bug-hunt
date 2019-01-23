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
import com.bughunt.utils.WebDriverHelper;

public abstract class BaseKeywordClass {
	Report report;
	DataUtil dataUtil;
	String testName;
	String reportPath;
	protected WebDriver driver = null;
	protected WebDriverHelper wh;
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
		
		driver = DriverFactory.instance().getWebDriver();
		wh = new WebDriverHelper();
	}
	
	@Before
	public void setUp() {
		String executionMode = BugHuntConfig.getBugHuntProperty("ExecutionMode");
		if("Sequential".equals(executionMode) || "Parallel".equals(executionMode)) {
			String browser = null;
			if(!"true".equals(BugHuntConfig.getBugHuntProperty("UseTestManagerBrowser"))) {
				 browser = BugHuntConfig.getBugHuntProperty("Browser");
			} else {
				 browser = dataUtil.getTestManagerColumnVal("Browser");
			}
			DriverFactory.instance().setWebDriver("browser", testName);
		} else {
			DriverFactory.instance().setWebDriverJsonConfig(jsonConfigProps, testName);
		}
	}
	
	@After
	public void tearDown() {
		DriverFactory.instance().quitWebDriver();
	}
}
