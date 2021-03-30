package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class custom_register extends Base{
	
	By picUploadURLLocator =By.xpath("//span[@class=\"filepicvalue\"]");
	String filePath = "/image/icons8-user-groups-64.png";
	By fullNameLocator =By.id("full_name");
	By genderLocator =By.id("user_gender");//dropdown
	By birthLocator =By.id("user_doby");//dropdown
	By educationLevelLocator =By.id("user_hloec");//dropdown
	By mailingAddressLocator =By.id("user_mailadd");
	By userGoalLocator =By.id("user_goal");
	By createProfileLocator =By.id("load2");
	

	public custom_register(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public LandingPage custom_RegistationStep2() throws InterruptedException {
		//clickOn(picUploadURLLocator);
		uploadFile(picUploadURLLocator, filePath);
		System.out.println("");
		Thread.sleep(5000);
		//enterText(filePath, picUploadURLLocator);
		enterText("sample user1", fullNameLocator);
		dropDownOption(genderLocator, "Male");
		dropDownOption(birthLocator, "2021");
		dropDownOption(educationLevelLocator, "Bachelor's degree");
		enterText("Delhi",mailingAddressLocator);
		enterText("Teaching", userGoalLocator);
		clickOn(createProfileLocator);
		return new LandingPage(driver, wait);
		
		
		
		
		
	}

}
