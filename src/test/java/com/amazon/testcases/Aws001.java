package com.amazon.testcases;

import org.testng.annotations.Test;

import com.amazon.testscript.VerifyHomePage;
import com.amazon.utility.BaseClass;

public class Aws001 extends BaseClass{
	
	@Test()
	public void verifyHomePageTitle() throws InterruptedException {
		VerifyHomePage.verifyTitle();
	}

}
