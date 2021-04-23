package com.Loactors;

import org.openqa.selenium.By;

public interface iRegistrationPage {

	By userNameLocator = By.xpath("//input[@id=\"username_reg\"]");
	By emailRegLocator = By.xpath("//input[@id=\"email_reg\"]");
	By passcodeRegLocator = By.xpath("//input[@id=\"password_reg\"]");
	By tearmOfConditionLocator = By.id("terms_of_service");
	By submitLocator = By.xpath("//button[@id=\"register_custom\"]");
	By signUpTextLocator = By.xpath("//h3[contains(text(),'Sign Up')]");
	// ----------CUSTOM REGISTRATION PAGE---------------------------------//

	By picUploadURLLocator = By.xpath("//input[@type=\"file\"]");
	By fullNameLocator = By.id("full_name");
	By clickOnGenderLocator = By.xpath("//select[@id=\"user_gender\"]");
	By genderLocator = By.xpath("//select[@id=\"user_gender\"]//option");
	By clickOnBirthLocator = By.xpath("//select[@id=\"user_doby\"]");
	By birthLocator = By.xpath("//select[@id=\"user_doby\"]//option");
	By clickOneducationLevelLocator = By.xpath("//select[@id=\"user_hloec\"]");
	By educationLevelLocator = By.xpath("//select[@id=\"user_hloec\"]//option");
	By mailingAddressLocator = By.id("user_mailadd");
	By userGoalLocator = By.id("user_goal");
	By createProfileLocator = By.xpath("//button[@class=\"profile-btn\"]");

}
