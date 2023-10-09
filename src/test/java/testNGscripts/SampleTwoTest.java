package testNGscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTwoTest {
	
	WebDriver driver = new ChromeDriver();
	
  @Test
  public void cucumberSearchTest() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertEquals(driver.getTitle(), "Google Page");
	  WebElement srcBox = driver.findElement(By.className("gLFyf"));
	  srcBox.sendKeys("Cucumber Tutorial");
	  srcBox.submit();
	  softAssert.assertEquals(driver.getTitle(), "Cucumber Tutorial");
	  driver.close();
	  softAssert.assertAll();
  }
}
