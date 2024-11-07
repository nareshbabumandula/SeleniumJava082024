package com.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.selenium.scripts.WebDriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		WebDriverManager.setDriver(browser);
		driver = WebDriverManager.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		WebDriverManager.quitDriver();
	}

}
