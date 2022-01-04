package Week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickContact extends LoginBaseClass {

	@Test (dependsOnMethods = "Week5.day2.MercuryTours.clickRegister")
	public void clickContact() 
	{
		driver.findElement(By.xpath("//a[text()='CONTACT']")).click();
		
	}
}
