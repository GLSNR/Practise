package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		driver.findElement(By.partialLinkText("Selenium")).click();

	}

}
