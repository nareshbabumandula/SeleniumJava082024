package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators
{
	WebDriver driver;	
	void launchBrowser(String browser) 
	{
		switch (browser) 
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid Browser..!");
			break;
		}

		driver.navigate().to("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sample Forms")).click();
		driver.findElement(By.id("user")).sendKeys("Preethi");
		driver.findElement(By.id("pass")).sendKeys("Password");
		driver.findElement(By.name("email_to[]")).click();
		driver.findElement(By.id("subject")).sendKeys("Software Testing");
		driver.findElement(By.id("email")).sendKeys("PreethiG@gmail.com");
		driver.findElement(By.id("q1")).sendKeys("OOPS Concept");
		driver.findElement(By.id("q2")).sendKeys("Inheritance, Abstraction, Interface");
		driver.navigate().refresh();

		/*Select dropdown=new Select(driver.findElement(By.id("q3")));
		dropdown.selectByVisibleText("First Option");
		driver.quit();
		*/
		WebElement dropdElement=driver.findElement(By.id("q3"));
		Select dropdown=new Select(dropdElement);
		dropdown.selectByVisibleText("First Option");
		
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		
		driver.quit();
		
		
		 /*WebElement dropdownElement = driver.findElement(By.id("dropdown_id"));

	        // Create a Select object
	        Select dropdown = new Select(dropdownElement);

	        // Select by visible text
	        dropdown.selectByVisibleText("Option 1");
		*/
		
	
		
	}

	public static void main(String[] args) 
	{
		Locators lt=new Locators();
		lt.launchBrowser("edge");

	}

}
