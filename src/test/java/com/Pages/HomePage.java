package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Loactors.iHomePageLocator;

public class HomePage extends Base implements iHomePageLocator {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public CoursePage navigateToCoursePage() {
		clickOn(courseLocator);
		return new CoursePage(driver, wait); // Page Methods should always return page objects
	}

	public SignInPage navigateToSignInPage() {
		clickOn(signInPageLocator);
		return new SignInPage(driver, wait);

	}

	public RegisterPage navigateToSignUpPage() {
		clickOn(signUpPageLocator);
		return new RegisterPage(driver, wait);

	}

	public WebinarPage navigateToWebinarPage() {
		clickOn(webinarLocator);
		return new WebinarPage(driver, wait);
	}

}
