package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngAnnotations {
	static WebDriver driver;
	@BeforeClass
	public void accessSite() {
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void linkObject() 
	{
		driver.findElement(By.linkText("Sample Forms")).click();
	}
	@Test(priority = 2)
	public void checkBox()
	{
		WebElement chkbox = driver
				.findElement(By.xpath("//input[@name='email_to[]' and @type='checkbox' and @value='0']"));
		chkbox.click();
		System.out.println("Checkbox selected is: " + chkbox.isSelected());
	}
	@Test(priority=3)
	public void textBox()
	{
		driver.findElement(By.xpath("//input[@name='subject' and @id='subject']")).sendKeys("Software");
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("QA@gmail.com");
		driver.findElement(By.xpath("//input[@name='q1' and @id='q1']")).sendKeys("Java OOPS Cocepts");
		driver.findElement(By.xpath("//textarea[@id='q2'and @name='q2']")).sendKeys("Hello World");	
	}
	@Test(priority=4)
	public void dropdownMethod() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.id("q3"));	
		Select select = new Select(dropdown);
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		select.selectByVisibleText("Third Option");
		Thread.sleep(1000);
		select.selectByIndex(1);
	}
	@Test(priority = 5)
	public void radioButtons()
	{
		WebElement rButton=driver.findElement(By.xpath("//input[@id='q4' and @value='Fifth Option']"));
		rButton.click();
		System.out.println("Radiobutton is displayed"+rButton.isDisplayed());	
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}


