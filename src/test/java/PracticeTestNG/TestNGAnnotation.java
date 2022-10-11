package PracticeTestNG;

import org.junit.After;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@BeforeSuite
	void test1()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	void test2 ()
	{
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	void test3()
	{
		System.out.println("@BeforeClass");
		
	}
	@BeforeMethod
	void test4()
	{
		System.out.println("@BeforeMethode");
	}
	@BeforeGroups
	void test5()
	{
		System.out.println("@BeforeGroups");
	}
	@Test
	void test()
	{
		System.out.println("@Test");
	}
	@AfterClass
	void test6()
	{
		System.out.println("@AfterClass");
	}
	@AfterTest
	void test7()
	{
		System.out.println("@AfterTest");
	}
	@AfterSuite
	void test8()
	{
		System.out.println("@AfterSuit");
	}

}
