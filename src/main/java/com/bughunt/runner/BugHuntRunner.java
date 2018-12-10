package com.bughunt.runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.bughunt.core.ExecutionManager;
import com.bughunt.domain.StepResult;

public class BugHuntRunner {

	public static void main(String [] args) throws InterruptedException, ParseException {
		ExecutionManager.instance().triggerExecution();
		System.out.println("Automation execution completed");
		// createSearchKeywords();
		// createHomePageKeywords();
	}

	private static void createHomePageKeywords() {
		for(int i=2; i<=20; i++) {
			String s =	String.format("public void openHomePage%d() { \n" +
					"    homePage.openHomePage();\n" + 
					"    report.addReportStep(\"PASS STEP\", \"Home Page %d is displayed\", StepResult.PASS);\n" +
					"    if(failTest) {\n" + 
					"	    report.addReportStep(\"FAIL STEP\", \"Home Page 2 is displayed\", StepResult.FAIL);\n" + 
					"    }\n" +
					"}", i, i);
		
			System.out.println(s);
			System.out.println();
		}
	}
	
	private static void createSearchKeywords() {
		for(int i=2; i<=20; i++) {
			String s =	String.format("public void searchKeyword%d() { \n"+
					"    report.addReportStep(\"PASS STEP\", \"Search Keyword %d\", StepResult.PASS);\n"
					+ "}", i, i);
		
			System.out.println(s);
			System.out.println();
		}
	}
}
