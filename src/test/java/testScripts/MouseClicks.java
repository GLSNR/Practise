package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//To perform mouse over actions we have to invoke Actions class 
		//Differce between build() and perform()
		//perfrom()--> If there is only one mouse action we have to use perfrom.
		//build()--> If there are multiple mouse actions we have to use build.
		
		Actions a=new Actions(driver);
		WebElement btn= driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
		//btn.click();
		a.doubleClick(btn).doubleClick(btn).perform();

	}

}
