package Test;

import org.testng.annotations.Test;

public class helperAttribute4 {

	@Test
	void pune()
	{
		System.out.println(" i am pune");
	}
	
	@Test
	void mumbai()
	{
		System.out.println("i am mumbai");
	}
	@Test
	void kolhapur()
	{
		System.out.println("i am kolhapur");
	}
	@Test(groups="cars")
	void bmw()
	{
		System.out.println("i am bmw");
	}
	@Test(groups="cars")
	void merc()
	{
		System.out.println("i am merc");
	}
}
