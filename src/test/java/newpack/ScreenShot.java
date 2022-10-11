package newpack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver","C:\\Users\\batul\\Downloads\\chromedriver_win32/chromedriver.exe");
//		
//	    driver = new ChromeDriver ();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		takeScreenShot("Google_FrontPage");
	}
	
	public static void takeScreenShot(String FileName) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\batul\\Pictures\\Screenshots"+FileName+".png"));
		
		driver.close();
	}

}
