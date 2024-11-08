package com.selenium.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestGroups {
	
  	@BeforeTest(groups = {"smoke", "regression"})
	void login() {
		System.out.println("Logged into Amazon successfully");
	}
	
	@BeforeClass(groups = {"smoke"})
	void searchProduct() {
		System.out.println("Product searched successfully");
	}
	
	@Test(priority = 1, groups = {"smoke"})
	void verifyAddToCart() {
		System.out.println("Added the product to cart");
	}
	
	@Test(priority = 2, groups = {"smoke"})
	void checkOut() {
		System.out.println("Checkedout the product");
	}
	
	@Test(priority = 3, groups = {"smoke"})
	void proceedtoBuy() {
		System.out.println("Proceeded to buy");
	}
	
	@BeforeMethod
	void verifyProduct() {
		System.out.println("Verified the product");
	}
	
	@AfterMethod
	void verifyProductQuanity() {
		System.out.println("Verified the product quantity");
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
