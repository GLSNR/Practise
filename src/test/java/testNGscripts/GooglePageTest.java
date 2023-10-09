package testNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GooglePageTest {

	
	WebDriver driver = new ChromeDriver();
	

	@Test
	public void javaSearchTest() {
		driver.navigate().to("https://www.google.com/");

		WebElement sBox = driver.findElement(By.cssSelector("[name='q']"));
		sBox.sendKeys("Java Tutorial");
		sBox.sendKeys(Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Title..." + title);

	}

	@Test

	public void AppiumTest() {
		driver.navigate().to("https://www.google.com/");

		WebElement sBox = driver.findElement(By.cssSelector("[name='q']"));
		sBox.sendKeys("Appium Tutorial");
		sBox.sendKeys(Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Title..." + title);

	}

	@Test

	public void PythonTest() {
		driver.navigate().to("https://www.google.com/");

		WebElement sBox = driver.findElement(By.cssSelector("[name='q']"));
		sBox.sendKeys("Phthon Tutorial");
		sBox.sendKeys(Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Title..." + title);

	}

	@Test

	public void CypressTest() {
		driver.navigate().to("https://www.google.com/");

		WebElement sBox = driver.findElement(By.cssSelector("[name='q']"));
		sBox.sendKeys("Cypress Tutorial");
		sBox.sendKeys(Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Title..." + title);

	}
}
