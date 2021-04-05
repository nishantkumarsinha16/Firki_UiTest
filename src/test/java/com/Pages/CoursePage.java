package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoursePage extends Base implements iCoursePageLocator {

	public CoursePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public boolean isClassroomCultureText() {
		System.out.println("Course page");
		return isElementPresent(classroomCultureTextLocator);
	}



	public int selectLanguageFilter() {
		clickOn(courseLanguageDropdownLocator);
		int count = countofElement(courseLanguageLocator);
		if (count > 7) {
			clickOn(courseLanguageDropdownLocator);
		}
		return count;
	}

	public String[] chooseLanguage() {
		String[] lang = { "English", "Hindi", "Kannada", "Marathi", "Tamil", "Telugu" };
		String[] texts = { "", "", "", "", "", "", };
		for (int i = 0; i < lang.length; i++) {
			clickOn(courseLanguageDropdownLocator);
			texts[i] = dropDownOption(courseLanguageLocator, lang[i]);
			clickOn(courseFilterClearButtonLocator);
		}

		return texts;
	}

	/*
	 * In this code element click on filter and count the curse present in the
	 * filter and match with given number which is in test case page public int
	 * classrommCulture() throws InterruptedException {
	 * clickOn(classrommCultureFilterLocator); Thread.sleep(3000); int
	 * classroomCulturecount = countofElement(courseCategoriesCountLocator);
	 * System.out.println("CLASSROOM CULTURE COUNT: " + classroomCulturecount);//
	 * return classroomCulturecount; }
	 */

	public boolean isClassrommCulture() {
		clickOn(classrommCultureFilterLocator);
		return isElementPresent(courseCategoriesCountLocator);

	}

	public boolean isClassroomInstruction() {
		clickOn(classroomInstructionFilterLocator);
		return isElementPresent(courseCategoriesCountLocator);

	}

	public boolean isSchoolandCommunity() {
		clickOn(schoolandCommunityFilterLocator);
		return isElementPresent(courseCategoriesCountLocator);
	}

	public boolean isSelfDevelopment() {
		clickOn(selfDevelopmentFilterLocator);
		return isElementPresent(courseCategoriesCountLocator);
	}

	public boolean isStudentLeadership() {
		clickOn(studentLeadershipFilterLocator);
		return isElementPresent(courseCategoriesCountLocator);
	}

	public boolean isSubjectInstruction() {
		clickOn(subjectInstructionFilterLocator);
		return isElementPresent(courseCategoriesCountLocator);
	}

	public boolean isTheEducationLandscape() throws InterruptedException {
		clickOn(TheEducationLandscapeFilterLocator);
		boolean bool = isElementPresent(courseCategoriesCountLocator);
		if (bool == true) {
			clickOn(TheEducationLandscapeFilterLocator);
		} else {
			System.out.println("Element is not present so button action fail");
		}
		return bool;

	}

	// js.executeScript("scroll(250, 0)"); // if the element is on top.
	// js.executeScript("scroll(0, 100)"); // if the element is on bottom.
	public boolean isLevelOne() throws InterruptedException {
		scrollDown(100);
		clickOn(levelOneFilter);
		return isElementPresent(countOfLevelOneFilter);
	}

	public boolean isLevelTwo() throws InterruptedException {
		clickOn(levelTwoFilter);
		return isElementPresent(countOfLevelTwoFilter);
	}

	public boolean isLevelThree() throws InterruptedException {
		scrollDown(200);
		clickOn(levelThreeFilter);
		boolean bool = isElementPresent(countOfLevelThreeFilter);
		if (bool == true)
			clickOn(levelThreeFilter);
		else {
			System.out.println("Unable to click on the Level-3 filter");
		}
		return bool;
	}

	public String searchBox(String topic) {
		enterText(topic, searchBoxLocatot);
		pressEnter(searchBoxLocatot);
		String text = getLinkRef(searchCourseLocator);
		return text;

	}

	public boolean clickOnCourse() {
		clickOn(module2CourseLocator);
		return isElementPresent(verifyModule2Locator);// सहनियंत्रण आणि मूल्यमापन #Module2

	}

	public boolean popUpViewCourse() {
		clickOn(popUpViewCourseLocator);
		return isElementPresent(courseRegisterNowLocator);
	}

	public RegisterPage clickOnRegsbutton() {
		clickOn(courseRegisterNowLocator);
		//isElementPresent(signUpTextLocator);
		return new RegisterPage(driver, wait);
		
		//return isElementPresent(signUpTextLocator);

	}

}
