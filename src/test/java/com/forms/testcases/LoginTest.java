package com.forms.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.forms.pages1.HomePage1;
import com.forms.pages1.LoginPage1;
import com.forms.pages1.SFormsPage1;
import com.forms.utilities.Utilities;




public class LoginTest extends BaseTest {
	
	@Test(dataProviderClass=Utilities.class, dataProvider = "dp")
	
	public void loginTest(Hashtable<String,String> data) {
		
		HomePage1 home = new HomePage1();
		LoginPage1 lp =home.goToLogin();
		
		SFormsPage1 sf =lp.doLogin(data.get("username"), data.get("password"));

}
}
