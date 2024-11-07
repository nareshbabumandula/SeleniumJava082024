package com.selenium.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.BaseTest;

public class SearchTest extends BaseTest{

	@Test
	public void testProductSearchResults() {
		boolean pageheading = driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]")).isDisplayed();
		Assert.assertEquals(pageheading, true, "Page heading is not displayed");
	
		//int addToCart = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]")).size();
		//Assert.assertEquals(addToCart>1, true, "Add To Cart options are not displayed in the search results page");
	}
	
}
