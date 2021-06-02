package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Loactors.iRegistrationPage;

public class RegisterPage extends Base implements iRegistrationPage {

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
		// https://staging-lms.firki.co/custom_register/step2/

	}
}