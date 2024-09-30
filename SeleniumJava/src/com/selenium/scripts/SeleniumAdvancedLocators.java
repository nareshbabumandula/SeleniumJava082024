package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumAdvancedLocators {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 

		driver = new ChromeDriver(options);
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		
		// xpath locator --> Absolute xpath
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input")).sendKeys("Neelima");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input")).clear();

		// XPath with and condition
		driver.findElement(By.xpath("//input[@id='user' and @class='txt_log' and @type='text']")).sendKeys("Preethi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user' and @class='txt_log' and @type='text']")).clear();

		// XPath with and or conditions
		driver.findElement(By.xpath("//input[@id='user' and @class='txt_log' or @type='text']")).sendKeys("Gouthami");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user' and @class='txt_log' or @type='text']")).clear();

		// XPath with OR operator
		driver.findElement(By.xpath("//input[@id='user']|//input[@class='txt_log']")).sendKeys("Sajjad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user']|//input[@class='txt_log']")).clear();

		// XPath with starts-with function
		driver.findElement(By.xpath("//input[starts-with(@id,'use')]")).sendKeys("Seshu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'use')]")).clear();

		// XPath with contains function
		driver.findElement(By.xpath("//input[contains(@id,'se')]")).sendKeys("Naresh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'se')]")).clear();

		// CSS with and condition
		driver.findElement(By.cssSelector("input[id='user'][class='txt_log']")).sendKeys("John");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user'][class='txt_log']")).clear();

		// CSS with or condition
		driver.findElement(By.cssSelector("input[id='user'],[class='txt_log']")).sendKeys("Serina");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user'],[class='txt_log']")).clear();

		// CSS with 'and' and 'or' conditions
		driver.findElement(By.cssSelector("input[id='user'][class='txt_log'],[type='text']")).sendKeys("Robert");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user'],[class='txt_log']")).clear();

		// CSS with starts-with function
		driver.findElement(By.cssSelector("input[id^='use']")).sendKeys("Alex");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='use']")).clear();

		// CSS with ends-with function
		driver.findElement(By.cssSelector("input[id$='ser']")).sendKeys("Pete");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id$='ser']")).clear();

		// CSS with contains function
		driver.findElement(By.cssSelector("input[id*='se']")).sendKeys("Sean");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='se']")).clear();
		
		// CSS with # symbol as a replacement for id
		driver.findElement(By.cssSelector("input#user")).sendKeys("Arun");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#user")).clear();

		// CSS with .(dot) symbol as a replacement for class
		driver.findElement(By.cssSelector("input.txt_log")).sendKeys("Krish");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.txt_log")).clear();


		Thread.sleep(2000);
		driver.quit();

	}

}
