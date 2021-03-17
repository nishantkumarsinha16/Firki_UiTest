package com.Test.Ui;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.CoursePage;
import com.Pages.HomePage;

public class TC_HomePage extends TestBase {

	private HomePage homepage;
	private CoursePage coursepage;


	@BeforeClass
	public void setUp(){
		start();
		homepage=new HomePage(driver, wait);
		//coursepage=homepage.navigateToCoursePage();	
		}

	@Test(testName = "CourseLinkActive", priority = 1,description = "Verify that course link is working or not!")
	public void courseLinkTest() {		
		coursepage=homepage.navigateToCoursePage();
		Assert.assertTrue(coursepage.isClassroomCultureText());

	}	

	@AfterTest
	public void tearDown() {
		homepage.closeBrowser();

	}

}
