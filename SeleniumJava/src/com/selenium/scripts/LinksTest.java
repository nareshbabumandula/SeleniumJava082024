package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest {

   static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println("No of links present are : " + links.size());
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
				
		driver.navigate().to("https://www.mycontactform.com");
		List<WebElement> menutabs = driver.findElements(By.xpath("//div[@id='header']/descendant::a"));
				
		for (WebElement tab : menutabs) {
			System.out.println(tab.getText());
		}
		
		for (int i = 0; i < menutabs.size(); i++) {
			System.out.println(menutabs.get(i).getText());
		}
				
		driver.quit();
		
	}

}
