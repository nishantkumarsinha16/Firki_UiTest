package com.Test.Ui;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Loactors.iFilePath;
import com.Pages.HomePage;
import com.Pages.LandingPage;
import com.Pages.ResourcePage;
import com.Pages.SignInPage;

import Com.ReadUtility.UtilityClass;

public class TC_ResourcePage extends TestBase implements iFilePath {
	ResourcePage resource;
	SignInPage signIn;
	HomePage homepage;
	LandingPage landingPage;

	@BeforeClass
	public void setup() throws IOException {
		start();
		homepage = new HomePage(driver, wait);
		signIn = new SignInPage(driver, wait);
		resource = new ResourcePage(driver, wait);
		landingPage = new LandingPage(driver, wait);
		homepage.navigateToSignInPage();
		signIn.SignInProcess(UtilityClass.readProperty(file, "user_email"),
				UtilityClass.readProperty(file, "password"));
	}

	@Test(testName = "Click on resource page", priority = 1, description = "Verify that user can navigate to resource page or not!")
	public void TC_navigateToResourcePage() {
		ResourcePage resource = landingPage.navigateToResourcePage();

		Assert.assertTrue(resource.verify_resource());
	}

	@Test(testName = "Verify subject filter", priority = 2, description = "Verify that user can select subject filter or not!")
	public void TC_Resource_subjectFilter() {
		resource.subject_filter();

		// Assert.assertTrue(resource.verify_resource());
	}

	@AfterClass
	public void tearDown() {
		resource.closeBrowser();
	}
}
