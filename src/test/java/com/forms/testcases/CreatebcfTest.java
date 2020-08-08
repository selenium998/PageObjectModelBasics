package com.forms.testcases;

import java.util.Hashtable;
import org.testng.annotations.Test;

import com.forms.base.Page1;
import com.forms.pages.sforms.CreateBasicContactForm1;
import com.forms.pages1.HomePage1;
import com.forms.pages1.LoginPage1;
import com.forms.pages1.SFormsPage1;
import com.forms.utilities.Utilities;

public class CreatebcfTest extends BaseTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")

	public void createbcfTest(Hashtable<String, String> data) {
		
	
		HomePage1 home =new HomePage1();
		SFormsPage1 sf = home.goToSampleForms();
		CreateBasicContactForm1 cf =sf.goTobasicContactForm();
		//cf.createBCForm(data.get("accountName"), data.get("emailid"), data.get("message"));

	}

}
