package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAxesBasedXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String passwordText = driver.findElement(By.xpath("(//input[@name='password'])/following-sibling::label")).getText();
		if (passwordText.equals("Password must not be blank"))
		{
			System.out.println("Pass - Text Matches the requirement expected Result");
		}
		
		else
			System.out.println("Failed - Mismatch in the text against expected Result");
	
		
		driver.findElement(By.xpath("(//label[@id='message18'])/preceding-sibling::input")).sendKeys("test123");
		
		//driver.findElement(By.xpath("(//a[text()='Software Testing'])/following::a[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Cucumber Testing'])/preceding::a[2]")).click();
		
		System.out.println("Selenium Course is clicked successfully");
		
		
	}

}
