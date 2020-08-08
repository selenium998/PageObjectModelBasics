package com.forms.pages.sforms;

import org.openqa.selenium.By;

import com.forms.base.Page1;



public class CreateBasicContactForm1 extends Page1 {
	
	public  void createBCForm(String accountName,String emailid,String message) {
		
		//driver.findElement(By.xpath("//input[@name='q[1]']")).sendKeys(accountName);
		type("username_XPATH",accountName);
		//driver.findElement(By.id("email")).sendKeys(emailid);
		type("email_ID",emailid);
		//driver.findElement(By.name("q[2]")).sendKeys(message);
		type("message_XPATH",message);
		//driver.findElement(By.name("submit")).click();
		click("submitbtn_NAME");
	}
	

}
