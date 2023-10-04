package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get list of employee in sanfrancio and print thier names.(Home Work)
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		WebElement salary= driver.findElement(By.xpath("//td[text()='C. Marshall']//following-sibling::td[5])"));

	}

}
