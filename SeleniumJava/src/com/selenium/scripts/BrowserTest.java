package com.selenium.scripts;

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
			driver.get("https://www.makemytrip.com");
			break;
		case "edge":
			driver = new EdgeDriver();
			driver.get("https://www.makemytrip.com");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			driver.get("https://www.makemytrip.com");
			break;
		case "safari":
			driver = new SafariDriver();
			driver.get("https://www.makemytrip.com");
			break;
		default:
			System.out.println("Invalid browser..!");
			break;
		}
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.quit(); // Kill the browser opened by Selenium WebDriver
	}

	public static void main(String[] args) throws InterruptedException {
		BrowserTest bt = new BrowserTest();
		bt.launchBrowser("edge");
	}

}
