package com.example.testng.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTaskFiveOne {
	
	WebDriver driver=new ChromeDriver();	
  @Test
  public void ValidateTitleAndUrl() {
	  
	  
	  
	  String actualtitle=driver.getTitle();
	  String expectedtitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  assert actualtitle.equals(expectedtitle):"Page title is not matched";
	  String actualURL=driver.getCurrentUrl();
	  String expectedURL="https://www.godaddy.com/en-in";
	  assert actualURL.equals(expectedURL):"Page URL is matched";
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
