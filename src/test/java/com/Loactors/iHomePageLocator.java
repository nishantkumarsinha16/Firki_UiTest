package com.Loactors;

import org.openqa.selenium.By;

public interface iHomePageLocator {

	By courseLocator = By.xpath("//a[@id=\"course_hover\"]");
	By signInPageLocator = By.xpath("//a[@class=\"theme-btn active sign_btn\"]");
	By webinarLocator = By.xpath("//div[@class=\"s-header__logo\"]//a[2]");
	By signUpPageLocator = By.xpath("//label[@class='tfi-sign-up']");

}
