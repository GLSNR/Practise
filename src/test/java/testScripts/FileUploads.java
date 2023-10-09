package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		WebElement addFile = driver.findElement(By.xpath("//input[@name='files[]']"));
		
		//user.dir--> project directory location
		String filePath = System.getProperty("user.dir")+"//SampleImg1.jpg";
		addFile.sendKeys(filePath);
		
		driver.findElement(By.xpath("//span[text()='Start upload']")).click();
		

	}

}
