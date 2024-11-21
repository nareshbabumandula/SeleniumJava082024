package com.selenium.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	
  	/** @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run. **/
	@BeforeTest
	void login() {
		System.out.println("Logged into Amazon successfully");
	}
	
	/** @BeforeClass: The annotated method will be run before the first test method in the current class is invoked. **/
	@BeforeClass
	void searchProduct() {
		System.out.println("Product searched successfully");
	}
	
	/**@Test: Marks a class or a method as part of the test. 
	 * The priority for this test method. Lower priorities will be scheduled first.**/
	@Test(priority = 1)
	void verifyAddToCart() {
		System.out.println("Added the product to cart");
	}
	
	@Test(priority = 2)
	void checkOut() {
		System.out.println("Checkedout the product");
	}
	
	@Test(priority = 3)
	void proceedtoBuy() {
		System.out.println("Proceeded to buy");
	}
	
	/** @BeforeMethod: The annotated method will be run before each test method. **/
	@BeforeMethod
	void verifyProduct() {
		System.out.println("Verified the product");
	}
	
	/** @AfterMethod: The annotated method will be run after each test method. **/
	@AfterMethod
	void verifyProductQuanity() {
		System.out.println("Verified the product quantity");
	}
	
	/** @AfterClass: The annotated method will be run after all the test methods in the current class have been run. **/
	@AfterClass
	void verifyPaymentConfirmation() {
		System.out.println("Payment done and verified the payment confirmation");
	}
	
	/** @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run. **/
	@AfterTest
	void viewReceipt() {
		System.out.println("Verified the payment receipt");
	}
}

