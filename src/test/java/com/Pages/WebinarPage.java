package com.Pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.ReadUtility.Utils;

import com.Loactors.iFilePath;

public class WebinarPage extends Base implements iFilePath {

	By topicFilterLocator = By.xpath("//div[@id=\"topics\"]//span");
	By speakersFilterLocator = By.xpath("//div[@id=\"speakers\"]//span");
	By searchBoxFilterLocator = By.id("myInput");
	By getTopicTilteNameLocator = By.xpath("//div[@class=\"removeConnt mobileMargin\"]//a//h1");
	By clickOnWebinarContent = By.xpath("//div[@id=\"webinar_search\"]");
	By getTopicNameLocator = By.xpath("//div[@class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 mx-xs-clear\"]//h1");
	By switchToDiscussionLocator = By.xpath("//li[@id=\"tab2\"]");
	By postMessageLocator = By.id("post_message");
	By sendButtonLocator = By.xpath("//div[@title=\"Send\"]");
	By getDiscussionMessageLocator = By.xpath("//div[@class=\"col-md-12 post-message\"]//p");

	public WebinarPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public String validateTopicFilter() {
		String getListOfTopic = "";
		// int count = countofElement(topicLocator);
		scrollDown(200);
		List<String> data = getListOfElement(topicFilterLocator); // iterate all the element and print the element.
		for (int i = 0; i < data.size(); i++) {
			// topicList = data.get(i);
			getListOfTopic += filterOption(topicFilterLocator, data.get(i));
		}
		clickOn(topicFilterLocator);
		// System.out.println(printTopic_List);
		return getListOfTopic;

	}

	public String validateSpeakersFilter() {
		String getListOfSpeaker = "";
		scrollDown(300);
		List<String> data = getListOfElement(speakersFilterLocator);
		// System.out.println(data.size());
		for (int i = 0; i < data.size(); i++) {
			// for(String i:data) {
			getListOfSpeaker += filterOption(speakersFilterLocator, data.get(i));

		}

		clickOn(speakersFilterLocator);
		clickOn(speakersFilterLocator);
		return getListOfSpeaker;

	}

	public String verifySearchFilter() throws IOException {

		String text = Utils.readProperty(file, "search_webinar");
		enterText(text, searchBoxFilterLocator);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pressEnter(searchBoxFilterLocator);
		String value = getAttribute(getTopicTilteNameLocator, "title");
		return value;

	}

	public SignInPage webinarTopic() throws InterruptedException {
		clickOn(clickOnWebinarContent);
		return new SignInPage(driver, wait);
	}

	public String getTopicName() {
		String name = getText(getTopicNameLocator);
		return name;
	}

	public String discussionTab() throws IOException {
		String data = "";
		scrollDown(500);
		clickOn(switchToDiscussionLocator);
		enterText(Utils.readProperty(file, "post_message"), postMessageLocator);
		clickOn(sendButtonLocator);
		refresh();
		clickOn(switchToDiscussionLocator);
		List<String> text = getListOfElement(getDiscussionMessageLocator);
		for (int i = 0; i < text.size(); i++) {
			data = text.get(i);
			// System.out.println("message: " + data);
		}
		return data;
	}
}
