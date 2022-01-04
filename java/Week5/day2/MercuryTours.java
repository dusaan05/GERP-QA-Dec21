package Week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MercuryTours extends LoginBaseClass {

	@Test
	public void clickRegister() 
	{
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
	}
	
	
	

}
