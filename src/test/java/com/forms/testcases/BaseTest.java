package com.forms.testcases;

import org.testng.annotations.AfterSuite;


import com.forms.base.Page1;

public class BaseTest {
	
	@AfterSuite
	public void tearDown() {
		Page1.quit();

}
}
