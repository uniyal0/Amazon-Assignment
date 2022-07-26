package com.amazon.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amazon.utility.BaseClass;

public class ChangeLanguage extends BaseClass{
	
	
	public static void change(String str) throws InterruptedException {
		driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.xpath("//div[contains(@id,'nav-tools')]//child::a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		
		 //Method 1
		
	    //List<WebElement> langs =  driver.findElements(By.xpath("//a[contains(@href,'#switch-lang')]//child::span//child::span[2]"));
		//langs.get(i).click();
		
		
		//Method 2 passing language string
		String locator = "#switch-lang="+str.toLowerCase()+"_IN";
		String xpath  = "//a[contains(@href,"+"'"+locator+"'"+")]//child::span//child::span[2]";
		driver.findElement(By.xpath(xpath)).click();	
		Thread.sleep(5000);
	}

}
