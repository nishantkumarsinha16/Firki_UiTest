package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver,chrome,driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging-lms.firki.co/courses");
//		WebElement e = driver.findElement(By.id("course_hover"));
//		e.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		WebElement e1 = driver.findElement(By.xpath("//span[@id=\"categories_id\"][@data-pk=\"The Education Landscape\"]"));

		//WebElement e1 = driver.findElement(By.xpath("//span[@id="levels_id"][@data-pk="Level-1"]"));
		// WebElement e = driver.findElement(By.xpath("//span[@title=\"Level-1\"]"));
		e1.click();
	}

}
