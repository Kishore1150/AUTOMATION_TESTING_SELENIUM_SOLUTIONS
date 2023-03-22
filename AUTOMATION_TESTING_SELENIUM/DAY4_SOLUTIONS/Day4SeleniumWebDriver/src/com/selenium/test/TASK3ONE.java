package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TASK3ONE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.sendKeys("kishore");
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		lastname.sendKeys("kumar");
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("Kishore123@gmail.com");
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("Kishore@123");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		WebElement subscribe = driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]"));
		subscribe.click();
		WebElement agreepolicy =driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input"));
		agreepolicy.click();
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button"));
		submit.click();
	}

}
