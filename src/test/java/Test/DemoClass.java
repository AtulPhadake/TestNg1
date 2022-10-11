package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoClass {
	@Test
	void method()
	{
		System.out.println("hello");
	}
	@Test
	void a()
	{
		System.out.println("a");
	}
	@Test
	void x()
	{
		System.out.println("x");
	}
	@Test
	void A()
	{
		System.out.println("A");
	}
    @Test
	void X()
	{
		System.out.println("X");
	}
    @BeforeTest
    void Test1()
    {
    	System.out.println("Start");
    }
    @AfterTest
    void Test2()
    {
    	System.out.println("End");
    }
}
