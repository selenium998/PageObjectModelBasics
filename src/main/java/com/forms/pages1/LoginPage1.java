package com.forms.pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.forms.base.Page1;



public class LoginPage1 extends Page1{
	
	
	public SFormsPage1 doLogin(String username,String password) {
		
		//driver.findElement(By.id("user")).sendKeys(username);
		type("email_XPATH",username);
		//driver.findElement(By.id("pass")).sendKeys(password);
		type("password_XPATH",password);
		//driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
		click("signbtn_XPATH");
		return new SFormsPage1();
	}

}
