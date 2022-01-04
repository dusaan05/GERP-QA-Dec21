package Week5.day2;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static void main(String[] args) throws IOException
	{
		ReadExcelData re = new ReadExcelData();
		re.ReadExcelData();
	}

	public String[][] ReadExcelData() throws IOException  {
		
		//Step1: Get in to the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./dataFolder/Erail.xlsx");
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowCount = ws.getLastRowNum();
		
		short cellCount = ws.getRow(1).getLastCellNum();
		
		String[][] data = new String[rowCount][cellCount];

		System.out.println(rowCount);
		System.out.println(cellCount);
		for (int i=1; i <= rowCount ; i++) 
		{
			for (int j=0; j < cellCount; j++)
			{
			
		//Step2: Get in to the worksheet
		String CellValue = ws.getRow(i).getCell(j).getStringCellValue();
		
				
		//Step3: Get in to the Row
		//XSSFRow row = ws.getRow(1);
		
		//Step4: Get in the column
		//XSSFCell cell = row.getCell(0);
		//String CellValue = cell.getStringCellValue();
		
		System.out.println(CellValue);
		data[i-1][j] = CellValue;
			}
		}
		wb.close();
		return data;
	}
	
}
