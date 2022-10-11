package DataproviderParameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterazation {

	@Test
	@Parameters("value")
	void demomethode(String myName)
	{
		System.out.println(myName);
	}
}
