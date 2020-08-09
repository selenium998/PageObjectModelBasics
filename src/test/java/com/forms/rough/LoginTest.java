package com.forms.rough;

import static org.testng.Assert.assertEquals;

import java.awt.Menu;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.forms.pages.sforms.CreateBasicContactForm1;
import com.forms.pages1.HomePage1;
import com.forms.pages1.LoginPage1;
import com.forms.pages1.SFormsPage1;




public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		HomePage1 home = new HomePage1();
		LoginPage1 lp =home.goToLogin();
		
		SFormsPage1 sf =lp.doLogin("sukkumar3", "selenium@2020");
		
		//sf.goTosampleForms();
		home.goToSampleForms();
		
		CreateBasicContactForm1 cf =sf.goTobasicContactForm();
		cf.createBCForm("sukku", "sukkumar4@gmail.com","hi");
		
		
		
	}

}
