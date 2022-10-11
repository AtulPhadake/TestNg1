package Test;

import org.testng.annotations.Test;

public class helperAttribute3 {
	
	
	@Test(dependsOnMethods= {"corejava"})
	void Selenium()
	{
		System.out.println("i am selenium");
	}
	
	@Test(dependsOnMethods= {"corejava"})
	void Restapi()
	{
		System.out.println("i am RestApi");
	}
	@Test
	void corejava()
	{
		System.out.println("i am core java");
	}

}
