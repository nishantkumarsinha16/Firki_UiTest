package test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testclass {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver,chrome,driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://staging-lms.firki.co/login");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sampleuser17@gmail.com");
		// nishantkumarsinha16@gmail.com
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("edx");
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(1000);
		// driver.navigate().to("https://staging-lms.firki.co/courses/course-v1:LeadershipForEquity+LFE112+2020_ME2/about");
		driver.navigate().to("https://staging-lms.firki.co/courses/course-v1:Assessments+AS102+2016_T2/about");
		Thread.sleep(2000);

//		WebElement enrolNow = driver.findElement(By.linkText("Enrol Now!"));
//		WebElement viewCourse = driver.findElement(By.linkText("View Course"));
		try {
			WebElement enrolNow = driver.findElement(By.xpath("//a[@id=\"analytics_register\"]"));
			enrolNow.click();
		}
		catch(Exception e) {
			WebElement viewCourse = driver.findElement(By.xpath("//a[@id=\"analytics_about\"]"));
			viewCourse.click();
		}

		Thread.sleep(1000);
		
		WebElement getText = driver.findElement(By.xpath("//div[@class=\"tfi-course-info-header\"]"));
		String text=getText.getText();
		System.out.println(text);

//
//		WebElement element = driver.findElement(By.xpath("//a[@class=\"dropbtn theme-btn active\"]/label"));
//				//xpath("//li[@class=\"dropdown-new\"]"));
//		Thread.sleep(1000);
//		String text = element.getText();
//		System.out.println(text);

//		WebElement username = driver.findElement(By.xpath("//li[@class=\"dropdown-new\"]"));
//		Actions act = new Actions(driver);
//		act.moveToElement(username).perform();
//
//		List<WebElement> dropdnw = driver.findElements(By.xpath("//div[@class=\"dropdown-content\"]/a"));
//		System.out.println(dropdnw.size());
//
//		for (int i = 0; i < dropdnw.size(); i++) {
//			if (dropdnw.get(i).getText().contains("My Profile")) {
//
//				System.out.println(dropdnw.get(i).getText());
//				dropdnw.get(i).click();
//
//				Thread.sleep(5000);
//				break;
//
//			}
//
//		}

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scroll(0,300)");
//		Thread.sleep(5000);
//		WebElement Sgender = driver.findElement(By.xpath("//select[@id=\"gender\"]"));
//		Sgender.click();
//		Thread.sleep(1000);
//		List<WebElement> gender = driver.findElements(By.xpath("//select[@id=\"gender\"]/option"));
//		System.out.println(gender.size());
//		for (int i = 0; i < gender.size(); i++) {
//			System.out.println(gender.get(i).getText());
//
//			if (gender.get(i).getText().contains("Female")) {
//
//				System.out.println(gender.get(i).getText());
//				Thread.sleep(5000);
//
//				gender.get(i).click();
//				System.out.println(gender.get(i).getText());
//
//				Thread.sleep(7000);
//				break;
//
//			}
//
//		}

		driver.quit();

		/*
		 * String currentWindow = driver.getWindowHandle();
		 * System.out.println(currentWindow); Set<String> windows =
		 * driver.getWindowHandles();
		 * 
		 * for (String window : windows) { System.out.println(windows.size()); if
		 * (!window.equals(currentWindow)) { driver.switchTo().window(window); } }
		 */

	}

}
