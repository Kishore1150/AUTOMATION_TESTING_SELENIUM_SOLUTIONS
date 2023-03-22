package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TASK3TWO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.opencart.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("search")).sendKeys("iPhone");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement returns = driver.findElement(By.linkText("Returns"));
		js.executeScript("arguments[0].scrollIntoView();", returns);
		Thread.sleep(2000);
		returns.click();
		WebElement giftcertificates=driver.findElement(By.linkText("Gift Certificates"));
		js.executeScript("arguments[0].scrollIntoView()",giftcertificates);
		Thread.sleep(2000);
		giftcertificates.click();

	}

}
