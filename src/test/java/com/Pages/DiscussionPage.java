package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class DiscussionPage extends Base {

    By myLearningCircleText = By.xpath("//span[text()='My Learning Circle']");

    public DiscussionPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }

    public boolean myLearningCircle() {
        return isElementPresent(myLearningCircleText);

    }

    @AfterClass
    public void tearDown() {
        closeBrowser();

    }

}
