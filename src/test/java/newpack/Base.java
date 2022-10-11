package newpack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public static void intializastion()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\batul\\Downloads\\chromedriver_win32/chromedriver.exe");
		
	    driver = new ChromeDriver ();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	public static void Success()
	{
File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\batul\\Pictures\\Screenshots"+"facebook.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
