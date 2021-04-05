package com.Test.Ui;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.CoursePage;
import com.Pages.HomePage;

public class TC_HomePage extends TestBase {

	private HomePage homepage;
	private CoursePage coursepage;

	//@BeforeSuite
	//@BeforeClass
	public void setUp() {
	//	start();	
		coursepage = new CoursePage(driver, wait);
		//coursepage = homepage.navigateToCoursePage();
	}

	
	@Test(testName = "CourseLinkActive", priority = 0, description = "Verify that course link is working or not!")
	public void courseLinkTest() {
		homepage = new HomePage(driver, wait);
		coursepage = homepage.navigateToCoursePage();
		Assert.assertTrue(coursepage.isClassroomCultureText());

	}


//	@AfterClass
//	public void tearDown() {
//		homepage.closeBrowser();
//
//	}

}
