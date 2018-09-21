package com.bughunt.runner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.bughunt.core.ExecutionManager;

public class BugHuntRunner {

	public static void main(String [] args) {
		ExecutionManager.instance().triggerExecution();
	}
}
