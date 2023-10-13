package remoteScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteExecutionTest {
	RemoteWebDriver driver;
  @Test
  public void javaSearchTest() {
	  ChromeOptions options = new ChromeOptions();
	  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  String strHub = "http://192.168";
	 driver = new ChromeDriver(options);
	 
	 
	  
  }
}
