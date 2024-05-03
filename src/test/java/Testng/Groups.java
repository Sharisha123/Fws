package Testng;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = {"hrgroup"})
		public void hr() {
		System.out.println("add employees");
		
	}
	@Test(groups= {"hrgroup"})
	public void hr1() {
		System.out.println("add registation number");
	}
	@Test(groups= {"hrgroup"})
	public void hr2() {
		System.out.println("delete employee");
	}
	@Test(groups= {"Admin12"})

	public void admin() {
		System.out.println("complete task");
	}
	@Test(groups= {"Admin12"})

	public void admin2() {
		System.out.println("slove the error");
	}
	@Test(groups= {"Admin12"})

	public void admin3() {
		System.out.println("problem sloved");
	}
	@Test(groups= {"devloper"})

	public void developer() {
		System.out.println("develop the code");
	}
	@Test(groups= {"devloper"})
	public void developer2() {
		System.out.println("error guessing");
	}
	@Test(groups= {"devloper"})
	public void developer3() {
		System.out.println("send to tester");
	}
}
