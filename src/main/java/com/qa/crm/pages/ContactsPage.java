package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='dashboard-toolbar']//div[@class='item']/a")
	WebElement createbtn;
	
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement middlename;
	
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement savebtn;
	
	public void clickOnCreateButton() {
		createbtn.click();
		
	}
	
	public void createNewContact() {
		firstname.sendKeys("ram");
		lastname.sendKeys("ram");
		middlename.sendKeys("ram");
		email.sendKeys("ram123@gmail.com");
		savebtn.click();
	}
	

}
