package com.example.testng.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTaskFiveTwo {
	
	
	WebDriver driver=new ChromeDriver();
  @Test
  public void DomainNameSearch() {
	  
	  WebElement domains=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button"));
	  domains.click();
	  WebElement domainnamesearch=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
	  domainnamesearch.click();
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
