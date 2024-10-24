package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements IRetryAnalyzer, ITestListener {

	private int retryCount=0;
	private static final int maxRetryCount=3;

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount<maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting Test: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed : " + result.getName());
	}

}
