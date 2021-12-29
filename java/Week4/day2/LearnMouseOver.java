package Week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseOver {

	@Test
	public void runLearnMouseOver() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement menFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(menFashion).perform();
		driver.findElement(By.xpath("//span[text()='Jeans']")).click();
		

	}

}
