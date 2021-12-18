package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLoginSel {

	public static void main(String[] args) {
		
		//Download the ChromeDriver.exe and set its path
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.safaridriver().setup();
		
		//Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Accessing the URL
		driver.get("http://demo.guru99.com/test/login.html");
		//driver.get("https://www.google.ca/");
		
		//Maximizing the window
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
//		driver.findElement(By.id("email")).sendKeys("sudhakarkaruppannan1976@gmail.com");
//		driver.findElement(By.id("passwd")).sendKeys("test");
//		driver.findElement(By.id("SubmitLogin")).click();
//				
//		//Ctrl+2and then L will provide the return type with name
//		String title = driver.getTitle();
//		System.out.println("Hi is there a title ?" + title);
		driver.close();		
	}
}
