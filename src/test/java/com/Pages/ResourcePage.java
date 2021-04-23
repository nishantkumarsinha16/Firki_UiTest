package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Loactors.iResourcePage;

public class ResourcePage extends Base implements iResourcePage {

	
	// ("//*[text()='Others']");
	By okButtonLocator = By.xpath("//div[@class=\"dx-item dx-toolbar-item dx-toolbar-button\"]//span");
	By scrollTo = By.xpath("//div[@class=\"dx-scrollable-scroll-content\"]");

	public ResourcePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public boolean verify_resource() {
		// System.out.println(getText(count_Resource));
		return isElementPresent(count_Resource);
	}

	public void subject_filter() {

		clickOn(select_subjectFilterLocator);

		// EventFiringWebDriver event=new EventFiringWebDriver(driver);
		// event.executeScript("document.querySelector('scrollTo').scrollTop=500");

		int count = countofElement(subjectFilterLocator);
		System.out.println("------------" + count);

		clickOn(okButtonLocator);

	}

}
