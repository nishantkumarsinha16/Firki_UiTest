package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends Base {

	By emailLocator = By.id("email");
	By passwordLocator = By.id("password");
	By sumitLocator = By.id("submit");
	//By signInPageLocator = By.xpath("//a[@class=\"theme-btn active sign_btn\"]");

	public SignInPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public LandingPage SignInProcess(String EMAIL, String PASSWORD) {
		
		//clickOn(signInPageLocator);
		clear(emailLocator);
		enterText(EMAIL, emailLocator);
		clear(passwordLocator);
		enterText(PASSWORD, passwordLocator);
		clickOn(sumitLocator);
		return new LandingPage(driver, wait);

	}

}
