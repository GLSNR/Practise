package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement chkbox= driver.findElement(By.id("isAgeSelected"));
		
		if(chkbox.isSelected())
		{
			//tounselect
			chkbox.click();
		}
		else
		{
			//toselect
			chkbox.click();
		}

	}

}
