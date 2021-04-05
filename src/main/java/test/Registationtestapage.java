package test;

import java.io.File;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

public class Registationtestapage {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		System.setProperty("webdriver,chrome,driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		// ChromeOptions op=new ChromeOptions();
		// op.setHeadless(true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://staging-lms.firki.co/register");
		WebElement userName = driver.findElement(By.id("username_reg"));
		userName.sendKeys("mx24");
		WebElement email = driver.findElement(By.id("email_reg"));
		email.sendKeys("mx24@gmail.com");

		WebElement password = driver.findElement(By.id("password_reg"));
		password.sendKeys("edx");

		WebElement tandc = driver.findElement(By.id("terms_of_service"));
		tandc.click();

		WebElement submit = driver.findElement(By.id("register_custom"));
		submit.click();

		/// image/testImage.jpeg
		Thread.sleep(2000);

		String path = System.getProperty("user.dir") + "/image/testImage.jpeg";

		WebElement upload = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		System.out.println(path);
		upload.sendKeys(path);

		// WebElement fileInput =
		// driver.findElement(By.xpath("//span[@class=\"filepicvalue\"]"));
	}

}
