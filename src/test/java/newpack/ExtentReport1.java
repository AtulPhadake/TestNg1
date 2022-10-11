package newpack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;


public class ExtentReport1 {
	static ExtentReporter htmlReporter;
	static ExtentReports report;
	static ExtentTest test;
	static WebDriver driver;
	
	@BeforeClass
	public void setExtent()
	{
	//	htmlReporter =new ExtentReporter(System.getProperty("user.dir")+"/test-outpot/myReport.html");
	}

}
