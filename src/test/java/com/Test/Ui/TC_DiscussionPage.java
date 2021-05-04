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

import Com.ReadUtility.UtilityClass;

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
        signIn.SignInProcess(UtilityClass.readProperty(file, "user_email"),
                UtilityClass.readProperty(file, "password"));
    }

    @Test(testName = "Verify Discussion page", priority = 1, description = "Verify that user can navigate to discussion page or not")
    public void TC_myLeaningCircle() {
        DiscussionPage discussion = landingPage.navigateToDiscussionPage();
        Assert.assertTrue(discussion.myLearningCircle());

    }

    @AfterClass
    public void tearDown() {
        discussion.closeBrowser();
    }

}
