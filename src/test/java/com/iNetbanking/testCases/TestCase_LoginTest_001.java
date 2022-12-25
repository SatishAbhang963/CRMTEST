package com.iNetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetbanking.pageObjects.LoginPage;

public class TestCase_LoginTest_001 extends BaseClass{
	@Test
	public void LoginTest() {
		driver.get(url);
		LoginPage lp=new LoginPage(driver);
		lp.setuserName(uname);
		lp.setpassword(password);
		lp.clickloginbtn();
		
		if(driver.getTitle().equals("Guru99 Bank")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
	}

}
