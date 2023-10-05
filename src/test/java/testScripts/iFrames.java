package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//Printing the page title
		System.out.println(driver.findElement(By.tagName("label")).getText());
		
		//Frames can be handled in three ways:
		//1. driver.switchTo().frame(Id)
		//2. driver.switchto().frame(name)
		//3. 
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Friend");
		
		//shifting contol from frame 1 to frame3
		//driver.switchTo().frame("frame3");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		
	    //frame3 to frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello I am Updated");
		
		//from frame1 to main page
		//defaultContent() is the method, which will bring the control to main page.
		driver.switchTo().defaultContent();
		
		//from main window to frame2
		driver.switchTo().frame(1);
		Select dropDown= new Select(driver.findElement(By.id("animals")));
		dropDown.selectByIndex(1);
		
		
		
		
		
		

	}

}
