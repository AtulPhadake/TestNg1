package Test;

import org.testng.annotations.Test;

public class helperAttribute2 {
	@Test(priority=2)
	void banana()
	{
		System.out.println("i am banana");
	}
	@Test(priority=3)
	void apple()
	{
		System.out.println("i am apple");
	}
	@Test(priority=1)
	void watermelon()
	{
		System.out.println("i am watermelon");
	}

}
