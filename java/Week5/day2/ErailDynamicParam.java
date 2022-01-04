package Week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ErailDynamicParam extends ErailBaseClass {

	@Test (dataProvider="fetchData")
	public void getTrain(String fromStation, String toStation) {
	driver.findElement(By.id("txtStationFrom")).clear();
	driver.findElement(By.id("txtStationTo")).clear();
	driver.findElement(By.id("txtStationFrom")).sendKeys(fromStation);
	driver.findElement(By.id("txtStationTo")).sendKeys(toStation);
	driver.findElement(By.id("buttonFromTo")).click();
	
	}

	@DataProvider (name="fetchData")
	public String[][] sendData() throws IOException {
		
//		String[][] data = new String[3][2];
//		
//		data[0][0] = "Mgr Chennai Ctr";
//		data[0][1] = "Coimbatore Jn";
//		data[1][0] = "Mumbai Central";
//		data[1][1] = "Pune Jn";
//		data[2][0] = "Delhi";
//		data[2][1] = "Agra City";
//		
//		return data;

//		ReadExcel re = new ReadExcel();
//		String[][] readData = re.readData();
//		return readData;
		
		ReadExcelData rd = new ReadExcelData();
		String[][] readExcelData = rd.ReadExcelData();
		return readExcelData;
	}
}
