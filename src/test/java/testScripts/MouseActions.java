package testScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		Actions action=new Actions(driver);
		
		WebElement searchBox= driver.findElement(By.name("search"));
		
		//contextClick----> performing right click
		action.contextClick(searchBox).perform();
		
		
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
		
		WebElement menuitem= driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Monitors (2)')]"));
		
		action.moveToElement(menu).click(menuitem).build().perform();
		
		
		//Taking Screenshot
		
		TakesScreenshot screen= (TakesScreenshot)driver;
		File src= screen.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir") + "/screenshots/FullScreenImg.png";
		FileUtils.copyFile(src, new File(path));
		
		Thread.sleep(2000);
		WebElement image=driver.findElement(By.cssSelector("div.product-thumb"));
		action.scrollToElement(image).build().perform();
		action.scrollByAmount(10, 400).perform();
		File src1= image.getScreenshotAs(OutputType.FILE);
		String path1=System.getProperty("user.dir") + "/screenshots/ImageScreenImg.png";
		FileUtils.copyFile(src1, new File(path1));
		
		
		
		

	}

}
