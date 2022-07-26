package com.amazon.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amazon.utility.BaseClass;

public class JoinPrime extends BaseClass {

	
	public static void join() throws InterruptedException {
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='nav-flyout-amazonprime']/div[2]/ms3-selection/div/a")).click();
		
		Thread.sleep(2000);
	}
}
