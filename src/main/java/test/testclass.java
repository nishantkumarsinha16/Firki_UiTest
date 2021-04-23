package test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {
	public static void main(String[] args) throws IOException, InterruptedException {
		// final WebDriver driver;
		// System.setProperty("webdriver,chrome,driver", System.getProperty("user.dir")
		// + "/driver/chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
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
		// driver.navigate().to("https://staging-lms.firki.co/courses/course-v1:Assessments+AS102+2016_T2/about");

		driver.navigate().to("https://staging-lms.firki.co/resources/");
		Thread.sleep(1000);
//
		WebElement button = driver.findElement(By.xpath("//div[@class=\"dx-texteditor-buttons-container\"]"));
		button.click();
//		Thread.sleep(5000);
//		driver.switchTo().frame("atssh997");
//
//		// driver.switchTo().frame("_atssh532");
//		List<WebElement> list = driver.findElements(By.xpath(
//				"//div[@id=\"dx-b84c1127-bf25-dda2-206a-8c5c6263db1c\"] | //div[@class=\"dx-item dx-list-item\"]//span"));
//		System.out.println(list.size());
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("*[@class=\"dx-scrollable-scroll-content\"]|//*[@id=\"dx-f348403b-ce56-b82b-8b36-da5dfe025cba\"]"));
				//(By.xpath("*[@class=\"dx-scrollable-scroll-content\"]| //div[text() = \"Others\"]"));
		// element.click();
		//Actions act = new Actions(driver);
		//act.moveToElement(element).perform();

//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", element);

		 EventFiringWebDriver event = new EventFiringWebDriver(driver);
		 event.executeScript("document.querySelector('div[class=\"dx-item dx-list-item\"]').scrollTop=200");

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// List<WebElement> element =
		// driver.findElements(By.xpath("//div[@class=\"Select Subjects\"] |
		// //*[text()='Others']"));
		// js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

//		WebElement enrolNow = driver.findElement(By.linkText("Enrol Now!"));
//		WebElement viewCourse = driver.findElement(By.linkText("View Course"));
//		try {
//			WebElement enrolNow = driver.findElement(By.xpath("//a[@id=\"analytics_register\"]"));
//			enrolNow.click();
//		}
//		catch(Exception e) {
//			WebElement viewCourse = driver.findElement(By.xpath("//a[@id=\"analytics_about\"]"));
//			viewCourse.click();
//		}
//
//		Thread.sleep(1000);
//		
//		WebElement getText = driver.findElement(By.xpath("//div[@class=\"tfi-course-info-header\"]"));
//		String text=getText.getText();
//		System.out.println(text);

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
