package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends Base {

	By userNameLocator = By.xpath("//input[@id=\"username_reg\"]");
	By emailRegLocator = By.xpath("//input[@id=\"email_reg\"]");
	By passcodeRegLocator = By.xpath("//input[@id=\"password_reg\"]");
	By tearmOfConditionLocator = By.id("terms_of_service");
	By submitLocator = By.xpath("//button[@id=\"register_custom\"]");
	By signUpTextLocator = By.xpath("//h3[contains(text(),'Sign Up')]");
	

	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}
	
	public boolean ValidateRegisterPage() {
		return isElementPresent(signUpTextLocator);
	}

	public Custom_register RegistrationProcess(String USERNAME, String EMAIL, String PASSWORD) {
		// Thread.sleep(5000);
		
		System.out.println("Register page");
		
		enterText(USERNAME, userNameLocator);
		enterText(EMAIL, emailRegLocator);
		enterText(PASSWORD, passcodeRegLocator);
		checkBox(tearmOfConditionLocator);
		clickOn(submitLocator);
		return new Custom_register(driver, wait);
		//https://staging-lms.firki.co/custom_register/step2/

	}

}
