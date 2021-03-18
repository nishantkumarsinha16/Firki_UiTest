package com.Test.Ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;
	public static WebDriverWait wait;
	private static String URL = "https://staging-lms.firki.co/";

	public void start() {
		runLocal();		
		wait = new WebDriverWait(driver, 30, 1000);
		//wait = new WebDriverWait(driver, 30);
		driver.get(URL);
		driver.manage().window().maximize();
		

	}

	public void runLocal() {

		if (driver == null) {
			System.setProperty("webdriver,chrome,driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
			driver = new ChromeDriver();
			//driver.manage().window().maximize();			

		}
	}
	protected void refresh() {
		driver.navigate().refresh();
		
	}

}
