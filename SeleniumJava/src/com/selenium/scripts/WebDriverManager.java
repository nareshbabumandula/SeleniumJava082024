package com.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static void setDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver.set(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver.set(new FirefoxDriver());
		}
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void quitDriver() {
		driver.get().quit();
		driver.remove();
	}

}
