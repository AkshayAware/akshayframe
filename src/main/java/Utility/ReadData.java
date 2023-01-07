package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadData {
	public static String readExcelFile(int rowNum, int colNum) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Windows\\eclipse-workspace\\JavaProgram\\DemoBlazeFramework\\TestData\\DemoBlazeFramework.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(rowNum).getCell(colNum).getStringCellValue();
		return value;
	}
	
	
	

}
