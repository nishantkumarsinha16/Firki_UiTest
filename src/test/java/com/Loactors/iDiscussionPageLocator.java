package com.Loactors;

import org.openqa.selenium.By;
import Com.ReadUtility.Utils;

public interface iDiscussionPageLocator extends iFilePath {

    /* Create Circel locator */

    By myLearningCircleText = By.xpath("//span[text()='My Learning Circle']");
    By createCircleLocator = By.xpath("//span[@ng-click='createCircle()']");
    By uploadImageLocator = By.xpath("//input[@id='create_group_avatar']");
    By createNameLocator = By.xpath("//input[@id='circleName']");
    By aboutCircleLocator = By.id("aboutCircle");
    By membersCircleLocator = By.xpath("//div[@id='members']//input[@class='dx-texteditor-input']");
    By selectUserLocator = By.xpath("//div[@class='dx-item dx-list-item dx-state-focused']");
    By ownersCircleLocator = By.xpath("//div[@id='owners']//input[@class='dx-texteditor-input']");
    By leaveGroupFreelyeLocator = By.id("publicExit");
    By createCicleLocator = By.xpath("//button[@class='btn btn-primary create_btn ng-binding']");
    By closeCreateCirclePopUpLocator = By.xpath("//i[@class='dx-icon dx-icon-close']");
    By tostTitleLocator = By.xpath("//div[@class='dx-overlay-content dx-toast-success dx-toast-content dx-resizable']");
    By tostTitleFailLocator = By.xpath("//div[@class='dx-toast-message']");
    // By listOfCircleLocator = By.xpath("//span[@class='content ng-binding']");

    // -----------------------Parameterise xpath------------------------------------
    By groupLocator = By.xpath("//span[@title='" + Utils.readProp(file, "groupName") + "']");
    // --------------------------------------------------------------------------------------

    // -------------------------Owner & MemberList--------------------------------
    By ownerListLocator = By.xpath("//span[@class='owner_m ng-binding ng-scope']");
    By memberListLocator = By.xpath("//span[@class='member_m ng-binding ng-scope']");

    // ---------------------------Create Topic--------------------------------
    By createNewTopicLocator = By.xpath("//span[@class='createtopic pointer ng-scope']//i");
    By inputTitleLocator = By.xpath("//input[@id='topicTitle']");
    By InputMsgLocator = By.xpath("//textarea[@id='newTopic_create']");
    By createTopicButtonLocator = By.xpath("//button[@class='btn btn-primary ng-binding']");
    By tostMsgCreateTopicLocator = By
            .xpath("//div[@class='dx-overlay-content dx-toast-success dx-toast-content dx-resizable']");
    By closeCreateTopicLocator = By.xpath("//button[@class='close_btn']");

    // --------------------------Open Topic ----------------------------------------
    By openTopicLocator = By.xpath("//span[normalize-space() = '" + Utils.readProp(file, "topicName") + "']");

    By postMsgLocator = By.xpath("//div[@id='post_message']");
    By sendButtonLocator = By.xpath("//div[@class='cmntboxarea']");
    By VerifyMsgLocator = By.xpath("//p[text()='" + Utils.readProp(file, "postMessage") + "']");

}
