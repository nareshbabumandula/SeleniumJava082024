package com.selenium.scripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AmazonGeneric {

	/** @BeforeSuite: The annotated method will be run before all tests in this suite have run.**/
	@BeforeSuite
	void accessSite() {
		System.out.println("Accessed Amazon website");
	}

	/**@AfterSuite: The annotated method will be run after all tests in this suite have run. **/
	@AfterSuite
	void logout() {
		System.out.println("Logged out from the application");
	}

}
