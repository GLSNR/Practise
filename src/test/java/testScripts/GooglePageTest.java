package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		Form Selenium 4.11--> User can intract with any existing browser version to test
//		ChromeOptions options=new ChromeOptions();
//		options.setBrowserVersion("113");
//		WebDriver driver= new ChromeDriver(options);
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
		WebElement sBox= driver.findElement(By.cssSelector("[name='q']"));
		sBox.sendKeys("Java Tutorial");
		sBox.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.println("Title..."+title);
		System.out.println("URL..."+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Tittle..."+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().forward();
		

	}

}
