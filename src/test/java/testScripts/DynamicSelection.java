package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSelection{

	public static void main(String[] args) throws Exception{ 
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium Maven");
		
		Thread.sleep(5000);
		
		List<WebElement> items= driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li//descendant::div[@class='InnVSe']"));
		
		
		
		System.out.println(items.size());
		

	}

}
