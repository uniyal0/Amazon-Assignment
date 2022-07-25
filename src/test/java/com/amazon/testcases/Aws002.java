package com.amazon.testcases;

import org.testng.annotations.Test;

import com.amazon.testscript.AddBookToCart;
import com.amazon.utility.BaseClass;

public class Aws002 extends BaseClass{
	
	@Test()
	public void addBookToCart() throws InterruptedException {
		AddBookToCart.addBook();
	}

}
