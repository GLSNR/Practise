package testNGscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.ScreenshotUtility;
import testScripts.RetryAnalyzer;

public class ExtentReportsGeneration {
	
	
	//Note: extent report file is stored in test-outputs folder. Named as: Spark.html
	
	WebDriver driver;
	ExtentReports reports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
	
	@BeforeTest
	public void setupExtent() {
		reports = new ExtentReports();
		spark = new ExtentSparkReporter("test-output/Spark.html")
				.viewConfigurer()
				.viewOrder()
				.as(new ViewName[] {
						ViewName.DASHBOARD,
						ViewName.TEST,
						ViewName.AUTHOR,
						ViewName.DEVICE,
						ViewName.EXCEPTION
				}).apply();
		reports.attachReporter(spark);
	}
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	

	//retryAnalyzer will run this failed test for 3 times for better confirmation.
	//RetryAnalzer.class file is in: testScripts/RetryAnalzer.java
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void javaSearchTest() {
		
		
		extentTest = reports.createTest("Java Search Test");
		
		driver.navigate().to("https://www.google.com/");

		WebElement sBox = driver.findElement(By.cssSelector("[name='a']"));
		sBox.sendKeys("Java Tutorial");
		sBox.sendKeys(Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Title..." + title);

	}

	@Test

	public void AppiumTest() {
		
		extentTest = reports.createTest("Appium Search Test");
		driver.navigate().to("https://www.google.com/");

		WebElement sBox = driver.findElement(By.cssSelector("[name='q']"));
		sBox.sendKeys("Appium Tutorial");
		sBox.sendKeys(Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("Title..." + title);

	}

	

	
	
	@AfterTest
	public void finishExtent() {
		reports.flush();
	}
	
	@AfterMethod
	public void teardown(ITestResult result)
	{
		extentTest.assignAuthor("AutomationTester1")
		.assignCategory("RegressionTest")
		.assignDevice(System.getProperty("os.name"))
		.assignDevice(System.getProperty("os.version"));
		
		if(ITestResult.FAILURE == result.getStatus()) {
			extentTest.log(Status.FAIL, result.getThrowable().getMessage());
			String path = ScreenshotUtility.getScreenshotPath(driver);
			extentTest.fail(MediaEntityBuilder
					.createScreenCaptureFromPath(path).build());
		}
		//driver.close();
	}
}
