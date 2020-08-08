package com.forms.pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.forms.base.Page1;
import com.forms.pages.sforms.CreateBasicContactForm1;



public class SFormsPage1 extends Page1 {
	
	
	//public void goTosampleForms() {
		//driver.findElement(By.xpath("//a[contains(text(),'Sample Forms')]")).click();
		//click("sampleforms_xpath");
		
	//}
	public  CreateBasicContactForm1 goTobasicContactForm() {
		
		//driver.findElement(By.xpath("//a[contains(text(),'Basic Contact Form')]")).click();
		click("basicCF_XPATH");
		return new CreateBasicContactForm1();
	}
	
	//public void goTosampleBusinessContactForm() {
		//driver.findElement(By.xpath("//a[contains(text(),'Business Contact Form')]')]")).click();
	//}
	//public void goTosimpleWebFeedback() {
	//	driver.findElement(By.xpath("//a[contains(text(),'Simple Web Feedback')]")).click();
	//}
	
}
