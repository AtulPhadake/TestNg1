package newpack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult resulte)
	{
		System.out.println("test Success");
		Success();
	}
	

}
