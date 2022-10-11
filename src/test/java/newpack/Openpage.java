package newpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(newpack.Listener.class)
public class Openpage {

	@Test
	void openpage()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\batul\\Downloads\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		Listener obj = new Listener();
		
		driver.navigate().to("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.close();
	}
}
