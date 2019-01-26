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
		System.exit(0); // For Maven command line execution fix
	}

}
