package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Base {

	protected WebDriver driver;
	protected static WebDriverWait wait;

	public Base(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		Base.wait = wait;

	}

// click method
	public void clickOn(By Locator) {
		WebElement buttonElement = wait.until(ExpectedConditions.elementToBeClickable(Locator));
		buttonElement.click();

	}

//Check element is present or not
	protected boolean isElementPresent(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		if (element == null) {
			return false;
		} else {
			return true;// element present
		}

	}

	protected int countofElement(By locator) {

		// WebDriverWait waitNew = new WebDriverWait(driver, 40, 3000);
		List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		for (int i = 0; i < list.size(); i++) {
			list.size();
		}
		return list.size();
	}

	protected void refresh() {
		driver.navigate().refresh();

	}

	public String dropDownOption(By locator, String language) {

		List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().contains(language)) {
				list.get(i).click();
				break;
			}
		}
		return language;

	}

	public void scrollUp(By locator) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public void scrollDown(float pixelX) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("scroll(0," + pixelX + ")"); // if the element is on bottom.

	}

	public void closeBrowser() {
		driver.quit();

	}

}
