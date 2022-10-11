package newpack;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class Listener extends Base   {
	@BeforeMethod
	public void SetUp()
	{
		intializastion();
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.close();
	}
	@Test
	public void takescreenshot()
	{
		Assert.assertEquals(true, true);
	}

}