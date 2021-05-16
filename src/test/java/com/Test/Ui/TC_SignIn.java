package com.Test.Ui;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Pages.HomePage;
import com.Pages.LandingPage;
import com.Pages.SignInPage;

public class TC_SignIn extends TestBase {
	HomePage homepage;
	SignInPage login;

	@BeforeClass
	public void setup() {
		start();
		homepage = new HomePage(driver, wait);
		login = homepage.navigateToSignInPage();

	}

//using json file
	@Test(testName = "Sign In Page", enabled = false, priority = 01, description = "Verify that user can Sign in sucessfully or not !", dataProviderClass = com.DataProvider.TestDataProvider.class, dataProvider = "dp")
	public void Login_Test(String data) {
		String user[] = data.split(",");
		LandingPage lp = login.SignInProcess(user[0], user[1]);
		Assert.assertEquals(lp.userName(), "nishantkumarsinha16");

	}

//using properties file
	@Test(testName = "sign In page", priority = 02, enabled = true, description = "Verify login test", dataProviderClass = com.DataProvider.TestDataProvider.class, dataProvider = "propFile")
	public void login_Data(String email, String pwd) {
		LandingPage lp = login.SignInProcess(email, pwd);
		Assert.assertEquals(lp.userName(), "nishantkumarsinha16");

	}

	@AfterClass
	public void tearDown() {
		login.closeBrowser();
	}

}