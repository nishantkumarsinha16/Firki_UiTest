package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Base {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	protected static By courseLocator = By.xpath("//a[@id=\"course_hover\"]");

	public CoursePage navigateToCoursePage() {
		clickOn(courseLocator);
		return new CoursePage(driver, wait); // Page Methods should always return page objects
	}

}
