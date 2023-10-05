package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpWindows {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		
		//Simple Alert
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert simpAlert= driver.switchTo().alert();
		System.out.println(simpAlert.getText());
		simpAlert.accept();
		
		//Confirm Box Alert
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Alert confAlert= driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(confAlert.getText());
		confAlert.dismiss();
		
		//prompt alert
		driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]")).click();
		Alert promAlert= driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(promAlert.getText());
		promAlert.accept();
		
		

	}

}
