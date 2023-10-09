package testScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		//While using the java script executor, before writing in script we have
		//check the script code in the browser console.

		//for returning the page title
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String title=(String)js.executeScript("return document.title");
		
		System.out.println("Page Title..."+title);
		
		//for identifying the search box
		WebElement searchBox= (WebElement)js.executeScript("return  document.getElementsByName('search')[0]");
		searchBox.sendKeys("Phone");
		
		//for page scrolling
		js.executeScript("window.scrollBy(10, 600)");
		
		
		//Navigating to another page
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		//Entering the date in calender
		js.executeScript("document.querySelector('#datepicker1').value='06/10/23'");
		

	}

}
