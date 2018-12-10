package com.bughunt.keywords;

import com.bughunt.domain.ParameterVO;
import com.bughunt.domain.StepResult;

public class HomePageKeyword extends BaseKeywordClass {
	
	private int stepCounter = 0;
	
	public HomePageKeyword() {
		super();
	}
	
	boolean failTest = false;
	
	public void openHomePageNew() { 

	}
	
	public HomePageKeyword(ParameterVO paramVO) {
		super(paramVO);
		
		String str = paramVO.getTestName().replaceAll("Search for keyword", "");
		int testCaseIndex = Integer.valueOf(str);
		failTest = testCaseIndex % 2 == 0;
	}
	
	public void openHomePage() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 2 is displayed" , StepResult.PASS);
	    report.addReportStep("FAIL STEP", "Search Keyword 1 ", StepResult.FAIL);
		report.addReportStep("WARNING STEP", "Search Keyword 1 ", StepResult.WARNING);
	   
	}
	
	public void openHomePage1() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 2 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}
	
	public void openHomePage2() { 
		System.out.println("First Name from common data : " + dataUtil.getCommonData("FirstName"));
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 2 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage3() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 3 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage4() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 4 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage5() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 5 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage6() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 6 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage7() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 7 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage8() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 8 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage9() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 9 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage10() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 10 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage11() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 11 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage12() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 12 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage13() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 13 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage14() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 14 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage15() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 15 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage16() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 16 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage17() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 17 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage18() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 18 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage19() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 19 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}

	public void openHomePage20() { 
	    homePage.openHomePage();
	    report.addReportStep("PASS STEP", "Home Page 20 is displayed", StepResult.PASS);
	    if(failTest) {
		    report.addReportStep("FAIL STEP", "Home Page 2 is displayed", StepResult.FAIL);
	    }
	}


}
