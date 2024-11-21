package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

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
		Reporter.log("Starting Test: " + result.getName());
		System.out.println("Starting Test: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Passed : " + result.getName());
		System.out.println("Test Passed : " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Failed : " + result.getName());
		System.out.println("Test Failed : " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed with success percentage..!");
		if (result.isSuccess()) {
			System.out.println("Test Passed..!");
		} else {
			System.out.println("Test Failed..!");
		}
	}
}
