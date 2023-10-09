package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Synchronization Example
		// Task1 -> Produce some text
		// Task2 -> Print this text
		// Task2 will wait until it get the text from task1

		// Def: Synchronization refers to the idea that the speed of your automated test
		// should coincide with the speed of the application under test.
		// 2 Types:
		// ->Unconditional Synchronization: Thread.sleep();
		// ->conditional Synchronization: ImplicitWait(), ExplicitWait().

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");

		WebElement sBox = driver.findElement(By.cssSelector("[name='q']"));
		sBox.sendKeys("Java Tutorial");
		List<WebElement> items= driver.findElements(By.xpath("//li[@role='presentation']"));
		
		System.out.println(items.size());
		
		for(int i=0;i<items.size();i++)
		{
			System.out.println(items.get(i).getText());
		}

	}

}
