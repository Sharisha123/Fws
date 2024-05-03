package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void assertionDemo1()
	{
		int actual_value=10;
		int expected_value=10;
		
		Assert.assertEquals(actual_value, expected_value,"");
		System.out.println("hard assertion condition 1 passed");
		Assert.assertEquals("automation testing", "automation testing");
		System.out.println("hard assertion condition 2 passed");
		
		Assert.assertEquals("selenium","manual");
		System.out.println("hard assertion condition 3 passed");
		Assert.assertEquals("automation testing", "automation testing");
		System.out.println("hard assertion condition 4 passed");
		
	}
}
