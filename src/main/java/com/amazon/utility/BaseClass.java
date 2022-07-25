package com.amazon.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseClass {
	public static WebDriver driver;
	
	@BeforeSuite
	public static void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudhanshu.uniyal\\OneDrive\\Desktop\\Assignment2_sudhanshu\\Assignment\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterSuite
	public static void end() {
		driver.close();
	}

}
