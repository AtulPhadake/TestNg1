package Test;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestClass {

	@Test
	void testmethode()
	{
		System.out.println("1");
	}
	 @BeforeTest
	    void Test1()
	    {
	    	System.out.println("2");
	    }
	    @AfterTest
	    void Test2()
	    {
	    	System.out.println("3");
	    }
	    @BeforeClass
	    void Test3()
	    {
	    	System.out.println("4");
	    }
	    @AfterClass
	    void Test4()
	    {
	    	System.out.println("5");
	    }
}
