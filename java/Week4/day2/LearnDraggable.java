package Week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDraggable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(draggable, 200, 80).perform();
	}

}
