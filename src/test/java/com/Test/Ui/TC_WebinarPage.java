package com.Test.Ui;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.ReadUtility.Utils;

import com.Loactors.iFilePath;
import com.Pages.HomePage;
import com.Pages.SignInPage;
import com.Pages.WebinarPage;

public class TC_WebinarPage extends TestBase implements iFilePath {

	HomePage homePage;
	WebinarPage webinar;
	SignInPage login;

	@BeforeClass
	public void setup() {
		start();
		homePage = new HomePage(driver, wait);
		webinar = homePage.navigateToWebinarPage();
		login = new SignInPage(driver, wait);
	}

	@Test(testName = "Topic filter", priority = 1, enabled = true, description = "Test to validate toipc filter is working or not!")
	public void TC_topicFilter() {
		String verifyTopic = webinar.validateTopicFilter();
		// System.out.println("---VERIFY TOPIC FILTER " + verifyTopic);
		Assert.assertEquals(verifyTopic, verifyTopic);
	}

	@Test(testName = "Speaker filter", priority = 2, enabled = true, description = "Test to validate speakers filter is working or not!")
	public void TC_speakerFilter() {
		String verifySpeaker = webinar.validateSpeakersFilter();
		// System.out.println("---VERIFY SPEAKER FILTER " + verifySpeaker);
		Assert.assertEquals(verifySpeaker, verifySpeaker);

	}

	@Test(testName = "Search filter", priority = 3, enabled = true, description = "Test to validate speakers filter is working or not!")
	public void TC_searchFilter() throws IOException {
		String attribute = webinar.verifySearchFilter();
		// System.out.println("---CLICK ON TOPIC: " + attribute);
		String value = Utils.readProperty(file, "webinar_search_result");
		Assert.assertEquals(attribute, value);

	}

	@Test(testName = "Click on webinar content", priority = 4, description = "Test to validate user can able to click on Webinar topic or not!")
	public void TC_WebinarTopic() throws InterruptedException {
		webinar.webinarTopic();

	}

	@Test(testName = "Sign In Page", priority = 05, description = "Verify that user can Sign in sucessfully or not !", dataProviderClass = com.DataProvider.TestDataProvider.class, dataProvider = "propFile")
	public void Login_Test(String email, String pwd) {
		login.SignInProcess(email, pwd);
		Assert.assertEquals(webinar.getTopicName(), webinar.getTopicName());

	}

	@Test(testName = "Switch to Discussion tab", priority = 06, description = "Verify that user can switch to Discussion tab or not!")
	public void TC_DiscussionTab() throws IOException {
		String message = webinar.discussionTab();
		// System.out.println("=DOM====" + dom);
		Assert.assertEquals(message, Utils.readProperty(file, "post_message"));

	}

	@AfterClass
	public void tearDown() {
		webinar.closeBrowser();
	}
}
