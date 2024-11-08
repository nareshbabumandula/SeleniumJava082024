package com.selenium.scripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestDependsOnMethods {
	
	@BeforeTest
	void login() {
		System.out.println("Logged into Amazon successfully");
	}
	
	@BeforeClass
	void searchProduct() {
		System.out.println("Product searched successfully");
	}
	
	@Test
	void verifyAddToCart() {
		System.out.println("Added the product to cart");
		// Hard Assertion - If it fails then the execution will be stopped abruptly
		Assert.assertEquals(false, true, "Expected value is not macthed with the actual value..!");
	}
	
	@Test(dependsOnMethods = {"verifyAddToCart"}, alwaysRun = true)
	void checkOut() {
		System.out.println("Checkedout the product");
	}
	
	@Test(dependsOnMethods = {"checkOut"}, enabled=false)
	void proceedtoBuy() {
		System.out.println("Proceeded to buy");
	}
	
	
	@AfterClass
	void verifyPaymentConfirmation() {
		System.out.println("Payment done and verified the payment confirmation");
	}
	
	@AfterTest
	void viewReceipt() {
		System.out.println("Verified the payment receipt");
	}
	
}
