package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		driver.manage().window().maximize();
		
		WebElement host= driver.findElement(By.cssSelector("#shadow_host"));
		SearchContext shadowRoot = host.getShadowRoot();
		String txt = shadowRoot.findElement(By.cssSelector("#shadow_content")).getText();
		System.out.println(txt);
		

	}

}
