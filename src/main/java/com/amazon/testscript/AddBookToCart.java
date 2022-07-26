package com.amazon.testscript;

import org.openqa.selenium.By;

import com.amazon.utility.BaseClass;

public class AddBookToCart extends BaseClass{
	
	public static void addBook() throws InterruptedException {
//		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Books' and @class='nav-a  ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Teen Machine' and @class='a-truncate-full a-offscreen']//parent::span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='submit.add-to-cart-announce']//parent::span")).click();
		Thread.sleep(2000);
	}

}
