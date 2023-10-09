package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import dev.failsafe.internal.util.Assert;

public class LoginTestUsingTestNG {

	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void setup(String strBrowser) {
		if(strBrowser.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(strBrowser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	@Test
	public void validLoginTest() {

		driver.navigate().to("https://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		//boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		//Assert.assertTrue(isDisp);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
