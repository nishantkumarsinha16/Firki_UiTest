package com.Test.Ui;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.CoursePage;
import com.Pages.HomePage;

public class TC_HomePage extends TestBase {

	private HomePage homepage;
	private CoursePage coursepage;

	@BeforeSuite
	public void setUp() {
	start();
	homepage=new HomePage(driver, wait);
	}

	
	@Test(testName = "CourseLinkActive", priority = 0, description = "Verify that course link is working or not!")
	public void courseLinkTest() {		
		coursepage = homepage.navigateToCoursePage();
		Assert.assertTrue(coursepage.isClassroomCultureText());

	}


//	@AfterSuite
//	public void tearDown() {
//		homepage.closeBrowser();
//
//	}

}
