package com.amazon.testscript;

import com.amazon.utility.BaseClass;

public class VerifyHomePage extends BaseClass {
	
	public static void verifyTitle() {
		String title = driver.getTitle();
		
		if(title.contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("We are on Amazon Home page");
		}
		else {
			System.out.println("Something Wrong!!");
		}
		
	}

}
