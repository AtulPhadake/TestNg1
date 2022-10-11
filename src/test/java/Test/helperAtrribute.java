package Test;

import org.testng.annotations.Test;

public class helperAtrribute {
	@Test(description="this methode is demo methode")
	void demomethode()
	{
		System.out.println("Hello i am demo");
	}
	@Test(description="this methode is sample methode")
	void samplemethode()
	{
		System.out.println("hello i am sample");
	}

	@Test(enabled =true)
	void method1()
	{
		System.out.println("1");
	}
	
	@Test(priority=-2)
	void method2()
	{
		System.out.println("2");
	}
	@Test(priority=-1)
	void xyzmethod()
	{
		System.out.println("xyz");
	}
}
