package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		
		String parentWindown= driver.getWindowHandle();
		System.out.println("Parent Window Handle...."+ parentWindown);
		driver.findElement(By.xpath("//button[contains(text(), 'new Tab')]")).click();
		
		
		Set<String> tabs= driver.getWindowHandles();
		System.out.println("No of windows..."+ tabs.size());
		
		for(String newWin: tabs)
		{
			if(!newWin.equalsIgnoreCase(parentWindown))
			{
				driver.switchTo().window(newWin);
				driver.findElement(By.cssSelector("ul#primary-menu > li:nth-child(2)")).click();
			}
		}
		
		driver.close();
		
		driver.switchTo().window(parentWindown);
		
		driver.findElement(By.xpath("//button[contains(text(),  'Click to open new Window')] ")).click();
		
		
		//Selenium 4.0 new methods on window handlings
		//Switching into new tab.
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.selenium.dev/");
		
		
		//Opening a new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.selenium.dev/");
		
		

	}

}
