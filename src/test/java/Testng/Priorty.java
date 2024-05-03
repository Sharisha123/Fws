 package Testng;

import org.testng.annotations.Test;

public class Priorty {
	
	//first our @test methods run on alphabetical order on then priority(in ascending order)
	//if same alphabet starting method contains number with its method name --> then execution order -->
	//---->alphabet order, then same alphabet method with( numbers in ascending order), then next alphenet 
	
	
	@Test
	public void setup() {
		System.out.println( "this is first method");}
		@Test
		public void login() {
			System.out.println("sec method");
		}
		@Test(priority = 110)
		public void login9() {
			System.out.println("00000 method");
		}


		@Test(priority = 12)
		public void login1() {
			System.out.println("11111 method1");
		}
		@Test(priority = 1040)
		public void login2() {
			System.out.println("22222 method");
		}
		@Test(priority = 1005)
		public void login3() {
			System.out.println("33333 method");
		}
		@Test(priority = 100789)
		public void login4() {
			System.out.println("44444 method");
		}
		@Test(priority = 10122650)
		public void login5() {
			System.out.println("55555 method");
		}
		@Test(priority = 10078)
		public void login6() {
			System.out.println("66666 method");
		}
		@Test(priority = 10120)
		public void login7() {
			System.out.println("777777 method");
		}

			
		}

