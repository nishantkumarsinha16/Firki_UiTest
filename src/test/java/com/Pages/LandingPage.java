package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Loactors.iResourcePage;

public class LandingPage extends Base implements iResourcePage {

	By userNameLocator = By.xpath("//a[@class=\"dropbtn theme-btn active\"]/label");

	// By userNameLocator = By.xpath("//li[@class=\"dropdown-new\"]//label");

	public LandingPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public String userName() {
		String username = getText(userNameLocator);
		System.out.println("username:   " + username);
		return username;
	}

	public ResourcePage navigateToResourcePage() {
		clickOn(resourcePageLocator);
		return new ResourcePage(driver, wait);

	}

}
