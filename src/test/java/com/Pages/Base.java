package com.Pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	protected void clickOn(By Locator) {
		WebElement buttonElement = wait.until(ExpectedConditions.elementToBeClickable(Locator));
		buttonElement.click();

	}

	protected void checkBox(By locator) {

		WebElement checkBoxElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		checkBoxElement.click();
	}

	// Check element is present or not
	protected boolean isElementPresent(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		if (element == null) {
			return false;
		} else {

			return true;// element present
		}

	}

	protected int countofElement(By locator) {

		List<WebElement> list = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		// visibilityOfAllElementsLocatedBy
		for (int i = 0; i < list.size(); i++) {
			list.size();
		}
		return list.size();
	}

	protected void refresh() {
		driver.navigate().refresh();

	}

	protected String filterOption(By locator, String value) {

		List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().contains(value)) {
				list.get(i).click();
				break;
			}
		}
		return value;

	}

	protected String getMessage(By locator, String message) {
		// List<String>data= new ArrayList<String>();
		List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		for (int i = 0; i < list.size(); i++) {
			list.get(i).getText().contains(message);
			list.get(i);
		}
		return message;
	}

	protected void scroll(By locator) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	protected void scrollDown(float pixelX) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0," + pixelX + ")"); // if the element is on bottom.

	}

	protected void smoothScroll(By locator, float pixelX) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		js.executeScript("scroll(0," + pixelX + "),", element); // if the element is on bottom.

	}

	protected void enterText(String enterText, By locator) {
		WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		inputElement.sendKeys(enterText);
		// inputElement.sendKeys(Keys.ENTER);

	}

	protected void pressEnter(By locator) {
		WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		try {
			inputElement.sendKeys(Keys.ENTER);
			// System.out.println("ENTER");

		} catch (Exception e) {
			inputElement.sendKeys(Keys.RETURN);
			// System.out.println("RETURN");

		}

	}

	protected String getAttribute(By locator, String tag) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		// presenceOfElementLocated(locator));
		// visibilityOfElementLocated(locator));
		String text = element.getAttribute(tag);
		return text;
	}

	protected void uploadFile(By locator) {
		String fPath = System.getProperty("user.dir") + "/image/firki.jpg";
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		// System.out.println(fPath);
		element.sendKeys(fPath);
	}

	protected void clear(By locator) {
		WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		inputElement.clear();

	}

	protected String getUserName(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String userName = element.getText();
		return userName;

	}

	protected String getText(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String text = element.getText();
		return text;
	}

	protected List<String> getListOfElement(By locator) {
		List<String> data = new ArrayList<String>();
		List<WebElement> elementList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

		for (int i = 0; i < elementList.size(); i++) {
			data.add(elementList.get(i).getText()); // Array list

		}
		return data;
	}

	protected List<String> printAllElement(By locator) {
		List<String> data = new ArrayList<String>();
		List<WebElement> elementList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		for (int i = 0; i < elementList.size(); i++) {
			data.add(elementList.get(i).getText()); // Array list

		}
		return data;
	}

	protected void moveToElement(By locator) {

		WebElement move = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Actions act = new Actions(driver);
		act.moveToElement(move).perform();

	}

	public boolean validateMessage(String message) {
		if (message.equalsIgnoreCase(message) || message.equalsIgnoreCase(message)) {
			return true;
		} else {
			System.out.println("Error to create group...!!!");
			return false;
		}

	}

	public void closeBrowser() {
		driver.quit();

	}

}
