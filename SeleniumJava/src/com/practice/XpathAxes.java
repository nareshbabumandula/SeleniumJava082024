package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAxes
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		//By using ancestor: Going to h2 tag and grabbing the immediate ancestor of h2 which is div and performing output of it, through gettext
		String txt=driver.findElement(By.xpath("//h2[text()='Using contact forms to connect you with your site users since 2004.']/ancestor::div")).getText();
		System.out.println(txt);
		//By using preceding: Going to Password webelement and grabing username webelement and perform entering the username	
		driver.findElement(By.xpath("//input[@id='pass']/preceding::input[@id='user']")).sendKeys("Preethi");
		Thread.sleep(3000);
		//By using self
		driver.findElement(By.xpath("//input[@id='pass']/self::input")).sendKeys("Password");
		Thread.sleep(3000);
		//By using child: Under the label open tag and close tag childs will be identified(without nested steps).

		driver.findElement(By.xpath("//label[@for='email']/child::*"));

		//a[text()='Sample Forms']
		//driver.quit();
	}

}
