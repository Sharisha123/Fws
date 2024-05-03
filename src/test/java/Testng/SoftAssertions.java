package Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	@Test
	public void soft_Assertion_Demo()
	{
		SoftAssert sa=new SoftAssert();
		
		String a="manual";
		String b="selenium";
		
		sa.assertEquals(a,b,"this is first assert");
		
		
		int c=10;
		int d=12;
		
		sa.assertSame(c,d);
		sa.assertSame("automation","automation");
		
		String e="hi";
		String f="hello";
		
		sa.assertEquals(e,f,"assert not equal");
		
		sa.assertSame("automation","selenium");
		
		sa.assertSame("automation","automation");

		
		sa.assertAll();
	}

}
