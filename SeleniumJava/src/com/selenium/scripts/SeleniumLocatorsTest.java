package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumLocatorsTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();

		// id locator
		driver.findElement(By.id("user")).sendKeys("Seshu");
		Thread.sleep(2000);
		driver.findElement(By.id("user")).clear();

		// name locator
		driver.findElement(By.name("user")).sendKeys("Sajjad");
		Thread.sleep(2000);
		driver.findElement(By.name("user")).clear();

		// class name locator
		driver.findElement(By.className("txt_log")).sendKeys("Gouthami");
		Thread.sleep(2000);
		driver.findElement(By.className("txt_log")).clear();

		// css locator --> syntax html tag[attribute='value']
		driver.findElement(By.cssSelector("input[id='user']")).sendKeys("Preethi");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user']")).clear();

		// xpath locator --> syntax //html tag[@attribute='value']
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Noor");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user']")).clear();
		
		// tagName locator
		driver.findElement(By.tagName("input")).sendKeys("Naresh");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();

		// linktext locator
		driver.findElement(By.linkText(">> More Testimonials")).click();
		Thread.sleep(2000);

		driver.navigate().to("https://www.mycontactform.com");
		Thread.sleep(5000);

		// partial linktext locator
		driver.findElement(By.partialLinkText("e Testimonials")).click();
		Thread.sleep(2000);

		driver.quit();
	}
}
