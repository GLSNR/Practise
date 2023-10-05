package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithAnnotationDefaultValue;

public class WebTableTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//get list of employee in sanfrancio and print thier names.(Home Work)
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		//System.out.println(driver.findElement(By.xpath("//td[text()='C. Marshall']//following-sibling::td[5])")));
		
		//Relative Locator
		String loc=driver.findElement(By.tagName("td")).toRightOf(By.xpath("//td[contains(text(), 'B. Wagner')]").getText());
		
		

	}

}
