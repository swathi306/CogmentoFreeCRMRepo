package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.qa.crm.pages.ContactsPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

import junit.framework.Assert;

public class HomePageTest extends TestBase{
	LoginPage lp;
	HomePage hp;
	ContactsPage cp;
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		intialization();
		 lp= new LoginPage();
		lp.login();
 hp=new HomePage(); 
		
	}
	
	@Test(priority=1)
	public void  verifyClickOnCalenderLinkTest() {
		hp.clickOnCalenderLink();
	}
	
	@Test(priority=2)
	public void  verifyClickOnContactsLinkTest() {
	cp=	hp.clickOnContactsLink();
	}
	
	
	@Test(priority=3)
	public void  verifyClickOnCompaniesLinkTest() {
		hp.clickOnCompaniesLink();
	}
	@Test(priority=4)
	public void verifyHomePageTitleTest() {
		String title=hp.verifyHomePageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
