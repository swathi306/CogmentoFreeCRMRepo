package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//span[text()='Calendar']")
	WebElement calenderlink;
	
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactslink;
	
	
	@FindBy(xpath="//span[text()='Companies']")
WebElement companieslink;
	
	
	
	public String verifyHomePageTitle() {
	return driver.getTitle();
	}
	
	
	public CalenderPage clickOnCalenderLink() {
		calenderlink.click();
		return new CalenderPage();
	}
	
	
	public ContactsPage clickOnContactsLink() {
		contactslink.click();
		return new ContactsPage();
		
	}
	
	public CompaniesPage clickOnCompaniesLink() {
		companieslink.click();
		
		return new CompaniesPage();
	}
}
