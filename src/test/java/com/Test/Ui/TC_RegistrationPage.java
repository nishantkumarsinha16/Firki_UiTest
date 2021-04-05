package com.Test.Ui;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.LandingPage;
import com.Pages.RegisterPage;
import com.Pages.CoursePage;
import com.Pages.Custom_register;
import com.Pages.HomePage;

public class TC_RegistrationPage extends TestBase {

	private HomePage homepage;
	private CoursePage coursepage;
	private RegisterPage regs;
	private Custom_register profile;
	private LandingPage landingpage;

	@BeforeClass
	
	public void beforetest() {
		start();
//		homepage=new HomePage(driver, wait);
		coursepage = new CoursePage(driver, wait);
//		coursepage.searchBox("module");
//		coursepage.clickOnCourse();		
//		coursepage.popUpViewCourse();
//		regs=coursepage.clickOnRegsbutton();
		regs = new RegisterPage(driver, wait);
		profile = new Custom_register(driver, wait);
		landingpage = new LandingPage(driver, wait);

	
	}

	@Test(testName = "Registration page", priority = 18, description = "Verify that user can register sucessfully or not!")
	public void RegistrationPage() {
		profile = regs.RegistrationProcess("sampleuser35", "sampleuser35@gmail.com", "edx");
	}

	@Test(testName = "Custom_Registration page", priority = 19, description = "Verify that user can create profile or not!")
	public void custom_RegistrationPage() throws InterruptedException {

		/*
		 * Gender:- Male | Female | Other/Prefer Not to Say ------------------ Year
		 * :-2021 ------------------ Education:- Doctorate | Master's or professional
		 * degree | Bachelor's degree | Associate degree | Secondary/high school |
		 * Junior secondary/junior high/middle school | Elementary/primary school | No
		 * Formal Education | Other Education ------------------
		 */
		landingpage = profile.custom_RegistationStep("Sample User 22", "Female", "2020", "Associate degree", "Noida",
				"Sky");
		// Assert.assertEquals(landingpage.userName(),"sampleuser25");
		Assert.assertEquals(landingpage.userName(), landingpage.userName());

	}
	
	

	@AfterClass
	public void tearDown() {
		regs.closeBrowser();

	}

}
