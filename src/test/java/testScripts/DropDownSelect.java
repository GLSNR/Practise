package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		Select singleSelect = new Select(driver.findElement(By.id("select-demo")));
		singleSelect.selectByValue("Wednesday");
		
		Select multiSelect = new Select(driver.findElement(By.id("multi-select")));
		multiSelect.selectByIndex(0);
		multiSelect.selectByValue("New York");
		multiSelect.selectByVisibleText("Texas");
		List<WebElement> items = multiSelect.getAllSelectedOptions();
		System.out.println("Selected options...."+items.size());
		multiSelect.deselectByIndex(0);
		

	}

}
