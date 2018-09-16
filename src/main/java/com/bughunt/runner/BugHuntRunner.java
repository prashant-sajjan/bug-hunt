package com.bughunt.runner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.bughunt.core.ExecutionManager;

public class BugHuntRunner {

	public static void main(String [] args) {
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String formatDateTime = now.format(formatter);
        System.out.println("After : " + formatDateTime);
		ExecutionManager.instance().triggerExecution();
	}
}
