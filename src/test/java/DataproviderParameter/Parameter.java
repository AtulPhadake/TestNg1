package DataproviderParameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter {

@DataProvider(name ="data-provider")
	Object[][] valueMethod()
	{
		return new Object[][] {{"one"},{"Two"}};
		
	}
@Test(dataProvider = "data-provider")
void testmethode(String valueOne) {
	
	System.out.println(valueOne);
}
}
