package com.Loactors;

import org.openqa.selenium.By;

public interface iResourcePage {

	// Resource page Action Locator

	By resourcePageLocator = By.xpath("//div[@class=\"s-header__logo\"]//a[4]");
	By resourceCountTitleLocator = By.id("count_resources");

	// Subject filter Locator----------------------------------------------------
	By artFilterLocator = By.xpath("//div[text()=\"Art\"]");
	// Xpath having space
	By CommunityWellnessFilterLocator = By
			.xpath("//div[normalize-space()=\"Community Wellness Online Teaching and Learning\"]//div[2]");
	By ComputerScienceFilterLocator = By.xpath("//div[text()=\"Computer Science\"]");
	By EnglishFilterLocator = By.xpath("//div[text()=\"English\"]");
	By GeneralPedagogyFilterLocator = By.xpath("//div[text()=\"General Pedagogy\"]");
	By HindiFilterLocator = By.xpath("//div[text()=\"Hindi\"]");
	By IntegrativeArtFilterLocator = By.xpath("//div[text()=\"Integrative Art\"]");
	By MathFilterLocator = By.xpath("//div[text()='Math' and @class='dx-item-content dx-list-item-content']");
	By OnlineTeachingandFilterLocator = By.xpath("//div[text()=\"Online Teaching and Learning\"]");
	By OnlineTeachingandqAndArtFilterLocator = By
			.xpath("//div[normalize-space()='Online Teaching and Learning Integrative Art']//div[2]");
	By OthersFilterLocator = By.xpath("//div[text()=\"Others\"]");
	By ScienceFilterLocator = By.xpath("//div[text()=\"Science\"]");
	By SocialSciencesFilterLocator = By.xpath("//div[text()=\"Social Sciences\"]");
	By WellbeingFilterLocator = By.xpath("//div[text()=\"Wellbeing\"]");
	// ----Action-------Subject filter------------------------------------//
	By resourceCountLocator = By.xpath("//div[@id='count']");
	By scrollEND = By.xpath("//div[text()=\"Wellbeing\"]");
	By scrollMiddle = By.xpath("//div[text()=\"Others\"]");
	By subjectOpenFilterLocator = By.xpath("//div[@class=\"dx-texteditor-buttons-container\"]");
	By okButtonLocator = By.xpath("//div[@class=\"dx-item dx-toolbar-item dx-toolbar-button\"]//span");
	By clearButtonLocator = By.xpath("//div[@class=\"dx-tag-remove-button\"]");
	By selectAllButtonLocator = By.xpath("//div[text()='Select All'] ");

	// Grade Filter------------------------------------------------
	By gradeOneLocator = By.xpath("//div[text()='I']");
	By gradeTwoLocator = By.xpath("//div[text()='II']");
	By gradeThreeLocator = By.xpath("//div[text()='III']");
	By gradeFourLocator = By.xpath("//div[text()='IV']");
	By gradeFiveLocator = By.xpath("//div[text()='V']");
	By gradeSixLocator = By.xpath("//div[text()='VI']");
	By gradeSevenLocator = By.xpath("//div[text()='VII']");
	By gradeEightLocator = By.xpath("//div[text()='VIII']");
	By gradeNineLocator = By.xpath("//div[text()='IX']");
	By gradeTenLocator = By.xpath("//div[text()='X']");
	By gradeElevenLocator = By.xpath("//div[text()='XI']");
	By gradeTwelvLocator = By.xpath("//div[text()='XII']");
	// Action Button---------------------------------------------
	By gradeOpenFilterLocator = By.xpath("//div[@data-dx_placeholder='Select Grades']/..");

	// Type of Resource
	By articleLocator = By.xpath("//div[text()='Article']");
	By contentAndClassroomVideosLocator = By.xpath("//div[text()='Content and Classroom Videos']");
	By LessonPlanLocator = By.xpath("//div[text()='Lesson Plan']");
	By OtherLocator = By.xpath("//div[text()='Other'and @class='dx-item-content dx-list-item-content']");
	By WorksheetAssessmentLocator = By.xpath("//div[text()='Worksheet/Assessment']");

	// Action Button---------------------------------------------
	By resourceOpenFilterLocator = By.xpath("//div[@data-dx_placeholder='Select Resources']/..");

	// Partner Filter---------------------------------------------

	By akankshaFoundationLocator = By.xpath("//div[text()='Akanksha Foundation']");
	By ankitaGuptaLocator = By.xpath("//div[text()='Ankita Gupta']");
	By ASBLocator = By.xpath("//div[text()='ASB']");
	By britishCouncilLocator = By.xpath("//div[text()='British Council']");
	By codeToEnhanceLearningLocator = By.xpath("//div[text()='Code To Enhance Learning']");
	By fosterandForgeLocator = By.xpath("//div[text()='Foster & Forge']");
	By khanAcademyLocator = By.xpath("//div[text()='Khan Academy']");
	By lifeLabLocator = By.xpath("//div[text()='Life-Lab']");
	By godrejFoundationforEducationLocator = By.xpath("//div[text()='N. Godrej Foundation for Education']");
	By shreyaSachdevLocator = By.xpath("//div[text()='Shreya Sachdev']");
	By simpleEducationFoundationLocator = By.xpath("//div[text()='Simple Education Foundation']");
	By slamOutLoudLocator = By.xpath("//div[text()='Slam Out Loud']");
	By smallScienceLocator = By.xpath("//div[text()='Small Science (HBCSE)']");
	By storyWeaverLocator = By.xpath("//div[text()='StoryWeaver']");
	By teachForIndiaLocator = By.xpath("//div[text()='Teach For India']");
	By theAkankshaFoundationLocator = By.xpath("//div[text()='The Akanksha Foundation']");
	By theApprenticeProjectLocator = By.xpath("//div[text()='The Apprentice Project']");
	By tickLinksLocator = By.xpath("//div[text()='tickLinks']");
	By trikonLocator = By.xpath("//div[text()='Trikon']");
	By vidyodayaMathsandScienceResourceCentreLocator = By
			.xpath("//div[text()='Vidyodaya Maths and Science Resource Centre']");
	By vMSRCLocator = By.xpath("//div[text()='VMSRC']");
	By wikiHowLocator = By.xpath("//div[text()='wikiHow']");

	// Action Filter------------------------------------------------------------

	By partnerOpenFilterLocator = By.xpath("//div[@data-dx_placeholder='Select Partners']/..");

}
