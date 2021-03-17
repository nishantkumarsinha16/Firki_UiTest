package com.Test.Ui;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.CoursePage;
import com.Pages.HomePage;

public class TC_CoursePage extends TestBase {

	private HomePage homepage;
	private CoursePage coursepage;

	@BeforeClass
	public void setUp() {
		start();
		homepage = new HomePage(driver, wait);
		coursepage = homepage.navigateToCoursePage();

	}

	@Test(testName = "CourseLanguageFilter", priority = 2, description = "Verify that 6 language available in course filter or not!")
	public void countOfLanguagefilter() {
		int count = coursepage.selectLanguageFilter();
		System.out.println("COUNT OF LANGUAGE: " + count);
		Assert.assertEquals(count, 6);

	}

	@Test(testName = "Test Language filter", priority = 3, description = "Verify that all language of course filter is working or not!")
	public void courseLanguageFilter() throws InterruptedException {
		refresh();
		String[] langs = coursepage.chooseLanguage();
		String[] lang = { "English", "Hindi", "Kannada", "Marathi", "Tamil", "Telugu" };
		Assert.assertEquals(langs, lang);

	}

	/*
	 * @Test(testName = "CourseCategoreisCount", priority = 4, description =
	 * "Verify that Classroom culture count is 20 or not!") public void
	 * countOfClassrommCulture() throws InterruptedException {
	 * 
	 * int count = coursepage.classrommCulture(); Assert.assertEquals(count, 20);
	 * 
	 * }
	 */

	@Test(testName = "Categories Test", priority = 4, description = "Verify that Classroom culture working or not!")
	public void ClassrommCulture() {

		Assert.assertTrue(coursepage.isClassrommCulture());
	}

	@Test(testName = "Categories Test", priority = 5, description = "Verify that Classroom Instruction working or not!")
	public void ClassroomInstruction() {

		Assert.assertTrue(coursepage.isClassroomInstruction());
	}

	@Test(testName = "Categories Test", priority = 6, description = "Verify that Schooland Community working or not!")
	public void SchoolandCommunity() {

		Assert.assertTrue(coursepage.isSchoolandCommunity());
	}

	@Test(testName = "Categories Test", priority = 7, description = "")
	public void SelfDevelopment() {

		Assert.assertTrue(coursepage.isSelfDevelopment());
	}

	@Test(testName = "Categories Test", priority = 8, description = "Verify that  Student Leadership working or not!")
	public void StudentLeadership() {

		Assert.assertTrue(coursepage.isStudentLeadership());
	}

	@Test(testName = "Categories Test", priority = 9, description = "Verify that Subject Instruction working or not!")
	public void SubjectInstruction() {

		Assert.assertTrue(coursepage.isSubjectInstruction());
	}

	@Test(testName = "Categories Test", priority = 10, description = "Verify that TheEducationLandscape working or not!")
	public void TheEducationLandscape() throws InterruptedException {

		Assert.assertTrue(coursepage.isTheEducationLandscape());
	}

	@Test(testName = "Levels Test", priority = 11, description = "Verify that Level-I filter working or not!")
	public void CourseLevel_I() throws InterruptedException {
		Assert.assertTrue(coursepage.isLevelOne());
	}

	@Test(testName = "Levels Test", priority = 12, description = "Verify that Level-II filter working or not!")
	public void CourseLevel_II() throws InterruptedException {

		Assert.assertTrue(coursepage.isLevelTwo());
	}

	@Test(testName = "Levels Test", priority = 13, description = "Verify that Level-III filter working or not!")
	public void CourseLevel_III() throws InterruptedException {

		Assert.assertTrue(coursepage.isLevelThree());
	}

	@AfterTest
	public void tearDown() {
		homepage.closeBrowser();

	}

}
