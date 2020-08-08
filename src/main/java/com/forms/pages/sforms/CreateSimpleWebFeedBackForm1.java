package com.forms.pages.sforms;

import org.openqa.selenium.By;

import com.forms.base.Page1;

public class CreateSimpleWebFeedBackForm1 extends Page1{

	public void createSimpleWebFeedback(String name,String emailid,String message) {
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/font[1]/input[1]")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys("emailid");
		driver.findElement(By.xpath("//textarea[@name='q[4]")).sendKeys("message");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
		
		
		
	}
}
	