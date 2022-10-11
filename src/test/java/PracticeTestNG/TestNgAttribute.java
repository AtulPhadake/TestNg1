package PracticeTestNG;

import org.testng.annotations.Test;

public class TestNgAttribute {

	@Test
	void test()
	{
		System.out.println("Test");
	}
	@Test(description="atul phadake")
	void test1()
	{
		System.out.println("Description");
	}
	@Test(enabled=false)
	void test2()
	{
		System.out.println("atul");
	}
	@Test(groups="frnd")
	void test3()
	{
		System.out.println("anil");
		
	}
	@Test(groups="frnd")
	void test4()
	{
		System.out.println("vikram");
	}
	@Test(priority=1)
	void test5()
	{
		System.out.println("1");
	}
	@Test(dependsOnMethods= {"test1"})
	void test6()
	{
		System.out.println("test6");
	}
	@Test(timeOut=200)
	void test7() throws Throwable
	{
		System.out.println("time out");
		Thread.sleep(500);
	}
	
}
