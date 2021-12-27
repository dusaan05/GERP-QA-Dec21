package Week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
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
		
		
	}

}
