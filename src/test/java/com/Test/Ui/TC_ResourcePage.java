package com.Test.Ui;

import java.io.IOException;
import java.util.Arrays;
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

	@Test(testName = "Verify subject filter", enabled = true, priority = 2, description = "Verify that user can select Subject filter or not!")
	public void TC_subjectFilter() throws InterruptedException {
		String[] text = resource.subjectFilter();
		String[] subject = { "674", "1", "27", "177", "92", "4", "41", "759", "11", "5", "607", "341", "33" };
		// System.out.println("text---" + Arrays.toString(text));
		// System.out.println(Arrays.toString(subject));
		Assert.assertEquals(Arrays.toString(text), Arrays.toString(subject));
	}

	@Test(testName = "Verify grade filter", enabled = true, priority = 3, description = "verify that user can select grade filter or not")
	public void TC_gradeFilter() throws InterruptedException {
		String[] text = resource.gradesFilter();
		String[] grade = { "411", "350", "380", "365", "522", "643", "637", "526", "283", "245", "108", "84" };
		// System.out.println("text---" + Arrays.toString(text));
		// System.out.println(Arrays.toString(grade));
		Assert.assertEquals(Arrays.toString(text), Arrays.toString(grade));

	}

	@Test(testName = "Verify Type Of Resource filter", enabled = true, priority = 3, description = "verify that user can select Type of Resourece filter or not")
	public void TC_resourceFilter() throws InterruptedException {
		String[] text = resource.typeOfResourceFilter();
		String[] grade = { "4", "370", "2307", "25", "74" };
		// System.out.println("text---" + Arrays.toString(text));
		// System.out.println(Arrays.toString(grade));
		Assert.assertEquals(Arrays.toString(text), Arrays.toString(grade));

	}

	@Test(testName = "Verify Type Of Partners filter", priority = 3, description = "verify that user can select Partners filter or not")
	public void TC_partnersFilter() throws InterruptedException {
		String[] text = resource.partnersFilter();
		String[] partner = { "414", "51", "28", "23", "27", "1", "82", "97", "74", "67", "9", "16", "52", "124", "246",
				"17", "1180", "10", "45" };
		// System.out.println("text---" + Arrays.toString(text));
		// System.out.println(Arrays.toString(partner));
		Assert.assertEquals(Arrays.toString(text), Arrays.toString(partner));

	}

	@AfterClass
	public void tearDown() {
		resource.closeBrowser();
	}
}
