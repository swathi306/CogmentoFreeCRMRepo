package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.qa.crm.pages.ContactsPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

public class ContactsPageTest extends TestBase{
	
	LoginPage lp;
	HomePage hp;
	ContactsPage cp;
	
	
	public ContactsPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		intialization();
		lp=new LoginPage();
		hp=new HomePage();
	lp.login();
		hp.clickOnContactsLink();
           cp=new ContactsPage();
		
	}
	
	
	@Test
	public  void VerifyClickOnCreateButtonTest() {
		cp.clickOnCreateButton();
		cp.createNewContact();
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
