package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.listeners.CustomListener;

@Listeners(CustomListener.class)
public class ActionsTest {

	static WebDriver driver;

	@Parameters({"url"})
	@BeforeClass
	public void accessSite(String url) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		driver = new ChromeDriver(ops);
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@Test(retryAnalyzer = CustomListener.class)
	public void actionMethods() throws InterruptedException {
		Assert.assertEquals(true, true);
		// Working with mouse over actions
		WebElement addons = driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"));
		Actions action = new Actions(driver);
		action.moveToElement(addons).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(text(),'Taxi')])[1]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-testid='test-id-Taxi']/descendant::div[contains(text(),'Taxi')]"))).click();
		
		Thread.sleep(5000);
	}

}
