package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sample Forms")).click();
		// id locator
		driver.findElement(By.id("subject")).sendKeys("Test Subject111");
		Thread.sleep(4000);
		driver.findElement(By.id("subject")).clear();
		// name locator
		driver.findElement(By.name("subject")).sendKeys("Test Subject222");
		Thread.sleep(4000);
		driver.quit();
	}

}
