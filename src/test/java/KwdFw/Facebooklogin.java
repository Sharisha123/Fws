package KwdFw;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Facebooklogin {

	@Test
	public void loginTest() throws Exception {
		Facebook fb=new Facebook();
		FileInputStream fi=new FileInputStream("./Kw//shari.xlsx");
		XSSFWorkbook wb=new	XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rows=ws.getLastRowNum();
		for(int i=1;i<=rows;i++) {
		String runMode = ws.getRow(i).getCell(4).toString();
		if(runMode.equals("yes")) {
			String Kw=ws.getRow(i).getCell(3).toString();
			switch (Kw)
			{
			case"launchBrowser":
				fb.launchBrowser();
				break;
			case"navigateURL":
				fb.navigateURL();
				break;
			case"enterUsername":
				fb.enterUsername();
				break;
				
			case"enterPassword":
				fb.enterPassword();
				break;
		
	
		}	
}
}
}
}