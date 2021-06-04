package com.Test.Ui;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Com.ReadUtility.Utils;
import com.Loactors.iFilePath;
import com.Pages.CoursePage;
import com.Pages.Custom_register;
import com.Pages.HomePage;
import com.Pages.RegisterPage;

public class TC_CoursePage extends TestBase implements iFilePath {

	private HomePage homepage;
	private CoursePage coursepage;
	private RegisterPage regs;
	private Custom_register profile;

	@BeforeClass
	public void setUp() {
		start();
		homepage = new HomePage(driver, wait);
		coursepage = homepage.navigateToCoursePage();
		coursepage = new CoursePage(driver, wait);

	}

	@Test(testName = "CourseLinkActive", priority = 1, description = "Verify that course link is working or not!")
	public void courseLinkTest() {
		// coursepage = homepage.navigateToCoursePage();
		Assert.assertTrue(coursepage.isClassroomCultureText());

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
		// System.out.println("3");
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
		// System.out.println("4");
		Assert.assertTrue(coursepage.isClassrommCulture());
	}

	@Test(testName = "Categories Test", priority = 5, description = "Verify that Classroom Instruction working or not!")
	public void ClassroomInstruction() {
		// System.out.println("5");
		Assert.assertTrue(coursepage.isClassroomInstruction());
	}

	@Test(testName = "Categories Test", priority = 6, description = "Verify that Schooland Community working or not!")
	public void SchoolandCommunity() {
		// System.out.println("6");
		Assert.assertTrue(coursepage.isSchoolandCommunity());
	}

	@Test(testName = "Categories Test", priority = 7, description = "Verify that SelfDevelopment working or not! ")
	public void SelfDevelopment() {
		Assert.assertTrue(coursepage.isSelfDevelopment());
	}

	@Test(testName = "Categories Test", priority = 8, description = "Verify that  Student Leadership working or not!")
	public void StudentLeadership() {
		Assert.assertTrue(coursepage.isStudentLeadership());
	}

	@Test(testName = "Categories Test", priority = 9, description = "Verify that Subject Instruction working or not!")
	public void SubjectInstruction() {
		// System.out.println("9");
		Assert.assertTrue(coursepage.isSubjectInstruction());
	}

	@Test(testName = "Categories Test", priority = 10, description = "Verify that TheEducationLandscape working or not!")
	public void TheEducationLandscape() throws InterruptedException {
		// System.out.println("10");
		Assert.assertTrue(coursepage.isTheEducationLandscape());
	}

	@Test(testName = "Levels Test", priority = 11, description = "Verify that Level-I filter working or not!")
	public void CourseLevel_I() throws InterruptedException {
		// System.out.println("11");
		Assert.assertTrue(coursepage.isLevelOne());
	}

	@Test(testName = "Levels Test", priority = 12, description = "Verify that Level-II filter working or not!")
	public void CourseLevel_II() throws InterruptedException {
		// System.out.println("12");
		Assert.assertTrue(coursepage.isLevelTwo());
	}

	@Test(testName = "Levels Test", priority = 13, description = "Verify that Level-III filter working or not!")
	public void CourseLevel_III() throws InterruptedException {
		// System.out.println("13");
		Assert.assertTrue(coursepage.isLevelThree());
	}

	@Test(testName = "Search Box Test", priority = 14, enabled = true, description = "Verify that search box is working or not!")
	public void TC_courseSearchBox() throws InterruptedException, IOException {
		String actualLink = coursepage.searchBox(Utils.readProperty(file, "search_course"));
		Assert.assertTrue(actualLink.contains(Utils.readProperty(file, "course_search_result")));

	}

	@Test(testName = "Click on course pop up", priority = 15, description = "Verify that user is able to click on course or not!")
	public void clickOnCourse() throws InterruptedException {
		Assert.assertTrue(coursepage.clickOnCourse());

	}

	@Test(testName = "Click on View course", priority = 16, description = "Verify that user is able to click on popUp viewcourse or not!")
	public void clikOnPopUpViewCourse() throws InterruptedException {
		Assert.assertTrue(coursepage.popUpViewCourse());

	}

	@Test(testName = "Click on Register Now (Course page)", priority = 17, description = "Verify that Non-Register user is able to click on Register Now Button or not!")
	public void clikOnRegisterNow() {
		coursepage.clickOnRegsbutton();
		regs = new RegisterPage(driver, wait);
		Assert.assertTrue(regs.ValidateRegisterPage());

	}

	@Test(testName = "Sign Up to enrol the course", priority = 18, description = "Verify that Non-Register user is able to click on Register Now Button or not!")
	public void courseRegisterPage() {
		profile = regs.RegistrationProcess("SampleUser48", "SampleUser48@gmail.com", "edx");
		// Assert.assertTrue(regs.ValidateRegisterPage());
	}

	@Test(testName = "Custom registration detail", priority = 19, description = "Verify that Non-Register user is able to click on Register Now Button or not!")
	public void course_CustomRegisterPage() {
		coursepage = profile.custom_RegistationStepsCourse("Sample User 46", "Female", "2020", "Associate degree",
				"Noida", "Sky");
		// Assert.assertTrue(regs.ValidateRegisterPage());
	}

	@Test(testName = "click on View course after sign In/Up", priority = 20, description = "Verify that Sign In/Register user is able to click on view course button or not!")
	public void viewCourseSignInUser() {
		String courseName = coursepage.viewCourse();
		Assert.assertEquals(courseName, courseName);
	}

	// @AfterSuite
	@AfterClass
	public void tearDown() {
		coursepage.closeBrowser();

	}

}
