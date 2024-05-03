package modularFw;


public class TestScript extends modularGeneral {

	public static void main(java.lang.String[] args) throws InterruptedException {
		
	
		modularGeneral gl= new modularGeneral();
		//test case steps
		gl.setUp();
		gl.adminLogin();
		gl.addEmp();
		gl.delEmp();
		gl.adminLogout();
		gl.tearDown();



	}

}
