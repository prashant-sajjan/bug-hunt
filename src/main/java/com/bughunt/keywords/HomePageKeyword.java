package com.bughunt.keywords;

import com.bughunt.config.BugHuntConfig;
import com.bughunt.domain.After;
import com.bughunt.domain.Before;
import com.bughunt.domain.ParameterVO;
import com.bughunt.domain.StepResult;
import com.bughunt.utils.DriverFactory;

public class HomePageKeyword extends BaseKeywordClass {
	
	private int stepCounter = 0;
	
	public HomePageKeyword() {
		super();
	}
	
	public HomePageKeyword(ParameterVO paramVO) {
		super(paramVO);
	}
	
	public void openHomePage() {
		homePage.openHomePage();
		System.out.println(dataUtil.getData("Keyword"));
		System.out.println(dataUtil.getData("Keyword"));
		
		System.out.println("Test Manager Data " +dataUtil.getTestManagerColumnVal("Browser"));
		
		report.addReportStep("Open Home Page", "Home Page is displayed", StepResult.PASS);
		report.addReportStep("Open Home Page", "Home Page is displayed", StepResult.PASS);
		report.addReportStep("FAIL Step", "Home Page is displayed", StepResult.FAIL);
		report.addReportStep("WARNING STEP", "Home Page is displayed", StepResult.WARNING);
	}
	
	public void openHomePage1() throws InterruptedException {
		if("ParallelMultiConfig".equals(BugHuntConfig.instance().getBugHuntProperty("ExecutionMode"))) {
			report.addReportStep("PASS STEP", "Home Page 1 is displayed for " + jsonConfigProps.get("ReportValue"), StepResult.PASS);
		}
		homePage.openHomePage();
		report.addReportStep("PASS STEP", "Home Page 1 is displayed" + jsonConfigProps, StepResult.PASS);
	}
	
	public void openHomePage2() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 2 is displayed", StepResult.PASS);
	}

	public void openHomePage3() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 3 is displayed", StepResult.PASS);
	}

	public void openHomePage4() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 4 is displayed", StepResult.PASS);
	}

	public void openHomePage5() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 5 is displayed", StepResult.PASS);
	}

	public void openHomePage6() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 6 is displayed", StepResult.PASS);
	}

	public void openHomePage7() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 7 is displayed", StepResult.PASS);
	}

	public void openHomePage8() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 8 is displayed", StepResult.PASS);
	}

	public void openHomePage9() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 9 is displayed", StepResult.PASS);
	}

	public void openHomePage10() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 10 is displayed", StepResult.PASS);
	}

	public void openHomePage11() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 11 is displayed", StepResult.PASS);
	}

	public void openHomePage12() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 12 is displayed", StepResult.PASS);
	}

	public void openHomePage13() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 13 is displayed", StepResult.PASS);
	}

	public void openHomePage14() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 14 is displayed", StepResult.PASS);
	}

	public void openHomePage15() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 15 is displayed", StepResult.PASS);
	}

	public void openHomePage16() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 16 is displayed", StepResult.PASS);
	}

	public void openHomePage17() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 17 is displayed", StepResult.PASS);
	}

	public void openHomePage18() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 18 is displayed", StepResult.PASS);
	}

	public void openHomePage19() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 19 is displayed", StepResult.PASS);
	}

	public void openHomePage20() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 20 is displayed", StepResult.PASS);
	}
}
