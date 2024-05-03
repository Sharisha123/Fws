package DDTfw;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DataSet {
	
	WebDriver driver;
	public DataSet(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static Object[][] datset(String Sheetname) throws IOException {
		String myVal=null;
		FileInputStream fi= new FileInputStream("./dataset\\ohrm.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet(Sheetname);

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data=new Object[rows][cols];
		
		for(int i=0;i<rows;i++) {
			XSSFRow row= sheet.getRow(i+1);
			for(int j=0;j<cols;j++) {
				XSSFCell cell=row.getCell(j);
				CellType cellType = cell.getCellType();
				
				switch(cellType){
				case STRING:
					data[i][j]=cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j]=Integer.toString((int)cell.getNumericCellValue());	
					break;
				}
			}
		}
		return data;

		}

	}
