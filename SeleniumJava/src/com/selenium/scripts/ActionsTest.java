package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsTest {

	WebDriver driver;
	
	// To perform sensitive user actions like mouse hover, click and hold, right click, double click, drag and drop on objects we need to use Actions class
	@BeforeClass
	void accessSite() throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		driver = new ChromeDriver(ops);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test
	void actionMethods() throws InterruptedException {
		// Mouse hover
		WebElement addons = driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"));
		Actions action = new Actions(driver);
		action.moveToElement(addons).perform();
		driver.findElement(By.xpath("//div[contains(text(),'International Connection Baggage')]/ancestor::div[@class='css-1dbjc4n r-18u37iz']/a[2]/div/div")).click();
	}
	
	@AfterClass
	void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}


}
