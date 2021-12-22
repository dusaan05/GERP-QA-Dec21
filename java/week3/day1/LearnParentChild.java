package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnParentChild {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("((//div[@class='canvas-graph'])[7])/div")).click();
		//System.out.println("Selenium is clicked successfully");
		
//		driver.findElement(By.xpath("((//b[@class='caret'])[2])/parent::a")).click();
//		System.out.println("SEO Clicked Successfully");
		
		driver.findElement(By.xpath("((//b[@class='caret'])[1])/ancestor::li")).click();
		System.out.println("Hello");
	}

}
