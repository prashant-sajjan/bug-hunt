package com.bughunt.runner;

import com.bughunt.core.ExecutionManager;

public class BugHuntRunner {

	public static void main(String [] args) {
		ExecutionManager.instance().triggerExecution();
	}
}
