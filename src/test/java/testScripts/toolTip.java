package testScripts;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		driver.findElement(By.id("age")).sendKeys(Keys.PAGE_DOWN);
		WebElement inputBox= driver.findElement(By.id("age"));
		
		a.moveToElement(inputBox).perform();
		String strTxt = driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
		System.out.println("Str text...."+ strTxt);
		
	}

}
