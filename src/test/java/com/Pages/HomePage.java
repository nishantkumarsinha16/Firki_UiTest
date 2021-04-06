package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Base implements iCoursePageLocator {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	By courseLocator = By.xpath("//a[@id=\"course_hover\"]");
	By signInPageLocator = By.xpath("//a[@class=\"theme-btn active sign_btn\"]");

	public CoursePage navigateToCoursePage() {
		System.out.println("Home Page");
		clickOn(courseLocator);
		return new CoursePage(driver, wait); // Page Methods should always return page objects
	}
	
	

//	public SignInPage navigateToSignInPage() {
//		clickOn(signInPageLocator);
//		return new SignInPage(driver, wait);
//
//	}

}
