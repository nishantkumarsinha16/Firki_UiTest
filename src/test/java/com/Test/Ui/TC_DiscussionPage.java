package com.Test.Ui;

import java.io.IOException;
import com.Loactors.iFilePath;
import com.Pages.DiscussionPage;
import com.Pages.HomePage;
import com.Pages.LandingPage;
import com.Pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Com.ReadUtility.Utils;

public class TC_DiscussionPage extends TestBase implements iFilePath {

    SignInPage signIn;
    HomePage homepage;
    LandingPage landingPage;
    DiscussionPage discussion;

    @BeforeClass
    public void setup() throws IOException {
        start();
        homepage = new HomePage(driver, wait);
        signIn = new SignInPage(driver, wait);
        landingPage = new LandingPage(driver, wait);
        discussion = new DiscussionPage(driver, wait);
        homepage.navigateToSignInPage();
        signIn.SignInProcess(Utils.readProperty(file, "user_email"), Utils.readProperty(file, "password"));
    }

    @Test(testName = "Verify Discussion page", priority = 1, description = "Verify that user can navigate to discussion page or not")
    public void TC_myLeaningCircle() {
        DiscussionPage discussion = landingPage.navigateToDiscussionPage();

        Assert.assertTrue(discussion.myLearningCircle());

    }

    @Test(testName = "Verify Create New Circle", enabled = false, priority = 2, description = "Verify that user can create new circle or not")
    public void Tc_createNewCircle() throws IOException {

        String msg = discussion.createCircle(Utils.readProperty(file, "groupName"), Utils.readProperty(file, "about"),
                Utils.readProperty(file, "member"), Utils.readProperty(file, "owner"));
        Assert.assertEquals(msg, Utils.readProp(file, "message"));
    }

    @Test(testName = "Validate create circle", enabled = false, priority = 3, description = "Verify that user can open circle which is creaded and owner and member are present or not")
    public void TC_validateGroup() throws InterruptedException {
        String user = "";
        String[] members = discussion.validateCircle();
        for (String s : members) {
            user += s.replaceAll(" ", "");
        }
        String propUser = Utils.readProp(file, "group.details");
        String validate_User = propUser.replaceAll(" ", "");
        // System.out.println(user);
        // System.out.println(validate_User);
        Assert.assertEquals(user, validate_User);
    }

    @Test(testName = "Verify create topic", enabled = false, priority = 4, description = "Verify that user can create topic or not...!!!")

    public void TC_createPost() throws InterruptedException {
        String assertMsg = "Topic Created Successfully";
        String msg = discussion.createPost();
        // System.out.println(msg);
        Assert.assertEquals(msg, assertMsg);
    }

    @Test(testName = "Verify post message", priority = 5, description = "Verify that user can post message or not")
    public void TC_validatePostMessage() {
        String msg = discussion.postMessage();
        System.out.println(msg);
        Assert.assertEquals(msg, Utils.readProp(file, "postMessage"));
    }

    @AfterClass
    public void tearDown() {
        discussion.closeBrowser();
    }

}