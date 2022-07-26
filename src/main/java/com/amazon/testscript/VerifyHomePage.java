package com.amazon.testscript;

import com.amazon.utility.BaseClass;

public class VerifyHomePage extends BaseClass {
	
	public static void verifyTitle() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		
		if(title.contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("We are on Amazon Home page");
		}
		else {
			System.out.println("Something Wrong!!");
		}
		
	}

}
