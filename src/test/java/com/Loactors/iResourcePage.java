package com.Loactors;

import org.openqa.selenium.By;

public interface iResourcePage {

	By resource_Locator = By.xpath("//div[@class=\"s-header__logo\"]//a[4]");
	By count_Resource = By.id("count_resources");
	By select_subjectFilterLocator = By.xpath("//div[@class=\"dx-texteditor-buttons-container\"]");
	//#This locator count the subject
//	By subjectFilterLocator = By.xpath(
		//	"//div[@id=\"dx-b84c1127-bf25-dda2-206a-8c5c6263db1c\"] | //div[@class=\"dx-item dx-list-item\"]//span");
	By subjectFilterLocator = By.xpath("//div[@class=\"Select Subjects\"] | //div[@class=\"dx-item dx-list-item\"]//span");
}
 

//*[@id="dx-6acd6ac7-f1ee-cab1-5a6d-a1cddf6dee24"]/div[1]/div/div[1]/div[2]/div[2]