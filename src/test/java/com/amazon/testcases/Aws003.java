package com.amazon.testcases;

import org.testng.annotations.Test;

import com.amazon.testscript.ChangeLanguage;
import com.amazon.utility.BaseClass;

public class Aws003 extends BaseClass {
	@Test()
	public void changeLanguage() throws InterruptedException {
		//hi for hindi
		//en for english ...etc
		ChangeLanguage.change("hi");
		ChangeLanguage.change("En");
	}

}
