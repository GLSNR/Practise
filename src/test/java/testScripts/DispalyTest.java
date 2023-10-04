package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DispalyTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		Thread.sleep(5000);
		WebElement closeIcon= driver.findElement(By.cssSelector("a[title='Clear text']"));
		System.out.println(closeIcon.isDisplayed());
		if(closeIcon.isDisplayed())
		{
			closeIcon.click();
		}

	}

}
