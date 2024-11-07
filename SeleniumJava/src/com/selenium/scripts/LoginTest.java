package com.selenium.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.main.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void testLogin() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

}
