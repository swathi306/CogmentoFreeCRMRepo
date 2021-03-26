package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	HomePage  hp;
	public LoginPageTest()  {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		intialization();
		lp=new LoginPage();
		
	}
	@Test(priority=1)
	public void verifyTitleTest() {
	String title=lp.verifyTitle();
     Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	@Test(priority=2)
	public void loginTest() {
	hp=	lp.login();
		
		
	}
	
	
	@Test(priority=3)
	public void verifyClickOnForgotPasswordTest() {
		lp.clickOnForgotPassword();
	}
	
	@Test(priority=4)
	public void verifyClickOnSignUpTest() {
		lp.clickOnSignUp();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
