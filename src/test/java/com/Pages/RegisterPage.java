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

	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}

	public custom_register RegistrationProcess(String USERNAME, String EMAIL, String PASSWORD) {
		// Thread.sleep(5000);
		
		enterText(USERNAME, userNameLocator);
		enterText(EMAIL, emailRegLocator);
		enterText(PASSWORD, passcodeRegLocator);
		checkBox(tearmOfConditionLocator);
		clickOn(submitLocator);
		return new custom_register(driver, wait);
		//https://staging-lms.firki.co/custom_register/step2/

	}

}
