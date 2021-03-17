package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoursePage extends Base {

	public CoursePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	protected static By classroomCultureTextLocator = By.className("text_capitalize");
	protected static By courseLanguageLocator = By.xpath("//div[@class=\"dx-scrollview-content\"]/div");
	protected static By courseLanguageDropdownLocator = By.id("lang_drpdwn");
	protected static By courseFilterClearButtonLocator = By.xpath("//span[@class=\"dx-icon dx-icon-clear\"]");
	protected static By courseCategoriesCountLocator = By.xpath("//div[@class=\"video-list-slider\"]/a");
//Categories Locator
	protected static By classrommCultureFilterLocator = By.xpath("//span[@data-pk=\"Classroom Culture\"]");
	protected static By classroomInstructionFilterLocator = By.xpath("//span[@data-pk=\"Classroom Instruction\"]");
	protected static By schoolandCommunityFilterLocator = By.xpath("//span[@data-pk=\"School and Community\"]");
	protected static By selfDevelopmentFilterLocator = By.xpath("//span[@data-pk=\"Self Development\"]");
	protected static By studentLeadershipFilterLocator = By.xpath("//span[@data-pk=\"Student Leadership\"]");
	protected static By subjectInstructionFilterLocator = By.xpath("//span[@data-pk=\"Subject Instruction\"]");
	protected static By TheEducationLandscapeFilterLocator = By.xpath("//span[@data-pk=\"The Education Landscape\"]");
//Level Filter
	protected static By countOfLevelOneFilter = By
			.xpath("//div[@class=\"level_dis\"]/span[contains(text(),'Level-1')]");
	protected static By countOfLevelTwoFilter = By
			.xpath("//div[@class=\"level_dis\"]/span[contains(text(),'Level-2')]");
	protected static By countOfLevelThreeFilter = By
			.xpath("//div[@class=\"level_dis\"]/span[contains(text(),'Level-3')]");
	protected static By levelOneFilter = By.xpath("//span[@id=\"levels_id\" and @title=\"Level-1\"]");
	protected static By levelTwoFilter = By.xpath("//span[@id=\"levels_id\" and @title=\"Level-2\"]");
	protected static By levelThreeFilter = By.xpath("//span[@id=\"levels_id\" and @title=\"Level-3\"]");
	// protected static By scrollDownLocator =
	// By.xpath("//section[@id=\"levels\"]/label");
	// protected static By scrollUpLocator = By.id("lang_drpdwn");

	public boolean isClassroomCultureText() {
		return isElementPresent(classroomCultureTextLocator);

	}

	public int selectLanguageFilter() {
		clickOn(courseLanguageDropdownLocator);
		int count = countofElement(courseLanguageLocator);
		if(count>7) {
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
		return isElementPresent(countOfLevelThreeFilter);
	}

}
