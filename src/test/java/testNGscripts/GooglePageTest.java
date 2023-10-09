package testNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {
  @Test
  public void javaSearchTest() {
	  
	  System.out.println("Test");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.google.com/");
		
		WebElement sBox= driver.findElement(By.cssSelector("[name='q']"));
		sBox.sendKeys("Java Tutorial");
		sBox.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.println("Title..."+title);
	  
  }
}
