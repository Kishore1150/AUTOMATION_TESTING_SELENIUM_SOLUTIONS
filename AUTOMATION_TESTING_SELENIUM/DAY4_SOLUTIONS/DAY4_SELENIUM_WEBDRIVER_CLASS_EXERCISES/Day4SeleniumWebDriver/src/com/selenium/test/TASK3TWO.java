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
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2000)", "");
//		WebElement returns = driver.findElement(By.linkText("Returns"));
		WebElement returns =driver.findElement(By.linkText("Returns"));
		js.executeScript("arguments[0].scrollIntoView();", returns);
		Thread.sleep(2000);
		returns.click();
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement giftcertificates=driver.findElement(By.linkText("Gift Certificates"));
		js.executeScript("arguments[0].scrollIntoView();", giftcertificates);
		Thread.sleep(2000);
		giftcertificates.click();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,-2500)","");
		Thread.sleep(5000);
		driver.close();

	}

}
