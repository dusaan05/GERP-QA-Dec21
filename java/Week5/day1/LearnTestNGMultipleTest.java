package Week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTestNGMultipleTest {
	
	@Test (priority = 1, invocationCount = 5, enabled = false)
	public void bLearnAlert() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		
		String output = driver.findElement(By.id("result")).getText();
		
		if(output.contains("You successfully clicked an alert"))
		{
			
			System.out.println("Pass");
				
		}
		else
			System.out.println("Output is not the expected result");

		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Hi, I am JavaScript");
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Hi, I am JavaScript");
		promptAlert.dismiss();	
		System.out.println("PromtAlert Completed");
		
		driver.close();
	}
	
	@Test (priority = 1)
	public void cLearnFrame() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();

		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Hi, this is Sudhakar here");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		//Syntax for going back to your parent frame window
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).clear();
		
		//switch to the home window (html DOM page)
		driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(text);
				
		driver.switchTo().frame("frame2");
		Select selectAnimals = new Select (driver.findElement(By.id("animals")));
		selectAnimals.selectByVisibleText("Avatar");
		
		driver.close();
		
	}
	
	@Test (priority = 2) 
	public void aLearnPartialLinkText() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Gma")).click();

		driver.close();
	}

}
