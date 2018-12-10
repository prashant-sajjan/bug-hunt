package com.bughunt.keywords;

import com.bughunt.domain.ParameterVO;
import com.bughunt.domain.StepResult;

public class SearchKeyword extends BaseKeywordClass {

	public SearchKeyword() {
		
	}
	
	public SearchKeyword(ParameterVO paramVO) {
		super(paramVO);
	}
	
	public void searchKeyword() {
		homePage.searchKeyword();
	}
	
	public void searchKeyword1() {
		if(null!=jsonConfigProps && null!=jsonConfigProps.get("Device")) {
			report.addReportStep("PASS STEP", "Search Keyword 1 " +jsonConfigProps.get("Device"), StepResult.PASS);
		} else {
			report.addReportStep("PASS STEP", "Search Keyword 1 ", StepResult.PASS);
		}
		
	}
	
	public void searchKeyword2() { 
		if(null!=jsonConfigProps && null!=jsonConfigProps.get("Device")) {
			report.addReportStep("PASS STEP", "Search Keyword 2 " +jsonConfigProps.get("Device"), StepResult.PASS);
		} else {
			report.addReportStep("PASS STEP", "Search Keyword 2 ", StepResult.PASS);
		}
	}

	public void searchKeyword3() { 
		if(null!=jsonConfigProps && null!=jsonConfigProps.get("Device")) {
			report.addReportStep("PASS STEP", "Search Keyword 3 " +jsonConfigProps.get("Device"), StepResult.PASS);
		} else {
			report.addReportStep("PASS STEP", "Search Keyword 3 ", StepResult.PASS);
		}
	}

	public void searchKeyword4() { 
		if(null!=jsonConfigProps && null!=jsonConfigProps.get("Device")) {
			report.addReportStep("PASS STEP", "Search Keyword 4 " +jsonConfigProps.get("Device"), StepResult.PASS);
		} else {
			report.addReportStep("PASS STEP", "Search Keyword 4", StepResult.PASS);
		}
	}

	public void searchKeyword5() { 
	    report.addReportStep("PASS STEP", "Search Keyword 5", StepResult.PASS);
	}

	public void searchKeyword6() { 
	    report.addReportStep("PASS STEP", "Search Keyword 6", StepResult.PASS);
	}

	public void searchKeyword7() { 
	    report.addReportStep("PASS STEP", "Search Keyword 7", StepResult.PASS);
	}

	public void searchKeyword8() { 
	    report.addReportStep("PASS STEP", "Search Keyword 8", StepResult.PASS);
	}

	public void searchKeyword9() { 
	    report.addReportStep("PASS STEP", "Search Keyword 9", StepResult.PASS);
	}

	public void searchKeyword10() { 
	    report.addReportStep("PASS STEP", "Search Keyword 10", StepResult.PASS);
	}

	public void searchKeyword11() { 
	    report.addReportStep("PASS STEP", "Search Keyword 11", StepResult.PASS);
	}

	public void searchKeyword12() { 
	    report.addReportStep("PASS STEP", "Search Keyword 12", StepResult.PASS);
	}

	public void searchKeyword13() { 
	    report.addReportStep("PASS STEP", "Search Keyword 13", StepResult.PASS);
	}

	public void searchKeyword14() { 
	    report.addReportStep("PASS STEP", "Search Keyword 14", StepResult.PASS);
	}

	public void searchKeyword15() { 
	    report.addReportStep("PASS STEP", "Search Keyword 15", StepResult.PASS);
	}

	public void searchKeyword16() { 
	    report.addReportStep("PASS STEP", "Search Keyword 16", StepResult.PASS);
	}

	public void searchKeyword17() { 
	    report.addReportStep("PASS STEP", "Search Keyword 17", StepResult.PASS);
	}

	public void searchKeyword18() { 
	    report.addReportStep("PASS STEP", "Search Keyword 18", StepResult.PASS);
	}

	public void searchKeyword19() { 
	    report.addReportStep("PASS STEP", "Search Keyword 19", StepResult.PASS);
	}

	public void searchKeyword20() { 
	    report.addReportStep("PASS STEP", "Search Keyword 20", StepResult.PASS);
	}
}
