package Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrazation {
	@Test
	@Parameters("value")
	void demomethode(String myName)
	{
		System.out.println(myName);
	}

}
