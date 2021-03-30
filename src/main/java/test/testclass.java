package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) {

		System.setProperty("webdriver,chrome,driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging-lms.firki.co/register");
		// WebElement we=driver.findElement(By.xpath("//input[@id=\"username_reg\"]"));
		// we.sendKeys("nishant");
		WebElement we = driver.findElement(By.id("terms_of_service"));

		// xpath("//input[@id=\"terms_of_service\"]"));
		// if (!we.isSelected()) {
		we.click();

		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {
			System.out.println(windows.size());
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
			}
		}

		// }

	}

}
