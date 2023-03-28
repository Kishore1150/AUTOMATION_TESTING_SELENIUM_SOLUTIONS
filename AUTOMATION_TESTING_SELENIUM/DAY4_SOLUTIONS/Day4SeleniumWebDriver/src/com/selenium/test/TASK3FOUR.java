package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TASK3FOUR {

	public static void main(String[] args) throws InterruptedException {
     
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Kishore");
		driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("kishore123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Lokith");
		driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Lokith4234@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
       
		driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Many more happy returns of the day");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("1000");
		js.executeScript("window.scrollBy(0,1250)", "");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).submit();
		
		
		
		
		
		
	}

}
