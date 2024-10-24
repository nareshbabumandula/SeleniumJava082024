package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SLocatorsAutomate {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver; 
		driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Sample Forms")).click();
		WebElement chkbox= driver.findElement(By.xpath("//input[@name='email_to[]' and @type='checkbox' and @value='0']"));
		chkbox.click();
		System.out.println("Checkbox selected is: "+chkbox.isSelected());

		driver.findElement(By.xpath("//input[@name='subject' and @id='subject']")).sendKeys("Software");
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("QA@gmail.com");
		driver.findElement(By.xpath("//input[@name='q1' and @id='q1']")).sendKeys("Java OOPS Cocepts");
		driver.findElement(By.xpath("//textarea[@id='q2'and @name='q2']")).sendKeys("Hello World");
		//driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();

		WebElement dropdown=driver.findElement(By.id("q3"));
		System.out.println("Dropdown display status is:"+dropdown.isDisplayed());
		System.out.println("Dropdown enabled status is:"+dropdown.isEnabled());
		Select select=new Select(dropdown);
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		select.selectByVisibleText("Third Option");
		Thread.sleep(1000);
		select.selectByIndex(1);
		
		List<WebElement> options=select.getOptions();
		System.out.println("Number of options displayed in dropdown are:"+options.size());
		select.selectByIndex(options.size()-3);

		WebElement chkbox1=driver.findElement(By.xpath("//input[@name='q5' and @id='q5']"));
		chkbox1.click();
		System.out.println("Checkbox1 selected status is:"+chkbox1.isSelected());

		WebElement chkbox2=driver.findElement(By.xpath("//input[@name='checkbox6[]' and @value='Fifth Check Box']"));
		chkbox2.click();
		System.out.println("Checkbox2 selected status is :"+chkbox2.isSelected());

		WebElement dropdown1=driver.findElement(By.id("q8"));
		Select select1=new Select(dropdown1);
		select1.selectByIndex(7);
		
		//System.out.println("Selected option is :"+select1.selectByIndex(5));
		List<WebElement> options1=select1.getOptions();
		System.out.println("Number of options for US States dropdown are :" + options1.size());
		System.out.println("Finding last but one U.S state from the dropdown =");
		select1.selectByIndex(options1.size()-2);
		Thread.sleep(1000);
		
		//List<WebElement> options2= driver.findElement(By.id("q9"));
		for(WebElement option:options1)
		{
			System.out.println(option.getText());
		}
		
		//driver.quit();

	}



}
