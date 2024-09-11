package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserTest {
	WebDriver driver;
	
	void launchBrowser(String browser) throws InterruptedException {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Invalid browser..!");
			break;
		}
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("user")).sendKeys("Sajjad");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Secure*1234");
		Thread.sleep(1000);
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sample Forms")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("email_to[]")).click();
		Thread.sleep(3000);
		driver.quit(); // Kill the browser opened by Selenium WebDriver
	}

	public static void main(String[] args) throws InterruptedException {
		BrowserTest bt = new BrowserTest();
		bt.launchBrowser("chrome");
	}

}
