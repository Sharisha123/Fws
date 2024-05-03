package Testng;

import org.testng.annotations.Test;

public class ignoreDependencies {

	@Test(enabled = false)
	public void test1() {
//		int a=1;
//		int b=0;
//		int c=a/b;
		System.out.println("Results");
	}
	
	@Test(dependsOnMethods = {"test1"},ignoreMissingDependencies = true)
	public void test2() {
		System.out.println("I am Test2");
	}
}
