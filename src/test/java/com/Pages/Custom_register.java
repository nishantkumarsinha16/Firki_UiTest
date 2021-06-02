package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Loactors.iFilePath;
import com.Loactors.iRegistrationPage;

public class Custom_register extends Base implements iRegistrationPage, iFilePath {

	public Custom_register(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public LandingPage custom_RegistationStep(String FULL_NAME, String GENDER, String YEAR, String EDUCATION,
			String ADDRESS, String GOAL) throws InterruptedException {

		Thread.sleep(5000);
		uploadFile(picUploadURLLocator, imagePath);
		clear(fullNameLocator);
		System.out.println("Custom page");
		enterText(FULL_NAME, fullNameLocator);
		clickOn(clickOnGenderLocator);
		filterOption(genderLocator, GENDER);
		clickOn(clickOnBirthLocator);
		filterOption(birthLocator, YEAR);
		clickOn(clickOneducationLevelLocator);
		filterOption(educationLevelLocator, EDUCATION);
		scrollDown(500);
		enterText(ADDRESS, mailingAddressLocator);
		enterText(GOAL, userGoalLocator);
		clickOn(createProfileLocator);
		return new LandingPage(driver, wait);

	}

	public CoursePage custom_RegistationStepsCourse(String FULL_NAME, String GENDER, String YEAR, String EDUCATION,
			String ADDRESS, String GOAL) {

		System.out.println("course_Custom page");
		uploadFile(picUploadURLLocator, imagePath);
		clear(fullNameLocator);
		enterText(FULL_NAME, fullNameLocator);
		clickOn(clickOnGenderLocator);
		filterOption(genderLocator, GENDER);
		clickOn(clickOnBirthLocator);
		filterOption(birthLocator, YEAR);
		clickOn(clickOneducationLevelLocator);
		filterOption(educationLevelLocator, EDUCATION);
		scrollDown(500);
		enterText(ADDRESS, mailingAddressLocator);
		enterText(GOAL, userGoalLocator);
		clickOn(createProfileLocator);
		return new CoursePage(driver, wait);
	}
}
