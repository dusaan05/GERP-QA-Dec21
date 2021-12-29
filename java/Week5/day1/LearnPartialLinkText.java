package Week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPartialLinkText {

	@Test
	public void runLearnPartialLinkText() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Gma")).click();

	}

}
