package Week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnModalDialog {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_modals.asp");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//button[@class='ws-btn w3-dark-grey']")).click();
		String output = driver.findElement(By.xpath("//p[text()='Modals are awesome!']")).getText();
		if(output.contains("Modals are awesome"))
		{
			System.out.println("Pass");		
		}
		else
			System.out.println("Output is not the expected result");

	}

}
