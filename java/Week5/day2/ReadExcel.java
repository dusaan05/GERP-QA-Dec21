package Week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	
	public String[][] readData() throws IOException {
		
		//Step1: Get in to the WorkBook
		XSSFWorkbook wb = new XSSFWorkbook("./dataFolder/Erail.xlsx");
		
		//Step2: Get in to the WorkSheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowCount = ws.getLastRowNum();
		short cellCount = ws.getRow(1).getLastCellNum();
	
		String[][] data = new String[rowCount][cellCount];
		for (int i=1; i<=rowCount ; i++)
		{
			for (int j=0; j<cellCount; j++)
			{
				
				//Step3: Get into the Row
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();

				//Step4: Get in to the Cell
				//XSSFCell cell = row.getCell(j);
				//String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				
				
				
				data[i-1][j] = cellValue;
			
			}
			
		}
		wb.close();

		return data;
		
		
		}

}