package com.Test.Ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.LandingPage;
import com.Pages.RegisterPage;
import com.Pages.custom_register;

public class TC_RegistrationPage extends TestBase {

	// private HomePage homepage;
	// private CoursePage coursepage;
	private RegisterPage regs;
	private custom_register profile;

	@BeforeClass
	public void setUp() {
		start();
//		homepage=new HomePage(driver, wait);
//		coursepage = homepage.navigateToCoursePage();
//		coursepage.searchBox("module");
//		coursepage.clickOnCourse();		
//		coursepage.popUpViewCourse();
//		coursepage.clickOnRegsbutton();
		regs = new RegisterPage(driver, wait);
		profile = new custom_register(driver, wait);

		// homepage=new HomePage(driver, wait);
		// homepage.navigateToSignInPage();

	}

	@Test(testName = "Registration page", priority = 1, description = "Verify that user can register sucessfully or not!")
	public void RegistrationPage() {
		profile = regs.RegistrationProcess("sampleuser2", "sampleuser1@gmail.com", "edx");
		// assertTrue(true);
	}

	@Test(testName = "Custom_Registration page", priority = 2, description = "Verify that user can create profile or not!")
	public void Custom_RegistrationPage() {
		LandingPage Lg = profile.custom_RegistationStep2();
		// assertTrue(true);

	}

	@AfterTest
	public void tearDown() {
		regs.closeBrowser();

	}

}
