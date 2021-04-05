package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Custom_register extends Base {

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
	
	

	public Custom_register(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public LandingPage custom_RegistationStep(String FULL_NAME,String GENDER,String YEAR, String EDUCATION, String ADDRESS,String GOAL) throws InterruptedException {
		
		uploadFile(picUploadURLLocator);
		
		clear(fullNameLocator);
		enterText(FULL_NAME, fullNameLocator);
		
		clickOn(clickOnGenderLocator);
		dropDownOption(genderLocator, GENDER);
		
		clickOn(clickOnBirthLocator);
		dropDownOption(birthLocator, YEAR);
		
		clickOn(clickOneducationLevelLocator);
		dropDownOption(educationLevelLocator, EDUCATION);
		
		scrollDown(500);
		enterText(ADDRESS, mailingAddressLocator);
		enterText(GOAL, userGoalLocator);
		
		clickOn(createProfileLocator);
		
		//Thread.sleep(5000);

		return new LandingPage(driver, wait);

	}

}
