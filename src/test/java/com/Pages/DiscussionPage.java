package com.Pages;

import com.Loactors.iDiscussionPageLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DiscussionPage extends Base implements iDiscussionPageLocator {

    public DiscussionPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }

    public boolean myLearningCircle() {
        return isElementPresent(myLearningCircleText);

    }

    public String createCircle(String circleName, String aboutCircle, String members, String owners) {
        String message = "";
        clickOn(createCircleLocator);
        // uploadFile(uploadImageLocator);
        enterText(circleName, createNameLocator);
        enterText(aboutCircle, aboutCircleLocator);
        enterText(members, membersCircleLocator);
        clickOn(selectUserLocator);
        enterText(owners, ownersCircleLocator);
        clickOn(selectUserLocator);
        clickOn(leaveGroupFreelyeLocator);
        clickOn(createCicleLocator);
        try {

            message = getText(tostTitleLocator);
            // System.out.println(message);

        } catch (Exception e) {
            clickOn(closeCreateCirclePopUpLocator);
            // message = getText(tostTitleFailLocator);
            System.out.println("Error: Group name already exist");

        }

        return message;

    }

    public void validateCircle() {
        moveToElement(moveElement);
        clickOn(moveElement);

    }

}
