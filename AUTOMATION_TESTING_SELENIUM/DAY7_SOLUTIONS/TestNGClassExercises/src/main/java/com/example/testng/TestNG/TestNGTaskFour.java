package com.example.testng.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTaskFour {

	WebDriver driver = new ChromeDriver();

	@Test
	public void PageLoad() {

		String expectedurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String acutalurl = driver.getCurrentUrl();
		Assert.assertEquals(acutalurl, expectedurl);
		String expectedtitle = "OrangeHRM";
		String actualtitle = driver.getTitle();
//	  assert actualtitle.equals(expectedtitle):"page title is not correct";
		Assert.assertEquals(actualtitle, expectedtitle);
	}

	@Test(dependsOnMethods = "PageLoad")
	public void CheckLogoutFunction() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		password.sendKeys("admin123");
		WebElement login = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.submit();

		WebElement usermenu=driver.findElement(By.className("oxd-userdropdown-name"));
		usermenu.click();
		
		WebElement logout=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
		logout.click();
	}

	@BeforeClass
	public void beforeClass() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
	}

}
