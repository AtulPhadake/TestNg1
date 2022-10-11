package newpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	
	static ExtentReports report;
	static ExtentTest test;
	static WebDriver driver;
	@BeforeClass
	public void startTest()
	{
		report = new ExtentReports(System.getProperty("user-dir")+"\\Test-output\\MyReport.html");
		
	}
	@Test
	public void verifyPageTitle()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\batul\\Downloads\\chromedriver_win32/chromedriver.exe");
		
	    driver = new ChromeDriver ();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		String Act= driver.getTitle();
		System.out.println(Act);
		driver.close();
		String Exp ="Google";
		Assert.assertEquals(Act,Exp);
		test.log(LogStatus.PASS, "Test case passed");
		
	}
	@AfterMethod
	public void getResulte(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, "Test case Failed"+result.getName());
			test.log(LogStatus.FAIL, "Test case Failed"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(LogStatus.SKIP, "Test case Failed"+result.getName());
			test.log(LogStatus.SKIP, "Test case Failed"+result.getThrowable());
		}
	}
	@AfterClass
	public void endTest()
	{
		report.endTest(test);
		report.flush();
		report.close();
		
	}
	

}
