package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;


public class LearnWebTable {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		
		WebElement webTable = driver.findElement(By.tagName("table"));
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		int tableRowsize = tableRows.size();
				
		for (int i=0; i<tableRowsize; i++)
		{
			WebElement rowText = tableRows.get(i);
			List<WebElement> allColumns = rowText.findElements(By.tagName("td"));
			
			int ColSize = allColumns.size();
			
			for (int j=0; j < ColSize; j++)
			{
				WebElement colValue = allColumns.get(j);
				System.out.println(colValue.getText());
			}
		}
	}
	

}
