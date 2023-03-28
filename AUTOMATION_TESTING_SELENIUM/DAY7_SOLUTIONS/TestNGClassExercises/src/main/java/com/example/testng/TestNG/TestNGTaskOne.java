package com.example.testng.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNGTaskOne {

	WebDriver driver = new ChromeDriver();

	@Test
	public void asserttitle() {

		String actualtitle = driver.getTitle();
		System.out.print(actualtitle);
		String expectedtitle = "Guest Registration Form – User Registration";
		Assert.assertEquals(actualtitle, expectedtitle);
	}

	@BeforeClass
	public void beforeClass() {

		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");

	}

	@AfterClass
	public void afterClass() {

	  driver.quit();

	}

}
