package com.amazon.testcases;

import org.testng.annotations.Test;

import com.amazon.testscript.JoinPrime;
import com.amazon.utility.BaseClass;

public class Aws004 extends BaseClass {
	
	@Test()
	public void joinPrime() throws InterruptedException {
		JoinPrime.join();
	}
}
