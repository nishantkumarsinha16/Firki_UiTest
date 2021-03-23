package com.Test.Ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.Pages.CoursePage;
import com.Pages.HomePage;

public class TC_HomePage extends TestBase {

	private HomePage homepage;
	private CoursePage coursepage;

	@BeforeClass
	public void setUp() {
		start();
		 homepage=new HomePage(driver, wait);
		//coursepage=homepage.navigateToCoursePage();
	}

	

	@AfterClass
	public void tearDown() {
		homepage.closeBrowser();

	}

}
