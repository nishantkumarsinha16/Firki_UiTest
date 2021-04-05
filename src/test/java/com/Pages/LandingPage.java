package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends Base {

	By userNameLocator = By.xpath("//a[@class=\"dropbtn theme-btn active\"]/label");

	//By userNameLocator = By.xpath("//li[@class=\"dropdown-new\"]//label");

	public LandingPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	public String userName() {
		String username = getUserName(userNameLocator);
		System.out.println("username:   " + username);
		return username;
	}

}
