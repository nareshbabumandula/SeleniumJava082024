package com.selenium.scripts;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumObjectsTest {

	static WebDriver driver;

	@BeforeClass
	public void accessSite() {
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@Test(priority = 0)
	public void seleniumMethodsForLink() throws InterruptedException {
		// Working with a link using click() method
		//WebElement sampleForms = driver.findElement(By.linkText("Sample Forms"));
		WebElement sampleForms = driver.findElement(By.partialLinkText("Sample"));
		System.out.println("Link display status is : " + sampleForms.isDisplayed());
		System.out.println("Link enabled status is : " + sampleForms.isEnabled());
		sampleForms.click();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void seleniumMethodsForOtherObjects() throws InterruptedException {
		// Working with a check box using click() method
		WebElement chkCustomerService = driver.findElement(By.xpath("//input[@name='email_to[]' and @value='2']"));
		System.out.println("Check box display status is : " + chkCustomerService.isDisplayed());
		System.out.println("Check box enabled status is : " + chkCustomerService.isEnabled());
		System.out.println("Check box selected status before selecting is : " + chkCustomerService.isSelected());
		chkCustomerService.click();
		System.out.println("Check box selected status after selecting is : " + chkCustomerService.isSelected());
		System.out.println(chkCustomerService.getAttribute("name"));
		Thread.sleep(2000);

		// Working with a text box using sendKeys method
		WebElement subject = driver.findElement(By.id("subject"));
		System.out.println("Text box display status is : " + subject.isDisplayed());
		System.out.println("Text box enabled status is : " + subject.isEnabled());
		subject.sendKeys("Test Subject");
		System.out.println("Actual value entered in the textbox is : " + subject.getAttribute("value"));

		if ( subject.getAttribute("value").equals("Test Subject123")) {
			System.out.println("Successfully entered the value in the Subject text field");
		} else {
			System.out.println("Expected value in Subject is not matching with the actual value :  " + subject.getAttribute("value"));
		}

		Assert.assertEquals(subject.getAttribute("value"), "Test Subject", "Expected value in Subject is not matching with the actual value");

		// Working with a drop down list box using selectByIndex(), selectByVisibleText() methods
		WebElement dropdown = driver.findElement(By.id("q3"));
		System.out.println("Drop down display status is : " + dropdown.isDisplayed());
		System.out.println("Drop down enabled status is : " + dropdown.isEnabled());

		Select select = new Select(dropdown);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Fourth Option");
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		List<WebElement> options = select.getOptions();
		System.out.println("Number of options displayed in dropdown are : " + options.size());
		select.selectByIndex(options.size()-2);	
		Thread.sleep(2000);

		// Working with a radio button using click() method
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='q4' and @value='First Option']"));
		System.out.println(radiobutton.isDisplayed());
		System.out.println(radiobutton.isEnabled());
		System.out.println(radiobutton.getAttribute("value"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
	}

}
