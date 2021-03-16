package com.property.Com.mvnOB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OB {
public 	WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver89\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void OpenBrowser() {
		driver.get("https://mvnrepository.com/");
	}
	@AfterTest
	public void Teardown() {
		driver.close();
		
	}
}

