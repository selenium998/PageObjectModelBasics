package com.forms.pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.forms.base.Page1;



public class HomePage1 extends Page1 {
	
	public LoginPage1 goToLogin(){
		
		//driver.findElement(By.id("user")).sendKeys("sukkumar3");
		//driver.findElement(By.id("pass")).sendKeys("selenium@2020");
		//driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
		click("Loginlink_XPATH");
		return new LoginPage1();
	}
	
	public void goToSignUp() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up For Free')]")).click();
		
	}
	
	public SFormsPage1 goToSampleForms() {
		driver.findElement(By.xpath("//a[contains(text(),'Sample Forms')]")).click();
		//click("sampleforms_xpath");
		return new SFormsPage1();
	}
	
	public void goToFeatures() {
		driver.findElement(By.xpath("//div[@id='header']//a[contains(text(),'Features')]")).click();
	}
	
	public void goToPricing() {
		driver.findElement(By.xpath("//a[contains(text(),'Pricing')]")).click();
	}
	
	
	public void goToHelp() {
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
	}
	
	public void goToAboutUs() {
		driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
	}
	
	public void goToResources() {
		driver.findElement(By.xpath("//a[contains(text(),'Resources')]")).click();
	}
	
	public void validateFooterLinks() {
		driver.findElement(By.xpath("//div[@id='footer']//a[contains(text(),'Testimonials')]")).click();
		driver.findElement(By.xpath("//div[@id='footer']//a[contains(text(),'Lost Password')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sitemap')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Services Agreement')]")).click();
		
		
	}
}
