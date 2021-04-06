package com.Pages;

import org.openqa.selenium.By;

public interface iCoursePageLocator {
	By classroomCultureTextLocator = By
			.xpath("//h3[@class=\"text_capitalize\" and contains(text(),'Classroom Culture')]");
	By courseLanguageLocator = By.xpath("//div[@class=\"dx-scrollview-content\"]/div");
	By courseLanguageDropdownLocator = By.id("lang_drpdwn");
	By courseFilterClearButtonLocator = By.xpath("//span[@class=\"dx-icon dx-icon-clear\"]");
	By courseCategoriesCountLocator = By.xpath("//div[@class=\"video-list-slider\"]/a");
//Categories Locator
	By classrommCultureFilterLocator = By.xpath("//span[@data-pk=\"Classroom Culture\"]");
	By classroomInstructionFilterLocator = By.xpath("//span[@data-pk=\"Classroom Instruction\"]");
	By schoolandCommunityFilterLocator = By.xpath("//span[@data-pk=\"School and Community\"]");
	By selfDevelopmentFilterLocator = By.xpath("//span[@data-pk=\"Self Development\"]");
	By studentLeadershipFilterLocator = By.xpath("//span[@data-pk=\"Student Leadership\"]");
	By subjectInstructionFilterLocator = By.xpath("//span[@data-pk=\"Subject Instruction\"]");
	By TheEducationLandscapeFilterLocator = By.xpath("//span[@data-pk=\"The Education Landscape\"]");
//Level Filter
	By countOfLevelOneFilter = By.xpath("//div[@class=\"level_dis\"]/span[contains(text(),'Level-1')]");
	By countOfLevelTwoFilter = By.xpath("//div[@class=\"level_dis\"]/span[contains(text(),'Level-2')]");
	By countOfLevelThreeFilter = By.xpath("//div[@class=\"level_dis\"]/span[contains(text(),'Level-3')]");
	By levelOneFilter = By.xpath("//span[@id=\"levels_id\" and @title=\"Level-1\"]");
	By levelTwoFilter = By.xpath("//span[@id=\"levels_id\" and @title=\"Level-2\"]");
	By levelThreeFilter = By.xpath("//span[@id=\"levels_id\" and @title=\"Level-3\"]");
//	Search box
	By searchBoxLocatot = By.id("discovery-input");
	By searchCourseLocator = By.xpath("//a[@data-pk=\"course-v1:LeadershipForEquity+LFE112+2020_ME2\"]");
// Pop Up
	By module2CourseLocator = By.xpath("//a[@data-pk=\"course-v1:LeadershipForEquity+LFE112+2020_ME2\"]");
	By verifyModule2Locator = By
			.xpath("//h4[@class=\"drop-title\" or contains(text(),'सहनियंत्रण आणि मूल्यमापन #Module2')]");
	By popUpViewCourseLocator=By.xpath("//a[@id=\"analytics_course\"]");
	By courseRegisterNowLocator=By.xpath("//a[@id=\"analytics_register\"]");
	By signUpTextLocator = By.xpath("//h3[contains(text(),'Sign Up')]");
	By enrolNowLocator=By.xpath("//a[@id=\"analytics_register\"]");
	By viewCourseLocator=By.xpath("//a[@id=\"analytics_about\"]");
	By getTextTeachForIndiaLocator=By.xpath("//div[@class=\"tfi-course-info-header\"]");
			
	

	

}
