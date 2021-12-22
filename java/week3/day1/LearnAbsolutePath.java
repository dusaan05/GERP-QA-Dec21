package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAbsolutePath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		
		//Below is finding element by Absolute Xpath
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		
		//Below is finding element by Relative Xpath - Attribute Based Xpath
		//driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		// Using the item index
		//driver.findElement(By.xpath("(//input[@name='tripType'])[2]")).click();
		
		// Collection Based - Using the AND Condition
		driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
		
		System.out.println("I have successfully selected Absoluted xpath of One Way Radio button Element");
		
		//Below is finding element by Relative Xpath - Patrial Attribute Based Xpath
		WebElement passengersElement = driver.findElement(By.xpath("//select[contains(@name,'pass')]"));
		Select select = new Select(passengersElement);
		select.selectByValue("3");
		
		
		//Below is finding element by Collection Based - Child Item index Xpath
		driver.findElement(By.xpath("(//td[@colspan='2'])[6]/input[1]")).click();
		System.out.println("I have successfully used Collection - Child Index Based Xpath");
				
		//Below is finding element by Relative Xpath - Text Based Xpath
				//driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
				//System.out.println("User signed-off successfully");	
	}

}
