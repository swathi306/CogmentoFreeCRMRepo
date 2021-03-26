package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;





public class LoginPage extends TestBase {
	
	//constructor
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement fgt_psswd;
	
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signup;
	
	
	public String verifyTitle() {
		return driver.getTitle();
	
	}
	
	
	public void clickOnForgotPassword() {
		fgt_psswd.click();
	}
	
	
	public void clickOnSignUp() {
		signup.click();
	}
	
	public HomePage login() {
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
		return new HomePage();
	}
	
}
